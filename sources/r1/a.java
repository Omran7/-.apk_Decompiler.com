package R1;

import T1.C0157b1;
import T1.C0181j1;
import T1.C0190m1;
import T1.C0203r0;
import T1.C0212u0;
import T1.C0221x0;
import T1.C0226z;
import T1.Y1;
import T1.Z;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import s2.e;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final C0212u0 f2466a;

    /* renamed from: b  reason: collision with root package name */
    public final C0157b1 f2467b;

    public a(C0212u0 u0Var) {
        I.g(u0Var);
        this.f2466a = u0Var;
        C0157b1 b1Var = u0Var.f3503y;
        C0212u0.j(b1Var);
        this.f2467b = b1Var;
    }

    public final void a(String str) {
        C0212u0 u0Var = this.f2466a;
        C0226z zVar = u0Var.f3504z;
        C0212u0.h(zVar);
        u0Var.f3501w.getClass();
        zVar.p(str, SystemClock.elapsedRealtime());
    }

    public final void b(String str, String str2, Bundle bundle) {
        C0157b1 b1Var = this.f2466a.f3503y;
        C0212u0.j(b1Var);
        b1Var.u(str, str2, bundle);
    }

    public final List c(String str, String str2) {
        C0157b1 b1Var = this.f2467b;
        C0212u0 u0Var = (C0212u0) b1Var.f398a;
        C0203r0 r0Var = u0Var.f3497s;
        C0212u0.k(r0Var);
        boolean A6 = r0Var.A();
        Z z3 = u0Var.f3496r;
        if (A6) {
            C0212u0.k(z3);
            z3.f3172f.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        } else if (e.n()) {
            C0212u0.k(z3);
            z3.f3172f.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C0203r0 r0Var2 = u0Var.f3497s;
            C0212u0.k(r0Var2);
            r0Var2.t(atomicReference, 5000, "get conditional user properties", new C0221x0((Object) b1Var, (Object) atomicReference, (Object) str, (Object) str2, 3));
            List list = (List) atomicReference.get();
            if (list != null) {
                return Y1.B(list);
            }
            C0212u0.k(z3);
            z3.f3172f.b((Object) null, "Timed out waiting for get conditional user properties");
            return new ArrayList();
        }
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [java.util.Map] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map d(java.lang.String r12, java.lang.String r13, boolean r14) {
        /*
            r11 = this;
            T1.b1 r1 = r11.f2467b
            java.lang.Object r0 = r1.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.r0 r2 = r0.f3497s
            T1.C0212u0.k(r2)
            boolean r2 = r2.A()
            T1.Z r7 = r0.f3496r
            if (r2 == 0) goto L_0x0023
            T1.C0212u0.k(r7)
            java.lang.String r12 = "Cannot get user properties from analytics worker thread"
            T1.X r13 = r7.f3172f
            r13.a(r12)
            java.util.Map r12 = java.util.Collections.emptyMap()
            goto L_0x0098
        L_0x0023:
            boolean r2 = s2.e.n()
            if (r2 == 0) goto L_0x0038
            T1.C0212u0.k(r7)
            java.lang.String r12 = "Cannot get user properties from main thread"
            T1.X r13 = r7.f3172f
            r13.a(r12)
            java.util.Map r12 = java.util.Collections.emptyMap()
            goto L_0x0098
        L_0x0038:
            java.util.concurrent.atomic.AtomicReference r8 = new java.util.concurrent.atomic.AtomicReference
            r8.<init>()
            T1.r0 r9 = r0.f3497s
            T1.C0212u0.k(r9)
            T1.Z0 r10 = new T1.Z0
            r6 = 1
            r0 = r10
            r2 = r8
            r3 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r2 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r4 = "get user properties"
            r0 = r9
            r1 = r8
            r5 = r10
            r0.t(r1, r2, r4, r5)
            java.lang.Object r12 = r8.get()
            java.util.List r12 = (java.util.List) r12
            if (r12 != 0) goto L_0x0072
            T1.C0212u0.k(r7)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r14)
            java.lang.String r13 = "Timed out waiting for handle get user properties, includeInternal"
            T1.X r14 = r7.f3172f
            r14.b(r12, r13)
            java.util.Map r12 = java.util.Collections.emptyMap()
            goto L_0x0098
        L_0x0072:
            n.e r13 = new n.e
            int r14 = r12.size()
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        L_0x007f:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x0097
            java.lang.Object r14 = r12.next()
            T1.W1 r14 = (T1.W1) r14
            java.lang.Object r0 = r14.v()
            if (r0 == 0) goto L_0x007f
            java.lang.String r14 = r14.f3140b
            r13.put(r14, r0)
            goto L_0x007f
        L_0x0097:
            r12 = r13
        L_0x0098:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.a.d(java.lang.String, java.lang.String, boolean):java.util.Map");
    }

    public final void e(String str) {
        C0212u0 u0Var = this.f2466a;
        C0226z zVar = u0Var.f3504z;
        C0212u0.h(zVar);
        u0Var.f3501w.getClass();
        zVar.q(str, SystemClock.elapsedRealtime());
    }

    public final void f(Bundle bundle) {
        C0157b1 b1Var = this.f2467b;
        ((C0212u0) b1Var.f398a).f3501w.getClass();
        b1Var.D(bundle, System.currentTimeMillis());
    }

    public final void g(String str, String str2, Bundle bundle) {
        C0157b1 b1Var = this.f2467b;
        ((C0212u0) b1Var.f398a).f3501w.getClass();
        b1Var.y(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    public final int zza(String str) {
        C0157b1 b1Var = this.f2467b;
        b1Var.getClass();
        I.d(str);
        ((C0212u0) b1Var.f398a).getClass();
        return 25;
    }

    public final long zzb() {
        Y1 y12 = this.f2466a.f3499u;
        C0212u0.i(y12);
        return y12.y0();
    }

    public final String zzh() {
        return (String) this.f2467b.f3247p.get();
    }

    public final String zzi() {
        C0190m1 m1Var = ((C0212u0) this.f2467b.f398a).f3502x;
        C0212u0.j(m1Var);
        C0181j1 j1Var = m1Var.f3380c;
        if (j1Var != null) {
            return j1Var.f3356b;
        }
        return null;
    }

    public final String zzj() {
        C0190m1 m1Var = ((C0212u0) this.f2467b.f398a).f3502x;
        C0212u0.j(m1Var);
        C0181j1 j1Var = m1Var.f3380c;
        if (j1Var != null) {
            return j1Var.f3355a;
        }
        return null;
    }

    public final String zzk() {
        return (String) this.f2467b.f3247p.get();
    }
}
