package T1;

import android.os.Bundle;
import android.os.SystemClock;

public final class D1 {

    /* renamed from: a  reason: collision with root package name */
    public long f2821a;

    /* renamed from: b  reason: collision with root package name */
    public long f2822b;

    /* renamed from: c  reason: collision with root package name */
    public final C1 f2823c;
    public final /* synthetic */ E1 d;

    public D1(E1 e12) {
        this.d = e12;
        this.f2823c = new C1(this, (C0212u0) e12.f398a, 0);
        ((C0212u0) e12.f398a).f3501w.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f2821a = elapsedRealtime;
        this.f2822b = elapsedRealtime;
    }

    public final boolean a(boolean z3, boolean z4, long j6) {
        E1 e12 = this.d;
        e12.o();
        e12.p();
        C0212u0 u0Var = (C0212u0) e12.f398a;
        if (u0Var.a()) {
            C0174h0 h0Var = u0Var.f3495q;
            C0212u0.i(h0Var);
            u0Var.f3501w.getClass();
            h0Var.f3332z.b(System.currentTimeMillis());
        }
        long j7 = j6 - this.f2821a;
        Z z5 = u0Var.f3496r;
        if (z3 || j7 >= 1000) {
            if (!z4) {
                j7 = j6 - this.f2822b;
                this.f2822b = j6;
            }
            C0212u0.k(z5);
            z5.f3180w.b(Long.valueOf(j7), "Recording user engagement, ms");
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j7);
            C0190m1 m1Var = u0Var.f3502x;
            C0212u0.j(m1Var);
            Y1.E(m1Var.v(!u0Var.f3494p.C()), bundle, true);
            if (!z4) {
                C0157b1 b1Var = u0Var.f3503y;
                C0212u0.j(b1Var);
                b1Var.z("auto", "_e", bundle);
            }
            this.f2821a = j6;
            C1 c12 = this.f2823c;
            c12.a();
            c12.c(((Long) H.f2934p0.a((Object) null)).longValue());
            return true;
        }
        C0212u0.k(z5);
        z5.f3180w.b(Long.valueOf(j7), "Screen exposed for less than 1000 ms. Event not sent. time");
        return false;
    }
}
