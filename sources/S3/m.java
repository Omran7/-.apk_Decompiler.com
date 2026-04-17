package S3;

import R2.i;
import T1.A1;
import T1.C0157b1;
import T1.C0181j1;
import T1.C0190m1;
import T1.C0203r0;
import T1.C0212u0;
import T1.C0217w;
import T1.E1;
import T1.S0;
import T2.a;
import T2.b;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.zzdj;
import java.util.ArrayDeque;
import java.util.Objects;

public final class m implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2685a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2686b;

    public m(C0157b1 b1Var) {
        this.f2685a = 1;
        this.f2686b = b1Var;
    }

    public void a(Intent intent) {
        boolean z3;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f2686b;
                    if (!arrayDeque.contains(string)) {
                        arrayDeque.add(string);
                    } else {
                        return;
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e6) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e6);
        }
        if (bundle == null) {
            z3 = false;
        } else {
            z3 = "1".equals(bundle.getString("google.c.a.e"));
        }
        if (z3) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    a aVar = (a) i.e().c(a.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (aVar != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        b bVar = (b) aVar;
                        if (!U2.a.f3705b.contains("fcm")) {
                            bVar.f3558a.f2601a.zzP("fcm", "_ln", string2, true);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        bVar.a(bundle2, "_cmp");
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            c.d0(bundle, "_no");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048 A[Catch:{ RuntimeException -> 0x002a, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0082 A[Catch:{ RuntimeException -> 0x002a, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085 A[Catch:{ RuntimeException -> 0x002a, all -> 0x0027 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(com.google.android.gms.internal.measurement.zzdj r10, android.os.Bundle r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f2686b
            T1.b1 r0 = (T1.C0157b1) r0
            java.lang.Object r0 = r0.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.Z r1 = r0.f3496r     // Catch:{ RuntimeException -> 0x002a }
            T1.C0212u0.k(r1)     // Catch:{ RuntimeException -> 0x002a }
            T1.X r1 = r1.f3180w     // Catch:{ RuntimeException -> 0x002a }
            java.lang.String r2 = "onActivityCreated"
            r1.a(r2)     // Catch:{ RuntimeException -> 0x002a }
            android.content.Intent r1 = r10.zzc     // Catch:{ RuntimeException -> 0x002a }
            if (r1 == 0) goto L_0x0097
            android.net.Uri r2 = r1.getData()     // Catch:{ RuntimeException -> 0x002a }
            if (r2 == 0) goto L_0x002d
            boolean r3 = r2.isHierarchical()     // Catch:{ RuntimeException -> 0x002a }
            if (r3 != 0) goto L_0x0025
            goto L_0x002d
        L_0x0025:
            r5 = r2
            goto L_0x0046
        L_0x0027:
            r1 = move-exception
            goto L_0x00b5
        L_0x002a:
            r1 = move-exception
            goto L_0x00a0
        L_0x002d:
            android.os.Bundle r2 = r1.getExtras()     // Catch:{ RuntimeException -> 0x002a }
            r3 = 0
            if (r2 == 0) goto L_0x0045
            java.lang.String r4 = "com.android.vending.referral_url"
            java.lang.String r2 = r2.getString(r4)     // Catch:{ RuntimeException -> 0x002a }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ RuntimeException -> 0x002a }
            if (r4 != 0) goto L_0x0045
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ RuntimeException -> 0x002a }
            goto L_0x0025
        L_0x0045:
            r5 = r3
        L_0x0046:
            if (r5 == 0) goto L_0x0097
            boolean r2 = r5.isHierarchical()     // Catch:{ RuntimeException -> 0x002a }
            if (r2 != 0) goto L_0x004f
            goto L_0x0097
        L_0x004f:
            T1.Y1 r2 = r0.f3499u     // Catch:{ RuntimeException -> 0x002a }
            T1.C0212u0.i(r2)     // Catch:{ RuntimeException -> 0x002a }
            java.lang.String r2 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch:{ RuntimeException -> 0x002a }
            java.lang.String r2 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r2 = r2.equals(r1)     // Catch:{ RuntimeException -> 0x002a }
            if (r2 != 0) goto L_0x0077
            java.lang.String r2 = "https://www.google.com"
            boolean r2 = r2.equals(r1)     // Catch:{ RuntimeException -> 0x002a }
            if (r2 != 0) goto L_0x0077
            java.lang.String r2 = "android-app://com.google.appcrawler"
            boolean r1 = r2.equals(r1)     // Catch:{ RuntimeException -> 0x002a }
            if (r1 == 0) goto L_0x0073
            goto L_0x0077
        L_0x0073:
            java.lang.String r1 = "auto"
        L_0x0075:
            r6 = r1
            goto L_0x007a
        L_0x0077:
            java.lang.String r1 = "gs"
            goto L_0x0075
        L_0x007a:
            java.lang.String r1 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r1)     // Catch:{ RuntimeException -> 0x002a }
            if (r11 != 0) goto L_0x0085
            r1 = 1
        L_0x0083:
            r4 = r1
            goto L_0x0087
        L_0x0085:
            r1 = 0
            goto L_0x0083
        L_0x0087:
            T1.r0 r1 = r0.f3497s     // Catch:{ RuntimeException -> 0x002a }
            T1.C0212u0.k(r1)     // Catch:{ RuntimeException -> 0x002a }
            T1.Z0 r8 = new T1.Z0     // Catch:{ RuntimeException -> 0x002a }
            r2 = r8
            r3 = r9
            r2.<init>((S3.m) r3, (boolean) r4, (android.net.Uri) r5, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ RuntimeException -> 0x002a }
            r1.y(r8)     // Catch:{ RuntimeException -> 0x002a }
            goto L_0x00ac
        L_0x0097:
            T1.m1 r0 = r0.f3502x
            T1.C0212u0.j(r0)
            r0.x(r10, r11)
            return
        L_0x00a0:
            T1.Z r2 = r0.f3496r     // Catch:{ all -> 0x0027 }
            T1.C0212u0.k(r2)     // Catch:{ all -> 0x0027 }
            T1.X r2 = r2.f3172f     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.b(r1, r3)     // Catch:{ all -> 0x0027 }
        L_0x00ac:
            T1.m1 r0 = r0.f3502x
            T1.C0212u0.j(r0)
            r0.x(r10, r11)
            return
        L_0x00b5:
            T1.m1 r0 = r0.f3502x
            T1.C0212u0.j(r0)
            r0.x(r10, r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.m.j(com.google.android.gms.internal.measurement.zzdj, android.os.Bundle):void");
    }

    public void k(zzdj zzdj) {
        C0190m1 m1Var = ((C0212u0) ((C0157b1) this.f2686b).f398a).f3502x;
        C0212u0.j(m1Var);
        synchronized (m1Var.f3388u) {
            try {
                if (Objects.equals(m1Var.f3383p, zzdj)) {
                    m1Var.f3383p = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (((C0212u0) m1Var.f398a).f3494p.C()) {
            m1Var.f3382f.remove(Integer.valueOf(zzdj.zza));
        }
    }

    public void l(zzdj zzdj) {
        C0212u0 u0Var = (C0212u0) ((C0157b1) this.f2686b).f398a;
        C0190m1 m1Var = u0Var.f3502x;
        C0212u0.j(m1Var);
        synchronized (m1Var.f3388u) {
            m1Var.f3387t = false;
            m1Var.f3384q = true;
        }
        C0212u0 u0Var2 = (C0212u0) m1Var.f398a;
        u0Var2.f3501w.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!u0Var2.f3494p.C()) {
            m1Var.f3380c = null;
            C0203r0 r0Var = u0Var2.f3497s;
            C0212u0.k(r0Var);
            r0Var.y(new C0217w(m1Var, elapsedRealtime, 1));
        } else {
            C0181j1 y6 = m1Var.y(zzdj);
            m1Var.d = m1Var.f3380c;
            m1Var.f3380c = null;
            C0203r0 r0Var2 = u0Var2.f3497s;
            C0212u0.k(r0Var2);
            r0Var2.y(new S0(m1Var, y6, elapsedRealtime, 1));
        }
        E1 e12 = u0Var.f3498t;
        C0212u0.j(e12);
        C0212u0 u0Var3 = (C0212u0) e12.f398a;
        u0Var3.f3501w.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        C0203r0 r0Var3 = u0Var3.f3497s;
        C0212u0.k(r0Var3);
        r0Var3.y(new A1(e12, elapsedRealtime2, 1));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void m(com.google.android.gms.internal.measurement.zzdj r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f2686b
            T1.b1 r0 = (T1.C0157b1) r0
            java.lang.Object r0 = r0.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.E1 r1 = r0.f3498t
            T1.C0212u0.j(r1)
            java.lang.Object r2 = r1.f398a
            T1.u0 r2 = (T1.C0212u0) r2
            G1.b r3 = r2.f3501w
            r3.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            T1.r0 r2 = r2.f3497s
            T1.C0212u0.k(r2)
            T1.A1 r5 = new T1.A1
            r6 = 0
            r5.<init>(r1, r3, r6)
            r2.y(r5)
            T1.m1 r0 = r0.f3502x
            T1.C0212u0.j(r0)
            java.lang.Object r1 = r0.f3388u
            monitor-enter(r1)
            r2 = 1
            r0.f3387t = r2     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.measurement.zzdj r2 = r0.f3383p     // Catch:{ all -> 0x0060 }
            boolean r2 = java.util.Objects.equals(r8, r2)     // Catch:{ all -> 0x0060 }
            r3 = 0
            if (r2 != 0) goto L_0x0065
            monitor-enter(r1)     // Catch:{ all -> 0x0060 }
            r0.f3383p = r8     // Catch:{ all -> 0x0062 }
            r0.f3384q = r3     // Catch:{ all -> 0x0062 }
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            java.lang.Object r2 = r0.f398a     // Catch:{ all -> 0x0060 }
            T1.u0 r2 = (T1.C0212u0) r2     // Catch:{ all -> 0x0060 }
            T1.g r4 = r2.f3494p     // Catch:{ all -> 0x0060 }
            boolean r4 = r4.C()     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x0065
            r4 = 0
            r0.f3385r = r4     // Catch:{ all -> 0x0060 }
            T1.r0 r2 = r2.f3497s     // Catch:{ all -> 0x0060 }
            T1.C0212u0.k(r2)     // Catch:{ all -> 0x0060 }
            T1.l1 r4 = new T1.l1     // Catch:{ all -> 0x0060 }
            r5 = 1
            r4.<init>(r0, r5)     // Catch:{ all -> 0x0060 }
            r2.y(r4)     // Catch:{ all -> 0x0060 }
            goto L_0x0065
        L_0x0060:
            r8 = move-exception
            goto L_0x00b3
        L_0x0062:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            throw r8     // Catch:{ all -> 0x0060 }
        L_0x0065:
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            java.lang.Object r1 = r0.f398a
            T1.u0 r1 = (T1.C0212u0) r1
            T1.g r2 = r1.f3494p
            boolean r2 = r2.C()
            if (r2 != 0) goto L_0x0085
            T1.j1 r8 = r0.f3385r
            r0.f3380c = r8
            T1.r0 r8 = r1.f3497s
            T1.C0212u0.k(r8)
            T1.l1 r1 = new T1.l1
            r2 = 0
            r1.<init>(r0, r2)
            r8.y(r1)
            goto L_0x00b2
        L_0x0085:
            T1.j1 r1 = r0.y(r8)
            java.lang.String r8 = r8.zzb
            r0.s(r8, r1, r3)
            java.lang.Object r8 = r0.f398a
            T1.u0 r8 = (T1.C0212u0) r8
            T1.z r8 = r8.f3504z
            T1.C0212u0.h(r8)
            java.lang.Object r0 = r8.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            G1.b r1 = r0.f3501w
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            T1.r0 r0 = r0.f3497s
            T1.C0212u0.k(r0)
            T1.w r3 = new T1.w
            r4 = 0
            r3.<init>(r8, r1, r4)
            r0.y(r3)
        L_0x00b2:
            return
        L_0x00b3:
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.m.m(com.google.android.gms.internal.measurement.zzdj):void");
    }

    public void n(zzdj zzdj, Bundle bundle) {
        C0181j1 j1Var;
        C0190m1 m1Var = ((C0212u0) ((C0157b1) this.f2686b).f398a).f3502x;
        C0212u0.j(m1Var);
        if (((C0212u0) m1Var.f398a).f3494p.C() && bundle != null && (j1Var = (C0181j1) m1Var.f3382f.get(Integer.valueOf(zzdj.zza))) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", j1Var.f3357c);
            bundle2.putString("name", j1Var.f3355a);
            bundle2.putString("referrer_name", j1Var.f3356b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f2685a) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT <= 25) {
                        new Handler(Looper.getMainLooper()).post(new B.m(this, intent, 1));
                        return;
                    } else {
                        a(intent);
                        return;
                    }
                } else {
                    return;
                }
            default:
                j(zzdj.zza(activity), bundle);
                return;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        switch (this.f2685a) {
            case 0:
                return;
            default:
                k(zzdj.zza(activity));
                return;
        }
    }

    public final void onActivityPaused(Activity activity) {
        switch (this.f2685a) {
            case 0:
                return;
            default:
                l(zzdj.zza(activity));
                return;
        }
    }

    public final void onActivityResumed(Activity activity) {
        switch (this.f2685a) {
            case 0:
                return;
            default:
                m(zzdj.zza(activity));
                return;
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f2685a) {
            case 0:
                return;
            default:
                n(zzdj.zza(activity), bundle);
                return;
        }
    }

    public final void onActivityStarted(Activity activity) {
        int i2 = this.f2685a;
    }

    public final void onActivityStopped(Activity activity) {
        int i2 = this.f2685a;
    }

    public m() {
        this.f2685a = 0;
        this.f2686b = new ArrayDeque(10);
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }
}
