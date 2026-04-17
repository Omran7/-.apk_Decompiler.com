package T1;

import B0.C0004c;
import I3.h;
import P4.q;
import android.os.Handler;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.fragments.gangBase.I;
import com.mtma.criminal.city.utils.K;
import com.mtma.criminal.city.utils.r0;
import com.mtma.criminal.city.utils.w0;
import d5.o;
import i3.C0592h;

public final class B1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2808a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2809b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2810c;
    public final /* synthetic */ Object d;

    public /* synthetic */ B1(Object obj, long j6, long j7, int i2) {
        this.f2808a = i2;
        this.d = obj;
        this.f2809b = j6;
        this.f2810c = j7;
    }

    public final void run() {
        switch (this.f2808a) {
            case 0:
                C0203r0 r0Var = ((C0212u0) ((E1) ((h) this.d).f1180c).f398a).f3497s;
                C0212u0.k(r0Var);
                r0Var.y(new C0004c((Object) this, 8));
                return;
            default:
                boolean z3 = c.f5750u;
                K k6 = (K) this.d;
                if (z3) {
                    c.f5750u = false;
                    c.s(false, (r0) ((I) k6.f7360b).f7143b);
                    return;
                }
                boolean z4 = d.f5753b;
                long j6 = this.f2809b;
                if (!z4 || o.getMainStatesObject().getLastSeenInSeconds() == j6) {
                    c.f5744o = j6;
                    c.f5743n = 0;
                    c.f5748s = false;
                    if (d.f5753b) {
                        new Handler().postDelayed(new w0(j6), 2000);
                    }
                    if (!c.f5747r) {
                        c.f5747r = true;
                        Handler handler = new Handler();
                        c.f5745p = handler;
                        q qVar = new q(3);
                        c.f5746q = qVar;
                        handler.postDelayed(qVar, 1000);
                    }
                    r0 r0Var2 = (r0) ((I) k6.f7360b).f7143b;
                    if (r0Var2 != null) {
                        r0Var2.j(j6);
                        return;
                    }
                    return;
                }
                a.d(a.c(C0592h.b().e(), "players"), "mainStatesObject", "lastSeen").d(new I(this, 18));
                return;
        }
    }
}
