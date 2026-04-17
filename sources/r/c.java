package R;

import S.a;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.internal.j;

public final /* synthetic */ class c implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2452a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f2453b;

    public /* synthetic */ c(HiddenActivity hiddenActivity, int i2) {
        this.f2452a = i2;
        this.f2453b = hiddenActivity;
    }

    public final void onFailure(Exception exc) {
        String str = "CREATE_UNKNOWN";
        String str2 = "GET_NO_CREDENTIALS";
        HiddenActivity hiddenActivity = this.f2453b;
        switch (this.f2452a) {
            case 0:
                int i2 = HiddenActivity.f4917c;
                j.e(hiddenActivity, "this$0");
                j.e(exc, "e");
                if ((exc instanceof com.google.android.gms.common.api.j) && a.f2599a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) exc).getStatusCode()))) {
                    str = "CREATE_INTERRUPTED";
                }
                ResultReceiver resultReceiver = hiddenActivity.f4918a;
                j.b(resultReceiver);
                hiddenActivity.a(resultReceiver, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                return;
            case 1:
                int i5 = HiddenActivity.f4917c;
                j.e(hiddenActivity, "this$0");
                j.e(exc, "e");
                if ((exc instanceof com.google.android.gms.common.api.j) && a.f2599a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) exc).getStatusCode()))) {
                    str = "CREATE_INTERRUPTED";
                }
                ResultReceiver resultReceiver2 = hiddenActivity.f4918a;
                j.b(resultReceiver2);
                hiddenActivity.a(resultReceiver2, str, "During save password, found password failure response from one tap " + exc.getMessage());
                return;
            case 2:
                int i6 = HiddenActivity.f4917c;
                j.e(hiddenActivity, "this$0");
                j.e(exc, "e");
                if ((exc instanceof com.google.android.gms.common.api.j) && a.f2599a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) exc).getStatusCode()))) {
                    str2 = "GET_INTERRUPTED";
                }
                ResultReceiver resultReceiver3 = hiddenActivity.f4918a;
                j.b(resultReceiver3);
                hiddenActivity.a(resultReceiver3, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                return;
            default:
                int i7 = HiddenActivity.f4917c;
                j.e(hiddenActivity, "this$0");
                j.e(exc, "e");
                if ((exc instanceof com.google.android.gms.common.api.j) && a.f2599a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) exc).getStatusCode()))) {
                    str2 = "GET_INTERRUPTED";
                }
                ResultReceiver resultReceiver4 = hiddenActivity.f4918a;
                j.b(resultReceiver4);
                hiddenActivity.a(resultReceiver4, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                return;
        }
    }
}
