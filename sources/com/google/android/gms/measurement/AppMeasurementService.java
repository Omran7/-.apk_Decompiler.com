package com.google.android.gms.measurement;

import B2.a;
import S3.t;
import T1.C0166e1;
import T1.C0212u0;
import T1.C0228z1;
import T1.D0;
import T1.T1;
import T1.Z;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import b0.C0311a;
import com.google.android.gms.internal.measurement.zzdh;

public final class AppMeasurementService extends Service implements C0228z1 {

    /* renamed from: a  reason: collision with root package name */
    public t f6265a;

    public final void a(Intent intent) {
        SparseArray sparseArray = C0311a.f5448a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0) {
            SparseArray sparseArray2 = C0311a.f5448a;
            synchronized (sparseArray2) {
                try {
                    PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                    if (wakeLock != null) {
                        wakeLock.release();
                        sparseArray2.remove(intExtra);
                        return;
                    }
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean b(int i2) {
        return stopSelfResult(i2);
    }

    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final t d() {
        if (this.f6265a == null) {
            this.f6265a = new t(this, 3);
        }
        return this.f6265a;
    }

    public final IBinder onBind(Intent intent) {
        t d = d();
        d.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new D0(T1.o0((Service) d.f2700b));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().f2700b).getClass().getSimpleName().concat(" is starting up."));
    }

    public final void onDestroy() {
        Log.v("FA", ((Service) d().f2700b).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    public final int onStartCommand(Intent intent, int i2, int i5) {
        t d = d();
        if (intent == null) {
            d.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) d.f2700b;
        Z z3 = C0212u0.q(service, (zzdh) null, (Long) null).f3496r;
        C0212u0.k(z3);
        String action = intent.getAction();
        z3.f3180w.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i5), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        C0166e1 e1Var = new C0166e1(d, i5, z3, intent);
        T1 o02 = T1.o0(service);
        o02.f().y(new a((Object) o02, (Object) e1Var, 21));
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
