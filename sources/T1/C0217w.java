package T1;

import P4.q;
import android.os.Handler;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.mtma.criminal.city.fragments.gangBase.I;
import com.mtma.criminal.city.utils.J;
import com.mtma.criminal.city.utils.K;
import com.mtma.criminal.city.utils.r0;
import com.mtma.criminal.city.utils.w0;
import d5.o;

/* renamed from: T1.w  reason: case insensitive filesystem */
public final class C0217w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3519a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f3520b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3521c;

    public /* synthetic */ C0217w(Object obj, long j6, int i2) {
        this.f3519a = i2;
        this.f3520b = j6;
        this.f3521c = obj;
    }

    public final void run() {
        switch (this.f3519a) {
            case 0:
                ((C0226z) this.f3521c).u(this.f3520b);
                return;
            case 1:
                C0190m1 m1Var = (C0190m1) this.f3521c;
                C0226z zVar = ((C0212u0) m1Var.f398a).f3504z;
                C0212u0.h(zVar);
                zVar.r(this.f3520b);
                m1Var.f3381e = null;
                return;
            case 2:
                if (d.f5753b) {
                    long lastSeenInSeconds = o.getMainStatesObject().getLastSeenInSeconds();
                    long j6 = this.f3520b;
                    if (j6 <= lastSeenInSeconds && c.f5744o != -111) {
                        d.P0(j6, (J) this.f3521c);
                        return;
                    }
                    return;
                }
                return;
            default:
                boolean z3 = c.f5750u;
                I i2 = (I) this.f3521c;
                if (z3) {
                    c.f5750u = false;
                    c.s(false, (r0) ((I) ((K) ((B1) i2.f7143b).d).f7360b).f7143b);
                    return;
                }
                boolean z4 = d.f5753b;
                long j7 = this.f3520b;
                if (!z4 || o.getMainStatesObject().getLastSeenInSeconds() != j7) {
                    c.f5744o = j7;
                    c.f5743n = 0;
                    c.f5748s = false;
                    if (d.f5753b) {
                        new Handler().postDelayed(new w0(j7), 2000);
                    }
                    if (!c.f5747r) {
                        c.f5747r = true;
                        Handler handler = new Handler();
                        c.f5745p = handler;
                        q qVar = new q(3);
                        c.f5746q = qVar;
                        handler.postDelayed(qVar, 1000);
                    }
                    r0 r0Var = (r0) ((I) ((K) ((B1) i2.f7143b).d).f7360b).f7143b;
                    if (r0Var != null) {
                        r0Var.j(j7);
                        return;
                    }
                    return;
                }
                c.s(false, (r0) ((I) ((K) ((B1) i2.f7143b).d).f7360b).f7143b);
                return;
        }
    }

    public C0217w(long j6, J j7) {
        this.f3519a = 2;
        this.f3520b = j6;
        this.f3521c = j7;
    }
}
