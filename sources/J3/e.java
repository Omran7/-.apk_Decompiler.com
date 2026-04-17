package j3;

import b3.b;
import com.google.firebase.auth.FirebaseAuth;
import f3.C0524a;
import g3.n;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import m0.a0;
import n3.C0856A;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8827a;

    /* renamed from: b  reason: collision with root package name */
    public final n f8828b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReference f8829c;

    public e(n nVar, int i2) {
        this.f8827a = i2;
        switch (i2) {
            case 1:
                this.f8828b = nVar;
                this.f8829c = new AtomicReference();
                nVar.a(new F3.e((Object) this, 17));
                return;
            default:
                this.f8828b = nVar;
                this.f8829c = new AtomicReference();
                nVar.a(new F3.e((Object) this, 16));
                return;
        }
    }

    public final void a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, C0856A a6) {
        switch (this.f8827a) {
            case 0:
                this.f8828b.a(new C0609a(scheduledThreadPoolExecutor, a6, 0));
                return;
            default:
                this.f8828b.a(new C0609a(scheduledThreadPoolExecutor, a6, 1));
                return;
        }
    }

    public final void b(boolean z3, a0 a0Var) {
        switch (this.f8827a) {
            case 0:
                b bVar = (b) this.f8829c.get();
                if (bVar != null) {
                    ((Z2.e) bVar).b(z3).addOnSuccessListener(new c(a0Var, 0)).addOnFailureListener(new d(a0Var, 0));
                    return;
                } else {
                    a0Var.q((String) null);
                    return;
                }
            default:
                C0524a aVar = (C0524a) this.f8829c.get();
                if (aVar != null) {
                    FirebaseAuth firebaseAuth = (FirebaseAuth) aVar;
                    firebaseAuth.c(firebaseAuth.f6866f, z3).addOnSuccessListener(new c(a0Var, 1)).addOnFailureListener(new d(a0Var, 1));
                    return;
                }
                a0Var.q((String) null);
                return;
        }
    }
}
