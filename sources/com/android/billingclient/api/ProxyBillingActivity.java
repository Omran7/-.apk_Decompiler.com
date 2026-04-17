package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zze;

public class ProxyBillingActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public ResultReceiver f5714a;

    /* renamed from: b  reason: collision with root package name */
    public ResultReceiver f5715b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5716c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public int f5717e;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            r0 = 100
            r1 = 0
            r2 = 0
            r3 = 110(0x6e, float:1.54E-43)
            java.lang.String r4 = "ProxyBillingActivity"
            if (r8 == r0) goto L_0x0040
            if (r8 != r3) goto L_0x0010
            goto L_0x0040
        L_0x0010:
            r9 = 101(0x65, float:1.42E-43)
            if (r8 != r9) goto L_0x0028
            int r8 = com.google.android.gms.internal.play_billing.zze.zza(r10, r4)
            android.os.ResultReceiver r9 = r7.f5715b
            if (r9 == 0) goto L_0x00fe
            if (r10 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            android.os.Bundle r2 = r10.getExtras()
        L_0x0023:
            r9.send(r8, r2)
            goto L_0x00fe
        L_0x0028:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Got onActivityResult with wrong requestCode: "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = "; skipping..."
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.google.android.gms.internal.play_billing.zze.zzl(r4, r8)
            goto L_0x00fe
        L_0x0040:
            w0.c r0 = com.google.android.gms.internal.play_billing.zze.zzf(r10, r4)
            int r0 = r0.f12358a
            r5 = -1
            if (r9 != r5) goto L_0x004f
            if (r0 == 0) goto L_0x004d
            r9 = r5
            goto L_0x004f
        L_0x004d:
            r0 = r1
            goto L_0x0068
        L_0x004f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Activity finished with resultCode "
            r5.<init>(r6)
            r5.append(r9)
            java.lang.String r9 = " and billing's responseCode: "
            r5.append(r9)
            r5.append(r0)
            java.lang.String r9 = r5.toString()
            com.google.android.gms.internal.play_billing.zze.zzl(r4, r9)
        L_0x0068:
            android.os.ResultReceiver r9 = r7.f5714a
            if (r9 == 0) goto L_0x0078
            if (r10 != 0) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            android.os.Bundle r2 = r10.getExtras()
        L_0x0073:
            r9.send(r0, r2)
            goto L_0x00fe
        L_0x0078:
            if (r10 == 0) goto L_0x00ef
            android.os.Bundle r9 = r10.getExtras()
            java.lang.String r0 = "LAUNCH_BILLING_FLOW"
            java.lang.String r2 = "INTENT_SOURCE"
            if (r9 == 0) goto L_0x00b9
            android.os.Bundle r9 = r10.getExtras()
            java.lang.String r4 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA"
            java.lang.String r9 = r9.getString(r4)
            if (r9 == 0) goto L_0x00a9
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r5 = "com.android.vending.billing.ALTERNATIVE_BILLING"
            r10.<init>(r5)
            android.content.Context r5 = r7.getApplicationContext()
            java.lang.String r5 = r5.getPackageName()
            r10.setPackage(r5)
            r10.putExtra(r4, r9)
            r10.putExtra(r2, r0)
            goto L_0x00f3
        L_0x00a9:
            android.content.Intent r9 = r7.a()
            android.os.Bundle r10 = r10.getExtras()
            r9.putExtras(r10)
            r9.putExtra(r2, r0)
            r10 = r9
            goto L_0x00f3
        L_0x00b9:
            android.content.Intent r10 = r7.a()
            java.lang.String r9 = "Got null bundle!"
            com.google.android.gms.internal.play_billing.zze.zzl(r4, r9)
            java.lang.String r9 = "RESPONSE_CODE"
            r4 = 6
            r10.putExtra(r9, r4)
            java.lang.String r9 = "DEBUG_MESSAGE"
            java.lang.String r5 = "An internal error occurred."
            r10.putExtra(r9, r5)
            com.mtma.criminal.city.utils.N r9 = w0.C1056c.a()
            r9.f7367a = r4
            r9.f7368b = r5
            w0.c r9 = r9.a()
            r4 = 22
            r5 = 2
            com.google.android.gms.internal.play_billing.zzjz r9 = w0.C1071r.b(r4, r5, r9)
            byte[] r9 = r9.zzh()
            java.lang.String r4 = "FAILURE_LOGGING_PAYLOAD"
            r10.putExtra(r4, r9)
            r10.putExtra(r2, r0)
            goto L_0x00f3
        L_0x00ef:
            android.content.Intent r10 = r7.a()
        L_0x00f3:
            if (r8 != r3) goto L_0x00fb
            java.lang.String r8 = "IS_FIRST_PARTY_PURCHASE"
            r9 = 1
            r10.putExtra(r8, r9)
        L_0x00fb:
            r7.sendBroadcast(r10)
        L_0x00fe:
            r7.f5716c = r1
            r7.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle == null) {
            zze.zzk("ProxyBillingActivity", "Launching Play Store billing flow");
            this.f5717e = 100;
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.d = true;
                    this.f5717e = 110;
                }
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.f5714a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.f5715b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                this.f5717e = 101;
            } else {
                pendingIntent = null;
            }
            try {
                this.f5716c = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), this.f5717e, new Intent(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e6) {
                zze.zzm("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e6);
                ResultReceiver resultReceiver = this.f5714a;
                if (resultReceiver != null) {
                    resultReceiver.send(6, (Bundle) null);
                } else {
                    ResultReceiver resultReceiver2 = this.f5715b;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, (Bundle) null);
                    } else {
                        Intent a6 = a();
                        if (this.d) {
                            a6.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        a6.putExtra("RESPONSE_CODE", 6);
                        a6.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(a6);
                    }
                }
                this.f5716c = false;
                finish();
            }
        } else {
            zze.zzk("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f5716c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f5714a = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f5715b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.d = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f5717e = bundle.getInt("activity_code", 100);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f5716c) {
            Intent a6 = a();
            a6.putExtra("RESPONSE_CODE", 1);
            a6.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i2 = this.f5717e;
            if (i2 == 110 || i2 == 100) {
                a6.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(a6);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f5714a;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f5715b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f5716c);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.d);
        bundle.putInt("activity_code", this.f5717e);
    }
}
