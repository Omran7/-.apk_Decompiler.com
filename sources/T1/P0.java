package T1;

import A1.a;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class P0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3017a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0157b1 f3018b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f3019c;

    public /* synthetic */ P0(C0157b1 b1Var, AtomicReference atomicReference, int i2) {
        this.f3017a = i2;
        this.f3018b = b1Var;
        this.f3019c = atomicReference;
    }

    private final void a() {
        AtomicReference atomicReference = this.f3019c;
        synchronized (atomicReference) {
            try {
                C0212u0 u0Var = (C0212u0) this.f3018b.f398a;
                atomicReference.set(Integer.valueOf(u0Var.f3494p.u(u0Var.n().u(), H.f2899c0)));
                this.f3019c.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void run() {
        switch (this.f3017a) {
            case 0:
                C0157b1 b1Var = this.f3018b;
                C0174h0 h0Var = ((C0212u0) b1Var.f398a).f3495q;
                C0212u0.i(h0Var);
                Bundle J5 = h0Var.f3330x.J();
                C0219w1 r6 = ((C0212u0) b1Var.f398a).r();
                r6.o();
                r6.p();
                C0219w1 w1Var = r6;
                r6.F(new C0221x0((Object) w1Var, (Serializable) this.f3019c, (a) r6.C(false), (Object) J5, 4));
                return;
            case 1:
                C0219w1 r7 = ((C0212u0) this.f3018b.f398a).r();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(new C0178i1[]{C0178i1.SGTM_CLIENT}[0].f3347a));
                M1 m12 = new M1(arrayList);
                r7.o();
                r7.p();
                r7.F(new C0221x0(r7, this.f3019c, r7.C(false), m12));
                return;
            case 2:
                AtomicReference atomicReference = this.f3019c;
                synchronized (atomicReference) {
                    try {
                        C0212u0 u0Var = (C0212u0) this.f3018b.f398a;
                        atomicReference.set(Boolean.valueOf(u0Var.f3494p.B(u0Var.n().u(), H.f2890Z)));
                        this.f3019c.notify();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference2 = this.f3019c;
                synchronized (atomicReference2) {
                    try {
                        C0212u0 u0Var2 = (C0212u0) this.f3018b.f398a;
                        atomicReference2.set(u0Var2.f3494p.A(u0Var2.n().u(), H.f2893a0));
                        this.f3019c.notify();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 4:
                AtomicReference atomicReference3 = this.f3019c;
                synchronized (atomicReference3) {
                    try {
                        C0212u0 u0Var3 = (C0212u0) this.f3018b.f398a;
                        atomicReference3.set(Long.valueOf(u0Var3.f3494p.w(u0Var3.n().u(), H.f2896b0)));
                        this.f3019c.notify();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 5:
                a();
                return;
            default:
                AtomicReference atomicReference4 = this.f3019c;
                synchronized (atomicReference4) {
                    try {
                        C0212u0 u0Var4 = (C0212u0) this.f3018b.f398a;
                        atomicReference4.set(Double.valueOf(u0Var4.f3494p.t(u0Var4.n().u(), H.f2901d0)));
                        this.f3019c.notify();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }
}
