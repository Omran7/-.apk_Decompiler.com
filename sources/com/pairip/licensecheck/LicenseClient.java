package com.pairip.licensecheck;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.pairip.licensecheck.ILicenseV2ResultListener;
import com.pairip.licensecheck.LicenseActivity;

public class LicenseClient implements ServiceConnection {
    private static final int ERROR_INVALID_PACKAGE_NAME = 3;
    private static final int FLAG_RPC_CALL = 0;
    private static final int LICENSED = 0;
    private static final int MAX_RETRIES = 3;
    private static final int MILLIS_PER_SEC = 1000;
    private static final int NOT_LICENSED = 2;
    private static final String PAYLOAD_PAYWALL = "PAYWALL_INTENT";
    private static final int RETRY_DELAY_MILLIS = 1000;
    private static final String SERVICE_INTERFACE_CLASS_NAME = "com.android.vending.licensing.ILicensingService";
    private static final String SERVICE_PACKAGE = "com.android.vending";
    private static final String TAG = "LicenseClient";
    private static final int TRANSACTION_CHECK_LICENSE_V2 = 2;
    protected static Runnable exitAction = new Runnable() {
        public void run() {
            System.exit(0);
        }
    };
    protected static LicenseCheckState licenseCheckState = LicenseCheckState.CHECK_REQUIRED;
    protected static String licensePubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAs/uBZVCWcSr6JJW9hjoI5EE7aqaoOuG6YyzNje50sENdbVleCCAFKfhWCeI89jBdxANdemh8+ykNoFeDa9jsm1mBB1tLlXfIHZkI/tTpQ4S7eIZC4VXtvvX7JXsMZXERKAAS9TifYfUEvMaq/cvM4PM4P5kbE4lU0/wQDFREF1dM2tBIoKEND0sqbAhkXyAhA+vCZTd6q3ipd7lZhkV2Iyt7K74fGBh96EIztGtHqwu5pJuHP5CWLOrLDC0TkFxmbHwJ801jDaTOK/k3tWBAuv906A3Dz+AIINMl8dm+3S7X6m4NaHL/UVdAjjB0fsIbmaf5Dt36xIfp1jKMws3aNQIDAQAB";
    protected static String packageName = "com.mtma.criminal.city";
    private static Bundle responsePayload;
    private final Context context;
    private final DelayedTaskExecutor delayedTaskExecutor = new DelayedTaskExecutor();
    private int retryNum = 0;

    public enum LicenseCheckState {
        CHECK_REQUIRED,
        OK
    }

    public LicenseClient(Context context2) {
        this.context = context2;
    }

    public static String getLicensePubKey() {
        return licensePubKey;
    }

    public void initializeLicenseCheck() {
        int ordinal = licenseCheckState.ordinal();
        if (ordinal == 0) {
            connectToLicensingService();
        } else if (ordinal == 1) {
            try {
                ResponseValidator.validateResponse(responsePayload, packageName);
            } catch (LicenseCheckException e6) {
                handleError(e6);
            }
        }
    }

    /* access modifiers changed from: private */
    public void connectToLicensingService() {
        Log.d(TAG, "Connecting to the licensing service...");
        try {
            if (!this.context.bindService(new Intent(SERVICE_INTERFACE_CLASS_NAME).setPackage(SERVICE_PACKAGE).setAction(SERVICE_INTERFACE_CLASS_NAME), this, 1)) {
                retryOrThrow(new LicenseCheckException("Could not bind with the licensing service."));
            }
        } catch (SecurityException e6) {
            retryOrThrow(new LicenseCheckException("Not allowed to bind with the licensing service.", e6));
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.d(TAG, "Connected to the licensing service.");
        if (!licenseCheckState.equals(LicenseCheckState.OK)) {
            new Thread(new LicenseClient$$ExternalSyntheticLambda1(this, iBinder)).start();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceConnected$0(IBinder iBinder) {
        try {
            checkLicenseInternal(iBinder);
        } catch (LicenseCheckException e6) {
            handleError(e6);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Log.w(TAG, "Unexpectedly disconnected from the licensing service.");
        retryOrThrow(new LicenseCheckException("Licensing service unexpectedly disconnected."));
    }

    public void checkLicenseInternal(IBinder iBinder) throws LicenseCheckException {
        Parcel obtain;
        Parcel obtain2;
        if (iBinder == null) {
            retryOrThrow(new LicenseCheckException("Received a null binder."));
            return;
        }
        Log.d(TAG, "Sending request to licensing service...");
        obtain = Parcel.obtain();
        obtain2 = Parcel.obtain();
        try {
            populateInputData(obtain, iBinder);
            if (!iBinder.transact(2, obtain, obtain2, 0)) {
                handleError(new LicenseCheckException("Licensing service could not process request."));
            }
            obtain.recycle();
            obtain2.recycle();
            Log.d(TAG, "Request to licensing service sent.");
            return;
        } catch (DeadObjectException e6) {
            retryOrThrow(new LicenseCheckException("Licensing service process died.", e6));
        } catch (RemoteException e7) {
            handleError(new LicenseCheckException("Error when calling licensing service.", e7));
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            Log.d(TAG, "Request to licensing service sent.");
            throw th;
        }
        obtain.recycle();
        obtain2.recycle();
        Log.d(TAG, "Request to licensing service sent.");
    }

    private void populateInputData(Parcel parcel, IBinder iBinder) throws RemoteException {
        parcel.writeInterfaceToken(iBinder.getInterfaceDescriptor());
        parcel.writeString(packageName);
        parcel.writeStrongBinder(createResultListener(this).asBinder());
        parcel.writeInt(0);
    }

    private static ILicenseV2ResultListener createResultListener(LicenseClient licenseClient) {
        return new ILicenseV2ResultListener.Stub() {
            public void verifyLicense(int i2, Bundle bundle) {
                LicenseClient.this.processResponse(i2, bundle);
            }
        };
    }

    private void retryOrThrow(LicenseCheckException licenseCheckException) {
        int i2 = this.retryNum;
        if (i2 < 3) {
            this.retryNum = i2 + 1;
            this.delayedTaskExecutor.schedule(new LicenseClient$$ExternalSyntheticLambda0(this), 1000);
            Log.d(TAG, String.format("Retry #%d. License check failed with error '%s'. Next try in %ds...", new Object[]{Integer.valueOf(this.retryNum), licenseCheckException.getMessage(), 1L}));
            return;
        }
        handleError(licenseCheckException);
    }

    /* access modifiers changed from: private */
    public void processResponse(int i2, Bundle bundle) {
        if (i2 == 3) {
            throw new LicenseCheckException("Request package name invalid.");
        } else if (i2 == 0) {
            try {
                ResponseValidator.validateResponse(bundle, packageName);
                Log.i(TAG, "License check succeeded.");
                licenseCheckState = LicenseCheckState.OK;
                responsePayload = bundle;
            } catch (LicenseCheckException e6) {
                handleError(e6);
            }
        } else if (i2 == 2) {
            startPaywallActivity((PendingIntent) bundle.getParcelable(PAYLOAD_PAYWALL));
        } else {
            throw new LicenseCheckException(String.format("Unexpected response code %d received.", new Object[]{Integer.valueOf(i2)}));
        }
    }

    private void handleError(LicenseCheckException licenseCheckException) {
        String stackTraceString = Log.getStackTraceString(licenseCheckException);
        Log.e(TAG, "Error while checking license: " + stackTraceString);
        if (!licenseCheckState.equals(LicenseCheckState.OK)) {
            startErrorDialogActivity();
        }
    }

    private void startPaywallActivity(PendingIntent pendingIntent) {
        Intent createCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        createCloseAppIntentOrExitIfAppInBackground.putExtra(LicenseActivity.PAYWALL_INTENT_ARG_NAME, pendingIntent);
        createCloseAppIntentOrExitIfAppInBackground.putExtra(LicenseActivity.ACTIVITY_TYPE_ARG_NAME, LicenseActivity.ActivityType.PAYWALL);
        this.context.startActivity(createCloseAppIntentOrExitIfAppInBackground);
    }

    private void startErrorDialogActivity() {
        Intent createCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        createCloseAppIntentOrExitIfAppInBackground.putExtra(LicenseActivity.ACTIVITY_TYPE_ARG_NAME, LicenseActivity.ActivityType.ERROR_DIALOG);
        this.context.startActivity(createCloseAppIntentOrExitIfAppInBackground);
    }

    private Intent createCloseAppIntentOrExitIfAppInBackground() {
        if (!isForeground()) {
            exitAction.run();
        }
        Intent intent = new Intent(this.context, LicenseActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(32768);
        intent.addFlags(268435456);
        return intent;
    }

    private boolean isForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance <= 100;
    }

    private static final class DelayedTaskExecutor {
        private final Handler handler;

        private DelayedTaskExecutor() {
            this.handler = new Handler(Looper.getMainLooper());
        }

        public void schedule(Runnable runnable, long j6) {
            this.handler.postDelayed(runnable, j6);
        }
    }
}
