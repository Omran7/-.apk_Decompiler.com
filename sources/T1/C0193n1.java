package T1;

import android.os.RemoteException;

/* renamed from: T1.n1  reason: case insensitive filesystem */
public final /* synthetic */ class C0193n1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3411a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0219w1 f3412b;

    public /* synthetic */ C0193n1(C0219w1 w1Var, int i2) {
        this.f3411a = i2;
        this.f3412b = w1Var;
    }

    public final void run() {
        switch (this.f3411a) {
            case 0:
                C0219w1 w1Var = this.f3412b;
                J j6 = w1Var.d;
                C0212u0 u0Var = (C0212u0) w1Var.f398a;
                if (j6 == null) {
                    Z z3 = u0Var.f3496r;
                    C0212u0.k(z3);
                    z3.f3172f.a("Failed to send storage consent settings to service");
                    return;
                }
                try {
                    j6.e(w1Var.C(false));
                    w1Var.E();
                    return;
                } catch (RemoteException e6) {
                    Z z4 = u0Var.f3496r;
                    C0212u0.k(z4);
                    z4.f3172f.b(e6, "Failed to send storage consent settings to the service");
                    return;
                }
            case 1:
                C0219w1 w1Var2 = this.f3412b;
                J j7 = w1Var2.d;
                C0212u0 u0Var2 = (C0212u0) w1Var2.f398a;
                if (j7 == null) {
                    Z z5 = u0Var2.f3496r;
                    C0212u0.k(z5);
                    z5.f3172f.a("Failed to send Dma consent settings to service");
                    return;
                }
                try {
                    j7.z(w1Var2.C(false));
                    w1Var2.E();
                    return;
                } catch (RemoteException e7) {
                    Z z6 = u0Var2.f3496r;
                    C0212u0.k(z6);
                    z6.f3172f.b(e7, "Failed to send Dma consent settings to the service");
                    return;
                }
            default:
                this.f3412b.s();
                return;
        }
    }
}
