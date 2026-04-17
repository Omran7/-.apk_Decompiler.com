package com.android.billingclient.api;

import W0.u;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.o;
import c.C0333h;
import c.C0334i;
import com.google.android.gms.common.internal.C0377f;
import com.google.android.gms.internal.play_billing.zze;
import j4.p0;
import k.C0724m;
import kotlin.jvm.internal.j;

public class ProxyBillingActivityV2 extends o {

    /* renamed from: C  reason: collision with root package name */
    public C0333h f5718C;

    /* renamed from: D  reason: collision with root package name */
    public C0333h f5719D;

    /* renamed from: E  reason: collision with root package name */
    public ResultReceiver f5720E;
    public ResultReceiver F;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5718C = (C0333h) k(new u(5), new C0724m(this, 18));
        this.f5719D = (C0333h) k(new u(5), new p0(this, 24));
        if (bundle == null) {
            zze.zzk("ProxyBillingActivityV2", "Launching Play Store billing dialog");
            if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
                PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                this.f5720E = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                C0333h hVar = this.f5718C;
                j.e(pendingIntent, C0377f.KEY_PENDING_INTENT);
                IntentSender intentSender = pendingIntent.getIntentSender();
                j.d(intentSender, "pendingIntent.intentSender");
                hVar.a(new C0334i(intentSender, (Intent) null, 0, 0));
            } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
                PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
                this.F = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                C0333h hVar2 = this.f5719D;
                j.e(pendingIntent2, C0377f.KEY_PENDING_INTENT);
                IntentSender intentSender2 = pendingIntent2.getIntentSender();
                j.d(intentSender2, "pendingIntent.intentSender");
                hVar2.a(new C0334i(intentSender2, (Intent) null, 0, 0));
            }
        } else if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
            this.f5720E = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
        } else if (bundle.containsKey("external_payment_dialog_result_receiver")) {
            this.F = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f5720E;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.F;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
