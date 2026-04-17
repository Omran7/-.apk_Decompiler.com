package P4;

import I3.h;
import R2.b;
import Z2.f;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.p;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.C0468a;
import d5.o;

public final /* synthetic */ class c implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2189a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2190b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2191c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i2) {
        this.f2189a = i2;
        this.f2190b = obj;
        this.f2191c = obj2;
        this.d = obj3;
    }

    public final void onSuccess(Object obj) {
        switch (this.f2189a) {
            case 0:
                Void voidR = (Void) obj;
                h hVar = (h) this.f2190b;
                hVar.getClass();
                o.getAccountObject().setHasAdminRequestNotReviewed(true);
                o.getAccountObject().setAdminRequestsNumber(((C0468a) this.f2191c).getAdminRequestsNumber() + 1);
                b.w(false);
                b.M0(R.raw.add_new_item);
                d dVar = (d) hVar.f1180c;
                a.n(MyApplication.f7090a, R.string.send_admin_request_successfully, dVar.f2197i0, (String) null);
                dVar.f2194f0.setImageResource(R.drawable.button_gray_large);
                d.W0(o.getAccountObject().getId(), MyApplication.f7090a.getApplicationContext().getString(R.string.admin_request_private_message, new Object[]{(String) this.d}));
                return;
            default:
                SuccessContinuation successContinuation = (SuccessContinuation) this.f2190b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f2191c;
                try {
                    Task then = successContinuation.then((p) obj);
                    then.addOnSuccessListener(new R.b(taskCompletionSource, 4));
                    then.addOnFailureListener(new f(taskCompletionSource, 1));
                    then.addOnCanceledListener(new com.google.firebase.storage.h((CancellationTokenSource) this.d));
                    return;
                } catch (RuntimeExecutionException e6) {
                    if (e6.getCause() instanceof Exception) {
                        taskCompletionSource.setException((Exception) e6.getCause());
                        return;
                    } else {
                        taskCompletionSource.setException(e6);
                        return;
                    }
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
        }
    }
}
