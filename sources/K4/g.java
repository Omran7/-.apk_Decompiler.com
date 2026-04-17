package K4;

import S3.t;
import android.support.v4.media.session.a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.mtma.criminal.city.utils.C0436f;
import com.mtma.criminal.city.utils.U;
import d5.C0472e;
import d5.k;
import d5.o;

public final class g implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1518a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f1519b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1520c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(k kVar, boolean z3, TaskCompletionSource taskCompletionSource, int i2) {
        this.f1518a = i2;
        this.d = kVar;
        this.f1519b = z3;
        this.f1520c = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        switch (this.f1518a) {
            case 0:
                ((k) this.d).f1552Z0.getAccountObject().setBannedFromChat(this.f1519b);
                ((TaskCompletionSource) this.f1520c).setResult(Boolean.TRUE);
                return;
            case 1:
                ((k) this.d).f1552Z0.getAccountObject().setBannedFromPrivateMessages(this.f1519b);
                ((TaskCompletionSource) this.f1520c).setResult(Boolean.TRUE);
                return;
            case 2:
                ((k) this.d).f1552Z0.getAccountObject().setBannedFromNews(this.f1519b);
                ((TaskCompletionSource) this.f1520c).setResult(Boolean.TRUE);
                return;
            default:
                C0472e eVar = (C0472e) this.f1520c;
                if (this.f1519b) {
                    U.g(o.getAccountObject().getId(), "check", a.Y(eVar.getLastOpenedCrimeType()), new t(this, 25));
                    return;
                }
                o.setCrimeObject(eVar);
                ((C0436f) this.d).f7408e.c(true);
                return;
        }
    }

    public g(C0436f fVar, boolean z3, C0472e eVar, k kVar) {
        this.f1518a = 3;
        this.d = fVar;
        this.f1519b = z3;
        this.f1520c = eVar;
    }
}
