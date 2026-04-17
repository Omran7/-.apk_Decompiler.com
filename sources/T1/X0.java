package T1;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

public final class X0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3148a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f3149b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0157b1 f3150c;

    public /* synthetic */ X0(C0157b1 b1Var, long j6, int i2) {
        this.f3148a = i2;
        this.f3149b = j6;
        this.f3150c = b1Var;
    }

    public final void run() {
        long j6;
        switch (this.f3148a) {
            case 0:
                C0212u0 u0Var = (C0212u0) this.f3150c.f398a;
                C0174h0 h0Var = u0Var.f3495q;
                C0212u0.i(h0Var);
                C0171g0 g0Var = h0Var.f3327u;
                long j7 = this.f3149b;
                g0Var.b(j7);
                Z z3 = u0Var.f3496r;
                C0212u0.k(z3);
                z3.f3179v.b(Long.valueOf(j7), "Session timeout duration set");
                return;
            default:
                C0157b1 b1Var = this.f3150c;
                b1Var.o();
                b1Var.p();
                C0212u0 u0Var2 = (C0212u0) b1Var.f398a;
                Z z4 = u0Var2.f3496r;
                C0212u0.k(z4);
                z4.f3179v.a("Resetting analytics data (FE)");
                E1 e12 = u0Var2.f3498t;
                C0212u0.j(e12);
                e12.o();
                D1 d12 = e12.f2828f;
                d12.f2823c.a();
                C0212u0 u0Var3 = (C0212u0) d12.d.f398a;
                if (u0Var3.f3494p.B((String) null, H.f2897b1)) {
                    u0Var3.f3501w.getClass();
                    j6 = SystemClock.elapsedRealtime();
                    d12.f2821a = j6;
                } else {
                    d12.f2821a = 0;
                    j6 = 0;
                }
                d12.f2822b = j6;
                u0Var2.n().w();
                boolean z5 = !u0Var2.a();
                C0174h0 h0Var2 = u0Var2.f3495q;
                C0212u0.i(h0Var2);
                h0Var2.f3322p.b(this.f3149b);
                C0212u0 u0Var4 = (C0212u0) h0Var2.f398a;
                C0174h0 h0Var3 = u0Var4.f3495q;
                C0212u0.i(h0Var3);
                if (!TextUtils.isEmpty(h0Var3.F.C())) {
                    h0Var2.F.D((String) null);
                }
                h0Var2.f3332z.b(0);
                h0Var2.f3311A.b(0);
                if (!u0Var4.f3494p.p()) {
                    h0Var2.w(z5);
                }
                h0Var2.f3316G.D((String) null);
                h0Var2.f3317H.b(0);
                h0Var2.f3318I.N((Bundle) null);
                C0219w1 r6 = u0Var2.r();
                r6.o();
                r6.p();
                Z1 C6 = r6.C(false);
                r6.G();
                ((C0212u0) r6.f398a).o().t();
                r6.F(new C0207s1(r6, C6, 0));
                C0212u0.j(e12);
                e12.f2827e.t();
                b1Var.f3240B = z5;
                u0Var2.r().u(new AtomicReference());
                return;
        }
    }
}
