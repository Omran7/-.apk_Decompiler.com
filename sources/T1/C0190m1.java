package T1;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzdj;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: T1.m1  reason: case insensitive filesystem */
public final class C0190m1 extends E {

    /* renamed from: c  reason: collision with root package name */
    public volatile C0181j1 f3380c;
    public volatile C0181j1 d;

    /* renamed from: e  reason: collision with root package name */
    public C0181j1 f3381e;

    /* renamed from: f  reason: collision with root package name */
    public final ConcurrentHashMap f3382f = new ConcurrentHashMap();

    /* renamed from: p  reason: collision with root package name */
    public zzdj f3383p;

    /* renamed from: q  reason: collision with root package name */
    public volatile boolean f3384q;

    /* renamed from: r  reason: collision with root package name */
    public volatile C0181j1 f3385r;

    /* renamed from: s  reason: collision with root package name */
    public C0181j1 f3386s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3387t;

    /* renamed from: u  reason: collision with root package name */
    public final Object f3388u = new Object();

    public C0190m1(C0212u0 u0Var) {
        super(u0Var);
    }

    public final boolean r() {
        return false;
    }

    public final void s(String str, C0181j1 j1Var, boolean z3) {
        C0181j1 j1Var2;
        C0181j1 j1Var3;
        String str2;
        C0181j1 j1Var4 = j1Var;
        if (this.f3380c == null) {
            j1Var2 = this.d;
        } else {
            j1Var2 = this.f3380c;
        }
        C0181j1 j1Var5 = j1Var2;
        if (j1Var4.f3356b == null) {
            if (str != null) {
                str2 = w(str);
            } else {
                str2 = null;
            }
            j1Var3 = new C0181j1(j1Var4.f3355a, str2, j1Var4.f3357c, j1Var4.f3358e, j1Var4.f3359f);
        } else {
            j1Var3 = j1Var4;
        }
        this.d = this.f3380c;
        this.f3380c = j1Var3;
        C0212u0 u0Var = (C0212u0) this.f398a;
        u0Var.f3501w.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C0203r0 r0Var = u0Var.f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new C0184k1(this, j1Var3, j1Var5, elapsedRealtime, z3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(T1.C0181j1 r18, T1.C0181j1 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r17.o()
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x002d
            long r8 = r1.f3357c
            long r10 = r2.f3357c
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x002d
            java.lang.String r8 = r2.f3356b
            java.lang.String r9 = r1.f3356b
            boolean r8 = java.util.Objects.equals(r8, r9)
            if (r8 == 0) goto L_0x002d
            java.lang.String r8 = r2.f3355a
            java.lang.String r9 = r1.f3355a
            boolean r8 = java.util.Objects.equals(r8, r9)
            if (r8 != 0) goto L_0x002f
        L_0x002d:
            r8 = r7
            goto L_0x0030
        L_0x002f:
            r8 = r6
        L_0x0030:
            if (r22 == 0) goto L_0x0037
            T1.j1 r9 = r0.f3381e
            if (r9 == 0) goto L_0x0037
            r6 = r7
        L_0x0037:
            boolean r9 = r1.f3358e
            java.lang.Object r10 = r0.f398a
            T1.u0 r10 = (T1.C0212u0) r10
            if (r8 == 0) goto L_0x00c5
            if (r5 == 0) goto L_0x0048
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r5)
        L_0x0046:
            r14 = r8
            goto L_0x004e
        L_0x0048:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            goto L_0x0046
        L_0x004e:
            T1.Y1.E(r1, r14, r7)
            if (r2 == 0) goto L_0x006c
            java.lang.String r5 = r2.f3355a
            if (r5 == 0) goto L_0x005c
            java.lang.String r8 = "_pn"
            r14.putString(r8, r5)
        L_0x005c:
            java.lang.String r5 = r2.f3356b
            if (r5 == 0) goto L_0x0065
            java.lang.String r8 = "_pc"
            r14.putString(r8, r5)
        L_0x0065:
            long r11 = r2.f3357c
            java.lang.String r2 = "_pi"
            r14.putLong(r2, r11)
        L_0x006c:
            r11 = 0
            if (r6 == 0) goto L_0x0089
            T1.E1 r2 = r10.f3498t
            T1.C0212u0.j(r2)
            T1.D1 r2 = r2.f2828f
            long r7 = r2.f2822b
            long r7 = r3 - r7
            r2.f2822b = r3
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x0089
            T1.Y1 r2 = r10.f3499u
            T1.C0212u0.i(r2)
            r2.C(r14, r7)
        L_0x0089:
            T1.g r2 = r10.f3494p
            boolean r2 = r2.C()
            if (r2 != 0) goto L_0x0098
            java.lang.String r2 = "_mst"
            r7 = 1
            r14.putLong(r2, r7)
        L_0x0098:
            r2 = 1
            if (r2 == r9) goto L_0x009e
            java.lang.String r2 = "auto"
            goto L_0x00a0
        L_0x009e:
            java.lang.String r2 = "app"
        L_0x00a0:
            G1.b r7 = r10.f3501w
            r7.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            if (r9 == 0) goto L_0x00b6
            r22 = r6
            long r5 = r1.f3359f
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x00b4
            goto L_0x00b8
        L_0x00b4:
            r15 = r5
            goto L_0x00b9
        L_0x00b6:
            r22 = r6
        L_0x00b8:
            r15 = r7
        L_0x00b9:
            T1.b1 r11 = r10.f3503y
            T1.C0212u0.j(r11)
            java.lang.String r13 = "_vs"
            r12 = r2
            r11.A(r12, r13, r14, r15)
            goto L_0x00c7
        L_0x00c5:
            r22 = r6
        L_0x00c7:
            if (r22 == 0) goto L_0x00cf
            T1.j1 r2 = r0.f3381e
            r5 = 1
            r0.u(r2, r5, r3)
        L_0x00cf:
            r0.f3381e = r1
            if (r9 == 0) goto L_0x00d5
            r0.f3386s = r1
        L_0x00d5:
            T1.w1 r2 = r10.r()
            r2.o()
            r2.p()
            B2.a r3 = new B2.a
            r4 = 17
            r5 = 0
            r3.<init>(r2, r1, r4, r5)
            r2.F(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0190m1.t(T1.j1, T1.j1, long, boolean, android.os.Bundle):void");
    }

    public final void u(C0181j1 j1Var, boolean z3, long j6) {
        boolean z4;
        C0212u0 u0Var = (C0212u0) this.f398a;
        C0226z zVar = u0Var.f3504z;
        C0212u0.h(zVar);
        u0Var.f3501w.getClass();
        zVar.r(SystemClock.elapsedRealtime());
        if (j1Var == null || !j1Var.d) {
            z4 = false;
        } else {
            z4 = true;
        }
        E1 e12 = u0Var.f3498t;
        C0212u0.j(e12);
        if (e12.f2828f.a(z4, z3, j6) && j1Var != null) {
            j1Var.d = false;
        }
    }

    public final C0181j1 v(boolean z3) {
        p();
        o();
        if (!z3) {
            return this.f3381e;
        }
        C0181j1 j1Var = this.f3381e;
        if (j1Var != null) {
            return j1Var;
        }
        return this.f3386s;
    }

    public final String w(String str) {
        String str2;
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        int length2 = str2.length();
        C0212u0 u0Var = (C0212u0) this.f398a;
        u0Var.f3494p.getClass();
        if (length2 <= 500) {
            return str2;
        }
        u0Var.f3494p.getClass();
        return str2.substring(0, 500);
    }

    public final void x(zzdj zzdj, Bundle bundle) {
        Bundle bundle2;
        if (((C0212u0) this.f398a).f3494p.C() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f3382f.put(Integer.valueOf(zzdj.zza), new C0181j1(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
        }
    }

    public final C0181j1 y(zzdj zzdj) {
        I.g(zzdj);
        Integer valueOf = Integer.valueOf(zzdj.zza);
        ConcurrentHashMap concurrentHashMap = this.f3382f;
        C0181j1 j1Var = (C0181j1) concurrentHashMap.get(valueOf);
        if (j1Var == null) {
            String w6 = w(zzdj.zzb);
            Y1 y12 = ((C0212u0) this.f398a).f3499u;
            C0212u0.i(y12);
            C0181j1 j1Var2 = new C0181j1(y12.y0(), (String) null, w6);
            concurrentHashMap.put(valueOf, j1Var2);
            j1Var = j1Var2;
        }
        if (this.f3385r != null) {
            return this.f3385r;
        }
        return j1Var;
    }
}
