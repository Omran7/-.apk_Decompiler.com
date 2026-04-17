package T1;

import A1.a;

/* renamed from: T1.r1  reason: case insensitive filesystem */
public final class C0204r1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3452a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Z1 f3453b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f3454c;
    public final /* synthetic */ C0219w1 d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a f3455e;

    public /* synthetic */ C0204r1(C0219w1 w1Var, Z1 z12, boolean z3, a aVar, int i2) {
        this.f3452a = i2;
        this.f3453b = z12;
        this.f3454c = z3;
        this.f3455e = aVar;
        this.d = w1Var;
    }

    public final void run() {
        W1 w12;
        C0214v vVar;
        C0164e eVar;
        switch (this.f3452a) {
            case 0:
                C0219w1 w1Var = this.d;
                J j6 = w1Var.d;
                if (j6 == null) {
                    Z z3 = ((C0212u0) w1Var.f398a).f3496r;
                    C0212u0.k(z3);
                    z3.f3172f.a("Discarding data. Failed to set user property");
                    return;
                }
                Z1 z12 = this.f3453b;
                if (this.f3454c) {
                    w12 = null;
                } else {
                    w12 = (W1) this.f3455e;
                }
                w1Var.v(j6, w12, z12);
                w1Var.E();
                return;
            case 1:
                C0219w1 w1Var2 = this.d;
                J j7 = w1Var2.d;
                if (j7 == null) {
                    Z z4 = ((C0212u0) w1Var2.f398a).f3496r;
                    C0212u0.k(z4);
                    z4.f3172f.a("Discarding data. Failed to send event to service");
                    return;
                }
                Z1 z13 = this.f3453b;
                if (this.f3454c) {
                    vVar = null;
                } else {
                    vVar = (C0214v) this.f3455e;
                }
                w1Var2.v(j7, vVar, z13);
                w1Var2.E();
                return;
            default:
                C0219w1 w1Var3 = this.d;
                J j8 = w1Var3.d;
                if (j8 == null) {
                    Z z5 = ((C0212u0) w1Var3.f398a).f3496r;
                    C0212u0.k(z5);
                    z5.f3172f.a("Discarding data. Failed to send conditional user property to service");
                    return;
                }
                Z1 z14 = this.f3453b;
                if (this.f3454c) {
                    eVar = null;
                } else {
                    eVar = (C0164e) this.f3455e;
                }
                w1Var3.v(j8, eVar, z14);
                w1Var3.E();
                return;
        }
    }
}
