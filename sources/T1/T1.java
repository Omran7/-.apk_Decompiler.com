package T1;

import B0.C0004c;
import B0.C0009h;
import D0.d;
import F0.C0015e;
import G1.a;
import G1.b;
import I1.c;
import S3.t;
import android.app.Service;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzhb;
import com.google.android.gms.internal.measurement.zzhc;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzhm;
import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzim;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzmm;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzra;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import s2.e;

public final class T1 implements F0 {

    /* renamed from: T  reason: collision with root package name */
    public static volatile T1 f3041T;

    /* renamed from: A  reason: collision with root package name */
    public int f3042A;

    /* renamed from: B  reason: collision with root package name */
    public int f3043B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f3044C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f3045D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f3046E;
    public FileLock F;

    /* renamed from: G  reason: collision with root package name */
    public FileChannel f3047G;

    /* renamed from: H  reason: collision with root package name */
    public ArrayList f3048H;

    /* renamed from: I  reason: collision with root package name */
    public ArrayList f3049I;

    /* renamed from: J  reason: collision with root package name */
    public long f3050J;

    /* renamed from: K  reason: collision with root package name */
    public final HashMap f3051K;

    /* renamed from: L  reason: collision with root package name */
    public final HashMap f3052L;

    /* renamed from: M  reason: collision with root package name */
    public final HashMap f3053M;

    /* renamed from: N  reason: collision with root package name */
    public final HashMap f3054N = new HashMap();

    /* renamed from: O  reason: collision with root package name */
    public C0181j1 f3055O;

    /* renamed from: P  reason: collision with root package name */
    public String f3056P;

    /* renamed from: Q  reason: collision with root package name */
    public C1 f3057Q;

    /* renamed from: R  reason: collision with root package name */
    public long f3058R;

    /* renamed from: S  reason: collision with root package name */
    public final A f3059S = new A((Object) this, 4);

    /* renamed from: a  reason: collision with root package name */
    public final C0192n0 f3060a;

    /* renamed from: b  reason: collision with root package name */
    public final C0162d0 f3061b;

    /* renamed from: c  reason: collision with root package name */
    public C0191n f3062c;
    public C0165e0 d;

    /* renamed from: e  reason: collision with root package name */
    public J1 f3063e;

    /* renamed from: f  reason: collision with root package name */
    public C0158c f3064f;

    /* renamed from: p  reason: collision with root package name */
    public final C0162d0 f3065p;

    /* renamed from: q  reason: collision with root package name */
    public C0162d0 f3066q;

    /* renamed from: r  reason: collision with root package name */
    public C0225y1 f3067r;

    /* renamed from: s  reason: collision with root package name */
    public final Q1 f3068s;

    /* renamed from: t  reason: collision with root package name */
    public C0180j0 f3069t;

    /* renamed from: u  reason: collision with root package name */
    public final C0212u0 f3070u;

    /* renamed from: v  reason: collision with root package name */
    public final AtomicBoolean f3071v = new AtomicBoolean(false);

    /* renamed from: w  reason: collision with root package name */
    public boolean f3072w;

    /* renamed from: x  reason: collision with root package name */
    public long f3073x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList f3074y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedList f3075z = new LinkedList();

    /* JADX WARNING: type inference failed for: r0v7, types: [T1.K1, T1.Q1] */
    public T1(C0015e eVar) {
        this.f3070u = C0212u0.q(eVar.f683b, (zzdh) null, (Long) null);
        this.f3050J = -1;
        this.f3068s = new K1(this);
        C0162d0 d0Var = new C0162d0(this, 2);
        d0Var.q();
        this.f3065p = d0Var;
        C0162d0 d0Var2 = new C0162d0(this, 0);
        d0Var2.q();
        this.f3061b = d0Var2;
        C0192n0 n0Var = new C0192n0(this);
        n0Var.q();
        this.f3060a = n0Var;
        this.f3051K = new HashMap();
        this.f3052L = new HashMap();
        this.f3053M = new HashMap();
        f().y(new C0004c(this, eVar));
    }

    public static String B(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (!((List) entry.getValue()).isEmpty()) {
                    return (String) ((List) entry.getValue()).get(0);
                }
                return null;
            }
        }
        return null;
    }

    public static final boolean K(Z1 z12) {
        if (!TextUtils.isEmpty(z12.f3202b) || !TextUtils.isEmpty(z12.f3215y)) {
            return true;
        }
        return false;
    }

    public static final void L(O1 o12) {
        if (o12 == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!o12.f3013c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(o12.getClass())));
        }
    }

    public static final Boolean M(Z1 z12) {
        Boolean bool = z12.f3216z;
        String str = z12.f3198N;
        if (!TextUtils.isEmpty(str)) {
            int ordinal = ((G0) A.s(str).f2796b).ordinal();
            if (ordinal == 0 || ordinal == 1) {
                return null;
            }
            if (ordinal == 2) {
                return Boolean.TRUE;
            }
            if (ordinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public static T1 o0(Service service) {
        I.g(service);
        I.g(service.getApplicationContext());
        if (f3041T == null) {
            synchronized (T1.class) {
                try {
                    if (f3041T == null) {
                        f3041T = new T1(new C0015e(service));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3041T;
    }

    public static final void w(zzhl zzhl, int i2, String str) {
        List zzp = zzhl.zzp();
        int i5 = 0;
        while (i5 < zzp.size()) {
            if (!"_err".equals(((zzhq) zzp.get(i5)).zzg())) {
                i5++;
            } else {
                return;
            }
        }
        zzhp zze = zzhq.zze();
        zze.zzj("_err");
        zze.zzi((long) i2);
        zzhp zze2 = zzhq.zze();
        zze2.zzj("_ev");
        zze2.zzk(str);
        zzhl.zzf((zzhq) zze.zzba());
        zzhl.zzf((zzhq) zze2.zzba());
    }

    public static final void x(zzhl zzhl, String str) {
        List zzp = zzhl.zzp();
        for (int i2 = 0; i2 < zzp.size(); i2++) {
            if (str.equals(((zzhq) zzp.get(i2)).zzg())) {
                zzhl.zzh(i2);
                return;
            }
        }
    }

    public final Boolean A(V v6) {
        try {
            int i2 = (v6.S() > -2147483648L ? 1 : (v6.S() == -2147483648L ? 0 : -1));
            C0212u0 u0Var = this.f3070u;
            if (i2 != 0) {
                if (v6.S() == ((long) c.a(u0Var.f3489a).i(0, v6.c()).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = c.a(u0Var.f3489a).i(0, v6.c()).versionName;
                String e6 = v6.e();
                if (e6 != null && e6.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final void C() {
        f().o();
        if (this.f3044C || this.f3045D || this.f3046E) {
            Z c3 = c();
            c3.f3180w.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f3044C), Boolean.valueOf(this.f3045D), Boolean.valueOf(this.f3046E));
            return;
        }
        c().f3180w.a("Stopping uploading service(s)");
        ArrayList arrayList = this.f3074y;
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
            ArrayList arrayList2 = this.f3074y;
            I.g(arrayList2);
            arrayList2.clear();
        }
    }

    public final void D(zzhw zzhw, long j6, boolean z3) {
        String str;
        X1 x12;
        String str2;
        Object obj;
        if (true != z3) {
            str = "_lte";
        } else {
            str = "_se";
        }
        C0191n nVar = this.f3062c;
        L(nVar);
        X1 u02 = nVar.u0(zzhw.zzaF(), str);
        if (u02 == null || (obj = u02.f3154e) == null) {
            String zzaF = zzhw.zzaF();
            ((b) g()).getClass();
            x12 = new X1(zzaF, "auto", str, System.currentTimeMillis(), Long.valueOf(j6));
        } else {
            String zzaF2 = zzhw.zzaF();
            ((b) g()).getClass();
            x12 = new X1(zzaF2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j6));
        }
        zzin zze = zzio.zze();
        zze.zzf(str);
        ((b) g()).getClass();
        zze.zzg(System.currentTimeMillis());
        Object obj2 = x12.f3154e;
        zze.zze(((Long) obj2).longValue());
        zzio zzio = (zzio) zze.zzba();
        int I6 = C0162d0.I(zzhw, str);
        if (I6 >= 0) {
            zzhw.zzaC(I6, zzio);
        } else {
            zzhw.zzp(zzio);
        }
        if (j6 > 0) {
            C0191n nVar2 = this.f3062c;
            L(nVar2);
            nVar2.c0(x12);
            if (true != z3) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            c().f3180w.c("Updated engagement user property. scope, value", str2, obj2);
        }
    }

    public final void E() {
        f().o();
        if (!this.f3075z.isEmpty()) {
            if (this.f3057Q == null) {
                this.f3057Q = new C1(this, this.f3070u, 2);
            }
            if (this.f3057Q.f3415c == 0) {
                ((b) g()).getClass();
                long max = Math.max(0, ((long) ((Integer) H.f2845A0.a((Object) null)).intValue()) - (SystemClock.elapsedRealtime() - this.f3058R));
                Z c3 = c();
                c3.f3180w.b(Long.valueOf(max), "Scheduling notify next app runnable, delay in ms");
                if (this.f3057Q == null) {
                    this.f3057Q = new C1(this, this.f3070u, 2);
                }
                this.f3057Q.c(max);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F() {
        /*
            r19 = this;
            r0 = r19
            T1.r0 r1 = r19.f()
            r1.o()
            r19.k()
            long r1 = r0.f3073x
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0051
            G1.a r1 = r19.g()
            G1.b r1 = (G1.b) r1
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r5 = r0.f3073x
            long r1 = r1 - r5
            long r1 = java.lang.Math.abs(r1)
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004f
            T1.Z r1 = r19.c()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            T1.X r1 = r1.f3180w
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.b(r2, r3)
            T1.e0 r1 = r19.l0()
            r1.b()
            T1.J1 r1 = r0.f3063e
            L(r1)
            r1.s()
            return
        L_0x004f:
            r0.f3073x = r3
        L_0x0051:
            T1.u0 r1 = r0.f3070u
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x035d
            boolean r1 = r19.H()
            if (r1 != 0) goto L_0x0061
            goto L_0x035d
        L_0x0061:
            G1.a r1 = r19.g()
            G1.b r1 = (G1.b) r1
            r1.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            r19.h0()
            T1.G r5 = T1.H.f2868N
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            T1.n r5 = r0.f3062c
            L(r5)
            java.lang.String r9 = "select count(1) > 0 from raw_events where realtime = 1"
            long r9 = r5.f0(r9, r6)
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0093
        L_0x0091:
            r5 = 1
            goto L_0x00a4
        L_0x0093:
            T1.n r5 = r0.f3062c
            L(r5)
            java.lang.String r11 = "select count(1) > 0 from queue where has_realtime = 1"
            long r11 = r5.f0(r11, r6)
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00a3
            goto L_0x0091
        L_0x00a3:
            r5 = 0
        L_0x00a4:
            if (r5 == 0) goto L_0x00e6
            T1.g r11 = r19.h0()
            java.lang.String r12 = "debug.firebase.analytics.app"
            java.lang.String r11 = r11.s(r12)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x00d2
            java.lang.String r12 = ".none."
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L_0x00d2
            r19.h0()
            T1.G r11 = T1.H.f2859I
            java.lang.Object r11 = r11.a(r6)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00f9
        L_0x00d2:
            r19.h0()
            T1.G r11 = T1.H.f2857H
            java.lang.Object r11 = r11.a(r6)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00f9
        L_0x00e6:
            r19.h0()
            T1.G r11 = T1.H.f2855G
            java.lang.Object r11 = r11.a(r6)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = java.lang.Math.max(r3, r11)
        L_0x00f9:
            T1.y1 r13 = r0.f3067r
            T1.g0 r13 = r13.f3547q
            long r13 = r13.a()
            T1.y1 r15 = r0.f3067r
            T1.g0 r15 = r15.f3548r
            long r15 = r15.a()
            T1.n r9 = r0.f3062c
            L(r9)
            java.lang.String r10 = "select max(bundle_end_timestamp) from queue"
            long r9 = r9.g0(r10, r6, r3)
            T1.n r3 = r0.f3062c
            L(r3)
            java.lang.String r4 = "select max(timestamp) from raw_events"
            r17 = r11
            r11 = 0
            long r3 = r3.g0(r4, r6, r11)
            long r3 = java.lang.Math.max(r9, r3)
            int r9 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            T1.d0 r10 = r0.f3065p
            if (r9 != 0) goto L_0x0133
        L_0x012d:
            r1 = 0
            r7 = 0
            goto L_0x01b3
        L_0x0133:
            long r3 = r3 - r1
            long r3 = java.lang.Math.abs(r3)
            long r3 = r1 - r3
            long r13 = r13 - r1
            long r11 = java.lang.Math.abs(r13)
            long r11 = r1 - r11
            long r15 = r15 - r1
            long r13 = java.lang.Math.abs(r15)
            long r1 = r1 - r13
            long r7 = r7 + r3
            long r11 = java.lang.Math.max(r11, r1)
            if (r5 == 0) goto L_0x015a
            r13 = 0
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x015a
            long r7 = java.lang.Math.min(r3, r11)
            long r7 = r7 + r17
        L_0x015a:
            L(r10)
            r13 = r17
            boolean r5 = r10.d0(r11, r13)
            if (r5 != 0) goto L_0x0167
            long r11 = r11 + r13
            r7 = r11
        L_0x0167:
            r11 = 0
            int r5 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x01ac
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x01ac
            r3 = 0
        L_0x0172:
            r19.h0()
            T1.G r4 = T1.H.f2871P
            java.lang.Object r4 = r4.a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            r9 = 20
            int r4 = java.lang.Math.min(r9, r4)
            if (r3 >= r4) goto L_0x012d
            r11 = 1
            long r11 = r11 << r3
            r19.h0()
            T1.G r4 = T1.H.f2870O
            java.lang.Object r4 = r4.a(r6)
            java.lang.Long r4 = (java.lang.Long) r4
            long r13 = r4.longValue()
            r5 = 0
            long r13 = java.lang.Math.max(r5, r13)
            long r13 = r13 * r11
            long r7 = r7 + r13
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x01af
        L_0x01ac:
            r1 = 0
            goto L_0x01b3
        L_0x01af:
            int r3 = r3 + 1
            r6 = 0
            goto L_0x0172
        L_0x01b3:
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x01d2
            T1.Z r1 = r19.c()
            java.lang.String r2 = "Next upload time is 0"
            T1.X r1 = r1.f3180w
            r1.a(r2)
            T1.e0 r1 = r19.l0()
            r1.b()
            T1.J1 r1 = r0.f3063e
            L(r1)
            r1.s()
            return
        L_0x01d2:
            T1.d0 r1 = r0.f3061b
            L(r1)
            boolean r1 = r1.N()
            if (r1 == 0) goto L_0x0305
            T1.y1 r1 = r0.f3067r
            T1.g0 r1 = r1.f3546p
            long r1 = r1.a()
            r19.h0()
            T1.G r3 = T1.H.F
            r4 = 0
            java.lang.Object r3 = r3.a(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            r11 = 0
            long r5 = java.lang.Math.max(r11, r5)
            L(r10)
            boolean r3 = r10.d0(r1, r5)
            if (r3 != 0) goto L_0x0209
            long r1 = r1 + r5
            long r7 = java.lang.Math.max(r7, r1)
        L_0x0209:
            T1.e0 r1 = r19.l0()
            r1.b()
            G1.a r1 = r19.g()
            G1.b r1 = (G1.b) r1
            r1.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r1
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x024c
            r19.h0()
            T1.G r3 = T1.H.f2861J
            r4 = 0
            java.lang.Object r3 = r3.a(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            long r7 = java.lang.Math.max(r1, r5)
            T1.y1 r1 = r0.f3067r
            T1.g0 r1 = r1.f3547q
            G1.a r2 = r19.g()
            G1.b r2 = (G1.b) r2
            r2.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            r1.b(r2)
        L_0x024c:
            T1.Z r1 = r19.c()
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            T1.X r1 = r1.f3180w
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.b(r2, r3)
            T1.J1 r1 = r0.f3063e
            L(r1)
            r1.p()
            java.lang.Object r2 = r1.f398a
            T1.u0 r2 = (T1.C0212u0) r2
            r2.getClass()
            android.content.Context r3 = r2.f3489a
            boolean r5 = T1.Y1.k0(r3)
            T1.Z r6 = r2.f3496r
            if (r5 != 0) goto L_0x027e
            T1.C0212u0.k(r6)
            java.lang.String r5 = "Receiver not registered/enabled"
            T1.X r9 = r6.f3179v
            r9.a(r5)
        L_0x027e:
            boolean r5 = T1.Y1.l0(r3)
            if (r5 != 0) goto L_0x028e
            T1.C0212u0.k(r6)
            java.lang.String r5 = "Service not registered/enabled"
            T1.X r9 = r6.f3179v
            r9.a(r5)
        L_0x028e:
            r1.s()
            T1.C0212u0.k(r6)
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            java.lang.String r9 = "Scheduling upload, millis"
            T1.X r6 = r6.f3180w
            r6.b(r5, r9)
            G1.b r2 = r2.f3501w
            r2.getClass()
            android.os.SystemClock.elapsedRealtime()
            T1.G r2 = T1.H.f2863K
            r4 = 0
            java.lang.Object r2 = r2.a(r4)
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            r9 = 0
            long r4 = java.lang.Math.max(r9, r4)
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x02d0
            T1.o r2 = r1.u()
            long r4 = r2.f3415c
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x02c9
            goto L_0x02d0
        L_0x02c9:
            T1.o r2 = r1.u()
            r2.c(r7)
        L_0x02d0:
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurementJobService"
            r2.<init>(r3, r4)
            int r1 = r1.t()
            android.os.PersistableBundle r4 = new android.os.PersistableBundle
            r4.<init>()
            java.lang.String r5 = "action"
            java.lang.String r6 = "com.google.android.gms.measurement.UPLOAD"
            r4.putString(r5, r6)
            android.app.job.JobInfo$Builder r5 = new android.app.job.JobInfo$Builder
            r5.<init>(r1, r2)
            android.app.job.JobInfo$Builder r1 = r5.setMinimumLatency(r7)
            long r7 = r7 + r7
            android.app.job.JobInfo$Builder r1 = r1.setOverrideDeadline(r7)
            android.app.job.JobInfo$Builder r1 = r1.setExtras(r4)
            android.app.job.JobInfo r1 = r1.build()
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r4 = "UploadAlarm"
            com.google.android.gms.internal.measurement.zzck.zza(r3, r1, r2, r4)
            return
        L_0x0305:
            T1.Z r1 = r19.c()
            java.lang.String r2 = "No network"
            T1.X r1 = r1.f3180w
            r1.a(r2)
            T1.e0 r1 = r19.l0()
            java.lang.Object r2 = r1.d
            T1.T1 r2 = (T1.T1) r2
            r2.k()
            T1.r0 r3 = r2.f()
            r3.o()
            boolean r3 = r1.f3282b
            if (r3 == 0) goto L_0x0327
            goto L_0x0354
        L_0x0327:
            T1.u0 r3 = r2.f3070u
            android.content.Context r3 = r3.f3489a
            android.content.IntentFilter r4 = new android.content.IntentFilter
            java.lang.String r5 = "android.net.conn.CONNECTIVITY_CHANGE"
            r4.<init>(r5)
            r3.registerReceiver(r1, r4)
            T1.d0 r3 = r2.f3061b
            L(r3)
            boolean r3 = r3.N()
            r1.f3283c = r3
            T1.Z r2 = r2.c()
            boolean r3 = r1.f3283c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Registering connectivity change receiver. Network connected"
            T1.X r2 = r2.f3180w
            r2.b(r3, r4)
            r2 = 1
            r1.f3282b = r2
        L_0x0354:
            T1.J1 r1 = r0.f3063e
            L(r1)
            r1.s()
            return
        L_0x035d:
            T1.Z r1 = r19.c()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            T1.X r1 = r1.f3180w
            r1.a(r2)
            T1.e0 r1 = r19.l0()
            r1.b()
            T1.J1 r1 = r0.f3063e
            L(r1)
            r1.s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.T1.F():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014e, code lost:
        if (r4.equals("ecommerce_purchase") == false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0e4d, code lost:
        if (r8.zzo() > (((java.lang.Long) r13.a((java.lang.Object) null)).longValue() + r9)) goto L_0x0e53;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x040d A[Catch:{ NumberFormatException -> 0x09f7, all -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04ce A[Catch:{ NumberFormatException -> 0x09f7, all -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x051f A[Catch:{ NumberFormatException -> 0x09f7, all -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0577 A[Catch:{ NumberFormatException -> 0x09f7, all -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0688 A[Catch:{ NumberFormatException -> 0x09f7, all -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0a39 A[Catch:{ NumberFormatException -> 0x09f7, all -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0a83 A[Catch:{ NumberFormatException -> 0x09f7, all -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0aae A[Catch:{ NumberFormatException -> 0x09f7, all -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0e18 A[Catch:{ NumberFormatException -> 0x09f7, all -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x0f28 A[Catch:{ NumberFormatException -> 0x09f7, all -> 0x010f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean G(java.lang.String r49, long r50) {
        /*
            r48 = this;
            r1 = r48
            java.lang.String r4 = "1"
            java.lang.String r5 = "_ai"
            java.lang.String r6 = "purchase"
            java.lang.String r7 = "items"
            T1.n r8 = r48.i0()
            r8.z()
            D0.d r8 = new D0.d     // Catch:{ all -> 0x010f }
            r8.<init>(r1)     // Catch:{ all -> 0x010f }
            T1.n r9 = r48.i0()     // Catch:{ all -> 0x010f }
            long r13 = r1.f3050J     // Catch:{ all -> 0x010f }
            r10 = r49
            r11 = r50
            r15 = r8
            r9.d0(r10, r11, r13, r15)     // Catch:{ all -> 0x010f }
            java.lang.Object r9 = r8.d     // Catch:{ all -> 0x010f }
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ all -> 0x010f }
            if (r9 == 0) goto L_0x0030
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x010f }
            if (r9 == 0) goto L_0x0033
        L_0x0030:
            r6 = 0
            goto L_0x0f6d
        L_0x0033:
            java.lang.Object r9 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r9 = (com.google.android.gms.internal.measurement.zzhx) r9     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzlz r9 = r9.zzch()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhw r9 = (com.google.android.gms.internal.measurement.zzhw) r9     // Catch:{ all -> 0x010f }
            r9.zzu()     // Catch:{ all -> 0x010f }
            r10 = -1
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = -1
        L_0x004b:
            java.lang.Object r2 = r8.d     // Catch:{ all -> 0x010f }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x010f }
            int r2 = r2.size()     // Catch:{ all -> 0x010f }
            java.lang.String r3 = "_et"
            java.lang.String r11 = "_fr"
            r51 = r15
            java.lang.String r15 = "_e"
            r20 = r13
            T1.u0 r13 = r1.f3070u
            r21 = r9
            r22 = r10
            if (r12 >= r2) goto L_0x06af
            java.lang.Object r2 = r8.d     // Catch:{ all -> 0x010f }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x010f }
            java.lang.Object r2 = r2.get(r12)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhm r2 = (com.google.android.gms.internal.measurement.zzhm) r2     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzlz r2 = r2.zzch()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhl r2 = (com.google.android.gms.internal.measurement.zzhl) r2     // Catch:{ all -> 0x010f }
            T1.n0 r9 = r48.m0()     // Catch:{ all -> 0x010f }
            java.lang.Object r10 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r10 = (com.google.android.gms.internal.measurement.zzhx) r10     // Catch:{ all -> 0x010f }
            java.lang.String r10 = r10.zzF()     // Catch:{ all -> 0x010f }
            r25 = r12
            java.lang.String r12 = r2.zzo()     // Catch:{ all -> 0x010f }
            boolean r9 = r9.H(r10, r12)     // Catch:{ all -> 0x010f }
            java.lang.String r10 = "_err"
            if (r9 == 0) goto L_0x0122
            T1.Z r3 = r48.c()     // Catch:{ all -> 0x010f }
            T1.X r3 = r3.v()     // Catch:{ all -> 0x010f }
            java.lang.String r9 = "Dropping blocked raw event. appId"
            java.lang.Object r11 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r11 = (com.google.android.gms.internal.measurement.zzhx) r11     // Catch:{ all -> 0x010f }
            java.lang.String r11 = r11.zzF()     // Catch:{ all -> 0x010f }
            T1.Y r11 = T1.Z.w(r11)     // Catch:{ all -> 0x010f }
            T1.S r12 = r13.p()     // Catch:{ all -> 0x010f }
            java.lang.String r13 = r2.zzo()     // Catch:{ all -> 0x010f }
            java.lang.String r12 = r12.d(r13)     // Catch:{ all -> 0x010f }
            r3.c(r9, r11, r12)     // Catch:{ all -> 0x010f }
            T1.n0 r3 = r48.m0()     // Catch:{ all -> 0x010f }
            java.lang.Object r9 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r9 = (com.google.android.gms.internal.measurement.zzhx) r9     // Catch:{ all -> 0x010f }
            java.lang.String r9 = r9.zzF()     // Catch:{ all -> 0x010f }
            java.lang.String r11 = "measurement.upload.blacklist_internal"
            java.lang.String r3 = r3.a(r9, r11)     // Catch:{ all -> 0x010f }
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x010f }
            if (r3 != 0) goto L_0x0111
            T1.n0 r3 = r48.m0()     // Catch:{ all -> 0x010f }
            java.lang.Object r9 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r9 = (com.google.android.gms.internal.measurement.zzhx) r9     // Catch:{ all -> 0x010f }
            java.lang.String r9 = r9.zzF()     // Catch:{ all -> 0x010f }
            java.lang.String r11 = "measurement.upload.blacklist_public"
            java.lang.String r3 = r3.a(r9, r11)     // Catch:{ all -> 0x010f }
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x010f }
            if (r3 == 0) goto L_0x00e5
            goto L_0x0111
        L_0x00e5:
            java.lang.String r3 = r2.zzo()     // Catch:{ all -> 0x010f }
            boolean r3 = r10.equals(r3)     // Catch:{ all -> 0x010f }
            if (r3 != 0) goto L_0x0111
            r48.e()     // Catch:{ all -> 0x010f }
            T1.A r3 = r1.f3059S     // Catch:{ all -> 0x010f }
            java.lang.Object r9 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r9 = (com.google.android.gms.internal.measurement.zzhx) r9     // Catch:{ all -> 0x010f }
            java.lang.String r27 = r9.zzF()     // Catch:{ all -> 0x010f }
            java.lang.String r29 = "_ev"
            java.lang.String r30 = r2.zzo()     // Catch:{ all -> 0x010f }
            r31 = 0
            r28 = 11
            r26 = r3
            T1.Y1.I(r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x010f }
            goto L_0x0111
        L_0x010c:
            r2 = r0
            goto L_0x0f7d
        L_0x010f:
            r0 = move-exception
            goto L_0x010c
        L_0x0111:
            r15 = r51
            r26 = r4
            r28 = r5
            r29 = r6
            r13 = r20
            r9 = r21
            r10 = r25
            r2 = 1
            goto L_0x06a3
        L_0x0122:
            com.google.android.gms.internal.measurement.zzoy.zzb()     // Catch:{ all -> 0x010f }
            T1.g r9 = r48.h0()     // Catch:{ all -> 0x010f }
            T1.G r12 = T1.H.f2908f1     // Catch:{ all -> 0x010f }
            r26 = r4
            r4 = 0
            boolean r9 = r9.B(r4, r12)     // Catch:{ all -> 0x010f }
            if (r9 == 0) goto L_0x0188
            java.lang.String r4 = r2.zzo()     // Catch:{ all -> 0x010f }
            boolean r9 = r4.equals(r6)     // Catch:{ all -> 0x010f }
            java.lang.String r12 = "ecommerce_purchase"
            r27 = r7
            java.lang.String r7 = "_iap"
            if (r9 != 0) goto L_0x0150
            boolean r9 = r4.equals(r7)     // Catch:{ all -> 0x010f }
            if (r9 != 0) goto L_0x0150
            boolean r4 = r4.equals(r12)     // Catch:{ all -> 0x010f }
            if (r4 == 0) goto L_0x018a
        L_0x0150:
            com.google.android.gms.internal.measurement.zzhp r4 = com.google.android.gms.internal.measurement.zzhq.zze()     // Catch:{ all -> 0x010f }
            java.lang.String r9 = "_cbs"
            r4.zzj(r9)     // Catch:{ all -> 0x010f }
            if (r14 != 0) goto L_0x0178
            java.lang.Object r9 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r9 = (com.google.android.gms.internal.measurement.zzhx) r9     // Catch:{ all -> 0x010f }
            java.lang.String r9 = r9.zzF()     // Catch:{ all -> 0x010f }
            boolean r14 = r1.I(r9, r6)     // Catch:{ all -> 0x010f }
            if (r14 == 0) goto L_0x0178
            boolean r7 = r1.I(r9, r7)     // Catch:{ all -> 0x010f }
            if (r7 == 0) goto L_0x0178
            boolean r7 = r1.I(r9, r12)     // Catch:{ all -> 0x010f }
            if (r7 == 0) goto L_0x0178
            java.lang.String r7 = "new_buyer"
            goto L_0x017a
        L_0x0178:
            java.lang.String r7 = "returning_buyer"
        L_0x017a:
            r4.zzk(r7)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzmd r4 = r4.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r4 = (com.google.android.gms.internal.measurement.zzhq) r4     // Catch:{ all -> 0x010f }
            r2.zzf(r4)     // Catch:{ all -> 0x010f }
            r14 = 1
            goto L_0x018a
        L_0x0188:
            r27 = r7
        L_0x018a:
            java.lang.String r4 = r2.zzo()     // Catch:{ all -> 0x010f }
            java.lang.String[] r7 = T1.K0.f2976c     // Catch:{ all -> 0x010f }
            java.lang.String[] r9 = T1.K0.f2974a     // Catch:{ all -> 0x010f }
            java.lang.String r7 = T1.K0.e(r5, r7, r9)     // Catch:{ all -> 0x010f }
            boolean r4 = r4.equals(r7)     // Catch:{ all -> 0x010f }
            if (r4 == 0) goto L_0x01fe
            r2.zzi(r5)     // Catch:{ all -> 0x010f }
            T1.Z r4 = r48.c()     // Catch:{ all -> 0x010f }
            T1.X r4 = r4.u()     // Catch:{ all -> 0x010f }
            java.lang.String r7 = "Renaming ad_impression to _ai"
            r4.a(r7)     // Catch:{ all -> 0x010f }
            T1.Z r4 = r48.c()     // Catch:{ all -> 0x010f }
            java.lang.String r4 = r4.z()     // Catch:{ all -> 0x010f }
            r7 = 5
            boolean r4 = android.util.Log.isLoggable(r4, r7)     // Catch:{ all -> 0x010f }
            if (r4 == 0) goto L_0x01fe
            r4 = 0
        L_0x01bc:
            int r7 = r2.zza()     // Catch:{ all -> 0x010f }
            if (r4 >= r7) goto L_0x01fe
            java.lang.String r7 = "ad_platform"
            com.google.android.gms.internal.measurement.zzhq r9 = r2.zzn(r4)     // Catch:{ all -> 0x010f }
            java.lang.String r9 = r9.zzg()     // Catch:{ all -> 0x010f }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x010f }
            if (r7 == 0) goto L_0x01fb
            com.google.android.gms.internal.measurement.zzhq r7 = r2.zzn(r4)     // Catch:{ all -> 0x010f }
            java.lang.String r7 = r7.zzh()     // Catch:{ all -> 0x010f }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x010f }
            if (r7 != 0) goto L_0x01fb
            java.lang.String r7 = "admob"
            com.google.android.gms.internal.measurement.zzhq r9 = r2.zzn(r4)     // Catch:{ all -> 0x010f }
            java.lang.String r9 = r9.zzh()     // Catch:{ all -> 0x010f }
            boolean r7 = r7.equalsIgnoreCase(r9)     // Catch:{ all -> 0x010f }
            if (r7 == 0) goto L_0x01fb
            T1.Z r7 = r48.c()     // Catch:{ all -> 0x010f }
            T1.X r7 = r7.f3177t     // Catch:{ all -> 0x010f }
            java.lang.String r9 = "AdMob ad impression logged from app. Potentially duplicative."
            r7.a(r9)     // Catch:{ all -> 0x010f }
        L_0x01fb:
            r7 = 1
            int r4 = r4 + r7
            goto L_0x01bc
        L_0x01fe:
            T1.n0 r4 = r48.m0()     // Catch:{ all -> 0x010f }
            java.lang.Object r7 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r7 = (com.google.android.gms.internal.measurement.zzhx) r7     // Catch:{ all -> 0x010f }
            java.lang.String r7 = r7.zzF()     // Catch:{ all -> 0x010f }
            java.lang.String r9 = r2.zzo()     // Catch:{ all -> 0x010f }
            boolean r4 = r4.G(r7, r9)     // Catch:{ all -> 0x010f }
            java.lang.String r7 = "_c"
            if (r4 != 0) goto L_0x0245
            r48.a()     // Catch:{ all -> 0x010f }
            java.lang.String r9 = r2.zzo()     // Catch:{ all -> 0x010f }
            com.google.android.gms.common.internal.I.d(r9)     // Catch:{ all -> 0x010f }
            int r12 = r9.hashCode()     // Catch:{ all -> 0x010f }
            r28 = r5
            r5 = 95027(0x17333, float:1.33161E-40)
            if (r12 == r5) goto L_0x022c
            goto L_0x023a
        L_0x022c:
            java.lang.String r5 = "_ui"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x023a
        L_0x0234:
            r29 = r6
            r5 = 0
            r9 = 0
            r12 = 0
            goto L_0x0248
        L_0x023a:
            r29 = r6
            r30 = r14
            r31 = r15
            r4 = 0
            r15 = r51
            goto L_0x040b
        L_0x0245:
            r28 = r5
            goto L_0x0234
        L_0x0248:
            int r6 = r2.zza()     // Catch:{ all -> 0x010f }
            r30 = r14
            java.lang.String r14 = "_r"
            if (r5 >= r6) goto L_0x02af
            com.google.android.gms.internal.measurement.zzhq r6 = r2.zzn(r5)     // Catch:{ all -> 0x010f }
            java.lang.String r6 = r6.zzg()     // Catch:{ all -> 0x010f }
            boolean r6 = r7.equals(r6)     // Catch:{ all -> 0x010f }
            if (r6 == 0) goto L_0x027d
            com.google.android.gms.internal.measurement.zzhq r6 = r2.zzn(r5)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzlz r6 = r6.zzch()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhp r6 = (com.google.android.gms.internal.measurement.zzhp) r6     // Catch:{ all -> 0x010f }
            r31 = r15
            r14 = 1
            r6.zzi(r14)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzmd r6 = r6.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r6 = (com.google.android.gms.internal.measurement.zzhq) r6     // Catch:{ all -> 0x010f }
            r2.zzk(r5, r6)     // Catch:{ all -> 0x010f }
            r6 = 1
            r9 = 1
            goto L_0x02a9
        L_0x027d:
            r31 = r15
            com.google.android.gms.internal.measurement.zzhq r6 = r2.zzn(r5)     // Catch:{ all -> 0x010f }
            java.lang.String r6 = r6.zzg()     // Catch:{ all -> 0x010f }
            boolean r6 = r14.equals(r6)     // Catch:{ all -> 0x010f }
            if (r6 == 0) goto L_0x02a8
            com.google.android.gms.internal.measurement.zzhq r6 = r2.zzn(r5)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzlz r6 = r6.zzch()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhp r6 = (com.google.android.gms.internal.measurement.zzhp) r6     // Catch:{ all -> 0x010f }
            r14 = 1
            r6.zzi(r14)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzmd r6 = r6.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r6 = (com.google.android.gms.internal.measurement.zzhq) r6     // Catch:{ all -> 0x010f }
            r2.zzk(r5, r6)     // Catch:{ all -> 0x010f }
            r6 = 1
            r12 = 1
            goto L_0x02a9
        L_0x02a8:
            r6 = 1
        L_0x02a9:
            int r5 = r5 + r6
            r14 = r30
            r15 = r31
            goto L_0x0248
        L_0x02af:
            r31 = r15
            if (r9 != 0) goto L_0x02df
            if (r4 == 0) goto L_0x02df
            T1.Z r5 = r48.c()     // Catch:{ all -> 0x010f }
            T1.X r5 = r5.u()     // Catch:{ all -> 0x010f }
            java.lang.String r6 = "Marking event as conversion"
            T1.S r9 = r13.p()     // Catch:{ all -> 0x010f }
            java.lang.String r15 = r2.zzo()     // Catch:{ all -> 0x010f }
            java.lang.String r9 = r9.d(r15)     // Catch:{ all -> 0x010f }
            r5.b(r9, r6)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhp r5 = com.google.android.gms.internal.measurement.zzhq.zze()     // Catch:{ all -> 0x010f }
            r5.zzj(r7)     // Catch:{ all -> 0x010f }
            r6 = r10
            r9 = 1
            r5.zzi(r9)     // Catch:{ all -> 0x010f }
            r2.zze(r5)     // Catch:{ all -> 0x010f }
            goto L_0x02e0
        L_0x02df:
            r6 = r10
        L_0x02e0:
            if (r12 != 0) goto L_0x030a
            T1.Z r5 = r48.c()     // Catch:{ all -> 0x010f }
            T1.X r5 = r5.u()     // Catch:{ all -> 0x010f }
            java.lang.String r9 = "Marking event as real-time"
            T1.S r10 = r13.p()     // Catch:{ all -> 0x010f }
            java.lang.String r12 = r2.zzo()     // Catch:{ all -> 0x010f }
            java.lang.String r10 = r10.d(r12)     // Catch:{ all -> 0x010f }
            r5.b(r10, r9)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhp r5 = com.google.android.gms.internal.measurement.zzhq.zze()     // Catch:{ all -> 0x010f }
            r5.zzj(r14)     // Catch:{ all -> 0x010f }
            r9 = 1
            r5.zzi(r9)     // Catch:{ all -> 0x010f }
            r2.zze(r5)     // Catch:{ all -> 0x010f }
        L_0x030a:
            T1.n r32 = r48.i0()     // Catch:{ all -> 0x010f }
            long r38 = r48.v()     // Catch:{ all -> 0x010f }
            java.lang.Object r5 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r5 = (com.google.android.gms.internal.measurement.zzhx) r5     // Catch:{ all -> 0x010f }
            java.lang.String r37 = r5.zzF()     // Catch:{ all -> 0x010f }
            r33 = 0
            r34 = 1
            r35 = 0
            r36 = 0
            T1.j r5 = r32.o0(r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x010f }
            long r9 = r5.f3351e     // Catch:{ all -> 0x010f }
            T1.g r5 = r48.h0()     // Catch:{ all -> 0x010f }
            java.lang.Object r12 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r12 = (com.google.android.gms.internal.measurement.zzhx) r12     // Catch:{ all -> 0x010f }
            java.lang.String r12 = r12.zzF()     // Catch:{ all -> 0x010f }
            T1.G r13 = T1.H.f2933p     // Catch:{ all -> 0x010f }
            int r5 = r5.u(r12, r13)     // Catch:{ all -> 0x010f }
            long r12 = (long) r5     // Catch:{ all -> 0x010f }
            int r5 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x0345
            x(r2, r14)     // Catch:{ all -> 0x010f }
            r15 = r51
            goto L_0x0346
        L_0x0345:
            r15 = 1
        L_0x0346:
            java.lang.String r5 = r2.zzo()     // Catch:{ all -> 0x010f }
            boolean r5 = T1.Y1.j0(r5)     // Catch:{ all -> 0x010f }
            if (r5 == 0) goto L_0x040b
            if (r4 == 0) goto L_0x040b
            T1.n r32 = r48.i0()     // Catch:{ all -> 0x010f }
            long r38 = r48.v()     // Catch:{ all -> 0x010f }
            java.lang.Object r5 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r5 = (com.google.android.gms.internal.measurement.zzhx) r5     // Catch:{ all -> 0x010f }
            java.lang.String r37 = r5.zzF()     // Catch:{ all -> 0x010f }
            r33 = 1
            r34 = 0
            r35 = 0
            r36 = 0
            T1.j r5 = r32.o0(r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x010f }
            long r9 = r5.f3350c     // Catch:{ all -> 0x010f }
            T1.g r5 = r48.h0()     // Catch:{ all -> 0x010f }
            java.lang.Object r12 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r12 = (com.google.android.gms.internal.measurement.zzhx) r12     // Catch:{ all -> 0x010f }
            java.lang.String r12 = r12.zzF()     // Catch:{ all -> 0x010f }
            T1.G r13 = T1.H.f2930o     // Catch:{ all -> 0x010f }
            int r5 = r5.u(r12, r13)     // Catch:{ all -> 0x010f }
            long r12 = (long) r5     // Catch:{ all -> 0x010f }
            int r5 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x040b
            T1.Z r5 = r48.c()     // Catch:{ all -> 0x010f }
            T1.X r5 = r5.v()     // Catch:{ all -> 0x010f }
            java.lang.String r9 = "Too many conversions. Not logging as conversion. appId"
            java.lang.Object r10 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r10 = (com.google.android.gms.internal.measurement.zzhx) r10     // Catch:{ all -> 0x010f }
            java.lang.String r10 = r10.zzF()     // Catch:{ all -> 0x010f }
            T1.Y r10 = T1.Z.w(r10)     // Catch:{ all -> 0x010f }
            r5.b(r10, r9)     // Catch:{ all -> 0x010f }
            r5 = 0
            r9 = 0
            r10 = 0
            r12 = -1
        L_0x03a4:
            int r13 = r2.zza()     // Catch:{ all -> 0x010f }
            if (r5 >= r13) goto L_0x03cf
            com.google.android.gms.internal.measurement.zzhq r13 = r2.zzn(r5)     // Catch:{ all -> 0x010f }
            java.lang.String r14 = r13.zzg()     // Catch:{ all -> 0x010f }
            boolean r14 = r7.equals(r14)     // Catch:{ all -> 0x010f }
            if (r14 == 0) goto L_0x03c1
            com.google.android.gms.internal.measurement.zzlz r10 = r13.zzch()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhp r10 = (com.google.android.gms.internal.measurement.zzhp) r10     // Catch:{ all -> 0x010f }
            r12 = r5
        L_0x03bf:
            r13 = 1
            goto L_0x03cd
        L_0x03c1:
            java.lang.String r13 = r13.zzg()     // Catch:{ all -> 0x010f }
            boolean r13 = r6.equals(r13)     // Catch:{ all -> 0x010f }
            if (r13 == 0) goto L_0x03bf
            r9 = 1
            goto L_0x03bf
        L_0x03cd:
            int r5 = r5 + r13
            goto L_0x03a4
        L_0x03cf:
            if (r9 == 0) goto L_0x03d8
            if (r10 == 0) goto L_0x03d7
            r2.zzh(r12)     // Catch:{ all -> 0x010f }
            goto L_0x040b
        L_0x03d7:
            r10 = 0
        L_0x03d8:
            if (r10 == 0) goto L_0x03f2
            com.google.android.gms.internal.measurement.zzlz r5 = r10.zzaR()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhp r5 = (com.google.android.gms.internal.measurement.zzhp) r5     // Catch:{ all -> 0x010f }
            r5.zzj(r6)     // Catch:{ all -> 0x010f }
            r9 = 10
            r5.zzi(r9)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzmd r5 = r5.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r5 = (com.google.android.gms.internal.measurement.zzhq) r5     // Catch:{ all -> 0x010f }
            r2.zzk(r12, r5)     // Catch:{ all -> 0x010f }
            goto L_0x040b
        L_0x03f2:
            T1.Z r5 = r48.c()     // Catch:{ all -> 0x010f }
            T1.X r5 = r5.t()     // Catch:{ all -> 0x010f }
            java.lang.String r6 = "Did not find conversion parameter. appId"
            java.lang.Object r9 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r9 = (com.google.android.gms.internal.measurement.zzhx) r9     // Catch:{ all -> 0x010f }
            java.lang.String r9 = r9.zzF()     // Catch:{ all -> 0x010f }
            T1.Y r9 = T1.Z.w(r9)     // Catch:{ all -> 0x010f }
            r5.b(r9, r6)     // Catch:{ all -> 0x010f }
        L_0x040b:
            if (r4 == 0) goto L_0x04c0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x010f }
            java.util.List r5 = r2.zzp()     // Catch:{ all -> 0x010f }
            r4.<init>(r5)     // Catch:{ all -> 0x010f }
            r5 = 0
            r6 = -1
            r9 = -1
        L_0x0419:
            int r10 = r4.size()     // Catch:{ all -> 0x010f }
            java.lang.String r12 = "currency"
            java.lang.String r13 = "value"
            if (r5 >= r10) goto L_0x044a
            java.lang.Object r10 = r4.get(r5)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r10 = (com.google.android.gms.internal.measurement.zzhq) r10     // Catch:{ all -> 0x010f }
            java.lang.String r10 = r10.zzg()     // Catch:{ all -> 0x010f }
            boolean r10 = r13.equals(r10)     // Catch:{ all -> 0x010f }
            if (r10 == 0) goto L_0x0436
            r6 = r5
        L_0x0434:
            r10 = 1
            goto L_0x0448
        L_0x0436:
            java.lang.Object r10 = r4.get(r5)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r10 = (com.google.android.gms.internal.measurement.zzhq) r10     // Catch:{ all -> 0x010f }
            java.lang.String r10 = r10.zzg()     // Catch:{ all -> 0x010f }
            boolean r10 = r12.equals(r10)     // Catch:{ all -> 0x010f }
            if (r10 == 0) goto L_0x0434
            r9 = r5
            goto L_0x0434
        L_0x0448:
            int r5 = r5 + r10
            goto L_0x0419
        L_0x044a:
            r5 = -1
            if (r6 != r5) goto L_0x044f
            goto L_0x04c0
        L_0x044f:
            java.lang.Object r5 = r4.get(r6)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r5 = (com.google.android.gms.internal.measurement.zzhq) r5     // Catch:{ all -> 0x010f }
            boolean r5 = r5.zzw()     // Catch:{ all -> 0x010f }
            if (r5 != 0) goto L_0x047e
            java.lang.Object r5 = r4.get(r6)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r5 = (com.google.android.gms.internal.measurement.zzhq) r5     // Catch:{ all -> 0x010f }
            boolean r5 = r5.zzu()     // Catch:{ all -> 0x010f }
            if (r5 != 0) goto L_0x047e
            T1.Z r4 = r48.c()     // Catch:{ all -> 0x010f }
            T1.X r4 = r4.f3177t     // Catch:{ all -> 0x010f }
            java.lang.String r5 = "Value must be specified with a numeric type."
            r4.a(r5)     // Catch:{ all -> 0x010f }
            r2.zzh(r6)     // Catch:{ all -> 0x010f }
            x(r2, r7)     // Catch:{ all -> 0x010f }
            r4 = 18
            w(r2, r4, r13)     // Catch:{ all -> 0x010f }
            goto L_0x04c0
        L_0x047e:
            r5 = -1
            if (r9 != r5) goto L_0x0482
            goto L_0x04aa
        L_0x0482:
            java.lang.Object r4 = r4.get(r9)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r4 = (com.google.android.gms.internal.measurement.zzhq) r4     // Catch:{ all -> 0x010f }
            java.lang.String r4 = r4.zzh()     // Catch:{ all -> 0x010f }
            int r5 = r4.length()     // Catch:{ all -> 0x010f }
            r9 = 3
            if (r5 != r9) goto L_0x04aa
            r5 = 0
        L_0x0494:
            int r9 = r4.length()     // Catch:{ all -> 0x010f }
            if (r5 >= r9) goto L_0x04c0
            int r9 = r4.codePointAt(r5)     // Catch:{ all -> 0x010f }
            boolean r10 = java.lang.Character.isLetter(r9)     // Catch:{ all -> 0x010f }
            if (r10 == 0) goto L_0x04aa
            int r9 = java.lang.Character.charCount(r9)     // Catch:{ all -> 0x010f }
            int r5 = r5 + r9
            goto L_0x0494
        L_0x04aa:
            T1.Z r4 = r48.c()     // Catch:{ all -> 0x010f }
            T1.X r4 = r4.f3177t     // Catch:{ all -> 0x010f }
            java.lang.String r5 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r4.a(r5)     // Catch:{ all -> 0x010f }
            r2.zzh(r6)     // Catch:{ all -> 0x010f }
            x(r2, r7)     // Catch:{ all -> 0x010f }
            r4 = 19
            w(r2, r4, r12)     // Catch:{ all -> 0x010f }
        L_0x04c0:
            java.lang.String r4 = r2.zzo()     // Catch:{ all -> 0x010f }
            r5 = r31
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x010f }
            r5 = 1000(0x3e8, double:4.94E-321)
            if (r4 == 0) goto L_0x051f
            r48.a()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzmd r3 = r2.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhm r3 = (com.google.android.gms.internal.measurement.zzhm) r3     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r3 = T1.C0162d0.x(r3, r11)     // Catch:{ all -> 0x010f }
            if (r3 != 0) goto L_0x0518
            if (r17 == 0) goto L_0x050d
            long r3 = r17.zzc()     // Catch:{ all -> 0x010f }
            long r9 = r2.zzc()     // Catch:{ all -> 0x010f }
            long r3 = r3 - r9
            long r3 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x010f }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x050d
            com.google.android.gms.internal.measurement.zzlz r3 = r17.zzaR()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhl r3 = (com.google.android.gms.internal.measurement.zzhl) r3     // Catch:{ all -> 0x010f }
            boolean r4 = r1.J(r2, r3)     // Catch:{ all -> 0x010f }
            if (r4 == 0) goto L_0x050d
            r4 = r18
            r9 = r21
            r9.zzad(r4, r3)     // Catch:{ all -> 0x010f }
            r18 = r4
            r10 = r22
        L_0x0507:
            r16 = 0
            r17 = 0
            goto L_0x0571
        L_0x050d:
            r4 = r18
            r9 = r21
            r16 = r2
            r18 = r4
            r10 = r20
            goto L_0x0571
        L_0x0518:
            r4 = r18
            r9 = r21
        L_0x051c:
            r5 = r22
            goto L_0x056e
        L_0x051f:
            r4 = r18
            r9 = r21
            java.lang.String r7 = "_vs"
            java.lang.String r10 = r2.zzo()     // Catch:{ all -> 0x010f }
            boolean r7 = r7.equals(r10)     // Catch:{ all -> 0x010f }
            if (r7 == 0) goto L_0x051c
            r48.a()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzmd r7 = r2.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhm r7 = (com.google.android.gms.internal.measurement.zzhm) r7     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r3 = T1.C0162d0.x(r7, r3)     // Catch:{ all -> 0x010f }
            if (r3 != 0) goto L_0x051c
            if (r16 == 0) goto L_0x0566
            long r10 = r16.zzc()     // Catch:{ all -> 0x010f }
            long r12 = r2.zzc()     // Catch:{ all -> 0x010f }
            long r10 = r10 - r12
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x010f }
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0566
            com.google.android.gms.internal.measurement.zzlz r3 = r16.zzaR()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhl r3 = (com.google.android.gms.internal.measurement.zzhl) r3     // Catch:{ all -> 0x010f }
            boolean r5 = r1.J(r3, r2)     // Catch:{ all -> 0x010f }
            if (r5 == 0) goto L_0x0566
            r5 = r22
            r9.zzad(r5, r3)     // Catch:{ all -> 0x010f }
            r18 = r4
            r10 = r5
            goto L_0x0507
        L_0x0566:
            r5 = r22
            r17 = r2
            r10 = r5
            r18 = r20
            goto L_0x0571
        L_0x056e:
            r18 = r4
            r10 = r5
        L_0x0571:
            int r3 = r2.zza()     // Catch:{ all -> 0x010f }
            if (r3 == 0) goto L_0x0688
            r48.a()     // Catch:{ all -> 0x010f }
            java.util.List r3 = r2.zzp()     // Catch:{ all -> 0x010f }
            android.os.Bundle r3 = T1.C0162d0.w(r3)     // Catch:{ all -> 0x010f }
            r4 = 0
        L_0x0583:
            int r5 = r2.zza()     // Catch:{ all -> 0x010f }
            if (r4 >= r5) goto L_0x0636
            com.google.android.gms.internal.measurement.zzhq r5 = r2.zzn(r4)     // Catch:{ all -> 0x010f }
            java.lang.String r6 = r5.zzg()     // Catch:{ all -> 0x010f }
            r7 = r27
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x010f }
            if (r6 == 0) goto L_0x060d
            java.util.List r6 = r5.zzi()     // Catch:{ all -> 0x010f }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x010f }
            if (r6 != 0) goto L_0x060d
            java.lang.Object r6 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r6 = (com.google.android.gms.internal.measurement.zzhx) r6     // Catch:{ all -> 0x010f }
            java.lang.String r6 = r6.zzF()     // Catch:{ all -> 0x010f }
            java.util.List r5 = r5.zzi()     // Catch:{ all -> 0x010f }
            int r11 = r5.size()     // Catch:{ all -> 0x010f }
            android.os.Bundle[] r11 = new android.os.Bundle[r11]     // Catch:{ all -> 0x010f }
            r12 = 0
        L_0x05b6:
            int r13 = r5.size()     // Catch:{ all -> 0x010f }
            if (r12 >= r13) goto L_0x0606
            java.lang.Object r13 = r5.get(r12)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r13 = (com.google.android.gms.internal.measurement.zzhq) r13     // Catch:{ all -> 0x010f }
            r48.a()     // Catch:{ all -> 0x010f }
            java.util.List r14 = r13.zzi()     // Catch:{ all -> 0x010f }
            android.os.Bundle r14 = T1.C0162d0.w(r14)     // Catch:{ all -> 0x010f }
            java.util.List r13 = r13.zzi()     // Catch:{ all -> 0x010f }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x010f }
        L_0x05d5:
            boolean r21 = r13.hasNext()     // Catch:{ all -> 0x010f }
            if (r21 == 0) goto L_0x05f9
            java.lang.Object r21 = r13.next()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r21 = (com.google.android.gms.internal.measurement.zzhq) r21     // Catch:{ all -> 0x010f }
            r51 = r5
            java.lang.String r5 = r2.zzo()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzlz r21 = r21.zzch()     // Catch:{ all -> 0x010f }
            r22 = r10
            r10 = r21
            com.google.android.gms.internal.measurement.zzhp r10 = (com.google.android.gms.internal.measurement.zzhp) r10     // Catch:{ all -> 0x010f }
            r1.a0(r5, r10, r14, r6)     // Catch:{ all -> 0x010f }
            r5 = r51
            r10 = r22
            goto L_0x05d5
        L_0x05f9:
            r51 = r5
            r22 = r10
            r11[r12] = r14     // Catch:{ all -> 0x010f }
            r5 = 1
            int r12 = r12 + r5
            r5 = r51
            r10 = r22
            goto L_0x05b6
        L_0x0606:
            r22 = r10
            r3.putParcelableArray(r7, r11)     // Catch:{ all -> 0x010f }
        L_0x060b:
            r5 = 1
            goto L_0x062f
        L_0x060d:
            r22 = r10
            java.lang.String r6 = r5.zzg()     // Catch:{ all -> 0x010f }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x010f }
            if (r6 != 0) goto L_0x060b
            java.lang.String r6 = r2.zzo()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzlz r5 = r5.zzch()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhp r5 = (com.google.android.gms.internal.measurement.zzhp) r5     // Catch:{ all -> 0x010f }
            java.lang.Object r10 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r10 = (com.google.android.gms.internal.measurement.zzhx) r10     // Catch:{ all -> 0x010f }
            java.lang.String r10 = r10.zzF()     // Catch:{ all -> 0x010f }
            r1.a0(r6, r5, r3, r10)     // Catch:{ all -> 0x010f }
            goto L_0x060b
        L_0x062f:
            int r4 = r4 + r5
            r27 = r7
            r10 = r22
            goto L_0x0583
        L_0x0636:
            r22 = r10
            r7 = r27
            r2.zzg()     // Catch:{ all -> 0x010f }
            T1.d0 r4 = r48.a()     // Catch:{ all -> 0x010f }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x010f }
            r5.<init>()     // Catch:{ all -> 0x010f }
            java.util.Set r6 = r3.keySet()     // Catch:{ all -> 0x010f }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x010f }
        L_0x064e:
            boolean r10 = r6.hasNext()     // Catch:{ all -> 0x010f }
            if (r10 == 0) goto L_0x0674
            java.lang.Object r10 = r6.next()     // Catch:{ all -> 0x010f }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhp r11 = com.google.android.gms.internal.measurement.zzhq.zze()     // Catch:{ all -> 0x010f }
            r11.zzj(r10)     // Catch:{ all -> 0x010f }
            java.lang.Object r10 = r3.get(r10)     // Catch:{ all -> 0x010f }
            if (r10 == 0) goto L_0x064e
            r4.a0(r11, r10)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzmd r10 = r11.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r10 = (com.google.android.gms.internal.measurement.zzhq) r10     // Catch:{ all -> 0x010f }
            r5.add(r10)     // Catch:{ all -> 0x010f }
            goto L_0x064e
        L_0x0674:
            java.util.Iterator r3 = r5.iterator()     // Catch:{ all -> 0x010f }
        L_0x0678:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x010f }
            if (r4 == 0) goto L_0x068c
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r4 = (com.google.android.gms.internal.measurement.zzhq) r4     // Catch:{ all -> 0x010f }
            r2.zzf(r4)     // Catch:{ all -> 0x010f }
            goto L_0x0678
        L_0x0688:
            r22 = r10
            r7 = r27
        L_0x068c:
            java.lang.Object r3 = r8.d     // Catch:{ all -> 0x010f }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzmd r4 = r2.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhm r4 = (com.google.android.gms.internal.measurement.zzhm) r4     // Catch:{ all -> 0x010f }
            r10 = r25
            r3.set(r10, r4)     // Catch:{ all -> 0x010f }
            r9.zzn(r2)     // Catch:{ all -> 0x010f }
            r2 = 1
            int r13 = r20 + 1
            r14 = r30
        L_0x06a3:
            int r12 = r10 + 1
            r10 = r22
            r4 = r26
            r5 = r28
            r6 = r29
            goto L_0x004b
        L_0x06af:
            r5 = r15
            r9 = r21
            r6 = 0
            r14 = r6
            r4 = r20
            r2 = 0
        L_0x06b8:
            if (r2 >= r4) goto L_0x0706
            com.google.android.gms.internal.measurement.zzhm r10 = r9.zzh(r2)     // Catch:{ all -> 0x010f }
            java.lang.String r12 = r10.zzh()     // Catch:{ all -> 0x010f }
            boolean r12 = r5.equals(r12)     // Catch:{ all -> 0x010f }
            if (r12 == 0) goto L_0x06d9
            r48.a()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r12 = T1.C0162d0.x(r10, r11)     // Catch:{ all -> 0x010f }
            if (r12 == 0) goto L_0x06d9
            r9.zzD(r2)     // Catch:{ all -> 0x010f }
            r12 = -1
            int r4 = r4 + r12
            int r2 = r2 + r12
        L_0x06d7:
            r10 = 1
            goto L_0x0704
        L_0x06d9:
            r12 = -1
            r48.a()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r10 = T1.C0162d0.x(r10, r3)     // Catch:{ all -> 0x010f }
            if (r10 == 0) goto L_0x06d7
            boolean r16 = r10.zzw()     // Catch:{ all -> 0x010f }
            if (r16 == 0) goto L_0x06f2
            long r16 = r10.zzd()     // Catch:{ all -> 0x010f }
            java.lang.Long r10 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x010f }
            goto L_0x06f3
        L_0x06f2:
            r10 = 0
        L_0x06f3:
            if (r10 == 0) goto L_0x06d7
            long r16 = r10.longValue()     // Catch:{ all -> 0x010f }
            int r16 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r16 <= 0) goto L_0x06d7
            long r16 = r10.longValue()     // Catch:{ all -> 0x010f }
            long r14 = r14 + r16
            goto L_0x06d7
        L_0x0704:
            int r2 = r2 + r10
            goto L_0x06b8
        L_0x0706:
            r2 = 0
            r1.D(r9, r14, r2)     // Catch:{ all -> 0x010f }
            java.util.List r2 = r9.zzaM()     // Catch:{ all -> 0x010f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x010f }
        L_0x0712:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x010f }
            java.lang.String r4 = "_se"
            if (r3 == 0) goto L_0x0737
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhm r3 = (com.google.android.gms.internal.measurement.zzhm) r3     // Catch:{ all -> 0x010f }
            java.lang.String r5 = "_s"
            java.lang.String r3 = r3.zzh()     // Catch:{ all -> 0x010f }
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x010f }
            if (r3 == 0) goto L_0x0712
            T1.n r2 = r48.i0()     // Catch:{ all -> 0x010f }
            java.lang.String r3 = r9.zzaF()     // Catch:{ all -> 0x010f }
            r2.H(r3, r4)     // Catch:{ all -> 0x010f }
        L_0x0737:
            java.lang.String r2 = "_sid"
            int r2 = T1.C0162d0.I(r9, r2)     // Catch:{ all -> 0x010f }
            if (r2 < 0) goto L_0x0744
            r2 = 1
            r1.D(r9, r14, r2)     // Catch:{ all -> 0x010f }
            goto L_0x0766
        L_0x0744:
            int r2 = T1.C0162d0.I(r9, r4)     // Catch:{ all -> 0x010f }
            if (r2 < 0) goto L_0x0766
            r9.zzE(r2)     // Catch:{ all -> 0x010f }
            T1.Z r2 = r48.c()     // Catch:{ all -> 0x010f }
            T1.X r2 = r2.t()     // Catch:{ all -> 0x010f }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            java.lang.Object r4 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r4 = (com.google.android.gms.internal.measurement.zzhx) r4     // Catch:{ all -> 0x010f }
            java.lang.String r4 = r4.zzF()     // Catch:{ all -> 0x010f }
            T1.Y r4 = T1.Z.w(r4)     // Catch:{ all -> 0x010f }
            r2.b(r4, r3)     // Catch:{ all -> 0x010f }
        L_0x0766:
            java.lang.Object r2 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r2 = (com.google.android.gms.internal.measurement.zzhx) r2     // Catch:{ all -> 0x010f }
            java.lang.String r2 = r2.zzF()     // Catch:{ all -> 0x010f }
            T1.r0 r3 = r48.f()     // Catch:{ all -> 0x010f }
            r3.o()     // Catch:{ all -> 0x010f }
            r48.k()     // Catch:{ all -> 0x010f }
            T1.n r3 = r48.i0()     // Catch:{ all -> 0x010f }
            T1.V r3 = r3.l0(r2)     // Catch:{ all -> 0x010f }
            if (r3 != 0) goto L_0x0794
            T1.Z r3 = r48.c()     // Catch:{ all -> 0x010f }
            T1.X r3 = r3.t()     // Catch:{ all -> 0x010f }
            java.lang.String r4 = "Cannot fix consent fields without appInfo. appId"
            T1.Y r2 = T1.Z.w(r2)     // Catch:{ all -> 0x010f }
            r3.b(r2, r4)     // Catch:{ all -> 0x010f }
            goto L_0x0797
        L_0x0794:
            r1.o(r3, r9)     // Catch:{ all -> 0x010f }
        L_0x0797:
            java.lang.Object r2 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r2 = (com.google.android.gms.internal.measurement.zzhx) r2     // Catch:{ all -> 0x010f }
            java.lang.String r2 = r2.zzF()     // Catch:{ all -> 0x010f }
            T1.r0 r3 = r48.f()     // Catch:{ all -> 0x010f }
            r3.o()     // Catch:{ all -> 0x010f }
            r48.k()     // Catch:{ all -> 0x010f }
            T1.n r3 = r48.i0()     // Catch:{ all -> 0x010f }
            T1.V r3 = r3.l0(r2)     // Catch:{ all -> 0x010f }
            if (r3 != 0) goto L_0x07c5
            T1.Z r3 = r48.c()     // Catch:{ all -> 0x010f }
            T1.X r3 = r3.v()     // Catch:{ all -> 0x010f }
            java.lang.String r4 = "Cannot populate ad_campaign_info without appInfo. appId"
            T1.Y r2 = T1.Z.w(r2)     // Catch:{ all -> 0x010f }
            r3.b(r2, r4)     // Catch:{ all -> 0x010f }
            goto L_0x07c8
        L_0x07c5:
            r1.N(r3, r9)     // Catch:{ all -> 0x010f }
        L_0x07c8:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9.zzax(r2)     // Catch:{ all -> 0x010f }
            r2 = -9223372036854775808
            r9.zzab(r2)     // Catch:{ all -> 0x010f }
            r2 = 0
        L_0x07d6:
            int r3 = r9.zzc()     // Catch:{ all -> 0x010f }
            if (r2 >= r3) goto L_0x0809
            com.google.android.gms.internal.measurement.zzhm r3 = r9.zzh(r2)     // Catch:{ all -> 0x010f }
            long r4 = r3.zzd()     // Catch:{ all -> 0x010f }
            long r10 = r9.zzf()     // Catch:{ all -> 0x010f }
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x07f3
            long r4 = r3.zzd()     // Catch:{ all -> 0x010f }
            r9.zzax(r4)     // Catch:{ all -> 0x010f }
        L_0x07f3:
            long r4 = r3.zzd()     // Catch:{ all -> 0x010f }
            long r10 = r9.zze()     // Catch:{ all -> 0x010f }
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x0806
            long r3 = r3.zzd()     // Catch:{ all -> 0x010f }
            r9.zzab(r3)     // Catch:{ all -> 0x010f }
        L_0x0806:
            r3 = 1
            int r2 = r2 + r3
            goto L_0x07d6
        L_0x0809:
            r9.zzB()     // Catch:{ all -> 0x010f }
            T1.J0 r2 = T1.J0.f2969c     // Catch:{ all -> 0x010f }
            java.lang.Object r2 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r2 = (com.google.android.gms.internal.measurement.zzhx) r2     // Catch:{ all -> 0x010f }
            java.lang.String r2 = r2.zzF()     // Catch:{ all -> 0x010f }
            T1.J0 r2 = r1.n0(r2)     // Catch:{ all -> 0x010f }
            java.lang.Object r3 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r3 = (com.google.android.gms.internal.measurement.zzhx) r3     // Catch:{ all -> 0x010f }
            java.lang.String r3 = r3.zzK()     // Catch:{ all -> 0x010f }
            r4 = 100
            T1.J0 r3 = T1.J0.e(r4, r3)     // Catch:{ all -> 0x010f }
            T1.J0 r2 = r2.f(r3)     // Catch:{ all -> 0x010f }
            T1.n r3 = r48.i0()     // Catch:{ all -> 0x010f }
            java.lang.Object r4 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r4 = (com.google.android.gms.internal.measurement.zzhx) r4     // Catch:{ all -> 0x010f }
            java.lang.String r4 = r4.zzF()     // Catch:{ all -> 0x010f }
            T1.J0 r3 = r3.r0(r4)     // Catch:{ all -> 0x010f }
            T1.n r4 = r48.i0()     // Catch:{ all -> 0x010f }
            java.lang.Object r5 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r5 = (com.google.android.gms.internal.measurement.zzhx) r5     // Catch:{ all -> 0x010f }
            java.lang.String r5 = r5.zzF()     // Catch:{ all -> 0x010f }
            r4.L(r5, r2)     // Catch:{ all -> 0x010f }
            T1.I0 r4 = T1.I0.ANALYTICS_STORAGE     // Catch:{ all -> 0x010f }
            boolean r5 = r2.k(r4)     // Catch:{ all -> 0x010f }
            if (r5 != 0) goto L_0x0869
            boolean r5 = r3.k(r4)     // Catch:{ all -> 0x010f }
            if (r5 == 0) goto L_0x0869
            T1.n r3 = r48.i0()     // Catch:{ all -> 0x010f }
            java.lang.Object r5 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r5 = (com.google.android.gms.internal.measurement.zzhx) r5     // Catch:{ all -> 0x010f }
            java.lang.String r5 = r5.zzF()     // Catch:{ all -> 0x010f }
            r3.A(r5)     // Catch:{ all -> 0x010f }
            goto L_0x0884
        L_0x0869:
            boolean r5 = r2.k(r4)     // Catch:{ all -> 0x010f }
            if (r5 == 0) goto L_0x0884
            boolean r3 = r3.k(r4)     // Catch:{ all -> 0x010f }
            if (r3 != 0) goto L_0x0884
            T1.n r3 = r48.i0()     // Catch:{ all -> 0x010f }
            java.lang.Object r5 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r5 = (com.google.android.gms.internal.measurement.zzhx) r5     // Catch:{ all -> 0x010f }
            java.lang.String r5 = r5.zzF()     // Catch:{ all -> 0x010f }
            r3.I(r5)     // Catch:{ all -> 0x010f }
        L_0x0884:
            T1.I0 r3 = T1.I0.AD_STORAGE     // Catch:{ all -> 0x010f }
            boolean r5 = r2.k(r3)     // Catch:{ all -> 0x010f }
            if (r5 != 0) goto L_0x0895
            r9.zzz()     // Catch:{ all -> 0x010f }
            r9.zzw()     // Catch:{ all -> 0x010f }
            r9.zzt()     // Catch:{ all -> 0x010f }
        L_0x0895:
            boolean r5 = r2.k(r4)     // Catch:{ all -> 0x010f }
            if (r5 != 0) goto L_0x08a1
            r9.zzq()     // Catch:{ all -> 0x010f }
            r9.zzA()     // Catch:{ all -> 0x010f }
        L_0x08a1:
            com.google.android.gms.internal.measurement.zzqr.zzb()     // Catch:{ all -> 0x010f }
            T1.g r5 = r48.h0()     // Catch:{ all -> 0x010f }
            java.lang.Object r10 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r10 = (com.google.android.gms.internal.measurement.zzhx) r10     // Catch:{ all -> 0x010f }
            java.lang.String r10 = r10.zzF()     // Catch:{ all -> 0x010f }
            T1.G r11 = T1.H.f2884V0     // Catch:{ all -> 0x010f }
            boolean r5 = r5.B(r10, r11)     // Catch:{ all -> 0x010f }
            if (r5 == 0) goto L_0x08e8
            r48.e()     // Catch:{ all -> 0x010f }
            java.lang.Object r5 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r5 = (com.google.android.gms.internal.measurement.zzhx) r5     // Catch:{ all -> 0x010f }
            java.lang.String r5 = r5.zzF()     // Catch:{ all -> 0x010f }
            boolean r5 = T1.Y1.W(r5)     // Catch:{ all -> 0x010f }
            if (r5 == 0) goto L_0x08e8
            java.lang.Object r5 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r5 = (com.google.android.gms.internal.measurement.zzhx) r5     // Catch:{ all -> 0x010f }
            java.lang.String r5 = r5.zzF()     // Catch:{ all -> 0x010f }
            T1.J0 r5 = r1.n0(r5)     // Catch:{ all -> 0x010f }
            boolean r3 = r5.k(r3)     // Catch:{ all -> 0x010f }
            if (r3 == 0) goto L_0x08e8
            java.lang.Object r3 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r3 = (com.google.android.gms.internal.measurement.zzhx) r3     // Catch:{ all -> 0x010f }
            boolean r3 = r3.zzbt()     // Catch:{ all -> 0x010f }
            if (r3 == 0) goto L_0x08e8
            r1.p(r9, r8)     // Catch:{ all -> 0x010f }
        L_0x08e8:
            r9.zzr()     // Catch:{ all -> 0x010f }
            T1.c r25 = r48.g0()     // Catch:{ all -> 0x010f }
            java.lang.String r26 = r9.zzaF()     // Catch:{ all -> 0x010f }
            java.util.List r27 = r9.zzaM()     // Catch:{ all -> 0x010f }
            java.util.List r28 = r9.zzaN()     // Catch:{ all -> 0x010f }
            long r10 = r9.zzf()     // Catch:{ all -> 0x010f }
            java.lang.Long r29 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x010f }
            long r10 = r9.zze()     // Catch:{ all -> 0x010f }
            java.lang.Long r30 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x010f }
            boolean r2 = r2.k(r4)     // Catch:{ all -> 0x010f }
            r3 = 1
            r31 = r2 ^ 1
            java.util.ArrayList r2 = r25.s(r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x010f }
            r9.zzi(r2)     // Catch:{ all -> 0x010f }
            T1.g r2 = r48.h0()     // Catch:{ all -> 0x010f }
            java.lang.Object r3 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r3 = (com.google.android.gms.internal.measurement.zzhx) r3     // Catch:{ all -> 0x010f }
            java.lang.String r3 = r3.zzF()     // Catch:{ all -> 0x010f }
            boolean r2 = r2.q(r3)     // Catch:{ all -> 0x010f }
            if (r2 == 0) goto L_0x0cd6
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x010f }
            r2.<init>()     // Catch:{ all -> 0x010f }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x010f }
            r3.<init>()     // Catch:{ all -> 0x010f }
            T1.Y1 r4 = r48.e()     // Catch:{ all -> 0x010f }
            java.security.SecureRandom r4 = r4.A()     // Catch:{ all -> 0x010f }
            r5 = 0
        L_0x093e:
            int r10 = r9.zzc()     // Catch:{ all -> 0x010f }
            java.lang.String r11 = "events"
            if (r5 >= r10) goto L_0x0c97
            com.google.android.gms.internal.measurement.zzhm r10 = r9.zzh(r5)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzlz r10 = r10.zzch()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhl r10 = (com.google.android.gms.internal.measurement.zzhl) r10     // Catch:{ all -> 0x010f }
            java.lang.String r12 = r10.zzo()     // Catch:{ all -> 0x010f }
            java.lang.String r14 = "_ep"
            boolean r12 = r12.equals(r14)     // Catch:{ all -> 0x010f }
            java.lang.String r14 = "_efs"
            java.lang.String r15 = "_sr"
            if (r12 == 0) goto L_0x09da
            r48.a()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzmd r12 = r10.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhm r12 = (com.google.android.gms.internal.measurement.zzhm) r12     // Catch:{ all -> 0x010f }
            java.lang.String r6 = "_en"
            java.io.Serializable r6 = T1.C0162d0.y(r12, r6)     // Catch:{ all -> 0x010f }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x010f }
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x010f }
            T1.s r7 = (T1.C0205s) r7     // Catch:{ all -> 0x010f }
            if (r7 != 0) goto L_0x0991
            T1.n r7 = r48.i0()     // Catch:{ all -> 0x010f }
            java.lang.Object r12 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r12 = (com.google.android.gms.internal.measurement.zzhx) r12     // Catch:{ all -> 0x010f }
            java.lang.String r12 = r12.zzF()     // Catch:{ all -> 0x010f }
            com.google.android.gms.common.internal.I.g(r6)     // Catch:{ all -> 0x010f }
            T1.s r7 = r7.Q(r11, r12, r6)     // Catch:{ all -> 0x010f }
            if (r7 == 0) goto L_0x0991
            r2.put(r6, r7)     // Catch:{ all -> 0x010f }
        L_0x0991:
            if (r7 == 0) goto L_0x09ca
            java.lang.Long r6 = r7.f3461i     // Catch:{ all -> 0x010f }
            if (r6 != 0) goto L_0x09ca
            java.lang.Long r6 = r7.f3462j     // Catch:{ all -> 0x010f }
            if (r6 == 0) goto L_0x09ab
            long r11 = r6.longValue()     // Catch:{ all -> 0x010f }
            r18 = 1
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 <= 0) goto L_0x09ab
            r48.a()     // Catch:{ all -> 0x010f }
            T1.C0162d0.v(r10, r15, r6)     // Catch:{ all -> 0x010f }
        L_0x09ab:
            java.lang.Boolean r6 = r7.f3463k     // Catch:{ all -> 0x010f }
            if (r6 == 0) goto L_0x09c1
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x010f }
            if (r6 == 0) goto L_0x09c1
            r48.a()     // Catch:{ all -> 0x010f }
            r6 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x010f }
            T1.C0162d0.v(r10, r14, r11)     // Catch:{ all -> 0x010f }
        L_0x09c1:
            com.google.android.gms.internal.measurement.zzmd r6 = r10.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhm r6 = (com.google.android.gms.internal.measurement.zzhm) r6     // Catch:{ all -> 0x010f }
            r3.add(r6)     // Catch:{ all -> 0x010f }
        L_0x09ca:
            r9.zzad(r5, r10)     // Catch:{ all -> 0x010f }
            r1 = r2
            r47 = r3
            r43 = r4
            r2 = r5
            r42 = r8
            r22 = r13
        L_0x09d7:
            r3 = 1
            goto L_0x0c86
        L_0x09da:
            T1.n0 r6 = r48.m0()     // Catch:{ all -> 0x010f }
            java.lang.Object r7 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r7 = (com.google.android.gms.internal.measurement.zzhx) r7     // Catch:{ all -> 0x010f }
            java.lang.String r7 = r7.zzF()     // Catch:{ all -> 0x010f }
            java.lang.String r12 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r12 = r6.a(r7, r12)     // Catch:{ all -> 0x010f }
            boolean r18 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x010f }
            if (r18 != 0) goto L_0x0a0e
            long r6 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x09f7 }
            goto L_0x0a10
        L_0x09f7:
            r0 = move-exception
            r12 = r0
            java.lang.Object r6 = r6.f398a     // Catch:{ all -> 0x010f }
            T1.u0 r6 = (T1.C0212u0) r6     // Catch:{ all -> 0x010f }
            T1.Z r6 = r6.c()     // Catch:{ all -> 0x010f }
            T1.X r6 = r6.v()     // Catch:{ all -> 0x010f }
            java.lang.String r1 = "Unable to parse timezone offset. appId"
            T1.Y r7 = T1.Z.w(r7)     // Catch:{ all -> 0x010f }
            r6.c(r1, r7, r12)     // Catch:{ all -> 0x010f }
        L_0x0a0e:
            r6 = 0
        L_0x0a10:
            r48.e()     // Catch:{ all -> 0x010f }
            long r18 = r10.zzc()     // Catch:{ all -> 0x010f }
            r20 = 60000(0xea60, double:2.9644E-319)
            long r6 = r6 * r20
            long r18 = r6 + r18
            r20 = 86400000(0x5265c00, double:4.2687272E-316)
            long r18 = r18 / r20
            com.google.android.gms.internal.measurement.zzmd r1 = r10.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhm r1 = (com.google.android.gms.internal.measurement.zzhm) r1     // Catch:{ all -> 0x010f }
            r22 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x010f }
            r22 = r13
            java.lang.String r13 = "_dbg"
            boolean r25 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x010f }
            if (r25 != 0) goto L_0x0a6d
            java.util.List r1 = r1.zzi()     // Catch:{ all -> 0x010f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x010f }
        L_0x0a41:
            boolean r25 = r1.hasNext()     // Catch:{ all -> 0x010f }
            if (r25 == 0) goto L_0x0a6d
            java.lang.Object r25 = r1.next()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhq r25 = (com.google.android.gms.internal.measurement.zzhq) r25     // Catch:{ all -> 0x010f }
            r26 = r1
            java.lang.String r1 = r25.zzg()     // Catch:{ all -> 0x010f }
            boolean r1 = r13.equals(r1)     // Catch:{ all -> 0x010f }
            if (r1 == 0) goto L_0x0a6a
            long r25 = r25.zzd()     // Catch:{ all -> 0x010f }
            java.lang.Long r1 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x010f }
            boolean r1 = r12.equals(r1)     // Catch:{ all -> 0x010f }
            if (r1 != 0) goto L_0x0a68
            goto L_0x0a6d
        L_0x0a68:
            r1 = 1
            goto L_0x0a81
        L_0x0a6a:
            r1 = r26
            goto L_0x0a41
        L_0x0a6d:
            T1.n0 r1 = r48.m0()     // Catch:{ all -> 0x010f }
            java.lang.Object r12 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r12 = (com.google.android.gms.internal.measurement.zzhx) r12     // Catch:{ all -> 0x010f }
            java.lang.String r12 = r12.zzF()     // Catch:{ all -> 0x010f }
            java.lang.String r13 = r10.zzo()     // Catch:{ all -> 0x010f }
            int r1 = r1.A(r12, r13)     // Catch:{ all -> 0x010f }
        L_0x0a81:
            if (r1 > 0) goto L_0x0aae
            T1.Z r6 = r48.c()     // Catch:{ all -> 0x010f }
            T1.X r6 = r6.v()     // Catch:{ all -> 0x010f }
            java.lang.String r7 = "Sample rate must be positive. event, rate"
            java.lang.String r11 = r10.zzo()     // Catch:{ all -> 0x010f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x010f }
            r6.c(r7, r11, r1)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzmd r1 = r10.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhm r1 = (com.google.android.gms.internal.measurement.zzhm) r1     // Catch:{ all -> 0x010f }
            r3.add(r1)     // Catch:{ all -> 0x010f }
            r9.zzad(r5, r10)     // Catch:{ all -> 0x010f }
        L_0x0aa4:
            r1 = r2
            r47 = r3
            r43 = r4
            r2 = r5
            r42 = r8
            goto L_0x09d7
        L_0x0aae:
            java.lang.String r12 = r10.zzo()     // Catch:{ all -> 0x010f }
            java.lang.Object r12 = r2.get(r12)     // Catch:{ all -> 0x010f }
            T1.s r12 = (T1.C0205s) r12     // Catch:{ all -> 0x010f }
            if (r12 != 0) goto L_0x0b13
            T1.n r12 = r48.i0()     // Catch:{ all -> 0x010f }
            java.lang.Object r13 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r13 = (com.google.android.gms.internal.measurement.zzhx) r13     // Catch:{ all -> 0x010f }
            java.lang.String r13 = r13.zzF()     // Catch:{ all -> 0x010f }
            r25 = r14
            java.lang.String r14 = r10.zzo()     // Catch:{ all -> 0x010f }
            T1.s r12 = r12.Q(r11, r13, r14)     // Catch:{ all -> 0x010f }
            if (r12 != 0) goto L_0x0b15
            T1.Z r11 = r48.c()     // Catch:{ all -> 0x010f }
            T1.X r11 = r11.v()     // Catch:{ all -> 0x010f }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            java.lang.Object r13 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r13 = (com.google.android.gms.internal.measurement.zzhx) r13     // Catch:{ all -> 0x010f }
            java.lang.String r13 = r13.zzF()     // Catch:{ all -> 0x010f }
            java.lang.String r14 = r10.zzo()     // Catch:{ all -> 0x010f }
            r11.c(r12, r13, r14)     // Catch:{ all -> 0x010f }
            T1.s r12 = new T1.s     // Catch:{ all -> 0x010f }
            java.lang.Object r11 = r8.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r11 = (com.google.android.gms.internal.measurement.zzhx) r11     // Catch:{ all -> 0x010f }
            java.lang.String r27 = r11.zzF()     // Catch:{ all -> 0x010f }
            java.lang.String r28 = r10.zzo()     // Catch:{ all -> 0x010f }
            long r35 = r10.zzc()     // Catch:{ all -> 0x010f }
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r29 = 1
            r31 = 1
            r33 = 1
            r37 = 0
            r26 = r12
            r26.<init>(r27, r28, r29, r31, r33, r35, r37, r39, r40, r41, r42)     // Catch:{ all -> 0x010f }
            goto L_0x0b15
        L_0x0b13:
            r25 = r14
        L_0x0b15:
            r48.a()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzmd r11 = r10.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhm r11 = (com.google.android.gms.internal.measurement.zzhm) r11     // Catch:{ all -> 0x010f }
            java.lang.String r13 = "_eid"
            java.io.Serializable r11 = T1.C0162d0.y(r11, r13)     // Catch:{ all -> 0x010f }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x010f }
            if (r11 == 0) goto L_0x0b2b
            r13 = 1
        L_0x0b29:
            r14 = 1
            goto L_0x0b2d
        L_0x0b2b:
            r13 = 0
            goto L_0x0b29
        L_0x0b2d:
            if (r1 != r14) goto L_0x0b57
            com.google.android.gms.internal.measurement.zzmd r1 = r10.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhm r1 = (com.google.android.gms.internal.measurement.zzhm) r1     // Catch:{ all -> 0x010f }
            r3.add(r1)     // Catch:{ all -> 0x010f }
            if (r13 == 0) goto L_0x0b52
            java.lang.Long r1 = r12.f3461i     // Catch:{ all -> 0x010f }
            if (r1 != 0) goto L_0x0b46
            java.lang.Long r1 = r12.f3462j     // Catch:{ all -> 0x010f }
            if (r1 != 0) goto L_0x0b46
            java.lang.Boolean r1 = r12.f3463k     // Catch:{ all -> 0x010f }
            if (r1 == 0) goto L_0x0b52
        L_0x0b46:
            r1 = 0
            T1.s r6 = r12.a(r1, r1, r1)     // Catch:{ all -> 0x010f }
            java.lang.String r1 = r10.zzo()     // Catch:{ all -> 0x010f }
            r2.put(r1, r6)     // Catch:{ all -> 0x010f }
        L_0x0b52:
            r9.zzad(r5, r10)     // Catch:{ all -> 0x010f }
            goto L_0x0aa4
        L_0x0b57:
            int r14 = r4.nextInt(r1)     // Catch:{ all -> 0x010f }
            if (r14 != 0) goto L_0x0bd0
            r48.a()     // Catch:{ all -> 0x010f }
            long r6 = (long) r1     // Catch:{ all -> 0x010f }
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x010f }
            T1.C0162d0.v(r10, r15, r1)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzmd r6 = r10.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhm r6 = (com.google.android.gms.internal.measurement.zzhm) r6     // Catch:{ all -> 0x010f }
            r3.add(r6)     // Catch:{ all -> 0x010f }
            if (r13 == 0) goto L_0x0b78
            r6 = 0
            T1.s r12 = r12.a(r6, r1, r6)     // Catch:{ all -> 0x010f }
        L_0x0b78:
            java.lang.String r1 = r10.zzo()     // Catch:{ all -> 0x010f }
            long r36 = r10.zzc()     // Catch:{ all -> 0x010f }
            T1.s r6 = new T1.s     // Catch:{ all -> 0x010f }
            java.lang.Long r38 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0bcb }
            long r13 = r12.f3459e     // Catch:{ all -> 0x0bcb }
            r42 = r8
            long r7 = r12.f3460f     // Catch:{ all -> 0x0bcb }
            java.lang.String r11 = r12.f3456a     // Catch:{ all -> 0x0bcb }
            java.lang.String r15 = r12.f3457b     // Catch:{ all -> 0x0bcb }
            r43 = r4
            r44 = r5
            long r4 = r12.f3458c     // Catch:{ all -> 0x0bcb }
            r45 = r9
            r46 = r10
            long r9 = r12.d     // Catch:{ all -> 0x0bcb }
            r47 = r3
            java.lang.Long r3 = r12.f3461i     // Catch:{ all -> 0x0bcb }
            r20 = r1
            java.lang.Long r1 = r12.f3462j     // Catch:{ all -> 0x0bcb }
            java.lang.Boolean r12 = r12.f3463k     // Catch:{ all -> 0x0bcb }
            r25 = r6
            r26 = r11
            r27 = r15
            r28 = r4
            r30 = r9
            r32 = r13
            r34 = r7
            r39 = r3
            r40 = r1
            r41 = r12
            r25.<init>(r26, r27, r28, r30, r32, r34, r36, r38, r39, r40, r41)     // Catch:{ all -> 0x0bcb }
            r1 = r20
            r2.put(r1, r6)     // Catch:{ all -> 0x010f }
            r1 = r2
            r2 = r44
            r9 = r45
            r10 = r46
            goto L_0x0c81
        L_0x0bcb:
            r0 = move-exception
        L_0x0bcc:
            r1 = r0
            r2 = r1
            goto L_0x0f7d
        L_0x0bd0:
            r47 = r3
            r43 = r4
            r44 = r5
            r42 = r8
            r45 = r9
            r46 = r10
            java.lang.Long r3 = r12.h     // Catch:{ all -> 0x010f }
            if (r3 == 0) goto L_0x0be5
            long r3 = r3.longValue()     // Catch:{ all -> 0x010f }
            goto L_0x0bef
        L_0x0be5:
            r48.e()     // Catch:{ all -> 0x010f }
            long r3 = r46.zzb()     // Catch:{ all -> 0x010f }
            long r6 = r6 + r3
            long r3 = r6 / r20
        L_0x0bef:
            int r3 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r3 == 0) goto L_0x0c6f
            r48.a()     // Catch:{ all -> 0x010f }
            r3 = 1
            java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x010f }
            r6 = r25
            r10 = r46
            T1.C0162d0.v(r10, r6, r5)     // Catch:{ all -> 0x010f }
            r48.a()     // Catch:{ all -> 0x010f }
            long r5 = (long) r1     // Catch:{ all -> 0x010f }
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x010f }
            T1.C0162d0.v(r10, r15, r1)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzmd r5 = r10.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhm r5 = (com.google.android.gms.internal.measurement.zzhm) r5     // Catch:{ all -> 0x010f }
            r6 = r47
            r6.add(r5)     // Catch:{ all -> 0x010f }
            if (r13 == 0) goto L_0x0c22
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x010f }
            r7 = 0
            T1.s r12 = r12.a(r7, r1, r5)     // Catch:{ all -> 0x010f }
        L_0x0c22:
            java.lang.String r1 = r10.zzo()     // Catch:{ all -> 0x010f }
            long r34 = r10.zzc()     // Catch:{ all -> 0x010f }
            T1.s r5 = new T1.s     // Catch:{ all -> 0x010f }
            java.lang.Long r36 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0c6c }
            long r7 = r12.f3459e     // Catch:{ all -> 0x0c6c }
            long r13 = r12.f3460f     // Catch:{ all -> 0x0c6c }
            java.lang.String r9 = r12.f3456a     // Catch:{ all -> 0x0c6c }
            java.lang.String r11 = r12.f3457b     // Catch:{ all -> 0x0c6c }
            long r3 = r12.f3458c     // Catch:{ all -> 0x0c6c }
            r20 = r1
            r15 = r2
            long r1 = r12.d     // Catch:{ all -> 0x0c6c }
            r21 = r15
            java.lang.Long r15 = r12.f3461i     // Catch:{ all -> 0x0c6c }
            r47 = r6
            java.lang.Long r6 = r12.f3462j     // Catch:{ all -> 0x0c6c }
            java.lang.Boolean r12 = r12.f3463k     // Catch:{ all -> 0x0c6c }
            r23 = r5
            r24 = r9
            r25 = r11
            r26 = r3
            r28 = r1
            r30 = r7
            r32 = r13
            r37 = r15
            r38 = r6
            r39 = r12
            r23.<init>(r24, r25, r26, r28, r30, r32, r34, r36, r37, r38, r39)     // Catch:{ all -> 0x0c6c }
            r2 = r20
            r1 = r21
            r1.put(r2, r5)     // Catch:{ all -> 0x010f }
        L_0x0c67:
            r2 = r44
            r9 = r45
            goto L_0x0c81
        L_0x0c6c:
            r0 = move-exception
            goto L_0x0bcc
        L_0x0c6f:
            r1 = r2
            r10 = r46
            if (r13 == 0) goto L_0x0c67
            java.lang.String r2 = r10.zzo()     // Catch:{ all -> 0x010f }
            r3 = 0
            T1.s r4 = r12.a(r11, r3, r3)     // Catch:{ all -> 0x010f }
            r1.put(r2, r4)     // Catch:{ all -> 0x010f }
            goto L_0x0c67
        L_0x0c81:
            r9.zzad(r2, r10)     // Catch:{ all -> 0x010f }
            goto L_0x09d7
        L_0x0c86:
            int r5 = r2 + 1
            r2 = r1
            r13 = r22
            r8 = r42
            r4 = r43
            r3 = r47
            r6 = 0
            r1 = r48
            goto L_0x093e
        L_0x0c97:
            r1 = r2
            r47 = r3
            r42 = r8
            r22 = r13
            r3 = 1
            int r2 = r47.size()     // Catch:{ all -> 0x010f }
            int r4 = r9.zzc()     // Catch:{ all -> 0x010f }
            if (r2 >= r4) goto L_0x0cb1
            r9.zzu()     // Catch:{ all -> 0x010f }
            r2 = r47
            r9.zzj(r2)     // Catch:{ all -> 0x010f }
        L_0x0cb1:
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x010f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x010f }
        L_0x0cb9:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x010f }
            if (r2 == 0) goto L_0x0cd3
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x010f }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x010f }
            T1.n r4 = r48.i0()     // Catch:{ all -> 0x010f }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x010f }
            T1.s r2 = (T1.C0205s) r2     // Catch:{ all -> 0x010f }
            r4.V(r11, r2)     // Catch:{ all -> 0x010f }
            goto L_0x0cb9
        L_0x0cd3:
            r1 = r42
            goto L_0x0cda
        L_0x0cd6:
            r22 = r13
            r3 = 1
            r1 = r8
        L_0x0cda:
            java.lang.Object r2 = r1.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r2 = (com.google.android.gms.internal.measurement.zzhx) r2     // Catch:{ all -> 0x010f }
            java.lang.String r2 = r2.zzF()     // Catch:{ all -> 0x010f }
            T1.n r4 = r48.i0()     // Catch:{ all -> 0x010f }
            T1.V r4 = r4.l0(r2)     // Catch:{ all -> 0x010f }
            if (r4 != 0) goto L_0x0d07
            T1.Z r4 = r48.c()     // Catch:{ all -> 0x010f }
            T1.X r4 = r4.t()     // Catch:{ all -> 0x010f }
            java.lang.String r5 = "Bundling raw events w/o app info. appId"
            java.lang.Object r6 = r1.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r6 = (com.google.android.gms.internal.measurement.zzhx) r6     // Catch:{ all -> 0x010f }
            java.lang.String r6 = r6.zzF()     // Catch:{ all -> 0x010f }
            T1.Y r6 = T1.Z.w(r6)     // Catch:{ all -> 0x010f }
            r4.b(r6, r5)     // Catch:{ all -> 0x010f }
            goto L_0x0d9d
        L_0x0d07:
            int r5 = r9.zzc()     // Catch:{ all -> 0x010f }
            if (r5 <= 0) goto L_0x0d9d
            T1.u0 r5 = r4.f3103a     // Catch:{ all -> 0x010f }
            T1.r0 r5 = r5.f3497s     // Catch:{ all -> 0x0d9a }
            T1.C0212u0.k(r5)     // Catch:{ all -> 0x0d9a }
            r5.o()     // Catch:{ all -> 0x0d9a }
            long r5 = r4.f3108i     // Catch:{ all -> 0x0d9a }
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0d23
            r9.zzap(r5)     // Catch:{ all -> 0x010f }
            goto L_0x0d26
        L_0x0d23:
            r9.zzx()     // Catch:{ all -> 0x010f }
        L_0x0d26:
            T1.u0 r7 = r4.f3103a     // Catch:{ all -> 0x010f }
            T1.r0 r7 = r7.f3497s     // Catch:{ all -> 0x0d97 }
            T1.C0212u0.k(r7)     // Catch:{ all -> 0x0d97 }
            r7.o()     // Catch:{ all -> 0x0d97 }
            long r7 = r4.h     // Catch:{ all -> 0x0d97 }
            r10 = 0
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0d39
            goto L_0x0d3a
        L_0x0d39:
            r5 = r7
        L_0x0d3a:
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0d42
            r9.zzaq(r5)     // Catch:{ all -> 0x010f }
            goto L_0x0d45
        L_0x0d42:
            r9.zzy()     // Catch:{ all -> 0x010f }
        L_0x0d45:
            int r5 = r9.zzc()     // Catch:{ all -> 0x010f }
            long r5 = (long) r5     // Catch:{ all -> 0x010f }
            r4.j(r5)     // Catch:{ all -> 0x010f }
            T1.u0 r5 = r4.f3103a     // Catch:{ all -> 0x010f }
            T1.r0 r5 = r5.f3497s     // Catch:{ all -> 0x0d94 }
            T1.C0212u0.k(r5)     // Catch:{ all -> 0x0d94 }
            r5.o()     // Catch:{ all -> 0x0d94 }
            long r5 = r4.f3089G     // Catch:{ all -> 0x0d94 }
            int r5 = (int) r5
            r9.zzV(r5)     // Catch:{ all -> 0x010f }
            T1.u0 r5 = r4.f3103a     // Catch:{ all -> 0x010f }
            T1.r0 r5 = r5.f3497s     // Catch:{ all -> 0x0d91 }
            T1.C0212u0.k(r5)     // Catch:{ all -> 0x0d91 }
            r5.o()     // Catch:{ all -> 0x0d91 }
            long r5 = r4.g     // Catch:{ all -> 0x0d91 }
            int r5 = (int) r5
            r9.zzP(r5)     // Catch:{ all -> 0x010f }
            long r5 = r9.zzf()     // Catch:{ all -> 0x010f }
            r4.N(r5)     // Catch:{ all -> 0x010f }
            long r5 = r9.zze()     // Catch:{ all -> 0x010f }
            r4.L(r5)     // Catch:{ all -> 0x010f }
            java.lang.String r5 = r4.b()     // Catch:{ all -> 0x010f }
            if (r5 == 0) goto L_0x0d85
            r9.zzaj(r5)     // Catch:{ all -> 0x010f }
            goto L_0x0d88
        L_0x0d85:
            r9.zzv()     // Catch:{ all -> 0x010f }
        L_0x0d88:
            T1.n r5 = r48.i0()     // Catch:{ all -> 0x010f }
            r6 = 0
            r5.K(r4, r6)     // Catch:{ all -> 0x010f }
            goto L_0x0d9d
        L_0x0d91:
            r0 = move-exception
            goto L_0x0bcc
        L_0x0d94:
            r0 = move-exception
            goto L_0x0bcc
        L_0x0d97:
            r0 = move-exception
            goto L_0x0bcc
        L_0x0d9a:
            r0 = move-exception
            goto L_0x0bcc
        L_0x0d9d:
            int r4 = r9.zzc()     // Catch:{ all -> 0x010f }
            if (r4 <= 0) goto L_0x0f31
            r22.getClass()     // Catch:{ all -> 0x010f }
            T1.n0 r4 = r48.m0()     // Catch:{ all -> 0x010f }
            java.lang.Object r5 = r1.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r5 = (com.google.android.gms.internal.measurement.zzhx) r5     // Catch:{ all -> 0x010f }
            java.lang.String r5 = r5.zzF()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzgo r4 = r4.D(r5)     // Catch:{ all -> 0x010f }
            r5 = -1
            if (r4 == 0) goto L_0x0dc9
            boolean r7 = r4.zzw()     // Catch:{ all -> 0x010f }
            if (r7 != 0) goto L_0x0dc1
            goto L_0x0dc9
        L_0x0dc1:
            long r7 = r4.zzc()     // Catch:{ all -> 0x010f }
            r9.zzR(r7)     // Catch:{ all -> 0x010f }
            goto L_0x0df4
        L_0x0dc9:
            java.lang.Object r4 = r1.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r4 = (com.google.android.gms.internal.measurement.zzhx) r4     // Catch:{ all -> 0x010f }
            java.lang.String r4 = r4.zzP()     // Catch:{ all -> 0x010f }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x010f }
            if (r4 == 0) goto L_0x0ddb
            r9.zzR(r5)     // Catch:{ all -> 0x010f }
            goto L_0x0df4
        L_0x0ddb:
            T1.Z r4 = r48.c()     // Catch:{ all -> 0x010f }
            T1.X r4 = r4.v()     // Catch:{ all -> 0x010f }
            java.lang.String r7 = "Did not find measurement config or missing version info. appId"
            java.lang.Object r8 = r1.f490b     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r8 = (com.google.android.gms.internal.measurement.zzhx) r8     // Catch:{ all -> 0x010f }
            java.lang.String r8 = r8.zzF()     // Catch:{ all -> 0x010f }
            T1.Y r8 = T1.Z.w(r8)     // Catch:{ all -> 0x010f }
            r4.b(r8, r7)     // Catch:{ all -> 0x010f }
        L_0x0df4:
            T1.n r4 = r48.i0()     // Catch:{ all -> 0x010f }
            java.lang.Object r7 = r4.f398a
            T1.u0 r7 = (T1.C0212u0) r7
            com.google.android.gms.internal.measurement.zzmd r8 = r9.zzba()     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.measurement.zzhx r8 = (com.google.android.gms.internal.measurement.zzhx) r8     // Catch:{ all -> 0x010f }
            r4.o()     // Catch:{ all -> 0x010f }
            r4.p()     // Catch:{ all -> 0x010f }
            com.google.android.gms.common.internal.I.g(r8)     // Catch:{ all -> 0x010f }
            java.lang.String r9 = r8.zzF()     // Catch:{ all -> 0x010f }
            com.google.android.gms.common.internal.I.d(r9)     // Catch:{ all -> 0x010f }
            boolean r9 = r8.zzbK()     // Catch:{ all -> 0x010f }
            if (r9 == 0) goto L_0x0f28
            r4.G()     // Catch:{ all -> 0x010f }
            G1.a r9 = r7.g()     // Catch:{ all -> 0x010f }
            G1.b r9 = (G1.b) r9     // Catch:{ all -> 0x010f }
            long r9 = r9.a()     // Catch:{ all -> 0x010f }
            long r11 = r8.zzo()     // Catch:{ all -> 0x010f }
            T1.G r13 = T1.H.f2873Q     // Catch:{ all -> 0x010f }
            r14 = 0
            java.lang.Object r15 = r13.a(r14)     // Catch:{ all -> 0x0f25 }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x0f25 }
            long r15 = r15.longValue()     // Catch:{ all -> 0x0f25 }
            long r15 = r9 - r15
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 < 0) goto L_0x0e53
            long r11 = r8.zzo()     // Catch:{ all -> 0x010f }
            java.lang.Object r13 = r13.a(r14)     // Catch:{ all -> 0x010f }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x0e50 }
            long r13 = r13.longValue()     // Catch:{ all -> 0x0e50 }
            long r13 = r13 + r9
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0e74
            goto L_0x0e53
        L_0x0e50:
            r0 = move-exception
            goto L_0x0bcc
        L_0x0e53:
            T1.Z r11 = r7.c()     // Catch:{ all -> 0x010f }
            T1.X r11 = r11.v()     // Catch:{ all -> 0x010f }
            java.lang.String r12 = r8.zzF()     // Catch:{ all -> 0x010f }
            T1.Y r12 = T1.Z.w(r12)     // Catch:{ all -> 0x010f }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x010f }
            long r13 = r8.zzo()     // Catch:{ all -> 0x010f }
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x010f }
            java.lang.String r13 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            r11.d(r13, r12, r9, r10)     // Catch:{ all -> 0x010f }
        L_0x0e74:
            byte[] r9 = r8.zzcd()     // Catch:{ all -> 0x010f }
            T1.T1 r10 = r4.f2982b     // Catch:{ IOException -> 0x0f0d }
            T1.d0 r10 = r10.a()     // Catch:{ IOException -> 0x0f0d }
            byte[] r9 = r10.t(r9)     // Catch:{ IOException -> 0x0f0d }
            T1.Z r10 = r7.c()     // Catch:{ all -> 0x010f }
            T1.X r10 = r10.u()     // Catch:{ all -> 0x010f }
            int r11 = r9.length     // Catch:{ all -> 0x010f }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x010f }
            java.lang.String r12 = "Saving bundle, size"
            r10.b(r11, r12)     // Catch:{ all -> 0x010f }
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x010f }
            r10.<init>()     // Catch:{ all -> 0x010f }
            java.lang.String r11 = r8.zzF()     // Catch:{ all -> 0x010f }
            java.lang.String r12 = "app_id"
            r10.put(r12, r11)     // Catch:{ all -> 0x010f }
            long r11 = r8.zzo()     // Catch:{ all -> 0x010f }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x010f }
            java.lang.String r12 = "bundle_end_timestamp"
            r10.put(r12, r11)     // Catch:{ all -> 0x010f }
            java.lang.String r11 = "data"
            r10.put(r11, r9)     // Catch:{ all -> 0x010f }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r51)     // Catch:{ all -> 0x010f }
            java.lang.String r11 = "has_realtime"
            r10.put(r11, r9)     // Catch:{ all -> 0x010f }
            boolean r9 = r8.zzbR()     // Catch:{ all -> 0x010f }
            if (r9 == 0) goto L_0x0ed0
            int r9 = r8.zzg()     // Catch:{ all -> 0x010f }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x010f }
            java.lang.String r11 = "retry_count"
            r10.put(r11, r9)     // Catch:{ all -> 0x010f }
        L_0x0ed0:
            android.database.sqlite.SQLiteDatabase r4 = r4.k0()     // Catch:{ SQLiteException -> 0x0ef5 }
            java.lang.String r9 = "queue"
            r11 = 0
            long r9 = r4.insert(r9, r11, r10)     // Catch:{ SQLiteException -> 0x0ef5 }
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0f31
            T1.Z r4 = r7.c()     // Catch:{ SQLiteException -> 0x0ef5 }
            T1.X r4 = r4.t()     // Catch:{ SQLiteException -> 0x0ef5 }
            java.lang.String r5 = "Failed to insert bundle (got -1). appId"
            java.lang.String r6 = r8.zzF()     // Catch:{ SQLiteException -> 0x0ef5 }
            T1.Y r6 = T1.Z.w(r6)     // Catch:{ SQLiteException -> 0x0ef5 }
            r4.b(r6, r5)     // Catch:{ SQLiteException -> 0x0ef5 }
            goto L_0x0f31
        L_0x0ef5:
            r0 = move-exception
            r4 = r0
            T1.Z r5 = r7.c()     // Catch:{ all -> 0x010f }
            T1.X r5 = r5.t()     // Catch:{ all -> 0x010f }
            java.lang.String r6 = r8.zzF()     // Catch:{ all -> 0x010f }
            T1.Y r6 = T1.Z.w(r6)     // Catch:{ all -> 0x010f }
            java.lang.String r7 = "Error storing bundle. appId"
            r5.c(r7, r6, r4)     // Catch:{ all -> 0x010f }
            goto L_0x0f31
        L_0x0f0d:
            r0 = move-exception
            r4 = r0
            T1.Z r5 = r7.c()     // Catch:{ all -> 0x010f }
            T1.X r5 = r5.t()     // Catch:{ all -> 0x010f }
            java.lang.String r6 = r8.zzF()     // Catch:{ all -> 0x010f }
            T1.Y r6 = T1.Z.w(r6)     // Catch:{ all -> 0x010f }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            r5.c(r7, r6, r4)     // Catch:{ all -> 0x010f }
            goto L_0x0f31
        L_0x0f25:
            r0 = move-exception
            goto L_0x0bcc
        L_0x0f28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010f }
            r1.<init>()     // Catch:{ all -> 0x0f2e }
            throw r1     // Catch:{ all -> 0x0f2e }
        L_0x0f2e:
            r0 = move-exception
            goto L_0x0bcc
        L_0x0f31:
            T1.n r4 = r48.i0()     // Catch:{ all -> 0x010f }
            java.io.Serializable r1 = r1.f491c     // Catch:{ all -> 0x010f }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x010f }
            r4.B(r1)     // Catch:{ all -> 0x010f }
            T1.n r1 = r48.i0()     // Catch:{ all -> 0x010f }
            android.database.sqlite.SQLiteDatabase r4 = r1.k0()     // Catch:{ all -> 0x010f }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            java.lang.String[] r6 = new java.lang.String[]{r2, r2}     // Catch:{ SQLiteException -> 0x0f4e }
            r4.execSQL(r5, r6)     // Catch:{ SQLiteException -> 0x0f4e }
            goto L_0x0f65
        L_0x0f4e:
            r0 = move-exception
            r4 = r0
            java.lang.Object r1 = r1.f398a     // Catch:{ all -> 0x010f }
            T1.u0 r1 = (T1.C0212u0) r1     // Catch:{ all -> 0x010f }
            T1.Z r1 = r1.c()     // Catch:{ all -> 0x010f }
            T1.X r1 = r1.t()     // Catch:{ all -> 0x010f }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            T1.Y r2 = T1.Z.w(r2)     // Catch:{ all -> 0x010f }
            r1.c(r5, r2, r4)     // Catch:{ all -> 0x010f }
        L_0x0f65:
            T1.n r1 = r48.i0()     // Catch:{ all -> 0x010f }
            r1.J()     // Catch:{ all -> 0x010f }
            goto L_0x0f75
        L_0x0f6d:
            T1.n r1 = r48.i0()     // Catch:{ all -> 0x010f }
            r1.J()     // Catch:{ all -> 0x010f }
            r3 = r6
        L_0x0f75:
            T1.n r1 = r48.i0()
            r1.D()
            return r3
        L_0x0f7d:
            T1.n r1 = r48.i0()
            r1.D()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.T1.G(java.lang.String, long):boolean");
    }

    public final boolean H() {
        f().o();
        k();
        C0191n nVar = this.f3062c;
        L(nVar);
        if (nVar.f0("select count(1) > 0 from raw_events", (String[]) null) != 0) {
            return true;
        }
        C0191n nVar2 = this.f3062c;
        L(nVar2);
        if (!TextUtils.isEmpty(nVar2.s())) {
            return true;
        }
        return false;
    }

    public final boolean I(String str, String str2) {
        C0191n nVar = this.f3062c;
        L(nVar);
        C0205s Q5 = nVar.Q("events", str, str2);
        if (Q5 == null || Q5.f3458c < 1) {
            return true;
        }
        return false;
    }

    public final boolean J(zzhl zzhl, zzhl zzhl2) {
        String str;
        I.b("_e".equals(zzhl.zzo()));
        a();
        zzhq x6 = C0162d0.x((zzhm) zzhl.zzba(), "_sc");
        String str2 = null;
        if (x6 == null) {
            str = null;
        } else {
            str = x6.zzh();
        }
        a();
        zzhq x7 = C0162d0.x((zzhm) zzhl2.zzba(), "_pc");
        if (x7 != null) {
            str2 = x7.zzh();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        I.b("_e".equals(zzhl.zzo()));
        a();
        zzhq x8 = C0162d0.x((zzhm) zzhl.zzba(), "_et");
        if (x8 == null || !x8.zzw() || x8.zzd() <= 0) {
            return true;
        }
        long zzd = x8.zzd();
        a();
        zzhq x9 = C0162d0.x((zzhm) zzhl2.zzba(), "_et");
        if (x9 != null && x9.zzd() > 0) {
            zzd += x9.zzd();
        }
        a();
        C0162d0.v(zzhl2, "_et", Long.valueOf(zzd));
        a();
        C0162d0.v(zzhl, "_fr", 1L);
        return true;
    }

    public final void N(V v6, zzhw zzhw) {
        boolean z3;
        f().o();
        k();
        zzhb zzc = zzhc.zzc();
        C0212u0 u0Var = v6.f3103a;
        C0203r0 r0Var = u0Var.f3497s;
        C0212u0.k(r0Var);
        r0Var.o();
        byte[] bArr = v6.f3091I;
        if (bArr != null) {
            try {
                zzc = (zzhb) C0162d0.U(zzc, bArr);
            } catch (zzmm unused) {
                c().f3175r.b(Z.w(v6.c()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        for (zzhm zzhm : zzhw.zzaM()) {
            if (zzhm.zzh().equals("_cmp")) {
                Serializable y6 = C0162d0.y(zzhm, "gclid");
                String str = "";
                if (y6 == null) {
                    y6 = str;
                }
                String str2 = (String) y6;
                Serializable y7 = C0162d0.y(zzhm, "gbraid");
                if (y7 == null) {
                    y7 = str;
                }
                String str3 = (String) y7;
                Serializable y8 = C0162d0.y(zzhm, "gad_source");
                if (y8 != null) {
                    str = y8;
                }
                String str4 = str;
                if (!str2.isEmpty() || !str3.isEmpty()) {
                    long j6 = 0L;
                    Object y9 = C0162d0.y(zzhm, "click_timestamp");
                    if (y9 != null) {
                        j6 = y9;
                    }
                    long longValue = ((Long) j6).longValue();
                    if (longValue <= 0) {
                        longValue = zzhm.zzd();
                    }
                    if ("referrer API v2".equals(C0162d0.y(zzhm, "_cis"))) {
                        if (longValue > zzc.zzb()) {
                            if (str2.isEmpty()) {
                                zzc.zzh();
                            } else {
                                zzc.zzp(str2);
                            }
                            if (str3.isEmpty()) {
                                zzc.zzg();
                            } else {
                                zzc.zzo(str3);
                            }
                            if (str4.isEmpty()) {
                                zzc.zzf();
                            } else {
                                zzc.zzn(str4);
                            }
                            zzc.zzm(longValue);
                        }
                    } else if (longValue > zzc.zza()) {
                        if (str2.isEmpty()) {
                            zzc.zze();
                        } else {
                            zzc.zzk(str2);
                        }
                        if (str3.isEmpty()) {
                            zzc.zzd();
                        } else {
                            zzc.zzj(str3);
                        }
                        if (str4.isEmpty()) {
                            zzc.zzc();
                        } else {
                            zzc.zzi(str4);
                        }
                        zzc.zzl(longValue);
                    }
                }
            }
        }
        if (!((zzhc) zzc.zzba()).equals(zzhc.zze())) {
            zzhw.zzF((zzhc) zzc.zzba());
        }
        byte[] zzcd = ((zzhc) zzc.zzba()).zzcd();
        C0203r0 r0Var2 = u0Var.f3497s;
        C0212u0.k(r0Var2);
        r0Var2.o();
        boolean z4 = v6.f3100R;
        if (v6.f3091I != zzcd) {
            z3 = true;
        } else {
            z3 = false;
        }
        v6.f3100R = z4 | z3;
        v6.f3091I = zzcd;
        if (v6.s()) {
            C0191n nVar = this.f3062c;
            L(nVar);
            nVar.K(v6, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0282 A[Catch:{ RuntimeException -> 0x021b, all -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02a2 A[Catch:{ NameNotFoundException -> 0x02c5, all -> 0x02b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02bb A[SYNTHETIC, Splitter:B:118:0x02bb] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0352 A[Catch:{ NameNotFoundException -> 0x02c5, all -> 0x02b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x036f A[Catch:{ NameNotFoundException -> 0x02c5, all -> 0x02b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03d7 A[Catch:{ NameNotFoundException -> 0x02c5, all -> 0x02b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110 A[Catch:{ all -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0117 A[Catch:{ all -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0122 A[SYNTHETIC, Splitter:B:51:0x0122] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012f A[Catch:{ all -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013d A[Catch:{ all -> 0x00ca }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O(T1.Z1 r27) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r0 = "com.android.vending"
            java.lang.String r6 = "_npa"
            java.lang.String r7 = "_uwa"
            T1.r0 r8 = r26.f()
            r8.o()
            r26.k()
            com.google.android.gms.common.internal.I.g(r27)
            java.lang.String r8 = r2.f3201a
            com.google.android.gms.common.internal.I.d(r8)
            boolean r9 = K(r27)
            if (r9 != 0) goto L_0x0029
            return
        L_0x0029:
            T1.n r9 = r1.f3062c
            L(r9)
            T1.V r9 = r9.l0(r8)
            r10 = 0
            r11 = 0
            if (r9 == 0) goto L_0x0061
            java.lang.String r13 = r9.g()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x0061
            java.lang.String r13 = r2.f3202b
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x0061
            r9.u(r11)
            T1.n r13 = r1.f3062c
            L(r13)
            r13.K(r9, r10)
            T1.n0 r9 = r1.f3060a
            L(r9)
            r9.o()
            n.e r9 = r9.f3404q
            r9.remove(r8)
        L_0x0061:
            boolean r9 = r2.f3207q
            if (r9 != 0) goto L_0x0069
            r26.f0(r27)
            return
        L_0x0069:
            long r13 = r2.f3211u
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x007c
            G1.a r9 = r26.g()
            G1.b r9 = (G1.b) r9
            r9.getClass()
            long r13 = java.lang.System.currentTimeMillis()
        L_0x007c:
            T1.u0 r9 = r1.f3070u
            T1.q r15 = r9.m()
            android.content.Context r9 = r9.f3489a
            r15.o()
            r15 = 1
            int r11 = r2.f3212v
            if (r11 == 0) goto L_0x00a2
            if (r11 == r15) goto L_0x00a2
            T1.Z r12 = r26.c()
            T1.Y r10 = T1.Z.w(r8)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r15 = "Incorrect app type, assuming installed app. appId, appType"
            T1.X r12 = r12.f3175r
            r12.c(r15, r10, r11)
            r11 = 0
        L_0x00a2:
            T1.n r10 = r1.f3062c
            L(r10)
            r10.z()
            T1.n r10 = r1.f3062c     // Catch:{ all -> 0x00ca }
            L(r10)     // Catch:{ all -> 0x00ca }
            T1.X1 r10 = r10.u0(r8, r6)     // Catch:{ all -> 0x00ca }
            java.lang.Boolean r12 = M(r27)     // Catch:{ all -> 0x00ca }
            r21 = r3
            r22 = r4
            if (r10 == 0) goto L_0x00ce
            java.lang.String r15 = "auto"
            java.lang.String r3 = r10.f3152b     // Catch:{ all -> 0x00ca }
            boolean r3 = r15.equals(r3)     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x00c8
            goto L_0x00ce
        L_0x00c8:
            r4 = 1
            goto L_0x0103
        L_0x00ca:
            r0 = move-exception
            r13 = r1
            goto L_0x040b
        L_0x00ce:
            if (r12 == 0) goto L_0x00fd
            T1.W1 r3 = new T1.W1     // Catch:{ all -> 0x00ca }
            java.lang.String r19 = "_npa"
            boolean r4 = r12.booleanValue()     // Catch:{ all -> 0x00ca }
            r6 = 1
            if (r6 == r4) goto L_0x00de
            r15 = 0
            goto L_0x00e0
        L_0x00de:
            r15 = 1
        L_0x00e0:
            java.lang.Long r18 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x00ca }
            java.lang.String r20 = "auto"
            r4 = r6
            r15 = r3
            r16 = r13
            r15.<init>(r16, r18, r19, r20)     // Catch:{ all -> 0x00ca }
            if (r10 == 0) goto L_0x00f9
            java.lang.Object r6 = r10.f3154e     // Catch:{ all -> 0x00ca }
            java.lang.Long r10 = r3.d     // Catch:{ all -> 0x00ca }
            boolean r6 = r6.equals(r10)     // Catch:{ all -> 0x00ca }
            if (r6 != 0) goto L_0x0103
        L_0x00f9:
            r1.W(r3, r2)     // Catch:{ all -> 0x00ca }
            goto L_0x0103
        L_0x00fd:
            r4 = 1
            if (r10 == 0) goto L_0x0103
            r1.Q(r6, r2)     // Catch:{ all -> 0x00ca }
        L_0x0103:
            T1.g r3 = r26.h0()     // Catch:{ all -> 0x00ca }
            T1.G r6 = T1.H.f2923l1     // Catch:{ all -> 0x00ca }
            r10 = 0
            boolean r3 = r3.B(r10, r6)     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x0117
            r3 = r5
            long r4 = r2.f3199O     // Catch:{ all -> 0x00ca }
            r1.n(r2, r4)     // Catch:{ all -> 0x00ca }
            goto L_0x011b
        L_0x0117:
            r3 = r5
            r1.n(r2, r13)     // Catch:{ all -> 0x00ca }
        L_0x011b:
            r26.f0(r27)     // Catch:{ all -> 0x00ca }
            java.lang.String r4 = "events"
            if (r11 != 0) goto L_0x012f
            T1.n r5 = r1.f3062c     // Catch:{ all -> 0x00ca }
            L(r5)     // Catch:{ all -> 0x00ca }
            java.lang.String r11 = "_f"
            T1.s r4 = r5.Q(r4, r8, r11)     // Catch:{ all -> 0x00ca }
            r15 = 0
            goto L_0x013b
        L_0x012f:
            T1.n r5 = r1.f3062c     // Catch:{ all -> 0x00ca }
            L(r5)     // Catch:{ all -> 0x00ca }
            java.lang.String r11 = "_v"
            T1.s r4 = r5.Q(r4, r8, r11)     // Catch:{ all -> 0x00ca }
            r15 = 1
        L_0x013b:
            if (r4 != 0) goto L_0x03d7
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            long r11 = r13 / r4
            r16 = 1
            long r11 = r11 + r16
            long r11 = r11 * r4
            java.lang.String r4 = "_dac"
            java.lang.String r5 = "_et"
            java.lang.String r6 = "_r"
            java.lang.String r10 = "_c"
            r23 = r9
            boolean r9 = r2.f3214x
            if (r15 != 0) goto L_0x038a
            T1.W1 r15 = new T1.W1     // Catch:{ all -> 0x00ca }
            java.lang.String r19 = "_fot"
            java.lang.Long r18 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x00ca }
            java.lang.String r20 = "auto"
            r11 = r15
            r15 = r11
            r16 = r13
            r15.<init>(r16, r18, r19, r20)     // Catch:{ all -> 0x00ca }
            r1.W(r11, r2)     // Catch:{ all -> 0x00ca }
            T1.r0 r11 = r26.f()     // Catch:{ all -> 0x00ca }
            r11.o()     // Catch:{ all -> 0x00ca }
            T1.j0 r11 = r1.f3069t     // Catch:{ all -> 0x00ca }
            com.google.android.gms.common.internal.I.g(r11)     // Catch:{ all -> 0x00ca }
            T1.u0 r12 = r11.f3354b
            if (r8 == 0) goto L_0x017f
            boolean r15 = r8.isEmpty()     // Catch:{ all -> 0x01d3 }
            if (r15 == 0) goto L_0x0183
        L_0x017f:
            r24 = r13
            goto L_0x0248
        L_0x0183:
            T1.r0 r15 = r12.f3497s     // Catch:{ all -> 0x01d3 }
            android.content.Context r2 = r12.f3489a
            T1.C0212u0.k(r15)     // Catch:{ all -> 0x01d3 }
            r15.o()     // Catch:{ all -> 0x01d3 }
            boolean r15 = r11.a()     // Catch:{ all -> 0x01d3 }
            r24 = r13
            T1.Z r13 = r12.f3496r
            if (r15 != 0) goto L_0x01a3
            T1.C0212u0.k(r13)     // Catch:{ all -> 0x00ca }
            T1.X r0 = r13.f3178u     // Catch:{ all -> 0x00ca }
            java.lang.String r2 = "Install Referrer Reporter is not available"
            r0.a(r2)     // Catch:{ all -> 0x00ca }
            goto L_0x0254
        L_0x01a3:
            T1.i0 r14 = new T1.i0     // Catch:{ all -> 0x01d3 }
            r14.<init>(r11, r8)     // Catch:{ all -> 0x01d3 }
            T1.r0 r12 = r12.f3497s     // Catch:{ all -> 0x01d3 }
            T1.C0212u0.k(r12)     // Catch:{ all -> 0x01d3 }
            r12.o()     // Catch:{ all -> 0x01d3 }
            android.content.Intent r12 = new android.content.Intent     // Catch:{ all -> 0x01d3 }
            java.lang.String r15 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r12.<init>(r15)     // Catch:{ all -> 0x01d3 }
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x01d3 }
            java.lang.String r1 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15.<init>(r0, r1)     // Catch:{ all -> 0x01d3 }
            r12.setComponent(r15)     // Catch:{ all -> 0x01d3 }
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch:{ all -> 0x01d3 }
            if (r1 != 0) goto L_0x01d8
            T1.C0212u0.k(r13)     // Catch:{ all -> 0x01d3 }
            T1.X r0 = r13.f3176s     // Catch:{ all -> 0x01d3 }
            java.lang.String r1 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.a(r1)     // Catch:{ all -> 0x01d3 }
            goto L_0x0254
        L_0x01d3:
            r0 = move-exception
            r13 = r26
            goto L_0x040b
        L_0x01d8:
            r15 = 0
            java.util.List r1 = r1.queryIntentServices(r12, r15)     // Catch:{ all -> 0x01d3 }
            if (r1 == 0) goto L_0x023d
            boolean r16 = r1.isEmpty()     // Catch:{ all -> 0x01d3 }
            if (r16 != 0) goto L_0x023d
            java.lang.Object r1 = r1.get(r15)     // Catch:{ all -> 0x01d3 }
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1     // Catch:{ all -> 0x01d3 }
            android.content.pm.ServiceInfo r1 = r1.serviceInfo     // Catch:{ all -> 0x01d3 }
            if (r1 == 0) goto L_0x0254
            java.lang.String r15 = r1.packageName     // Catch:{ all -> 0x01d3 }
            java.lang.String r1 = r1.name     // Catch:{ all -> 0x01d3 }
            if (r1 == 0) goto L_0x0232
            boolean r0 = r0.equals(r15)     // Catch:{ all -> 0x01d3 }
            if (r0 == 0) goto L_0x0232
            boolean r0 = r11.a()     // Catch:{ all -> 0x01d3 }
            if (r0 == 0) goto L_0x0232
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x01d3 }
            r0.<init>(r12)     // Catch:{ all -> 0x01d3 }
            F1.a r1 = F1.a.b()     // Catch:{ RuntimeException -> 0x021b }
            r11 = 1
            boolean r0 = r1.a(r2, r0, r14, r11)     // Catch:{ RuntimeException -> 0x021b }
            T1.C0212u0.k(r13)     // Catch:{ RuntimeException -> 0x021b }
            T1.X r2 = r13.f3180w     // Catch:{ RuntimeException -> 0x021b }
            java.lang.String r11 = "Install Referrer Service is"
            if (r0 == 0) goto L_0x021d
            java.lang.String r0 = "available"
            goto L_0x021f
        L_0x021b:
            r0 = move-exception
            goto L_0x0223
        L_0x021d:
            java.lang.String r0 = "not available"
        L_0x021f:
            r2.b(r0, r11)     // Catch:{ RuntimeException -> 0x021b }
            goto L_0x0254
        L_0x0223:
            T1.C0212u0.k(r13)     // Catch:{ all -> 0x01d3 }
            T1.X r2 = r13.f3172f     // Catch:{ all -> 0x01d3 }
            java.lang.String r11 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01d3 }
            r2.b(r0, r11)     // Catch:{ all -> 0x01d3 }
            goto L_0x0254
        L_0x0232:
            T1.C0212u0.k(r13)     // Catch:{ all -> 0x01d3 }
            T1.X r0 = r13.f3175r     // Catch:{ all -> 0x01d3 }
            java.lang.String r2 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.a(r2)     // Catch:{ all -> 0x01d3 }
            goto L_0x0254
        L_0x023d:
            T1.C0212u0.k(r13)     // Catch:{ all -> 0x01d3 }
            T1.X r0 = r13.f3178u     // Catch:{ all -> 0x01d3 }
            java.lang.String r2 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.a(r2)     // Catch:{ all -> 0x01d3 }
            goto L_0x0254
        L_0x0248:
            T1.Z r0 = r12.f3496r     // Catch:{ all -> 0x01d3 }
            T1.C0212u0.k(r0)     // Catch:{ all -> 0x01d3 }
            T1.X r0 = r0.f3176s     // Catch:{ all -> 0x01d3 }
            java.lang.String r2 = "Install Referrer Reporter was called with invalid app package name"
            r0.a(r2)     // Catch:{ all -> 0x01d3 }
        L_0x0254:
            T1.r0 r0 = r26.f()     // Catch:{ all -> 0x01d3 }
            r0.o()     // Catch:{ all -> 0x01d3 }
            r26.k()     // Catch:{ all -> 0x01d3 }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x01d3 }
            r2.<init>()     // Catch:{ all -> 0x01d3 }
            r11 = 1
            r2.putLong(r10, r11)     // Catch:{ all -> 0x01d3 }
            r2.putLong(r6, r11)     // Catch:{ all -> 0x01d3 }
            r13 = 0
            r2.putLong(r7, r13)     // Catch:{ all -> 0x01d3 }
            r2.putLong(r3, r13)     // Catch:{ all -> 0x01d3 }
            r10 = r22
            r2.putLong(r10, r13)     // Catch:{ all -> 0x01d3 }
            r15 = r21
            r2.putLong(r15, r13)     // Catch:{ all -> 0x01d3 }
            r2.putLong(r5, r11)     // Catch:{ all -> 0x01d3 }
            if (r9 == 0) goto L_0x0285
            r2.putLong(r4, r11)     // Catch:{ all -> 0x01d3 }
        L_0x0285:
            com.google.android.gms.common.internal.I.g(r8)     // Catch:{ all -> 0x01d3 }
            r13 = r26
            T1.n r0 = r13.f3062c     // Catch:{ all -> 0x02b8 }
            L(r0)     // Catch:{ all -> 0x02b8 }
            com.google.android.gms.common.internal.I.d(r8)     // Catch:{ all -> 0x02b8 }
            r0.o()     // Catch:{ all -> 0x02b8 }
            r0.p()     // Catch:{ all -> 0x02b8 }
            long r4 = r0.i0(r8)     // Catch:{ all -> 0x02b8 }
            android.content.pm.PackageManager r0 = r23.getPackageManager()     // Catch:{ all -> 0x02b8 }
            if (r0 != 0) goto L_0x02bb
            T1.Z r0 = r26.c()     // Catch:{ all -> 0x02b8 }
            T1.X r0 = r0.f3172f     // Catch:{ all -> 0x02b8 }
            java.lang.String r1 = "PackageManager is null, first open report might be inaccurate. appId"
            T1.Y r6 = T1.Z.w(r8)     // Catch:{ all -> 0x02b8 }
            r0.b(r6, r1)     // Catch:{ all -> 0x02b8 }
            r14 = r27
            r1 = r2
        L_0x02b4:
            r6 = 0
            goto L_0x036b
        L_0x02b8:
            r0 = move-exception
            goto L_0x040b
        L_0x02bb:
            D0.e r0 = I1.c.a(r23)     // Catch:{ NameNotFoundException -> 0x02c5 }
            r6 = 0
            android.content.pm.PackageInfo r0 = r0.i(r6, r8)     // Catch:{ NameNotFoundException -> 0x02c5 }
            goto L_0x02d6
        L_0x02c5:
            r0 = move-exception
            T1.Z r6 = r26.c()     // Catch:{ all -> 0x02b8 }
            T1.X r6 = r6.f3172f     // Catch:{ all -> 0x02b8 }
            java.lang.String r9 = "Package info is null, first open report might be inaccurate. appId"
            T1.Y r11 = T1.Z.w(r8)     // Catch:{ all -> 0x02b8 }
            r6.c(r9, r11, r0)     // Catch:{ all -> 0x02b8 }
            r0 = 0
        L_0x02d6:
            if (r0 == 0) goto L_0x0330
            long r11 = r0.firstInstallTime     // Catch:{ all -> 0x02b8 }
            r16 = 0
            int r6 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x0330
            r14 = r2
            long r1 = r0.lastUpdateTime     // Catch:{ all -> 0x02b8 }
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x030e
            T1.g r0 = r26.h0()     // Catch:{ all -> 0x02b8 }
            T1.G r1 = T1.H.f2858H0     // Catch:{ all -> 0x02b8 }
            r2 = 0
            boolean r0 = r0.B(r2, r1)     // Catch:{ all -> 0x02b8 }
            if (r0 == 0) goto L_0x0307
            r11 = 0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0304
            r1 = r14
            r11 = 1
            r1.putLong(r7, r11)     // Catch:{ all -> 0x02b8 }
            r0 = 0
            r4 = 0
            goto L_0x0311
        L_0x0304:
            r1 = r14
        L_0x0305:
            r0 = 0
            goto L_0x0311
        L_0x0307:
            r1 = r14
            r11 = 1
            r1.putLong(r7, r11)     // Catch:{ all -> 0x02b8 }
            goto L_0x0305
        L_0x030e:
            r1 = r14
            r2 = 0
            r0 = 1
        L_0x0311:
            T1.W1 r7 = new T1.W1     // Catch:{ all -> 0x02b8 }
            java.lang.String r19 = "_fi"
            r6 = 1
            if (r6 == r0) goto L_0x031b
            r11 = 0
            goto L_0x031d
        L_0x031b:
            r11 = 1
        L_0x031d:
            java.lang.Long r18 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x02b8 }
            java.lang.String r20 = "auto"
            r9 = r15
            r15 = r7
            r16 = r24
            r15.<init>(r16, r18, r19, r20)     // Catch:{ all -> 0x02b8 }
            r14 = r27
            r13.W(r7, r14)     // Catch:{ all -> 0x02b8 }
            goto L_0x0335
        L_0x0330:
            r14 = r27
            r1 = r2
            r9 = r15
            r2 = 0
        L_0x0335:
            D0.e r0 = I1.c.a(r23)     // Catch:{ NameNotFoundException -> 0x033f }
            r7 = 0
            android.content.pm.ApplicationInfo r0 = r0.h(r7, r8)     // Catch:{ NameNotFoundException -> 0x033f }
            goto L_0x0350
        L_0x033f:
            r0 = move-exception
            T1.Z r7 = r26.c()     // Catch:{ all -> 0x02b8 }
            T1.X r7 = r7.f3172f     // Catch:{ all -> 0x02b8 }
            java.lang.String r11 = "Application info is null, first open report might be inaccurate. appId"
            T1.Y r8 = T1.Z.w(r8)     // Catch:{ all -> 0x02b8 }
            r7.c(r11, r8, r0)     // Catch:{ all -> 0x02b8 }
            r0 = r2
        L_0x0350:
            if (r0 == 0) goto L_0x02b4
            int r2 = r0.flags     // Catch:{ all -> 0x02b8 }
            r6 = 1
            r2 = r2 & r6
            if (r2 == 0) goto L_0x035e
            r6 = 1
            r1.putLong(r10, r6)     // Catch:{ all -> 0x02b8 }
            goto L_0x0360
        L_0x035e:
            r6 = 1
        L_0x0360:
            int r0 = r0.flags     // Catch:{ all -> 0x02b8 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x02b4
            r1.putLong(r9, r6)     // Catch:{ all -> 0x02b8 }
            goto L_0x02b4
        L_0x036b:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0372
            r1.putLong(r3, r4)     // Catch:{ all -> 0x02b8 }
        L_0x0372:
            T1.v r0 = new T1.v     // Catch:{ all -> 0x02b8 }
            java.lang.String r16 = "_f"
            T1.u r2 = new T1.u     // Catch:{ all -> 0x02b8 }
            r2.<init>(r1)     // Catch:{ all -> 0x02b8 }
            java.lang.String r18 = "auto"
            r15 = r0
            r17 = r2
            r19 = r24
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x02b8 }
            r13.s(r0, r14)     // Catch:{ all -> 0x02b8 }
            goto L_0x03fa
        L_0x038a:
            r24 = r13
            r13 = r1
            r14 = r2
            T1.W1 r0 = new T1.W1     // Catch:{ all -> 0x02b8 }
            java.lang.String r19 = "_fvt"
            java.lang.Long r18 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x02b8 }
            java.lang.String r20 = "auto"
            r15 = r0
            r16 = r24
            r15.<init>(r16, r18, r19, r20)     // Catch:{ all -> 0x02b8 }
            r13.W(r0, r14)     // Catch:{ all -> 0x02b8 }
            T1.r0 r0 = r26.f()     // Catch:{ all -> 0x02b8 }
            r0.o()     // Catch:{ all -> 0x02b8 }
            r26.k()     // Catch:{ all -> 0x02b8 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x02b8 }
            r0.<init>()     // Catch:{ all -> 0x02b8 }
            r1 = 1
            r0.putLong(r10, r1)     // Catch:{ all -> 0x02b8 }
            r0.putLong(r6, r1)     // Catch:{ all -> 0x02b8 }
            r0.putLong(r5, r1)     // Catch:{ all -> 0x02b8 }
            if (r9 == 0) goto L_0x03c0
            r0.putLong(r4, r1)     // Catch:{ all -> 0x02b8 }
        L_0x03c0:
            T1.v r1 = new T1.v     // Catch:{ all -> 0x02b8 }
            java.lang.String r16 = "_v"
            T1.u r2 = new T1.u     // Catch:{ all -> 0x02b8 }
            r2.<init>(r0)     // Catch:{ all -> 0x02b8 }
            java.lang.String r18 = "auto"
            r15 = r1
            r17 = r2
            r19 = r24
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x02b8 }
            r13.s(r1, r14)     // Catch:{ all -> 0x02b8 }
            goto L_0x03fa
        L_0x03d7:
            r24 = r13
            r13 = r1
            r14 = r2
            boolean r0 = r14.f3208r     // Catch:{ all -> 0x02b8 }
            if (r0 == 0) goto L_0x03fa
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x02b8 }
            r0.<init>()     // Catch:{ all -> 0x02b8 }
            T1.v r1 = new T1.v     // Catch:{ all -> 0x02b8 }
            java.lang.String r16 = "_cd"
            T1.u r2 = new T1.u     // Catch:{ all -> 0x02b8 }
            r2.<init>(r0)     // Catch:{ all -> 0x02b8 }
            java.lang.String r18 = "auto"
            r15 = r1
            r17 = r2
            r19 = r24
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x02b8 }
            r13.s(r1, r14)     // Catch:{ all -> 0x02b8 }
        L_0x03fa:
            T1.n r0 = r13.f3062c     // Catch:{ all -> 0x02b8 }
            L(r0)     // Catch:{ all -> 0x02b8 }
            r0.J()     // Catch:{ all -> 0x02b8 }
            T1.n r0 = r13.f3062c
            L(r0)
            r0.D()
            return
        L_0x040b:
            T1.n r1 = r13.f3062c
            L(r1)
            r1.D()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.T1.O(T1.Z1):void");
    }

    public final void P(C0164e eVar, Z1 z12) {
        Bundle bundle;
        I.d(eVar.f3271a);
        I.g(eVar.f3273c);
        I.d(eVar.f3273c.f3140b);
        f().o();
        k();
        if (K(z12)) {
            if (!z12.f3207q) {
                f0(z12);
                return;
            }
            C0191n nVar = this.f3062c;
            L(nVar);
            nVar.z();
            try {
                f0(z12);
                String str = eVar.f3271a;
                I.g(str);
                C0191n nVar2 = this.f3062c;
                L(nVar2);
                C0164e m02 = nVar2.m0(str, eVar.f3273c.f3140b);
                C0212u0 u0Var = this.f3070u;
                if (m02 != null) {
                    c().f3179v.c("Removing conditional user property", eVar.f3271a, u0Var.f3500v.f(eVar.f3273c.f3140b));
                    C0191n nVar3 = this.f3062c;
                    L(nVar3);
                    nVar3.P(str, eVar.f3273c.f3140b);
                    if (m02.f3274e) {
                        C0191n nVar4 = this.f3062c;
                        L(nVar4);
                        nVar4.H(str, eVar.f3273c.f3140b);
                    }
                    C0214v vVar = eVar.f3280t;
                    if (vVar != null) {
                        C0211u uVar = vVar.f3509b;
                        if (uVar != null) {
                            bundle = uVar.v();
                        } else {
                            bundle = null;
                        }
                        C0214v u6 = e().u(vVar.f3508a, bundle, m02.f3272b, vVar.d, true);
                        I.g(u6);
                        b0(u6, z12);
                    }
                } else {
                    c().f3175r.c("Conditional user property doesn't exist", Z.w(eVar.f3271a), u0Var.f3500v.f(eVar.f3273c.f3140b));
                }
                C0191n nVar5 = this.f3062c;
                L(nVar5);
                nVar5.J();
                C0191n nVar6 = this.f3062c;
                L(nVar6);
                nVar6.D();
            } catch (Throwable th) {
                C0191n nVar7 = this.f3062c;
                L(nVar7);
                nVar7.D();
                throw th;
            }
        }
    }

    public final void Q(String str, Z1 z12) {
        long j6;
        f().o();
        k();
        if (K(z12)) {
            if (!z12.f3207q) {
                f0(z12);
                return;
            }
            Boolean M6 = M(z12);
            if (!"_npa".equals(str) || M6 == null) {
                Z c3 = c();
                C0212u0 u0Var = this.f3070u;
                c3.f3179v.b(u0Var.f3500v.f(str), "Removing user property");
                C0191n nVar = this.f3062c;
                L(nVar);
                nVar.z();
                try {
                    f0(z12);
                    boolean equals = "_id".equals(str);
                    String str2 = z12.f3201a;
                    if (equals) {
                        C0191n nVar2 = this.f3062c;
                        L(nVar2);
                        I.g(str2);
                        nVar2.H(str2, "_lair");
                    }
                    C0191n nVar3 = this.f3062c;
                    L(nVar3);
                    I.g(str2);
                    nVar3.H(str2, str);
                    C0191n nVar4 = this.f3062c;
                    L(nVar4);
                    nVar4.J();
                    c().f3179v.b(u0Var.f3500v.f(str), "User property removed");
                    C0191n nVar5 = this.f3062c;
                    L(nVar5);
                    nVar5.D();
                } catch (Throwable th) {
                    C0191n nVar6 = this.f3062c;
                    L(nVar6);
                    nVar6.D();
                    throw th;
                }
            } else {
                c().f3179v.a("Falling back to manifest metadata value for ad personalization");
                ((b) g()).getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (true != M6.booleanValue()) {
                    j6 = 0;
                } else {
                    j6 = 1;
                }
                W(new W1(currentTimeMillis, Long.valueOf(j6), "_npa", "auto"), z12);
            }
        }
    }

    public final void R(Z1 z12) {
        boolean z3;
        f().o();
        k();
        String str = z12.f3201a;
        I.d(str);
        C0197p b6 = C0197p.b(z12.f3194J);
        c().f3180w.c("Setting DMA consent for package", str, b6);
        f().o();
        k();
        G0 c3 = C0197p.a(100, d0(str)).c();
        this.f3052L.put(str, b6);
        C0191n nVar = this.f3062c;
        L(nVar);
        I.g(str);
        I.g(b6);
        nVar.o();
        nVar.p();
        J0 s0 = nVar.s0(str);
        J0 j02 = J0.f2969c;
        if (s0 == j02) {
            nVar.M(str, j02);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", b6.f3426b);
        nVar.W(contentValues);
        G0 c6 = C0197p.a(100, d0(str)).c();
        f().o();
        k();
        G0 g02 = G0.DENIED;
        G0 g03 = G0.GRANTED;
        boolean z4 = true;
        if (c3 == g02 && c6 == g03) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!(c3 == g03 && c6 == g02)) {
            z4 = false;
        }
        if (z3 || z4) {
            c().f3180w.b(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            C0191n nVar2 = this.f3062c;
            L(nVar2);
            if (nVar2.o0(false, false, false, false, str, v()).f3352f < ((long) h0().u(str, H.f2922l0))) {
                bundle.putLong("_r", 1);
                C0191n nVar3 = this.f3062c;
                L(nVar3);
                C0179j o02 = nVar3.o0(false, false, true, false, str, v());
                c().f3180w.c("_dcu realtime event count", str, Long.valueOf(o02.f3352f));
            }
            this.f3059S.v(str, "_dcu", bundle);
        }
    }

    public final void S(Z1 z12) {
        f().o();
        k();
        String str = z12.f3201a;
        I.d(str);
        J0 e6 = J0.e(z12.f3193I, z12.f3189D);
        n0(str);
        c().f3180w.c("Setting storage consent for package", str, e6);
        f().o();
        k();
        this.f3051K.put(str, e6);
        C0191n nVar = this.f3062c;
        L(nVar);
        nVar.M(str, e6);
    }

    public final void T(ArrayList arrayList) {
        I.b(!arrayList.isEmpty());
        if (this.f3048H != null) {
            c().f3172f.a("Set uploading progress before finishing the previous upload");
        } else {
            this.f3048H = new ArrayList(arrayList);
        }
    }

    public final void U(C0164e eVar, Z1 z12) {
        C0214v vVar;
        I.d(eVar.f3271a);
        I.g(eVar.f3272b);
        I.g(eVar.f3273c);
        I.d(eVar.f3273c.f3140b);
        f().o();
        k();
        if (K(z12)) {
            if (!z12.f3207q) {
                f0(z12);
                return;
            }
            C0164e eVar2 = new C0164e(eVar);
            boolean z3 = false;
            eVar2.f3274e = false;
            C0191n nVar = this.f3062c;
            L(nVar);
            nVar.z();
            try {
                C0191n nVar2 = this.f3062c;
                L(nVar2);
                String str = eVar2.f3271a;
                I.g(str);
                C0164e m02 = nVar2.m0(str, eVar2.f3273c.f3140b);
                C0212u0 u0Var = this.f3070u;
                if (m02 != null) {
                    if (!m02.f3272b.equals(eVar2.f3272b)) {
                        c().f3175r.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", u0Var.f3500v.f(eVar2.f3273c.f3140b), eVar2.f3272b, m02.f3272b);
                    }
                }
                if (m02 != null && m02.f3274e) {
                    eVar2.f3272b = m02.f3272b;
                    eVar2.d = m02.d;
                    eVar2.f3277q = m02.f3277q;
                    eVar2.f3275f = m02.f3275f;
                    eVar2.f3278r = m02.f3278r;
                    eVar2.f3274e = true;
                    W1 w12 = eVar2.f3273c;
                    eVar2.f3273c = new W1(m02.f3273c.f3141c, w12.v(), w12.f3140b, m02.f3273c.f3143f);
                } else if (TextUtils.isEmpty(eVar2.f3275f)) {
                    W1 w13 = eVar2.f3273c;
                    eVar2.f3273c = new W1(eVar2.d, w13.v(), w13.f3140b, eVar2.f3273c.f3143f);
                    eVar2.f3274e = true;
                    z3 = true;
                }
                if (eVar2.f3274e) {
                    W1 w14 = eVar2.f3273c;
                    String str2 = eVar2.f3271a;
                    I.g(str2);
                    String str3 = eVar2.f3272b;
                    String str4 = w14.f3140b;
                    long j6 = w14.f3141c;
                    Object v6 = w14.v();
                    I.g(v6);
                    X1 x12 = new X1(str2, str3, str4, j6, v6);
                    Object obj = x12.f3154e;
                    String str5 = x12.f3153c;
                    C0191n nVar3 = this.f3062c;
                    L(nVar3);
                    if (nVar3.c0(x12)) {
                        c().f3179v.d("User property updated immediately", eVar2.f3271a, u0Var.f3500v.f(str5), obj);
                    } else {
                        c().f3172f.d("(2)Too many active user properties, ignoring", Z.w(eVar2.f3271a), u0Var.f3500v.f(str5), obj);
                    }
                    if (z3 && (vVar = eVar2.f3278r) != null) {
                        b0(new C0214v(vVar, eVar2.d), z12);
                    }
                }
                C0191n nVar4 = this.f3062c;
                L(nVar4);
                if (nVar4.b0(eVar2)) {
                    c().f3179v.d("Conditional property added", eVar2.f3271a, u0Var.f3500v.f(eVar2.f3273c.f3140b), eVar2.f3273c.v());
                } else {
                    c().f3172f.d("Too many conditional properties, ignoring", Z.w(eVar2.f3271a), u0Var.f3500v.f(eVar2.f3273c.f3140b), eVar2.f3273c.v());
                }
                C0191n nVar5 = this.f3062c;
                L(nVar5);
                nVar5.J();
                C0191n nVar6 = this.f3062c;
                L(nVar6);
                nVar6.D();
            } catch (Throwable th) {
                C0191n nVar7 = this.f3062c;
                L(nVar7);
                nVar7.D();
                throw th;
            }
        }
    }

    public final void V(String str, boolean z3, Long l6, Long l7) {
        boolean z4;
        C0191n nVar = this.f3062c;
        L(nVar);
        V l02 = nVar.l0(str);
        if (l02 != null) {
            C0212u0 u0Var = l02.f3103a;
            C0203r0 r0Var = u0Var.f3497s;
            C0212u0.k(r0Var);
            r0Var.o();
            boolean z5 = l02.f3100R;
            if (l02.f3125z != z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            l02.f3100R = z5 | z4;
            l02.f3125z = z3;
            C0203r0 r0Var2 = u0Var.f3497s;
            C0212u0.k(r0Var2);
            r0Var2.o();
            l02.f3100R |= !Objects.equals(l02.f3084A, l6);
            l02.f3084A = l6;
            C0203r0 r0Var3 = u0Var.f3497s;
            C0212u0.k(r0Var3);
            r0Var3.o();
            l02.f3100R |= !Objects.equals(l02.f3085B, l7);
            l02.f3085B = l7;
            if (l02.s()) {
                C0191n nVar2 = this.f3062c;
                L(nVar2);
                nVar2.K(l02, false);
            }
        }
    }

    public final void W(W1 w12, Z1 z12) {
        long j6;
        int i2;
        int i5;
        W1 w13 = w12;
        Z1 z13 = z12;
        f().o();
        k();
        if (K(z12)) {
            if (!z13.f3207q) {
                f0(z13);
                return;
            }
            Y1 e6 = e();
            String str = w13.f3140b;
            int u02 = e6.u0(str);
            A a6 = this.f3059S;
            if (u02 != 0) {
                e();
                h0();
                String y6 = Y1.y(str, 24, true);
                if (str != null) {
                    i5 = str.length();
                } else {
                    i5 = 0;
                }
                e();
                Y1.I(a6, z13.f3201a, u02, "_ev", y6, i5);
                return;
            }
            int q02 = e().q0(w12.v(), str);
            if (q02 != 0) {
                e();
                h0();
                String y7 = Y1.y(str, 24, true);
                Object v6 = w12.v();
                if (v6 == null || (!(v6 instanceof String) && !(v6 instanceof CharSequence))) {
                    i2 = 0;
                } else {
                    i2 = v6.toString().length();
                }
                e();
                Y1.I(a6, z13.f3201a, q02, "_ev", y7, i2);
                return;
            }
            Object w6 = e().w(w12.v(), str);
            if (w6 != null) {
                boolean equals = "_sid".equals(str);
                long j7 = 0;
                String str2 = z13.f3201a;
                if (equals) {
                    I.g(str2);
                    C0191n nVar = this.f3062c;
                    L(nVar);
                    X1 u03 = nVar.u0(str2, "_sno");
                    if (u03 != null) {
                        Object obj = u03.f3154e;
                        if (obj instanceof Long) {
                            j6 = ((Long) obj).longValue();
                            W(new W1(w13.f3141c, Long.valueOf(j6 + 1), "_sno", w13.f3143f), z13);
                        }
                    }
                    if (u03 != null) {
                        c().f3175r.b(u03.f3154e, "Retrieved last session number from database does not contain a valid (long) value");
                    }
                    C0191n nVar2 = this.f3062c;
                    L(nVar2);
                    C0205s Q5 = nVar2.Q("events", str2, "_s");
                    if (Q5 != null) {
                        Z c3 = c();
                        long j8 = Q5.f3458c;
                        c3.f3180w.b(Long.valueOf(j8), "Backfill the session number. Last used session number");
                        j6 = j8;
                    } else {
                        j6 = 0;
                    }
                    W(new W1(w13.f3141c, Long.valueOf(j6 + 1), "_sno", w13.f3143f), z13);
                }
                I.g(str2);
                String str3 = w13.f3143f;
                I.g(str3);
                X1 x12 = r5;
                String str4 = str2;
                X1 x13 = new X1(str2, str3, str, w13.f3141c, w6);
                Z c6 = c();
                C0212u0 u0Var = this.f3070u;
                S s6 = u0Var.f3500v;
                String str5 = x12.f3153c;
                c6.f3180w.c("Setting user property", s6.f(str5), w6);
                C0191n nVar3 = this.f3062c;
                L(nVar3);
                nVar3.z();
                try {
                    boolean equals2 = "_id".equals(str5);
                    Object obj2 = x12.f3154e;
                    if (equals2) {
                        C0191n nVar4 = this.f3062c;
                        L(nVar4);
                        X1 u04 = nVar4.u0(str4, "_id");
                        if (u04 != null && !obj2.equals(u04.f3154e)) {
                            C0191n nVar5 = this.f3062c;
                            L(nVar5);
                            nVar5.H(str4, "_lair");
                        }
                    }
                    f0(z13);
                    C0191n nVar6 = this.f3062c;
                    L(nVar6);
                    boolean c02 = nVar6.c0(x12);
                    if ("_sid".equals(str)) {
                        C0162d0 d0Var = this.f3065p;
                        L(d0Var);
                        String str6 = z13.F;
                        if (!TextUtils.isEmpty(str6)) {
                            j7 = d0Var.O(str6.getBytes(Charset.forName("UTF-8")));
                        }
                        long j9 = j7;
                        C0191n nVar7 = this.f3062c;
                        L(nVar7);
                        V l02 = nVar7.l0(str4);
                        if (l02 != null) {
                            l02.q(j9);
                            if (l02.s()) {
                                C0191n nVar8 = this.f3062c;
                                L(nVar8);
                                nVar8.K(l02, false);
                            }
                        }
                    }
                    C0191n nVar9 = this.f3062c;
                    L(nVar9);
                    nVar9.J();
                    if (!c02) {
                        c().f3172f.c("Too many unique user properties are set. Ignoring user property", u0Var.f3500v.f(str5), obj2);
                        e();
                        Y1.I(a6, str4, 9, (String) null, (String) null, 0);
                    }
                    C0191n nVar10 = this.f3062c;
                    L(nVar10);
                    nVar10.D();
                } catch (Throwable th) {
                    C0191n nVar11 = this.f3062c;
                    L(nVar11);
                    nVar11.D();
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0129, code lost:
        if (r7 == 0) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a4, code lost:
        if (r1 != null) goto L_0x017f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c3 A[SYNTHETIC, Splitter:B:80:0x01c3] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:71:0x01a7=Splitter:B:71:0x01a7, B:44:0x012c=Splitter:B:44:0x012c, B:35:0x010d=Splitter:B:35:0x010d, B:57:0x017f=Splitter:B:57:0x017f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void X() {
        /*
            r11 = this;
            T1.r0 r0 = r11.f()
            r0.o()
            r11.k()
            r0 = 1
            r11.f3046E = r0
            r0 = 0
            T1.u0 r1 = r11.f3070u     // Catch:{ all -> 0x0028 }
            r1.getClass()     // Catch:{ all -> 0x0028 }
            T1.w1 r1 = r1.r()     // Catch:{ all -> 0x0028 }
            java.lang.Boolean r1 = r1.f3526e     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x002b
            T1.Z r1 = r11.c()     // Catch:{ all -> 0x0028 }
            T1.X r1 = r1.f3175r     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r1.a(r2)     // Catch:{ all -> 0x0028 }
            goto L_0x01bb
        L_0x0028:
            r1 = move-exception
            goto L_0x01c7
        L_0x002b:
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x003e
            T1.Z r1 = r11.c()     // Catch:{ all -> 0x0028 }
            T1.X r1 = r1.f3172f     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r1.a(r2)     // Catch:{ all -> 0x0028 }
            goto L_0x01bb
        L_0x003e:
            long r1 = r11.f3073x     // Catch:{ all -> 0x0028 }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            r11.F()     // Catch:{ all -> 0x0028 }
            goto L_0x01bb
        L_0x004b:
            T1.r0 r1 = r11.f()     // Catch:{ all -> 0x0028 }
            r1.o()     // Catch:{ all -> 0x0028 }
            java.util.ArrayList r1 = r11.f3048H     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0063
            T1.Z r1 = r11.c()     // Catch:{ all -> 0x0028 }
            T1.X r1 = r1.f3180w     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "Uploading requested multiple times"
            r1.a(r2)     // Catch:{ all -> 0x0028 }
            goto L_0x01bb
        L_0x0063:
            T1.d0 r1 = r11.f3061b     // Catch:{ all -> 0x0028 }
            L(r1)     // Catch:{ all -> 0x0028 }
            boolean r1 = r1.N()     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x007e
            T1.Z r1 = r11.c()     // Catch:{ all -> 0x0028 }
            T1.X r1 = r1.f3180w     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r1.a(r2)     // Catch:{ all -> 0x0028 }
            r11.F()     // Catch:{ all -> 0x0028 }
            goto L_0x01bb
        L_0x007e:
            G1.a r1 = r11.g()     // Catch:{ all -> 0x0028 }
            G1.b r1 = (G1.b) r1     // Catch:{ all -> 0x0028 }
            r1.getClass()     // Catch:{ all -> 0x0028 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0028 }
            T1.g r5 = r11.h0()     // Catch:{ all -> 0x0028 }
            T1.G r6 = T1.H.f2910h0     // Catch:{ all -> 0x0028 }
            r7 = 0
            int r5 = r5.u(r7, r6)     // Catch:{ all -> 0x0028 }
            r11.h0()     // Catch:{ all -> 0x0028 }
            T1.G r6 = T1.H.f2903e     // Catch:{ all -> 0x0028 }
            java.lang.Object r6 = r6.a(r7)     // Catch:{ all -> 0x0028 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0028 }
            long r8 = r6.longValue()     // Catch:{ all -> 0x0028 }
            long r8 = r1 - r8
            r6 = r0
        L_0x00a8:
            if (r6 >= r5) goto L_0x00b3
            boolean r10 = r11.G(r7, r8)     // Catch:{ all -> 0x0028 }
            if (r10 == 0) goto L_0x00b3
            int r6 = r6 + 1
            goto L_0x00a8
        L_0x00b3:
            com.google.android.gms.internal.measurement.zzqr.zzb()     // Catch:{ all -> 0x0028 }
            T1.r0 r5 = r11.f()     // Catch:{ all -> 0x0028 }
            r5.o()     // Catch:{ all -> 0x0028 }
            r11.E()     // Catch:{ all -> 0x0028 }
            T1.y1 r5 = r11.f3067r     // Catch:{ all -> 0x0028 }
            T1.g0 r5 = r5.f3547q     // Catch:{ all -> 0x0028 }
            long r5 = r5.a()     // Catch:{ all -> 0x0028 }
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00e1
            T1.Z r3 = r11.c()     // Catch:{ all -> 0x0028 }
            T1.X r3 = r3.f3179v     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r5 = r1 - r5
            long r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x0028 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0028 }
            r3.b(r5, r4)     // Catch:{ all -> 0x0028 }
        L_0x00e1:
            T1.n r3 = r11.f3062c     // Catch:{ all -> 0x0028 }
            L(r3)     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = r3.s()     // Catch:{ all -> 0x0028 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0028 }
            r5 = -1
            if (r4 != 0) goto L_0x013a
            long r8 = r11.f3050J     // Catch:{ all -> 0x0028 }
            int r4 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0135
            T1.n r4 = r11.f3062c     // Catch:{ all -> 0x0028 }
            L(r4)     // Catch:{ all -> 0x0028 }
            android.database.sqlite.SQLiteDatabase r8 = r4.k0()     // Catch:{ SQLiteException -> 0x0118 }
            java.lang.String r9 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r7 = r8.rawQuery(r9, r7)     // Catch:{ SQLiteException -> 0x0118 }
            boolean r8 = r7.moveToFirst()     // Catch:{ SQLiteException -> 0x0118 }
            if (r8 != 0) goto L_0x0111
        L_0x010d:
            r7.close()     // Catch:{ all -> 0x0028 }
            goto L_0x012c
        L_0x0111:
            long r5 = r7.getLong(r0)     // Catch:{ SQLiteException -> 0x0118 }
            goto L_0x010d
        L_0x0116:
            r1 = move-exception
            goto L_0x012f
        L_0x0118:
            r8 = move-exception
            java.lang.Object r4 = r4.f398a     // Catch:{ all -> 0x0116 }
            T1.u0 r4 = (T1.C0212u0) r4     // Catch:{ all -> 0x0116 }
            T1.Z r4 = r4.f3496r     // Catch:{ all -> 0x0116 }
            T1.C0212u0.k(r4)     // Catch:{ all -> 0x0116 }
            T1.X r4 = r4.f3172f     // Catch:{ all -> 0x0116 }
            java.lang.String r9 = "Error querying raw events"
            r4.b(r8, r9)     // Catch:{ all -> 0x0116 }
            if (r7 == 0) goto L_0x012c
            goto L_0x010d
        L_0x012c:
            r11.f3050J = r5     // Catch:{ all -> 0x0028 }
            goto L_0x0135
        L_0x012f:
            if (r7 == 0) goto L_0x0134
            r7.close()     // Catch:{ all -> 0x0028 }
        L_0x0134:
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x0135:
            r11.Y(r3, r1)     // Catch:{ all -> 0x0028 }
            goto L_0x01bb
        L_0x013a:
            r11.f3050J = r5     // Catch:{ all -> 0x0028 }
            T1.n r3 = r11.f3062c     // Catch:{ all -> 0x0028 }
            L(r3)     // Catch:{ all -> 0x0028 }
            r11.h0()     // Catch:{ all -> 0x0028 }
            T1.G r4 = T1.H.f2903e     // Catch:{ all -> 0x0028 }
            java.lang.Object r4 = r4.a(r7)     // Catch:{ all -> 0x0028 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0028 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0028 }
            long r1 = r1 - r4
            r3.o()     // Catch:{ all -> 0x0028 }
            r3.p()     // Catch:{ all -> 0x0028 }
            android.database.sqlite.SQLiteDatabase r4 = r3.k0()     // Catch:{ SQLiteException -> 0x0191, all -> 0x018e }
            java.lang.String r5 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SQLiteException -> 0x0191, all -> 0x018e }
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch:{ SQLiteException -> 0x0191, all -> 0x018e }
            android.database.Cursor r1 = r4.rawQuery(r5, r1)     // Catch:{ SQLiteException -> 0x0191, all -> 0x018e }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0185 }
            if (r2 != 0) goto L_0x0187
            java.lang.Object r2 = r3.f398a     // Catch:{ SQLiteException -> 0x0185 }
            T1.u0 r2 = (T1.C0212u0) r2     // Catch:{ SQLiteException -> 0x0185 }
            T1.Z r2 = r2.f3496r     // Catch:{ SQLiteException -> 0x0185 }
            T1.C0212u0.k(r2)     // Catch:{ SQLiteException -> 0x0185 }
            T1.X r2 = r2.f3180w     // Catch:{ SQLiteException -> 0x0185 }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r2.a(r4)     // Catch:{ SQLiteException -> 0x0185 }
        L_0x017f:
            r1.close()     // Catch:{ all -> 0x0028 }
            goto L_0x01a7
        L_0x0183:
            r2 = move-exception
            goto L_0x018c
        L_0x0185:
            r2 = move-exception
            goto L_0x0194
        L_0x0187:
            java.lang.String r7 = r1.getString(r0)     // Catch:{ SQLiteException -> 0x0185 }
            goto L_0x017f
        L_0x018c:
            r7 = r1
            goto L_0x01c1
        L_0x018e:
            r1 = move-exception
            r2 = r1
            goto L_0x01c1
        L_0x0191:
            r1 = move-exception
            r2 = r1
            r1 = r7
        L_0x0194:
            java.lang.Object r3 = r3.f398a     // Catch:{ all -> 0x0183 }
            T1.u0 r3 = (T1.C0212u0) r3     // Catch:{ all -> 0x0183 }
            T1.Z r3 = r3.f3496r     // Catch:{ all -> 0x0183 }
            T1.C0212u0.k(r3)     // Catch:{ all -> 0x0183 }
            T1.X r3 = r3.f3172f     // Catch:{ all -> 0x0183 }
            java.lang.String r4 = "Error selecting expired configs"
            r3.b(r2, r4)     // Catch:{ all -> 0x0183 }
            if (r1 == 0) goto L_0x01a7
            goto L_0x017f
        L_0x01a7:
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x01bb
            T1.n r1 = r11.f3062c     // Catch:{ all -> 0x0028 }
            L(r1)     // Catch:{ all -> 0x0028 }
            T1.V r1 = r1.l0(r7)     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x01bb
            r11.m(r1)     // Catch:{ all -> 0x0028 }
        L_0x01bb:
            r11.f3046E = r0
            r11.C()
            return
        L_0x01c1:
            if (r7 == 0) goto L_0x01c6
            r7.close()     // Catch:{ all -> 0x0028 }
        L_0x01c6:
            throw r2     // Catch:{ all -> 0x0028 }
        L_0x01c7:
            r11.f3046E = r0
            r11.C()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.T1.X():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01fe, code lost:
        if (r11 != null) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0911  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0929  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0931  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x096b  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0972  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Y(java.lang.String r33, long r34) {
        /*
            r32 = this;
            r8 = r32
            r9 = r33
            r1 = r34
            T1.g r0 = r32.h0()
            T1.G r3 = T1.H.h
            int r0 = r0.u(r9, r3)
            T1.g r3 = r32.h0()
            T1.G r4 = T1.H.f2912i
            int r3 = r3.u(r9, r4)
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
            T1.n r5 = r8.f3062c
            L(r5)
            java.lang.Object r6 = r5.f398a
            T1.u0 r6 = (T1.C0212u0) r6
            r5.o()
            r5.p()
            r7 = 1
            if (r0 <= 0) goto L_0x0033
            r10 = r7
            goto L_0x0034
        L_0x0033:
            r10 = r4
        L_0x0034:
            com.google.android.gms.common.internal.I.b(r10)
            if (r3 <= 0) goto L_0x003b
            r10 = r7
            goto L_0x003c
        L_0x003b:
            r10 = r4
        L_0x003c:
            com.google.android.gms.common.internal.I.b(r10)
            com.google.android.gms.common.internal.I.d(r33)
            android.database.sqlite.SQLiteDatabase r12 = r5.k0()     // Catch:{ SQLiteException -> 0x01e3, all -> 0x01e1 }
            java.lang.String r13 = "queue"
            java.lang.String r14 = "rowid"
            java.lang.String r15 = "data"
            java.lang.String r11 = "retry_count"
            java.lang.String[] r14 = new java.lang.String[]{r14, r15, r11}     // Catch:{ SQLiteException -> 0x01e3, all -> 0x01e1 }
            java.lang.String r15 = "app_id=?"
            java.lang.String[] r16 = new java.lang.String[]{r33}     // Catch:{ SQLiteException -> 0x01e3, all -> 0x01e1 }
            java.lang.String r19 = "rowid"
            java.lang.String r20 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x01e3, all -> 0x01e1 }
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x01e3, all -> 0x01e1 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0183 }
            if (r0 != 0) goto L_0x0075
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x0183 }
        L_0x0070:
            r11.close()
            goto L_0x0202
        L_0x0075:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0183 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0183 }
            r13 = r4
        L_0x007b:
            long r14 = r11.getLong(r4)     // Catch:{ SQLiteException -> 0x0183 }
            byte[] r0 = r11.getBlob(r7)     // Catch:{ IOException -> 0x01b5 }
            T1.T1 r7 = r5.f2982b     // Catch:{ IOException -> 0x01b5 }
            T1.d0 r7 = r7.f3065p     // Catch:{ IOException -> 0x01b5 }
            L(r7)     // Catch:{ IOException -> 0x01b5 }
            java.io.ByteArrayInputStream r10 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x019f }
            r10.<init>(r0)     // Catch:{ IOException -> 0x019f }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x019f }
            r0.<init>(r10)     // Catch:{ IOException -> 0x019f }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x019f }
            r4.<init>()     // Catch:{ IOException -> 0x019f }
            r19 = r5
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0197 }
        L_0x009f:
            int r1 = r0.read(r5)     // Catch:{ IOException -> 0x0197 }
            if (r1 > 0) goto L_0x0199
            r0.close()     // Catch:{ IOException -> 0x0197 }
            r10.close()     // Catch:{ IOException -> 0x0197 }
            byte[] r0 = r4.toByteArray()     // Catch:{ IOException -> 0x0197 }
            boolean r1 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x0183 }
            if (r1 != 0) goto L_0x00bb
            int r1 = r0.length     // Catch:{ SQLiteException -> 0x0183 }
            int r1 = r1 + r13
            if (r1 <= r3) goto L_0x00bb
            goto L_0x01d9
        L_0x00bb:
            com.google.android.gms.internal.measurement.zzhw r1 = com.google.android.gms.internal.measurement.zzhx.zzz()     // Catch:{ IOException -> 0x0181 }
            com.google.android.gms.internal.measurement.zzng r1 = T1.C0162d0.U(r1, r0)     // Catch:{ IOException -> 0x0181 }
            com.google.android.gms.internal.measurement.zzhw r1 = (com.google.android.gms.internal.measurement.zzhw) r1     // Catch:{ IOException -> 0x0181 }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x0183 }
            if (r2 != 0) goto L_0x015f
            r2 = 0
            java.lang.Object r4 = r12.get(r2)     // Catch:{ SQLiteException -> 0x0183 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ SQLiteException -> 0x0183 }
            java.lang.Object r2 = r4.first     // Catch:{ SQLiteException -> 0x0183 }
            com.google.android.gms.internal.measurement.zzhx r2 = (com.google.android.gms.internal.measurement.zzhx) r2     // Catch:{ SQLiteException -> 0x0183 }
            com.google.android.gms.internal.measurement.zzmd r4 = r1.zzba()     // Catch:{ SQLiteException -> 0x0183 }
            com.google.android.gms.internal.measurement.zzhx r4 = (com.google.android.gms.internal.measurement.zzhx) r4     // Catch:{ SQLiteException -> 0x0183 }
            java.lang.String r5 = r2.zzK()     // Catch:{ SQLiteException -> 0x0183 }
            java.lang.String r7 = r4.zzK()     // Catch:{ SQLiteException -> 0x0183 }
            boolean r5 = r5.equals(r7)     // Catch:{ SQLiteException -> 0x0183 }
            if (r5 == 0) goto L_0x01d9
            java.lang.String r5 = r2.zzJ()     // Catch:{ SQLiteException -> 0x0183 }
            java.lang.String r7 = r4.zzJ()     // Catch:{ SQLiteException -> 0x0183 }
            boolean r5 = r5.equals(r7)     // Catch:{ SQLiteException -> 0x0183 }
            if (r5 == 0) goto L_0x01d9
            boolean r5 = r2.zzbu()     // Catch:{ SQLiteException -> 0x0183 }
            boolean r7 = r4.zzbu()     // Catch:{ SQLiteException -> 0x0183 }
            if (r5 != r7) goto L_0x01d9
            java.lang.String r5 = r2.zzL()     // Catch:{ SQLiteException -> 0x0183 }
            java.lang.String r7 = r4.zzL()     // Catch:{ SQLiteException -> 0x0183 }
            boolean r5 = r5.equals(r7)     // Catch:{ SQLiteException -> 0x0183 }
            if (r5 == 0) goto L_0x01d9
            java.util.List r2 = r2.zzY()     // Catch:{ SQLiteException -> 0x0183 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ SQLiteException -> 0x0183 }
        L_0x0118:
            boolean r5 = r2.hasNext()     // Catch:{ SQLiteException -> 0x0183 }
            r22 = -1
            java.lang.String r7 = "_npa"
            if (r5 == 0) goto L_0x0137
            java.lang.Object r5 = r2.next()     // Catch:{ SQLiteException -> 0x0183 }
            com.google.android.gms.internal.measurement.zzio r5 = (com.google.android.gms.internal.measurement.zzio) r5     // Catch:{ SQLiteException -> 0x0183 }
            java.lang.String r10 = r5.zzg()     // Catch:{ SQLiteException -> 0x0183 }
            boolean r10 = r7.equals(r10)     // Catch:{ SQLiteException -> 0x0183 }
            if (r10 == 0) goto L_0x0118
            long r24 = r5.zzc()     // Catch:{ SQLiteException -> 0x0183 }
            goto L_0x0139
        L_0x0137:
            r24 = r22
        L_0x0139:
            java.util.List r2 = r4.zzY()     // Catch:{ SQLiteException -> 0x0183 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ SQLiteException -> 0x0183 }
        L_0x0141:
            boolean r4 = r2.hasNext()     // Catch:{ SQLiteException -> 0x0183 }
            if (r4 == 0) goto L_0x015b
            java.lang.Object r4 = r2.next()     // Catch:{ SQLiteException -> 0x0183 }
            com.google.android.gms.internal.measurement.zzio r4 = (com.google.android.gms.internal.measurement.zzio) r4     // Catch:{ SQLiteException -> 0x0183 }
            java.lang.String r5 = r4.zzg()     // Catch:{ SQLiteException -> 0x0183 }
            boolean r5 = r7.equals(r5)     // Catch:{ SQLiteException -> 0x0183 }
            if (r5 == 0) goto L_0x0141
            long r22 = r4.zzc()     // Catch:{ SQLiteException -> 0x0183 }
        L_0x015b:
            int r2 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x01d9
        L_0x015f:
            r2 = 2
            boolean r4 = r11.isNull(r2)     // Catch:{ SQLiteException -> 0x0183 }
            if (r4 != 0) goto L_0x016d
            int r4 = r11.getInt(r2)     // Catch:{ SQLiteException -> 0x0183 }
            r1.zzat(r4)     // Catch:{ SQLiteException -> 0x0183 }
        L_0x016d:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x0183 }
            int r13 = r13 + r0
            com.google.android.gms.internal.measurement.zzmd r0 = r1.zzba()     // Catch:{ SQLiteException -> 0x0183 }
            com.google.android.gms.internal.measurement.zzhx r0 = (com.google.android.gms.internal.measurement.zzhx) r0     // Catch:{ SQLiteException -> 0x0183 }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x0183 }
            android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ SQLiteException -> 0x0183 }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x0183 }
            goto L_0x01c8
        L_0x0181:
            r0 = move-exception
            goto L_0x0186
        L_0x0183:
            r0 = move-exception
            goto L_0x01ea
        L_0x0186:
            T1.Z r1 = r6.f3496r     // Catch:{ SQLiteException -> 0x0183 }
            T1.C0212u0.k(r1)     // Catch:{ SQLiteException -> 0x0183 }
            T1.X r1 = r1.f3172f     // Catch:{ SQLiteException -> 0x0183 }
            java.lang.String r2 = "Failed to merge queued bundle. appId"
            T1.Y r4 = T1.Z.w(r33)     // Catch:{ SQLiteException -> 0x0183 }
            r1.c(r2, r4, r0)     // Catch:{ SQLiteException -> 0x0183 }
            goto L_0x01c8
        L_0x0197:
            r0 = move-exception
            goto L_0x01a2
        L_0x0199:
            r2 = 0
            r4.write(r5, r2, r1)     // Catch:{ IOException -> 0x0197 }
            goto L_0x009f
        L_0x019f:
            r0 = move-exception
            r19 = r5
        L_0x01a2:
            java.lang.Object r1 = r7.f398a     // Catch:{ IOException -> 0x01b3 }
            T1.u0 r1 = (T1.C0212u0) r1     // Catch:{ IOException -> 0x01b3 }
            T1.Z r1 = r1.f3496r     // Catch:{ IOException -> 0x01b3 }
            T1.C0212u0.k(r1)     // Catch:{ IOException -> 0x01b3 }
            T1.X r1 = r1.f3172f     // Catch:{ IOException -> 0x01b3 }
            java.lang.String r2 = "Failed to ungzip content"
            r1.b(r0, r2)     // Catch:{ IOException -> 0x01b3 }
            throw r0     // Catch:{ IOException -> 0x01b3 }
        L_0x01b3:
            r0 = move-exception
            goto L_0x01b8
        L_0x01b5:
            r0 = move-exception
            r19 = r5
        L_0x01b8:
            T1.Z r1 = r6.f3496r     // Catch:{ SQLiteException -> 0x0183 }
            T1.C0212u0.k(r1)     // Catch:{ SQLiteException -> 0x0183 }
            T1.X r1 = r1.f3172f     // Catch:{ SQLiteException -> 0x0183 }
            java.lang.String r2 = "Failed to unzip queued bundle. appId"
            T1.Y r4 = T1.Z.w(r33)     // Catch:{ SQLiteException -> 0x0183 }
            r1.c(r2, r4, r0)     // Catch:{ SQLiteException -> 0x0183 }
        L_0x01c8:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0183 }
            if (r0 == 0) goto L_0x01d9
            if (r13 <= r3) goto L_0x01d1
            goto L_0x01d9
        L_0x01d1:
            r1 = r34
            r5 = r19
            r4 = 0
            r7 = 1
            goto L_0x007b
        L_0x01d9:
            r11.close()
            r0 = r12
            goto L_0x0202
        L_0x01de:
            r10 = r8
            goto L_0x0970
        L_0x01e1:
            r0 = move-exception
            goto L_0x01e5
        L_0x01e3:
            r0 = move-exception
            goto L_0x01e9
        L_0x01e5:
            r10 = r8
            r11 = 0
            goto L_0x0970
        L_0x01e9:
            r11 = 0
        L_0x01ea:
            T1.Z r1 = r6.f3496r     // Catch:{ all -> 0x096d }
            T1.C0212u0.k(r1)     // Catch:{ all -> 0x096d }
            T1.X r1 = r1.f3172f     // Catch:{ all -> 0x096d }
            java.lang.String r2 = "Error querying bundles. appId"
            T1.Y r3 = T1.Z.w(r33)     // Catch:{ all -> 0x096d }
            r1.c(r2, r3, r0)     // Catch:{ all -> 0x096d }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x096d }
            if (r11 == 0) goto L_0x0202
            goto L_0x0070
        L_0x0202:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x096b
            T1.J0 r1 = r32.n0(r33)
            T1.I0 r2 = T1.I0.AD_STORAGE
            boolean r1 = r1.k(r2)
            if (r1 == 0) goto L_0x0269
            java.util.Iterator r1 = r0.iterator()
        L_0x0218:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0237
            java.lang.Object r3 = r1.next()
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.Object r3 = r3.first
            com.google.android.gms.internal.measurement.zzhx r3 = (com.google.android.gms.internal.measurement.zzhx) r3
            java.lang.String r4 = r3.zzT()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0218
            java.lang.String r1 = r3.zzT()
            goto L_0x0238
        L_0x0237:
            r1 = 0
        L_0x0238:
            if (r1 == 0) goto L_0x0269
            r3 = 0
        L_0x023b:
            int r4 = r0.size()
            if (r3 >= r4) goto L_0x0269
            java.lang.Object r4 = r0.get(r3)
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r4 = r4.first
            com.google.android.gms.internal.measurement.zzhx r4 = (com.google.android.gms.internal.measurement.zzhx) r4
            java.lang.String r5 = r4.zzT()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0256
            goto L_0x0266
        L_0x0256:
            java.lang.String r4 = r4.zzT()
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0266
            r4 = 0
            java.util.List r0 = r0.subList(r4, r3)
            goto L_0x0269
        L_0x0266:
            int r3 = r3 + 1
            goto L_0x023b
        L_0x0269:
            com.google.android.gms.internal.measurement.zzht r1 = com.google.android.gms.internal.measurement.zzhv.zzb()
            int r3 = r0.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r0.size()
            r4.<init>(r5)
            T1.g r5 = r32.h0()
            java.lang.String r6 = "gaia_collection_enabled"
            T1.f r5 = r5.d
            java.lang.String r5 = r5.a(r9, r6)
            java.lang.String r6 = "1"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x029a
            T1.J0 r5 = r32.n0(r33)
            boolean r5 = r5.k(r2)
            if (r5 == 0) goto L_0x029a
            r5 = 1
            goto L_0x029b
        L_0x029a:
            r5 = 0
        L_0x029b:
            T1.J0 r6 = r32.n0(r33)
            boolean r2 = r6.k(r2)
            T1.J0 r6 = r32.n0(r33)
            T1.I0 r7 = T1.I0.ANALYTICS_STORAGE
            boolean r6 = r6.k(r7)
            com.google.android.gms.internal.measurement.zzrd.zzb()
            T1.g r7 = r32.h0()
            T1.G r10 = T1.H.L0
            boolean r7 = r7.B(r9, r10)
            T1.Q1 r10 = r8.f3068s
            java.lang.Object r11 = r10.f398a
            T1.u0 r11 = (T1.C0212u0) r11
            T1.g r12 = r11.f3494p
            T1.G r13 = T1.H.f2872P0
            r14 = 0
            boolean r12 = r12.B(r14, r13)
            T1.i1 r14 = T1.C0178i1.SGTM
            T1.i1 r15 = T1.C0178i1.GOOGLE_ANALYTICS
            r19 = r1
            T1.i1 r1 = T1.C0178i1.SGTM_CLIENT
            r20 = r7
            T1.T1 r7 = r10.f2982b
            r22 = r6
            java.lang.String r6 = "x-gtm-server-preview"
            r23 = r2
            T1.Z r2 = r11.f3496r
            if (r12 == 0) goto L_0x045e
            T1.n r12 = r7.f3062c
            L(r12)
            T1.V r12 = r12.l0(r9)
            if (r12 == 0) goto L_0x02f0
            boolean r24 = r12.t()
            if (r24 != 0) goto L_0x02fc
        L_0x02f0:
            r26 = r0
            r27 = r3
            r25 = r4
            r24 = r5
            r29 = r7
            goto L_0x044f
        L_0x02fc:
            r24 = r5
            com.google.android.gms.internal.measurement.zzif r5 = com.google.android.gms.internal.measurement.zzim.zza()
            r25 = r4
            r4 = 2
            r5.zzc(r4)
            int r4 = r12.R()
            com.google.android.gms.internal.measurement.zzih r4 = com.google.android.gms.internal.measurement.zzih.zzb(r4)
            com.google.android.gms.common.internal.I.g(r4)
            r5.zza(r4)
            java.lang.String r4 = r12.d()
            boolean r4 = r10.q(r9, r4)
            r26 = r0
            r0 = 3
            if (r4 != 0) goto L_0x0340
            r5.zzb(r0)
            T1.P1 r0 = new T1.P1
            java.lang.String r2 = r10.p(r9)
            java.util.Map r4 = java.util.Collections.emptyMap()
            com.google.android.gms.internal.measurement.zzmd r5 = r5.zzba()
            com.google.android.gms.internal.measurement.zzim r5 = (com.google.android.gms.internal.measurement.zzim) r5
            r0.<init>(r2, r4, r15, r5)
            r27 = r3
            r29 = r7
        L_0x033d:
            r4 = 0
            goto L_0x044a
        L_0x0340:
            java.lang.String r4 = r12.c()
            r27 = r3
            r3 = 2
            r5.zzc(r3)
            T1.n0 r3 = r7.f3060a
            L(r3)
            java.lang.String r0 = r12.c()
            com.google.android.gms.internal.measurement.zzgo r0 = r3.D(r0)
            if (r0 == 0) goto L_0x035f
            boolean r3 = r0.zzv()
            if (r3 != 0) goto L_0x0363
        L_0x035f:
            r29 = r7
            goto L_0x0424
        L_0x0363:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r29 = r12.i()
            boolean r29 = android.text.TextUtils.isEmpty(r29)
            if (r29 != 0) goto L_0x0379
            java.lang.String r8 = r12.i()
            r3.put(r6, r8)
        L_0x0379:
            com.google.android.gms.internal.measurement.zzgy r6 = r0.zzi()
            java.lang.String r6 = r6.zze()
            int r8 = r12.R()
            com.google.android.gms.internal.measurement.zzih r8 = com.google.android.gms.internal.measurement.zzih.zzb(r8)
            r29 = r7
            if (r8 == 0) goto L_0x0395
            com.google.android.gms.internal.measurement.zzih r7 = com.google.android.gms.internal.measurement.zzih.CLIENT_UPLOAD_ELIGIBLE
            if (r8 == r7) goto L_0x0395
            r5.zza(r8)
            goto L_0x03bf
        L_0x0395:
            T1.g r7 = r11.f3494p
            r8 = 0
            boolean r7 = r7.B(r8, r13)
            if (r7 != 0) goto L_0x03a4
            com.google.android.gms.internal.measurement.zzih r7 = com.google.android.gms.internal.measurement.zzih.SERVICE_FLAG_OFF
            r5.zza(r7)
            goto L_0x03bf
        L_0x03a4:
            java.lang.String r7 = r12.c()
            boolean r7 = T1.Q1.r(r7)
            if (r7 == 0) goto L_0x03b4
            com.google.android.gms.internal.measurement.zzih r7 = com.google.android.gms.internal.measurement.zzih.PINNED_TO_SERVICE_UPLOAD
            r5.zza(r7)
            goto L_0x03bf
        L_0x03b4:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x0405
            com.google.android.gms.internal.measurement.zzih r7 = com.google.android.gms.internal.measurement.zzih.MISSING_SGTM_SERVER_URL
            r5.zza(r7)
        L_0x03bf:
            com.google.android.gms.internal.measurement.zzgy r7 = r0.zzi()
            r7.zzf()
            com.google.android.gms.internal.measurement.zzgy r0 = r0.zzi()
            r0.zzd()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x03f1
            T1.C0212u0.k(r2)
            java.lang.String r0 = "[sgtm] Eligible for local service direct upload. appId"
            T1.X r2 = r2.f3180w
            r2.b(r4, r0)
            r0 = 5
            r5.zzc(r0)
            r2 = 2
            r5.zzb(r2)
            T1.P1 r0 = new T1.P1
            com.google.android.gms.internal.measurement.zzmd r2 = r5.zzba()
            com.google.android.gms.internal.measurement.zzim r2 = (com.google.android.gms.internal.measurement.zzim) r2
            r0.<init>(r6, r3, r14, r2)
            goto L_0x0433
        L_0x03f1:
            r0 = 6
            r5.zzb(r0)
            T1.C0212u0.k(r2)
            java.lang.String r0 = r12.c()
            java.lang.String r3 = "[sgtm] Local service, missing sgtm_server_url"
            T1.X r2 = r2.f3180w
            r2.b(r0, r3)
        L_0x0403:
            r0 = 0
            goto L_0x0433
        L_0x0405:
            T1.C0212u0.k(r2)
            java.lang.String r0 = "[sgtm] Eligible for client side upload. appId"
            T1.X r2 = r2.f3180w
            r2.b(r4, r0)
            r0 = 3
            r5.zzc(r0)
            com.google.android.gms.internal.measurement.zzih r0 = com.google.android.gms.internal.measurement.zzih.CLIENT_UPLOAD_ELIGIBLE
            r5.zza(r0)
            T1.P1 r0 = new T1.P1
            com.google.android.gms.internal.measurement.zzmd r2 = r5.zzba()
            com.google.android.gms.internal.measurement.zzim r2 = (com.google.android.gms.internal.measurement.zzim) r2
            r0.<init>(r6, r3, r1, r2)
            goto L_0x0433
        L_0x0424:
            T1.C0212u0.k(r2)
            java.lang.String r0 = "[sgtm] Missing sgtm_setting in remote config. appId"
            T1.X r2 = r2.f3180w
            r2.b(r4, r0)
            r0 = 4
            r5.zzb(r0)
            goto L_0x0403
        L_0x0433:
            if (r0 == 0) goto L_0x0437
            goto L_0x033d
        L_0x0437:
            T1.P1 r0 = new T1.P1
            java.lang.String r2 = r10.p(r9)
            java.util.Map r3 = java.util.Collections.emptyMap()
            com.google.android.gms.internal.measurement.zzmd r4 = r5.zzba()
            com.google.android.gms.internal.measurement.zzim r4 = (com.google.android.gms.internal.measurement.zzim) r4
            r0.<init>(r2, r3, r15, r4)
        L_0x044a:
            r8 = r0
            r0 = r29
            goto L_0x0541
        L_0x044f:
            T1.P1 r0 = new T1.P1
            java.lang.String r2 = r10.p(r9)
            java.util.Map r3 = java.util.Collections.emptyMap()
            r4 = 0
            r0.<init>(r2, r3, r15, r4)
            goto L_0x044a
        L_0x045e:
            r26 = r0
            r27 = r3
            r25 = r4
            r24 = r5
            r0 = r7
            r4 = 0
            T1.n r3 = r0.f3062c
            L(r3)
            T1.V r3 = r3.l0(r9)
            if (r3 != 0) goto L_0x0483
            T1.P1 r2 = new T1.P1
            java.lang.String r3 = r10.p(r9)
            java.util.Map r5 = java.util.Collections.emptyMap()
            r2.<init>(r3, r5, r15, r4)
        L_0x0480:
            r8 = r2
            goto L_0x0541
        L_0x0483:
            java.lang.String r4 = r3.d()
            boolean r4 = r10.q(r9, r4)
            if (r4 == 0) goto L_0x0531
            boolean r4 = r3.t()
            if (r4 != 0) goto L_0x0498
        L_0x0493:
            r4 = 0
            r21 = 0
            goto L_0x051d
        L_0x0498:
            T1.C0212u0.k(r2)
            T1.X r4 = r2.f3180w
            java.lang.String r5 = "sgtm upload enabled in manifest."
            r4.a(r5)
            T1.n0 r5 = r0.f3060a
            L(r5)
            java.lang.String r7 = r3.c()
            com.google.android.gms.internal.measurement.zzgo r5 = r5.D(r7)
            if (r5 == 0) goto L_0x051a
            boolean r7 = r5.zzv()
            if (r7 != 0) goto L_0x04b8
            goto L_0x0493
        L_0x04b8:
            com.google.android.gms.internal.measurement.zzgy r7 = r5.zzi()
            java.lang.String r7 = r7.zzf()
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L_0x04c7
            goto L_0x0493
        L_0x04c7:
            com.google.android.gms.internal.measurement.zzgy r5 = r5.zzi()
            java.lang.String r5 = r5.zzd()
            T1.C0212u0.k(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            r8 = 1
            if (r8 == r2) goto L_0x04dc
            java.lang.String r2 = "N"
            goto L_0x04de
        L_0x04dc:
            java.lang.String r2 = "Y"
        L_0x04de:
            java.lang.String r8 = "sgtm configured with upload_url, server_info"
            r4.c(r8, r7, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L_0x04f6
            T1.P1 r2 = new T1.P1
            java.util.Map r3 = java.util.Collections.emptyMap()
            r4 = 0
            r2.<init>(r7, r3, r14, r4)
            r21 = r2
            goto L_0x051d
        L_0x04f6:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r4 = "x-sgtm-server-info"
            r2.put(r4, r5)
            java.lang.String r4 = r3.i()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0511
            java.lang.String r3 = r3.i()
            r2.put(r6, r3)
        L_0x0511:
            T1.P1 r3 = new T1.P1
            r4 = 0
            r3.<init>(r7, r2, r14, r4)
            r21 = r3
            goto L_0x051d
        L_0x051a:
            r4 = 0
            r21 = r4
        L_0x051d:
            if (r21 == 0) goto L_0x0522
            r8 = r21
            goto L_0x0541
        L_0x0522:
            T1.P1 r2 = new T1.P1
            java.lang.String r3 = r10.p(r9)
            java.util.Map r5 = java.util.Collections.emptyMap()
            r2.<init>(r3, r5, r15, r4)
            goto L_0x0480
        L_0x0531:
            r4 = 0
            T1.P1 r2 = new T1.P1
            java.lang.String r3 = r10.p(r9)
            java.util.Map r5 = java.util.Collections.emptyMap()
            r2.<init>(r3, r5, r15, r4)
            goto L_0x0480
        L_0x0541:
            r2 = 0
            r10 = r32
        L_0x0544:
            T1.d0 r3 = r10.f3065p
            T1.u0 r11 = r10.f3070u
            r4 = r27
            if (r2 >= r4) goto L_0x069a
            r5 = r26
            java.lang.Object r6 = r5.get(r2)
            android.util.Pair r6 = (android.util.Pair) r6
            java.lang.Object r6 = r6.first
            com.google.android.gms.internal.measurement.zzhx r6 = (com.google.android.gms.internal.measurement.zzhx) r6
            com.google.android.gms.internal.measurement.zzlz r6 = r6.zzch()
            com.google.android.gms.internal.measurement.zzhw r6 = (com.google.android.gms.internal.measurement.zzhw) r6
            java.lang.Object r7 = r5.get(r2)
            android.util.Pair r7 = (android.util.Pair) r7
            java.lang.Object r7 = r7.second
            java.lang.Long r7 = (java.lang.Long) r7
            r12 = r25
            r12.add(r7)
            T1.g r7 = r32.h0()
            r7.v()
            r27 = r4
            r4 = 119002(0x1d0da, double:5.8795E-319)
            r6.zzaB(r4)
            r4 = r34
            r6.zzaA(r4)
            r11.getClass()
            r7 = 0
            r6.zzau(r7)
            if (r24 != 0) goto L_0x058d
            r6.zzt()
        L_0x058d:
            if (r23 != 0) goto L_0x0595
            r6.zzz()
            r6.zzw()
        L_0x0595:
            if (r22 != 0) goto L_0x059a
            r6.zzq()
        L_0x059a:
            r10.l(r6, r9)
            if (r20 != 0) goto L_0x05a2
            r6.zzA()
        L_0x05a2:
            if (r22 != 0) goto L_0x05a7
            r6.zzr()
        L_0x05a7:
            java.lang.String r11 = r6.zzaL()
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 != 0) goto L_0x05c0
            java.lang.String r13 = "00000000-0000-0000-0000-000000000000"
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto L_0x05ba
            goto L_0x05c0
        L_0x05ba:
            r29 = r0
            r28 = r14
            goto L_0x064c
        L_0x05c0:
            java.util.ArrayList r11 = new java.util.ArrayList
            java.util.List r13 = r6.zzaM()
            r11.<init>(r13)
            java.util.Iterator r13 = r11.iterator()
            r15 = r7
            r18 = r15
            r4 = 0
            r7 = 0
        L_0x05d2:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L_0x0636
            java.lang.Object r5 = r13.next()
            com.google.android.gms.internal.measurement.zzhm r5 = (com.google.android.gms.internal.measurement.zzhm) r5
            r29 = r0
            java.lang.String r0 = r5.zzh()
            r28 = r14
            java.lang.String r14 = "_fx"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x05f9
            r13.remove()
            r14 = r28
            r0 = r29
            r15 = 1
        L_0x05f6:
            r18 = 1
            goto L_0x05d2
        L_0x05f9:
            java.lang.String r0 = r5.zzh()
            java.lang.String r14 = "_f"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0631
            r32.a()
            java.lang.String r0 = "_pfo"
            com.google.android.gms.internal.measurement.zzhq r0 = T1.C0162d0.x(r5, r0)
            if (r0 == 0) goto L_0x0619
            long r30 = r0.zzd()
            java.lang.Long r0 = java.lang.Long.valueOf(r30)
            r7 = r0
        L_0x0619:
            r32.a()
            java.lang.String r0 = "_uwa"
            com.google.android.gms.internal.measurement.zzhq r0 = T1.C0162d0.x(r5, r0)
            if (r0 == 0) goto L_0x062c
            long r4 = r0.zzd()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
        L_0x062c:
            r14 = r28
            r0 = r29
            goto L_0x05f6
        L_0x0631:
            r14 = r28
            r0 = r29
            goto L_0x05d2
        L_0x0636:
            r29 = r0
            r28 = r14
            if (r15 == 0) goto L_0x0642
            r6.zzu()
            r6.zzj(r11)
        L_0x0642:
            if (r18 == 0) goto L_0x064c
            java.lang.String r0 = r6.zzaF()
            r5 = 1
            r10.V(r0, r5, r7, r4)
        L_0x064c:
            int r0 = r6.zzc()
            if (r0 != 0) goto L_0x0655
            r0 = r19
            goto L_0x068e
        L_0x0655:
            T1.g r0 = r32.h0()
            T1.G r4 = T1.H.f2847B0
            boolean r0 = r0.B(r9, r4)
            if (r0 == 0) goto L_0x0675
            com.google.android.gms.internal.measurement.zzmd r0 = r6.zzba()
            com.google.android.gms.internal.measurement.zzhx r0 = (com.google.android.gms.internal.measurement.zzhx) r0
            byte[] r0 = r0.zzcd()
            L(r3)
            long r3 = r3.O(r0)
            r6.zzQ(r3)
        L_0x0675:
            T1.g r0 = r32.h0()
            T1.G r3 = T1.H.f2872P0
            r4 = 0
            boolean r0 = r0.B(r4, r3)
            if (r0 == 0) goto L_0x0689
            com.google.android.gms.internal.measurement.zzim r0 = r8.d
            if (r0 == 0) goto L_0x0689
            r6.zzaw(r0)
        L_0x0689:
            r0 = r19
            r0.zzc(r6)
        L_0x068e:
            int r2 = r2 + 1
            r19 = r0
            r25 = r12
            r14 = r28
            r0 = r29
            goto L_0x0544
        L_0x069a:
            r29 = r0
            r28 = r14
            r0 = r19
            r12 = r25
            int r2 = r0.zza()
            if (r2 != 0) goto L_0x06bc
            r10.T(r12)
            java.util.List r7 = java.util.Collections.emptyList()
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r2 = 0
            r5 = 0
            r1 = r32
            r6 = r33
            r1.u(r2, r3, r4, r5, r6, r7)
            return
        L_0x06bc:
            com.google.android.gms.internal.measurement.zzmd r2 = r0.zzba()
            com.google.android.gms.internal.measurement.zzhv r2 = (com.google.android.gms.internal.measurement.zzhv) r2
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            T1.g r4 = r32.h0()
            T1.G r5 = T1.H.f2872P0
            r6 = 0
            boolean r4 = r4.B(r6, r5)
            T1.i1 r5 = r8.f3022c
            if (r4 == 0) goto L_0x06dc
            if (r5 != r1) goto L_0x06dc
            r4 = r28
            r1 = 1
            goto L_0x06df
        L_0x06dc:
            r4 = r28
            r1 = 0
        L_0x06df:
            if (r5 == r4) goto L_0x06ea
            if (r1 == 0) goto L_0x06e5
            r1 = 1
            goto L_0x06ea
        L_0x06e5:
            r5 = r34
            r0 = r2
            goto L_0x0902
        L_0x06ea:
            com.google.android.gms.internal.measurement.zzmd r2 = r0.zzba()
            com.google.android.gms.internal.measurement.zzhv r2 = (com.google.android.gms.internal.measurement.zzhv) r2
            java.util.List r2 = r2.zzh()
            java.util.Iterator r2 = r2.iterator()
        L_0x06f8:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0713
            java.lang.Object r4 = r2.next()
            com.google.android.gms.internal.measurement.zzhx r4 = (com.google.android.gms.internal.measurement.zzhx) r4
            boolean r4 = r4.zzbI()
            if (r4 == 0) goto L_0x06f8
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            goto L_0x0714
        L_0x0713:
            r2 = 0
        L_0x0714:
            com.google.android.gms.internal.measurement.zzmd r4 = r0.zzba()
            com.google.android.gms.internal.measurement.zzhv r4 = (com.google.android.gms.internal.measurement.zzhv) r4
            T1.r0 r5 = r32.f()
            r5.o()
            r32.k()
            com.google.android.gms.internal.measurement.zzht r5 = com.google.android.gms.internal.measurement.zzhv.zzc(r4)
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L_0x0731
            r5.zzf(r2)
        L_0x0731:
            T1.n0 r6 = r10.f3060a
            L(r6)
            java.lang.String r6 = r6.E(r9)
            boolean r13 = android.text.TextUtils.isEmpty(r6)
            if (r13 != 0) goto L_0x0743
            r5.zzg(r6)
        L_0x0743:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r4 = r4.zzh()
            java.util.Iterator r4 = r4.iterator()
        L_0x0750:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x076d
            java.lang.Object r13 = r4.next()
            com.google.android.gms.internal.measurement.zzhx r13 = (com.google.android.gms.internal.measurement.zzhx) r13
            com.google.android.gms.internal.measurement.zzhw r13 = com.google.android.gms.internal.measurement.zzhx.zzA(r13)
            r13.zzt()
            com.google.android.gms.internal.measurement.zzmd r13 = r13.zzba()
            com.google.android.gms.internal.measurement.zzhx r13 = (com.google.android.gms.internal.measurement.zzhx) r13
            r6.add(r13)
            goto L_0x0750
        L_0x076d:
            r5.zzd()
            r5.zzb(r6)
            T1.g r4 = r32.h0()
            T1.G r6 = T1.H.f2869N0
            r13 = 0
            boolean r4 = r4.B(r13, r6)
            if (r4 == 0) goto L_0x0799
            T1.Z r4 = r32.c()
            boolean r13 = android.text.TextUtils.isEmpty(r2)
            if (r13 == 0) goto L_0x078d
            java.lang.String r13 = "null"
            goto L_0x0791
        L_0x078d:
            java.lang.String r13 = r5.zzi()
        L_0x0791:
            java.lang.String r14 = "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: "
            T1.X r4 = r4.f3180w
            r4.b(r13, r14)
            goto L_0x07a4
        L_0x0799:
            T1.Z r4 = r32.c()
            java.lang.String r13 = "[sgtm] Processed MeasurementBatch for sGTM."
            T1.X r4 = r4.f3180w
            r4.a(r13)
        L_0x07a4:
            com.google.android.gms.internal.measurement.zzmd r4 = r5.zzba()
            com.google.android.gms.internal.measurement.zzhv r4 = (com.google.android.gms.internal.measurement.zzhv) r4
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x0880
            T1.g r5 = r32.h0()
            r13 = 0
            boolean r5 = r5.B(r13, r6)
            if (r5 == 0) goto L_0x0880
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzba()
            com.google.android.gms.internal.measurement.zzhv r0 = (com.google.android.gms.internal.measurement.zzhv) r0
            T1.r0 r5 = r32.f()
            r5.o()
            r32.k()
            com.google.android.gms.internal.measurement.zzht r5 = com.google.android.gms.internal.measurement.zzhv.zzb()
            T1.Z r6 = r32.c()
            java.lang.String r13 = "[sgtm] Processing Google Signal, sgtmJoinId:"
            T1.X r6 = r6.f3180w
            r6.b(r2, r13)
            r5.zzf(r2)
            java.util.List r0 = r0.zzh()
            java.util.Iterator r0 = r0.iterator()
        L_0x07e5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0807
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.measurement.zzhx r2 = (com.google.android.gms.internal.measurement.zzhx) r2
            com.google.android.gms.internal.measurement.zzhw r6 = com.google.android.gms.internal.measurement.zzhx.zzz()
            java.lang.String r13 = r2.zzN()
            r6.zzY(r13)
            int r2 = r2.zzd()
            r6.zzV(r2)
            r5.zzc(r6)
            goto L_0x07e5
        L_0x0807:
            com.google.android.gms.internal.measurement.zzmd r0 = r5.zzba()
            com.google.android.gms.internal.measurement.zzhv r0 = (com.google.android.gms.internal.measurement.zzhv) r0
            r2 = r29
            T1.n0 r2 = r2.f3060a
            L(r2)
            java.lang.String r2 = r2.E(r9)
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            T1.i1 r6 = T1.C0178i1.GOOGLE_SIGNAL
            T1.i1 r13 = T1.C0178i1.GOOGLE_SIGNAL_PENDING
            if (r5 != 0) goto L_0x0864
            T1.G r5 = T1.H.f2942s
            r14 = 0
            java.lang.Object r5 = r5.a(r14)
            java.lang.String r5 = (java.lang.String) r5
            android.net.Uri r5 = android.net.Uri.parse(r5)
            android.net.Uri$Builder r14 = r5.buildUpon()
            java.lang.String r5 = r5.getAuthority()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r2)
            java.lang.String r2 = "."
            r15.append(r2)
            r15.append(r5)
            java.lang.String r2 = r15.toString()
            r14.authority(r2)
            T1.P1 r2 = new T1.P1
            android.net.Uri r5 = r14.build()
            java.lang.String r5 = r5.toString()
            if (r1 == 0) goto L_0x085b
            r6 = r13
        L_0x085b:
            java.util.Map r13 = java.util.Collections.emptyMap()
            r14 = 0
            r2.<init>(r5, r13, r6, r14)
            goto L_0x0879
        L_0x0864:
            r14 = 0
            T1.P1 r2 = new T1.P1
            T1.G r5 = T1.H.f2942s
            java.lang.Object r5 = r5.a(r14)
            java.lang.String r5 = (java.lang.String) r5
            if (r1 == 0) goto L_0x0872
            r6 = r13
        L_0x0872:
            java.util.Map r13 = java.util.Collections.emptyMap()
            r2.<init>(r5, r13, r6, r14)
        L_0x0879:
            android.util.Pair r0 = android.util.Pair.create(r0, r2)
            r7.add(r0)
        L_0x0880:
            if (r1 == 0) goto L_0x08ff
            com.google.android.gms.internal.measurement.zzlz r0 = r4.zzch()
            com.google.android.gms.internal.measurement.zzht r0 = (com.google.android.gms.internal.measurement.zzht) r0
            r1 = 0
        L_0x0889:
            int r2 = r4.zza()
            if (r1 >= r2) goto L_0x08a7
            com.google.android.gms.internal.measurement.zzhx r2 = r4.zze(r1)
            com.google.android.gms.internal.measurement.zzlz r2 = r2.zzch()
            com.google.android.gms.internal.measurement.zzhw r2 = (com.google.android.gms.internal.measurement.zzhw) r2
            r2.zzC()
            r5 = r34
            r2.zzO(r5)
            r0.zze(r1, r2)
            int r1 = r1 + 1
            goto L_0x0889
        L_0x08a7:
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzba()
            com.google.android.gms.internal.measurement.zzhv r0 = (com.google.android.gms.internal.measurement.zzhv) r0
            android.util.Pair r0 = android.util.Pair.create(r0, r8)
            r7.add(r0)
            r10.T(r12)
            r2 = 0
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r5 = 0
            r1 = r32
            r6 = r33
            r1.u(r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = r8.f3020a
            boolean r0 = r10.c0(r9, r0)
            if (r0 == 0) goto L_0x096c
            T1.Z r0 = r32.c()
            java.lang.String r1 = "[sgtm] Sending sgtm batches available notification to app"
            T1.X r0 = r0.f3180w
            r0.b(r9, r1)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.google.android.gms.measurement.BATCHES_AVAILABLE"
            r0.setAction(r1)
            r0.setPackage(r9)
            android.content.Context r1 = r11.f3489a
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r2 >= r3) goto L_0x08ef
            r1.sendBroadcast(r0)
            goto L_0x08fe
        L_0x08ef:
            android.app.BroadcastOptions r2 = android.app.BroadcastOptions.makeBasic()
            android.app.BroadcastOptions r2 = r2.setShareIdentityEnabled(true)
            android.os.Bundle r2 = r2.toBundle()
            r1.sendBroadcast(r0, (java.lang.String) null, r2)
        L_0x08fe:
            return
        L_0x08ff:
            r5 = r34
            r0 = r4
        L_0x0902:
            T1.g r1 = r32.h0()
            T1.G r2 = T1.H.O0
            r4 = 0
            boolean r1 = r1.B(r4, r2)
            T1.d0 r11 = r10.f3061b
            if (r1 == 0) goto L_0x091a
            L(r11)
            boolean r1 = r11.N()
            if (r1 == 0) goto L_0x096c
        L_0x091a:
            T1.Z r1 = r32.c()
            java.lang.String r1 = r1.z()
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L_0x0931
            L(r3)
            java.lang.String r1 = r3.V(r0)
            goto L_0x0932
        L_0x0931:
            r1 = r4
        L_0x0932:
            r32.a()
            byte[] r2 = r0.zzcd()
            r10.T(r12)
            T1.y1 r3 = r10.f3067r
            T1.g0 r3 = r3.f3548r
            r3.b(r5)
            T1.Z r3 = r32.c()
            int r2 = r2.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "Uploading data. app, uncompressed size, data"
            T1.X r3 = r3.f3180w
            r3.d(r4, r9, r2, r1)
            r1 = 1
            r10.f3045D = r1
            L(r11)
            B0.h r12 = new B0.h
            r5 = 24
            r6 = 0
            r1 = r12
            r2 = r32
            r3 = r33
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r11.M(r9, r8, r0, r12)
            return
        L_0x096b:
            r10 = r8
        L_0x096c:
            return
        L_0x096d:
            r0 = move-exception
            goto L_0x01de
        L_0x0970:
            if (r11 == 0) goto L_0x0975
            r11.close()
        L_0x0975:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.T1.Y(java.lang.String, long):void");
    }

    public final void Z(String str) {
        zzhv zzhv;
        f().o();
        k();
        this.f3046E = true;
        try {
            C0212u0 u0Var = this.f3070u;
            u0Var.getClass();
            Boolean bool = u0Var.r().f3526e;
            if (bool == null) {
                c().f3175r.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                c().f3172f.a("Upload called in the client side when service should be used");
            } else if (this.f3073x > 0) {
                F();
            } else {
                C0162d0 d0Var = this.f3061b;
                L(d0Var);
                if (!d0Var.N()) {
                    c().f3180w.a("Network not connected, ignoring upload request");
                    F();
                } else {
                    C0191n nVar = this.f3062c;
                    L(nVar);
                    if (!nVar.N(str)) {
                        c().f3180w.b(str, "[sgtm] Upload queue has no batches for appId");
                    } else {
                        C0191n nVar2 = this.f3062c;
                        L(nVar2);
                        U1 t02 = nVar2.t0(str);
                        if (!(t02 == null || (zzhv = t02.f3080b) == null)) {
                            c().f3180w.d("[sgtm] Uploading data from upload queue. appId, type, url", str, t02.f3082e, t02.f3081c);
                            byte[] zzcd = zzhv.zzcd();
                            if (Log.isLoggable(c().z(), 2)) {
                                C0162d0 d0Var2 = this.f3065p;
                                L(d0Var2);
                                c().f3180w.d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(zzcd.length), d0Var2.V(zzhv));
                            }
                            this.f3045D = true;
                            C0162d0 d0Var3 = this.f3061b;
                            L(d0Var3);
                            d0Var3.M(str, new P1(t02.f3081c, t02.d, t02.f3082e, (zzim) null), zzhv, new C0009h(this, str, t02, 25, false));
                        }
                    }
                }
            }
        } finally {
            this.f3046E = false;
            C();
        }
    }

    public final C0162d0 a() {
        C0162d0 d0Var = this.f3065p;
        L(d0Var);
        return d0Var;
    }

    public final void a0(String str, zzhp zzhp, Bundle bundle, String str2) {
        int max;
        List unmodifiableList = Collections.unmodifiableList(Arrays.asList(new String[]{"_o", "_sn", "_sc", "_si"}));
        if (Y1.i0(zzhp.zzl()) || Y1.i0(str)) {
            C0170g h02 = h0();
            h02.getClass();
            max = Math.max(Math.max(Math.min(h02.u(str2, H.f2909g0), 500), 100), 256);
        } else {
            C0170g h03 = h0();
            h03.getClass();
            max = Math.max(Math.min(h03.u(str2, H.f2909g0), 500), 100);
        }
        long j6 = (long) max;
        long codePointCount = (long) zzhp.zzm().codePointCount(0, zzhp.zzm().length());
        e();
        String zzl = zzhp.zzl();
        h0();
        String y6 = Y1.y(zzl, 40, true);
        if (codePointCount > j6 && !unmodifiableList.contains(zzhp.zzl())) {
            if ("_ev".equals(zzhp.zzl())) {
                e();
                String zzm = zzhp.zzm();
                C0170g h04 = h0();
                h04.getClass();
                bundle.putString("_ev", Y1.y(zzm, Math.max(Math.max(Math.min(h04.u(str2, H.f2909g0), 500), 100), 256), true));
                return;
            }
            Z c3 = c();
            c3.f3177t.c("Param value is too long; discarded. Name, value length", y6, Long.valueOf(codePointCount));
            if (bundle.getLong("_err") == 0) {
                bundle.putLong("_err", 4);
                if (bundle.getString("_ev") == null) {
                    bundle.putString("_ev", y6);
                    bundle.putLong("_el", codePointCount);
                }
            }
            bundle.remove(zzhp.zzl());
        }
    }

    public final e b() {
        return this.f3070u.f3493f;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x04f8: MOVE  (r8v38 java.lang.String) = (r27v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:188:0x0542 */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0346 A[Catch:{ all -> 0x02cc, all -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0385 A[Catch:{ all -> 0x02cc, all -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0388 A[Catch:{ all -> 0x02cc, all -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03ed A[SYNTHETIC, Splitter:B:142:0x03ed] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0414 A[Catch:{ all -> 0x02cc, all -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x059e A[Catch:{ all -> 0x02cc, all -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x05e0 A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0675 A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x06b3 A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x06bc A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x06c2 A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x06ca A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x06d0 A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x06d8 A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x06de  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x06eb  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x06fa A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0700 A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0746 A[SYNTHETIC, Splitter:B:256:0x0746] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x07f6 A[SYNTHETIC, Splitter:B:303:0x07f6] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0826 A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x082b A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0837 A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x083c A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x08cf A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x08df A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0907 A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x090c A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x091f A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x09f2 A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0a09 A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0a6b A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0a92 A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0aab A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0b99 A[Catch:{ NumberFormatException -> 0x08a9, all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0c3b A[Catch:{ SQLiteException -> 0x0c51 }] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0c54  */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0ba7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0202 A[SYNTHETIC, Splitter:B:60:0x0202] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x026f A[Catch:{ all -> 0x02cc, all -> 0x0240 }] */
    public final void b0(T1.C0214v r48, T1.Z1 r49) {
        /*
            r47 = this;
            r1 = r47
            r2 = r49
            java.lang.String r3 = "events"
            java.lang.String r4 = "raw_events"
            java.lang.String r5 = "_sno"
            com.google.android.gms.common.internal.I.g(r49)
            long r6 = r2.f3186A
            java.lang.String r8 = r2.f3189D
            long r9 = r2.f3204e
            java.lang.String r11 = r2.F
            java.lang.String r12 = r2.f3203c
            java.lang.String r13 = r2.d
            java.lang.String r15 = r2.f3201a
            com.google.android.gms.common.internal.I.d(r15)
            long r31 = java.lang.System.nanoTime()
            T1.r0 r14 = r47.f()
            r14.o()
            r47.k()
            r47.a()
            java.lang.String r14 = r2.f3202b
            boolean r16 = android.text.TextUtils.isEmpty(r14)
            r33 = r6
            java.lang.String r6 = r2.f3215y
            if (r16 == 0) goto L_0x0043
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x0043
            goto L_0x0112
        L_0x0043:
            boolean r7 = r2.f3207q
            if (r7 != 0) goto L_0x004b
            r1.f0(r2)
            return
        L_0x004b:
            r16 = r14
            T1.n0 r14 = r47.m0()
            r36 = r6
            r35 = r7
            r7 = r48
            java.lang.String r6 = r7.f3508a
            boolean r14 = r14.H(r15, r6)
            java.lang.String r7 = "_err"
            r37 = r8
            T1.u0 r8 = r1.f3070u
            r38 = r9
            T1.A r9 = r1.f3059S
            if (r14 == 0) goto L_0x0113
            T1.Z r2 = r47.c()
            T1.X r2 = r2.v()
            T1.Y r3 = T1.Z.w(r15)
            T1.S r4 = r8.p()
            java.lang.String r4 = r4.d(r6)
            java.lang.String r5 = "Dropping blocked event. appId"
            r2.c(r5, r3, r4)
            T1.n0 r2 = r47.m0()
            java.lang.String r3 = "measurement.upload.blacklist_internal"
            java.lang.String r2 = r2.a(r15, r3)
            java.lang.String r3 = "1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x00bb
            T1.n0 r2 = r47.m0()
            java.lang.String r4 = "measurement.upload.blacklist_public"
            java.lang.String r2 = r2.a(r15, r4)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00a5
            goto L_0x00bb
        L_0x00a5:
            boolean r2 = r7.equals(r6)
            if (r2 != 0) goto L_0x0112
            r47.e()
            r19 = 0
            r16 = 11
            java.lang.String r17 = "_ev"
            r14 = r9
            r18 = r6
            T1.Y1.I(r14, r15, r16, r17, r18, r19)
            return
        L_0x00bb:
            T1.n r2 = r47.i0()
            T1.V r2 = r2.l0(r15)
            if (r2 == 0) goto L_0x0112
            T1.u0 r3 = r2.f3103a
            T1.r0 r4 = r3.f3497s
            T1.C0212u0.k(r4)
            r4.o()
            long r4 = r2.f3102T
            T1.r0 r3 = r3.f3497s
            T1.C0212u0.k(r3)
            r3.o()
            long r6 = r2.f3101S
            long r3 = java.lang.Math.max(r4, r6)
            G1.a r5 = r47.g()
            G1.b r5 = (G1.b) r5
            long r5 = r5.a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r47.h0()
            T1.G r5 = T1.H.f2866M
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0112
            T1.Z r3 = r47.c()
            T1.X r3 = r3.s()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.a(r4)
            r1.m(r2)
        L_0x0112:
            return
        L_0x0113:
            T1.a0 r6 = T1.C0153a0.c(r48)
            T1.Y1 r10 = r47.e()
            T1.g r14 = r47.h0()
            r14.getClass()
            r40 = r11
            T1.G r11 = T1.H.f2885W
            int r11 = r14.u(r15, r11)
            r14 = 100
            int r11 = java.lang.Math.min(r11, r14)
            r14 = 25
            int r11 = java.lang.Math.max(r11, r14)
            r10.H(r6, r11)
            T1.g r10 = r47.h0()
            T1.G r11 = T1.H.f2907f0
            int r10 = r10.u(r15, r11)
            r11 = 35
            int r10 = java.lang.Math.min(r10, r11)
            r11 = 10
            int r10 = java.lang.Math.max(r10, r11)
            java.util.TreeSet r11 = new java.util.TreeSet
            java.lang.Object r14 = r6.f3223e
            android.os.Bundle r14 = (android.os.Bundle) r14
            r41 = r12
            java.util.Set r12 = r14.keySet()
            r11.<init>(r12)
            java.util.Iterator r11 = r11.iterator()
        L_0x0162:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0186
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            r17 = r11
            java.lang.String r11 = "items"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0183
            T1.Y1 r11 = r47.e()
            android.os.Parcelable[] r12 = r14.getParcelableArray(r12)
            r11.G(r12, r10)
        L_0x0183:
            r11 = r17
            goto L_0x0162
        L_0x0186:
            T1.v r6 = r6.a()
            java.lang.String r10 = r6.f3508a
            T1.Z r11 = r47.c()
            java.lang.String r11 = r11.z()
            r12 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r12)
            if (r11 == 0) goto L_0x01b0
            T1.Z r11 = r47.c()
            T1.X r11 = r11.u()
            T1.S r12 = r8.p()
            java.lang.String r12 = r12.c(r6)
            java.lang.String r14 = "Logging event"
            r11.b(r12, r14)
        L_0x01b0:
            T1.n r11 = r47.i0()
            r11.z()
            r1.f0(r2)     // Catch:{ all -> 0x01d6 }
            java.lang.String r11 = "ecommerce_purchase"
            boolean r11 = r11.equals(r10)     // Catch:{ all -> 0x01d6 }
            java.lang.String r14 = "refund"
            if (r11 != 0) goto L_0x01d2
            java.lang.String r11 = "purchase"
            boolean r11 = r11.equals(r10)     // Catch:{ all -> 0x01d6 }
            if (r11 != 0) goto L_0x01d2
            boolean r11 = r14.equals(r10)     // Catch:{ all -> 0x01d6 }
            if (r11 == 0) goto L_0x01d4
        L_0x01d2:
            r11 = 1
            goto L_0x01db
        L_0x01d4:
            r11 = 0
            goto L_0x01db
        L_0x01d6:
            r0 = move-exception
            r7 = r1
        L_0x01d8:
            r1 = r0
            goto L_0x0cd9
        L_0x01db:
            java.lang.String r12 = "_iap"
            boolean r12 = r12.equals(r10)     // Catch:{ all -> 0x01d6 }
            r42 = r13
            java.lang.String r13 = "value"
            r43 = r3
            T1.u r3 = r6.f3509b
            if (r12 != 0) goto L_0x01fa
            if (r11 == 0) goto L_0x01ef
            r11 = 1
            goto L_0x01fa
        L_0x01ef:
            r45 = r4
            r27 = r5
        L_0x01f3:
            r48 = r13
            r11 = r15
            r44 = r16
            goto L_0x0378
        L_0x01fa:
            java.lang.String r12 = r3.y()     // Catch:{ all -> 0x01d6 }
            android.os.Bundle r1 = r3.f3472a
            if (r11 == 0) goto L_0x0262
            java.lang.Double r11 = r3.w()     // Catch:{ all -> 0x0240 }
            double r17 = r11.doubleValue()     // Catch:{ all -> 0x0240 }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r11 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r11 != 0) goto L_0x0225
            r11 = r4
            r27 = r5
            long r4 = r1.getLong(r13)     // Catch:{ all -> 0x0240 }
            double r4 = (double) r4     // Catch:{ all -> 0x0240 }
            double r17 = r4 * r19
            goto L_0x0228
        L_0x0222:
            r7 = r47
            goto L_0x01d8
        L_0x0225:
            r11 = r4
            r27 = r5
        L_0x0228:
            r4 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r1 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0242
            r4 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r1 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x0242
            long r4 = java.lang.Math.round(r17)     // Catch:{ all -> 0x0240 }
            boolean r1 = r14.equals(r10)     // Catch:{ all -> 0x0240 }
            if (r1 == 0) goto L_0x0269
            long r4 = -r4
            goto L_0x0269
        L_0x0240:
            r0 = move-exception
            goto L_0x0222
        L_0x0242:
            T1.Z r1 = r47.c()     // Catch:{ all -> 0x0240 }
            T1.X r1 = r1.v()     // Catch:{ all -> 0x0240 }
            java.lang.String r2 = "Data lost. Currency value is too big. appId"
            T1.Y r3 = T1.Z.w(r15)     // Catch:{ all -> 0x0240 }
            java.lang.Double r4 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0240 }
            r1.c(r2, r3, r4)     // Catch:{ all -> 0x0240 }
            T1.n r1 = r47.i0()     // Catch:{ all -> 0x0240 }
            r1.J()     // Catch:{ all -> 0x0240 }
        L_0x025e:
            r7 = r47
            goto L_0x064c
        L_0x0262:
            r11 = r4
            r27 = r5
            long r4 = r1.getLong(r13)     // Catch:{ all -> 0x0cd6 }
        L_0x0269:
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0240 }
            if (r1 != 0) goto L_0x0374
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ all -> 0x0240 }
            java.lang.String r1 = r12.toUpperCase(r1)     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = "[A-Z]{3}"
            boolean r12 = r1.matches(r12)     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x0374
            java.lang.String r12 = "_ltv_"
            java.lang.String r1 = r12.concat(r1)     // Catch:{ all -> 0x0240 }
            T1.n r12 = r47.i0()     // Catch:{ all -> 0x0240 }
            T1.X1 r12 = r12.u0(r15, r1)     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x0293
            java.lang.Object r12 = r12.f3154e     // Catch:{ all -> 0x0240 }
            boolean r14 = r12 instanceof java.lang.Long     // Catch:{ all -> 0x0240 }
            if (r14 != 0) goto L_0x0298
        L_0x0293:
            r48 = r15
            r12 = r16
            goto L_0x02d2
        L_0x0298:
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0240 }
            long r17 = r12.longValue()     // Catch:{ all -> 0x0240 }
            T1.X1 r12 = new T1.X1     // Catch:{ all -> 0x0240 }
            java.lang.String r14 = r6.f3510c     // Catch:{ all -> 0x0240 }
            G1.a r19 = r47.g()     // Catch:{ all -> 0x0240 }
            G1.b r19 = (G1.b) r19     // Catch:{ all -> 0x02cc }
            long r19 = r19.a()     // Catch:{ all -> 0x02cc }
            long r17 = r17 + r4
            java.lang.Long r4 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0240 }
            r5 = r16
            r16 = r14
            r14 = r12
            r48 = r15
            r17 = r1
            r18 = r19
            r20 = r4
            r14.<init>(r15, r16, r17, r18, r20)     // Catch:{ all -> 0x0240 }
            r44 = r5
            r45 = r11
            r11 = r48
            r48 = r13
            goto L_0x033c
        L_0x02cc:
            r0 = move-exception
        L_0x02cd:
            r1 = r0
            r7 = r47
            goto L_0x0cd9
        L_0x02d2:
            T1.n r14 = r47.i0()     // Catch:{ all -> 0x0240 }
            T1.g r15 = r47.h0()     // Catch:{ all -> 0x0240 }
            r44 = r12
            T1.G r12 = T1.H.f2877S     // Catch:{ all -> 0x0240 }
            r45 = r11
            r11 = r48
            int r12 = r15.u(r11, r12)     // Catch:{ all -> 0x0240 }
            int r12 = r12 + -1
            com.google.android.gms.common.internal.I.d(r11)     // Catch:{ all -> 0x0240 }
            r14.o()     // Catch:{ all -> 0x0240 }
            r14.p()     // Catch:{ all -> 0x0240 }
            android.database.sqlite.SQLiteDatabase r15 = r14.k0()     // Catch:{ SQLiteException -> 0x0308 }
            r48 = r13
            java.lang.String r13 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);"
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteException -> 0x0305 }
            java.lang.String[] r12 = new java.lang.String[]{r11, r11, r12}     // Catch:{ SQLiteException -> 0x0305 }
            r15.execSQL(r13, r12)     // Catch:{ SQLiteException -> 0x0305 }
            goto L_0x0321
        L_0x0305:
            r0 = move-exception
        L_0x0306:
            r12 = r0
            goto L_0x030c
        L_0x0308:
            r0 = move-exception
            r48 = r13
            goto L_0x0306
        L_0x030c:
            java.lang.Object r13 = r14.f398a     // Catch:{ all -> 0x02cc }
            T1.u0 r13 = (T1.C0212u0) r13     // Catch:{ all -> 0x02cc }
            T1.Z r13 = r13.c()     // Catch:{ all -> 0x0240 }
            T1.X r13 = r13.t()     // Catch:{ all -> 0x0240 }
            java.lang.String r14 = "Error pruning currencies. appId"
            T1.Y r15 = T1.Z.w(r11)     // Catch:{ all -> 0x0240 }
            r13.c(r14, r15, r12)     // Catch:{ all -> 0x0240 }
        L_0x0321:
            T1.X1 r12 = new T1.X1     // Catch:{ all -> 0x0240 }
            java.lang.String r13 = r6.f3510c     // Catch:{ all -> 0x0240 }
            G1.a r14 = r47.g()     // Catch:{ all -> 0x0240 }
            G1.b r14 = (G1.b) r14     // Catch:{ all -> 0x02cc }
            long r18 = r14.a()     // Catch:{ all -> 0x02cc }
            java.lang.Long r20 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0240 }
            r14 = r12
            r15 = r11
            r16 = r13
            r17 = r1
            r14.<init>(r15, r16, r17, r18, r20)     // Catch:{ all -> 0x0240 }
        L_0x033c:
            T1.n r1 = r47.i0()     // Catch:{ all -> 0x0240 }
            boolean r1 = r1.c0(r12)     // Catch:{ all -> 0x0240 }
            if (r1 != 0) goto L_0x0378
            T1.Z r1 = r47.c()     // Catch:{ all -> 0x0240 }
            T1.X r1 = r1.t()     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = "Too many unique user properties are set. Ignoring user property. appId"
            T1.Y r5 = T1.Z.w(r11)     // Catch:{ all -> 0x0240 }
            T1.S r13 = r8.p()     // Catch:{ all -> 0x0240 }
            java.lang.String r14 = r12.f3153c     // Catch:{ all -> 0x0240 }
            java.lang.String r13 = r13.f(r14)     // Catch:{ all -> 0x0240 }
            java.lang.Object r12 = r12.f3154e     // Catch:{ all -> 0x0240 }
            r1.d(r4, r5, r13, r12)     // Catch:{ all -> 0x0240 }
            r47.e()     // Catch:{ all -> 0x0240 }
            r18 = 0
            r19 = 0
            r16 = 9
            r17 = 0
            r14 = r9
            r15 = r11
            T1.Y1.I(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0240 }
            goto L_0x0378
        L_0x0374:
            r45 = r11
            goto L_0x01f3
        L_0x0378:
            boolean r1 = T1.Y1.j0(r10)     // Catch:{ all -> 0x0240 }
            boolean r4 = r7.equals(r10)     // Catch:{ all -> 0x0240 }
            r47.e()     // Catch:{ all -> 0x0240 }
            if (r3 != 0) goto L_0x0388
            r14 = 0
            goto L_0x03b1
        L_0x0388:
            android.os.Bundle r5 = r3.f3472a     // Catch:{ all -> 0x0240 }
            java.util.Set r5 = r5.keySet()     // Catch:{ all -> 0x0240 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0cd6 }
            r14 = 0
        L_0x0394:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x0cd6 }
            if (r7 == 0) goto L_0x03b1
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x03ae }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x03ae }
            java.lang.Object r7 = r3.x(r7)     // Catch:{ all -> 0x0240 }
            boolean r12 = r7 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x0394
            android.os.Parcelable[] r7 = (android.os.Parcelable[]) r7     // Catch:{ all -> 0x0240 }
            int r7 = r7.length     // Catch:{ all -> 0x0240 }
            long r12 = (long) r7     // Catch:{ all -> 0x0240 }
            long r14 = r14 + r12
            goto L_0x0394
        L_0x03ae:
            r0 = move-exception
            goto L_0x02cd
        L_0x03b1:
            r12 = 1
            long r18 = r14 + r12
            T1.n r14 = r47.i0()     // Catch:{ all -> 0x0240 }
            long r15 = r47.v()     // Catch:{ all -> 0x0240 }
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r20 = 1
            r17 = r11
            r21 = r1
            r23 = r4
            T1.j r5 = r14.p0(r15, r17, r18, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0240 }
            long r14 = r5.f3349b     // Catch:{ all -> 0x0240 }
            r47.h0()     // Catch:{ all -> 0x0240 }
            T1.G r7 = T1.H.f2921l     // Catch:{ all -> 0x0240 }
            r12 = 0
            java.lang.Object r7 = r7.a(r12)     // Catch:{ all -> 0x0240 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0240 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x0cd6 }
            long r12 = (long) r7
            long r14 = r14 - r12
            r12 = 0
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r7 <= 0) goto L_0x0414
            long r14 = r14 % r12
            r1 = 1
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x040b
            T1.Z r1 = r47.c()     // Catch:{ all -> 0x0240 }
            T1.X r1 = r1.t()     // Catch:{ all -> 0x0240 }
            java.lang.String r2 = "Data loss. Too many events logged. appId, count"
            T1.Y r3 = T1.Z.w(r11)     // Catch:{ all -> 0x0240 }
            long r4 = r5.f3349b     // Catch:{ all -> 0x0240 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0240 }
            r1.c(r2, r3, r4)     // Catch:{ all -> 0x0240 }
        L_0x040b:
            T1.n r1 = r47.i0()     // Catch:{ all -> 0x0240 }
            r1.J()     // Catch:{ all -> 0x0240 }
            goto L_0x025e
        L_0x0414:
            if (r1 == 0) goto L_0x046b
            long r14 = r5.f3348a     // Catch:{ all -> 0x0240 }
            r47.h0()     // Catch:{ all -> 0x0240 }
            T1.G r7 = T1.H.f2927n     // Catch:{ all -> 0x0240 }
            r12 = 0
            java.lang.Object r7 = r7.a(r12)     // Catch:{ all -> 0x0240 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0240 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x0240 }
            long r12 = (long) r7     // Catch:{ all -> 0x0240 }
            long r14 = r14 - r12
            r12 = 0
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x046b
            r12 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 % r12
            r1 = 1
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0450
            T1.Z r1 = r47.c()     // Catch:{ all -> 0x0240 }
            T1.X r1 = r1.t()     // Catch:{ all -> 0x0240 }
            java.lang.String r2 = "Data loss. Too many public events logged. appId, count"
            T1.Y r3 = T1.Z.w(r11)     // Catch:{ all -> 0x0240 }
            long r4 = r5.f3348a     // Catch:{ all -> 0x0240 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0240 }
            r1.c(r2, r3, r4)     // Catch:{ all -> 0x0240 }
        L_0x0450:
            r47.e()     // Catch:{ all -> 0x0240 }
            java.lang.String r17 = "_ev"
            java.lang.String r1 = r6.f3508a     // Catch:{ all -> 0x0240 }
            r19 = 0
            r16 = 16
            r14 = r9
            r15 = r11
            r18 = r1
            T1.Y1.I(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0240 }
            T1.n r1 = r47.i0()     // Catch:{ all -> 0x0240 }
            r1.J()     // Catch:{ all -> 0x0240 }
            goto L_0x025e
        L_0x046b:
            r7 = 1000000(0xf4240, float:1.401298E-39)
            java.lang.String r12 = r2.f3201a
            if (r4 == 0) goto L_0x04b7
            long r13 = r5.d     // Catch:{ all -> 0x0240 }
            T1.g r4 = r47.h0()     // Catch:{ all -> 0x0240 }
            T1.G r15 = T1.H.f2924m     // Catch:{ all -> 0x0240 }
            int r4 = r4.u(r12, r15)     // Catch:{ all -> 0x0240 }
            int r4 = java.lang.Math.min(r7, r4)     // Catch:{ all -> 0x0240 }
            r15 = 0
            int r4 = java.lang.Math.max(r15, r4)     // Catch:{ all -> 0x0240 }
            r46 = r8
            long r7 = (long) r4     // Catch:{ all -> 0x0240 }
            long r13 = r13 - r7
            r7 = 0
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x04b9
            r7 = 1
            int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x04ae
            T1.Z r1 = r47.c()     // Catch:{ all -> 0x0240 }
            T1.X r1 = r1.t()     // Catch:{ all -> 0x0240 }
            java.lang.String r2 = "Too many error events logged. appId, count"
            T1.Y r3 = T1.Z.w(r11)     // Catch:{ all -> 0x0240 }
            long r4 = r5.d     // Catch:{ all -> 0x0240 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0240 }
            r1.c(r2, r3, r4)     // Catch:{ all -> 0x0240 }
        L_0x04ae:
            T1.n r1 = r47.i0()     // Catch:{ all -> 0x0240 }
            r1.J()     // Catch:{ all -> 0x0240 }
            goto L_0x025e
        L_0x04b7:
            r46 = r8
        L_0x04b9:
            android.os.Bundle r3 = r3.v()     // Catch:{ all -> 0x0240 }
            T1.Y1 r4 = r47.e()     // Catch:{ all -> 0x0240 }
            java.lang.String r5 = "_o"
            java.lang.String r7 = r6.f3510c     // Catch:{ all -> 0x0240 }
            r4.J(r3, r5, r7)     // Catch:{ all -> 0x0240 }
            T1.Y1 r4 = r47.e()     // Catch:{ all -> 0x0240 }
            java.lang.String r5 = r2.f3197M     // Catch:{ all -> 0x0240 }
            boolean r4 = r4.e0(r11, r5)     // Catch:{ all -> 0x0240 }
            java.lang.String r5 = "_r"
            if (r4 == 0) goto L_0x04ec
            T1.Y1 r4 = r47.e()     // Catch:{ all -> 0x0240 }
            java.lang.String r8 = "_dbg"
            r13 = 1
            java.lang.Long r15 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0240 }
            r4.J(r3, r8, r15)     // Catch:{ all -> 0x0240 }
            T1.Y1 r4 = r47.e()     // Catch:{ all -> 0x0240 }
            r4.J(r3, r5, r15)     // Catch:{ all -> 0x0240 }
        L_0x04ec:
            java.lang.String r4 = "_s"
            boolean r4 = r4.equals(r10)     // Catch:{ all -> 0x0240 }
            if (r4 == 0) goto L_0x050d
            T1.n r4 = r47.i0()     // Catch:{ all -> 0x0240 }
            r8 = r27
            T1.X1 r4 = r4.u0(r12, r8)     // Catch:{ all -> 0x0240 }
            if (r4 == 0) goto L_0x050d
            java.lang.Object r4 = r4.f3154e     // Catch:{ all -> 0x0240 }
            boolean r13 = r4 instanceof java.lang.Long     // Catch:{ all -> 0x0240 }
            if (r13 == 0) goto L_0x050d
            T1.Y1 r13 = r47.e()     // Catch:{ all -> 0x0240 }
            r13.J(r3, r8, r4)     // Catch:{ all -> 0x0240 }
        L_0x050d:
            T1.g r4 = r47.h0()     // Catch:{ all -> 0x0240 }
            T1.G r8 = T1.H.g1     // Catch:{ all -> 0x0240 }
            r13 = 0
            boolean r4 = r4.B(r13, r8)     // Catch:{ all -> 0x0240 }
            if (r4 == 0) goto L_0x0542
            java.lang.String r4 = "am"
            boolean r4 = java.util.Objects.equals(r7, r4)     // Catch:{ all -> 0x0240 }
            if (r4 == 0) goto L_0x0542
            java.lang.String r4 = "_ai"
            boolean r4 = r10.equals(r4)     // Catch:{ all -> 0x0240 }
            if (r4 == 0) goto L_0x0542
            r4 = r48
            java.lang.Object r7 = r3.get(r4)     // Catch:{ all -> 0x0240 }
            if (r7 == 0) goto L_0x0542
            boolean r8 = r7 instanceof java.lang.String     // Catch:{ all -> 0x0240 }
            if (r8 == 0) goto L_0x0542
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0542 }
            double r7 = java.lang.Double.parseDouble(r7)     // Catch:{ NumberFormatException -> 0x0542 }
            r3.remove(r4)     // Catch:{ NumberFormatException -> 0x0542 }
            r3.putDouble(r4, r7)     // Catch:{ NumberFormatException -> 0x0542 }
        L_0x0542:
            T1.n r4 = r47.i0()     // Catch:{ all -> 0x0240 }
            java.lang.Object r7 = r4.f398a
            T1.u0 r7 = (T1.C0212u0) r7
            com.google.android.gms.common.internal.I.d(r11)     // Catch:{ all -> 0x0240 }
            r4.o()     // Catch:{ all -> 0x0240 }
            r4.p()     // Catch:{ all -> 0x0240 }
            android.database.sqlite.SQLiteDatabase r4 = r4.k0()     // Catch:{ SQLiteException -> 0x0582 }
            T1.g r8 = r7.f3494p     // Catch:{ SQLiteException -> 0x0582 }
            T1.G r10 = T1.H.f2936q     // Catch:{ SQLiteException -> 0x0582 }
            int r8 = r8.u(r11, r10)     // Catch:{ SQLiteException -> 0x0582 }
            r10 = 1000000(0xf4240, float:1.401298E-39)
            int r8 = java.lang.Math.min(r10, r8)     // Catch:{ SQLiteException -> 0x0582 }
            r10 = 0
            int r8 = java.lang.Math.max(r10, r8)     // Catch:{ SQLiteException -> 0x0582 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x0582 }
            java.lang.String r10 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            java.lang.String[] r8 = new java.lang.String[]{r11, r8}     // Catch:{ SQLiteException -> 0x0582 }
            r13 = r45
            int r4 = r4.delete(r13, r10, r8)     // Catch:{ SQLiteException -> 0x057f }
            long r7 = (long) r4
        L_0x057c:
            r14 = 0
            goto L_0x059a
        L_0x057f:
            r0 = move-exception
        L_0x0580:
            r4 = r0
            goto L_0x0586
        L_0x0582:
            r0 = move-exception
            r13 = r45
            goto L_0x0580
        L_0x0586:
            T1.Z r7 = r7.c()     // Catch:{ all -> 0x0240 }
            T1.X r7 = r7.t()     // Catch:{ all -> 0x0240 }
            java.lang.String r8 = "Error deleting over the limit events. appId"
            T1.Y r10 = T1.Z.w(r11)     // Catch:{ all -> 0x0240 }
            r7.c(r8, r10, r4)     // Catch:{ all -> 0x0240 }
            r7 = 0
            goto L_0x057c
        L_0x059a:
            int r4 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x05b3
            T1.Z r4 = r47.c()     // Catch:{ all -> 0x0240 }
            T1.X r4 = r4.v()     // Catch:{ all -> 0x0240 }
            java.lang.String r10 = "Data lost. Too many events stored on disk, deleted. appId"
            T1.Y r14 = T1.Z.w(r11)     // Catch:{ all -> 0x0240 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0240 }
            r4.c(r10, r14, r7)     // Catch:{ all -> 0x0240 }
        L_0x05b3:
            T1.r r4 = new T1.r     // Catch:{ all -> 0x0240 }
            r7 = r47
            T1.u0 r8 = r7.f3070u     // Catch:{ all -> 0x0654 }
            java.lang.String r10 = r6.f3510c     // Catch:{ all -> 0x0654 }
            java.lang.String r15 = r6.f3508a     // Catch:{ all -> 0x0654 }
            r48 = r5
            long r5 = r6.d     // Catch:{ all -> 0x0654 }
            r21 = 0
            r14 = r4
            r18 = r15
            r15 = r8
            r16 = r10
            r17 = r11
            r19 = r5
            r23 = r3
            r14.<init>((T1.C0212u0) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (long) r19, (long) r21, (android.os.Bundle) r23)     // Catch:{ all -> 0x0654 }
            T1.n r3 = r47.i0()     // Catch:{ all -> 0x0654 }
            java.lang.String r5 = r4.f3440b     // Catch:{ all -> 0x0654 }
            r6 = r43
            T1.s r3 = r3.Q(r6, r11, r5)     // Catch:{ all -> 0x0654 }
            if (r3 != 0) goto L_0x0675
            T1.n r3 = r47.i0()     // Catch:{ all -> 0x0654 }
            long r14 = r3.j0(r11)     // Catch:{ all -> 0x0654 }
            T1.g r3 = r47.h0()     // Catch:{ all -> 0x0654 }
            r3.getClass()     // Catch:{ all -> 0x0654 }
            T1.G r10 = T1.H.f2883V     // Catch:{ all -> 0x0654 }
            int r3 = r3.u(r11, r10)     // Catch:{ all -> 0x0654 }
            r45 = r13
            r13 = 2000(0x7d0, float:2.803E-42)
            int r3 = java.lang.Math.min(r3, r13)     // Catch:{ all -> 0x0654 }
            r13 = 500(0x1f4, float:7.0E-43)
            int r3 = java.lang.Math.max(r3, r13)     // Catch:{ all -> 0x0654 }
            long r2 = (long) r3     // Catch:{ all -> 0x0654 }
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0657
            if (r1 == 0) goto L_0x0657
            T1.Z r1 = r47.c()     // Catch:{ all -> 0x0654 }
            T1.X r1 = r1.t()     // Catch:{ all -> 0x0654 }
            java.lang.String r2 = "Too many event names used, ignoring event. appId, name, supported count"
            T1.Y r3 = T1.Z.w(r11)     // Catch:{ all -> 0x0654 }
            T1.S r4 = r8.p()     // Catch:{ all -> 0x0654 }
            java.lang.String r4 = r4.d(r5)     // Catch:{ all -> 0x0654 }
            T1.g r5 = r47.h0()     // Catch:{ all -> 0x0654 }
            r5.getClass()     // Catch:{ all -> 0x0654 }
            int r5 = r5.u(r11, r10)     // Catch:{ all -> 0x0654 }
            r6 = 2000(0x7d0, float:2.803E-42)
            int r5 = java.lang.Math.min(r5, r6)     // Catch:{ all -> 0x0654 }
            int r5 = java.lang.Math.max(r5, r13)     // Catch:{ all -> 0x0654 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0654 }
            r1.d(r2, r3, r4, r5)     // Catch:{ all -> 0x0654 }
            r47.e()     // Catch:{ all -> 0x0654 }
            r18 = 0
            r19 = 0
            r16 = 8
            r17 = 0
            r14 = r9
            r15 = r11
            T1.Y1.I(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0654 }
        L_0x064c:
            T1.n r1 = r47.i0()
            r1.D()
            return
        L_0x0654:
            r0 = move-exception
            goto L_0x01d8
        L_0x0657:
            T1.s r1 = new T1.s     // Catch:{ all -> 0x0654 }
            long r2 = r4.d     // Catch:{ all -> 0x0654 }
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r25 = 0
            r14 = r1
            r15 = r11
            r16 = r5
            r23 = r2
            r14.<init>(r15, r16, r17, r19, r21, r23, r25, r27, r28, r29, r30)     // Catch:{ all -> 0x0654 }
            goto L_0x0683
        L_0x0675:
            r45 = r13
            long r1 = r3.f3460f     // Catch:{ all -> 0x0654 }
            T1.r r4 = r4.a(r8, r1)     // Catch:{ all -> 0x0654 }
            long r1 = r4.d     // Catch:{ all -> 0x0654 }
            T1.s r1 = r3.b(r1)     // Catch:{ all -> 0x0654 }
        L_0x0683:
            T1.n r2 = r47.i0()     // Catch:{ all -> 0x0654 }
            r2.V(r6, r1)     // Catch:{ all -> 0x0654 }
            T1.r0 r1 = r47.f()     // Catch:{ all -> 0x0654 }
            r1.o()     // Catch:{ all -> 0x0654 }
            r47.k()     // Catch:{ all -> 0x0654 }
            java.lang.String r1 = r4.f3439a     // Catch:{ all -> 0x0654 }
            com.google.android.gms.common.internal.I.d(r1)     // Catch:{ all -> 0x0654 }
            boolean r1 = r1.equals(r12)     // Catch:{ all -> 0x0654 }
            com.google.android.gms.common.internal.I.b(r1)     // Catch:{ all -> 0x0654 }
            com.google.android.gms.internal.measurement.zzhw r1 = com.google.android.gms.internal.measurement.zzhx.zzz()     // Catch:{ all -> 0x0654 }
            r2 = 1
            r1.zzar(r2)     // Catch:{ all -> 0x0654 }
            java.lang.String r3 = "android"
            r1.zzan(r3)     // Catch:{ all -> 0x0654 }
            boolean r3 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0654 }
            if (r3 != 0) goto L_0x06b6
            r1.zzI(r12)     // Catch:{ all -> 0x0654 }
        L_0x06b6:
            boolean r3 = android.text.TextUtils.isEmpty(r42)     // Catch:{ all -> 0x0654 }
            if (r3 != 0) goto L_0x06c2
            r3 = r42
            r1.zzK(r3)     // Catch:{ all -> 0x0654 }
            goto L_0x06c4
        L_0x06c2:
            r3 = r42
        L_0x06c4:
            boolean r5 = android.text.TextUtils.isEmpty(r41)     // Catch:{ all -> 0x0654 }
            if (r5 != 0) goto L_0x06d0
            r5 = r41
            r1.zzL(r5)     // Catch:{ all -> 0x0654 }
            goto L_0x06d2
        L_0x06d0:
            r5 = r41
        L_0x06d2:
            boolean r6 = android.text.TextUtils.isEmpty(r40)     // Catch:{ all -> 0x0654 }
            if (r6 != 0) goto L_0x06de
            r6 = r40
            r1.zzav(r6)     // Catch:{ all -> 0x0654 }
            goto L_0x06e0
        L_0x06de:
            r6 = r40
        L_0x06e0:
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            r8 = r49
            long r13 = r8.f3209s
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x06ef
            int r10 = (int) r13
            r1.zzM(r10)     // Catch:{ all -> 0x0654 }
        L_0x06ef:
            r10 = r38
            r1.zzai(r10)     // Catch:{ all -> 0x0654 }
            boolean r15 = android.text.TextUtils.isEmpty(r44)     // Catch:{ all -> 0x0654 }
            if (r15 != 0) goto L_0x0700
            r15 = r44
            r1.zzah(r15)     // Catch:{ all -> 0x0654 }
            goto L_0x0702
        L_0x0700:
            r15 = r44
        L_0x0702:
            com.google.android.gms.common.internal.I.g(r12)     // Catch:{ all -> 0x0654 }
            T1.J0 r2 = r7.n0(r12)     // Catch:{ all -> 0x0654 }
            r40 = r6
            r38 = r10
            r6 = r37
            r10 = 100
            T1.J0 r11 = T1.J0.e(r10, r6)     // Catch:{ all -> 0x0654 }
            T1.J0 r2 = r2.f(r11)     // Catch:{ all -> 0x0654 }
            java.lang.String r11 = r2.i()     // Catch:{ all -> 0x0654 }
            r1.zzT(r11)     // Catch:{ all -> 0x0654 }
            java.lang.String r11 = r1.zzaJ()     // Catch:{ all -> 0x0654 }
            boolean r11 = r11.isEmpty()     // Catch:{ all -> 0x0654 }
            if (r11 == 0) goto L_0x0735
            boolean r11 = android.text.TextUtils.isEmpty(r36)     // Catch:{ all -> 0x0654 }
            if (r11 != 0) goto L_0x0735
            r11 = r36
            r1.zzH(r11)     // Catch:{ all -> 0x0654 }
        L_0x0735:
            com.google.android.gms.internal.measurement.zzqr.zzb()     // Catch:{ all -> 0x0654 }
            T1.g r11 = r47.h0()     // Catch:{ all -> 0x0654 }
            T1.G r10 = T1.H.f2884V0     // Catch:{ all -> 0x0654 }
            boolean r10 = r11.B(r12, r10)     // Catch:{ all -> 0x0654 }
            T1.I0 r11 = T1.I0.AD_STORAGE
            if (r10 == 0) goto L_0x07ec
            r47.e()     // Catch:{ all -> 0x0654 }
            boolean r10 = T1.Y1.W(r12)     // Catch:{ all -> 0x0654 }
            if (r10 == 0) goto L_0x07ec
            int r10 = r8.f3195K     // Catch:{ all -> 0x0654 }
            r1.zzG(r10)     // Catch:{ all -> 0x0654 }
            r16 = r13
            long r13 = r8.f3196L     // Catch:{ all -> 0x0654 }
            boolean r2 = r2.k(r11)     // Catch:{ all -> 0x0654 }
            r18 = 32
            if (r2 != 0) goto L_0x076c
            r20 = 0
            int r2 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x076c
            r20 = -2
            long r13 = r13 & r20
            long r13 = r13 | r18
        L_0x076c:
            r20 = 1
            int r2 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r2 != 0) goto L_0x0774
            r2 = 1
            goto L_0x0775
        L_0x0774:
            r2 = 0
        L_0x0775:
            r1.zzaa(r2)     // Catch:{ all -> 0x0654 }
            r22 = 0
            int r2 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x0780
            goto L_0x07ee
        L_0x0780:
            com.google.android.gms.internal.measurement.zzhf r2 = com.google.android.gms.internal.measurement.zzhg.zza()     // Catch:{ all -> 0x0654 }
            long r24 = r13 & r20
            int r10 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r10 == 0) goto L_0x078c
            r10 = 1
            goto L_0x078d
        L_0x078c:
            r10 = 0
        L_0x078d:
            r2.zzc(r10)     // Catch:{ all -> 0x0654 }
            r20 = 2
            long r20 = r13 & r20
            int r10 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r10 == 0) goto L_0x079a
            r10 = 1
            goto L_0x079b
        L_0x079a:
            r10 = 0
        L_0x079b:
            r2.zze(r10)     // Catch:{ all -> 0x0654 }
            r20 = 4
            long r20 = r13 & r20
            int r10 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r10 == 0) goto L_0x07a8
            r10 = 1
            goto L_0x07a9
        L_0x07a8:
            r10 = 0
        L_0x07a9:
            r2.zzf(r10)     // Catch:{ all -> 0x0654 }
            r20 = 8
            long r20 = r13 & r20
            int r10 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r10 == 0) goto L_0x07b6
            r10 = 1
            goto L_0x07b7
        L_0x07b6:
            r10 = 0
        L_0x07b7:
            r2.zzg(r10)     // Catch:{ all -> 0x0654 }
            r20 = 16
            long r20 = r13 & r20
            int r10 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r10 == 0) goto L_0x07c4
            r10 = 1
            goto L_0x07c5
        L_0x07c4:
            r10 = 0
        L_0x07c5:
            r2.zzb(r10)     // Catch:{ all -> 0x0654 }
            long r18 = r13 & r18
            int r10 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r10 == 0) goto L_0x07d0
            r10 = 1
            goto L_0x07d1
        L_0x07d0:
            r10 = 0
        L_0x07d1:
            r2.zza(r10)     // Catch:{ all -> 0x0654 }
            r18 = 64
            long r13 = r13 & r18
            int r10 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r10 == 0) goto L_0x07de
            r10 = 1
            goto L_0x07df
        L_0x07de:
            r10 = 0
        L_0x07df:
            r2.zzd(r10)     // Catch:{ all -> 0x0654 }
            com.google.android.gms.internal.measurement.zzmd r2 = r2.zzba()     // Catch:{ all -> 0x0654 }
            com.google.android.gms.internal.measurement.zzhg r2 = (com.google.android.gms.internal.measurement.zzhg) r2     // Catch:{ all -> 0x0654 }
            r1.zzN(r2)     // Catch:{ all -> 0x0654 }
            goto L_0x07ee
        L_0x07ec:
            r16 = r13
        L_0x07ee:
            long r13 = r8.f3205f
            r18 = 0
            int r2 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r2 == 0) goto L_0x07f9
            r1.zzW(r13)     // Catch:{ all -> 0x0654 }
        L_0x07f9:
            r18 = r13
            r13 = r33
            r1.zzZ(r13)     // Catch:{ all -> 0x0654 }
            T1.d0 r2 = r47.a()     // Catch:{ all -> 0x0654 }
            T1.T1 r10 = r2.f2982b     // Catch:{ all -> 0x0654 }
            T1.u0 r10 = r10.f3070u     // Catch:{ all -> 0x0654 }
            android.content.Context r10 = r10.d()     // Catch:{ all -> 0x0654 }
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch:{ all -> 0x0654 }
            java.lang.String r20 = "com.google.android.gms.measurement"
            r33 = r13
            android.net.Uri r13 = com.google.android.gms.internal.measurement.zzjx.zza(r20)     // Catch:{ all -> 0x0654 }
            P4.q r14 = new P4.q     // Catch:{ all -> 0x0654 }
            r42 = r3
            r3 = 1
            r14.<init>(r3)     // Catch:{ all -> 0x0654 }
            com.google.android.gms.internal.measurement.zzjm r3 = com.google.android.gms.internal.measurement.zzjm.zza(r10, r13, r14)     // Catch:{ all -> 0x0654 }
            if (r3 != 0) goto L_0x082b
            java.util.Map r3 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0654 }
            goto L_0x082f
        L_0x082b:
            java.util.Map r3 = r3.zzd()     // Catch:{ all -> 0x0654 }
        L_0x082f:
            if (r3 == 0) goto L_0x0837
            boolean r10 = r3.isEmpty()     // Catch:{ all -> 0x0654 }
            if (r10 == 0) goto L_0x083c
        L_0x0837:
            r41 = r5
        L_0x0839:
            r10 = 0
            goto L_0x08cd
        L_0x083c:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0654 }
            r10.<init>()     // Catch:{ all -> 0x0654 }
            T1.G r13 = T1.H.f2904e0     // Catch:{ all -> 0x0654 }
            r14 = 0
            java.lang.Object r13 = r13.a(r14)     // Catch:{ all -> 0x0654 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x0654 }
            int r13 = r13.intValue()     // Catch:{ all -> 0x0654 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x0654 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0654 }
        L_0x0856:
            boolean r14 = r3.hasNext()     // Catch:{ all -> 0x0654 }
            if (r14 == 0) goto L_0x08c3
            java.lang.Object r14 = r3.next()     // Catch:{ all -> 0x0654 }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ all -> 0x0654 }
            java.lang.Object r20 = r14.getKey()     // Catch:{ all -> 0x0654 }
            r21 = r3
            r3 = r20
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0654 }
            r41 = r5
            java.lang.String r5 = "measurement.id."
            boolean r3 = r3.startsWith(r5)     // Catch:{ all -> 0x0654 }
            if (r3 == 0) goto L_0x08ac
            java.lang.Object r3 = r14.getValue()     // Catch:{ NumberFormatException -> 0x08a9 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ NumberFormatException -> 0x08a9 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x08a9 }
            if (r3 == 0) goto L_0x08ac
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x08a9 }
            r10.add(r3)     // Catch:{ NumberFormatException -> 0x08a9 }
            int r3 = r10.size()     // Catch:{ NumberFormatException -> 0x08a9 }
            if (r3 < r13) goto L_0x08ac
            java.lang.Object r3 = r2.f398a     // Catch:{ NumberFormatException -> 0x08a9 }
            T1.u0 r3 = (T1.C0212u0) r3     // Catch:{ NumberFormatException -> 0x08a9 }
            T1.Z r3 = r3.c()     // Catch:{ NumberFormatException -> 0x08a9 }
            T1.X r3 = r3.v()     // Catch:{ NumberFormatException -> 0x08a9 }
            java.lang.String r5 = "Too many experiment IDs. Number of IDs"
            int r14 = r10.size()     // Catch:{ NumberFormatException -> 0x08a9 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ NumberFormatException -> 0x08a9 }
            r3.b(r14, r5)     // Catch:{ NumberFormatException -> 0x08a9 }
            goto L_0x08c5
        L_0x08a9:
            r0 = move-exception
            r3 = r0
            goto L_0x08b1
        L_0x08ac:
            r3 = r21
            r5 = r41
            goto L_0x0856
        L_0x08b1:
            java.lang.Object r5 = r2.f398a     // Catch:{ all -> 0x0654 }
            T1.u0 r5 = (T1.C0212u0) r5     // Catch:{ all -> 0x0654 }
            T1.Z r5 = r5.c()     // Catch:{ all -> 0x0654 }
            T1.X r5 = r5.v()     // Catch:{ all -> 0x0654 }
            java.lang.String r14 = "Experiment ID NumberFormatException"
            r5.b(r3, r14)     // Catch:{ all -> 0x0654 }
            goto L_0x08ac
        L_0x08c3:
            r41 = r5
        L_0x08c5:
            boolean r2 = r10.isEmpty()     // Catch:{ all -> 0x0654 }
            if (r2 == 0) goto L_0x08cd
            goto L_0x0839
        L_0x08cd:
            if (r10 == 0) goto L_0x08d2
            r1.zzk(r10)     // Catch:{ all -> 0x0654 }
        L_0x08d2:
            T1.g r2 = r47.h0()     // Catch:{ all -> 0x0654 }
            T1.G r3 = T1.H.f2920k1     // Catch:{ all -> 0x0654 }
            r5 = 0
            boolean r2 = r2.B(r5, r3)     // Catch:{ all -> 0x0654 }
            if (r2 == 0) goto L_0x08e4
            java.lang.String r2 = ""
            r1.zzaf(r2)     // Catch:{ all -> 0x0654 }
        L_0x08e4:
            T1.J0 r2 = r7.n0(r12)     // Catch:{ all -> 0x0654 }
            r3 = 100
            T1.J0 r3 = T1.J0.e(r3, r6)     // Catch:{ all -> 0x0654 }
            T1.J0 r2 = r2.f(r3)     // Catch:{ all -> 0x0654 }
            boolean r3 = r2.k(r11)     // Catch:{ all -> 0x0654 }
            if (r3 == 0) goto L_0x09b2
            boolean r3 = r8.f3213w     // Catch:{ all -> 0x0654 }
            if (r3 == 0) goto L_0x09b2
            T1.y1 r3 = r7.f3067r     // Catch:{ all -> 0x0654 }
            r3.getClass()     // Catch:{ all -> 0x0654 }
            boolean r5 = r2.k(r11)     // Catch:{ all -> 0x0654 }
            if (r5 == 0) goto L_0x090c
            android.util.Pair r3 = r3.s(r12)     // Catch:{ all -> 0x0654 }
            goto L_0x0915
        L_0x090c:
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0654 }
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0654 }
            java.lang.String r6 = ""
            r3.<init>(r6, r5)     // Catch:{ all -> 0x0654 }
        L_0x0915:
            java.lang.Object r5 = r3.first     // Catch:{ all -> 0x0654 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x0654 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0654 }
            if (r5 != 0) goto L_0x09b2
            java.lang.Object r5 = r3.first     // Catch:{ all -> 0x0654 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0654 }
            r1.zzas(r5)     // Catch:{ all -> 0x0654 }
            java.lang.Object r5 = r3.second     // Catch:{ all -> 0x0654 }
            if (r5 == 0) goto L_0x0933
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0654 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0654 }
            r1.zzal(r5)     // Catch:{ all -> 0x0654 }
        L_0x0933:
            java.lang.String r5 = r4.f3440b     // Catch:{ all -> 0x0654 }
            java.lang.String r6 = "_fx"
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0654 }
            if (r5 != 0) goto L_0x09b2
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0654 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0654 }
            java.lang.String r5 = "00000000-0000-0000-0000-000000000000"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x0654 }
            if (r3 != 0) goto L_0x09b2
            T1.n r3 = r47.i0()     // Catch:{ all -> 0x0654 }
            T1.V r3 = r3.l0(r12)     // Catch:{ all -> 0x0654 }
            if (r3 == 0) goto L_0x09b2
            T1.u0 r5 = r3.f3103a
            T1.r0 r6 = r5.f3497s     // Catch:{ all -> 0x0654 }
            T1.C0212u0.k(r6)     // Catch:{ all -> 0x0654 }
            r6.o()     // Catch:{ all -> 0x0654 }
            boolean r6 = r3.f3125z     // Catch:{ all -> 0x0654 }
            if (r6 == 0) goto L_0x09b2
            r6 = 0
            r10 = 0
            r7.V(r12, r10, r6, r6)     // Catch:{ all -> 0x0654 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x0654 }
            r6.<init>()     // Catch:{ all -> 0x0654 }
            T1.r0 r10 = r5.f3497s     // Catch:{ all -> 0x0654 }
            T1.C0212u0.k(r10)     // Catch:{ all -> 0x0654 }
            r10.o()     // Catch:{ all -> 0x0654 }
            java.lang.Long r10 = r3.f3084A     // Catch:{ all -> 0x0654 }
            if (r10 == 0) goto L_0x098c
            java.lang.String r13 = "_pfo"
            r14 = r11
            long r10 = r10.longValue()     // Catch:{ all -> 0x0654 }
            r20 = r14
            r44 = r15
            r14 = 0
            long r10 = java.lang.Math.max(r14, r10)     // Catch:{ all -> 0x0654 }
            r6.putLong(r13, r10)     // Catch:{ all -> 0x0654 }
            goto L_0x0990
        L_0x098c:
            r20 = r11
            r44 = r15
        L_0x0990:
            T1.r0 r5 = r5.f3497s     // Catch:{ all -> 0x0654 }
            T1.C0212u0.k(r5)     // Catch:{ all -> 0x0654 }
            r5.o()     // Catch:{ all -> 0x0654 }
            java.lang.Long r3 = r3.f3085B     // Catch:{ all -> 0x0654 }
            if (r3 == 0) goto L_0x09a5
            java.lang.String r5 = "_uwa"
            long r10 = r3.longValue()     // Catch:{ all -> 0x0654 }
            r6.putLong(r5, r10)     // Catch:{ all -> 0x0654 }
        L_0x09a5:
            r3 = r48
            r10 = 1
            r6.putLong(r3, r10)     // Catch:{ all -> 0x0654 }
            java.lang.String r5 = "_fx"
            r9.v(r12, r5, r6)     // Catch:{ all -> 0x0654 }
            goto L_0x09b8
        L_0x09b2:
            r3 = r48
            r20 = r11
            r44 = r15
        L_0x09b8:
            T1.q r5 = r46.m()     // Catch:{ all -> 0x0654 }
            r5.q()     // Catch:{ all -> 0x0654 }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ all -> 0x0654 }
            r1.zzX(r5)     // Catch:{ all -> 0x0654 }
            T1.q r5 = r46.m()     // Catch:{ all -> 0x0654 }
            r5.q()     // Catch:{ all -> 0x0654 }
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0654 }
            r1.zzam(r5)     // Catch:{ all -> 0x0654 }
            T1.q r5 = r46.m()     // Catch:{ all -> 0x0654 }
            long r5 = r5.s()     // Catch:{ all -> 0x0654 }
            int r5 = (int) r5     // Catch:{ all -> 0x0654 }
            r1.zzaz(r5)     // Catch:{ all -> 0x0654 }
            T1.q r5 = r46.m()     // Catch:{ all -> 0x0654 }
            java.lang.String r5 = r5.t()     // Catch:{ all -> 0x0654 }
            r1.zzaD(r5)     // Catch:{ all -> 0x0654 }
            long r5 = r8.f3192H     // Catch:{ all -> 0x0654 }
            r1.zzay(r5)     // Catch:{ all -> 0x0654 }
            boolean r5 = r46.a()     // Catch:{ all -> 0x0654 }
            if (r5 == 0) goto L_0x09ff
            r1.zzaF()     // Catch:{ all -> 0x0654 }
            r5 = 0
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0654 }
            if (r6 != 0) goto L_0x09ff
            r1.zzY(r5)     // Catch:{ all -> 0x0654 }
        L_0x09ff:
            T1.n r5 = r47.i0()     // Catch:{ all -> 0x0654 }
            T1.V r5 = r5.l0(r12)     // Catch:{ all -> 0x0654 }
            if (r5 != 0) goto L_0x0a6b
            T1.V r5 = new T1.V     // Catch:{ all -> 0x0654 }
            r6 = r46
            r5.<init>(r6, r12)     // Catch:{ all -> 0x0654 }
            java.lang.String r6 = r7.h(r2)     // Catch:{ all -> 0x0654 }
            r5.l(r6)     // Catch:{ all -> 0x0654 }
            java.lang.String r6 = r8.f3210t     // Catch:{ all -> 0x0654 }
            r5.G(r6)     // Catch:{ all -> 0x0654 }
            r6 = r44
            r5.H(r6)     // Catch:{ all -> 0x0654 }
            r6 = r20
            boolean r6 = r2.k(r6)     // Catch:{ all -> 0x0654 }
            if (r6 == 0) goto L_0x0a34
            T1.y1 r6 = r7.f3067r     // Catch:{ all -> 0x0654 }
            boolean r8 = r8.f3213w     // Catch:{ all -> 0x0654 }
            java.lang.String r6 = r6.t(r12, r8)     // Catch:{ all -> 0x0654 }
            r5.P(r6)     // Catch:{ all -> 0x0654 }
        L_0x0a34:
            r8 = 0
            r5.M(r8)     // Catch:{ all -> 0x0654 }
            r5.N(r8)     // Catch:{ all -> 0x0654 }
            r5.L(r8)     // Catch:{ all -> 0x0654 }
            r6 = r41
            r5.n(r6)     // Catch:{ all -> 0x0654 }
            r8 = r16
            r5.o(r8)     // Catch:{ all -> 0x0654 }
            r6 = r42
            r5.m(r6)     // Catch:{ all -> 0x0654 }
            r8 = r38
            r5.I(r8)     // Catch:{ all -> 0x0654 }
            r8 = r18
            r5.C(r8)     // Catch:{ all -> 0x0654 }
            r6 = r35
            r5.O(r6)     // Catch:{ all -> 0x0654 }
            r8 = r33
            r5.E(r8)     // Catch:{ all -> 0x0654 }
            T1.n r6 = r47.i0()     // Catch:{ all -> 0x0654 }
            r15 = 0
            r6.K(r5, r15)     // Catch:{ all -> 0x0654 }
            goto L_0x0a6c
        L_0x0a6b:
            r15 = 0
        L_0x0a6c:
            T1.I0 r6 = T1.I0.ANALYTICS_STORAGE     // Catch:{ all -> 0x0654 }
            boolean r2 = r2.k(r6)     // Catch:{ all -> 0x0654 }
            if (r2 == 0) goto L_0x0a88
            java.lang.String r2 = r5.d()     // Catch:{ all -> 0x0654 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0654 }
            if (r2 != 0) goto L_0x0a88
            java.lang.String r2 = r5.d()     // Catch:{ all -> 0x0654 }
            com.google.android.gms.common.internal.I.g(r2)     // Catch:{ all -> 0x0654 }
            r1.zzJ(r2)     // Catch:{ all -> 0x0654 }
        L_0x0a88:
            java.lang.String r2 = r5.f()     // Catch:{ all -> 0x0654 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0654 }
            if (r2 != 0) goto L_0x0a9c
            java.lang.String r2 = r5.f()     // Catch:{ all -> 0x0654 }
            com.google.android.gms.common.internal.I.g(r2)     // Catch:{ all -> 0x0654 }
            r1.zzag(r2)     // Catch:{ all -> 0x0654 }
        L_0x0a9c:
            T1.n r2 = r47.i0()     // Catch:{ all -> 0x0654 }
            java.util.List r2 = r2.w(r12)     // Catch:{ all -> 0x0654 }
            r6 = r15
        L_0x0aa5:
            int r8 = r2.size()     // Catch:{ all -> 0x0654 }
            if (r6 >= r8) goto L_0x0b34
            com.google.android.gms.internal.measurement.zzin r8 = com.google.android.gms.internal.measurement.zzio.zze()     // Catch:{ all -> 0x0654 }
            java.lang.Object r9 = r2.get(r6)     // Catch:{ all -> 0x0654 }
            T1.X1 r9 = (T1.X1) r9     // Catch:{ all -> 0x0654 }
            java.lang.String r9 = r9.f3153c     // Catch:{ all -> 0x0654 }
            r8.zzf(r9)     // Catch:{ all -> 0x0654 }
            java.lang.Object r9 = r2.get(r6)     // Catch:{ all -> 0x0654 }
            T1.X1 r9 = (T1.X1) r9     // Catch:{ all -> 0x0654 }
            long r9 = r9.d     // Catch:{ all -> 0x0654 }
            r8.zzg(r9)     // Catch:{ all -> 0x0654 }
            T1.d0 r9 = r47.a()     // Catch:{ all -> 0x0654 }
            java.lang.Object r10 = r2.get(r6)     // Catch:{ all -> 0x0654 }
            T1.X1 r10 = (T1.X1) r10     // Catch:{ all -> 0x0654 }
            java.lang.Object r10 = r10.f3154e     // Catch:{ all -> 0x0654 }
            r9.b0(r8, r10)     // Catch:{ all -> 0x0654 }
            r1.zzo(r8)     // Catch:{ all -> 0x0654 }
            java.lang.String r8 = "_sid"
            java.lang.Object r9 = r2.get(r6)     // Catch:{ all -> 0x0654 }
            T1.X1 r9 = (T1.X1) r9     // Catch:{ all -> 0x0654 }
            java.lang.String r9 = r9.f3153c     // Catch:{ all -> 0x0654 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0654 }
            if (r8 == 0) goto L_0x0b2c
            T1.u0 r8 = r5.f3103a     // Catch:{ all -> 0x0654 }
            T1.r0 r8 = r8.f3497s     // Catch:{ all -> 0x0654 }
            T1.C0212u0.k(r8)     // Catch:{ all -> 0x0654 }
            r8.o()     // Catch:{ all -> 0x0654 }
            long r8 = r5.f3123x     // Catch:{ all -> 0x0654 }
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0b2c
            T1.d0 r8 = r47.a()     // Catch:{ all -> 0x0654 }
            boolean r9 = android.text.TextUtils.isEmpty(r40)     // Catch:{ all -> 0x0654 }
            if (r9 == 0) goto L_0x0b08
            r10 = r40
            r12 = 0
            goto L_0x0b18
        L_0x0b08:
            java.lang.String r9 = "UTF-8"
            java.nio.charset.Charset r9 = java.nio.charset.Charset.forName(r9)     // Catch:{ all -> 0x0654 }
            r10 = r40
            byte[] r9 = r10.getBytes(r9)     // Catch:{ all -> 0x0654 }
            long r12 = r8.O(r9)     // Catch:{ all -> 0x0654 }
        L_0x0b18:
            T1.u0 r8 = r5.f3103a     // Catch:{ all -> 0x0654 }
            T1.r0 r8 = r8.f3497s     // Catch:{ all -> 0x0654 }
            T1.C0212u0.k(r8)     // Catch:{ all -> 0x0654 }
            r8.o()     // Catch:{ all -> 0x0654 }
            long r8 = r5.f3123x     // Catch:{ all -> 0x0654 }
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x0b2e
            r1.zzA()     // Catch:{ all -> 0x0654 }
            goto L_0x0b2e
        L_0x0b2c:
            r10 = r40
        L_0x0b2e:
            int r6 = r6 + 1
            r40 = r10
            goto L_0x0aa5
        L_0x0b34:
            T1.n r2 = r47.i0()     // Catch:{ IOException -> 0x0c71 }
            com.google.android.gms.internal.measurement.zzmd r5 = r1.zzba()     // Catch:{ IOException -> 0x0c71 }
            com.google.android.gms.internal.measurement.zzhx r5 = (com.google.android.gms.internal.measurement.zzhx) r5     // Catch:{ IOException -> 0x0c71 }
            r2.o()     // Catch:{ IOException -> 0x0c71 }
            r2.p()     // Catch:{ IOException -> 0x0c71 }
            com.google.android.gms.common.internal.I.g(r5)     // Catch:{ IOException -> 0x0c71 }
            java.lang.String r6 = r5.zzF()     // Catch:{ IOException -> 0x0c71 }
            com.google.android.gms.common.internal.I.d(r6)     // Catch:{ IOException -> 0x0c71 }
            byte[] r6 = r5.zzcd()     // Catch:{ IOException -> 0x0c71 }
            T1.T1 r8 = r2.f2982b     // Catch:{ IOException -> 0x0c71 }
            T1.d0 r8 = r8.a()     // Catch:{ IOException -> 0x0c71 }
            long r8 = r8.O(r6)     // Catch:{ IOException -> 0x0c71 }
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ IOException -> 0x0c71 }
            r10.<init>()     // Catch:{ IOException -> 0x0c71 }
            java.lang.String r11 = "app_id"
            java.lang.String r12 = r5.zzF()     // Catch:{ IOException -> 0x0c71 }
            r10.put(r11, r12)     // Catch:{ IOException -> 0x0c71 }
            java.lang.String r11 = "metadata_fingerprint"
            java.lang.Long r12 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x0c71 }
            r10.put(r11, r12)     // Catch:{ IOException -> 0x0c71 }
            java.lang.String r11 = "metadata"
            r10.put(r11, r6)     // Catch:{ IOException -> 0x0c71 }
            android.database.sqlite.SQLiteDatabase r6 = r2.k0()     // Catch:{ SQLiteException -> 0x0c74 }
            java.lang.String r11 = "raw_events_metadata"
            r12 = 4
            r13 = 0
            r6.insertWithOnConflict(r11, r13, r10, r12)     // Catch:{ SQLiteException -> 0x0c74 }
            T1.n r1 = r47.i0()     // Catch:{ all -> 0x0654 }
            T1.u r2 = r4.f3443f     // Catch:{ all -> 0x0654 }
            android.os.Bundle r2 = r2.f3472a     // Catch:{ all -> 0x0654 }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x0654 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0654 }
        L_0x0b93:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0654 }
            if (r5 == 0) goto L_0x0ba7
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0654 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0654 }
            boolean r5 = r3.equals(r5)     // Catch:{ all -> 0x0654 }
            if (r5 == 0) goto L_0x0b93
        L_0x0ba5:
            r12 = 1
            goto L_0x0bde
        L_0x0ba7:
            T1.n0 r2 = r47.m0()     // Catch:{ all -> 0x0654 }
            java.lang.String r3 = r4.f3439a     // Catch:{ all -> 0x0654 }
            java.lang.String r5 = r4.f3440b     // Catch:{ all -> 0x0654 }
            boolean r2 = r2.G(r3, r5)     // Catch:{ all -> 0x0654 }
            T1.n r16 = r47.i0()     // Catch:{ all -> 0x0654 }
            long r22 = r47.v()     // Catch:{ all -> 0x0654 }
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = r3
            T1.j r5 = r16.o0(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0654 }
            if (r2 == 0) goto L_0x0bdd
            long r5 = r5.f3351e     // Catch:{ all -> 0x0654 }
            T1.g r2 = r47.h0()     // Catch:{ all -> 0x0654 }
            T1.G r10 = T1.H.f2933p     // Catch:{ all -> 0x0654 }
            int r2 = r2.u(r3, r10)     // Catch:{ all -> 0x0654 }
            long r2 = (long) r2     // Catch:{ all -> 0x0654 }
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0bdd
            goto L_0x0ba5
        L_0x0bdd:
            r12 = r15
        L_0x0bde:
            r1.o()     // Catch:{ all -> 0x0654 }
            r1.p()     // Catch:{ all -> 0x0654 }
            java.lang.String r2 = r4.f3439a     // Catch:{ all -> 0x0654 }
            com.google.android.gms.common.internal.I.d(r2)     // Catch:{ all -> 0x0654 }
            T1.T1 r3 = r1.f2982b     // Catch:{ all -> 0x0654 }
            T1.d0 r3 = r3.a()     // Catch:{ all -> 0x0654 }
            com.google.android.gms.internal.measurement.zzhm r3 = r3.T(r4)     // Catch:{ all -> 0x0654 }
            byte[] r3 = r3.zzcd()     // Catch:{ all -> 0x0654 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0654 }
            r5.<init>()     // Catch:{ all -> 0x0654 }
            java.lang.String r6 = "app_id"
            r5.put(r6, r2)     // Catch:{ all -> 0x0654 }
            java.lang.String r6 = "name"
            java.lang.String r10 = r4.f3440b     // Catch:{ all -> 0x0654 }
            r5.put(r6, r10)     // Catch:{ all -> 0x0654 }
            java.lang.String r6 = "timestamp"
            long r10 = r4.d     // Catch:{ all -> 0x0654 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0654 }
            r5.put(r6, r10)     // Catch:{ all -> 0x0654 }
            java.lang.String r6 = "metadata_fingerprint"
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0654 }
            r5.put(r6, r8)     // Catch:{ all -> 0x0654 }
            java.lang.String r6 = "data"
            r5.put(r6, r3)     // Catch:{ all -> 0x0654 }
            java.lang.String r3 = "realtime"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0654 }
            r5.put(r3, r6)     // Catch:{ all -> 0x0654 }
            android.database.sqlite.SQLiteDatabase r3 = r1.k0()     // Catch:{ SQLiteException -> 0x0c51 }
            r6 = r45
            r8 = 0
            long r5 = r3.insert(r6, r8, r5)     // Catch:{ SQLiteException -> 0x0c51 }
            r8 = -1
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0c54
            java.lang.Object r3 = r1.f398a     // Catch:{ SQLiteException -> 0x0c51 }
            T1.u0 r3 = (T1.C0212u0) r3     // Catch:{ SQLiteException -> 0x0c51 }
            T1.Z r3 = r3.c()     // Catch:{ SQLiteException -> 0x0c51 }
            T1.X r3 = r3.t()     // Catch:{ SQLiteException -> 0x0c51 }
            java.lang.String r5 = "Failed to insert raw event (got -1). appId"
            T1.Y r2 = T1.Z.w(r2)     // Catch:{ SQLiteException -> 0x0c51 }
            r3.b(r2, r5)     // Catch:{ SQLiteException -> 0x0c51 }
            goto L_0x0ca5
        L_0x0c51:
            r0 = move-exception
            r2 = r0
            goto L_0x0c59
        L_0x0c54:
            r2 = 0
            r7.f3073x = r2     // Catch:{ all -> 0x0654 }
            goto L_0x0ca5
        L_0x0c59:
            java.lang.Object r1 = r1.f398a     // Catch:{ all -> 0x0654 }
            T1.u0 r1 = (T1.C0212u0) r1     // Catch:{ all -> 0x0654 }
            T1.Z r1 = r1.c()     // Catch:{ all -> 0x0654 }
            T1.X r1 = r1.t()     // Catch:{ all -> 0x0654 }
            java.lang.String r3 = "Error storing raw event. appId"
            java.lang.String r4 = r4.f3439a     // Catch:{ all -> 0x0654 }
            T1.Y r4 = T1.Z.w(r4)     // Catch:{ all -> 0x0654 }
            r1.c(r3, r4, r2)     // Catch:{ all -> 0x0654 }
            goto L_0x0ca5
        L_0x0c71:
            r0 = move-exception
            r2 = r0
            goto L_0x0c90
        L_0x0c74:
            r0 = move-exception
            r3 = r0
            java.lang.Object r2 = r2.f398a     // Catch:{ IOException -> 0x0c71 }
            T1.u0 r2 = (T1.C0212u0) r2     // Catch:{ IOException -> 0x0c71 }
            T1.Z r2 = r2.c()     // Catch:{ IOException -> 0x0c71 }
            T1.X r2 = r2.t()     // Catch:{ IOException -> 0x0c71 }
            java.lang.String r4 = "Error storing raw event metadata. appId"
            java.lang.String r5 = r5.zzF()     // Catch:{ IOException -> 0x0c71 }
            T1.Y r5 = T1.Z.w(r5)     // Catch:{ IOException -> 0x0c71 }
            r2.c(r4, r5, r3)     // Catch:{ IOException -> 0x0c71 }
            throw r3     // Catch:{ IOException -> 0x0c71 }
        L_0x0c90:
            T1.Z r3 = r47.c()     // Catch:{ all -> 0x0654 }
            T1.X r3 = r3.t()     // Catch:{ all -> 0x0654 }
            java.lang.String r4 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r1 = r1.zzaF()     // Catch:{ all -> 0x0654 }
            T1.Y r1 = T1.Z.w(r1)     // Catch:{ all -> 0x0654 }
            r3.c(r4, r1, r2)     // Catch:{ all -> 0x0654 }
        L_0x0ca5:
            T1.n r1 = r47.i0()     // Catch:{ all -> 0x0654 }
            r1.J()     // Catch:{ all -> 0x0654 }
            T1.n r1 = r47.i0()
            r1.D()
            r47.F()
            T1.Z r1 = r47.c()
            T1.X r1 = r1.u()
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r31
            r4 = 500000(0x7a120, double:2.47033E-318)
            long r2 = r2 + r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "Background event processing time, ms"
            r1.b(r2, r3)
            return
        L_0x0cd6:
            r0 = move-exception
            goto L_0x0222
        L_0x0cd9:
            T1.n r2 = r47.i0()
            r2.D()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.T1.b0(T1.v, T1.Z1):void");
    }

    public final Z c() {
        C0212u0 u0Var = this.f3070u;
        I.g(u0Var);
        Z z3 = u0Var.f3496r;
        C0212u0.k(z3);
        return z3;
    }

    public final boolean c0(String str, String str2) {
        C0191n nVar = this.f3062c;
        L(nVar);
        V l02 = nVar.l0(str);
        HashMap hashMap = this.f3054N;
        if (l02 == null || !e().e0(str, l02.i())) {
            S1 s12 = (S1) hashMap.get(str2);
            if (s12 == null) {
                return true;
            }
            ((b) s12.f3036a.g()).getClass();
            if (System.currentTimeMillis() >= s12.f3038c) {
                return true;
            }
            return false;
        }
        hashMap.remove(str2);
        return true;
    }

    public final Context d() {
        return this.f3070u.f3489a;
    }

    public final Bundle d0(String str) {
        String str2;
        int i2;
        String str3;
        f().o();
        k();
        C0192n0 n0Var = this.f3060a;
        L(n0Var);
        if (n0Var.C(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        J0 n02 = n0(str);
        Bundle bundle2 = new Bundle();
        Iterator it2 = n02.f2970a.entrySet().iterator();
        while (true) {
            str2 = "denied";
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            int ordinal = ((G0) entry.getValue()).ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    str2 = null;
                } else {
                    str2 = "granted";
                }
            }
            if (str2 != null) {
                bundle2.putString(((I0) entry.getKey()).f2965a, str2);
            }
        }
        bundle.putAll(bundle2);
        C0197p j02 = j0(str, k0(str), n02, new t());
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : j02.f3428e.entrySet()) {
            int ordinal2 = ((G0) entry2.getValue()).ordinal();
            if (ordinal2 == 2) {
                str3 = str2;
            } else if (ordinal2 != 3) {
                str3 = null;
            } else {
                str3 = "granted";
            }
            if (str3 != null) {
                bundle3.putString(((I0) entry2.getKey()).f2965a, str3);
            }
        }
        Boolean bool = j02.f3427c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = j02.d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        C0191n nVar = this.f3062c;
        L(nVar);
        X1 u02 = nVar.u0(str, "_npa");
        if (u02 != null) {
            i2 = u02.f3154e.equals(1L);
        } else {
            i2 = y(str, new t());
        }
        if (1 != i2) {
            str2 = "granted";
        }
        bundle.putString("ad_personalization", str2);
        return bundle;
    }

    public final Y1 e() {
        C0212u0 u0Var = this.f3070u;
        I.g(u0Var);
        Y1 y12 = u0Var.f3499u;
        C0212u0.i(y12);
        return y12;
    }

    public final Bundle e0(C0214v vVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", vVar.f3509b.f3472a.getLong("_sid"));
        C0191n nVar = this.f3062c;
        L(nVar);
        X1 u02 = nVar.u0(str, "_sno");
        if (u02 != null) {
            Object obj = u02.f3154e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final C0203r0 f() {
        C0212u0 u0Var = this.f3070u;
        I.g(u0Var);
        C0203r0 r0Var = u0Var.f3497s;
        C0212u0.k(r0Var);
        return r0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a6, code lost:
        if (r11 != false) goto L_0x02aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x028a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T1.V f0(T1.Z1 r14) {
        /*
            r13 = this;
            T1.r0 r0 = r13.f()
            r0.o()
            r13.k()
            com.google.android.gms.common.internal.I.g(r14)
            java.lang.String r2 = r14.f3201a
            com.google.android.gms.common.internal.I.d(r2)
            java.lang.String r0 = r14.f3190E
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0024
            java.util.HashMap r1 = r13.f3053M
            T1.R1 r3 = new T1.R1
            r3.<init>(r13, r0)
            r1.put(r2, r3)
        L_0x0024:
            T1.n r0 = r13.f3062c
            L(r0)
            T1.V r0 = r0.l0(r2)
            T1.J0 r1 = r13.n0(r2)
            java.lang.String r3 = r14.f3189D
            r4 = 100
            T1.J0 r3 = T1.J0.e(r4, r3)
            T1.J0 r1 = r1.f(r3)
            T1.I0 r3 = T1.I0.AD_STORAGE
            boolean r4 = r1.k(r3)
            java.lang.String r5 = ""
            boolean r8 = r14.f3213w
            if (r4 == 0) goto L_0x0050
            T1.y1 r4 = r13.f3067r
            java.lang.String r4 = r4.t(r2, r8)
            goto L_0x0051
        L_0x0050:
            r4 = r5
        L_0x0051:
            T1.I0 r6 = T1.I0.ANALYTICS_STORAGE
            r9 = 0
            r10 = 1
            if (r0 != 0) goto L_0x0077
            T1.V r0 = new T1.V
            T1.u0 r5 = r13.f3070u
            r0.<init>(r5, r2)
            boolean r2 = r1.k(r6)
            if (r2 == 0) goto L_0x006b
            java.lang.String r2 = r13.h(r1)
            r0.l(r2)
        L_0x006b:
            boolean r1 = r1.k(r3)
            if (r1 == 0) goto L_0x0074
            r0.P(r4)
        L_0x0074:
            r11 = r9
            goto L_0x0149
        L_0x0077:
            boolean r7 = r1.k(r3)
            if (r7 == 0) goto L_0x0130
            if (r4 == 0) goto L_0x0130
            T1.u0 r7 = r0.f3103a
            T1.r0 r11 = r7.f3497s
            T1.C0212u0.k(r11)
            r11.o()
            java.lang.String r11 = r0.f3106e
            boolean r11 = r4.equals(r11)
            if (r11 != 0) goto L_0x0130
            T1.r0 r7 = r7.f3497s
            T1.C0212u0.k(r7)
            r7.o()
            java.lang.String r7 = r0.f3106e
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r0.P(r4)
            if (r8 == 0) goto L_0x0117
            T1.y1 r4 = r13.f3067r
            r4.getClass()
            boolean r3 = r1.k(r3)
            if (r3 == 0) goto L_0x00b4
            android.util.Pair r3 = r4.s(r2)
            goto L_0x00bb
        L_0x00b4:
            android.util.Pair r3 = new android.util.Pair
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.<init>(r5, r4)
        L_0x00bb:
            java.lang.Object r3 = r3.first
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0117
            if (r7 != 0) goto L_0x0117
            boolean r3 = r1.k(r6)
            if (r3 == 0) goto L_0x00d6
            java.lang.String r1 = r13.h(r1)
            r0.l(r1)
            r11 = r9
            goto L_0x00d7
        L_0x00d6:
            r11 = r10
        L_0x00d7:
            T1.n r1 = r13.f3062c
            L(r1)
            java.lang.String r3 = "_id"
            T1.X1 r1 = r1.u0(r2, r3)
            if (r1 == 0) goto L_0x0149
            T1.n r1 = r13.f3062c
            L(r1)
            java.lang.String r3 = "_lair"
            T1.X1 r1 = r1.u0(r2, r3)
            if (r1 != 0) goto L_0x0149
            G1.a r1 = r13.g()
            G1.b r1 = (G1.b) r1
            r1.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            T1.X1 r12 = new T1.X1
            r3 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "auto"
            java.lang.String r4 = "_lair"
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r7)
            T1.n r1 = r13.f3062c
            L(r1)
            r1.c0(r12)
            goto L_0x0149
        L_0x0117:
            java.lang.String r2 = r0.d()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0074
            boolean r2 = r1.k(r6)
            if (r2 == 0) goto L_0x0074
            java.lang.String r1 = r13.h(r1)
            r0.l(r1)
            goto L_0x0074
        L_0x0130:
            java.lang.String r2 = r0.d()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0074
            boolean r2 = r1.k(r6)
            if (r2 == 0) goto L_0x0074
            java.lang.String r1 = r13.h(r1)
            r0.l(r1)
            goto L_0x0074
        L_0x0149:
            java.lang.String r1 = r14.f3202b
            r0.H(r1)
            java.lang.String r1 = r14.f3215y
            r0.k(r1)
            java.lang.String r1 = r14.f3210t
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x015e
            r0.G(r1)
        L_0x015e:
            long r1 = r14.f3204e
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0169
            r0.I(r1)
        L_0x0169:
            java.lang.String r1 = r14.f3203c
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0174
            r0.n(r1)
        L_0x0174:
            long r1 = r14.f3209s
            r0.o(r1)
            java.lang.String r1 = r14.d
            if (r1 == 0) goto L_0x0180
            r0.m(r1)
        L_0x0180:
            long r1 = r14.f3205f
            r0.C(r1)
            boolean r1 = r14.f3207q
            r0.O(r1)
            java.lang.String r1 = r14.f3206p
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0195
            r0.J(r1)
        L_0x0195:
            T1.u0 r1 = r0.f3103a
            T1.r0 r2 = r1.f3497s
            T1.C0212u0.k(r2)
            r2.o()
            boolean r2 = r0.f3100R
            boolean r3 = r0.f3115p
            if (r3 == r8) goto L_0x01a7
            r3 = r10
            goto L_0x01a8
        L_0x01a7:
            r3 = r9
        L_0x01a8:
            r2 = r2 | r3
            r0.f3100R = r2
            r0.f3115p = r8
            T1.r0 r2 = r1.f3497s
            T1.C0212u0.k(r2)
            r2.o()
            boolean r2 = r0.f3100R
            java.lang.Boolean r3 = r0.f3117r
            java.lang.Boolean r4 = r14.f3216z
            boolean r3 = java.util.Objects.equals(r3, r4)
            r3 = r3 ^ r10
            r2 = r2 | r3
            r0.f3100R = r2
            r0.f3117r = r4
            long r2 = r14.f3186A
            r0.E(r2)
            T1.r0 r2 = r1.f3497s
            T1.C0212u0.k(r2)
            r2.o()
            boolean r2 = r0.f3100R
            java.lang.String r3 = r0.f3120u
            java.lang.String r4 = r14.F
            boolean r3 = java.util.Objects.equals(r3, r4)
            r3 = r3 ^ r10
            r2 = r2 | r3
            r0.f3100R = r2
            r0.f3120u = r4
            com.google.android.gms.internal.measurement.zzpn.zzb()
            T1.g r2 = r13.h0()
            T1.G r3 = T1.H.f2864K0
            r4 = 0
            boolean r2 = r2.B(r4, r3)
            if (r2 == 0) goto L_0x01f8
            java.util.List r2 = r14.f3187B
            r0.Q(r2)
            goto L_0x020a
        L_0x01f8:
            com.google.android.gms.internal.measurement.zzpn.zzb()
            T1.g r2 = r13.h0()
            T1.G r3 = T1.H.f2862J0
            boolean r2 = r2.B(r4, r3)
            if (r2 == 0) goto L_0x020a
            r0.Q(r4)
        L_0x020a:
            T1.r0 r2 = r1.f3497s
            T1.C0212u0.k(r2)
            r2.o()
            boolean r2 = r0.f3100R
            boolean r3 = r0.f3121v
            boolean r5 = r14.f3191G
            if (r3 == r5) goto L_0x021c
            r3 = r10
            goto L_0x021d
        L_0x021c:
            r3 = r9
        L_0x021d:
            r2 = r2 | r3
            r0.f3100R = r2
            r0.f3121v = r5
            T1.r0 r2 = r1.f3497s
            T1.C0212u0.k(r2)
            r2.o()
            boolean r2 = r0.f3100R
            java.lang.String r3 = r0.f3087D
            java.lang.String r5 = r14.f3197M
            if (r3 == r5) goto L_0x0234
            r3 = r10
            goto L_0x0235
        L_0x0234:
            r3 = r9
        L_0x0235:
            r2 = r2 | r3
            r0.f3100R = r2
            r0.f3087D = r5
            com.google.android.gms.internal.measurement.zzqr.zzb()
            T1.g r2 = r13.h0()
            T1.G r3 = T1.H.f2884V0
            boolean r2 = r2.B(r4, r3)
            if (r2 == 0) goto L_0x0261
            T1.r0 r2 = r1.f3497s
            T1.C0212u0.k(r2)
            r2.o()
            boolean r2 = r0.f3100R
            int r3 = r0.f3124y
            int r5 = r14.f3195K
            if (r3 == r5) goto L_0x025b
            r3 = r10
            goto L_0x025c
        L_0x025b:
            r3 = r9
        L_0x025c:
            r2 = r2 | r3
            r0.f3100R = r2
            r0.f3124y = r5
        L_0x0261:
            long r2 = r14.f3192H
            r0.r(r2)
            T1.r0 r2 = r1.f3497s
            T1.C0212u0.k(r2)
            r2.o()
            boolean r2 = r0.f3100R
            java.lang.String r3 = r0.f3090H
            java.lang.String r5 = r14.f3198N
            if (r3 == r5) goto L_0x0278
            r3 = r10
            goto L_0x0279
        L_0x0278:
            r3 = r9
        L_0x0279:
            r2 = r2 | r3
            r0.f3100R = r2
            r0.f3090H = r5
            T1.g r2 = r13.h0()
            T1.G r3 = T1.H.f2872P0
            boolean r2 = r2.B(r4, r3)
            if (r2 == 0) goto L_0x02a0
            T1.r0 r1 = r1.f3497s
            T1.C0212u0.k(r1)
            r1.o()
            boolean r1 = r0.f3100R
            int r2 = r0.f3092J
            int r14 = r14.f3200P
            if (r2 == r14) goto L_0x029b
            r9 = r10
        L_0x029b:
            r1 = r1 | r9
            r0.f3100R = r1
            r0.f3092J = r14
        L_0x02a0:
            boolean r14 = r0.s()
            if (r14 != 0) goto L_0x02a9
            if (r11 == 0) goto L_0x02b2
            goto L_0x02aa
        L_0x02a9:
            r10 = r11
        L_0x02aa:
            T1.n r14 = r13.f3062c
            L(r14)
            r14.K(r0, r10)
        L_0x02b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.T1.f0(T1.Z1):T1.V");
    }

    public final a g() {
        C0212u0 u0Var = this.f3070u;
        I.g(u0Var);
        return u0Var.f3501w;
    }

    public final C0158c g0() {
        C0158c cVar = this.f3064f;
        L(cVar);
        return cVar;
    }

    public final String h(J0 j02) {
        if (!j02.k(I0.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        e().A().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final C0170g h0() {
        C0212u0 u0Var = this.f3070u;
        I.g(u0Var);
        return u0Var.f3494p;
    }

    public final List i(Z1 z12, Bundle bundle) {
        List list;
        f().o();
        zzqr.zzb();
        C0170g h02 = h0();
        String str = z12.f3201a;
        if (!h02.B(str, H.f2884V0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    c().f3172f.a("Uri sources and timestamps do not match");
                } else {
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        C0191n nVar = this.f3062c;
                        L(nVar);
                        C0212u0 u0Var = (C0212u0) nVar.f398a;
                        int i5 = intArray[i2];
                        long j6 = longArray[i2];
                        I.d(str);
                        nVar.o();
                        nVar.p();
                        try {
                            int delete = nVar.k0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i5), String.valueOf(j6)});
                            Z z3 = u0Var.f3496r;
                            C0212u0.k(z3);
                            z3.f3180w.d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i5), Long.valueOf(j6));
                        } catch (SQLiteException e6) {
                            Z z4 = u0Var.f3496r;
                            C0212u0.k(z4);
                            z4.f3172f.c("Error pruning trigger URIs. appId", Z.w(str), e6);
                        }
                    }
                }
            }
        }
        C0191n nVar2 = this.f3062c;
        L(nVar2);
        String str2 = z12.f3201a;
        I.d(str2);
        nVar2.o();
        nVar2.p();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = nVar2.k0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, (String) null, (String) null, "rowid", (String) null);
            list = arrayList;
            if (cursor.moveToFirst()) {
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new I1(string, cursor.getLong(1), cursor.getInt(2)));
                } while (cursor.moveToNext());
                list = arrayList;
            }
        } catch (SQLiteException e7) {
            Z z5 = ((C0212u0) nVar2.f398a).f3496r;
            C0212u0.k(z5);
            z5.f3172f.c("Error querying trigger uris. appId", Z.w(str2), e7);
            list = Collections.emptyList();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return list;
    }

    public final C0191n i0() {
        C0191n nVar = this.f3062c;
        L(nVar);
        return nVar;
    }

    public final void j() {
        f().o();
        k();
        if (!this.f3072w) {
            this.f3072w = true;
            f().o();
            FileLock fileLock = this.F;
            C0212u0 u0Var = this.f3070u;
            if (fileLock == null || !fileLock.isValid()) {
                ((C0212u0) this.f3062c.f398a).getClass();
                File filesDir = u0Var.f3489a.getFilesDir();
                zzbx.zza();
                int i2 = zzcc.zzb;
                try {
                    FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
                    this.f3047G = channel;
                    FileLock tryLock = channel.tryLock();
                    this.F = tryLock;
                    if (tryLock != null) {
                        c().f3180w.a("Storage concurrent access okay");
                    } else {
                        c().f3172f.a("Storage concurrent data access panic");
                        return;
                    }
                } catch (FileNotFoundException e6) {
                    c().f3172f.b(e6, "Failed to acquire storage lock");
                    return;
                } catch (IOException e7) {
                    c().f3172f.b(e7, "Failed to access storage lock file");
                    return;
                } catch (OverlappingFileLockException e8) {
                    c().f3175r.b(e8, "Storage lock already acquired");
                    return;
                }
            } else {
                c().f3180w.a("Storage concurrent access okay");
            }
            FileChannel fileChannel = this.f3047G;
            f().o();
            int i5 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                c().f3172f.a("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i5 = allocate.getInt();
                    } else if (read != -1) {
                        c().f3175r.b(Integer.valueOf(read), "Unexpected data length. Bytes read");
                    }
                } catch (IOException e9) {
                    c().f3172f.b(e9, "Failed to read from channel");
                }
            }
            O n2 = u0Var.n();
            n2.p();
            int i6 = n2.f3000e;
            f().o();
            if (i5 > i6) {
                Z c3 = c();
                c3.f3172f.c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i5), Integer.valueOf(i6));
            } else if (i5 < i6) {
                FileChannel fileChannel2 = this.f3047G;
                f().o();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    c().f3172f.a("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(i6);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            c().f3172f.b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                        }
                        Z c6 = c();
                        c6.f3180w.c("Storage version upgraded. Previous, current version", Integer.valueOf(i5), Integer.valueOf(i6));
                        return;
                    } catch (IOException e10) {
                        c().f3172f.b(e10, "Failed to write to channel");
                    }
                }
                Z c7 = c();
                c7.f3172f.c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i5), Integer.valueOf(i6));
            }
        }
    }

    public final C0197p j0(String str, C0197p pVar, J0 j02, t tVar) {
        I0 i02;
        boolean z3;
        G0 B6;
        C0192n0 n0Var = this.f3060a;
        L(n0Var);
        zzgi C6 = n0Var.C(str);
        G0 g02 = G0.DENIED;
        I0 i03 = I0.AD_USER_DATA;
        int i2 = 90;
        if (C6 == null) {
            if (pVar.c() == g02) {
                i2 = pVar.f3425a;
                tVar.z(i03, i2);
            } else {
                tVar.A(i03, C0173h.FAILSAFE);
            }
            return new C0197p(Boolean.FALSE, i2, Boolean.TRUE, "-");
        }
        G0 c3 = pVar.c();
        G0 g03 = G0.GRANTED;
        boolean z4 = false;
        if (c3 == g03 || c3 == g02) {
            i2 = pVar.f3425a;
            tVar.z(i03, i2);
        } else {
            G0 g04 = G0.POLICY;
            G0 g05 = G0.UNINITIALIZED;
            if (c3 != g04 || (B6 = n0Var.B(str, i03)) == g05) {
                n0Var.o();
                n0Var.w(str);
                zzgi C7 = n0Var.C(str);
                if (C7 != null) {
                    Iterator it2 = C7.zze().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        zzgb zzgb = (zzgb) it2.next();
                        if (i03 == C0192n0.z(zzgb.zzc())) {
                            i02 = C0192n0.z(zzgb.zzb());
                            break;
                        }
                    }
                }
                i02 = null;
                I0 i04 = I0.AD_STORAGE;
                G0 g06 = (G0) j02.f2970a.get(i04);
                if (g06 != null) {
                    g05 = g06;
                }
                if (g05 == g03 || g05 == g02) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i02 != i04 || !z3) {
                    tVar.A(i03, C0173h.REMOTE_DEFAULT);
                    if (true != n0Var.F(str, i03)) {
                        c3 = g02;
                    } else {
                        c3 = g03;
                    }
                } else {
                    tVar.A(i03, C0173h.REMOTE_DELEGATION);
                    c3 = g05;
                }
            } else {
                tVar.A(i03, C0173h.REMOTE_ENFORCED_DEFAULT);
                c3 = B6;
            }
        }
        n0Var.o();
        n0Var.w(str);
        zzgi C8 = n0Var.C(str);
        if (C8 == null || !C8.zzh() || C8.zzg()) {
            z4 = true;
        }
        L(n0Var);
        n0Var.o();
        n0Var.w(str);
        TreeSet treeSet = new TreeSet();
        zzgi C9 = n0Var.C(str);
        if (C9 != null) {
            for (zzgh zzb : C9.zzc()) {
                treeSet.add(zzb.zzb());
            }
        }
        if (c3 == g02 || treeSet.isEmpty()) {
            return new C0197p(Boolean.FALSE, i2, Boolean.valueOf(z4), "-");
        }
        Boolean bool = Boolean.TRUE;
        Boolean valueOf = Boolean.valueOf(z4);
        String str2 = "";
        if (z4) {
            str2 = TextUtils.join(str2, treeSet);
        }
        return new C0197p(bool, i2, valueOf, str2);
    }

    public final void k() {
        if (!this.f3071v.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final C0197p k0(String str) {
        f().o();
        k();
        HashMap hashMap = this.f3052L;
        C0197p pVar = (C0197p) hashMap.get(str);
        if (pVar != null) {
            return pVar;
        }
        C0191n nVar = this.f3062c;
        L(nVar);
        I.g(str);
        nVar.o();
        nVar.p();
        C0197p b6 = C0197p.b(nVar.T("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        hashMap.put(str, b6);
        return b6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f1, code lost:
        if (r4 < android.os.SystemClock.elapsedRealtime()) goto L_0x00f3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(com.google.android.gms.internal.measurement.zzhw r9, java.lang.String r10) {
        /*
            r8 = this;
            T1.n0 r0 = r8.f3060a
            L(r0)
            r0.o()
            r0.w(r10)
            n.e r1 = r0.f3401e
            java.lang.Object r2 = r1.get(r10)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x0018
            r9.zzl(r2)
        L_0x0018:
            L(r0)
            r0.o()
            r0.w(r10)
            java.lang.Object r2 = r1.get(r10)
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r1.get(r10)
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r3 = "device_model"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0044
            java.lang.Object r2 = r1.get(r10)
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r3 = "device_info"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0044
            goto L_0x0047
        L_0x0044:
            r9.zzs()
        L_0x0047:
            L(r0)
            boolean r2 = r0.t(r10)
            r3 = -1
            if (r2 == 0) goto L_0x006b
            java.lang.String r2 = r9.zzaK()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x006b
            java.lang.String r4 = "."
            int r4 = r2.indexOf(r4)
            if (r4 == r3) goto L_0x006b
            r5 = 0
            java.lang.String r2 = r2.substring(r5, r4)
            r9.zzam(r2)
        L_0x006b:
            L(r0)
            r0.o()
            r0.w(r10)
            java.lang.Object r2 = r1.get(r10)
            if (r2 == 0) goto L_0x0093
            java.lang.Object r2 = r1.get(r10)
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r4 = "user_id"
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x0093
            java.lang.String r2 = "_id"
            int r2 = T1.C0162d0.I(r9, r2)
            if (r2 == r3) goto L_0x0093
            r9.zzE(r2)
        L_0x0093:
            L(r0)
            r0.o()
            r0.w(r10)
            java.lang.Object r2 = r1.get(r10)
            if (r2 == 0) goto L_0x00b3
            java.lang.Object r2 = r1.get(r10)
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r3 = "google_signals"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x00b3
            r9.zzt()
        L_0x00b3:
            L(r0)
            boolean r2 = r0.s(r10)
            if (r2 == 0) goto L_0x0108
            r9.zzq()
            T1.J0 r2 = r8.n0(r10)
            T1.I0 r3 = T1.I0.ANALYTICS_STORAGE
            boolean r2 = r2.k(r3)
            if (r2 == 0) goto L_0x0108
            java.util.HashMap r2 = r8.f3053M
            java.lang.Object r3 = r2.get(r10)
            T1.R1 r3 = (T1.R1) r3
            if (r3 == 0) goto L_0x00f3
            T1.g r4 = r8.h0()
            T1.G r5 = T1.H.f2916j0
            long r4 = r4.w(r10, r5)
            long r6 = r3.f3029b
            long r4 = r4 + r6
            G1.a r6 = r8.g()
            G1.b r6 = (G1.b) r6
            r6.getClass()
            long r6 = android.os.SystemClock.elapsedRealtime()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0103
        L_0x00f3:
            T1.R1 r3 = new T1.R1
            T1.Y1 r4 = r8.e()
            java.lang.String r4 = r4.x()
            r3.<init>(r8, r4)
            r2.put(r10, r3)
        L_0x0103:
            java.lang.String r2 = r3.f3028a
            r9.zzac(r2)
        L_0x0108:
            L(r0)
            r0.o()
            r0.w(r10)
            java.lang.Object r0 = r1.get(r10)
            if (r0 == 0) goto L_0x0128
            java.lang.Object r10 = r1.get(r10)
            java.util.Set r10 = (java.util.Set) r10
            java.lang.String r0 = "enhanced_user_id"
            boolean r10 = r10.contains(r0)
            if (r10 == 0) goto L_0x0128
            r9.zzA()
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.T1.l(com.google.android.gms.internal.measurement.zzhw, java.lang.String):void");
    }

    public final C0165e0 l0() {
        C0165e0 e0Var = this.d;
        if (e0Var != null) {
            return e0Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: n.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.util.Map} */
    /* JADX WARNING: type inference failed for: r2v10, types: [n.j] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(T1.V r13) {
        /*
            r12 = this;
            T1.r0 r0 = r12.f()
            r0.o()
            java.lang.String r0 = r13.g()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = r13.a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001c
            goto L_0x002d
        L_0x001c:
            java.lang.String r2 = r13.c()
            com.google.android.gms.common.internal.I.g(r2)
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r12
            r1.t(r2, r3, r4, r5, r6)
            return
        L_0x002d:
            java.lang.String r0 = r13.c()
            com.google.android.gms.common.internal.I.g(r0)
            T1.Z r1 = r12.c()
            java.lang.String r2 = "Fetching remote configuration"
            T1.X r1 = r1.f3180w
            r1.b(r0, r2)
            T1.n0 r1 = r12.f3060a
            L(r1)
            com.google.android.gms.internal.measurement.zzgo r2 = r1.D(r0)
            L(r1)
            r1.o()
            n.e r3 = r1.f3409v
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            if (r2 == 0) goto L_0x008e
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r2 != 0) goto L_0x006b
            n.e r2 = new n.e
            r2.<init>(r5)
            java.lang.String r6 = "If-Modified-Since"
            r2.put(r6, r3)
            goto L_0x006c
        L_0x006b:
            r2 = r4
        L_0x006c:
            L(r1)
            r1.o()
            n.e r1 = r1.f3410w
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x008c
            if (r2 != 0) goto L_0x0087
            n.e r2 = new n.e
            r2.<init>(r5)
        L_0x0087:
            java.lang.String r1 = "If-None-Match"
            r2.put(r1, r0)
        L_0x008c:
            r10 = r2
            goto L_0x008f
        L_0x008e:
            r10 = r4
        L_0x008f:
            r0 = 1
            r12.f3044C = r0
            T1.d0 r6 = r12.f3061b
            L(r6)
            S3.t r11 = new S3.t
            r0 = 4
            r11.<init>(r12, r0)
            java.lang.Object r0 = r6.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            r6.o()
            r6.p()
            T1.T1 r1 = r6.f2982b
            T1.Q1 r1 = r1.f3068s
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = r13.g()
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L_0x00be
            java.lang.String r3 = r13.a()
        L_0x00be:
            T1.G r5 = T1.H.f2906f
            java.lang.Object r5 = r5.a(r4)
            java.lang.String r5 = (java.lang.String) r5
            android.net.Uri$Builder r5 = r2.scheme(r5)
            T1.G r7 = T1.H.g
            java.lang.Object r4 = r7.a(r4)
            java.lang.String r4 = (java.lang.String) r4
            android.net.Uri$Builder r4 = r5.encodedAuthority(r4)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "config/app/"
            java.lang.String r3 = r5.concat(r3)
            android.net.Uri$Builder r3 = r4.path(r3)
            java.lang.String r4 = "platform"
            java.lang.String r5 = "android"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r4, r5)
            java.lang.Object r1 = r1.f398a
            T1.u0 r1 = (T1.C0212u0) r1
            T1.g r1 = r1.f3494p
            r1.v()
            r4 = 119002(0x1d0da, double:5.8795E-319)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "gmp_version"
            android.net.Uri$Builder r1 = r3.appendQueryParameter(r4, r1)
            java.lang.String r3 = "runtime_version"
            java.lang.String r4 = "0"
            r1.appendQueryParameter(r3, r4)
            android.net.Uri r1 = r2.build()
            java.lang.String r1 = r1.toString()
            java.net.URI r2 = new java.net.URI     // Catch:{ IllegalArgumentException | MalformedURLException | URISyntaxException -> 0x012e }
            r2.<init>(r1)     // Catch:{ IllegalArgumentException | MalformedURLException | URISyntaxException -> 0x012e }
            java.net.URL r8 = r2.toURL()     // Catch:{ IllegalArgumentException | MalformedURLException | URISyntaxException -> 0x012e }
            T1.r0 r2 = r0.f3497s     // Catch:{ IllegalArgumentException | MalformedURLException | URISyntaxException -> 0x012e }
            T1.C0212u0.k(r2)     // Catch:{ IllegalArgumentException | MalformedURLException | URISyntaxException -> 0x012e }
            T1.c0 r3 = new T1.c0     // Catch:{ IllegalArgumentException | MalformedURLException | URISyntaxException -> 0x012e }
            java.lang.String r7 = r13.c()     // Catch:{ IllegalArgumentException | MalformedURLException | URISyntaxException -> 0x012e }
            r9 = 0
            r5 = r3
            r5.<init>((T1.C0162d0) r6, (java.lang.String) r7, (java.net.URL) r8, (byte[]) r9, (java.util.Map) r10, (T1.C0156b0) r11)     // Catch:{ IllegalArgumentException | MalformedURLException | URISyntaxException -> 0x012e }
            r2.x(r3)     // Catch:{ IllegalArgumentException | MalformedURLException | URISyntaxException -> 0x012e }
            goto L_0x0142
        L_0x012e:
            T1.Z r0 = r0.f3496r
            T1.C0212u0.k(r0)
            java.lang.String r13 = r13.c()
            T1.Y r13 = T1.Z.w(r13)
            java.lang.String r2 = "Failed to parse config URL. Not fetching. appId"
            T1.X r0 = r0.f3172f
            r0.c(r2, r13, r1)
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.T1.m(T1.V):void");
    }

    public final C0192n0 m0() {
        C0192n0 n0Var = this.f3060a;
        L(n0Var);
        return n0Var;
    }

    public final void n(Z1 z12, long j6) {
        boolean z3;
        Z1 z13 = z12;
        C0191n nVar = this.f3062c;
        L(nVar);
        String str = z13.f3201a;
        I.g(str);
        V l02 = nVar.l0(str);
        if (l02 != null) {
            if (e().m0(z13.f3202b, l02.g(), z13.f3215y, l02.a())) {
                c().f3175r.b(Z.w(l02.c()), "New GMP App Id passed in. Removing cached database data. appId");
                C0191n nVar2 = this.f3062c;
                L(nVar2);
                C0212u0 u0Var = (C0212u0) nVar2.f398a;
                String c3 = l02.c();
                nVar2.p();
                nVar2.o();
                I.d(c3);
                try {
                    SQLiteDatabase k02 = nVar2.k0();
                    String[] strArr = {c3};
                    int delete = k02.delete("events", "app_id=?", strArr) + k02.delete("user_attributes", "app_id=?", strArr) + k02.delete("conditional_properties", "app_id=?", strArr) + k02.delete("apps", "app_id=?", strArr) + k02.delete("raw_events", "app_id=?", strArr) + k02.delete("raw_events_metadata", "app_id=?", strArr) + k02.delete("event_filters", "app_id=?", strArr) + k02.delete("property_filters", "app_id=?", strArr) + k02.delete("audience_filter_values", "app_id=?", strArr) + k02.delete("consent_settings", "app_id=?", strArr) + k02.delete("default_event_params", "app_id=?", strArr) + k02.delete("trigger_uris", "app_id=?", strArr);
                    if (delete > 0) {
                        Z z4 = u0Var.f3496r;
                        C0212u0.k(z4);
                        z4.f3180w.c("Deleted application data. app, records", c3, Integer.valueOf(delete));
                    }
                } catch (SQLiteException e6) {
                    Z z5 = u0Var.f3496r;
                    C0212u0.k(z5);
                    z5.f3172f.c("Error deleting application data. appId, error", Z.w(c3), e6);
                }
                l02 = null;
            }
        }
        if (l02 != null) {
            boolean z6 = true;
            if (l02.S() == -2147483648L || l02.S() == z13.f3209s) {
                z3 = false;
            } else {
                z3 = true;
            }
            String e7 = l02.e();
            if (l02.S() != -2147483648L || e7 == null || e7.equals(z13.f3203c)) {
                z6 = false;
            }
            if (z3 || z6) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", e7);
                C0214v vVar = new C0214v("_au", new C0211u(bundle), "auto", j6);
                if (h0().B((String) null, H.f2926m1)) {
                    s(vVar, z13);
                } else {
                    q(vVar, z13);
                }
            }
        }
    }

    public final J0 n0(String str) {
        J0 j02 = J0.f2969c;
        f().o();
        k();
        HashMap hashMap = this.f3051K;
        J0 j03 = (J0) hashMap.get(str);
        if (j03 == null) {
            C0191n nVar = this.f3062c;
            L(nVar);
            j03 = nVar.s0(str);
            if (j03 == null) {
                j03 = J0.f2969c;
            }
            f().o();
            k();
            hashMap.put(str, j03);
            C0191n nVar2 = this.f3062c;
            L(nVar2);
            nVar2.M(str, j03);
        }
        return j03;
    }

    public final void o(V v6, zzhw zzhw) {
        t tVar;
        zzio zzio;
        boolean z3;
        int i2;
        C0173h hVar;
        zzhw zzhw2 = zzhw;
        f().o();
        k();
        String zzaH = zzhw.zzaH();
        EnumMap enumMap = new EnumMap(I0.class);
        int length = zzaH.length();
        int length2 = I0.values().length;
        C0173h hVar2 = C0173h.UNSET;
        int i5 = 0;
        if (length < length2 || zzaH.charAt(0) != '1') {
            tVar = new t();
        } else {
            I0[] values = I0.values();
            int length3 = values.length;
            int i6 = 0;
            int i7 = 1;
            while (i6 < length3) {
                I0 i02 = values[i6];
                int i8 = i7 + 1;
                char charAt = zzaH.charAt(i7);
                C0173h[] values2 = C0173h.values();
                int length4 = values2.length;
                int i9 = i5;
                while (true) {
                    if (i9 >= length4) {
                        hVar = hVar2;
                        break;
                    }
                    hVar = values2[i9];
                    if (hVar.f3309a == charAt) {
                        break;
                    }
                    i9++;
                }
                enumMap.put(i02, hVar);
                i6++;
                i7 = i8;
                i5 = 0;
            }
            tVar = new t(enumMap);
        }
        String c3 = v6.c();
        f().o();
        k();
        J0 n02 = n0(c3);
        I0 i03 = I0.AD_STORAGE;
        EnumMap enumMap2 = n02.f2970a;
        G0 g02 = (G0) enumMap2.get(i03);
        G0 g03 = G0.UNINITIALIZED;
        if (g02 == null) {
            g02 = g03;
        }
        int ordinal = g02.ordinal();
        C0173h hVar3 = C0173h.REMOTE_ENFORCED_DEFAULT;
        C0173h hVar4 = C0173h.FAILSAFE;
        int i10 = n02.f2971b;
        if (ordinal == 1) {
            tVar.A(i03, hVar3);
        } else if (ordinal == 2 || ordinal == 3) {
            tVar.z(i03, i10);
        } else {
            tVar.A(i03, hVar4);
        }
        I0 i04 = I0.ANALYTICS_STORAGE;
        G0 g04 = (G0) enumMap2.get(i04);
        if (g04 != null) {
            g03 = g04;
        }
        int ordinal2 = g03.ordinal();
        if (ordinal2 == 1) {
            tVar.A(i04, hVar3);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            tVar.z(i04, i10);
        } else {
            tVar.A(i04, hVar4);
        }
        String c6 = v6.c();
        f().o();
        k();
        C0197p j02 = j0(c6, k0(c6), n0(c6), tVar);
        Boolean bool = j02.f3427c;
        I.g(bool);
        zzhw2.zzak(bool.booleanValue());
        String str = j02.d;
        if (!TextUtils.isEmpty(str)) {
            zzhw2.zzU(str);
        }
        f().o();
        k();
        Iterator it2 = zzhw.zzaN().iterator();
        while (true) {
            if (!it2.hasNext()) {
                zzio = null;
                break;
            }
            zzio = (zzio) it2.next();
            if ("_npa".equals(zzio.zzg())) {
                break;
            }
        }
        if (zzio != null) {
            I0 i05 = I0.AD_PERSONALIZATION;
            C0173h hVar5 = (C0173h) ((EnumMap) tVar.f2700b).get(i05);
            if (hVar5 == null) {
                hVar5 = hVar2;
            }
            if (hVar5 == hVar2) {
                C0191n nVar = this.f3062c;
                L(nVar);
                X1 u02 = nVar.u0(v6.c(), "_npa");
                C0173h hVar6 = C0173h.MANIFEST;
                C0173h hVar7 = C0173h.API;
                if (u02 != null) {
                    String str2 = u02.f3152b;
                    if ("tcf".equals(str2)) {
                        tVar.A(i05, C0173h.TCF);
                    } else if ("app".equals(str2)) {
                        tVar.A(i05, hVar7);
                    } else {
                        tVar.A(i05, hVar6);
                    }
                } else {
                    Boolean U5 = v6.U();
                    if (U5 == null || ((U5.booleanValue() && zzio.zzc() != 1) || (!U5.booleanValue() && zzio.zzc() != 0))) {
                        tVar.A(i05, hVar7);
                    } else {
                        tVar.A(i05, hVar6);
                    }
                }
            }
        } else {
            int y6 = y(v6.c(), tVar);
            zzin zze = zzio.zze();
            zze.zzf("_npa");
            ((b) g()).getClass();
            zze.zzg(System.currentTimeMillis());
            zze.zze((long) y6);
            zzhw2.zzp((zzio) zze.zzba());
            c().f3180w.c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(y6));
        }
        zzhw2.zzS(tVar.toString());
        String c7 = v6.c();
        C0192n0 n0Var = this.f3060a;
        n0Var.o();
        n0Var.w(c7);
        zzgi C6 = n0Var.C(c7);
        if (C6 != null && C6.zzh() && !C6.zzg()) {
            z3 = false;
        } else {
            z3 = true;
        }
        List zzaM = zzhw.zzaM();
        for (int i11 = 0; i11 < zzaM.size(); i11++) {
            if ("_tcf".equals(((zzhm) zzaM.get(i11)).zzh())) {
                zzhl zzhl = (zzhl) ((zzhm) zzaM.get(i11)).zzch();
                List zzp = zzhl.zzp();
                int i12 = 0;
                while (true) {
                    if (i12 >= zzp.size()) {
                        break;
                    } else if ("_tcfd".equals(((zzhq) zzp.get(i12)).zzg())) {
                        String zzh = ((zzhq) zzp.get(i12)).zzh();
                        if (z3 && zzh.length() > 4) {
                            char[] charArray = zzh.toCharArray();
                            int i13 = 1;
                            while (true) {
                                if (i13 >= 64) {
                                    i2 = 1;
                                    i13 = 0;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13)) {
                                    i2 = 1;
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i2 | i13);
                            zzh = String.valueOf(charArray);
                        }
                        zzhp zze2 = zzhq.zze();
                        zze2.zzj("_tcfd");
                        zze2.zzk(zzh);
                        zzhl.zzj(i12, zze2);
                    } else {
                        i12++;
                    }
                }
                zzhw2.zzad(i11, zzhl);
                return;
            }
        }
    }

    public final void p(zzhw zzhw, d dVar) {
        String str;
        String str2;
        zzhw zzhw2 = zzhw;
        d dVar2 = dVar;
        for (int i2 = 0; i2 < zzhw.zzc(); i2++) {
            zzhl zzhl = (zzhl) zzhw2.zzh(i2).zzch();
            Iterator it2 = zzhl.zzp().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if ("_c".equals(((zzhq) it2.next()).zzg())) {
                    if (((zzhx) dVar2.f490b).zza() >= h0().u(((zzhx) dVar2.f490b).zzF(), H.f2919k0)) {
                        int u6 = h0().u(((zzhx) dVar2.f490b).zzF(), H.f2952x0);
                        LinkedList linkedList = this.f3075z;
                        C0162d0 d0Var = this.f3065p;
                        if (u6 > 0) {
                            C0191n nVar = this.f3062c;
                            L(nVar);
                            String str3 = "_tu";
                            if (nVar.o0(false, false, false, true, ((zzhx) dVar2.f490b).zzF(), v()).g > ((long) u6)) {
                                zzhp zze = zzhq.zze();
                                zze.zzj("_tnr");
                                zze.zzi(1);
                                zzhl.zzf((zzhq) zze.zzba());
                            } else {
                                if (h0().B(((zzhx) dVar2.f490b).zzF(), H.X0)) {
                                    str2 = e().x();
                                    zzhp zze2 = zzhq.zze();
                                    zze2.zzj(str3);
                                    zze2.zzk(str2);
                                    zzhl.zzf((zzhq) zze2.zzba());
                                } else {
                                    str2 = null;
                                }
                                zzhp zze3 = zzhq.zze();
                                zze3.zzj("_tr");
                                zze3.zzi(1);
                                zzhl.zzf((zzhq) zze3.zzba());
                                L(d0Var);
                                I1 S5 = d0Var.S(((zzhx) dVar2.f490b).zzF(), zzhw2, zzhl, str2);
                                if (S5 != null) {
                                    Z c3 = c();
                                    c3.f3180w.c("Generated trigger URI. appId, uri", ((zzhx) dVar2.f490b).zzF(), S5.f2966a);
                                    C0191n nVar2 = this.f3062c;
                                    L(nVar2);
                                    nVar2.Y(((zzhx) dVar2.f490b).zzF(), S5);
                                    if (!linkedList.contains(((zzhx) dVar2.f490b).zzF())) {
                                        linkedList.add(((zzhx) dVar2.f490b).zzF());
                                    }
                                }
                            }
                        } else {
                            if (h0().B(((zzhx) dVar2.f490b).zzF(), H.X0)) {
                                str = e().x();
                                zzhp zze4 = zzhq.zze();
                                zze4.zzj("_tu");
                                zze4.zzk(str);
                                zzhl.zzf((zzhq) zze4.zzba());
                            } else {
                                str = null;
                            }
                            zzhp zze5 = zzhq.zze();
                            zze5.zzj("_tr");
                            zze5.zzi(1);
                            zzhl.zzf((zzhq) zze5.zzba());
                            L(d0Var);
                            I1 S6 = d0Var.S(((zzhx) dVar2.f490b).zzF(), zzhw2, zzhl, str);
                            if (S6 != null) {
                                Z c6 = c();
                                c6.f3180w.c("Generated trigger URI. appId, uri", ((zzhx) dVar2.f490b).zzF(), S6.f2966a);
                                C0191n nVar3 = this.f3062c;
                                L(nVar3);
                                nVar3.Y(((zzhx) dVar2.f490b).zzF(), S6);
                                if (!linkedList.contains(((zzhx) dVar2.f490b).zzF())) {
                                    linkedList.add(((zzhx) dVar2.f490b).zzF());
                                }
                            }
                        }
                    }
                    zzhw2.zzae(i2, (zzhm) zzhl.zzba());
                }
            }
        }
    }

    public final void q(C0214v vVar, Z1 z12) {
        C0181j1 j1Var;
        List list;
        C0212u0 u0Var;
        List list2;
        List<C0164e> list3;
        String str;
        Z1 z13 = z12;
        I.g(z12);
        String str2 = z13.f3201a;
        I.d(str2);
        f().o();
        k();
        C0153a0 c3 = C0153a0.c(vVar);
        f().o();
        if (this.f3055O == null || (str = this.f3056P) == null || !str.equals(str2)) {
            j1Var = null;
        } else {
            j1Var = this.f3055O;
        }
        Y1.E(j1Var, (Bundle) c3.f3223e, false);
        C0214v a6 = c3.a();
        a();
        if (TextUtils.isEmpty(z13.f3202b) && TextUtils.isEmpty(z13.f3215y)) {
            return;
        }
        if (!z13.f3207q) {
            f0(z13);
            return;
        }
        List list4 = z13.f3187B;
        if (list4 != null) {
            String str3 = a6.f3508a;
            if (list4.contains(str3)) {
                Bundle v6 = a6.f3509b.v();
                v6.putLong("ga_safelisted", 1);
                a6 = new C0214v(str3, new C0211u(v6), a6.f3510c, a6.d);
            } else {
                c().f3179v.d("Dropping non-safelisted event. appId, event name, origin", str2, a6.f3508a, a6.f3510c);
                return;
            }
        }
        C0191n nVar = this.f3062c;
        L(nVar);
        nVar.z();
        try {
            zzra.zzb();
            boolean B6 = h0().B((String) null, H.f2914i1);
            String str4 = a6.f3508a;
            if (B6) {
                if ("_s".equals(str4)) {
                    C0191n nVar2 = this.f3062c;
                    L(nVar2);
                    if (!nVar2.O(str2, "_s") && a6.f3509b.f3472a.getLong("_sid") != 0) {
                        C0191n nVar3 = this.f3062c;
                        L(nVar3);
                        if (!nVar3.O(str2, "_f")) {
                            C0191n nVar4 = this.f3062c;
                            L(nVar4);
                            if (!nVar4.O(str2, "_v")) {
                                C0191n nVar5 = this.f3062c;
                                L(nVar5);
                                ((b) g()).getClass();
                                nVar5.y(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", e0(a6, str2));
                            }
                        }
                        C0191n nVar6 = this.f3062c;
                        L(nVar6);
                        nVar6.y(str2, (Long) null, "_sid", e0(a6, str2));
                    }
                }
            }
            C0191n nVar7 = this.f3062c;
            L(nVar7);
            I.d(str2);
            nVar7.o();
            nVar7.p();
            long j6 = vVar.d;
            int i2 = (j6 > 0 ? 1 : (j6 == 0 ? 0 : -1));
            if (i2 < 0) {
                Z z3 = ((C0212u0) nVar7.f398a).f3496r;
                C0212u0.k(z3);
                z3.f3175r.c("Invalid time querying timed out conditional properties", Z.w(str2), Long.valueOf(j6));
                list = Collections.emptyList();
            } else {
                list = nVar7.u("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j6)});
            }
            Iterator it2 = list.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                u0Var = this.f3070u;
                if (!hasNext) {
                    break;
                }
                C0164e eVar = (C0164e) it2.next();
                if (eVar != null) {
                    c().f3180w.d("User property timed out", eVar.f3271a, u0Var.f3500v.f(eVar.f3273c.f3140b), eVar.f3273c.v());
                    C0214v vVar2 = eVar.f3276p;
                    if (vVar2 != null) {
                        b0(new C0214v(vVar2, j6), z13);
                    }
                    C0191n nVar8 = this.f3062c;
                    L(nVar8);
                    nVar8.P(str2, eVar.f3273c.f3140b);
                }
            }
            C0191n nVar9 = this.f3062c;
            L(nVar9);
            I.d(str2);
            nVar9.o();
            nVar9.p();
            if (i2 < 0) {
                Z z4 = ((C0212u0) nVar9.f398a).f3496r;
                C0212u0.k(z4);
                z4.f3175r.c("Invalid time querying expired conditional properties", Z.w(str2), Long.valueOf(j6));
                list2 = Collections.emptyList();
            } else {
                list2 = nVar9.u("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j6)});
            }
            ArrayList arrayList = new ArrayList(list2.size());
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                C0164e eVar2 = (C0164e) it3.next();
                if (eVar2 != null) {
                    Iterator it4 = it3;
                    c().f3180w.d("User property expired", eVar2.f3271a, u0Var.f3500v.f(eVar2.f3273c.f3140b), eVar2.f3273c.v());
                    C0191n nVar10 = this.f3062c;
                    L(nVar10);
                    nVar10.H(str2, eVar2.f3273c.f3140b);
                    C0214v vVar3 = eVar2.f3280t;
                    if (vVar3 != null) {
                        arrayList.add(vVar3);
                    }
                    C0191n nVar11 = this.f3062c;
                    L(nVar11);
                    nVar11.P(str2, eVar2.f3273c.f3140b);
                    it3 = it4;
                }
            }
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                b0(new C0214v((C0214v) it5.next(), j6), z13);
            }
            C0191n nVar12 = this.f3062c;
            L(nVar12);
            I.d(str2);
            I.d(str4);
            nVar12.o();
            nVar12.p();
            if (i2 < 0) {
                C0212u0 u0Var2 = (C0212u0) nVar12.f398a;
                Z z5 = u0Var2.f3496r;
                C0212u0.k(z5);
                z5.f3175r.d("Invalid time querying triggered conditional properties", Z.w(str2), u0Var2.f3500v.d(str4), Long.valueOf(j6));
                list3 = Collections.emptyList();
            } else {
                list3 = nVar12.u("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j6)});
            }
            ArrayList arrayList2 = new ArrayList(list3.size());
            for (C0164e eVar3 : list3) {
                if (eVar3 != null) {
                    W1 w12 = eVar3.f3273c;
                    String str5 = eVar3.f3271a;
                    I.g(str5);
                    String str6 = eVar3.f3272b;
                    String str7 = w12.f3140b;
                    Object v7 = w12.v();
                    I.g(v7);
                    X1 x12 = new X1(str5, str6, str7, j6, v7);
                    Object obj = x12.f3154e;
                    String str8 = x12.f3153c;
                    C0191n nVar13 = this.f3062c;
                    L(nVar13);
                    if (nVar13.c0(x12)) {
                        c().f3180w.d("User property triggered", eVar3.f3271a, u0Var.f3500v.f(str8), obj);
                    } else {
                        c().f3172f.d("Too many active user properties, ignoring", Z.w(eVar3.f3271a), u0Var.f3500v.f(str8), obj);
                    }
                    C0214v vVar4 = eVar3.f3278r;
                    if (vVar4 != null) {
                        arrayList2.add(vVar4);
                    }
                    eVar3.f3273c = new W1(x12);
                    eVar3.f3274e = true;
                    C0191n nVar14 = this.f3062c;
                    L(nVar14);
                    nVar14.b0(eVar3);
                }
            }
            b0(a6, z13);
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                b0(new C0214v((C0214v) it6.next(), j6), z13);
            }
            C0191n nVar15 = this.f3062c;
            L(nVar15);
            nVar15.J();
            C0191n nVar16 = this.f3062c;
            L(nVar16);
            nVar16.D();
        } catch (Throwable th) {
            C0191n nVar17 = this.f3062c;
            L(nVar17);
            nVar17.D();
            throw th;
        }
    }

    public final void r(C0214v vVar, String str) {
        Z1 z12;
        C0214v vVar2 = vVar;
        String str2 = str;
        C0191n nVar = this.f3062c;
        L(nVar);
        V l02 = nVar.l0(str2);
        if (l02 == null || TextUtils.isEmpty(l02.e())) {
            c().f3179v.b(str2, "No app data available; dropping event");
            return;
        }
        Boolean A6 = A(l02);
        if (A6 == null) {
            if (!"_ui".equals(vVar2.f3508a)) {
                Z c3 = c();
                c3.f3175r.b(Z.w(str), "Could not find package. appId");
            }
        } else if (!A6.booleanValue()) {
            Z c6 = c();
            c6.f3172f.b(Z.w(str), "App version does not match; dropping event. appId");
            return;
        }
        String g = l02.g();
        String e6 = l02.e();
        long S5 = l02.S();
        C0212u0 u0Var = l02.f3103a;
        C0203r0 r0Var = u0Var.f3497s;
        C0212u0.k(r0Var);
        r0Var.o();
        String str3 = l02.f3111l;
        C0203r0 r0Var2 = u0Var.f3497s;
        C0212u0.k(r0Var2);
        r0Var2.o();
        long j6 = l02.f3112m;
        C0203r0 r0Var3 = u0Var.f3497s;
        C0212u0.k(r0Var3);
        r0Var3.o();
        long j7 = l02.f3113n;
        C0203r0 r0Var4 = u0Var.f3497s;
        C0212u0.k(r0Var4);
        r0Var4.o();
        boolean z3 = l02.f3114o;
        String f6 = l02.f();
        long j8 = j7;
        C0203r0 r0Var5 = u0Var.f3497s;
        C0212u0.k(r0Var5);
        r0Var5.o();
        boolean z4 = l02.f3115p;
        String a6 = l02.a();
        Boolean U5 = l02.U();
        long T5 = l02.T();
        C0203r0 r0Var6 = u0Var.f3497s;
        C0212u0.k(r0Var6);
        r0Var6.o();
        ArrayList arrayList = l02.f3119t;
        String j9 = n0(str2).j();
        boolean t6 = l02.t();
        boolean z5 = z4;
        C0203r0 r0Var7 = u0Var.f3497s;
        C0212u0.k(r0Var7);
        r0Var7.o();
        ArrayList arrayList2 = arrayList;
        long j10 = l02.f3122w;
        boolean z6 = z3;
        J0 n02 = n0(str2);
        ArrayList arrayList3 = arrayList2;
        String str4 = k0(str2).f3426b;
        C0203r0 r0Var8 = u0Var.f3497s;
        C0212u0.k(r0Var8);
        r0Var8.o();
        int i2 = l02.f3124y;
        C0203r0 r0Var9 = u0Var.f3497s;
        C0212u0.k(r0Var9);
        r0Var9.o();
        long j11 = j10;
        String str5 = str;
        String str6 = str3;
        long j12 = j6;
        String str7 = str4;
        long j13 = j8;
        Z1 z13 = z12;
        ArrayList arrayList4 = arrayList3;
        long j14 = j11;
        new Z1(str5, g, e6, S5, str6, j12, j13, (String) null, z6, false, f6, 0, 0, z5, false, a6, U5, T5, (List) arrayList4, (String) null, j9, "", (String) null, t6, j14, n02.f2971b, str7, i2, l02.f3086C, l02.i(), l02.h(), 0, l02.R());
        s(vVar2, z13);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        if (r5 == null) goto L_0x0091;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(T1.C0214v r10, T1.Z1 r11) {
        /*
            r9 = this;
            java.lang.String r0 = r11.f3201a
            com.google.android.gms.common.internal.I.d(r0)
            T1.a0 r10 = T1.C0153a0.c(r10)
            T1.Y1 r1 = r9.e()
            T1.n r2 = r9.f3062c
            L(r2)
            java.lang.Object r3 = r2.f398a
            T1.u0 r3 = (T1.C0212u0) r3
            r2.o()
            r2.p()
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r2.k0()     // Catch:{ SQLiteException -> 0x0080, all -> 0x007d }
            java.lang.String r6 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x0080, all -> 0x007d }
            android.database.Cursor r5 = r5.rawQuery(r6, r7)     // Catch:{ SQLiteException -> 0x0080, all -> 0x007d }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0040 }
            if (r6 != 0) goto L_0x0042
            T1.Z r2 = r3.f3496r     // Catch:{ SQLiteException -> 0x0040 }
            T1.C0212u0.k(r2)     // Catch:{ SQLiteException -> 0x0040 }
            T1.X r2 = r2.f3180w     // Catch:{ SQLiteException -> 0x0040 }
            java.lang.String r6 = "Default event parameters not found"
            r2.a(r6)     // Catch:{ SQLiteException -> 0x0040 }
            goto L_0x008e
        L_0x003e:
            r10 = move-exception
            goto L_0x007a
        L_0x0040:
            r2 = move-exception
            goto L_0x0082
        L_0x0042:
            r6 = 0
            byte[] r6 = r5.getBlob(r6)     // Catch:{ SQLiteException -> 0x0040 }
            com.google.android.gms.internal.measurement.zzhl r7 = com.google.android.gms.internal.measurement.zzhm.zze()     // Catch:{ IOException -> 0x0068 }
            com.google.android.gms.internal.measurement.zzng r6 = T1.C0162d0.U(r7, r6)     // Catch:{ IOException -> 0x0068 }
            com.google.android.gms.internal.measurement.zzhl r6 = (com.google.android.gms.internal.measurement.zzhl) r6     // Catch:{ IOException -> 0x0068 }
            com.google.android.gms.internal.measurement.zzmd r6 = r6.zzba()     // Catch:{ IOException -> 0x0068 }
            com.google.android.gms.internal.measurement.zzhm r6 = (com.google.android.gms.internal.measurement.zzhm) r6     // Catch:{ IOException -> 0x0068 }
            T1.T1 r2 = r2.f2982b     // Catch:{ SQLiteException -> 0x0040 }
            r2.a()     // Catch:{ SQLiteException -> 0x0040 }
            java.util.List r2 = r6.zzi()     // Catch:{ SQLiteException -> 0x0040 }
            android.os.Bundle r4 = T1.C0162d0.w(r2)     // Catch:{ SQLiteException -> 0x0040 }
        L_0x0064:
            r5.close()
            goto L_0x0091
        L_0x0068:
            r2 = move-exception
            T1.Z r6 = r3.f3496r     // Catch:{ SQLiteException -> 0x0040 }
            T1.C0212u0.k(r6)     // Catch:{ SQLiteException -> 0x0040 }
            T1.X r6 = r6.f3172f     // Catch:{ SQLiteException -> 0x0040 }
            java.lang.String r7 = "Failed to retrieve default event parameters. appId"
            T1.Y r8 = T1.Z.w(r0)     // Catch:{ SQLiteException -> 0x0040 }
            r6.c(r7, r8, r2)     // Catch:{ SQLiteException -> 0x0040 }
            goto L_0x008e
        L_0x007a:
            r4 = r5
            goto L_0x00fa
        L_0x007d:
            r10 = move-exception
            goto L_0x00fa
        L_0x0080:
            r2 = move-exception
            r5 = r4
        L_0x0082:
            T1.Z r3 = r3.f3496r     // Catch:{ all -> 0x003e }
            T1.C0212u0.k(r3)     // Catch:{ all -> 0x003e }
            T1.X r3 = r3.f3172f     // Catch:{ all -> 0x003e }
            java.lang.String r6 = "Error selecting default event parameters"
            r3.b(r2, r6)     // Catch:{ all -> 0x003e }
        L_0x008e:
            if (r5 == 0) goto L_0x0091
            goto L_0x0064
        L_0x0091:
            java.lang.Object r2 = r10.f3223e
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.F(r2, r4)
            T1.Y1 r1 = r9.e()
            T1.g r2 = r9.h0()
            r2.getClass()
            T1.G r3 = T1.H.f2885W
            int r0 = r2.u(r0, r3)
            r2 = 100
            int r0 = java.lang.Math.min(r0, r2)
            r2 = 25
            int r0 = java.lang.Math.max(r0, r2)
            r1.H(r10, r0)
            T1.v r10 = r10.a()
            java.lang.String r0 = r10.f3508a
            java.lang.String r1 = "_cmp"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00c7
            goto L_0x00f6
        L_0x00c7:
            T1.u r0 = r10.f3509b
            android.os.Bundle r1 = r0.f3472a
            java.lang.String r2 = "_cis"
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "referrer API v2"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00f6
            android.os.Bundle r0 = r0.f3472a
            java.lang.String r1 = "gclid"
            java.lang.String r5 = r0.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x00f6
            T1.W1 r0 = new T1.W1
            long r3 = r10.d
            java.lang.String r7 = "auto"
            java.lang.String r6 = "_lgclid"
            r2 = r0
            r2.<init>(r3, r5, r6, r7)
            r9.W(r0, r11)
        L_0x00f6:
            r9.q(r10, r11)
            return
        L_0x00fa:
            if (r4 == 0) goto L_0x00ff
            r4.close()
        L_0x00ff:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.T1.s(T1.v, T1.Z1):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[Catch:{ all -> 0x005f, all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0114 A[Catch:{ all -> 0x005f, all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0120 A[Catch:{ all -> 0x005f, all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013e A[Catch:{ all -> 0x005f, all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0142 A[Catch:{ all -> 0x005f, all -> 0x0015 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(java.lang.String r10, int r11, java.io.IOException r12, byte[] r13, java.util.Map r14) {
        /*
            r9 = this;
            T1.d0 r0 = r9.f3061b
            T1.r0 r1 = r9.f()
            r1.o()
            r9.k()
            com.google.android.gms.common.internal.I.d(r10)
            r1 = 0
            if (r13 != 0) goto L_0x0018
            byte[] r13 = new byte[r1]     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r10 = move-exception
            goto L_0x0190
        L_0x0018:
            T1.Z r2 = r9.c()     // Catch:{ all -> 0x0015 }
            T1.X r2 = r2.f3180w     // Catch:{ all -> 0x0015 }
            java.lang.String r3 = "onConfigFetched. Response size"
            int r4 = r13.length     // Catch:{ all -> 0x0015 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0015 }
            r2.b(r4, r3)     // Catch:{ all -> 0x0015 }
            T1.n r2 = r9.f3062c     // Catch:{ all -> 0x0015 }
            L(r2)     // Catch:{ all -> 0x0015 }
            r2.z()     // Catch:{ all -> 0x0015 }
            T1.n r2 = r9.f3062c     // Catch:{ all -> 0x005f }
            L(r2)     // Catch:{ all -> 0x005f }
            T1.V r2 = r2.l0(r10)     // Catch:{ all -> 0x005f }
            r3 = 200(0xc8, float:2.8E-43)
            r5 = 304(0x130, float:4.26E-43)
            if (r11 == r3) goto L_0x0049
            r3 = 204(0xcc, float:2.86E-43)
            if (r11 == r3) goto L_0x0049
            if (r11 != r5) goto L_0x0047
            r11 = r5
            goto L_0x0049
        L_0x0047:
            r3 = r1
            goto L_0x004c
        L_0x0049:
            if (r12 != 0) goto L_0x0047
            r3 = 1
        L_0x004c:
            if (r2 != 0) goto L_0x0062
            T1.Z r11 = r9.c()     // Catch:{ all -> 0x005f }
            T1.X r11 = r11.f3175r     // Catch:{ all -> 0x005f }
            java.lang.String r12 = "App does not exist in onConfigFetched. appId"
            T1.Y r10 = T1.Z.w(r10)     // Catch:{ all -> 0x005f }
            r11.b(r10, r12)     // Catch:{ all -> 0x005f }
            goto L_0x0171
        L_0x005f:
            r10 = move-exception
            goto L_0x0187
        L_0x0062:
            r6 = 404(0x194, float:5.66E-43)
            T1.n0 r7 = r9.f3060a
            r8 = 0
            if (r3 != 0) goto L_0x00d3
            if (r11 != r6) goto L_0x006c
            goto L_0x00d3
        L_0x006c:
            G1.a r13 = r9.g()     // Catch:{ all -> 0x005f }
            G1.b r13 = (G1.b) r13     // Catch:{ all -> 0x005f }
            r13.getClass()     // Catch:{ all -> 0x005f }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005f }
            r2.F(r13)     // Catch:{ all -> 0x005f }
            T1.n r13 = r9.f3062c     // Catch:{ all -> 0x005f }
            L(r13)     // Catch:{ all -> 0x005f }
            r13.K(r2, r1)     // Catch:{ all -> 0x005f }
            T1.Z r13 = r9.c()     // Catch:{ all -> 0x005f }
            T1.X r13 = r13.f3180w     // Catch:{ all -> 0x005f }
            java.lang.String r14 = "Fetching config failed. code, error"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x005f }
            r13.c(r14, r0, r12)     // Catch:{ all -> 0x005f }
            L(r7)     // Catch:{ all -> 0x005f }
            r7.o()     // Catch:{ all -> 0x005f }
            n.e r12 = r7.f3409v     // Catch:{ all -> 0x005f }
            r12.put(r10, r8)     // Catch:{ all -> 0x005f }
            T1.y1 r10 = r9.f3067r     // Catch:{ all -> 0x005f }
            T1.g0 r10 = r10.f3548r     // Catch:{ all -> 0x005f }
            G1.a r12 = r9.g()     // Catch:{ all -> 0x005f }
            G1.b r12 = (G1.b) r12     // Catch:{ all -> 0x005f }
            r12.getClass()     // Catch:{ all -> 0x005f }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005f }
            r10.b(r12)     // Catch:{ all -> 0x005f }
            r10 = 503(0x1f7, float:7.05E-43)
            if (r11 == r10) goto L_0x00ba
            r10 = 429(0x1ad, float:6.01E-43)
            if (r11 != r10) goto L_0x00ce
        L_0x00ba:
            T1.y1 r10 = r9.f3067r     // Catch:{ all -> 0x005f }
            T1.g0 r10 = r10.f3546p     // Catch:{ all -> 0x005f }
            G1.a r11 = r9.g()     // Catch:{ all -> 0x005f }
            G1.b r11 = (G1.b) r11     // Catch:{ all -> 0x005f }
            r11.getClass()     // Catch:{ all -> 0x005f }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005f }
            r10.b(r11)     // Catch:{ all -> 0x005f }
        L_0x00ce:
            r9.F()     // Catch:{ all -> 0x005f }
            goto L_0x0171
        L_0x00d3:
            java.lang.String r12 = "Last-Modified"
            java.lang.String r12 = B(r14, r12)     // Catch:{ all -> 0x005f }
            java.lang.String r3 = "ETag"
            java.lang.String r14 = B(r14, r3)     // Catch:{ all -> 0x005f }
            if (r11 == r6) goto L_0x00eb
            if (r11 != r5) goto L_0x00e4
            goto L_0x00eb
        L_0x00e4:
            L(r7)     // Catch:{ all -> 0x005f }
            r7.I(r10, r12, r14, r13)     // Catch:{ all -> 0x005f }
            goto L_0x00fa
        L_0x00eb:
            L(r7)     // Catch:{ all -> 0x005f }
            com.google.android.gms.internal.measurement.zzgo r12 = r7.D(r10)     // Catch:{ all -> 0x005f }
            if (r12 != 0) goto L_0x00fa
            L(r7)     // Catch:{ all -> 0x005f }
            r7.I(r10, r8, r8, r8)     // Catch:{ all -> 0x005f }
        L_0x00fa:
            G1.a r12 = r9.g()     // Catch:{ all -> 0x005f }
            G1.b r12 = (G1.b) r12     // Catch:{ all -> 0x005f }
            r12.getClass()     // Catch:{ all -> 0x005f }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005f }
            r2.u(r12)     // Catch:{ all -> 0x005f }
            T1.n r12 = r9.f3062c     // Catch:{ all -> 0x005f }
            L(r12)     // Catch:{ all -> 0x005f }
            r12.K(r2, r1)     // Catch:{ all -> 0x005f }
            if (r11 != r6) goto L_0x0120
            T1.Z r11 = r9.c()     // Catch:{ all -> 0x005f }
            T1.X r11 = r11.f3177t     // Catch:{ all -> 0x005f }
            java.lang.String r12 = "Config not found. Using empty config. appId"
            r11.b(r10, r12)     // Catch:{ all -> 0x005f }
            goto L_0x012f
        L_0x0120:
            T1.Z r10 = r9.c()     // Catch:{ all -> 0x005f }
            T1.X r10 = r10.f3180w     // Catch:{ all -> 0x005f }
            java.lang.String r12 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x005f }
            r10.c(r12, r11, r4)     // Catch:{ all -> 0x005f }
        L_0x012f:
            L(r0)     // Catch:{ all -> 0x005f }
            boolean r10 = r0.N()     // Catch:{ all -> 0x005f }
            if (r10 == 0) goto L_0x0142
            boolean r10 = r9.H()     // Catch:{ all -> 0x005f }
            if (r10 == 0) goto L_0x0142
            r9.X()     // Catch:{ all -> 0x005f }
            goto L_0x0171
        L_0x0142:
            T1.g r10 = r9.h0()     // Catch:{ all -> 0x005f }
            T1.G r11 = T1.H.f2867M0     // Catch:{ all -> 0x005f }
            boolean r10 = r10.B(r8, r11)     // Catch:{ all -> 0x005f }
            if (r10 == 0) goto L_0x016e
            L(r0)     // Catch:{ all -> 0x005f }
            boolean r10 = r0.N()     // Catch:{ all -> 0x005f }
            if (r10 == 0) goto L_0x016e
            T1.n r10 = r9.f3062c     // Catch:{ all -> 0x005f }
            L(r10)     // Catch:{ all -> 0x005f }
            java.lang.String r11 = r2.c()     // Catch:{ all -> 0x005f }
            boolean r10 = r10.N(r11)     // Catch:{ all -> 0x005f }
            if (r10 == 0) goto L_0x016e
            java.lang.String r10 = r2.c()     // Catch:{ all -> 0x005f }
            r9.Z(r10)     // Catch:{ all -> 0x005f }
            goto L_0x0171
        L_0x016e:
            r9.F()     // Catch:{ all -> 0x005f }
        L_0x0171:
            T1.n r10 = r9.f3062c     // Catch:{ all -> 0x005f }
            L(r10)     // Catch:{ all -> 0x005f }
            r10.J()     // Catch:{ all -> 0x005f }
            T1.n r10 = r9.f3062c     // Catch:{ all -> 0x0015 }
            L(r10)     // Catch:{ all -> 0x0015 }
            r10.D()     // Catch:{ all -> 0x0015 }
            r9.f3044C = r1
            r9.C()
            return
        L_0x0187:
            T1.n r11 = r9.f3062c     // Catch:{ all -> 0x0015 }
            L(r11)     // Catch:{ all -> 0x0015 }
            r11.D()     // Catch:{ all -> 0x0015 }
            throw r10     // Catch:{ all -> 0x0015 }
        L_0x0190:
            r9.f3044C = r1
            r9.C()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.T1.t(java.lang.String, int, java.io.IOException, byte[], java.util.Map):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r2 != null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(boolean r19, int r20, java.io.IOException r21, byte[] r22, java.lang.String r23, java.util.List r24) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            r2 = r21
            r9 = r23
            T1.r0 r3 = r18.f()
            r3.o()
            r18.k()
            r10 = 0
            if (r22 != 0) goto L_0x001b
            byte[] r3 = new byte[r10]     // Catch:{ all -> 0x0018 }
            goto L_0x001d
        L_0x0018:
            r0 = move-exception
            goto L_0x02e8
        L_0x001b:
            r3 = r22
        L_0x001d:
            java.util.ArrayList r11 = r1.f3048H     // Catch:{ all -> 0x0018 }
            com.google.android.gms.common.internal.I.g(r11)     // Catch:{ all -> 0x0018 }
            r12 = 0
            r1.f3048H = r12     // Catch:{ all -> 0x0018 }
            if (r19 == 0) goto L_0x0093
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 == r4) goto L_0x0030
            r4 = 204(0xcc, float:2.86E-43)
            if (r0 != r4) goto L_0x0032
            r0 = r4
        L_0x0030:
            if (r2 == 0) goto L_0x0093
        L_0x0032:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0018 }
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0018 }
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0018 }
            int r3 = r4.length()     // Catch:{ all -> 0x0018 }
            r5 = 32
            int r3 = java.lang.Math.min(r5, r3)     // Catch:{ all -> 0x0018 }
            java.lang.String r3 = r4.substring(r10, r3)     // Catch:{ all -> 0x0018 }
            T1.Z r4 = r18.c()     // Catch:{ all -> 0x0018 }
            T1.X r4 = r4.f3177t     // Catch:{ all -> 0x0018 }
            java.lang.String r5 = "Network upload failed. Will retry later. code, error"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0018 }
            r4.d(r5, r6, r2, r3)     // Catch:{ all -> 0x0018 }
            T1.y1 r2 = r1.f3067r     // Catch:{ all -> 0x0018 }
            T1.g0 r2 = r2.f3548r     // Catch:{ all -> 0x0018 }
            G1.a r3 = r18.g()     // Catch:{ all -> 0x0018 }
            G1.b r3 = (G1.b) r3     // Catch:{ all -> 0x0018 }
            r3.getClass()     // Catch:{ all -> 0x0018 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0018 }
            r2.b(r3)     // Catch:{ all -> 0x0018 }
            r2 = 503(0x1f7, float:7.05E-43)
            if (r0 == r2) goto L_0x0072
            r2 = 429(0x1ad, float:6.01E-43)
            if (r0 != r2) goto L_0x0086
        L_0x0072:
            T1.y1 r0 = r1.f3067r     // Catch:{ all -> 0x0018 }
            T1.g0 r0 = r0.f3546p     // Catch:{ all -> 0x0018 }
            G1.a r2 = r18.g()     // Catch:{ all -> 0x0018 }
            G1.b r2 = (G1.b) r2     // Catch:{ all -> 0x0018 }
            r2.getClass()     // Catch:{ all -> 0x0018 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0018 }
            r0.b(r2)     // Catch:{ all -> 0x0018 }
        L_0x0086:
            T1.n r0 = r1.f3062c     // Catch:{ all -> 0x0018 }
            L(r0)     // Catch:{ all -> 0x0018 }
            r0.E(r11)     // Catch:{ all -> 0x0018 }
            r18.F()     // Catch:{ all -> 0x0018 }
            goto L_0x02e2
        L_0x0093:
            T1.Z r2 = r18.c()     // Catch:{ all -> 0x0018 }
            T1.X r2 = r2.f3180w     // Catch:{ all -> 0x0018 }
            java.lang.String r4 = "Network upload successful with code, uploadAttempted"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0018 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r19)     // Catch:{ all -> 0x0018 }
            r2.c(r4, r0, r5)     // Catch:{ all -> 0x0018 }
            if (r19 == 0) goto L_0x00c0
            T1.y1 r2 = r1.f3067r     // Catch:{ SQLiteException -> 0x00bd }
            T1.g0 r2 = r2.f3547q     // Catch:{ SQLiteException -> 0x00bd }
            G1.a r4 = r18.g()     // Catch:{ SQLiteException -> 0x00bd }
            G1.b r4 = (G1.b) r4     // Catch:{ SQLiteException -> 0x00bd }
            r4.getClass()     // Catch:{ SQLiteException -> 0x00bd }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x00bd }
            r2.b(r4)     // Catch:{ SQLiteException -> 0x00bd }
            goto L_0x00c0
        L_0x00bd:
            r0 = move-exception
            goto L_0x02b7
        L_0x00c0:
            T1.y1 r2 = r1.f3067r     // Catch:{ SQLiteException -> 0x00bd }
            T1.g0 r2 = r2.f3548r     // Catch:{ SQLiteException -> 0x00bd }
            r13 = 0
            r2.b(r13)     // Catch:{ SQLiteException -> 0x00bd }
            r18.F()     // Catch:{ SQLiteException -> 0x00bd }
            if (r19 == 0) goto L_0x00df
            T1.Z r2 = r18.c()     // Catch:{ SQLiteException -> 0x00bd }
            T1.X r2 = r2.f3180w     // Catch:{ SQLiteException -> 0x00bd }
            java.lang.String r4 = "Successful upload. Got network response. code, size"
            int r3 = r3.length     // Catch:{ SQLiteException -> 0x00bd }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x00bd }
            r2.c(r4, r0, r3)     // Catch:{ SQLiteException -> 0x00bd }
            goto L_0x00ea
        L_0x00df:
            T1.Z r0 = r18.c()     // Catch:{ SQLiteException -> 0x00bd }
            T1.X r0 = r0.f3180w     // Catch:{ SQLiteException -> 0x00bd }
            java.lang.String r2 = "Purged empty bundles"
            r0.a(r2)     // Catch:{ SQLiteException -> 0x00bd }
        L_0x00ea:
            T1.n r0 = r1.f3062c     // Catch:{ SQLiteException -> 0x00bd }
            L(r0)     // Catch:{ SQLiteException -> 0x00bd }
            r0.z()     // Catch:{ SQLiteException -> 0x00bd }
            T1.g r0 = r18.h0()     // Catch:{ all -> 0x0178 }
            T1.G r2 = T1.H.f2867M0     // Catch:{ all -> 0x0178 }
            boolean r0 = r0.B(r12, r2)     // Catch:{ all -> 0x0178 }
            r7 = -1
            if (r0 == 0) goto L_0x01f8
            T1.g r0 = r18.h0()     // Catch:{ all -> 0x0178 }
            T1.G r2 = T1.H.f2872P0     // Catch:{ all -> 0x0178 }
            boolean r0 = r0.B(r12, r2)     // Catch:{ all -> 0x0178 }
            if (r0 == 0) goto L_0x01c5
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0178 }
            r0.<init>()     // Catch:{ all -> 0x0178 }
            java.util.Iterator r15 = r24.iterator()     // Catch:{ all -> 0x0178 }
        L_0x0115:
            boolean r2 = r15.hasNext()     // Catch:{ all -> 0x0178 }
            T1.i1 r6 = T1.C0178i1.SGTM_CLIENT
            if (r2 == 0) goto L_0x017b
            java.lang.Object r2 = r15.next()     // Catch:{ all -> 0x0178 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0178 }
            java.lang.Object r3 = r2.first     // Catch:{ all -> 0x0178 }
            r16 = r3
            com.google.android.gms.internal.measurement.zzhv r16 = (com.google.android.gms.internal.measurement.zzhv) r16     // Catch:{ all -> 0x0178 }
            java.lang.Object r2 = r2.second     // Catch:{ all -> 0x0178 }
            T1.P1 r2 = (T1.P1) r2     // Catch:{ all -> 0x0178 }
            T1.i1 r3 = r2.f3022c     // Catch:{ all -> 0x0178 }
            if (r3 == r6) goto L_0x0175
            T1.n r3 = r1.f3062c     // Catch:{ all -> 0x0178 }
            L(r3)     // Catch:{ all -> 0x0178 }
            java.lang.String r5 = r2.f3020a     // Catch:{ all -> 0x0178 }
            java.util.Map r4 = r2.f3021b     // Catch:{ all -> 0x0178 }
            if (r4 != 0) goto L_0x0140
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0178 }
        L_0x0140:
            r6 = r4
            T1.i1 r4 = r2.f3022c
            r17 = 0
            r2 = r3
            r3 = r23
            r19 = r4
            r4 = r16
            r13 = r7
            r7 = r19
            r8 = r17
            long r2 = r2.h0(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0178 }
            T1.i1 r4 = T1.C0178i1.GOOGLE_SIGNAL_PENDING     // Catch:{ all -> 0x0178 }
            r5 = r19
            if (r5 != r4) goto L_0x0174
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0174
            java.lang.String r4 = r16.zzf()     // Catch:{ all -> 0x0178 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0178 }
            if (r4 != 0) goto L_0x0174
            java.lang.String r4 = r16.zzf()     // Catch:{ all -> 0x0178 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0178 }
            r0.put(r4, r2)     // Catch:{ all -> 0x0178 }
        L_0x0174:
            r7 = r13
        L_0x0175:
            r13 = 0
            goto L_0x0115
        L_0x0178:
            r0 = move-exception
            goto L_0x02ae
        L_0x017b:
            r13 = r7
            java.util.Iterator r15 = r24.iterator()     // Catch:{ all -> 0x0178 }
        L_0x0180:
            boolean r2 = r15.hasNext()     // Catch:{ all -> 0x0178 }
            if (r2 == 0) goto L_0x01f9
            java.lang.Object r2 = r15.next()     // Catch:{ all -> 0x0178 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0178 }
            java.lang.Object r3 = r2.first     // Catch:{ all -> 0x0178 }
            r4 = r3
            com.google.android.gms.internal.measurement.zzhv r4 = (com.google.android.gms.internal.measurement.zzhv) r4     // Catch:{ all -> 0x0178 }
            java.lang.Object r2 = r2.second     // Catch:{ all -> 0x0178 }
            T1.P1 r2 = (T1.P1) r2     // Catch:{ all -> 0x0178 }
            T1.i1 r3 = r2.f3022c     // Catch:{ all -> 0x0178 }
            if (r3 != r6) goto L_0x0180
            java.lang.String r3 = r4.zzf()     // Catch:{ all -> 0x0178 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0178 }
            r8 = r3
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x0178 }
            T1.n r3 = r1.f3062c     // Catch:{ all -> 0x0178 }
            L(r3)     // Catch:{ all -> 0x0178 }
            java.lang.String r5 = r2.f3020a     // Catch:{ all -> 0x0178 }
            java.util.Map r7 = r2.f3021b     // Catch:{ all -> 0x0178 }
            if (r7 != 0) goto L_0x01b3
            java.util.Map r7 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0178 }
        L_0x01b3:
            T1.i1 r2 = r2.f3022c     // Catch:{ all -> 0x0178 }
            r16 = r2
            r2 = r3
            r3 = r23
            r17 = r6
            r6 = r7
            r7 = r16
            r2.h0(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0178 }
            r6 = r17
            goto L_0x0180
        L_0x01c5:
            r13 = r7
            java.util.Iterator r0 = r24.iterator()     // Catch:{ all -> 0x0178 }
        L_0x01ca:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0178 }
            if (r2 == 0) goto L_0x01f9
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0178 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0178 }
            java.lang.Object r3 = r2.first     // Catch:{ all -> 0x0178 }
            r4 = r3
            com.google.android.gms.internal.measurement.zzhv r4 = (com.google.android.gms.internal.measurement.zzhv) r4     // Catch:{ all -> 0x0178 }
            java.lang.Object r2 = r2.second     // Catch:{ all -> 0x0178 }
            T1.P1 r2 = (T1.P1) r2     // Catch:{ all -> 0x0178 }
            T1.n r3 = r1.f3062c     // Catch:{ all -> 0x0178 }
            L(r3)     // Catch:{ all -> 0x0178 }
            java.lang.String r5 = r2.f3020a     // Catch:{ all -> 0x0178 }
            java.util.Map r6 = r2.f3021b     // Catch:{ all -> 0x0178 }
            if (r6 != 0) goto L_0x01ee
            java.util.Map r6 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0178 }
        L_0x01ee:
            T1.i1 r7 = r2.f3022c     // Catch:{ all -> 0x0178 }
            r8 = 0
            r2 = r3
            r3 = r23
            r2.h0(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0178 }
            goto L_0x01ca
        L_0x01f8:
            r13 = r7
        L_0x01f9:
            java.util.Iterator r2 = r11.iterator()     // Catch:{ all -> 0x0178 }
        L_0x01fd:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0178 }
            if (r0 == 0) goto L_0x0258
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0178 }
            r3 = r0
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0178 }
            T1.n r4 = r1.f3062c     // Catch:{ SQLiteException -> 0x024b }
            L(r4)     // Catch:{ SQLiteException -> 0x024b }
            long r5 = r3.longValue()     // Catch:{ SQLiteException -> 0x024b }
            r4.o()     // Catch:{ SQLiteException -> 0x024b }
            r4.p()     // Catch:{ SQLiteException -> 0x024b }
            android.database.sqlite.SQLiteDatabase r0 = r4.k0()     // Catch:{ SQLiteException -> 0x024b }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x024b }
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch:{ SQLiteException -> 0x024b }
            java.lang.String r6 = "queue"
            java.lang.String r7 = "rowid=?"
            int r0 = r0.delete(r6, r7, r5)     // Catch:{ SQLiteException -> 0x0239 }
            r5 = 1
            if (r0 != r5) goto L_0x0231
            goto L_0x01fd
        L_0x0231:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x0239 }
            java.lang.String r5 = "Deleted fewer rows from queue than expected"
            r0.<init>(r5)     // Catch:{ SQLiteException -> 0x0239 }
            throw r0     // Catch:{ SQLiteException -> 0x0239 }
        L_0x0239:
            r0 = move-exception
            java.lang.Object r4 = r4.f398a     // Catch:{ SQLiteException -> 0x024b }
            T1.u0 r4 = (T1.C0212u0) r4     // Catch:{ SQLiteException -> 0x024b }
            T1.Z r4 = r4.f3496r     // Catch:{ SQLiteException -> 0x024b }
            T1.C0212u0.k(r4)     // Catch:{ SQLiteException -> 0x024b }
            T1.X r4 = r4.f3172f     // Catch:{ SQLiteException -> 0x024b }
            java.lang.String r5 = "Failed to delete a bundle in a queue table"
            r4.b(r0, r5)     // Catch:{ SQLiteException -> 0x024b }
            throw r0     // Catch:{ SQLiteException -> 0x024b }
        L_0x024b:
            r0 = move-exception
            java.util.ArrayList r4 = r1.f3049I     // Catch:{ all -> 0x0178 }
            if (r4 == 0) goto L_0x0257
            boolean r3 = r4.contains(r3)     // Catch:{ all -> 0x0178 }
            if (r3 == 0) goto L_0x0257
            goto L_0x01fd
        L_0x0257:
            throw r0     // Catch:{ all -> 0x0178 }
        L_0x0258:
            T1.n r0 = r1.f3062c     // Catch:{ all -> 0x0178 }
            L(r0)     // Catch:{ all -> 0x0178 }
            r0.J()     // Catch:{ all -> 0x0178 }
            T1.n r0 = r1.f3062c     // Catch:{ SQLiteException -> 0x00bd }
            L(r0)     // Catch:{ SQLiteException -> 0x00bd }
            r0.D()     // Catch:{ SQLiteException -> 0x00bd }
            r1.f3049I = r12     // Catch:{ SQLiteException -> 0x00bd }
            T1.g r0 = r18.h0()     // Catch:{ SQLiteException -> 0x00bd }
            T1.G r2 = T1.H.f2867M0     // Catch:{ SQLiteException -> 0x00bd }
            boolean r0 = r0.B(r12, r2)     // Catch:{ SQLiteException -> 0x00bd }
            T1.d0 r2 = r1.f3061b
            if (r0 == 0) goto L_0x0292
            L(r2)     // Catch:{ SQLiteException -> 0x00bd }
            boolean r0 = r2.N()     // Catch:{ SQLiteException -> 0x00bd }
            if (r0 == 0) goto L_0x0292
            T1.n r0 = r1.f3062c     // Catch:{ SQLiteException -> 0x00bd }
            L(r0)     // Catch:{ SQLiteException -> 0x00bd }
            boolean r0 = r0.N(r9)     // Catch:{ SQLiteException -> 0x00bd }
            if (r0 == 0) goto L_0x0292
            r1.Z(r9)     // Catch:{ SQLiteException -> 0x00bd }
        L_0x028f:
            r2 = 0
            goto L_0x02ab
        L_0x0292:
            L(r2)     // Catch:{ SQLiteException -> 0x00bd }
            boolean r0 = r2.N()     // Catch:{ SQLiteException -> 0x00bd }
            if (r0 == 0) goto L_0x02a5
            boolean r0 = r18.H()     // Catch:{ SQLiteException -> 0x00bd }
            if (r0 == 0) goto L_0x02a5
            r18.X()     // Catch:{ SQLiteException -> 0x00bd }
            goto L_0x028f
        L_0x02a5:
            r1.f3050J = r13     // Catch:{ SQLiteException -> 0x00bd }
            r18.F()     // Catch:{ SQLiteException -> 0x00bd }
            goto L_0x028f
        L_0x02ab:
            r1.f3073x = r2     // Catch:{ SQLiteException -> 0x00bd }
            goto L_0x02e2
        L_0x02ae:
            T1.n r2 = r1.f3062c     // Catch:{ SQLiteException -> 0x00bd }
            L(r2)     // Catch:{ SQLiteException -> 0x00bd }
            r2.D()     // Catch:{ SQLiteException -> 0x00bd }
            throw r0     // Catch:{ SQLiteException -> 0x00bd }
        L_0x02b7:
            T1.Z r2 = r18.c()     // Catch:{ all -> 0x0018 }
            T1.X r2 = r2.f3172f     // Catch:{ all -> 0x0018 }
            java.lang.String r3 = "Database error while trying to delete uploaded bundles"
            r2.b(r0, r3)     // Catch:{ all -> 0x0018 }
            G1.a r0 = r18.g()     // Catch:{ all -> 0x0018 }
            G1.b r0 = (G1.b) r0     // Catch:{ all -> 0x0018 }
            r0.getClass()     // Catch:{ all -> 0x0018 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0018 }
            r1.f3073x = r2     // Catch:{ all -> 0x0018 }
            T1.Z r0 = r18.c()     // Catch:{ all -> 0x0018 }
            T1.X r0 = r0.f3180w     // Catch:{ all -> 0x0018 }
            java.lang.String r2 = "Disable upload, time"
            long r3 = r1.f3073x     // Catch:{ all -> 0x0018 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0018 }
            r0.b(r3, r2)     // Catch:{ all -> 0x0018 }
        L_0x02e2:
            r1.f3045D = r10
            r18.C()
            return
        L_0x02e8:
            r1.f3045D = r10
            r18.C()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.T1.u(boolean, int, java.io.IOException, byte[], java.lang.String, java.util.List):void");
    }

    public final long v() {
        ((b) g()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C0225y1 y1Var = this.f3067r;
        y1Var.p();
        y1Var.o();
        C0171g0 g0Var = y1Var.f3549s;
        long a6 = g0Var.a();
        if (a6 == 0) {
            Y1 y12 = ((C0212u0) y1Var.f398a).f3499u;
            C0212u0.i(y12);
            a6 = ((long) y12.A().nextInt(86400000)) + 1;
            g0Var.b(a6);
        }
        return ((((currentTimeMillis + a6) / 1000) / 60) / 60) / 24;
    }

    public final int y(String str, t tVar) {
        G0 B6;
        C0192n0 n0Var = this.f3060a;
        zzgi C6 = n0Var.C(str);
        I0 i02 = I0.AD_PERSONALIZATION;
        if (C6 == null) {
            tVar.A(i02, C0173h.FAILSAFE);
            return 1;
        }
        C0191n nVar = this.f3062c;
        L(nVar);
        V l02 = nVar.l0(str);
        if (l02 != null) {
            A s6 = A.s(l02.h());
            if (((G0) s6.f2796b) == G0.POLICY && (B6 = n0Var.B(str, i02)) != G0.UNINITIALIZED) {
                tVar.A(i02, C0173h.REMOTE_ENFORCED_DEFAULT);
                if (B6 == G0.GRANTED) {
                    return 0;
                }
                return 1;
            }
        }
        tVar.A(i02, C0173h.REMOTE_DEFAULT);
        if (n0Var.F(str, i02)) {
            return 0;
        }
        return 1;
    }

    public final Z1 z(String str) {
        String str2 = str;
        C0191n nVar = this.f3062c;
        L(nVar);
        V l02 = nVar.l0(str2);
        if (l02 == null || TextUtils.isEmpty(l02.e())) {
            c().f3179v.b(str2, "No app data available; dropping");
            return null;
        }
        Boolean A6 = A(l02);
        if (A6 == null || A6.booleanValue()) {
            String g = l02.g();
            String e6 = l02.e();
            long S5 = l02.S();
            C0212u0 u0Var = l02.f3103a;
            C0203r0 r0Var = u0Var.f3497s;
            C0212u0.k(r0Var);
            r0Var.o();
            String str3 = l02.f3111l;
            C0203r0 r0Var2 = u0Var.f3497s;
            C0212u0.k(r0Var2);
            r0Var2.o();
            long j6 = l02.f3112m;
            C0203r0 r0Var3 = u0Var.f3497s;
            C0212u0.k(r0Var3);
            r0Var3.o();
            long j7 = l02.f3113n;
            C0203r0 r0Var4 = u0Var.f3497s;
            C0212u0.k(r0Var4);
            r0Var4.o();
            boolean z3 = l02.f3114o;
            String f6 = l02.f();
            C0203r0 r0Var5 = u0Var.f3497s;
            C0212u0.k(r0Var5);
            r0Var5.o();
            boolean z4 = l02.f3115p;
            String a6 = l02.a();
            Boolean U5 = l02.U();
            long T5 = l02.T();
            C0203r0 r0Var6 = u0Var.f3497s;
            C0212u0.k(r0Var6);
            r0Var6.o();
            ArrayList arrayList = l02.f3119t;
            String j8 = n0(str).j();
            boolean t6 = l02.t();
            C0203r0 r0Var7 = u0Var.f3497s;
            C0212u0.k(r0Var7);
            r0Var7.o();
            long j9 = j7;
            long j10 = l02.f3122w;
            J0 n02 = n0(str);
            boolean z5 = z4;
            String str4 = k0(str).f3426b;
            C0203r0 r0Var8 = u0Var.f3497s;
            C0212u0.k(r0Var8);
            r0Var8.o();
            int i2 = l02.f3124y;
            C0203r0 r0Var9 = u0Var.f3497s;
            C0212u0.k(r0Var9);
            r0Var9.o();
            long j11 = j10;
            String str5 = str4;
            return new Z1(str, g, e6, S5, str3, j6, j9, (String) null, z3, false, f6, 0, 0, z5, false, a6, U5, T5, (List) arrayList, (String) null, j8, "", (String) null, t6, j11, n02.f2971b, str5, i2, l02.f3086C, l02.i(), l02.h(), 0, l02.R());
        }
        Z c3 = c();
        c3.f3172f.b(Z.w(str), "App version does not match; dropping. appId");
        return null;
    }
}
