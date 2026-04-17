package T1;

/* renamed from: T1.t1  reason: case insensitive filesystem */
public final class C0210t1 extends C0194o {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f3470e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0219w1 f3471f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0210t1(C0219w1 w1Var, C0212u0 u0Var, int i2) {
        super(u0Var);
        this.f3470e = i2;
        this.f3471f = w1Var;
    }

    public final void b() {
        switch (this.f3470e) {
            case 0:
                C0219w1 w1Var = this.f3471f;
                w1Var.o();
                if (w1Var.y()) {
                    Z z3 = ((C0212u0) w1Var.f398a).f3496r;
                    C0212u0.k(z3);
                    z3.f3180w.a("Inactivity, disconnecting from the service");
                    w1Var.t();
                    return;
                }
                return;
            default:
                Z z4 = ((C0212u0) this.f3471f.f398a).f3496r;
                C0212u0.k(z4);
                z4.f3175r.a("Tasks have been queued for a long time");
                return;
        }
    }
}
