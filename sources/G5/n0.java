package G5;

import o5.d;

public final class n0 extends C0040l {

    /* renamed from: r  reason: collision with root package name */
    public final v0 f927r;

    public n0(v0 v0Var, d dVar) {
        super(1, dVar);
        this.f927r = v0Var;
    }

    public final Throwable q(v0 v0Var) {
        Throwable c3;
        Object u6 = this.f927r.u();
        if ((u6 instanceof p0) && (c3 = ((p0) u6).c()) != null) {
            return c3;
        }
        if (u6 instanceof C0048u) {
            return ((C0048u) u6).f950a;
        }
        return v0Var.getCancellationException();
    }

    public final String x() {
        return "AwaitContinuation";
    }
}
