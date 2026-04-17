package T1;

import C0.a;
import G1.b;
import H3.f;
import S3.m;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.android.gms.internal.measurement.zzki;
import java.util.concurrent.atomic.AtomicInteger;
import s2.e;

/* renamed from: T1.u0  reason: case insensitive filesystem */
public final class C0212u0 implements F0 {

    /* renamed from: Q  reason: collision with root package name */
    public static volatile C0212u0 f3473Q;

    /* renamed from: A  reason: collision with root package name */
    public final C0169f1 f3474A;

    /* renamed from: B  reason: collision with root package name */
    public final String f3475B;

    /* renamed from: C  reason: collision with root package name */
    public Q f3476C;

    /* renamed from: D  reason: collision with root package name */
    public C0219w1 f3477D;

    /* renamed from: E  reason: collision with root package name */
    public C0200q f3478E;
    public O F;

    /* renamed from: G  reason: collision with root package name */
    public C0172g1 f3479G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f3480H = false;

    /* renamed from: I  reason: collision with root package name */
    public Boolean f3481I;

    /* renamed from: J  reason: collision with root package name */
    public long f3482J;

    /* renamed from: K  reason: collision with root package name */
    public volatile Boolean f3483K;

    /* renamed from: L  reason: collision with root package name */
    public volatile boolean f3484L;

    /* renamed from: M  reason: collision with root package name */
    public int f3485M;

    /* renamed from: N  reason: collision with root package name */
    public int f3486N;

    /* renamed from: O  reason: collision with root package name */
    public final AtomicInteger f3487O = new AtomicInteger(0);

    /* renamed from: P  reason: collision with root package name */
    public final long f3488P;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3489a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3490b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3491c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3492e;

    /* renamed from: f  reason: collision with root package name */
    public final e f3493f;

    /* renamed from: p  reason: collision with root package name */
    public final C0170g f3494p;

    /* renamed from: q  reason: collision with root package name */
    public final C0174h0 f3495q;

    /* renamed from: r  reason: collision with root package name */
    public final Z f3496r;

    /* renamed from: s  reason: collision with root package name */
    public final C0203r0 f3497s;

    /* renamed from: t  reason: collision with root package name */
    public final E1 f3498t;

    /* renamed from: u  reason: collision with root package name */
    public final Y1 f3499u;

    /* renamed from: v  reason: collision with root package name */
    public final S f3500v;

    /* renamed from: w  reason: collision with root package name */
    public final b f3501w;

    /* renamed from: x  reason: collision with root package name */
    public final C0190m1 f3502x;

    /* renamed from: y  reason: collision with root package name */
    public final C0157b1 f3503y;

    /* renamed from: z  reason: collision with root package name */
    public final C0226z f3504z;

    /* JADX WARNING: type inference failed for: r3v4, types: [T1.g, C0.a] */
    /* JADX WARNING: type inference failed for: r5v3, types: [T1.E0, T1.f1] */
    public C0212u0(N0 n02) {
        long j6;
        boolean z3 = false;
        Context context = n02.f2990a;
        e eVar = new e(18);
        this.f3493f = eVar;
        K0.f2981k = eVar;
        this.f3489a = context;
        this.f3490b = n02.f2991b;
        this.f3491c = n02.f2992c;
        this.d = n02.d;
        this.f3492e = n02.h;
        this.f3483K = n02.f2993e;
        this.f3475B = n02.f2996j;
        this.f3484L = true;
        zzki.zzd(context);
        this.f3501w = b.f823a;
        Long l6 = n02.f2995i;
        if (l6 != null) {
            j6 = l6.longValue();
        } else {
            j6 = System.currentTimeMillis();
        }
        this.f3488P = j6;
        ? aVar = new a(this);
        aVar.d = new f(19);
        this.f3494p = aVar;
        C0174h0 h0Var = new C0174h0(this);
        h0Var.r();
        this.f3495q = h0Var;
        Z z4 = new Z(this);
        z4.r();
        this.f3496r = z4;
        Y1 y12 = new Y1(this);
        y12.r();
        this.f3499u = y12;
        this.f3500v = new S(new C0180j0(this));
        this.f3504z = new C0226z(this);
        C0190m1 m1Var = new C0190m1(this);
        m1Var.q();
        this.f3502x = m1Var;
        C0157b1 b1Var = new C0157b1(this);
        b1Var.q();
        this.f3503y = b1Var;
        E1 e12 = new E1(this);
        e12.q();
        this.f3498t = e12;
        ? e02 = new E0(this);
        e02.r();
        this.f3474A = e02;
        C0203r0 r0Var = new C0203r0(this);
        r0Var.r();
        this.f3497s = r0Var;
        zzdh zzdh = n02.g;
        z3 = (zzdh == null || zzdh.zzb == 0) ? true : z3;
        if (context.getApplicationContext() instanceof Application) {
            j(b1Var);
            if (((C0212u0) b1Var.f398a).f3489a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((C0212u0) b1Var.f398a).f3489a.getApplicationContext();
                if (b1Var.f3244c == null) {
                    b1Var.f3244c = new m(b1Var);
                }
                if (z3) {
                    application.unregisterActivityLifecycleCallbacks(b1Var.f3244c);
                    application.registerActivityLifecycleCallbacks(b1Var.f3244c);
                    Z z5 = ((C0212u0) b1Var.f398a).f3496r;
                    k(z5);
                    z5.f3180w.a("Registered activity lifecycle callback");
                }
            }
        } else {
            k(z4);
            z4.f3175r.a("Application context is not an Application");
        }
        r0Var.y(new B2.a(this, n02, 9, false));
    }

    public static final void h(D d6) {
        if (d6 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void i(a aVar) {
        if (aVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void j(E e6) {
        if (e6 == null) {
            throw new IllegalStateException("Component not created");
        } else if (!e6.f2824b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(e6.getClass())));
        }
    }

    public static final void k(E0 e02) {
        if (e02 == null) {
            throw new IllegalStateException("Component not created");
        } else if (!e02.f2825b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(e02.getClass())));
        }
    }

    public static C0212u0 q(Context context, zzdh zzdh, Long l6) {
        Bundle bundle;
        if (zzdh != null && (zzdh.zze == null || zzdh.zzf == null)) {
            zzdh = new zzdh(zzdh.zza, zzdh.zzb, zzdh.zzc, zzdh.zzd, (String) null, (String) null, zzdh.zzg, (String) null);
        }
        I.g(context);
        I.g(context.getApplicationContext());
        if (f3473Q == null) {
            synchronized (C0212u0.class) {
                try {
                    if (f3473Q == null) {
                        f3473Q = new C0212u0(new N0(context, zzdh, l6));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (!(zzdh == null || (bundle = zzdh.zzg) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            I.g(f3473Q);
            f3473Q.f3483K = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        I.g(f3473Q);
        return f3473Q;
    }

    public final boolean a() {
        if (l() == 0) {
            return true;
        }
        return false;
    }

    public final e b() {
        return this.f3493f;
    }

    public final Z c() {
        Z z3 = this.f3496r;
        k(z3);
        return z3;
    }

    public final Context d() {
        return this.f3489a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.f3482J) > 1000) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r6 = this;
            boolean r0 = r6.f3480H
            if (r0 == 0) goto L_0x00bb
            T1.r0 r0 = r6.f3497s
            k(r0)
            r0.o()
            java.lang.Boolean r0 = r6.f3481I
            G1.b r1 = r6.f3501w
            if (r0 == 0) goto L_0x0034
            long r2 = r6.f3482J
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0034
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00b4
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f3482J
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b4
        L_0x0034:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f3482J = r0
            T1.Y1 r0 = r6.f3499u
            i(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.d0(r1)
            T1.g r2 = r6.f3494p
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0076
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.d0(r1)
            if (r1 == 0) goto L_0x0076
            android.content.Context r1 = r6.f3489a
            D0.e r5 = I1.c.a(r1)
            boolean r5 = r5.j()
            if (r5 != 0) goto L_0x0074
            boolean r5 = r2.r()
            if (r5 != 0) goto L_0x0074
            boolean r5 = T1.Y1.k0(r1)
            if (r5 == 0) goto L_0x0076
            boolean r1 = T1.Y1.l0(r1)
            if (r1 == 0) goto L_0x0076
        L_0x0074:
            r1 = r3
            goto L_0x0077
        L_0x0076:
            r1 = r4
        L_0x0077:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r6.f3481I = r5
            if (r1 == 0) goto L_0x00b4
            T1.O r1 = r6.n()
            java.lang.String r1 = r1.v()
            T1.O r5 = r6.n()
            java.lang.String r5 = r5.t()
            boolean r0 = r0.X(r1, r5)
            if (r0 != 0) goto L_0x00ae
            r0 = 0
            T1.G r1 = T1.H.f2935p1
            boolean r0 = r2.B(r0, r1)
            if (r0 != 0) goto L_0x00ad
            T1.O r0 = r6.n()
            java.lang.String r0 = r0.t()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r3 = r4
        L_0x00ae:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r6.f3481I = r0
        L_0x00b4:
            java.lang.Boolean r0 = r6.f3481I
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00bb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0212u0.e():boolean");
    }

    public final C0203r0 f() {
        C0203r0 r0Var = this.f3497s;
        k(r0Var);
        return r0Var;
    }

    public final G1.a g() {
        return this.f3501w;
    }

    public final int l() {
        Boolean bool;
        C0203r0 r0Var = this.f3497s;
        k(r0Var);
        r0Var.o();
        C0170g gVar = this.f3494p;
        if (gVar.p()) {
            return 1;
        }
        k(r0Var);
        r0Var.o();
        if (!this.f3484L) {
            return 8;
        }
        C0174h0 h0Var = this.f3495q;
        i(h0Var);
        h0Var.o();
        if (h0Var.t().contains("measurement_enabled")) {
            bool = Boolean.valueOf(h0Var.t().getBoolean("measurement_enabled", true));
        } else {
            bool = null;
        }
        if (bool == null) {
            e eVar = ((C0212u0) gVar.f398a).f3493f;
            Boolean z3 = gVar.z("firebase_analytics_collection_enabled");
            if (z3 != null) {
                if (z3.booleanValue()) {
                    return 0;
                }
                return 4;
            } else if (this.f3483K == null || this.f3483K.booleanValue()) {
                return 0;
            } else {
                return 7;
            }
        } else if (bool.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    public final C0200q m() {
        k(this.f3478E);
        return this.f3478E;
    }

    public final O n() {
        j(this.F);
        return this.F;
    }

    public final Q o() {
        j(this.f3476C);
        return this.f3476C;
    }

    public final S p() {
        return this.f3500v;
    }

    public final C0219w1 r() {
        j(this.f3477D);
        return this.f3477D;
    }

    public final String s() {
        if (this.f3494p.B((String) null, H.f2935p1)) {
            return null;
        }
        return this.f3490b;
    }
}
