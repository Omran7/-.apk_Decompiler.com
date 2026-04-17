package T1;

import G1.b;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;

public final class C1 extends C0194o {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f2816e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f2817f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1(Object obj, F0 f02, int i2) {
        super(f02);
        this.f2816e = i2;
        this.f2817f = obj;
    }

    public final void b() {
        switch (this.f2816e) {
            case 0:
                D1 d12 = (D1) this.f2817f;
                E1 e12 = d12.d;
                e12.o();
                C0212u0 u0Var = (C0212u0) e12.f398a;
                u0Var.f3501w.getClass();
                d12.a(false, false, SystemClock.elapsedRealtime());
                C0226z zVar = u0Var.f3504z;
                C0212u0.h(zVar);
                u0Var.f3501w.getClass();
                zVar.r(SystemClock.elapsedRealtime());
                return;
            case 1:
                J1 j12 = (J1) this.f2817f;
                j12.s();
                Z z3 = ((C0212u0) j12.f398a).f3496r;
                C0212u0.k(z3);
                z3.f3180w.a("Starting upload from DelayedRunnable");
                j12.f2982b.X();
                return;
            default:
                T1 t12 = (T1) this.f2817f;
                t12.f().o();
                String str = (String) t12.f3075z.pollFirst();
                if (str != null) {
                    ((b) t12.g()).getClass();
                    t12.f3058R = SystemClock.elapsedRealtime();
                    t12.c().f3180w.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = t12.f3070u.f3489a;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        context.sendBroadcast(intent, (String) null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                    }
                }
                t12.E();
                return;
        }
    }
}
