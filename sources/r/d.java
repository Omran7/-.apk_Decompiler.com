package R;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import m5.C0849h;
import t1.C0992g;
import t1.C0998m;
import x5.l;

public final class d extends k implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2454a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f2455b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2456c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(HiddenActivity hiddenActivity, int i2, int i5) {
        super(1);
        this.f2454a = i5;
        this.f2455b = hiddenActivity;
        this.f2456c = i2;
    }

    public final Object invoke(Object obj) {
        switch (this.f2454a) {
            case 0:
                HiddenActivity hiddenActivity = this.f2455b;
                C0992g gVar = (C0992g) obj;
                try {
                    hiddenActivity.f4919b = true;
                    hiddenActivity.startIntentSenderForResult(gVar.f11722a.getIntentSender(), this.f2456c, (Intent) null, 0, 0, 0, (Bundle) null);
                } catch (IntentSender.SendIntentException e6) {
                    ResultReceiver resultReceiver = hiddenActivity.f4918a;
                    j.b(resultReceiver);
                    hiddenActivity.a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e6.getMessage());
                }
                return C0849h.f10203c;
            case 1:
                HiddenActivity hiddenActivity2 = this.f2455b;
                C0998m mVar = (C0998m) obj;
                try {
                    hiddenActivity2.f4919b = true;
                    hiddenActivity2.startIntentSenderForResult(mVar.f11733a.getIntentSender(), this.f2456c, (Intent) null, 0, 0, 0, (Bundle) null);
                } catch (IntentSender.SendIntentException e7) {
                    ResultReceiver resultReceiver2 = hiddenActivity2.f4918a;
                    j.b(resultReceiver2);
                    hiddenActivity2.a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e7.getMessage());
                }
                return C0849h.f10203c;
            case 2:
                HiddenActivity hiddenActivity3 = this.f2455b;
                PendingIntent pendingIntent = (PendingIntent) obj;
                j.e(pendingIntent, "result");
                try {
                    hiddenActivity3.f4919b = true;
                    hiddenActivity3.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f2456c, (Intent) null, 0, 0, 0, (Bundle) null);
                } catch (IntentSender.SendIntentException e8) {
                    ResultReceiver resultReceiver3 = hiddenActivity3.f4918a;
                    j.b(resultReceiver3);
                    hiddenActivity3.a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e8.getMessage());
                }
                return C0849h.f10203c;
            default:
                HiddenActivity hiddenActivity4 = this.f2455b;
                PendingIntent pendingIntent2 = (PendingIntent) obj;
                try {
                    hiddenActivity4.f4919b = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent2.getIntentSender(), this.f2456c, (Intent) null, 0, 0, 0, (Bundle) null);
                } catch (IntentSender.SendIntentException e9) {
                    ResultReceiver resultReceiver4 = hiddenActivity4.f4918a;
                    j.b(resultReceiver4);
                    hiddenActivity4.a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e9.getMessage());
                }
                return C0849h.f10203c;
        }
    }
}
