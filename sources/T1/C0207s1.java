package T1;

import A1.a;
import android.os.RemoteException;

/* renamed from: T1.s1  reason: case insensitive filesystem */
public final class C0207s1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3465a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Z1 f3466b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0219w1 f3467c;

    public /* synthetic */ C0207s1(C0219w1 w1Var, Z1 z12, int i2) {
        this.f3465a = i2;
        this.f3466b = z12;
        this.f3467c = w1Var;
    }

    public final void run() {
        switch (this.f3465a) {
            case 0:
                C0219w1 w1Var = this.f3467c;
                J j6 = w1Var.d;
                C0212u0 u0Var = (C0212u0) w1Var.f398a;
                if (j6 == null) {
                    Z z3 = u0Var.f3496r;
                    C0212u0.k(z3);
                    z3.f3172f.a("Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    j6.i(this.f3466b);
                } catch (RemoteException e6) {
                    Z z4 = u0Var.f3496r;
                    C0212u0.k(z4);
                    z4.f3172f.b(e6, "Failed to reset data on the service: remote exception");
                }
                w1Var.E();
                return;
            case 1:
                C0219w1 w1Var2 = this.f3467c;
                J j7 = w1Var2.d;
                C0212u0 u0Var2 = (C0212u0) w1Var2.f398a;
                if (j7 == null) {
                    Z z5 = u0Var2.f3496r;
                    C0212u0.k(z5);
                    z5.f3172f.a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    Z1 z12 = this.f3466b;
                    C0170g gVar = u0Var2.f3494p;
                    G g = H.f2923l1;
                    if (gVar.B((String) null, g)) {
                        w1Var2.v(j7, (a) null, z12);
                    }
                    j7.k(z12);
                    u0Var2.o().u();
                    u0Var2.f3494p.B((String) null, g);
                    w1Var2.v(j7, (a) null, z12);
                    w1Var2.E();
                    return;
                } catch (RemoteException e7) {
                    Z z6 = u0Var2.f3496r;
                    C0212u0.k(z6);
                    z6.f3172f.b(e7, "Failed to send app launch to the service");
                    return;
                }
            case 2:
                C0219w1 w1Var3 = this.f3467c;
                J j8 = w1Var3.d;
                C0212u0 u0Var3 = (C0212u0) w1Var3.f398a;
                if (j8 == null) {
                    Z z7 = u0Var3.f3496r;
                    C0212u0.k(z7);
                    z7.f3175r.a("Failed to send app backgrounded");
                    return;
                }
                try {
                    j8.q(this.f3466b);
                    w1Var3.E();
                    return;
                } catch (RemoteException e8) {
                    Z z8 = u0Var3.f3496r;
                    C0212u0.k(z8);
                    z8.f3172f.b(e8, "Failed to send app backgrounded to the service");
                    return;
                }
            case 3:
                C0219w1 w1Var4 = this.f3467c;
                J j9 = w1Var4.d;
                C0212u0 u0Var4 = (C0212u0) w1Var4.f398a;
                if (j9 == null) {
                    Z z9 = u0Var4.f3496r;
                    C0212u0.k(z9);
                    z9.f3172f.a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    j9.s(this.f3466b);
                    w1Var4.E();
                    return;
                } catch (RemoteException e9) {
                    Z z10 = u0Var4.f3496r;
                    C0212u0.k(z10);
                    z10.f3172f.b(e9, "Failed to send measurementEnabled to the service");
                    return;
                }
            default:
                C0219w1 w1Var5 = this.f3467c;
                J j10 = w1Var5.d;
                C0212u0 u0Var5 = (C0212u0) w1Var5.f398a;
                if (j10 == null) {
                    Z z11 = u0Var5.f3496r;
                    C0212u0.k(z11);
                    z11.f3172f.a("Failed to send consent settings to service");
                    return;
                }
                try {
                    j10.n(this.f3466b);
                    w1Var5.E();
                    return;
                } catch (RemoteException e10) {
                    Z z13 = u0Var5.f3496r;
                    C0212u0.k(z13);
                    z13.f3172f.b(e10, "Failed to send consent settings to the service");
                    return;
                }
        }
    }
}
