package G5;

public final class o0 extends m0 {

    /* renamed from: e  reason: collision with root package name */
    public final v0 f928e;

    /* renamed from: f  reason: collision with root package name */
    public final p0 f929f;

    /* renamed from: p  reason: collision with root package name */
    public final C0044p f930p;

    /* renamed from: q  reason: collision with root package name */
    public final Object f931q;

    public o0(v0 v0Var, p0 p0Var, C0044p pVar, Object obj) {
        this.f928e = v0Var;
        this.f929f = p0Var;
        this.f930p = pVar;
        this.f931q = obj;
    }

    public final void a(Throwable th) {
        C0044p pVar = this.f930p;
        v0 v0Var = this.f928e;
        v0Var.getClass();
        C0044p D4 = v0.D(pVar);
        p0 p0Var = this.f929f;
        Object obj = this.f931q;
        if (D4 != null) {
            do {
                if (F.l(D4.f932e, false, new o0(v0Var, p0Var, D4, obj), 1) == x0.f959a) {
                    D4 = v0.D(D4);
                } else {
                    return;
                }
            } while (D4 != null);
        }
        v0Var.f(v0Var.o(p0Var, obj));
    }
}
