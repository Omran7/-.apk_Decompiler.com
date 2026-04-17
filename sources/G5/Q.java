package G5;

import I1.b;
import m5.C0849h;

public final class Q extends m0 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f880e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f881f;

    public /* synthetic */ Q(Object obj, int i2) {
        this.f880e = i2;
        this.f881f = obj;
    }

    public final void a(Throwable th) {
        switch (this.f880e) {
            case 0:
                ((P) this.f881f).e();
                return;
            case 1:
                ((C0030f0) this.f881f).a(th);
                return;
            case 2:
                Object u6 = i().u();
                boolean z3 = u6 instanceof C0048u;
                n0 n0Var = (n0) this.f881f;
                if (z3) {
                    n0Var.resumeWith(b.r(((C0048u) u6).f950a));
                    return;
                } else {
                    n0Var.resumeWith(F.u(u6));
                    return;
                }
            default:
                ((C0040l) this.f881f).resumeWith(C0849h.f10203c);
                return;
        }
    }
}
