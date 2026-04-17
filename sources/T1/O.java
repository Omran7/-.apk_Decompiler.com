package T1;

import com.google.android.gms.common.internal.I;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

public final class O extends E {

    /* renamed from: A  reason: collision with root package name */
    public String f2998A = null;

    /* renamed from: c  reason: collision with root package name */
    public String f2999c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public int f3000e;

    /* renamed from: f  reason: collision with root package name */
    public String f3001f;

    /* renamed from: p  reason: collision with root package name */
    public String f3002p;

    /* renamed from: q  reason: collision with root package name */
    public long f3003q;

    /* renamed from: r  reason: collision with root package name */
    public final long f3004r;

    /* renamed from: s  reason: collision with root package name */
    public final long f3005s;

    /* renamed from: t  reason: collision with root package name */
    public List f3006t;

    /* renamed from: u  reason: collision with root package name */
    public String f3007u;

    /* renamed from: v  reason: collision with root package name */
    public int f3008v;

    /* renamed from: w  reason: collision with root package name */
    public String f3009w;

    /* renamed from: x  reason: collision with root package name */
    public String f3010x;

    /* renamed from: y  reason: collision with root package name */
    public String f3011y;

    /* renamed from: z  reason: collision with root package name */
    public long f3012z = 0;

    public O(C0212u0 u0Var, long j6, long j7) {
        super(u0Var);
        this.f3004r = j6;
        this.f3005s = j7;
    }

    public final boolean r() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0230 A[SYNTHETIC, Splitter:B:92:0x0230] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T1.Z1 s(java.lang.String r54) {
        /*
            r53 = this;
            r1 = r53
            r53.o()
            T1.Z1 r44 = new T1.Z1
            java.lang.String r3 = r53.u()
            java.lang.String r4 = r53.v()
            r53.p()
            java.lang.String r5 = r1.d
            r53.p()
            int r0 = r1.f3000e
            long r6 = (long) r0
            r53.p()
            java.lang.String r0 = r1.f3001f
            com.google.android.gms.common.internal.I.g(r0)
            java.lang.String r8 = r1.f3001f
            java.lang.Object r0 = r1.f398a
            r2 = r0
            T1.u0 r2 = (T1.C0212u0) r2
            T1.g r0 = r2.f3494p
            r0.v()
            r53.p()
            r53.o()
            long r9 = r1.f3003q
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r13 = 0
            android.content.Context r14 = r2.f3489a
            T1.Y1 r15 = r2.f3499u
            if (r0 != 0) goto L_0x00bd
            T1.C0212u0.i(r15)
            java.lang.String r0 = r14.getPackageName()
            r15.o()
            com.google.android.gms.common.internal.I.d(r0)
            android.content.pm.PackageManager r9 = r14.getPackageManager()
            java.security.MessageDigest r10 = T1.Y1.z()
            r16 = -1
            java.lang.Object r11 = r15.f398a
            T1.u0 r11 = (T1.C0212u0) r11
            if (r10 != 0) goto L_0x006d
            T1.Z r0 = r11.f3496r
            T1.C0212u0.k(r0)
            java.lang.String r9 = "Could not get MD5 instance"
            T1.X r0 = r0.f3172f
            r0.a(r9)
        L_0x006a:
            r9 = r16
            goto L_0x00bb
        L_0x006d:
            if (r9 == 0) goto L_0x00b9
            boolean r0 = r15.g0(r14, r0)     // Catch:{ NameNotFoundException -> 0x009b }
            if (r0 != 0) goto L_0x00aa
            D0.e r0 = I1.c.a(r14)     // Catch:{ NameNotFoundException -> 0x009b }
            android.content.Context r9 = r11.f3489a     // Catch:{ NameNotFoundException -> 0x009b }
            java.lang.String r9 = r9.getPackageName()     // Catch:{ NameNotFoundException -> 0x009b }
            r12 = 64
            android.content.pm.PackageInfo r0 = r0.i(r12, r9)     // Catch:{ NameNotFoundException -> 0x009b }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x009b }
            if (r0 == 0) goto L_0x009d
            int r9 = r0.length     // Catch:{ NameNotFoundException -> 0x009b }
            if (r9 <= 0) goto L_0x009d
            r0 = r0[r13]     // Catch:{ NameNotFoundException -> 0x009b }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x009b }
            byte[] r0 = r10.digest(r0)     // Catch:{ NameNotFoundException -> 0x009b }
            long r16 = T1.Y1.x0(r0)     // Catch:{ NameNotFoundException -> 0x009b }
            goto L_0x006a
        L_0x009b:
            r0 = move-exception
            goto L_0x00ad
        L_0x009d:
            T1.Z r0 = r11.f3496r     // Catch:{ NameNotFoundException -> 0x009b }
            T1.C0212u0.k(r0)     // Catch:{ NameNotFoundException -> 0x009b }
            T1.X r0 = r0.f3175r     // Catch:{ NameNotFoundException -> 0x009b }
            java.lang.String r9 = "Could not get signatures"
            r0.a(r9)     // Catch:{ NameNotFoundException -> 0x009b }
            goto L_0x006a
        L_0x00aa:
            r16 = 0
            goto L_0x006a
        L_0x00ad:
            T1.Z r9 = r11.f3496r
            T1.C0212u0.k(r9)
            java.lang.String r10 = "Package name not found"
            T1.X r9 = r9.f3172f
            r9.b(r0, r10)
        L_0x00b9:
            r9 = 0
        L_0x00bb:
            r1.f3003q = r9
        L_0x00bd:
            r11 = r9
            boolean r0 = r2.a()
            T1.h0 r9 = r2.f3495q
            T1.C0212u0.i(r9)
            boolean r10 = r9.f3312B
            r13 = 1
            r17 = r10 ^ 1
            r53.o()
            boolean r10 = r2.a()
            T1.g r13 = r2.f3494p
            if (r10 != 0) goto L_0x00dd
            r22 = r0
        L_0x00d9:
            r28 = r11
        L_0x00db:
            r0 = 0
            goto L_0x0144
        L_0x00dd:
            com.google.android.gms.internal.measurement.zzrp.zzb()
            T1.G r10 = T1.H.f2856G0
            r22 = r0
            r0 = 0
            boolean r10 = r13.B(r0, r10)
            T1.Z r0 = r2.f3496r
            if (r10 == 0) goto L_0x00f8
            T1.C0212u0.k(r0)
            java.lang.String r10 = "Disabled IID for tests."
            T1.X r0 = r0.f3180w
            r0.a(r10)
            goto L_0x00d9
        L_0x00f8:
            java.lang.ClassLoader r10 = r14.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00d9 }
            r28 = r11
            java.lang.String r11 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r10 = r10.loadClass(r11)     // Catch:{ ClassNotFoundException -> 0x00db }
            if (r10 != 0) goto L_0x0107
            goto L_0x00db
        L_0x0107:
            java.lang.String r11 = "getInstance"
            java.lang.Class<android.content.Context> r12 = android.content.Context.class
            java.lang.Class[] r12 = new java.lang.Class[]{r12}     // Catch:{ Exception -> 0x0139 }
            java.lang.reflect.Method r11 = r10.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x0139 }
            java.lang.Object[] r12 = new java.lang.Object[]{r14}     // Catch:{ Exception -> 0x0139 }
            r14 = 0
            java.lang.Object r11 = r11.invoke(r14, r12)     // Catch:{ Exception -> 0x0139 }
            if (r11 != 0) goto L_0x0120
            r0 = r14
            goto L_0x0144
        L_0x0120:
            java.lang.String r12 = "getFirebaseInstanceId"
            java.lang.reflect.Method r10 = r10.getDeclaredMethod(r12, r14)     // Catch:{ Exception -> 0x012e }
            java.lang.Object r10 = r10.invoke(r11, r14)     // Catch:{ Exception -> 0x012e }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x012e }
            r0 = r10
            goto L_0x0144
        L_0x012e:
            T1.C0212u0.k(r0)
            java.lang.String r10 = "Failed to retrieve Firebase Instance Id"
            T1.X r0 = r0.f3177t
            r0.a(r10)
            goto L_0x00db
        L_0x0139:
            T1.C0212u0.k(r0)
            java.lang.String r10 = "Failed to obtain Firebase Analytics instance"
            T1.X r0 = r0.f3176s
            r0.a(r10)
            goto L_0x00db
        L_0x0144:
            T1.C0212u0.i(r9)
            T1.g0 r10 = r9.f3322p
            long r10 = r10.a()
            r18 = 0
            int r12 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            r30 = r6
            long r6 = r2.f3488P
            if (r12 != 0) goto L_0x015a
        L_0x0157:
            r32 = r6
            goto L_0x015f
        L_0x015a:
            long r6 = java.lang.Math.min(r6, r10)
            goto L_0x0157
        L_0x015f:
            r53.p()
            int r14 = r1.f3008v
            java.lang.String r6 = "google_analytics_adid_collection_enabled"
            java.lang.Boolean r6 = r13.z(r6)
            if (r6 == 0) goto L_0x0176
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0173
            goto L_0x0176
        L_0x0173:
            r23 = 0
            goto L_0x0178
        L_0x0176:
            r23 = 1
        L_0x0178:
            T1.C0212u0.i(r9)
            r9.o()
            android.content.SharedPreferences r6 = r9.t()
            java.lang.String r7 = "deferred_analytics_collection"
            r10 = 0
            boolean r26 = r6.getBoolean(r7, r10)
            java.lang.String r35 = r53.t()
            java.lang.String r6 = "google_analytics_default_allow_ad_personalization_signals"
            r7 = 1
            T1.G0 r10 = r13.y(r6, r7)
            T1.G0 r7 = T1.G0.GRANTED
            if (r10 == r7) goto L_0x019a
            r10 = 1
            goto L_0x019b
        L_0x019a:
            r10 = 0
        L_0x019b:
            java.lang.Boolean r36 = java.lang.Boolean.valueOf(r10)
            java.util.List r11 = r1.f3006t
            T1.J0 r7 = r9.v()
            java.lang.String r37 = r7.j()
            java.lang.String r7 = r1.f3007u
            if (r7 != 0) goto L_0x01b6
            T1.C0212u0.i(r15)
            java.lang.String r7 = r15.x()
            r1.f3007u = r7
        L_0x01b6:
            java.lang.String r12 = r1.f3007u
            T1.J0 r7 = r9.v()
            T1.I0 r10 = T1.I0.ANALYTICS_STORAGE
            boolean r7 = r7.k(r10)
            if (r7 != 0) goto L_0x01cd
            r39 = r8
            r38 = r11
            r18 = 0
            r40 = 0
            goto L_0x0208
        L_0x01cd:
            r53.o()
            r38 = r11
            long r10 = r1.f3012z
            r18 = 0
            int r7 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r7 != 0) goto L_0x01dd
            r39 = r8
            goto L_0x01fd
        L_0x01dd:
            G1.b r7 = r2.f3501w
            r7.getClass()
            long r10 = java.lang.System.currentTimeMillis()
            r39 = r8
            long r7 = r1.f3012z
            long r10 = r10 - r7
            java.lang.String r7 = r1.f3011y
            if (r7 == 0) goto L_0x01fd
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x01fd
            java.lang.String r7 = r1.f2998A
            if (r7 != 0) goto L_0x01fd
            r53.w()
        L_0x01fd:
            java.lang.String r7 = r1.f3011y
            if (r7 != 0) goto L_0x0204
            r53.w()
        L_0x0204:
            java.lang.String r7 = r1.f3011y
            r40 = r7
        L_0x0208:
            java.lang.String r7 = "google_analytics_sgtm_upload_enabled"
            java.lang.Boolean r7 = r13.z(r7)
            if (r7 != 0) goto L_0x0213
            r43 = 0
            goto L_0x0219
        L_0x0213:
            boolean r7 = r7.booleanValue()
            r43 = r7
        L_0x0219:
            T1.C0212u0.i(r15)
            java.lang.String r7 = r53.u()
            java.lang.Object r8 = r15.f398a
            T1.u0 r8 = (T1.C0212u0) r8
            android.content.Context r10 = r8.f3489a
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            if (r10 != 0) goto L_0x0230
            r45 = r18
            r11 = 0
            goto L_0x0253
        L_0x0230:
            android.content.Context r10 = r8.f3489a     // Catch:{ NameNotFoundException -> 0x0242 }
            D0.e r10 = I1.c.a(r10)     // Catch:{ NameNotFoundException -> 0x0242 }
            r11 = 0
            android.content.pm.ApplicationInfo r10 = r10.h(r11, r7)     // Catch:{ NameNotFoundException -> 0x0243 }
            if (r10 == 0) goto L_0x0240
            int r10 = r10.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x0243 }
            goto L_0x0250
        L_0x0240:
            r10 = r11
            goto L_0x0250
        L_0x0242:
            r11 = 0
        L_0x0243:
            T1.Z r8 = r8.f3496r
            T1.C0212u0.k(r8)
            java.lang.String r10 = "PackageManager failed to find running app: app_id"
            T1.X r8 = r8.f3178u
            r8.b(r7, r10)
            goto L_0x0240
        L_0x0250:
            long r7 = (long) r10
            r45 = r7
        L_0x0253:
            T1.C0212u0.i(r9)
            T1.J0 r7 = r9.v()
            T1.C0212u0.i(r9)
            r9.o()
            android.content.SharedPreferences r8 = r9.t()
            java.lang.String r9 = "dma_consent_settings"
            r10 = 0
            java.lang.String r8 = r8.getString(r9, r10)
            T1.p r8 = T1.C0197p.b(r8)
            java.lang.String r8 = r8.f3426b
            com.google.android.gms.internal.measurement.zzqr.zzb()
            T1.G r9 = T1.H.f2886W0
            boolean r16 = r13.B(r10, r9)
            if (r16 == 0) goto L_0x0295
            T1.C0212u0.i(r15)
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 30
            if (r10 < r11) goto L_0x0291
            int r10 = android.os.ext.SdkExtensions.getExtensionVersion(30)
            r11 = 3
            if (r10 <= r11) goto L_0x0291
            int r10 = android.os.ext.SdkExtensions.getExtensionVersion(1000000)
            goto L_0x0292
        L_0x0291:
            r10 = 0
        L_0x0292:
            r47 = r10
            goto L_0x0297
        L_0x0295:
            r47 = 0
        L_0x0297:
            com.google.android.gms.internal.measurement.zzqr.zzb()
            r10 = 0
            boolean r9 = r13.B(r10, r9)
            if (r9 == 0) goto L_0x02ab
            T1.C0212u0.i(r15)
            long r9 = r15.w0()
            r48 = r9
            goto L_0x02ad
        L_0x02ab:
            r48 = r18
        L_0x02ad:
            java.lang.String r15 = r13.f3293c
            r9 = 1
            T1.G0 r6 = r13.y(r6, r9)
            char r6 = T1.J0.a(r6)
            java.lang.String r50 = java.lang.String.valueOf(r6)
            T1.G r6 = T1.H.f2876R0
            r9 = 0
            boolean r6 = r13.B(r9, r6)
            if (r6 == 0) goto L_0x02d7
            T1.g1 r6 = r2.f3479G
            T1.C0212u0.h(r6)
            T1.g1 r6 = r2.f3479G
            com.google.android.gms.internal.measurement.zzih r6 = r6.s()
            int r6 = r6.zza()
            r51 = r6
            goto L_0x02d9
        L_0x02d7:
            r51 = 0
        L_0x02d9:
            long r9 = r1.f3004r
            r24 = r9
            int r6 = r7.f2971b
            r34 = r6
            r9 = 119002(0x1d0da, double:5.8795E-319)
            r27 = 0
            long r6 = r2.f3488P
            r41 = r6
            r2 = r44
            r6 = r30
            r52 = r8
            r8 = r39
            r31 = r12
            r30 = r38
            r11 = r28
            r13 = r54
            r19 = r14
            r14 = r22
            r39 = r15
            r15 = r17
            r16 = r0
            r17 = r32
            r20 = r23
            r21 = r26
            r22 = r35
            r23 = r36
            r26 = r30
            r28 = r37
            r29 = r31
            r30 = r40
            r31 = r43
            r32 = r45
            r35 = r52
            r36 = r47
            r37 = r48
            r40 = r50
            r43 = r51
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (int) r19, (boolean) r20, (boolean) r21, (java.lang.String) r22, (java.lang.Boolean) r23, (long) r24, (java.util.List) r26, (java.lang.String) r27, (java.lang.String) r28, (java.lang.String) r29, (java.lang.String) r30, (boolean) r31, (long) r32, (int) r34, (java.lang.String) r35, (int) r36, (long) r37, (java.lang.String) r39, (java.lang.String) r40, (long) r41, (int) r43)
            return r44
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.O.s(java.lang.String):T1.Z1");
    }

    public final String t() {
        p();
        if (((C0212u0) this.f398a).f3494p.B((String) null, H.f2935p1)) {
            return null;
        }
        return this.f3010x;
    }

    public final String u() {
        p();
        I.g(this.f2999c);
        return this.f2999c;
    }

    public final String v() {
        o();
        p();
        I.g(this.f3009w);
        return this.f3009w;
    }

    public final void w() {
        String str;
        String str2;
        o();
        C0212u0 u0Var = (C0212u0) this.f398a;
        C0174h0 h0Var = u0Var.f3495q;
        C0212u0.i(h0Var);
        boolean k6 = h0Var.v().k(I0.ANALYTICS_STORAGE);
        Z z3 = u0Var.f3496r;
        if (!k6) {
            C0212u0.k(z3);
            z3.f3179v.a("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            Y1 y12 = u0Var.f3499u;
            C0212u0.i(y12);
            y12.A().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        C0212u0.k(z3);
        if (str == null) {
            str2 = "null";
        } else {
            str2 = "not null";
        }
        z3.f3179v.a("Resetting session stitching token to ".concat(str2));
        this.f3011y = str;
        u0Var.f3501w.getClass();
        this.f3012z = System.currentTimeMillis();
    }
}
