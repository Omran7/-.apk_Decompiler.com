package T1;

import com.google.android.gms.common.internal.I;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: T1.u1  reason: case insensitive filesystem */
public final class C0213u1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3505a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ J f3506b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0216v1 f3507c;

    public /* synthetic */ C0213u1(C0216v1 v1Var, J j6, int i2) {
        this.f3505a = i2;
        this.f3506b = j6;
        this.f3507c = v1Var;
    }

    public final void run() {
        ScheduledExecutorService scheduledExecutorService;
        switch (this.f3505a) {
            case 0:
                C0216v1 v1Var = this.f3507c;
                synchronized (v1Var) {
                    try {
                        v1Var.f3516a = false;
                        C0219w1 w1Var = v1Var.f3518c;
                        if (!w1Var.y()) {
                            Z z3 = ((C0212u0) w1Var.f398a).f3496r;
                            C0212u0.k(z3);
                            z3.f3180w.a("Connected to service");
                            J j6 = this.f3506b;
                            w1Var.o();
                            w1Var.d = j6;
                            w1Var.E();
                            w1Var.D();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                C0216v1 v1Var2 = this.f3507c;
                synchronized (v1Var2) {
                    try {
                        v1Var2.f3516a = false;
                        C0219w1 w1Var2 = v1Var2.f3518c;
                        if (!w1Var2.y()) {
                            Z z4 = ((C0212u0) w1Var2.f398a).f3496r;
                            C0212u0.k(z4);
                            z4.f3179v.a("Connected to remote service");
                            J j7 = this.f3506b;
                            w1Var2.o();
                            I.g(j7);
                            w1Var2.d = j7;
                            w1Var2.E();
                            w1Var2.D();
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
                C0219w1 w1Var3 = this.f3507c.f3518c;
                if (((C0212u0) w1Var3.f398a).f3494p.B((String) null, H.f2932o1) && (scheduledExecutorService = w1Var3.f3528p) != null) {
                    scheduledExecutorService.shutdownNow();
                    w1Var3.f3528p = null;
                    return;
                }
                return;
        }
    }
}
