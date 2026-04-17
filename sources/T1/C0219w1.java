package T1;

import D0.d;
import F1.a;
import G1.b;
import H.j;
import K4.u;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.common.internal.C0377f;
import com.google.android.gms.common.internal.C0384m;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import z1.f;

/* renamed from: T1.w1  reason: case insensitive filesystem */
public final class C0219w1 extends E {

    /* renamed from: c  reason: collision with root package name */
    public final C0216v1 f3525c;
    public J d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Boolean f3526e;

    /* renamed from: f  reason: collision with root package name */
    public final C0210t1 f3527f;

    /* renamed from: p  reason: collision with root package name */
    public ScheduledExecutorService f3528p;

    /* renamed from: q  reason: collision with root package name */
    public final u f3529q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f3530r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public final C0210t1 f3531s;

    public C0219w1(C0212u0 u0Var) {
        super(u0Var);
        this.f3529q = new u(u0Var.f3501w);
        this.f3525c = new C0216v1(this);
        this.f3527f = new C0210t1(this, u0Var, 0);
        this.f3531s = new C0210t1(this, u0Var, 1);
    }

    public static void H(C0219w1 w1Var, ComponentName componentName) {
        w1Var.o();
        if (w1Var.d != null) {
            w1Var.d = null;
            Z z3 = ((C0212u0) w1Var.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3180w.b(componentName, "Disconnected from device MeasurementService");
            w1Var.o();
            w1Var.s();
        }
    }

    public final boolean A() {
        o();
        p();
        if (!B()) {
            return true;
        }
        Y1 y12 = ((C0212u0) this.f398a).f3499u;
        C0212u0.i(y12);
        if (y12.v0() >= 241200) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B() {
        /*
            r9 = this;
            r9.o()
            r9.p()
            java.lang.Boolean r0 = r9.f3526e
            if (r0 != 0) goto L_0x0133
            r9.o()
            r9.p()
            java.lang.Object r0 = r9.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.h0 r1 = r0.f3495q
            T1.C0212u0.i(r1)
            r1.o()
            android.content.SharedPreferences r2 = r1.t()
            java.lang.String r3 = "use_service"
            boolean r2 = r2.contains(r3)
            r4 = 0
            if (r2 != 0) goto L_0x002b
            r1 = 0
            goto L_0x0037
        L_0x002b:
            android.content.SharedPreferences r1 = r1.t()
            boolean r1 = r1.getBoolean(r3, r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x0037:
            r2 = 1
            if (r1 == 0) goto L_0x0042
            boolean r5 = r1.booleanValue()
            if (r5 == 0) goto L_0x0042
            goto L_0x012d
        L_0x0042:
            java.lang.Object r5 = r9.f398a
            T1.u0 r5 = (T1.C0212u0) r5
            T1.O r5 = r5.n()
            r5.p()
            int r5 = r5.f3008v
            if (r5 != r2) goto L_0x0054
        L_0x0051:
            r4 = r2
            goto L_0x00fd
        L_0x0054:
            T1.Z r5 = r0.f3496r
            T1.C0212u0.k(r5)
            T1.X r5 = r5.f3180w
            java.lang.String r6 = "Checking service availability"
            r5.a(r6)
            T1.Y1 r5 = r0.f3499u
            T1.C0212u0.i(r5)
            z1.f r6 = z1.f.f12811b
            java.lang.Object r5 = r5.f398a
            T1.u0 r5 = (T1.C0212u0) r5
            android.content.Context r5 = r5.f3489a
            r7 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r5 = r6.c(r5, r7)
            if (r5 == 0) goto L_0x00ef
            if (r5 == r2) goto L_0x00e2
            r6 = 2
            if (r5 == r6) goto L_0x00c0
            r1 = 3
            if (r5 == r1) goto L_0x00b3
            r1 = 9
            if (r5 == r1) goto L_0x00a6
            r1 = 18
            if (r5 == r1) goto L_0x0099
            T1.Z r1 = r0.f3496r
            T1.C0212u0.k(r1)
            T1.X r1 = r1.f3175r
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.String r5 = "Unexpected service status"
            r1.b(r2, r5)
        L_0x0096:
            r2 = r4
            goto L_0x00fd
        L_0x0099:
            T1.Z r1 = r0.f3496r
            T1.C0212u0.k(r1)
            T1.X r1 = r1.f3175r
            java.lang.String r4 = "Service updating"
            r1.a(r4)
            goto L_0x0051
        L_0x00a6:
            T1.Z r1 = r0.f3496r
            T1.C0212u0.k(r1)
            T1.X r1 = r1.f3175r
            java.lang.String r2 = "Service invalid"
            r1.a(r2)
            goto L_0x0096
        L_0x00b3:
            T1.Z r1 = r0.f3496r
            T1.C0212u0.k(r1)
            T1.X r1 = r1.f3175r
            java.lang.String r2 = "Service disabled"
            r1.a(r2)
            goto L_0x0096
        L_0x00c0:
            T1.Z r5 = r0.f3496r
            T1.C0212u0.k(r5)
            T1.X r5 = r5.f3179v
            java.lang.String r6 = "Service container out of date"
            r5.a(r6)
            T1.Y1 r5 = r0.f3499u
            T1.C0212u0.i(r5)
            int r5 = r5.v0()
            r6 = 17443(0x4423, float:2.4443E-41)
            if (r5 >= r6) goto L_0x00da
            goto L_0x00fd
        L_0x00da:
            if (r1 != 0) goto L_0x00dd
            goto L_0x00de
        L_0x00dd:
            r2 = r4
        L_0x00de:
            r8 = r4
            r4 = r2
            r2 = r8
            goto L_0x00fd
        L_0x00e2:
            T1.Z r1 = r0.f3496r
            T1.C0212u0.k(r1)
            T1.X r1 = r1.f3180w
            java.lang.String r5 = "Service missing"
            r1.a(r5)
            goto L_0x00fd
        L_0x00ef:
            T1.Z r1 = r0.f3496r
            T1.C0212u0.k(r1)
            T1.X r1 = r1.f3180w
            java.lang.String r4 = "Service available"
            r1.a(r4)
            goto L_0x0051
        L_0x00fd:
            if (r4 != 0) goto L_0x0114
            T1.g r1 = r0.f3494p
            boolean r1 = r1.r()
            if (r1 == 0) goto L_0x0114
            T1.Z r0 = r0.f3496r
            T1.C0212u0.k(r0)
            T1.X r0 = r0.f3172f
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r1)
            goto L_0x012c
        L_0x0114:
            if (r2 == 0) goto L_0x012c
            T1.h0 r0 = r0.f3495q
            T1.C0212u0.i(r0)
            r0.o()
            android.content.SharedPreferences r0 = r0.t()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r3, r4)
            r0.apply()
        L_0x012c:
            r2 = r4
        L_0x012d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r9.f3526e = r0
        L_0x0133:
            java.lang.Boolean r0 = r9.f3526e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0219w1.B():boolean");
    }

    public final Z1 C(boolean z3) {
        long j6;
        Pair pair;
        C0212u0 u0Var = (C0212u0) this.f398a;
        u0Var.getClass();
        O n2 = u0Var.n();
        String str = null;
        if (z3) {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            C0212u0 u0Var2 = (C0212u0) z4.f398a;
            C0174h0 h0Var = u0Var2.f3495q;
            C0212u0.i(h0Var);
            if (h0Var.f3321f != null) {
                C0174h0 h0Var2 = u0Var2.f3495q;
                C0212u0.i(h0Var2);
                d dVar = h0Var2.f3321f;
                C0174h0 h0Var3 = (C0174h0) dVar.f492e;
                h0Var3.o();
                h0Var3.o();
                long j7 = ((C0174h0) dVar.f492e).t().getLong((String) dVar.f490b, 0);
                if (j7 == 0) {
                    dVar.d();
                    j6 = 0;
                } else {
                    ((C0212u0) h0Var3.f398a).f3501w.getClass();
                    j6 = Math.abs(j7 - System.currentTimeMillis());
                }
                long j8 = dVar.f489a;
                if (j6 >= j8) {
                    if (j6 > j8 + j8) {
                        dVar.d();
                    } else {
                        String string = h0Var3.t().getString((String) dVar.d, (String) null);
                        long j9 = h0Var3.t().getLong((String) dVar.f491c, 0);
                        dVar.d();
                        if (string == null || j9 <= 0) {
                            pair = C0174h0.f3310J;
                        } else {
                            pair = new Pair(string, Long.valueOf(j9));
                        }
                        if (!(pair == null || pair == C0174h0.f3310J)) {
                            str = o3.d.g(String.valueOf(pair.second), ":", (String) pair.first);
                        }
                    }
                }
                pair = null;
                str = o3.d.g(String.valueOf(pair.second), ":", (String) pair.first);
            }
        }
        return n2.s(str);
    }

    public final void D() {
        o();
        C0212u0 u0Var = (C0212u0) this.f398a;
        Z z3 = u0Var.f3496r;
        C0212u0.k(z3);
        ArrayList arrayList = this.f3530r;
        z3.f3180w.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((Runnable) it2.next()).run();
            } catch (RuntimeException e6) {
                Z z4 = u0Var.f3496r;
                C0212u0.k(z4);
                z4.f3172f.b(e6, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f3531s.a();
    }

    public final void E() {
        o();
        u uVar = this.f3529q;
        ((b) uVar.f1612c).getClass();
        uVar.f1611b = SystemClock.elapsedRealtime();
        ((C0212u0) this.f398a).getClass();
        this.f3527f.c(((Long) H.f2887X.a((Object) null)).longValue());
    }

    public final void F(Runnable runnable) {
        o();
        if (y()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f3530r;
        C0212u0 u0Var = (C0212u0) this.f398a;
        u0Var.getClass();
        if (((long) arrayList.size()) >= 1000) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3172f.a("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.f3531s.c(60000);
        s();
    }

    public final void G() {
        ((C0212u0) this.f398a).getClass();
    }

    public final boolean r() {
        return false;
    }

    public final void s() {
        o();
        p();
        if (!y()) {
            if (!B()) {
                C0212u0 u0Var = (C0212u0) this.f398a;
                if (!u0Var.f3494p.r()) {
                    List<ResolveInfo> queryIntentServices = u0Var.f3489a.getPackageManager().queryIntentServices(new Intent().setClassName(u0Var.f3489a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        Z z3 = u0Var.f3496r;
                        C0212u0.k(z3);
                        z3.f3172f.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                        return;
                    }
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    intent.setComponent(new ComponentName(u0Var.f3489a, "com.google.android.gms.measurement.AppMeasurementService"));
                    C0216v1 v1Var = this.f3525c;
                    C0219w1 w1Var = v1Var.f3518c;
                    w1Var.o();
                    Context context = ((C0212u0) w1Var.f398a).f3489a;
                    a b6 = a.b();
                    synchronized (v1Var) {
                        try {
                            if (v1Var.f3516a) {
                                Z z4 = ((C0212u0) v1Var.f3518c.f398a).f3496r;
                                C0212u0.k(z4);
                                z4.f3180w.a("Connection attempt already in progress");
                                return;
                            }
                            C0219w1 w1Var2 = v1Var.f3518c;
                            Z z5 = ((C0212u0) w1Var2.f398a).f3496r;
                            C0212u0.k(z5);
                            z5.f3180w.a("Using local app measurement service");
                            v1Var.f3516a = true;
                            b6.a(context, intent, w1Var2.f3525c, 129);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                C0216v1 v1Var2 = this.f3525c;
                C0219w1 w1Var3 = v1Var2.f3518c;
                w1Var3.o();
                Context context2 = ((C0212u0) w1Var3.f398a).f3489a;
                synchronized (v1Var2) {
                    try {
                        if (v1Var2.f3516a) {
                            Z z6 = ((C0212u0) v1Var2.f3518c.f398a).f3496r;
                            C0212u0.k(z6);
                            z6.f3180w.a("Connection attempt already in progress");
                        } else if (v1Var2.f3517b == null || (!v1Var2.f3517b.isConnecting() && !v1Var2.f3517b.isConnected())) {
                            v1Var2.f3517b = new C0377f(context2, Looper.getMainLooper(), C0384m.a(context2), f.f12811b, 93, v1Var2, v1Var2, (String) null);
                            Z z7 = ((C0212u0) v1Var2.f3518c.f398a).f3496r;
                            C0212u0.k(z7);
                            z7.f3180w.a("Connecting to remote service");
                            v1Var2.f3516a = true;
                            I.g(v1Var2.f3517b);
                            v1Var2.f3517b.checkAvailabilityAndConnect();
                        } else {
                            Z z8 = ((C0212u0) v1Var2.f3518c.f398a).f3496r;
                            C0212u0.k(z8);
                            z8.f3180w.a("Already awaiting connection attempt");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public final void t() {
        o();
        p();
        C0216v1 v1Var = this.f3525c;
        if (v1Var.f3517b != null && (v1Var.f3517b.isConnected() || v1Var.f3517b.isConnecting())) {
            v1Var.f3517b.disconnect();
        }
        v1Var.f3517b = null;
        try {
            a.b().c(((C0212u0) this.f398a).f3489a, v1Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    public final void u(AtomicReference atomicReference) {
        o();
        p();
        F(new j(this, atomicReference, C(false), 8, false));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v20, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v39, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v56, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v140, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v43, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v44, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v80, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v144, resolved type: long} */
    /* JADX WARNING: type inference failed for: r26v22 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:148|149|150|151) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:166|167|168|169) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:182|183|184|185) */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01df, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0227, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        T1.C0212u0.k(r7);
        r7.f3172f.a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0239, code lost:
        r27 = r27;
        r27 = r27;
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r14.recycle();
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        T1.C0212u0.k(r7);
        r7.f3172f.a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        r9.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        T1.C0212u0.k(r7);
        r7.f3172f.a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        r14.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02dd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:?, code lost:
        T1.C0212u0.k(r7);
        r7.f3172f.a("Failed to load default event parameters from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x02ed, code lost:
        r26 = r26;
        r26 = r26;
        r26 = r26;
        r27 = r27;
        r27 = r27;
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        r14.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        r34 = r4;
        r35 = r7;
        r27 = r9;
        r23 = r12;
        r25 = r13;
        r26 = r14;
        r2 = 5;
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        r34 = r4;
        r35 = r7;
        r27 = r9;
        r23 = r12;
        r25 = r13;
        r26 = r14;
        r2 = 5;
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x03c3, code lost:
        r15 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x03cf, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x03d0, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x03dd, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x03de, code lost:
        r27 = r9;
        r23 = r12;
        r25 = r13;
        r26 = r14;
        r2 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x03ea, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x03eb, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        r34 = r4;
        r35 = r7;
        r27 = r9;
        r23 = r12;
        r25 = r13;
        r26 = r14;
        r2 = 5;
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x03f8, code lost:
        r4 = r3;
        r27 = r9;
        r23 = r12;
        r25 = r13;
        r26 = r14;
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0405, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0406, code lost:
        r4 = r3;
        r35 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x040a, code lost:
        r4 = r3;
        r35 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x040e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x040f, code lost:
        r4 = r3;
        r35 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0445, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0447, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x044f, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x046f, code lost:
        if (r5.inTransaction() != false) goto L_0x0471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0471, code lost:
        r5.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0483, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x04a2, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x04cc, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x04e9, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x04ee, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        r4 = r3;
        r35 = r7;
        r27 = r9;
        r23 = r12;
        r25 = r13;
        r26 = r14;
        r2 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ed, code lost:
        r27 = r27;
        r26 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f0, code lost:
        r4 = r3;
        r35 = r7;
        r27 = r9;
        r23 = r12;
        r25 = r13;
        r26 = r14;
        r2 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fc, code lost:
        r27 = r27;
        r26 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ff, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0100, code lost:
        r4 = r3;
        r35 = r7;
        r27 = r9;
        r23 = r12;
        r25 = r13;
        r26 = r14;
        r2 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x016d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016e, code lost:
        r2 = 5;
        r4 = r3;
        r27 = r9;
        r23 = r12;
        r25 = r13;
        r26 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x017a, code lost:
        r2 = 5;
        r4 = r3;
        r27 = r9;
        r23 = r12;
        r25 = r13;
        r26 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0186, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0187, code lost:
        r2 = 5;
        r4 = r3;
        r27 = r9;
        r23 = r12;
        r25 = r13;
        r26 = r14;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:148:0x022f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:166:0x0264 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:182:0x029e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:207:0x02e3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076 A[Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x008b, SQLiteException -> 0x0079, all -> 0x0076 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:17:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03cf A[ExcHandler: SQLiteException (e android.database.sqlite.SQLiteException), Splitter:B:69:0x014b] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x03ea A[ExcHandler: SQLiteFullException (e android.database.sqlite.SQLiteFullException), Splitter:B:69:0x014b] */
    /* JADX WARNING: Removed duplicated region for block: B:275:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), PHI: r34 
      PHI: (r34v19 T1.u0) = (r34v24 T1.u0), (r34v24 T1.u0), (r34v24 T1.u0), (r34v24 T1.u0), (r34v24 T1.u0), (r34v25 T1.u0), (r34v25 T1.u0) binds: [B:62:0x0140, B:64:0x0144, B:65:?, B:66:0x0146, B:67:?, B:52:0x0121, B:53:?] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:52:0x0121] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0441 A[SYNTHETIC, Splitter:B:287:0x0441] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x046b A[SYNTHETIC, Splitter:B:304:0x046b] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0683  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x06a5  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0449 A[EDGE_INSN: B:415:0x0449->B:293:0x0449 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x04d2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x04d2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x04d2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(T1.J r64, A1.a r65, T1.Z1 r66) {
        /*
            r63 = this;
            r1 = r64
            r2 = r65
            r63.o()
            r63.p()
            r63.G()
            r3 = r63
            java.lang.Object r0 = r3.f398a
            r4 = r0
            T1.u0 r4 = (T1.C0212u0) r4
            r4.getClass()
            r6 = 100
            r7 = r66
            r0 = r6
            r8 = 0
        L_0x001d:
            r9 = 1001(0x3e9, float:1.403E-42)
            if (r8 >= r9) goto L_0x0716
            if (r0 != r6) goto L_0x0716
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            T1.Q r10 = r4.o()
            java.lang.String r11 = "Error reading entries from local database"
            java.lang.String r12 = "entry"
            java.lang.String r13 = "type"
            java.lang.String r14 = "rowid"
            r10.o()
            boolean r0 = r10.d
            r16 = 0
            if (r0 == 0) goto L_0x0049
            r34 = r4
            r35 = r7
            r20 = r8
        L_0x0043:
            r27 = r9
            r6 = 0
        L_0x0046:
            r9 = 0
            goto L_0x0511
        L_0x0049:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Object r0 = r10.f398a
            r15 = r0
            T1.u0 r15 = (T1.C0212u0) r15
            android.content.Context r0 = r15.f3489a
            java.lang.String r5 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r5)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0507
            r5 = 5
            r20 = r8
            r3 = 0
            r8 = r5
        L_0x0066:
            if (r3 >= r5) goto L_0x04f2
            android.database.sqlite.SQLiteDatabase r5 = r10.s()     // Catch:{ SQLiteFullException -> 0x04ab, SQLiteDatabaseLockedException -> 0x0489, SQLiteException -> 0x0457, all -> 0x0454 }
            if (r5 != 0) goto L_0x00ae
            r1 = 1
            r10.d = r1     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x008b, SQLiteException -> 0x0079, all -> 0x0076 }
            r34 = r4
            r35 = r7
            goto L_0x0043
        L_0x0076:
            r0 = move-exception
            goto L_0x044a
        L_0x0079:
            r0 = move-exception
            r34 = r4
            r35 = r7
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r2 = 5
            r9 = 0
            r4 = r3
            goto L_0x044d
        L_0x008b:
            r34 = r4
            r35 = r7
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r2 = 5
            r9 = 0
            r4 = r3
            goto L_0x044f
        L_0x009c:
            r0 = move-exception
            r34 = r4
            r35 = r7
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r2 = 5
            r9 = 0
            r4 = r3
            goto L_0x0451
        L_0x00ae:
            r5.beginTransaction()     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x008b, SQLiteException -> 0x0079, all -> 0x0076 }
            java.lang.String r0 = "3"
            java.lang.String r23 = "messages"
            java.lang.String[] r24 = new java.lang.String[]{r14}     // Catch:{ all -> 0x042e }
            java.lang.String r25 = "type=?"
            java.lang.String[] r26 = new java.lang.String[]{r0}     // Catch:{ all -> 0x042e }
            java.lang.String r29 = "rowid desc"
            java.lang.String r30 = "1"
            r27 = 0
            r28 = 0
            r22 = r5
            android.database.Cursor r1 = r22.query(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x042e }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x041d }
            r32 = -1
            if (r0 == 0) goto L_0x011f
            r34 = r4
            r4 = 0
            long r22 = r1.getLong(r4)     // Catch:{ all -> 0x010f }
            r1.close()     // Catch:{ SQLiteFullException -> 0x00ff, SQLiteDatabaseLockedException -> 0x00f0, SQLiteException -> 0x00e0, all -> 0x0076 }
            goto L_0x0126
        L_0x00e0:
            r0 = move-exception
            r4 = r3
            r35 = r7
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r2 = 5
        L_0x00ed:
            r9 = 0
            goto L_0x044d
        L_0x00f0:
            r4 = r3
            r35 = r7
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r2 = 5
        L_0x00fc:
            r9 = 0
            goto L_0x044f
        L_0x00ff:
            r0 = move-exception
            r4 = r3
            r35 = r7
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r2 = 5
        L_0x010c:
            r9 = 0
            goto L_0x0451
        L_0x010f:
            r0 = move-exception
            r4 = r3
            r35 = r7
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r2 = 5
            r9 = 0
            goto L_0x043f
        L_0x011f:
            r34 = r4
            r1.close()     // Catch:{ SQLiteFullException -> 0x040e, SQLiteDatabaseLockedException -> 0x040a, SQLiteException -> 0x0405, all -> 0x0076 }
            r22 = r32
        L_0x0126:
            int r0 = (r22 > r32 ? 1 : (r22 == r32 ? 0 : -1))
            if (r0 == 0) goto L_0x013c
            java.lang.String r0 = "rowid<?"
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ SQLiteFullException -> 0x00ff, SQLiteDatabaseLockedException -> 0x00f0, SQLiteException -> 0x00e0, all -> 0x0076 }
            java.lang.String r1 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteFullException -> 0x00ff, SQLiteDatabaseLockedException -> 0x00f0, SQLiteException -> 0x00e0, all -> 0x0076 }
            r19 = 0
            r4[r19] = r1     // Catch:{ SQLiteFullException -> 0x00ff, SQLiteDatabaseLockedException -> 0x00f0, SQLiteException -> 0x00e0, all -> 0x0076 }
            r25 = r0
            r26 = r4
            goto L_0x0140
        L_0x013c:
            r25 = 0
            r26 = 0
        L_0x0140:
            java.lang.String[] r0 = new java.lang.String[]{r14, r13, r12}     // Catch:{ SQLiteFullException -> 0x040e, SQLiteDatabaseLockedException -> 0x040a, SQLiteException -> 0x0405, all -> 0x0076 }
            T1.g r1 = r15.f3494p     // Catch:{ SQLiteFullException -> 0x0418, SQLiteDatabaseLockedException -> 0x040a, SQLiteException -> 0x0413, all -> 0x0076 }
            T1.G r4 = T1.H.f2923l1     // Catch:{ SQLiteFullException -> 0x040e, SQLiteDatabaseLockedException -> 0x040a, SQLiteException -> 0x0405, all -> 0x0076 }
            r35 = r7
            r7 = 0
            boolean r1 = r1.B(r7, r4)     // Catch:{ SQLiteFullException -> 0x03ea, SQLiteDatabaseLockedException -> 0x03dd, SQLiteException -> 0x03cf, all -> 0x0076 }
            r7 = 3
            r4 = 2
            if (r1 == 0) goto L_0x0193
            r1 = 5
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch:{ SQLiteFullException -> 0x0186, SQLiteDatabaseLockedException -> 0x017a, SQLiteException -> 0x016d, all -> 0x0076 }
            r19 = 0
            r0[r19] = r14     // Catch:{ SQLiteFullException -> 0x0186, SQLiteDatabaseLockedException -> 0x017a, SQLiteException -> 0x016d, all -> 0x0076 }
            r21 = 1
            r0[r21] = r13     // Catch:{ SQLiteFullException -> 0x0186, SQLiteDatabaseLockedException -> 0x017a, SQLiteException -> 0x016d, all -> 0x0076 }
            r0[r4] = r12     // Catch:{ SQLiteFullException -> 0x0186, SQLiteDatabaseLockedException -> 0x017a, SQLiteException -> 0x016d, all -> 0x0076 }
            java.lang.String r21 = "app_version"
            r0[r7] = r21     // Catch:{ SQLiteFullException -> 0x0186, SQLiteDatabaseLockedException -> 0x017a, SQLiteException -> 0x016d, all -> 0x0076 }
            java.lang.String r21 = "app_version_int"
            r22 = 4
            r0[r22] = r21     // Catch:{ SQLiteFullException -> 0x0186, SQLiteDatabaseLockedException -> 0x017a, SQLiteException -> 0x016d, all -> 0x0076 }
        L_0x016a:
            r24 = r0
            goto L_0x0195
        L_0x016d:
            r0 = move-exception
            r2 = r1
            r4 = r3
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            goto L_0x00ed
        L_0x017a:
            r2 = r1
            r4 = r3
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            goto L_0x00fc
        L_0x0186:
            r0 = move-exception
            r2 = r1
            r4 = r3
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            goto L_0x010c
        L_0x0193:
            r1 = 5
            goto L_0x016a
        L_0x0195:
            java.lang.String r23 = "messages"
            java.lang.String r29 = "rowid asc"
            r18 = 100
            java.lang.String r30 = java.lang.Integer.toString(r18)     // Catch:{ SQLiteFullException -> 0x03ea, SQLiteDatabaseLockedException -> 0x03f8, SQLiteException -> 0x03cf, all -> 0x0076 }
            r27 = 0
            r28 = 0
            r22 = r5
            android.database.Cursor r1 = r22.query(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ SQLiteFullException -> 0x03ea, SQLiteDatabaseLockedException -> 0x03dd, SQLiteException -> 0x03cf, all -> 0x0076 }
        L_0x01a9:
            boolean r0 = r1.moveToNext()     // Catch:{ SQLiteFullException -> 0x0361, SQLiteDatabaseLockedException -> 0x035b, SQLiteException -> 0x0354 }
            T1.Z r7 = r15.f3496r
            if (r0 == 0) goto L_0x038b
            r4 = 0
            long r32 = r1.getLong(r4)     // Catch:{ SQLiteFullException -> 0x037f, SQLiteDatabaseLockedException -> 0x0374, SQLiteException -> 0x0368 }
            r4 = 1
            int r0 = r1.getInt(r4)     // Catch:{ SQLiteFullException -> 0x0361, SQLiteDatabaseLockedException -> 0x035b, SQLiteException -> 0x0354 }
            r23 = r12
            r4 = 2
            byte[] r12 = r1.getBlob(r4)     // Catch:{ SQLiteFullException -> 0x034d, SQLiteDatabaseLockedException -> 0x0340, SQLiteException -> 0x0346 }
            T1.g r4 = r15.f3494p     // Catch:{ SQLiteFullException -> 0x034d, SQLiteDatabaseLockedException -> 0x0340, SQLiteException -> 0x0346 }
            r25 = r13
            T1.G r13 = T1.H.f2923l1     // Catch:{ SQLiteFullException -> 0x0338, SQLiteDatabaseLockedException -> 0x0331, SQLiteException -> 0x0329 }
            r26 = r14
            r14 = 0
            boolean r4 = r4.B(r14, r13)     // Catch:{ SQLiteFullException -> 0x01ef, SQLiteDatabaseLockedException -> 0x01e9, SQLiteException -> 0x01e2 }
            if (r4 == 0) goto L_0x01f6
            r4 = 3
            java.lang.String r13 = r1.getString(r4)     // Catch:{ SQLiteFullException -> 0x01ef, SQLiteDatabaseLockedException -> 0x01e9, SQLiteException -> 0x01e2 }
            r4 = 4
            long r27 = r1.getLong(r4)     // Catch:{ SQLiteFullException -> 0x01ef, SQLiteDatabaseLockedException -> 0x01e9, SQLiteException -> 0x01e2 }
            r4 = r3
            r2 = r27
            goto L_0x01fa
        L_0x01df:
            r0 = move-exception
            goto L_0x03c3
        L_0x01e2:
            r0 = move-exception
            r4 = r3
        L_0x01e4:
            r27 = r9
        L_0x01e6:
            r9 = 0
            goto L_0x03c6
        L_0x01e9:
            r4 = r3
        L_0x01ea:
            r27 = r9
        L_0x01ec:
            r9 = 0
            goto L_0x03c9
        L_0x01ef:
            r0 = move-exception
            r4 = r3
        L_0x01f1:
            r27 = r9
        L_0x01f3:
            r9 = 0
            goto L_0x03cc
        L_0x01f6:
            r4 = r3
            r2 = r16
            r13 = 0
        L_0x01fa:
            if (r0 != 0) goto L_0x0245
            android.os.Parcel r14 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01ea, SQLiteException -> 0x0241 }
            int r0 = r12.length     // Catch:{ b -> 0x022d, all -> 0x0229 }
            r27 = r9
            r9 = 0
            r14.unmarshall(r12, r9, r0)     // Catch:{ b -> 0x022f }
            r14.setDataPosition(r9)     // Catch:{ b -> 0x022f }
            android.os.Parcelable$Creator<T1.v> r0 = T1.C0214v.CREATOR     // Catch:{ b -> 0x022f }
            java.lang.Object r0 = r0.createFromParcel(r14)     // Catch:{ b -> 0x022f }
            T1.v r0 = (T1.C0214v) r0     // Catch:{ b -> 0x022f }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            if (r0 == 0) goto L_0x021f
            T1.P r7 = new T1.P     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            r7.<init>(r0, r13, r2)     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            r6.add(r7)     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
        L_0x021f:
            r2 = 3
            r9 = 0
            goto L_0x031a
        L_0x0223:
            r0 = move-exception
            goto L_0x01e6
        L_0x0225:
            r0 = move-exception
            goto L_0x01f3
        L_0x0227:
            r0 = move-exception
            goto L_0x023d
        L_0x0229:
            r0 = move-exception
            r27 = r9
            goto L_0x023d
        L_0x022d:
            r27 = r9
        L_0x022f:
            T1.C0212u0.k(r7)     // Catch:{ all -> 0x0227 }
            T1.X r0 = r7.f3172f     // Catch:{ all -> 0x0227 }
            java.lang.String r2 = "Failed to load event from local database"
            r0.a(r2)     // Catch:{ all -> 0x0227 }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            goto L_0x021f
        L_0x023d:
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
        L_0x0241:
            r0 = move-exception
            goto L_0x01e4
        L_0x0243:
            r0 = move-exception
            goto L_0x01f1
        L_0x0245:
            r27 = r9
            r9 = 1
            if (r0 != r9) goto L_0x0281
            android.os.Parcel r9 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            int r0 = r12.length     // Catch:{ b -> 0x0264 }
            r14 = 0
            r9.unmarshall(r12, r14, r0)     // Catch:{ b -> 0x0264 }
            r9.setDataPosition(r14)     // Catch:{ b -> 0x0264 }
            android.os.Parcelable$Creator<T1.W1> r0 = T1.W1.CREATOR     // Catch:{ b -> 0x0264 }
            java.lang.Object r0 = r0.createFromParcel(r9)     // Catch:{ b -> 0x0264 }
            T1.W1 r0 = (T1.W1) r0     // Catch:{ b -> 0x0264 }
            r9.recycle()     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            goto L_0x0272
        L_0x0262:
            r0 = move-exception
            goto L_0x027d
        L_0x0264:
            T1.C0212u0.k(r7)     // Catch:{ all -> 0x0262 }
            T1.X r0 = r7.f3172f     // Catch:{ all -> 0x0262 }
            java.lang.String r7 = "Failed to load user property from local database"
            r0.a(r7)     // Catch:{ all -> 0x0262 }
            r9.recycle()     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            r0 = 0
        L_0x0272:
            if (r0 == 0) goto L_0x021f
            T1.P r7 = new T1.P     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            r7.<init>(r0, r13, r2)     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            r6.add(r7)     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            goto L_0x021f
        L_0x027d:
            r9.recycle()     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
        L_0x0281:
            r9 = 2
            if (r0 != r9) goto L_0x02bc
            android.os.Parcel r14 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            int r0 = r12.length     // Catch:{ b -> 0x029e }
            r9 = 0
            r14.unmarshall(r12, r9, r0)     // Catch:{ b -> 0x029e }
            r14.setDataPosition(r9)     // Catch:{ b -> 0x029e }
            android.os.Parcelable$Creator<T1.e> r0 = T1.C0164e.CREATOR     // Catch:{ b -> 0x029e }
            java.lang.Object r0 = r0.createFromParcel(r14)     // Catch:{ b -> 0x029e }
            T1.e r0 = (T1.C0164e) r0     // Catch:{ b -> 0x029e }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            goto L_0x02ac
        L_0x029c:
            r0 = move-exception
            goto L_0x02b8
        L_0x029e:
            T1.C0212u0.k(r7)     // Catch:{ all -> 0x029c }
            T1.X r0 = r7.f3172f     // Catch:{ all -> 0x029c }
            java.lang.String r7 = "Failed to load conditional user property from local database"
            r0.a(r7)     // Catch:{ all -> 0x029c }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            r0 = 0
        L_0x02ac:
            if (r0 == 0) goto L_0x021f
            T1.P r7 = new T1.P     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            r7.<init>(r0, r13, r2)     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            r6.add(r7)     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            goto L_0x021f
        L_0x02b8:
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
        L_0x02bc:
            r9 = 4
            if (r0 != r9) goto L_0x0301
            android.os.Parcel r14 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0225, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x0223 }
            int r0 = r12.length     // Catch:{ b -> 0x02e2, all -> 0x02df }
            r9 = 0
            r14.unmarshall(r12, r9, r0)     // Catch:{ b -> 0x02e3 }
            r14.setDataPosition(r9)     // Catch:{ b -> 0x02e3 }
            android.os.Parcelable$Creator<T1.u> r0 = T1.C0211u.CREATOR     // Catch:{ b -> 0x02e3 }
            java.lang.Object r0 = r0.createFromParcel(r14)     // Catch:{ b -> 0x02e3 }
            T1.u r0 = (T1.C0211u) r0     // Catch:{ b -> 0x02e3 }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            goto L_0x02f1
        L_0x02d7:
            r0 = move-exception
            goto L_0x03c6
        L_0x02da:
            r0 = move-exception
            goto L_0x03cc
        L_0x02dd:
            r0 = move-exception
            goto L_0x02fd
        L_0x02df:
            r0 = move-exception
            r9 = 0
            goto L_0x02fd
        L_0x02e2:
            r9 = 0
        L_0x02e3:
            T1.C0212u0.k(r7)     // Catch:{ all -> 0x02dd }
            T1.X r0 = r7.f3172f     // Catch:{ all -> 0x02dd }
            java.lang.String r7 = "Failed to load default event parameters from local database"
            r0.a(r7)     // Catch:{ all -> 0x02dd }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            r0 = 0
        L_0x02f1:
            if (r0 == 0) goto L_0x02fb
            T1.P r7 = new T1.P     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            r7.<init>(r0, r13, r2)     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            r6.add(r7)     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
        L_0x02fb:
            r2 = 3
            goto L_0x031a
        L_0x02fd:
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            throw r0     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
        L_0x0301:
            r2 = 3
            r9 = 0
            if (r0 != r2) goto L_0x0310
            T1.C0212u0.k(r7)     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            T1.X r0 = r7.f3175r     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            java.lang.String r3 = "Skipping app launch break"
            r0.a(r3)     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            goto L_0x031a
        L_0x0310:
            T1.C0212u0.k(r7)     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            T1.X r0 = r7.f3172f     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            java.lang.String r3 = "Unknown record type in local database"
            r0.a(r3)     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
        L_0x031a:
            r7 = r2
            r3 = r4
            r12 = r23
            r13 = r25
            r14 = r26
            r9 = r27
            r4 = 2
            r2 = r65
            goto L_0x01a9
        L_0x0329:
            r0 = move-exception
            r4 = r3
            r27 = r9
        L_0x032d:
            r26 = r14
            goto L_0x01e6
        L_0x0331:
            r4 = r3
            r27 = r9
        L_0x0334:
            r26 = r14
            goto L_0x01ec
        L_0x0338:
            r0 = move-exception
            r4 = r3
            r27 = r9
        L_0x033c:
            r26 = r14
            goto L_0x01f3
        L_0x0340:
            r4 = r3
            r27 = r9
        L_0x0343:
            r25 = r13
            goto L_0x0334
        L_0x0346:
            r0 = move-exception
            r4 = r3
            r27 = r9
        L_0x034a:
            r25 = r13
            goto L_0x032d
        L_0x034d:
            r0 = move-exception
            r4 = r3
            r27 = r9
        L_0x0351:
            r25 = r13
            goto L_0x033c
        L_0x0354:
            r0 = move-exception
            r4 = r3
            r27 = r9
            r23 = r12
            goto L_0x034a
        L_0x035b:
            r4 = r3
            r27 = r9
            r23 = r12
            goto L_0x0343
        L_0x0361:
            r0 = move-exception
            r4 = r3
            r27 = r9
            r23 = r12
            goto L_0x0351
        L_0x0368:
            r0 = move-exception
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r9 = r4
            r4 = r3
            goto L_0x03c6
        L_0x0374:
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r9 = r4
            r4 = r3
            goto L_0x03c9
        L_0x037f:
            r0 = move-exception
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r9 = r4
            r4 = r3
            goto L_0x03cc
        L_0x038b:
            r4 = r3
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r9 = 0
            java.lang.String r0 = "messages"
            java.lang.String r2 = "rowid <= ?"
            java.lang.String r3 = java.lang.Long.toString(r32)     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            int r0 = r5.delete(r0, r2, r3)     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            int r2 = r6.size()     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            if (r0 >= r2) goto L_0x03b5
            T1.C0212u0.k(r7)     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            T1.X r0 = r7.f3172f     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            java.lang.String r2 = "Fewer entries removed from local database than expected"
            r0.a(r2)     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
        L_0x03b5:
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x02da, SQLiteDatabaseLockedException -> 0x03c9, SQLiteException -> 0x02d7 }
            r1.close()
            r5.close()
            goto L_0x0511
        L_0x03c3:
            r15 = r1
            goto L_0x04e7
        L_0x03c6:
            r2 = 5
            goto L_0x0469
        L_0x03c9:
            r2 = 5
            goto L_0x049a
        L_0x03cc:
            r2 = 5
            goto L_0x04bd
        L_0x03cf:
            r0 = move-exception
            r4 = r3
        L_0x03d1:
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r9 = 0
            r2 = 5
            goto L_0x044d
        L_0x03dd:
            r4 = r3
        L_0x03de:
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r9 = 0
            r2 = 5
            goto L_0x044f
        L_0x03ea:
            r0 = move-exception
            r4 = r3
        L_0x03ec:
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r9 = 0
            r2 = 5
            goto L_0x0451
        L_0x03f8:
            r4 = r3
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r9 = 0
            r2 = r1
            goto L_0x044f
        L_0x0405:
            r0 = move-exception
            r4 = r3
            r35 = r7
            goto L_0x03d1
        L_0x040a:
            r4 = r3
            r35 = r7
            goto L_0x03de
        L_0x040e:
            r0 = move-exception
            r4 = r3
            r35 = r7
            goto L_0x03ec
        L_0x0413:
            r0 = move-exception
            r4 = r3
            r35 = r7
            goto L_0x03d1
        L_0x0418:
            r0 = move-exception
            r4 = r3
            r35 = r7
            goto L_0x03ec
        L_0x041d:
            r0 = move-exception
            r34 = r4
            r35 = r7
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r2 = 5
            r9 = 0
            r4 = r3
            goto L_0x043f
        L_0x042e:
            r0 = move-exception
            r34 = r4
            r35 = r7
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r2 = 5
            r9 = 0
            r4 = r3
            r1 = 0
        L_0x043f:
            if (r1 == 0) goto L_0x0449
            r1.close()     // Catch:{ SQLiteFullException -> 0x0447, SQLiteDatabaseLockedException -> 0x044f, SQLiteException -> 0x0445, all -> 0x0076 }
            goto L_0x0449
        L_0x0445:
            r0 = move-exception
            goto L_0x044d
        L_0x0447:
            r0 = move-exception
            goto L_0x0451
        L_0x0449:
            throw r0     // Catch:{ SQLiteFullException -> 0x0447, SQLiteDatabaseLockedException -> 0x044f, SQLiteException -> 0x0445, all -> 0x0076 }
        L_0x044a:
            r15 = 0
            goto L_0x04e7
        L_0x044d:
            r1 = 0
            goto L_0x0469
        L_0x044f:
            r1 = 0
            goto L_0x049a
        L_0x0451:
            r1 = 0
            goto L_0x04bd
        L_0x0454:
            r0 = move-exception
            r5 = 0
            goto L_0x044a
        L_0x0457:
            r0 = move-exception
            r34 = r4
            r35 = r7
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r2 = 5
            r9 = 0
            r4 = r3
            r1 = 0
            r5 = 0
        L_0x0469:
            if (r5 == 0) goto L_0x0474
            boolean r3 = r5.inTransaction()     // Catch:{ all -> 0x01df }
            if (r3 == 0) goto L_0x0474
            r5.endTransaction()     // Catch:{ all -> 0x01df }
        L_0x0474:
            T1.Z r3 = r15.f3496r     // Catch:{ all -> 0x01df }
            T1.C0212u0.k(r3)     // Catch:{ all -> 0x01df }
            T1.X r3 = r3.f3172f     // Catch:{ all -> 0x01df }
            r3.b(r0, r11)     // Catch:{ all -> 0x01df }
            r3 = 1
            r10.d = r3     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0486
            r1.close()
        L_0x0486:
            if (r5 == 0) goto L_0x04d2
            goto L_0x04a7
        L_0x0489:
            r34 = r4
            r35 = r7
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r2 = 5
            r9 = 0
            r4 = r3
            r1 = 0
            r5 = 0
        L_0x049a:
            long r12 = (long) r8
            android.os.SystemClock.sleep(r12)     // Catch:{ all -> 0x01df }
            int r8 = r8 + 20
            if (r1 == 0) goto L_0x04a5
            r1.close()
        L_0x04a5:
            if (r5 == 0) goto L_0x04d2
        L_0x04a7:
            r5.close()
            goto L_0x04d2
        L_0x04ab:
            r0 = move-exception
            r34 = r4
            r35 = r7
            r27 = r9
            r23 = r12
            r25 = r13
            r26 = r14
            r2 = 5
            r9 = 0
            r4 = r3
            r1 = 0
            r5 = 0
        L_0x04bd:
            T1.Z r3 = r15.f3496r     // Catch:{ all -> 0x01df }
            T1.C0212u0.k(r3)     // Catch:{ all -> 0x01df }
            T1.X r3 = r3.f3172f     // Catch:{ all -> 0x01df }
            r3.b(r0, r11)     // Catch:{ all -> 0x01df }
            r3 = 1
            r10.d = r3     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x04cf
            r1.close()
        L_0x04cf:
            if (r5 == 0) goto L_0x04d2
            goto L_0x04a7
        L_0x04d2:
            int r3 = r4 + 1
            r1 = r64
            r5 = r2
            r12 = r23
            r13 = r25
            r14 = r26
            r9 = r27
            r4 = r34
            r7 = r35
            r2 = r65
            goto L_0x0066
        L_0x04e7:
            if (r15 == 0) goto L_0x04ec
            r15.close()
        L_0x04ec:
            if (r5 == 0) goto L_0x04f1
            r5.close()
        L_0x04f1:
            throw r0
        L_0x04f2:
            r34 = r4
            r35 = r7
            r27 = r9
            r9 = 0
            T1.Z r0 = r15.f3496r
            T1.C0212u0.k(r0)
            java.lang.String r1 = "Failed to read events from database in reasonable time"
            T1.X r0 = r0.f3175r
            r0.a(r1)
            r6 = 0
            goto L_0x0511
        L_0x0507:
            r34 = r4
            r35 = r7
            r20 = r8
            r27 = r9
            goto L_0x0046
        L_0x0511:
            if (r6 == 0) goto L_0x0520
            r1 = r27
            r1.addAll(r6)
            int r0 = r6.size()
            r3 = r65
            r2 = r0
            goto L_0x0525
        L_0x0520:
            r1 = r27
            r3 = r65
            r2 = r9
        L_0x0525:
            if (r3 == 0) goto L_0x053a
            r4 = 100
            r5 = r35
            if (r2 >= r4) goto L_0x053e
            java.lang.String r0 = r5.f3203c
            T1.P r6 = new T1.P
            long r7 = r5.f3209s
            r6.<init>(r3, r0, r7)
            r1.add(r6)
            goto L_0x053e
        L_0x053a:
            r5 = r35
            r4 = 100
        L_0x053e:
            T1.G r0 = T1.H.f2882U0
            r6 = r34
            T1.g r7 = r6.f3494p
            r8 = 0
            boolean r10 = r7.B(r8, r0)
            int r11 = r1.size()
            r0 = r5
            r5 = r9
        L_0x054f:
            if (r5 >= r11) goto L_0x0707
            java.lang.Object r12 = r1.get(r5)
            T1.P r12 = (T1.P) r12
            A1.a r13 = r12.f3014a
            T1.G r14 = T1.H.f2923l1
            boolean r15 = r7.B(r8, r14)
            if (r15 == 0) goto L_0x05f5
            java.lang.String r8 = r12.f3015b
            boolean r15 = android.text.TextUtils.isEmpty(r8)
            if (r15 != 0) goto L_0x05f5
            java.lang.String r15 = r0.f3201a
            r22 = r15
            T1.Z1 r15 = new T1.Z1
            r21 = r15
            r19 = r5
            long r4 = r0.f3199O
            r60 = r4
            int r4 = r0.f3200P
            r62 = r4
            java.lang.String r4 = r0.f3202b
            r23 = r4
            long r4 = r12.f3016c
            r25 = r4
            java.lang.String r4 = r0.d
            r27 = r4
            long r4 = r0.f3204e
            r28 = r4
            long r4 = r0.f3205f
            r30 = r4
            java.lang.String r4 = r0.f3206p
            r32 = r4
            boolean r4 = r0.f3207q
            r33 = r4
            boolean r4 = r0.f3208r
            r34 = r4
            java.lang.String r4 = r0.f3210t
            r35 = r4
            long r4 = r0.f3211u
            r36 = r4
            int r4 = r0.f3212v
            r38 = r4
            boolean r4 = r0.f3213w
            r39 = r4
            boolean r4 = r0.f3214x
            r40 = r4
            java.lang.String r4 = r0.f3215y
            r41 = r4
            java.lang.Boolean r4 = r0.f3216z
            r42 = r4
            long r4 = r0.f3186A
            r43 = r4
            java.util.List r4 = r0.f3187B
            r45 = r4
            java.lang.String r4 = r0.f3188C
            r46 = r4
            java.lang.String r4 = r0.f3189D
            r47 = r4
            java.lang.String r4 = r0.f3190E
            r48 = r4
            java.lang.String r4 = r0.F
            r49 = r4
            boolean r4 = r0.f3191G
            r50 = r4
            long r4 = r0.f3192H
            r51 = r4
            int r4 = r0.f3193I
            r53 = r4
            java.lang.String r4 = r0.f3194J
            r54 = r4
            int r4 = r0.f3195K
            r55 = r4
            long r4 = r0.f3196L
            r56 = r4
            java.lang.String r4 = r0.f3197M
            r58 = r4
            java.lang.String r0 = r0.f3198N
            r59 = r0
            r24 = r8
            r21.<init>((java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24, (long) r25, (java.lang.String) r27, (long) r28, (long) r30, (java.lang.String) r32, (boolean) r33, (boolean) r34, (java.lang.String) r35, (long) r36, (int) r38, (boolean) r39, (boolean) r40, (java.lang.String) r41, (java.lang.Boolean) r42, (long) r43, (java.util.List) r45, (java.lang.String) r46, (java.lang.String) r47, (java.lang.String) r48, (java.lang.String) r49, (boolean) r50, (long) r51, (int) r53, (java.lang.String) r54, (int) r55, (long) r56, (java.lang.String) r58, (java.lang.String) r59, (long) r60, (int) r62)
            goto L_0x05f8
        L_0x05f5:
            r19 = r5
            r15 = r0
        L_0x05f8:
            boolean r0 = r13 instanceof T1.C0214v
            T1.Z r4 = r6.f3496r
            if (r0 == 0) goto L_0x06a5
            android.content.Context r5 = r6.f3489a
            G1.b r8 = r6.f3501w
            if (r10 == 0) goto L_0x0627
            r8.getClass()     // Catch:{ RemoteException -> 0x061f }
            long r21 = java.lang.System.currentTimeMillis()     // Catch:{ RemoteException -> 0x061f }
            r8.getClass()     // Catch:{ RemoteException -> 0x0617 }
            long r23 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RemoteException -> 0x0617 }
            r28 = r21
            r30 = r23
            goto L_0x062b
        L_0x0617:
            r0 = move-exception
            r12 = r64
            r30 = r16
            r24 = r21
            goto L_0x066f
        L_0x061f:
            r0 = move-exception
            r12 = r64
            r24 = r16
            r30 = r24
            goto L_0x066f
        L_0x0627:
            r28 = r16
            r30 = r28
        L_0x062b:
            T1.v r13 = (T1.C0214v) r13     // Catch:{ RemoteException -> 0x066a }
            r12 = r64
            r12.p(r13, r15)     // Catch:{ RemoteException -> 0x0668 }
            if (r10 == 0) goto L_0x0665
            T1.C0212u0.k(r4)     // Catch:{ RemoteException -> 0x0668 }
            T1.X r0 = r4.f3180w     // Catch:{ RemoteException -> 0x0668 }
            java.lang.String r13 = "Logging telemetry for logEvent from database"
            r0.a(r13)     // Catch:{ RemoteException -> 0x0668 }
            B0.h r0 = B0.C0009h.f226e     // Catch:{ RemoteException -> 0x0668 }
            if (r0 != 0) goto L_0x0649
            B0.h r0 = new B0.h     // Catch:{ RemoteException -> 0x0668 }
            r0.<init>((android.content.Context) r5, (T1.C0212u0) r6)     // Catch:{ RemoteException -> 0x0668 }
            B0.C0009h.f226e = r0     // Catch:{ RemoteException -> 0x0668 }
        L_0x0649:
            B0.h r21 = B0.C0009h.f226e     // Catch:{ RemoteException -> 0x0668 }
            r8.getClass()     // Catch:{ RemoteException -> 0x0668 }
            long r26 = java.lang.System.currentTimeMillis()     // Catch:{ RemoteException -> 0x0668 }
            r8.getClass()     // Catch:{ RemoteException -> 0x0668 }
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RemoteException -> 0x0668 }
            long r13 = r13 - r30
            int r0 = (int) r13     // Catch:{ RemoteException -> 0x0668 }
            r22 = 0
            r23 = r0
            r24 = r28
            r21.H(r22, r23, r24, r26)     // Catch:{ RemoteException -> 0x0668 }
        L_0x0665:
            r5 = 0
            goto L_0x06fe
        L_0x0668:
            r0 = move-exception
            goto L_0x066d
        L_0x066a:
            r0 = move-exception
            r12 = r64
        L_0x066d:
            r24 = r28
        L_0x066f:
            T1.C0212u0.k(r4)
            java.lang.String r13 = "Failed to send event to the service"
            T1.X r4 = r4.f3172f
            r4.b(r0, r13)
            if (r10 == 0) goto L_0x0665
            int r0 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0665
            B0.h r0 = B0.C0009h.f226e
            if (r0 != 0) goto L_0x068a
            B0.h r0 = new B0.h
            r0.<init>((android.content.Context) r5, (T1.C0212u0) r6)
            B0.C0009h.f226e = r0
        L_0x068a:
            B0.h r21 = B0.C0009h.f226e
            r8.getClass()
            long r26 = java.lang.System.currentTimeMillis()
            r8.getClass()
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r30
            int r0 = (int) r4
            r22 = 13
            r23 = r0
            r21.H(r22, r23, r24, r26)
            goto L_0x0665
        L_0x06a5:
            r12 = r64
            boolean r0 = r13 instanceof T1.W1
            if (r0 == 0) goto L_0x06bd
            T1.W1 r13 = (T1.W1) r13     // Catch:{ RemoteException -> 0x06b1 }
            r12.c(r13, r15)     // Catch:{ RemoteException -> 0x06b1 }
            goto L_0x0665
        L_0x06b1:
            r0 = move-exception
            T1.C0212u0.k(r4)
            java.lang.String r5 = "Failed to send user property to the service"
            T1.X r4 = r4.f3172f
            r4.b(r0, r5)
            goto L_0x0665
        L_0x06bd:
            boolean r0 = r13 instanceof T1.C0164e
            if (r0 == 0) goto L_0x06d3
            T1.e r13 = (T1.C0164e) r13     // Catch:{ RemoteException -> 0x06c7 }
            r12.h(r13, r15)     // Catch:{ RemoteException -> 0x06c7 }
            goto L_0x0665
        L_0x06c7:
            r0 = move-exception
            T1.C0212u0.k(r4)
            java.lang.String r5 = "Failed to send conditional user property to the service"
            T1.X r4 = r4.f3172f
            r4.b(r0, r5)
            goto L_0x0665
        L_0x06d3:
            r5 = 0
            boolean r0 = r7.B(r5, r14)
            if (r0 == 0) goto L_0x06f4
            boolean r0 = r13 instanceof T1.C0211u
            if (r0 == 0) goto L_0x06f4
            T1.u r13 = (T1.C0211u) r13     // Catch:{ RemoteException -> 0x06e8 }
            android.os.Bundle r0 = r13.v()     // Catch:{ RemoteException -> 0x06e8 }
            r12.u(r15, r0)     // Catch:{ RemoteException -> 0x06e8 }
            goto L_0x06fe
        L_0x06e8:
            r0 = move-exception
            T1.C0212u0.k(r4)
            java.lang.String r8 = "Failed to send default event parameters to the service"
            T1.X r4 = r4.f3172f
            r4.b(r0, r8)
            goto L_0x06fe
        L_0x06f4:
            T1.C0212u0.k(r4)
            java.lang.String r0 = "Discarding data. Unrecognized parcel type."
            T1.X r4 = r4.f3172f
            r4.a(r0)
        L_0x06fe:
            int r0 = r19 + 1
            r8 = r5
            r4 = 100
            r5 = r0
            r0 = r15
            goto L_0x054f
        L_0x0707:
            r12 = r64
            int r8 = r20 + 1
            r7 = r0
            r0 = r2
            r2 = r3
            r4 = r6
            r1 = r12
            r6 = 100
            r3 = r63
            goto L_0x001d
        L_0x0716:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0219w1.v(T1.J, A1.a, T1.Z1):void");
    }

    public final void w(C0164e eVar) {
        boolean v6;
        o();
        p();
        C0212u0 u0Var = (C0212u0) this.f398a;
        u0Var.getClass();
        Q o6 = u0Var.o();
        C0212u0 u0Var2 = (C0212u0) o6.f398a;
        C0212u0.i(u0Var2.f3499u);
        byte[] o02 = Y1.o0(eVar);
        if (o02.length > 131072) {
            Z z3 = u0Var2.f3496r;
            C0212u0.k(z3);
            z3.f3173p.a("Conditional user property too long for local database. Sending directly to service");
            v6 = false;
        } else {
            v6 = o6.v(o02, 2);
        }
        boolean z4 = v6;
        F(new C0204r1(this, C(true), z4, new C0164e(eVar), 2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(android.os.Bundle r8) {
        /*
            r7 = this;
            r7.o()
            r7.p()
            T1.u r4 = new T1.u
            r4.<init>(r8)
            r7.G()
            java.lang.Object r0 = r7.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.g r1 = r0.f3494p
            r2 = 0
            T1.G r3 = T1.H.f2923l1
            boolean r1 = r1.B(r2, r3)
            r2 = 0
            if (r1 == 0) goto L_0x0059
            T1.Q r0 = r0.o()
            java.lang.Object r1 = r0.f398a
            T1.u0 r1 = (T1.C0212u0) r1
            T1.Y1 r3 = r1.f3499u
            T1.C0212u0.i(r3)
            byte[] r3 = T1.Y1.o0(r4)
            T1.Z r1 = r1.f3496r
            if (r3 != 0) goto L_0x003f
            T1.C0212u0.k(r1)
            java.lang.String r0 = "Null default event parameters; not writing to database"
            T1.X r1 = r1.f3173p
            r1.a(r0)
        L_0x003d:
            r0 = r2
            goto L_0x0054
        L_0x003f:
            int r5 = r3.length
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r5 <= r6) goto L_0x004f
            T1.C0212u0.k(r1)
            java.lang.String r0 = "Default event parameters too long for local database. Sending directly to service"
            T1.X r1 = r1.f3173p
            r1.a(r0)
            goto L_0x003d
        L_0x004f:
            r1 = 4
            boolean r0 = r0.v(r3, r1)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r0 = 1
            r3 = r0
            goto L_0x005a
        L_0x0059:
            r3 = r2
        L_0x005a:
            T1.Z1 r2 = r7.C(r2)
            T1.Z0 r6 = new T1.Z0
            r0 = r6
            r1 = r7
            r5 = r8
            r0.<init>((T1.C0219w1) r1, (T1.Z1) r2, (boolean) r3, (T1.C0211u) r4, (android.os.Bundle) r5)
            r7.F(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0219w1.x(android.os.Bundle):void");
    }

    public final boolean y() {
        o();
        p();
        if (this.d != null) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        o();
        p();
        if (!B()) {
            return true;
        }
        Y1 y12 = ((C0212u0) this.f398a).f3499u;
        C0212u0.i(y12);
        if (y12.v0() >= ((Integer) H.f2860I0.a((Object) null)).intValue()) {
            return true;
        }
        return false;
    }
}
