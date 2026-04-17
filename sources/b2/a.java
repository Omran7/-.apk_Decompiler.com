package B2;

import I3.h;
import T1.C0177i0;
import android.view.View;
import c1.i;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.material.behavior.SwipeDismissBehavior;
import f3.C0531h;
import h3.l;
import m0.a0;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f341a;

    /* renamed from: b  reason: collision with root package name */
    public Object f342b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f343c;

    public a(C0177i0 i0Var, zzbr zzbr, C0177i0 i0Var2) {
        this.f341a = 8;
        this.f342b = zzbr;
        this.f343c = i0Var;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [T1.q, T1.E0] */
    /* JADX WARNING: type inference failed for: r0v22, types: [java.lang.Object, D0.d] */
    /* JADX WARNING: type inference failed for: r0v38, types: [T1.E, T1.g1, C0.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0496, code lost:
        if (r4.w0() == 1) goto L_0x049c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c8 A[Catch:{ IllegalStateException -> 0x02e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02c9 A[Catch:{ IllegalStateException -> 0x02e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02d8 A[SYNTHETIC, Splitter:B:109:0x02d8] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02e5 A[Catch:{ IllegalStateException -> 0x02e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0342 A[SYNTHETIC, Splitter:B:133:0x0342] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x05b2  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x05e9  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0605  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0621  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x06f3  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0724  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0757  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x07bf  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x092f  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0996  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0998  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x09ad  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x09e2  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0a53  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x056d A[EDGE_INSN: B:386:0x056d->B:204:0x056d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0197 A[Catch:{ NameNotFoundException -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02ad A[Catch:{ IllegalStateException -> 0x02e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02ae A[Catch:{ IllegalStateException -> 0x02e1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r32 = this;
            r1 = r32
            java.lang.Object r0 = r1.f343c
            r8 = r0
            T1.u0 r8 = (T1.C0212u0) r8
            T1.r0 r0 = r8.f3497s
            T1.C0212u0.k(r0)
            r0.o()
            T1.g r9 = r8.f3494p
            java.lang.Object r0 = r9.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            r0.getClass()
            T1.q r0 = new T1.q
            r0.<init>(r8)
            r0.r()
            r8.f3478E = r0
            java.lang.Object r0 = r1.f342b
            r10 = r0
            T1.N0 r10 = (T1.N0) r10
            com.google.android.gms.internal.measurement.zzdh r0 = r10.g
            if (r0 != 0) goto L_0x002e
            r6 = 0
            goto L_0x0031
        L_0x002e:
            long r2 = r0.zza
            r6 = r2
        L_0x0031:
            T1.O r13 = new T1.O
            long r4 = r10.f2994f
            r2 = r13
            r3 = r8
            r2.<init>(r3, r4, r6)
            r13.q()
            r8.F = r13
            T1.Q r0 = new T1.Q
            r0.<init>(r8)
            r0.q()
            r8.f3476C = r0
            T1.w1 r0 = new T1.w1
            r0.<init>(r8)
            r0.q()
            r8.f3477D = r0
            T1.Y1 r2 = r8.f3499u
            boolean r0 = r2.f2825b
            java.lang.String r3 = "Can't initialize twice"
            if (r0 != 0) goto L_0x0a69
            r2.o()
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            long r4 = r0.nextLong()
            r6 = 0
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 != 0) goto L_0x0085
            long r4 = r0.nextLong()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0085
            java.lang.Object r0 = r2.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.Z r0 = r0.f3496r
            T1.C0212u0.k(r0)
            java.lang.String r6 = "Utils falling back to Random for random id"
            T1.X r0 = r0.f3175r
            r0.a(r6)
        L_0x0085:
            java.util.concurrent.atomic.AtomicLong r0 = r2.d
            r0.set(r4)
            java.lang.Object r0 = r2.f398a
            r4 = r0
            T1.u0 r4 = (T1.C0212u0) r4
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f3487O
            r0.incrementAndGet()
            r5 = 1
            r2.f2825b = r5
            T1.h0 r6 = r8.f3495q
            boolean r0 = r6.f2825b
            if (r0 != 0) goto L_0x0a62
            java.lang.Object r0 = r6.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            android.content.Context r0 = r0.f3489a
            java.lang.String r7 = "com.google.android.gms.measurement.prefs"
            r14 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r7, r14)
            r6.f3319c = r0
            java.lang.String r7 = "has_been_opened"
            boolean r0 = r0.getBoolean(r7, r14)
            r6.f3312B = r0
            if (r0 != 0) goto L_0x00c3
            android.content.SharedPreferences r0 = r6.f3319c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r14 = 1
            r0.putBoolean(r7, r14)
            r0.apply()
        L_0x00c3:
            D0.d r0 = new D0.d
            T1.G r7 = T1.H.d
            r14 = 0
            java.lang.Object r7 = r7.a(r14)
            java.lang.Long r7 = (java.lang.Long) r7
            long r14 = r7.longValue()
            r11 = 0
            long r11 = java.lang.Math.max(r11, r14)
            r0.<init>()
            r0.f492e = r6
            java.lang.String r7 = "health_monitor"
            com.google.android.gms.common.internal.I.d(r7)
            r14 = 0
            int r7 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r7 <= 0) goto L_0x00ea
            r7 = 1
            goto L_0x00eb
        L_0x00ea:
            r7 = 0
        L_0x00eb:
            com.google.android.gms.common.internal.I.b(r7)
            java.lang.String r7 = "health_monitor:start"
            r0.f490b = r7
            java.lang.String r7 = "health_monitor:count"
            r0.f491c = r7
            java.lang.String r7 = "health_monitor:value"
            r0.d = r7
            r0.f489a = r11
            r6.f3321f = r0
            java.lang.Object r0 = r6.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f3487O
            r0.incrementAndGet()
            r6.f2825b = r5
            T1.O r7 = r8.F
            boolean r0 = r7.f2824b
            if (r0 != 0) goto L_0x0a5b
            java.lang.Object r0 = r7.f398a
            r11 = r0
            T1.u0 r11 = (T1.C0212u0) r11
            T1.Z r0 = r11.f3496r
            T1.C0212u0.k(r0)
            long r14 = r7.f3005s
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            long r14 = r7.f3004r
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            T1.X r0 = r0.f3180w
            java.lang.String r15 = "sdkVersion bundled with app, dynamiteVersion"
            r0.c(r15, r12, r14)
            android.content.Context r12 = r11.f3489a
            java.lang.String r14 = r12.getPackageName()
            android.content.pm.PackageManager r15 = r12.getPackageManager()
            T1.Z r5 = r11.f3496r
            java.lang.String r0 = "Unknown"
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            r18 = r0
            java.lang.String r0 = ""
            java.lang.String r19 = "unknown"
            if (r15 != 0) goto L_0x0161
            T1.C0212u0.k(r5)
            T1.Y r1 = T1.Z.w(r14)
            r20 = r3
            java.lang.String r3 = "PackageManager is null, app identity information might be inaccurate. appId"
            r21 = r10
            T1.X r10 = r5.f3172f
            r10.b(r1, r3)
        L_0x0156:
            r22 = r6
            r1 = r17
            r3 = r18
            r10 = r3
        L_0x015d:
            r6 = r19
            goto L_0x01cb
        L_0x0161:
            r20 = r3
            r21 = r10
            java.lang.String r19 = r15.getInstallerPackageName(r14)     // Catch:{ IllegalArgumentException -> 0x016c }
        L_0x0169:
            r1 = r19
            goto L_0x017b
        L_0x016c:
            T1.C0212u0.k(r5)
            T1.Y r1 = T1.Z.w(r14)
            java.lang.String r3 = "Error retrieving app installer package name. appId"
            T1.X r10 = r5.f3172f
            r10.b(r1, r3)
            goto L_0x0169
        L_0x017b:
            if (r1 != 0) goto L_0x0182
            java.lang.String r1 = "manual_install"
        L_0x017f:
            r19 = r1
            goto L_0x018c
        L_0x0182:
            java.lang.String r3 = "com.android.vending"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x017f
            r19 = r0
        L_0x018c:
            java.lang.String r1 = r12.getPackageName()     // Catch:{ NameNotFoundException -> 0x01b4 }
            r3 = 0
            android.content.pm.PackageInfo r1 = r15.getPackageInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x01b4 }
            if (r1 == 0) goto L_0x0156
            android.content.pm.ApplicationInfo r3 = r1.applicationInfo     // Catch:{ NameNotFoundException -> 0x01b4 }
            java.lang.CharSequence r3 = r15.getApplicationLabel(r3)     // Catch:{ NameNotFoundException -> 0x01b4 }
            boolean r10 = android.text.TextUtils.isEmpty(r3)     // Catch:{ NameNotFoundException -> 0x01b4 }
            if (r10 != 0) goto L_0x01a8
            java.lang.String r3 = r3.toString()     // Catch:{ NameNotFoundException -> 0x01b4 }
            goto L_0x01aa
        L_0x01a8:
            r3 = r18
        L_0x01aa:
            java.lang.String r10 = r1.versionName     // Catch:{ NameNotFoundException -> 0x01b6 }
            int r1 = r1.versionCode     // Catch:{ NameNotFoundException -> 0x01b1 }
            r22 = r6
            goto L_0x015d
        L_0x01b1:
            r18 = r10
            goto L_0x01b6
        L_0x01b4:
            r3 = r18
        L_0x01b6:
            T1.C0212u0.k(r5)
            T1.Y r1 = T1.Z.w(r14)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r22 = r6
            T1.X r6 = r5.f3172f
            r6.c(r10, r1, r3)
            r1 = r17
            r10 = r18
            goto L_0x015d
        L_0x01cb:
            r7.f2999c = r14
            r7.f3001f = r6
            r7.d = r10
            r7.f3000e = r1
            r7.f3002p = r3
            r1 = r4
            r3 = 0
            r7.f3003q = r3
            T1.G r3 = T1.H.f2935p1
            T1.g r4 = r11.f3494p
            r6 = 0
            boolean r10 = r4.B(r6, r3)
            if (r10 != 0) goto L_0x0204
            java.lang.String r10 = r11.s()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0204
            r10 = 0
            boolean r18 = r4.B(r10, r3)
            if (r18 == 0) goto L_0x01f8
            r10 = 0
            goto L_0x01fa
        L_0x01f8:
            java.lang.String r10 = r11.f3491c
        L_0x01fa:
            java.lang.String r6 = "am"
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L_0x0204
            r6 = 1
            goto L_0x0205
        L_0x0204:
            r6 = 0
        L_0x0205:
            int r10 = r11.l()
            r19 = r1
            java.lang.String r1 = r11.f3475B
            if (r10 == 0) goto L_0x0289
            r23 = r2
            r2 = 1
            if (r10 == r2) goto L_0x027c
            r2 = 3
            if (r10 == r2) goto L_0x026f
            r2 = 4
            if (r10 == r2) goto L_0x0262
            r2 = 6
            if (r10 == r2) goto L_0x0255
            r2 = 7
            if (r10 == r2) goto L_0x0248
            r2 = 8
            if (r10 == r2) goto L_0x023b
            T1.C0212u0.k(r5)
            java.lang.String r2 = "App measurement disabled"
            r18 = r13
            T1.X r13 = r5.f3178u
            r13.a(r2)
            T1.C0212u0.k(r5)
            java.lang.String r2 = "Invalid scion state in identity"
            T1.X r13 = r5.f3173p
            r13.a(r2)
            goto L_0x0297
        L_0x023b:
            r18 = r13
            T1.C0212u0.k(r5)
            java.lang.String r2 = "App measurement disabled due to denied storage consent"
            T1.X r13 = r5.f3178u
            r13.a(r2)
            goto L_0x0297
        L_0x0248:
            r18 = r13
            T1.C0212u0.k(r5)
            java.lang.String r2 = "App measurement disabled via the global data collection setting"
            T1.X r13 = r5.f3178u
            r13.a(r2)
            goto L_0x0297
        L_0x0255:
            r18 = r13
            T1.C0212u0.k(r5)
            java.lang.String r2 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            T1.X r13 = r5.f3177t
            r13.a(r2)
            goto L_0x0297
        L_0x0262:
            r18 = r13
            T1.C0212u0.k(r5)
            java.lang.String r2 = "App measurement disabled via the manifest"
            T1.X r13 = r5.f3178u
            r13.a(r2)
            goto L_0x0297
        L_0x026f:
            r18 = r13
            T1.C0212u0.k(r5)
            java.lang.String r2 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            T1.X r13 = r5.f3178u
            r13.a(r2)
            goto L_0x0297
        L_0x027c:
            r18 = r13
            T1.C0212u0.k(r5)
            java.lang.String r2 = "App measurement deactivated via the manifest"
            T1.X r13 = r5.f3178u
            r13.a(r2)
            goto L_0x0297
        L_0x0289:
            r23 = r2
            r18 = r13
            T1.C0212u0.k(r5)
            java.lang.String r2 = "App measurement collection enabled"
            T1.X r13 = r5.f3180w
            r13.a(r2)
        L_0x0297:
            r7.f3009w = r0
            r7.f3010x = r0
            if (r6 == 0) goto L_0x02a3
            java.lang.String r2 = r11.s()
            r7.f3010x = r2
        L_0x02a3:
            java.lang.String r2 = T1.K0.h(r12, r1)     // Catch:{ IllegalStateException -> 0x02e1 }
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x02e1 }
            if (r6 == 0) goto L_0x02ae
            goto L_0x02af
        L_0x02ae:
            r0 = r2
        L_0x02af:
            r7.f3009w = r0     // Catch:{ IllegalStateException -> 0x02e1 }
            r6 = 0
            boolean r0 = r4.B(r6, r3)     // Catch:{ IllegalStateException -> 0x02e1 }
            if (r0 != 0) goto L_0x02e3
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x02e1 }
            if (r0 != 0) goto L_0x02e3
            android.content.res.Resources r0 = r12.getResources()     // Catch:{ IllegalStateException -> 0x02e1 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IllegalStateException -> 0x02e1 }
            if (r2 != 0) goto L_0x02c9
            goto L_0x02cd
        L_0x02c9:
            java.lang.String r1 = T1.K0.b(r12)     // Catch:{ IllegalStateException -> 0x02e1 }
        L_0x02cd:
            java.lang.String r2 = "admob_app_id"
            java.lang.String r3 = "string"
            int r1 = r0.getIdentifier(r2, r3, r1)     // Catch:{ IllegalStateException -> 0x02e1 }
            if (r1 != 0) goto L_0x02d8
            goto L_0x02dd
        L_0x02d8:
            java.lang.String r0 = r0.getString(r1)     // Catch:{ NotFoundException -> 0x02dd }
            goto L_0x02de
        L_0x02dd:
            r0 = 0
        L_0x02de:
            r7.f3010x = r0     // Catch:{ IllegalStateException -> 0x02e1 }
            goto L_0x02e3
        L_0x02e1:
            r0 = move-exception
            goto L_0x0300
        L_0x02e3:
            if (r10 != 0) goto L_0x02fe
            T1.C0212u0.k(r5)     // Catch:{ IllegalStateException -> 0x02e1 }
            T1.X r0 = r5.f3180w     // Catch:{ IllegalStateException -> 0x02e1 }
            java.lang.String r1 = "App measurement enabled for app package, google app id"
            java.lang.String r2 = r7.f2999c     // Catch:{ IllegalStateException -> 0x02e1 }
            java.lang.String r3 = r7.f3009w     // Catch:{ IllegalStateException -> 0x02e1 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalStateException -> 0x02e1 }
            if (r3 == 0) goto L_0x02f9
            java.lang.String r3 = r7.f3010x     // Catch:{ IllegalStateException -> 0x02e1 }
            goto L_0x02fb
        L_0x02f9:
            java.lang.String r3 = r7.f3009w     // Catch:{ IllegalStateException -> 0x02e1 }
        L_0x02fb:
            r0.c(r1, r2, r3)     // Catch:{ IllegalStateException -> 0x02e1 }
        L_0x02fe:
            r10 = 0
            goto L_0x030f
        L_0x0300:
            T1.C0212u0.k(r5)
            T1.Y r1 = T1.Z.w(r14)
            java.lang.String r2 = "Fetching Google App Id failed with exception. appId"
            T1.X r3 = r5.f3172f
            r3.c(r2, r1, r0)
            goto L_0x02fe
        L_0x030f:
            r7.f3006t = r10
            r4.getClass()
            java.lang.String r0 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.I.d(r0)
            android.os.Bundle r1 = r4.x()
            java.lang.Object r2 = r4.f398a
            T1.u0 r2 = (T1.C0212u0) r2
            if (r1 != 0) goto L_0x0331
            T1.Z r0 = r2.f3496r
            T1.C0212u0.k(r0)
            java.lang.String r1 = "Failed to load metadata: Metadata bundle is null"
            T1.X r0 = r0.f3172f
            r0.a(r1)
        L_0x032f:
            r0 = r10
            goto L_0x0340
        L_0x0331:
            boolean r3 = r1.containsKey(r0)
            if (r3 != 0) goto L_0x0338
            goto L_0x032f
        L_0x0338:
            int r0 = r1.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0340:
            if (r0 == 0) goto L_0x0352
            android.content.Context r1 = r2.f3489a     // Catch:{ NotFoundException -> 0x0359 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ NotFoundException -> 0x0359 }
            int r0 = r0.intValue()     // Catch:{ NotFoundException -> 0x0359 }
            java.lang.String[] r0 = r1.getStringArray(r0)     // Catch:{ NotFoundException -> 0x0359 }
            if (r0 != 0) goto L_0x0354
        L_0x0352:
            r6 = r10
            goto L_0x0367
        L_0x0354:
            java.util.List r6 = java.util.Arrays.asList(r0)     // Catch:{ NotFoundException -> 0x0359 }
            goto L_0x0367
        L_0x0359:
            r0 = move-exception
            T1.Z r1 = r2.f3496r
            T1.C0212u0.k(r1)
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            T1.X r1 = r1.f3172f
            r1.b(r0, r2)
            goto L_0x0352
        L_0x0367:
            if (r6 != 0) goto L_0x036a
            goto L_0x0399
        L_0x036a:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x037b
            T1.C0212u0.k(r5)
            java.lang.String r0 = "Safelisted event list is empty. Ignoring"
            T1.X r1 = r5.f3177t
            r1.a(r0)
            goto L_0x039b
        L_0x037b:
            java.util.Iterator r0 = r6.iterator()
        L_0x037f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0399
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            T1.Y1 r2 = r11.f3499u
            T1.C0212u0.i(r2)
            java.lang.String r3 = "safelisted event"
            boolean r1 = r2.b0(r3, r1)
            if (r1 != 0) goto L_0x037f
            goto L_0x039b
        L_0x0399:
            r7.f3006t = r6
        L_0x039b:
            if (r15 == 0) goto L_0x03a4
            boolean r0 = I1.b.o0(r12)
            r7.f3008v = r0
            goto L_0x03a7
        L_0x03a4:
            r1 = 0
            r7.f3008v = r1
        L_0x03a7:
            java.lang.Object r0 = r7.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f3487O
            r0.incrementAndGet()
            r1 = 1
            r7.f2824b = r1
            T1.g1 r0 = new T1.g1
            r0.<init>(r8)
            r0.q()
            r8.f3479G = r0
            boolean r1 = r0.f2824b
            if (r1 != 0) goto L_0x0a53
            java.lang.Object r1 = r0.f398a
            T1.u0 r1 = (T1.C0212u0) r1
            android.content.Context r1 = r1.f3489a
            java.lang.String r2 = "jobscheduler"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.app.job.JobScheduler r1 = (android.app.job.JobScheduler) r1
            r0.f3299c = r1
            java.lang.Object r1 = r0.f398a
            T1.u0 r1 = (T1.C0212u0) r1
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f3487O
            r1.incrementAndGet()
            r1 = 1
            r0.f2824b = r1
            T1.Z r0 = r8.f3496r
            T1.C0212u0.k(r0)
            r9.v()
            r1 = 119002(0x1d0da, double:5.8795E-319)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "App measurement initialized, version"
            T1.X r3 = r0.f3178u
            r3.b(r1, r2)
            T1.C0212u0.k(r0)
            java.lang.String r1 = "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"
            r3.a(r1)
            java.lang.String r1 = r18.u()
            java.lang.String r2 = r8.f3490b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x042b
            java.lang.String r2 = r9.f3293c
            r4 = r23
            boolean r2 = r4.e0(r1, r2)
            if (r2 == 0) goto L_0x041a
            T1.C0212u0.k(r0)
            java.lang.String r1 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."
            r3.a(r1)
            goto L_0x042d
        L_0x041a:
            T1.C0212u0.k(r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "
            java.lang.String r1 = r2.concat(r1)
            r3.a(r1)
            goto L_0x042d
        L_0x042b:
            r4 = r23
        L_0x042d:
            T1.C0212u0.k(r0)
            java.lang.String r1 = "Debug-level message logging enabled"
            T1.X r2 = r0.f3179v
            r2.a(r1)
            int r1 = r8.f3485M
            java.util.concurrent.atomic.AtomicInteger r5 = r8.f3487O
            int r6 = r5.get()
            T1.X r7 = r0.f3172f
            if (r1 == r6) goto L_0x0459
            T1.C0212u0.k(r0)
            int r1 = r8.f3485M
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r5 = r5.get()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Not all components initialized"
            r7.c(r6, r1, r5)
        L_0x0459:
            r1 = 1
            r8.f3480H = r1
            T1.r0 r1 = r8.f3497s
            T1.C0212u0.k(r1)
            r1.o()
            T1.G r1 = T1.H.f2876R0
            r5 = 0
            boolean r6 = r9.B(r5, r1)
            r10 = 0
            if (r6 == 0) goto L_0x047f
            T1.g1 r6 = r8.f3479G
            T1.C0212u0.h(r6)
            T1.g1 r6 = r8.f3479G
            com.google.android.gms.internal.measurement.zzih r6 = r6.s()
            com.google.android.gms.internal.measurement.zzih r11 = com.google.android.gms.internal.measurement.zzih.CLIENT_UPLOAD_ELIGIBLE
            if (r6 != r11) goto L_0x047f
            r6 = 1
            goto L_0x0480
        L_0x047f:
            r6 = r10
        L_0x0480:
            com.google.android.gms.internal.measurement.zzqr.zzb()
            T1.G r11 = T1.H.f2886W0
            boolean r11 = r9.B(r5, r11)
            r12 = 1
            if (r11 == 0) goto L_0x0499
            r4.o()
            long r14 = r4.w0()
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 != 0) goto L_0x0499
            goto L_0x049c
        L_0x0499:
            if (r6 == 0) goto L_0x04e8
            r6 = 1
        L_0x049c:
            r4.o()
            android.content.IntentFilter r11 = new android.content.IntentFilter
            r11.<init>()
            java.lang.String r14 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            r11.addAction(r14)
            r14 = r19
            T1.g r15 = r14.f3494p
            boolean r1 = r15.B(r5, r1)
            if (r1 == 0) goto L_0x04b8
            java.lang.String r1 = "com.google.android.gms.measurement.BATCHES_AVAILABLE"
            r11.addAction(r1)
        L_0x04b8:
            I3.j r1 = new I3.j
            r1.<init>((T1.C0212u0) r14)
            android.content.Context r15 = r14.f3489a
            r12 = 2
            A.h.registerReceiver(r15, r1, r11, r12)
            T1.Z r1 = r14.f3496r
            T1.C0212u0.k(r1)
            java.lang.String r11 = "Registered app receiver"
            T1.X r1 = r1.f3179v
            r1.a(r11)
            if (r6 == 0) goto L_0x04ea
            T1.g1 r1 = r8.f3479G
            T1.C0212u0.h(r1)
            T1.g1 r1 = r8.f3479G
            T1.G r6 = T1.H.f2848C
            java.lang.Object r6 = r6.a(r5)
            java.lang.Long r6 = (java.lang.Long) r6
            long r11 = r6.longValue()
            r1.t(r11)
            goto L_0x04ea
        L_0x04e8:
            r14 = r19
        L_0x04ea:
            T1.J0 r1 = r22.v()
            java.lang.String r6 = "google_analytics_default_allow_ad_storage"
            T1.G0 r6 = r9.y(r6, r10)
            java.lang.String r11 = "google_analytics_default_allow_analytics_storage"
            T1.G0 r11 = r9.y(r11, r10)
            T1.G0 r12 = T1.G0.UNINITIALIZED
            T1.I0 r13 = T1.I0.ANALYTICS_STORAGE
            r15 = r21
            com.google.android.gms.internal.measurement.zzdh r15 = r15.g
            java.lang.String r10 = "consent_source"
            java.lang.Class<T1.I0> r5 = T1.I0.class
            r21 = r14
            T1.b1 r14 = r8.f3503y
            r30 = r3
            if (r6 != r12) goto L_0x0514
            if (r11 == r12) goto L_0x0511
            goto L_0x0514
        L_0x0511:
            r31 = r7
            goto L_0x053d
        L_0x0514:
            android.content.SharedPreferences r3 = r22.t()
            r31 = r7
            r7 = 100
            int r3 = r3.getInt(r10, r7)
            r7 = -10
            boolean r3 = T1.J0.l(r7, r3)
            if (r3 == 0) goto L_0x053d
            java.util.EnumMap r3 = new java.util.EnumMap
            r3.<init>(r5)
            T1.I0 r10 = T1.I0.AD_STORAGE
            r3.put(r10, r6)
            r3.put(r13, r11)
            T1.J0 r6 = new T1.J0
            r6.<init>(r3, r7)
            r3 = r6
            goto L_0x05ba
        L_0x053d:
            T1.O r3 = r8.n()
            java.lang.String r3 = r3.v()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x056f
            int r3 = r1.f2971b
            if (r3 == 0) goto L_0x055f
            r6 = 30
            if (r3 == r6) goto L_0x055f
            r7 = 10
            if (r3 == r7) goto L_0x055f
            if (r3 == r6) goto L_0x055f
            if (r3 == r6) goto L_0x055f
            r6 = 40
            if (r3 != r6) goto L_0x056f
        L_0x055f:
            T1.C0212u0.j(r14)
            T1.J0 r3 = new T1.J0
            r6 = -10
            r3.<init>(r6)
            r6 = 0
            r14.H(r3, r6)
        L_0x056d:
            r3 = 0
            goto L_0x05ba
        L_0x056f:
            T1.G r3 = T1.H.f2935p1
            r6 = 0
            boolean r3 = r9.B(r6, r3)
            if (r3 != 0) goto L_0x056d
            T1.O r3 = r8.n()
            java.lang.String r3 = r3.v()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x056d
            if (r15 == 0) goto L_0x056d
            android.os.Bundle r3 = r15.zzg
            if (r3 == 0) goto L_0x056d
            android.content.SharedPreferences r6 = r22.t()
            r7 = 100
            int r6 = r6.getInt(r10, r7)
            r7 = 30
            boolean r6 = T1.J0.l(r7, r6)
            if (r6 == 0) goto L_0x056d
            T1.J0 r3 = T1.J0.d(r7, r3)
            java.util.EnumMap r6 = r3.f2970a
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L_0x05ac:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x056d
            java.lang.Object r7 = r6.next()
            T1.G0 r7 = (T1.G0) r7
            if (r7 == r12) goto L_0x05ac
        L_0x05ba:
            if (r3 == 0) goto L_0x05c4
            T1.C0212u0.j(r14)
            r1 = 1
            r14.H(r3, r1)
            r1 = r3
        L_0x05c4:
            T1.C0212u0.j(r14)
            r14.G(r1)
            r22.o()
            android.content.SharedPreferences r1 = r22.t()
            java.lang.String r3 = "dma_consent_settings"
            r6 = 0
            java.lang.String r1 = r1.getString(r3, r6)
            T1.p r1 = T1.C0197p.b(r1)
            int r1 = r1.f3425a
            java.lang.String r3 = "google_analytics_default_allow_ad_personalization_signals"
            r6 = 1
            T1.G0 r3 = r9.y(r3, r6)
            T1.X r7 = r0.f3180w
            if (r3 == r12) goto L_0x05f1
            T1.C0212u0.k(r0)
            java.lang.String r10 = "Default ad personalization consent from Manifest"
            r7.b(r3, r10)
        L_0x05f1:
            java.lang.String r3 = "google_analytics_default_allow_ad_user_data"
            T1.G0 r3 = r9.y(r3, r6)
            java.lang.Object r6 = r14.f398a
            T1.u0 r6 = (T1.C0212u0) r6
            if (r3 == r12) goto L_0x0621
            r10 = -10
            boolean r11 = T1.J0.l(r10, r1)
            if (r11 == 0) goto L_0x0621
            T1.C0212u0.j(r14)
            java.util.EnumMap r1 = new java.util.EnumMap
            r1.<init>(r5)
            T1.I0 r5 = T1.I0.AD_USER_DATA
            r1.put(r5, r3)
            T1.p r3 = new T1.p
            r5 = 0
            r3.<init>((java.util.EnumMap) r1, (int) r10, (java.lang.Boolean) r5, (java.lang.String) r5)
            r1 = 1
            r14.F(r3, r1)
        L_0x061c:
            r3 = r22
        L_0x061e:
            r1 = 0
            goto L_0x06c6
        L_0x0621:
            T1.O r3 = r8.n()
            java.lang.String r3 = r3.v()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0645
            if (r1 == 0) goto L_0x0635
            r3 = 30
            if (r1 != r3) goto L_0x0645
        L_0x0635:
            T1.C0212u0.j(r14)
            T1.p r1 = new T1.p
            r3 = 0
            r5 = -10
            r1.<init>((java.lang.Boolean) r3, (int) r5, (java.lang.Boolean) r3, (java.lang.String) r3)
            r3 = 1
            r14.F(r1, r3)
            goto L_0x061c
        L_0x0645:
            T1.O r3 = r8.n()
            java.lang.String r3 = r3.v()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0684
            if (r15 == 0) goto L_0x0684
            android.os.Bundle r3 = r15.zzg
            if (r3 == 0) goto L_0x0684
            r5 = 30
            boolean r1 = T1.J0.l(r5, r1)
            if (r1 == 0) goto L_0x0684
            T1.p r1 = T1.C0197p.a(r5, r3)
            java.util.EnumMap r3 = r1.f3428e
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L_0x066f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0684
            java.lang.Object r5 = r3.next()
            T1.G0 r5 = (T1.G0) r5
            if (r5 == r12) goto L_0x066f
            T1.C0212u0.j(r14)
            r3 = 1
            r14.F(r1, r3)
        L_0x0684:
            T1.O r1 = r8.n()
            java.lang.String r1 = r1.v()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x061c
            if (r15 == 0) goto L_0x061c
            android.os.Bundle r1 = r15.zzg
            if (r1 == 0) goto L_0x061c
            r3 = r22
            S3.r r5 = r3.f3329w
            java.lang.String r5 = r5.C()
            if (r5 != 0) goto L_0x061e
            java.lang.Boolean r1 = T1.C0197p.d(r1)
            if (r1 == 0) goto L_0x061e
            T1.C0212u0.j(r14)
            java.lang.String r5 = r15.zze
            java.lang.String r26 = r1.toString()
            G1.b r1 = r6.f3501w
            r1.getClass()
            long r28 = java.lang.System.currentTimeMillis()
            java.lang.String r25 = "allow_personalized_ads"
            r23 = r14
            r24 = r5
            r1 = 0
            r27 = r1
            r23.I(r24, r25, r26, r27, r28)
        L_0x06c6:
            java.lang.String r5 = "google_analytics_tcf_data_enabled"
            java.lang.Boolean r5 = r9.z(r5)
            if (r5 != 0) goto L_0x06cf
            goto L_0x06d5
        L_0x06cf:
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0716
        L_0x06d5:
            T1.C0212u0.k(r0)
            java.lang.String r5 = "TCF client enabled."
            r2.a(r5)
            T1.C0212u0.j(r14)
            r14.o()
            T1.Z r2 = r6.f3496r
            T1.C0212u0.k(r2)
            java.lang.String r5 = "Register tcfPrefChangeListener."
            T1.X r2 = r2.f3179v
            r2.a(r5)
            T1.U0 r2 = r14.f3242D
            if (r2 != 0) goto L_0x0702
            T1.V0 r2 = new T1.V0
            r5 = 2
            r2.<init>(r14, r6, r5)
            r14.f3243E = r2
            T1.U0 r2 = new T1.U0
            r2.<init>(r14)
            r14.f3242D = r2
        L_0x0702:
            T1.h0 r2 = r6.f3495q
            T1.C0212u0.i(r2)
            android.content.SharedPreferences r2 = r2.s()
            T1.U0 r5 = r14.f3242D
            r2.registerOnSharedPreferenceChangeListener(r5)
            T1.C0212u0.j(r14)
            r14.x()
        L_0x0716:
            T1.g0 r2 = r3.f3322p
            long r10 = r2.a()
            r15 = 0
            int r5 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            long r10 = r8.f3488P
            if (r5 != 0) goto L_0x0733
            T1.C0212u0.k(r0)
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            java.lang.String r12 = "Persisting first open"
            r7.b(r5, r12)
            r2.b(r10)
        L_0x0733:
            T1.C0212u0.j(r14)
            T1.s0 r5 = r14.f3239A
            boolean r12 = r5.c()
            if (r12 == 0) goto L_0x0751
            boolean r12 = r5.d()
            if (r12 == 0) goto L_0x0751
            T1.u0 r5 = r5.f3464a
            T1.h0 r5 = r5.f3495q
            T1.C0212u0.i(r5)
            S3.r r5 = r5.f3316G
            r12 = 0
            r5.D(r12)
        L_0x0751:
            boolean r5 = r8.e()
            if (r5 != 0) goto L_0x07bf
            boolean r1 = r8.a()
            if (r1 == 0) goto L_0x07b8
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r4.d0(r1)
            if (r1 != 0) goto L_0x0770
            T1.C0212u0.k(r0)
            java.lang.String r1 = "App is missing INTERNET permission"
            r2 = r31
            r2.a(r1)
            goto L_0x0772
        L_0x0770:
            r2 = r31
        L_0x0772:
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r4.d0(r1)
            if (r1 != 0) goto L_0x0782
            T1.C0212u0.k(r0)
            java.lang.String r1 = "App is missing ACCESS_NETWORK_STATE permission"
            r2.a(r1)
        L_0x0782:
            android.content.Context r1 = r8.f3489a
            D0.e r5 = I1.c.a(r1)
            boolean r5 = r5.j()
            if (r5 != 0) goto L_0x07b0
            boolean r5 = r9.r()
            if (r5 != 0) goto L_0x07b0
            boolean r5 = T1.Y1.k0(r1)
            if (r5 != 0) goto L_0x07a2
            T1.C0212u0.k(r0)
            java.lang.String r5 = "AppMeasurementReceiver not registered/enabled"
            r2.a(r5)
        L_0x07a2:
            boolean r1 = T1.Y1.l0(r1)
            if (r1 != 0) goto L_0x07b0
            T1.C0212u0.k(r0)
            java.lang.String r1 = "AppMeasurementService not registered/enabled"
            r2.a(r1)
        L_0x07b0:
            T1.C0212u0.k(r0)
            java.lang.String r1 = "Uploading is not possible. App measurement disabled"
            r2.a(r1)
        L_0x07b8:
            r20 = r6
            r16 = r7
            r2 = r14
            goto L_0x09d6
        L_0x07bf:
            T1.O r5 = r8.n()
            java.lang.String r5 = r5.v()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            S3.r r15 = r3.f3323q
            if (r5 == 0) goto L_0x07f1
            T1.G r5 = T1.H.f2935p1
            r1 = 0
            boolean r5 = r9.B(r1, r5)
            if (r5 != 0) goto L_0x07e7
            T1.O r5 = r8.n()
            java.lang.String r5 = r5.t()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x07e7
            goto L_0x07f2
        L_0x07e7:
            r20 = r6
            r16 = r7
            r24 = r13
            r22 = r14
            goto L_0x0923
        L_0x07f1:
            r1 = 0
        L_0x07f2:
            T1.G r5 = T1.H.f2935p1
            boolean r16 = r9.B(r1, r5)
            java.lang.String r12 = "admob_app_id"
            java.lang.String r1 = "gmp_app_id"
            if (r16 == 0) goto L_0x0835
            T1.O r16 = r8.n()
            r20 = r6
            java.lang.String r6 = r16.v()
            r3.o()
            r16 = r7
            android.content.SharedPreferences r7 = r3.t()
            r22 = r14
            r14 = 0
            java.lang.String r7 = r7.getString(r1, r14)
            boolean r14 = android.text.TextUtils.isEmpty(r6)
            boolean r23 = android.text.TextUtils.isEmpty(r7)
            if (r14 != 0) goto L_0x082f
            if (r23 != 0) goto L_0x082f
            com.google.android.gms.common.internal.I.g(r6)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x082f
            r6 = 1
            goto L_0x0830
        L_0x082f:
            r6 = 0
        L_0x0830:
            r25 = r5
            r24 = r13
            goto L_0x086b
        L_0x0835:
            r20 = r6
            r16 = r7
            r22 = r14
            T1.O r6 = r8.n()
            java.lang.String r6 = r6.v()
            r3.o()
            android.content.SharedPreferences r7 = r3.t()
            r14 = 0
            java.lang.String r7 = r7.getString(r1, r14)
            T1.O r19 = r8.n()
            java.lang.String r14 = r19.t()
            r3.o()
            r24 = r13
            android.content.SharedPreferences r13 = r3.t()
            r25 = r5
            r5 = 0
            java.lang.String r13 = r13.getString(r12, r5)
            boolean r6 = r4.m0(r6, r7, r14, r13)
        L_0x086b:
            if (r6 == 0) goto L_0x08d6
            T1.C0212u0.k(r0)
            java.lang.String r5 = "Rechecking which service to use due to a GMP App Id change"
            r6 = r30
            r6.a(r5)
            r3.o()
            r3.o()
            android.content.SharedPreferences r5 = r3.t()
            java.lang.String r6 = "measurement_enabled"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0897
            android.content.SharedPreferences r5 = r3.t()
            r7 = 1
            boolean r5 = r5.getBoolean(r6, r7)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L_0x0898
        L_0x0897:
            r5 = 0
        L_0x0898:
            android.content.SharedPreferences r7 = r3.t()
            android.content.SharedPreferences$Editor r7 = r7.edit()
            r7.clear()
            r7.apply()
            if (r5 == 0) goto L_0x08bd
            r3.o()
            android.content.SharedPreferences r7 = r3.t()
            android.content.SharedPreferences$Editor r7 = r7.edit()
            boolean r5 = r5.booleanValue()
            r7.putBoolean(r6, r5)
            r7.apply()
        L_0x08bd:
            T1.Q r5 = r8.o()
            r5.t()
            T1.w1 r5 = r8.f3477D
            r5.t()
            T1.w1 r5 = r8.f3477D
            r5.s()
            r2.b(r10)
            r2 = 0
            r15.D(r2)
            goto L_0x08d7
        L_0x08d6:
            r2 = 0
        L_0x08d7:
            T1.O r5 = r8.n()
            java.lang.String r5 = r5.v()
            r3.o()
            android.content.SharedPreferences r6 = r3.t()
            android.content.SharedPreferences$Editor r6 = r6.edit()
            r6.putString(r1, r5)
            r6.apply()
            r1 = r25
            boolean r1 = r9.B(r2, r1)
            if (r1 == 0) goto L_0x090a
            r3.o()
            android.content.SharedPreferences r1 = r3.t()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r12, r2)
            r1.apply()
            goto L_0x0923
        L_0x090a:
            T1.O r1 = r8.n()
            java.lang.String r1 = r1.t()
            r3.o()
            android.content.SharedPreferences r2 = r3.t()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.putString(r12, r1)
            r2.apply()
        L_0x0923:
            T1.J0 r1 = r3.v()
            r2 = r24
            boolean r1 = r1.k(r2)
            if (r1 != 0) goto L_0x0933
            r1 = 0
            r15.D(r1)
        L_0x0933:
            T1.C0212u0.j(r22)
            java.lang.String r1 = r15.C()
            r2 = r22
            java.util.concurrent.atomic.AtomicReference r5 = r2.f3247p
            r5.set(r1)
            r1 = r21
            android.content.Context r1 = r1.f3489a     // Catch:{ ClassNotFoundException -> 0x0950 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0950 }
            java.lang.String r5 = "com.google.firebase.remoteconfig.FirebaseRemoteConfig"
            r1.loadClass(r5)     // Catch:{ ClassNotFoundException -> 0x0950 }
        L_0x094e:
            r5 = 0
            goto L_0x096a
        L_0x0950:
            S3.r r1 = r3.F
            java.lang.String r5 = r1.C()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x094e
            T1.C0212u0.k(r0)
            java.lang.String r5 = "Remote config removed with active feature rollouts"
            T1.X r6 = r0.f3175r
            r6.a(r5)
            r5 = 0
            r1.D(r5)
        L_0x096a:
            T1.O r1 = r8.n()
            java.lang.String r1 = r1.v()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x098e
            T1.G r1 = T1.H.f2935p1
            boolean r1 = r9.B(r5, r1)
            if (r1 != 0) goto L_0x09d6
            T1.O r1 = r8.n()
            java.lang.String r1 = r1.t()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x09d6
        L_0x098e:
            boolean r1 = r8.a()
            android.content.SharedPreferences r5 = r3.f3319c
            if (r5 != 0) goto L_0x0998
            r10 = 0
            goto L_0x099e
        L_0x0998:
            java.lang.String r6 = "deferred_analytics_collection"
            boolean r10 = r5.contains(r6)
        L_0x099e:
            if (r10 != 0) goto L_0x09ab
            boolean r5 = r9.p()
            if (r5 != 0) goto L_0x09ab
            r5 = r1 ^ 1
            r3.w(r5)
        L_0x09ab:
            if (r1 == 0) goto L_0x09b3
            T1.C0212u0.j(r2)
            r2.t()
        L_0x09b3:
            T1.E1 r1 = r8.f3498t
            T1.C0212u0.j(r1)
            T1.A r1 = r1.f2827e
            r1.t()
            T1.w1 r1 = r8.r()
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference
            r5.<init>()
            r1.u(r5)
            T1.w1 r1 = r8.r()
            S3.z r5 = r3.f3318I
            android.os.Bundle r5 = r5.J()
            r1.x(r5)
        L_0x09d6:
            com.google.android.gms.internal.measurement.zzqr.zzb()
            T1.G r1 = T1.H.f2886W0
            r5 = 0
            boolean r1 = r9.B(r5, r1)
            if (r1 == 0) goto L_0x0a4c
            r4.o()
            long r6 = r4.w0()
            r9 = 1
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x09f1
            r1 = 1
            goto L_0x09f2
        L_0x09f1:
            r1 = 0
        L_0x09f2:
            if (r1 == 0) goto L_0x0a4c
            T1.G r1 = T1.H.f2950w0
            java.lang.Object r1 = r1.a(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r4 = (long) r1
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r6 = 5000(0x1388, float:7.006E-42)
            int r1 = r1.nextInt(r6)
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            long r6 = (long) r1
            long r4 = r4 + r6
            G1.b r1 = r8.f3501w
            r1.getClass()
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r6
            r6 = 500(0x1f4, double:2.47E-321)
            long r4 = java.lang.Math.max(r6, r4)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0a33
            T1.C0212u0.k(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.String r1 = "Waiting to fetch trigger URIs until some time after boot. Delay in millis"
            r6 = r16
            r6.b(r0, r1)
        L_0x0a33:
            T1.C0212u0.j(r2)
            r2.o()
            T1.V0 r0 = r2.f3252u
            if (r0 != 0) goto L_0x0a47
            T1.V0 r0 = new T1.V0
            r1 = 0
            r6 = r20
            r0.<init>(r2, r6, r1)
            r2.f3252u = r0
        L_0x0a47:
            T1.V0 r0 = r2.f3252u
            r0.c(r4)
        L_0x0a4c:
            T1.f0 r0 = r3.f3331y
            r1 = 1
            r0.a(r1)
            return
        L_0x0a53:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r20
            r0.<init>(r1)
            throw r0
        L_0x0a5b:
            r1 = r3
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0a62:
            r1 = r3
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0a69:
            r1 = r3
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.a.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        ((java.lang.Runnable) r10.f342b).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        h3.l.f8145f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f342b), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r10.f343c     // Catch:{ all -> 0x005e }
            h3.l r2 = (h3.l) r2     // Catch:{ all -> 0x005e }
            java.util.ArrayDeque r2 = r2.f8147b     // Catch:{ all -> 0x005e }
            monitor-enter(r2)     // Catch:{ all -> 0x005e }
            r3 = 1
            if (r0 != 0) goto L_0x002c
            java.lang.Object r0 = r10.f343c     // Catch:{ all -> 0x0020 }
            h3.l r0 = (h3.l) r0     // Catch:{ all -> 0x0020 }
            int r4 = r0.f8148c     // Catch:{ all -> 0x0020 }
            r5 = 4
            if (r4 != r5) goto L_0x0022
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x001f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x001f:
            return
        L_0x0020:
            r0 = move-exception
            goto L_0x0083
        L_0x0022:
            long r6 = r0.d     // Catch:{ all -> 0x0020 }
            r8 = 1
            long r6 = r6 + r8
            r0.d = r6     // Catch:{ all -> 0x0020 }
            r0.f8148c = r5     // Catch:{ all -> 0x0020 }
            r0 = r3
        L_0x002c:
            java.lang.Object r4 = r10.f343c     // Catch:{ all -> 0x0020 }
            h3.l r4 = (h3.l) r4     // Catch:{ all -> 0x0020 }
            java.util.ArrayDeque r4 = r4.f8147b     // Catch:{ all -> 0x0020 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x0020 }
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch:{ all -> 0x0020 }
            r10.f342b = r4     // Catch:{ all -> 0x0020 }
            if (r4 != 0) goto L_0x004d
            java.lang.Object r0 = r10.f343c     // Catch:{ all -> 0x0020 }
            h3.l r0 = (h3.l) r0     // Catch:{ all -> 0x0020 }
            r0.f8148c = r3     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x004c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x004c:
            return
        L_0x004d:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x005e }
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f342b     // Catch:{ RuntimeException -> 0x0062 }
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ RuntimeException -> 0x0062 }
            r3.run()     // Catch:{ RuntimeException -> 0x0062 }
        L_0x005b:
            r10.f342b = r2     // Catch:{ all -> 0x005e }
            goto L_0x0002
        L_0x005e:
            r0 = move-exception
            goto L_0x0085
        L_0x0060:
            r0 = move-exception
            goto L_0x0080
        L_0x0062:
            r3 = move-exception
            java.util.logging.Logger r4 = h3.l.f8145f     // Catch:{ all -> 0x0060 }
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x0060 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r6.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch:{ all -> 0x0060 }
            java.lang.Object r7 = r10.f342b     // Catch:{ all -> 0x0060 }
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch:{ all -> 0x0060 }
            r6.append(r7)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0060 }
            r4.log(r5, r6, r3)     // Catch:{ all -> 0x0060 }
            goto L_0x005b
        L_0x0080:
            r10.f342b = r2     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x0083:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x0085:
            if (r1 == 0) goto L_0x008e
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x008e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.a.b():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v98, types: [S3.r, i3.f] */
    /* JADX WARNING: type inference failed for: r10v2, types: [n3.l, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x045e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r1 = r19
            r2 = 0
            r0 = 7
            r5 = 0
            r6 = 0
            r7 = 1
            int r8 = r1.f341a
            switch(r8) {
                case 0: goto L_0x063e;
                case 1: goto L_0x0604;
                case 2: goto L_0x05f8;
                case 3: goto L_0x05e6;
                case 4: goto L_0x05dc;
                case 5: goto L_0x05d0;
                case 6: goto L_0x05a7;
                case 7: goto L_0x057f;
                case 8: goto L_0x052b;
                case 9: goto L_0x0527;
                case 10: goto L_0x04ec;
                case 11: goto L_0x04c5;
                case 12: goto L_0x0472;
                case 13: goto L_0x03ef;
                case 14: goto L_0x03e3;
                case 15: goto L_0x0349;
                case 16: goto L_0x0325;
                case 17: goto L_0x02cd;
                case 18: goto L_0x02bf;
                case 19: goto L_0x0276;
                case 20: goto L_0x025d;
                case 21: goto L_0x0237;
                case 22: goto L_0x021f;
                case 23: goto L_0x01eb;
                case 24: goto L_0x01c8;
                case 25: goto L_0x01bc;
                case 26: goto L_0x0181;
                case 27: goto L_0x015a;
                case 28: goto L_0x0142;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.Object r2 = r1.f343c
            i3.f r2 = (i3.C0590f) r2
            java.lang.Object r3 = r2.f2694b
            n3.m r3 = (n3.m) r3
            c1.i r8 = r3.f10304i
            boolean r9 = r8.y()
            java.lang.Object r2 = r2.f2695c
            r11 = r2
            n3.g r11 = (n3.C0866g) r11
            java.lang.String r2 = "transaction: "
            if (r9 == 0) goto L_0x0035
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r2)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r8.d(r9, r5, r10)
        L_0x0035:
            c1.i r9 = r3.f10306k
            boolean r9 = r9.y()
            if (r9 == 0) goto L_0x004e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r2)
            r9.append(r11)
            java.lang.String r2 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r8.d(r2, r5, r9)
        L_0x004e:
            i3.f r2 = new i3.f
            r2.<init>((n3.m) r3, (n3.C0866g) r11)
            androidx.fragment.app.D r9 = new androidx.fragment.app.D
            r10 = 22
            r9.<init>((int) r10)
            n3.D r10 = new n3.D
            s3.g r12 = r2.l()
            r10.<init>(r3, r9, r12)
            r3.e(r10)
            n3.l r10 = new n3.l
            long r12 = r3.f10310o
            r14 = 1
            long r4 = r12 + r14
            r3.f10310o = r4
            r10.<init>()
            r10.f10288a = r11
            java.lang.Object r4 = r1.f342b
            i3.p r4 = (i3.p) r4
            r10.f10289b = r4
            r10.f10290c = r9
            r10.d = r7
            r10.f10293p = r6
            r5 = 1
            r10.f10292f = r5
            r10.f10291e = r12
            r7 = 0
            r10.f10294q = r7
            r10.f10296s = r7
            r10.f10297t = r7
            r10.f10298u = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            n3.y r9 = r3.f10309n
            v3.s r7 = r9.h(r11, r7)
            if (r7 != 0) goto L_0x009e
            v3.k r7 = v3.k.f12295e
        L_0x009e:
            r10.f10296s = r7
            i3.k r9 = new i3.k
            k.m r12 = new k.m
            r12.<init>(r7, r0)
            n3.g r0 = new n3.g
            java.lang.String r7 = ""
            r0.<init>((java.lang.String) r7)
            r9.<init>(r12, r0)
            B0.H r0 = r4.f(r9)     // Catch:{ all -> 0x00b7 }
            r7 = 0
            goto L_0x00cb
        L_0x00b7:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Caught Throwable."
            r8.g(r0, r7)
            i3.d r0 = i3.C0588d.a(r7)
            B0.H r7 = R2.b.a()
            r18 = r7
            r7 = r0
            r0 = r18
        L_0x00cb:
            boolean r8 = r0.f200b
            if (r8 != 0) goto L_0x00e8
            r8 = 0
            r10.f10297t = r8
            r10.f10298u = r8
            v3.s r0 = r10.f10296s
            v3.m r0 = v3.m.t(r0)
            i3.c r5 = new i3.c
            r5.<init>(r2, r0)
            n3.i r0 = new n3.i
            r0.<init>(r4, r7, r5, r6)
            r3.j(r0)
            goto L_0x0141
        L_0x00e8:
            r2 = 2
            r10.d = r2
            c1.i r2 = r3.f10303f
            c1.i r2 = r2.J(r11)
            java.lang.Object r4 = r2.d
            q3.j r4 = (q3.j) r4
            java.util.List r4 = r4.f11098b
            if (r4 != 0) goto L_0x00fe
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x00fe:
            r4.add(r10)
            java.lang.Object r6 = r2.d
            q3.j r6 = (q3.j) r6
            r6.f11098b = r4
            r2.N()
            com.mtma.criminal.city.utils.l r2 = r3.f10300b
            java.util.HashMap r2 = R2.b.A(r2)
            v3.s r4 = r10.f10296s
            java.lang.Object r0 = r0.f201c
            r12 = r0
            v3.s r12 = (v3.s) r12
            n3.F r0 = new n3.F
            r0.<init>(r4)
            v3.s r13 = R2.b.I0(r12, r0, r2)
            r10.f10297t = r12
            r10.f10298u = r13
            long r6 = r3.f10307l
            long r14 = r14 + r6
            r3.f10307l = r14
            r10.f10295r = r6
            n3.y r10 = r3.f10309n
            r17 = 0
            r14 = r6
            r16 = r5
            java.util.List r0 = r10.g(r11, r12, r13, r14, r16, r17)
            r3.k(r0)
            c1.i r0 = r3.f10303f
            r3.l(r0)
            r3.p(r0)
        L_0x0141:
            return
        L_0x0142:
            r19.b()     // Catch:{ Error -> 0x0146 }
            return
        L_0x0146:
            r0 = move-exception
            r2 = r0
            java.lang.Object r0 = r1.f343c
            h3.l r0 = (h3.l) r0
            java.util.ArrayDeque r3 = r0.f8147b
            monitor-enter(r3)
            java.lang.Object r0 = r1.f343c     // Catch:{ all -> 0x0157 }
            h3.l r0 = (h3.l) r0     // Catch:{ all -> 0x0157 }
            r0.f8148c = r7     // Catch:{ all -> 0x0157 }
            monitor-exit(r3)     // Catch:{ all -> 0x0157 }
            throw r2
        L_0x0157:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0157 }
            throw r0
        L_0x015a:
            java.lang.Object r0 = r1.f342b
            java.lang.String r0 = (java.lang.String) r0
            R2.i r0 = R2.i.f(r0)
            com.google.firebase.auth.FirebaseAuth r0 = com.google.firebase.auth.FirebaseAuth.getInstance(r0)
            e3.m r2 = r0.f6866f
            if (r2 == 0) goto L_0x0180
            com.google.android.gms.tasks.Task r0 = r0.c(r2, r7)
            C1.a r2 = f3.C0531h.f7938f
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r4 = "Token refreshing started"
            r2.e(r4, r3)
            com.mtma.criminal.city.utils.w r2 = new com.mtma.criminal.city.utils.w
            r3 = 2
            r2.<init>(r1, r3)
            r0.addOnFailureListener(r2)
        L_0x0180:
            return
        L_0x0181:
            java.lang.Object r0 = r1.f342b
            com.google.firebase.auth.FirebaseAuth r0 = (com.google.firebase.auth.FirebaseAuth) r0
            java.util.concurrent.CopyOnWriteArrayList r2 = r0.f6864c
            java.util.Iterator r2 = r2.iterator()
        L_0x018b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01aa
            java.lang.Object r3 = r2.next()
            j3.f r3 = (j3.f) r3
            B.m r4 = new B.m
            n3.A r5 = r3.f8831b
            java.lang.Object r6 = r1.f343c
            P3.b r6 = (P3.b) r6
            r7 = 17
            r4.<init>(r5, r6, r7)
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r3.f8830a
            r3.execute(r4)
            goto L_0x018b
        L_0x01aa:
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f6863b
            java.util.Iterator r0 = r0.iterator()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L_0x01b7
            return
        L_0x01b7:
            java.lang.ClassCastException r0 = o3.d.e(r0)
            throw r0
        L_0x01bc:
            java.lang.Object r0 = r1.f342b
            e3.f r0 = (e3.C0498f) r0
            java.lang.Object r2 = r1.f343c
            com.google.firebase.auth.FirebaseAuth r2 = (com.google.firebase.auth.FirebaseAuth) r2
            r0.a(r2)
            return
        L_0x01c8:
            java.lang.Object r0 = r1.f343c
            com.google.firebase.storage.q r0 = (com.google.firebase.storage.q) r0
            f3.a r2 = r0.f6958n
            java.lang.String r2 = com.bumptech.glide.d.g0(r2)
            b3.b r3 = r0.f6959o
            java.lang.String r3 = com.bumptech.glide.d.f0(r3)
            com.google.firebase.storage.f r0 = r0.f6955k
            com.google.firebase.storage.c r0 = r0.f6923b
            R2.i r0 = r0.f6915a
            r0.b()
            java.lang.Object r4 = r1.f342b
            W3.e r4 = (W3.e) r4
            android.content.Context r0 = r0.f2490a
            r4.m(r0, r2, r3)
            return
        L_0x01eb:
            I0.w r0 = I0.w.a()
            r0.getClass()
            U0.o.a()
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.d
            r0.set(r7)
            java.lang.Object r0 = r1.f343c
            com.bumptech.glide.manager.d r0 = (com.bumptech.glide.manager.d) r0
            com.bumptech.glide.manager.e r0 = r0.f5830b
            r0.f5832b = r7
            java.lang.Object r0 = r1.f343c
            com.bumptech.glide.manager.d r0 = (com.bumptech.glide.manager.d) r0
            android.view.View r0 = r0.f5829a
            java.lang.Object r2 = r1.f342b
            com.bumptech.glide.manager.d r2 = (com.bumptech.glide.manager.d) r2
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnDrawListener(r2)
            java.lang.Object r0 = r1.f343c
            com.bumptech.glide.manager.d r0 = (com.bumptech.glide.manager.d) r0
            com.bumptech.glide.manager.e r0 = r0.f5830b
            java.util.Set r0 = r0.f5831a
            r0.clear()
            return
        L_0x021f:
            java.lang.Object r0 = r1.f343c
            com.google.android.material.behavior.SwipeDismissBehavior r0 = (com.google.android.material.behavior.SwipeDismissBehavior) r0
            U.e r0 = r0.f6284a
            if (r0 == 0) goto L_0x0236
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0236
            java.util.WeakHashMap r0 = K.O.f1352a
            java.lang.Object r0 = r1.f342b
            android.view.View r0 = (android.view.View) r0
            r0.postOnAnimation(r1)
        L_0x0236:
            return
        L_0x0237:
            java.lang.Object r0 = r1.f342b
            T1.T1 r0 = (T1.T1) r0
            r0.j()
            T1.r0 r2 = r0.f()
            r2.o()
            java.util.ArrayList r2 = r0.f3074y
            if (r2 != 0) goto L_0x0250
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f3074y = r2
        L_0x0250:
            java.util.ArrayList r2 = r0.f3074y
            java.lang.Object r3 = r1.f343c
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.add(r3)
            r0.X()
            return
        L_0x025d:
            java.lang.String r0 = "FA"
            java.lang.String r2 = "[sgtm] AppMeasurementJobService processed last Scion upload request."
            android.util.Log.v(r0, r2)
            java.lang.Object r0 = r1.f342b
            S3.t r0 = (S3.t) r0
            java.lang.Object r0 = r0.f2700b
            android.app.Service r0 = (android.app.Service) r0
            T1.z1 r0 = (T1.C0228z1) r0
            java.lang.Object r2 = r1.f343c
            android.app.job.JobParameters r2 = (android.app.job.JobParameters) r2
            r0.c(r2)
            return
        L_0x0276:
            java.lang.Object r2 = r1.f343c
            T1.v1 r2 = (T1.C0216v1) r2
            T1.w1 r2 = r2.f3518c
            r3 = 0
            r2.d = r3
            java.lang.Object r4 = r2.f398a
            T1.u0 r4 = (T1.C0212u0) r4
            T1.g r4 = r4.f3494p
            T1.G r5 = T1.H.f2932o1
            boolean r4 = r4.B(r3, r5)
            if (r4 == 0) goto L_0x02bb
            java.lang.Object r3 = r1.f342b
            z1.b r3 = (z1.C1132b) r3
            int r3 = r3.f12801b
            r4 = 7777(0x1e61, float:1.0898E-41)
            if (r3 != r4) goto L_0x02bb
            java.util.concurrent.ScheduledExecutorService r3 = r2.f3528p
            if (r3 != 0) goto L_0x02a1
            java.util.concurrent.ScheduledExecutorService r3 = java.util.concurrent.Executors.newScheduledThreadPool(r7)
            r2.f3528p = r3
        L_0x02a1:
            java.util.concurrent.ScheduledExecutorService r2 = r2.f3528p
            B0.c r3 = new B0.c
            r3.<init>((java.lang.Object) r1, (int) r0)
            T1.G r0 = T1.H.f2888Y
            r4 = 0
            java.lang.Object r0 = r0.a(r4)
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.schedule(r3, r4, r0)
            goto L_0x02be
        L_0x02bb:
            r2.D()
        L_0x02be:
            return
        L_0x02bf:
            java.lang.Object r0 = r1.f343c
            T1.v1 r0 = (T1.C0216v1) r0
            T1.w1 r0 = r0.f3518c
            java.lang.Object r2 = r1.f342b
            android.content.ComponentName r2 = (android.content.ComponentName) r2
            T1.C0219w1.H(r0, r2)
            return
        L_0x02cd:
            java.lang.Object r0 = r1.f343c
            r2 = r0
            T1.w1 r2 = (T1.C0219w1) r2
            T1.J r3 = r2.d
            java.lang.Object r0 = r2.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            if (r3 != 0) goto L_0x02e7
            T1.Z r0 = r0.f3496r
            T1.C0212u0.k(r0)
            java.lang.String r2 = "Failed to send current screen to service"
            T1.X r0 = r0.f3172f
            r0.a(r2)
            goto L_0x0324
        L_0x02e7:
            java.lang.Object r4 = r1.f342b     // Catch:{ RemoteException -> 0x02fb }
            T1.j1 r4 = (T1.C0181j1) r4     // Catch:{ RemoteException -> 0x02fb }
            if (r4 != 0) goto L_0x02fd
            android.content.Context r0 = r0.f3489a     // Catch:{ RemoteException -> 0x02fb }
            java.lang.String r8 = r0.getPackageName()     // Catch:{ RemoteException -> 0x02fb }
            r4 = 0
            r6 = 0
            r7 = 0
            r3.y(r4, r6, r7, r8)     // Catch:{ RemoteException -> 0x02fb }
            goto L_0x0310
        L_0x02fb:
            r0 = move-exception
            goto L_0x0314
        L_0x02fd:
            long r5 = r4.f3357c     // Catch:{ RemoteException -> 0x02fb }
            java.lang.String r7 = r4.f3355a     // Catch:{ RemoteException -> 0x02fb }
            java.lang.String r8 = r4.f3356b     // Catch:{ RemoteException -> 0x02fb }
            android.content.Context r0 = r0.f3489a     // Catch:{ RemoteException -> 0x02fb }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ RemoteException -> 0x02fb }
            r4 = r5
            r6 = r7
            r7 = r8
            r8 = r0
            r3.y(r4, r6, r7, r8)     // Catch:{ RemoteException -> 0x02fb }
        L_0x0310:
            r2.E()     // Catch:{ RemoteException -> 0x02fb }
            goto L_0x0324
        L_0x0314:
            java.lang.Object r2 = r2.f398a
            T1.u0 r2 = (T1.C0212u0) r2
            T1.Z r2 = r2.f3496r
            T1.C0212u0.k(r2)
            java.lang.String r3 = "Failed to send current screen to the service"
            T1.X r2 = r2.f3172f
            r2.b(r0, r3)
        L_0x0324:
            return
        L_0x0325:
            java.lang.Object r0 = r1.f343c
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            T1.u0 r0 = r0.f6266a
            T1.b1 r0 = r0.f3503y
            T1.C0212u0.j(r0)
            java.lang.Object r2 = r1.f342b
            I3.h r2 = (I3.h) r2
            r0.o()
            r0.p()
            T1.L0 r3 = r0.d
            if (r2 == r3) goto L_0x0346
            if (r3 != 0) goto L_0x0341
            r6 = r7
        L_0x0341:
            java.lang.String r3 = "EventInterceptor already set."
            com.google.android.gms.common.internal.I.i(r3, r6)
        L_0x0346:
            r0.d = r2
            return
        L_0x0349:
            java.lang.Object r0 = r1.f343c
            T1.b1 r0 = (T1.C0157b1) r0
            java.lang.Object r2 = r0.f398a
            T1.u0 r2 = (T1.C0212u0) r2
            T1.h0 r3 = r2.f3495q
            T1.C0212u0.i(r3)
            r3.o()
            r3.o()
            android.content.SharedPreferences r4 = r3.t()
            java.lang.String r5 = "dma_consent_settings"
            r8 = 0
            java.lang.String r4 = r4.getString(r5, r8)
            T1.p r4 = T1.C0197p.b(r4)
            java.lang.Object r8 = r1.f342b
            T1.p r8 = (T1.C0197p) r8
            int r4 = r4.f3425a
            int r9 = r8.f3425a
            boolean r4 = T1.J0.l(r9, r4)
            T1.Z r2 = r2.f3496r
            if (r4 == 0) goto L_0x03d4
            android.content.SharedPreferences r3 = r3.t()
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r4 = r8.f3426b
            r3.putString(r5, r4)
            r3.apply()
            T1.C0212u0.k(r2)
            java.lang.String r3 = "Setting DMA consent(FE)"
            T1.X r2 = r2.f3180w
            r2.b(r8, r3)
            java.lang.Object r0 = r0.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.w1 r2 = r0.r()
            boolean r2 = r2.A()
            if (r2 == 0) goto L_0x03b6
            T1.w1 r0 = r0.r()
            r0.o()
            r0.p()
            T1.n1 r2 = new T1.n1
            r2.<init>(r0, r7)
            r0.F(r2)
            goto L_0x03e2
        L_0x03b6:
            T1.w1 r0 = r0.r()
            r0.o()
            r0.p()
            boolean r2 = r0.z()
            if (r2 == 0) goto L_0x03e2
            T1.Z1 r2 = r0.C(r6)
            T1.s1 r3 = new T1.s1
            r4 = 4
            r3.<init>(r0, r2, r4)
            r0.F(r3)
            goto L_0x03e2
        L_0x03d4:
            T1.C0212u0.k(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.String r3 = "Lower precedence consent source ignored, proposed source"
            T1.X r2 = r2.f3178u
            r2.b(r0, r3)
        L_0x03e2:
            return
        L_0x03e3:
            java.lang.Object r0 = r1.f343c
            T1.b1 r0 = (T1.C0157b1) r0
            java.lang.Object r2 = r1.f342b
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r0.K(r2, r7)
            return
        L_0x03ef:
            java.lang.Object r0 = r1.f343c
            T1.b1 r0 = (T1.C0157b1) r0
            java.lang.Object r4 = r0.f398a
            T1.u0 r4 = (T1.C0212u0) r4
            T1.E1 r4 = r4.f3498t
            T1.C0212u0.j(r4)
            java.lang.Object r4 = r4.f398a
            T1.u0 r4 = (T1.C0212u0) r4
            T1.h0 r5 = r4.f3495q
            T1.C0212u0.i(r5)
            T1.J0 r5 = r5.v()
            T1.I0 r6 = T1.I0.ANALYTICS_STORAGE
            boolean r5 = r5.k(r6)
            if (r5 != 0) goto L_0x041f
            T1.Z r2 = r4.f3496r
            T1.C0212u0.k(r2)
            java.lang.String r3 = "Analytics storage consent denied; will not get session id"
            T1.X r2 = r2.f3177t
            r2.a(r3)
        L_0x041d:
            r7 = 0
            goto L_0x0446
        L_0x041f:
            T1.h0 r5 = r4.f3495q
            T1.C0212u0.i(r5)
            G1.b r4 = r4.f3501w
            r4.getClass()
            long r6 = java.lang.System.currentTimeMillis()
            boolean r4 = r5.x(r6)
            if (r4 != 0) goto L_0x041d
            T1.g0 r4 = r5.f3311A
            long r5 = r4.a()
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x043e
            goto L_0x041d
        L_0x043e:
            long r2 = r4.a()
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
        L_0x0446:
            java.lang.Object r0 = r0.f398a
            r2 = r0
            T1.u0 r2 = (T1.C0212u0) r2
            java.lang.Object r0 = r1.f342b
            com.google.android.gms.internal.measurement.zzcy r0 = (com.google.android.gms.internal.measurement.zzcy) r0
            if (r7 == 0) goto L_0x045e
            T1.Y1 r2 = r2.f3499u
            T1.C0212u0.i(r2)
            long r3 = r7.longValue()
            r2.P(r0, r3)
            goto L_0x0471
        L_0x045e:
            r3 = 0
            r0.zze(r3)     // Catch:{ RemoteException -> 0x0463 }
            goto L_0x0471
        L_0x0463:
            r0 = move-exception
            r3 = r0
            T1.Z r0 = r2.f3496r
            T1.C0212u0.k(r0)
            java.lang.String r2 = "getSessionId failed with exception"
            T1.X r0 = r0.f3172f
            r0.b(r3, r2)
        L_0x0471:
            return
        L_0x0472:
            java.lang.Object r0 = r1.f342b
            T1.b1 r0 = (T1.C0157b1) r0
            r0.o()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 >= r3) goto L_0x0480
            goto L_0x04c4
        L_0x0480:
            java.lang.Object r2 = r0.f398a
            T1.u0 r2 = (T1.C0212u0) r2
            T1.h0 r2 = r2.f3495q
            T1.C0212u0.i(r2)
            android.util.SparseArray r2 = r2.u()
            java.lang.Object r3 = r1.f343c
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0495:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04c1
            java.lang.Object r4 = r3.next()
            T1.I1 r4 = (T1.I1) r4
            int r5 = r4.f2968c
            boolean r6 = r2.contains(r5)
            if (r6 == 0) goto L_0x04b9
            java.lang.Object r5 = r2.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r7 = r4.f2967b
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0495
        L_0x04b9:
            java.util.PriorityQueue r5 = r0.M()
            r5.add(r4)
            goto L_0x0495
        L_0x04c1:
            r0.C()
        L_0x04c4:
            return
        L_0x04c5:
            java.lang.Object r0 = r1.f342b
            T1.b1 r0 = (T1.C0157b1) r0
            java.lang.Object r0 = r0.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.O r2 = r0.n()
            java.lang.String r3 = r2.f2998A
            java.lang.Object r4 = r1.f343c
            java.lang.String r4 = (java.lang.String) r4
            if (r3 == 0) goto L_0x04e0
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x04e0
            r6 = r7
        L_0x04e0:
            r2.f2998A = r4
            if (r6 == 0) goto L_0x04eb
            T1.O r0 = r0.n()
            r0.w()
        L_0x04eb:
            return
        L_0x04ec:
            java.lang.Object r0 = r1.f343c
            T1.D0 r0 = (T1.D0) r0
            T1.T1 r2 = r0.f2818a
            r2.j()
            java.lang.Object r2 = r1.f342b
            T1.e r2 = (T1.C0164e) r2
            T1.W1 r3 = r2.f3273c
            java.lang.Object r3 = r3.v()
            T1.T1 r0 = r0.f2818a
            if (r3 != 0) goto L_0x0515
            r0.getClass()
            java.lang.String r3 = r2.f3271a
            com.google.android.gms.common.internal.I.g(r3)
            T1.Z1 r3 = r0.z(r3)
            if (r3 == 0) goto L_0x0526
            r0.P(r2, r3)
            goto L_0x0526
        L_0x0515:
            r0.getClass()
            java.lang.String r3 = r2.f3271a
            com.google.android.gms.common.internal.I.g(r3)
            T1.Z1 r3 = r0.z(r3)
            if (r3 == 0) goto L_0x0526
            r0.U(r2, r3)
        L_0x0526:
            return
        L_0x0527:
            r19.a()
            return
        L_0x052b:
            java.lang.Object r0 = r1.f343c
            T1.i0 r0 = (T1.C0177i0) r0
            java.lang.String r2 = r0.f3339a
            T1.j0 r0 = r0.f3340b
            T1.u0 r3 = r0.f3354b
            T1.r0 r0 = r3.f3497s
            T1.C0212u0.k(r0)
            r0.o()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r4 = "package_name"
            r0.putString(r4, r2)
            java.lang.Object r2 = r1.f342b
            com.google.android.gms.internal.measurement.zzbr r2 = (com.google.android.gms.internal.measurement.zzbr) r2
            android.os.Bundle r0 = r2.zze(r0)     // Catch:{ Exception -> 0x055e }
            if (r0 != 0) goto L_0x056f
            T1.Z r0 = r3.f3496r     // Catch:{ Exception -> 0x055e }
            T1.C0212u0.k(r0)     // Catch:{ Exception -> 0x055e }
            T1.X r0 = r0.f3172f     // Catch:{ Exception -> 0x055e }
            java.lang.String r2 = "Install Referrer Service returned a null response"
            r0.a(r2)     // Catch:{ Exception -> 0x055e }
            goto L_0x056f
        L_0x055e:
            r0 = move-exception
            T1.Z r2 = r3.f3496r
            T1.C0212u0.k(r2)
            java.lang.String r0 = r0.getMessage()
            T1.X r2 = r2.f3172f
            java.lang.String r4 = "Exception occurred while retrieving the Install Referrer"
            r2.b(r0, r4)
        L_0x056f:
            T1.r0 r0 = r3.f3497s
            T1.C0212u0.k(r0)
            r0.o()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unexpected call on client side"
            r0.<init>(r2)
            throw r0
        L_0x057f:
            java.lang.Object r0 = r1.f342b
            T1.F0 r0 = (T1.F0) r0
            r0.b()
            boolean r4 = s2.e.n()
            if (r4 == 0) goto L_0x0594
            T1.r0 r0 = r0.f()
            r0.y(r1)
            goto L_0x05a6
        L_0x0594:
            java.lang.Object r0 = r1.f343c
            T1.o r0 = (T1.C0194o) r0
            long r4 = r0.f3415c
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x059f
            r6 = r7
        L_0x059f:
            r0.f3415c = r2
            if (r6 == 0) goto L_0x05a6
            r0.b()
        L_0x05a6:
            return
        L_0x05a7:
            java.lang.Object r0 = r1.f342b     // Catch:{ all -> 0x05af }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x05af }
            r0.run()     // Catch:{ all -> 0x05af }
            goto L_0x05b5
        L_0x05af:
            r0 = move-exception
            o5.j r2 = o5.j.f10479a
            G5.F.k(r2, r0)
        L_0x05b5:
            java.lang.Object r0 = r1.f343c
            I5.i r0 = (I5.i) r0
            java.lang.Runnable r2 = r0.l()
            if (r2 != 0) goto L_0x05c0
            goto L_0x05cf
        L_0x05c0:
            r1.f342b = r2
            int r6 = r6 + r7
            r2 = 16
            if (r6 < r2) goto L_0x05a7
            K5.l r2 = r0.f1261c
            r2.getClass()
            r2.j(r0, r1)
        L_0x05cf:
            return
        L_0x05d0:
            java.lang.Object r0 = r1.f342b
            G5.l r0 = (G5.C0040l) r0
            java.lang.Object r2 = r1.f343c
            H5.e r2 = (H5.e) r2
            r0.A(r2)
            return
        L_0x05dc:
            java.lang.Object r0 = r1.f342b
            H.e r0 = (H.e) r0
            java.lang.Object r2 = r1.f343c
            r0.accept(r2)
            return
        L_0x05e6:
            java.lang.Object r0 = r1.f342b
            x1.i r0 = (x1.i) r0
            java.lang.Object r0 = r0.f12553b
            B.b r0 = (B.b) r0
            if (r0 == 0) goto L_0x05f7
            java.lang.Object r2 = r1.f343c
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            r0.h(r2)
        L_0x05f7:
            return
        L_0x05f8:
            java.lang.Object r0 = r1.f343c
            G5.l r0 = (G5.C0040l) r0
            java.lang.Object r2 = r1.f342b
            G5.a0 r2 = (G5.C0020a0) r2
            r0.A(r2)
            return
        L_0x0604:
            java.lang.Object r0 = r1.f343c
            r2 = r0
            E0.c r2 = (E0.c) r2
            boolean r0 = r2.d
            if (r0 == 0) goto L_0x0621
            android.os.StrictMode$ThreadPolicy$Builder r0 = new android.os.StrictMode$ThreadPolicy$Builder
            r0.<init>()
            android.os.StrictMode$ThreadPolicy$Builder r0 = r0.detectNetwork()
            android.os.StrictMode$ThreadPolicy$Builder r0 = r0.penaltyDeath()
            android.os.StrictMode$ThreadPolicy r0 = r0.build()
            android.os.StrictMode.setThreadPolicy(r0)
        L_0x0621:
            java.lang.Object r0 = r1.f342b     // Catch:{ all -> 0x0629 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0629 }
            r0.run()     // Catch:{ all -> 0x0629 }
            goto L_0x063d
        L_0x0629:
            r0 = move-exception
            E0.d r2 = r2.f581c
            r2.getClass()
            r2 = 6
            java.lang.String r3 = "GlideExecutor"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L_0x063d
            java.lang.String r2 = "Request threw uncaught throwable"
            android.util.Log.e(r3, r2, r0)
        L_0x063d:
            return
        L_0x063e:
            java.lang.Object r0 = r1.f343c
            r2 = r0
            I3.h r2 = (I3.h) r2
            java.lang.Object r0 = r1.f342b
            B2.b r0 = (B2.b) r0
            android.support.v4.media.session.a.I(r0)     // Catch:{ ExecutionException -> 0x0679, RuntimeException -> 0x0674, Error -> 0x0672 }
            java.lang.Object r0 = r2.f1180c
            T1.b1 r0 = (T1.C0157b1) r0
            r0.o()
            r2.M()
            r0.f3249r = r6
            r0.f3250s = r7
            java.lang.Object r3 = r0.f398a
            T1.u0 r3 = (T1.C0212u0) r3
            T1.Z r3 = r3.f3496r
            T1.C0212u0.k(r3)
            java.lang.Object r2 = r2.f1179b
            T1.I1 r2 = (T1.I1) r2
            T1.X r3 = r3.f3179v
            java.lang.String r4 = "Successfully registered trigger URI"
            java.lang.String r2 = r2.f2966a
            r3.b(r2, r4)
            r0.C()
            goto L_0x0682
        L_0x0672:
            r0 = move-exception
            goto L_0x0675
        L_0x0674:
            r0 = move-exception
        L_0x0675:
            r2.z(r0)
            goto L_0x0682
        L_0x0679:
            r0 = move-exception
            r3 = r0
            java.lang.Throwable r0 = r3.getCause()
            r2.z(r0)
        L_0x0682:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.a.run():void");
    }

    public String toString() {
        String str;
        switch (this.f341a) {
            case 0:
                i iVar = new i(a.class.getSimpleName());
                a0 a0Var = new a0(24);
                ((a0) iVar.d).f9926c = a0Var;
                iVar.d = a0Var;
                a0Var.f9925b = (h) this.f343c;
                return iVar.toString();
            case 28:
                Runnable runnable = (Runnable) this.f342b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i2 = ((l) this.f343c).f8148c;
                if (i2 == 1) {
                    str = "IDLE";
                } else if (i2 == 2) {
                    str = "QUEUING";
                } else if (i2 == 3) {
                    str = "QUEUED";
                } else if (i2 != 4) {
                    str = "null";
                } else {
                    str = "RUNNING";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, int i2) {
        this.f341a = i2;
        this.f342b = obj;
        this.f343c = obj2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i2, boolean z3) {
        this.f341a = i2;
        this.f343c = obj;
        this.f342b = obj2;
    }

    public a(C0531h hVar, String str) {
        this.f341a = 27;
        this.f343c = hVar;
        I.d(str);
        this.f342b = str;
    }

    public a(l lVar) {
        this.f341a = 28;
        this.f343c = lVar;
    }

    public a(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z3) {
        this.f341a = 22;
        this.f343c = swipeDismissBehavior;
        this.f342b = view;
    }
}
