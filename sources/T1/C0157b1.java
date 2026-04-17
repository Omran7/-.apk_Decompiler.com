package T1;

import A2.l;
import A2.n;
import A2.r;
import A2.s;
import B2.a;
import G.g;
import G1.b;
import G1.f;
import H4.i;
import I3.h;
import Q1.w;
import S3.m;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzqr;
import i0.C0581d;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s2.e;

/* renamed from: T1.b1  reason: case insensitive filesystem */
public final class C0157b1 extends E {

    /* renamed from: A  reason: collision with root package name */
    public final C0206s0 f3239A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f3240B = true;

    /* renamed from: C  reason: collision with root package name */
    public V0 f3241C;

    /* renamed from: D  reason: collision with root package name */
    public U0 f3242D;

    /* renamed from: E  reason: collision with root package name */
    public V0 f3243E;
    public final A F = new A((Object) this, 2);

    /* renamed from: c  reason: collision with root package name */
    public m f3244c;
    public L0 d;

    /* renamed from: e  reason: collision with root package name */
    public final CopyOnWriteArraySet f3245e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    public boolean f3246f;

    /* renamed from: p  reason: collision with root package name */
    public final AtomicReference f3247p = new AtomicReference();

    /* renamed from: q  reason: collision with root package name */
    public final Object f3248q = new Object();

    /* renamed from: r  reason: collision with root package name */
    public boolean f3249r = false;

    /* renamed from: s  reason: collision with root package name */
    public int f3250s = 1;

    /* renamed from: t  reason: collision with root package name */
    public V0 f3251t;

    /* renamed from: u  reason: collision with root package name */
    public V0 f3252u;

    /* renamed from: v  reason: collision with root package name */
    public PriorityQueue f3253v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3254w;

    /* renamed from: x  reason: collision with root package name */
    public J0 f3255x = J0.f2969c;

    /* renamed from: y  reason: collision with root package name */
    public final AtomicLong f3256y = new AtomicLong(0);

    /* renamed from: z  reason: collision with root package name */
    public long f3257z = -1;

    public C0157b1(C0212u0 u0Var) {
        super(u0Var);
        this.f3239A = new C0206s0(u0Var);
    }

    public static void s(C0157b1 b1Var, J0 j02, long j6, boolean z3, boolean z4) {
        b1Var.o();
        b1Var.p();
        C0212u0 u0Var = (C0212u0) b1Var.f398a;
        C0174h0 h0Var = u0Var.f3495q;
        C0212u0.i(h0Var);
        J0 v6 = h0Var.v();
        int i2 = (j6 > b1Var.f3257z ? 1 : (j6 == b1Var.f3257z ? 0 : -1));
        int i5 = j02.f2971b;
        Z z5 = u0Var.f3496r;
        if (i2 > 0 || !J0.l(v6.f2971b, i5)) {
            C0174h0 h0Var2 = u0Var.f3495q;
            C0212u0.i(h0Var2);
            h0Var2.o();
            if (J0.l(i5, h0Var2.t().getInt("consent_source", 100))) {
                SharedPreferences.Editor edit = h0Var2.t().edit();
                edit.putString("consent_settings", j02.j());
                edit.putInt("consent_source", i5);
                edit.apply();
                C0212u0.k(z5);
                z5.f3180w.b(j02, "Setting storage consent(FE)");
                b1Var.f3257z = j6;
                if (u0Var.r().A()) {
                    C0219w1 r6 = u0Var.r();
                    r6.o();
                    r6.p();
                    r6.F(new C0193n1(r6, 0));
                } else {
                    C0219w1 r7 = u0Var.r();
                    r7.o();
                    r7.p();
                    if (r7.z()) {
                        r7.F(new C0207s1(r7, r7.C(false), 4));
                    }
                }
                if (z4) {
                    u0Var.r().u(new AtomicReference());
                    return;
                }
                return;
            }
            C0212u0.k(z5);
            z5.f3178u.b(Integer.valueOf(i5), "Lower precedence consent source ignored, proposed source");
            return;
        }
        C0212u0.k(z5);
        z5.f3178u.b(j02, "Dropped out-of-date consent setting, proposed settings");
    }

    public final void A(String str, String str2, Bundle bundle, long j6) {
        boolean z3;
        o();
        if (this.d == null || Y1.i0(str2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        B(str, str2, j6, bundle, true, z3, true);
    }

    public final void B(String str, String str2, long j6, Bundle bundle, boolean z3, boolean z4, boolean z5) {
        b bVar;
        Z z6;
        boolean z7;
        boolean z8;
        C0190m1 m1Var;
        boolean z9;
        E1 e12;
        String str3;
        int i2;
        long j7;
        E1 e13;
        String str4;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        Bundle[] bundleArr;
        int i5;
        int i6;
        Class<?> cls;
        String str5 = str;
        String str6 = str2;
        long j8 = j6;
        Bundle bundle2 = bundle;
        boolean z12 = z5;
        I.d(str);
        I.g(bundle);
        o();
        p();
        C0212u0 u0Var = (C0212u0) this.f398a;
        boolean a6 = u0Var.a();
        Z z13 = u0Var.f3496r;
        if (a6) {
            List list = u0Var.n().f3006t;
            if (list == null || list.contains(str6)) {
                if (!this.f3246f) {
                    this.f3246f = true;
                    try {
                        boolean z14 = u0Var.f3492e;
                        Context context = u0Var.f3489a;
                        if (!z14) {
                            cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader());
                        } else {
                            cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                        }
                        try {
                            cls.getDeclaredMethod("initialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
                        } catch (Exception e6) {
                            C0212u0.k(z13);
                            z13.f3175r.b(e6, "Failed to invoke Tag Manager's initialize() method");
                        }
                    } catch (ClassNotFoundException unused) {
                        C0212u0.k(z13);
                        z13.f3178u.a("Tag Manager is not found and thus will not be used");
                    }
                }
                boolean equals = "_cmp".equals(str6);
                b bVar2 = u0Var.f3501w;
                if (!equals || !bundle2.containsKey("gclid")) {
                    bVar = bVar2;
                    z6 = z13;
                } else {
                    String string = bundle2.getString("gclid");
                    bVar2.getClass();
                    bVar = bVar2;
                    z6 = z13;
                    J(System.currentTimeMillis(), string, "auto", "_lgclid");
                }
                Y1 y12 = u0Var.f3499u;
                C0174h0 h0Var = u0Var.f3495q;
                if (z3 && !Y1.f3164s[0].equals(str6)) {
                    C0212u0.i(y12);
                    C0212u0.i(h0Var);
                    y12.F(bundle2, h0Var.f3318I.J());
                }
                A a7 = this.F;
                S s6 = u0Var.f3500v;
                if (!z12 && !"_iap".equals(str6)) {
                    C0212u0.i(y12);
                    int i7 = 2;
                    if (y12.c0("event", str6)) {
                        if (!y12.Z("event", K0.f2974a, K0.f2975b, str6)) {
                            i7 = 13;
                        } else {
                            ((C0212u0) y12.f398a).getClass();
                            if (y12.Y(40, "event", str6)) {
                                i7 = 0;
                            }
                        }
                    }
                    if (i7 != 0) {
                        C0212u0.k(z6);
                        z6.f3174q.b(s6.d(str6), "Invalid public event name. Event will not be logged (FE)");
                        C0212u0.i(y12);
                        String y6 = Y1.y(str6, 40, true);
                        if (str6 != null) {
                            i6 = str2.length();
                        } else {
                            i6 = 0;
                        }
                        Y1.I(a7, (String) null, i7, "_ev", y6, i6);
                        return;
                    }
                }
                Z z15 = z6;
                C0190m1 m1Var2 = u0Var.f3502x;
                C0212u0.j(m1Var2);
                C0181j1 v6 = m1Var2.v(false);
                if (v6 != null && !bundle2.containsKey("_sc")) {
                    v6.d = true;
                }
                if (!z3 || z12) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                Y1.E(v6, bundle2, z7);
                boolean equals2 = "am".equals(str5);
                boolean i02 = Y1.i0(str2);
                if (!z3 || this.d == null || i02) {
                    z8 = equals2;
                } else if (equals2) {
                    z8 = true;
                } else {
                    C0212u0.k(z15);
                    z15.f3179v.c("Passing event to registered event handler (FE)", s6.d(str6), s6.b(bundle2));
                    I.g(this.d);
                    ((h) this.d).v(str, str2, bundle, j6);
                    return;
                }
                if (u0Var.e()) {
                    C0212u0.i(y12);
                    int r02 = y12.r0(str6);
                    if (r02 != 0) {
                        C0212u0.k(z15);
                        z15.f3174q.b(s6.d(str6), "Invalid event name. Event will not be logged (FE)");
                        String y7 = Y1.y(str6, 40, true);
                        if (str6 != null) {
                            i5 = str2.length();
                        } else {
                            i5 = 0;
                        }
                        C0212u0.i(y12);
                        Y1.I(a7, (String) null, r02, "_ev", y7, i5);
                        return;
                    }
                    Bundle s7 = y12.s(str6, bundle2, Collections.unmodifiableList(Arrays.asList(new String[]{"_o", "_sn", "_sc", "_si"})), z12);
                    I.g(s7);
                    C0212u0.j(m1Var2);
                    C0181j1 v7 = m1Var2.v(false);
                    E1 e14 = u0Var.f3498t;
                    Z z16 = z15;
                    if (v7 == null || !"_ae".equals(str6)) {
                        m1Var = m1Var2;
                    } else {
                        C0212u0.j(e14);
                        D1 d12 = e14.f2828f;
                        ((C0212u0) d12.d.f398a).f3501w.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        m1Var = m1Var2;
                        long j9 = elapsedRealtime - d12.f2822b;
                        d12.f2822b = elapsedRealtime;
                        if (j9 > 0) {
                            y12.C(s7, j9);
                        }
                    }
                    boolean equals3 = "auto".equals(str5);
                    C0212u0 u0Var2 = (C0212u0) y12.f398a;
                    if (!equals3 && "_ssr".equals(str6)) {
                        String string2 = s7.getString("_ffr");
                        int i8 = f.f831a;
                        if (string2 == null || string2.trim().isEmpty()) {
                            string2 = null;
                        } else if (string2 != null) {
                            string2 = string2.trim();
                        }
                        C0174h0 h0Var2 = u0Var2.f3495q;
                        C0212u0.i(h0Var2);
                        if (!Objects.equals(string2, h0Var2.F.C())) {
                            C0174h0 h0Var3 = u0Var2.f3495q;
                            C0212u0.i(h0Var3);
                            h0Var3.F.D(string2);
                        } else {
                            Z z17 = u0Var2.f3496r;
                            C0212u0.k(z17);
                            z17.f3179v.a("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str6)) {
                        C0174h0 h0Var4 = u0Var2.f3495q;
                        C0212u0.i(h0Var4);
                        String C6 = h0Var4.F.C();
                        if (!TextUtils.isEmpty(C6)) {
                            s7.putString("_ffr", C6);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(s7);
                    if (u0Var.f3494p.B((String) null, H.f2894a1)) {
                        C0212u0.j(e14);
                        e14.o();
                        z9 = e14.d;
                    } else {
                        C0212u0.i(h0Var);
                        z9 = h0Var.f3313C.b();
                    }
                    C0212u0.i(h0Var);
                    long j10 = j6;
                    if (h0Var.f3332z.a() <= 0 || !h0Var.x(j10) || !z9) {
                        str3 = "_ae";
                        e12 = e14;
                        j7 = 0;
                        i2 = 0;
                    } else {
                        C0212u0.k(z16);
                        Z z18 = z16;
                        z18.f3180w.a("Current session is expired, remove the session number, ID, and engagement time");
                        bVar.getClass();
                        str3 = "_ae";
                        e12 = e14;
                        z16 = z18;
                        i2 = 0;
                        J(System.currentTimeMillis(), (Object) null, "auto", "_sid");
                        bVar.getClass();
                        J(System.currentTimeMillis(), (Object) null, "auto", "_sno");
                        bVar.getClass();
                        J(System.currentTimeMillis(), (Object) null, "auto", "_se");
                        j7 = 0;
                        h0Var.f3311A.b(0);
                    }
                    if (s7.getLong("extend_session", j7) == 1) {
                        C0212u0.k(z16);
                        z16.f3180w.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                        C0212u0.j(e12);
                        e13 = e12;
                        e13.f2827e.w(j10, true);
                    } else {
                        e13 = e12;
                    }
                    ArrayList arrayList3 = new ArrayList(s7.keySet());
                    Collections.sort(arrayList3);
                    int size = arrayList3.size();
                    int i9 = i2;
                    while (i9 < size) {
                        String str7 = (String) arrayList3.get(i9);
                        if (str7 != null) {
                            C0212u0.i(y12);
                            Object obj = s7.get(str7);
                            if (obj instanceof Bundle) {
                                arrayList = arrayList3;
                                bundleArr = new Bundle[]{(Bundle) obj};
                            } else {
                                arrayList = arrayList3;
                                if (obj instanceof Parcelable[]) {
                                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                                    bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                                } else if (obj instanceof ArrayList) {
                                    ArrayList arrayList4 = (ArrayList) obj;
                                    bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                                } else {
                                    bundleArr = null;
                                }
                            }
                            if (bundleArr != null) {
                                s7.putParcelableArray(str7, bundleArr);
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        i9++;
                        arrayList3 = arrayList;
                    }
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        Bundle bundle3 = (Bundle) arrayList2.get(i10);
                        if (i10 != 0) {
                            str4 = "_ep";
                        } else {
                            str4 = str2;
                        }
                        bundle3.putString("_o", str5);
                        if (z4) {
                            bundle3 = y12.A0(bundle3);
                        }
                        Bundle bundle4 = bundle3;
                        Y1 y13 = y12;
                        E1 e15 = e13;
                        C0214v vVar = r1;
                        C0214v vVar2 = new C0214v(str4, new C0211u(bundle4), str, j6);
                        C0219w1 r6 = u0Var.r();
                        r6.getClass();
                        r6.o();
                        r6.p();
                        r6.G();
                        Q o6 = ((C0212u0) r6.f398a).o();
                        o6.getClass();
                        Parcel obtain = Parcel.obtain();
                        w.a(vVar, obtain, 0);
                        byte[] marshall = obtain.marshall();
                        obtain.recycle();
                        if (marshall.length > 131072) {
                            Z z19 = ((C0212u0) o6.f398a).f3496r;
                            C0212u0.k(z19);
                            z19.f3173p.a("Event is too long for local database. Sending event directly to service");
                            z11 = true;
                            z10 = false;
                        } else {
                            z10 = o6.v(marshall, 0);
                            z11 = true;
                        }
                        r6.F(new C0204r1(r6, r6.C(z11), z10, vVar, 1));
                        if (!z8) {
                            Iterator it2 = this.f3245e.iterator();
                            while (it2.hasNext()) {
                                ((V1) ((M0) it2.next())).a(str, str2, new Bundle(bundle4), j6);
                            }
                        }
                        i10++;
                        e13 = e15;
                        y12 = y13;
                    }
                    E1 e16 = e13;
                    C0212u0.j(m1Var);
                    if (m1Var.v(false) != null) {
                        if (str3.equals(str2)) {
                            C0212u0.j(e16);
                            bVar.getClass();
                            e16.f2828f.a(true, true, SystemClock.elapsedRealtime());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C0212u0.k(z13);
            z13.f3179v.c("Dropping non-safelisted event. event name, origin", str6, str5);
            return;
        }
        Z z20 = z13;
        C0212u0.k(z20);
        z20.f3179v.a("Event not sent since app measurement is disabled");
    }

    public final void C() {
        I1 i12;
        o();
        this.f3254w = false;
        if (!M().isEmpty() && !this.f3249r && (i12 = (I1) M().poll()) != null) {
            C0212u0 u0Var = (C0212u0) this.f398a;
            Y1 y12 = u0Var.f3499u;
            C0212u0.i(y12);
            C0581d t6 = y12.t();
            if (t6 != null) {
                this.f3249r = true;
                Z z3 = u0Var.f3496r;
                C0212u0.k(z3);
                X x6 = z3.f3180w;
                String str = i12.f2966a;
                x6.b(str, "Registering trigger URI");
                B2.b e6 = t6.e(Uri.parse(str));
                if (e6 == null) {
                    this.f3249r = false;
                    M().add(i12);
                    return;
                }
                e6.a(new a((Object) e6, (Object) new h((Object) this, (Object) i12, 24), 0), new g(this, 2));
            }
        }
    }

    public final void D(Bundle bundle, long j6) {
        I.g(bundle);
        Bundle bundle2 = new Bundle(bundle);
        boolean isEmpty = TextUtils.isEmpty(bundle2.getString("app_id"));
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (!isEmpty) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3175r.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Class<String> cls = String.class;
        K0.a(bundle2, "app_id", cls, (Object) null);
        K0.a(bundle2, "origin", cls, (Object) null);
        K0.a(bundle2, "name", cls, (Object) null);
        K0.a(bundle2, "value", Object.class, (Object) null);
        K0.a(bundle2, "trigger_event_name", cls, (Object) null);
        Class<Long> cls2 = Long.class;
        K0.a(bundle2, "trigger_timeout", cls2, 0L);
        K0.a(bundle2, "timed_out_event_name", cls, (Object) null);
        Class<Bundle> cls3 = Bundle.class;
        K0.a(bundle2, "timed_out_event_params", cls3, (Object) null);
        K0.a(bundle2, "triggered_event_name", cls, (Object) null);
        K0.a(bundle2, "triggered_event_params", cls3, (Object) null);
        K0.a(bundle2, "time_to_live", cls2, 0L);
        K0.a(bundle2, "expired_event_name", cls, (Object) null);
        K0.a(bundle2, "expired_event_params", cls3, (Object) null);
        I.d(bundle2.getString("name"));
        I.d(bundle2.getString("origin"));
        I.g(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j6);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        Y1 y12 = u0Var.f3499u;
        C0212u0.i(y12);
        int u02 = y12.u0(string);
        S s6 = u0Var.f3500v;
        Z z4 = u0Var.f3496r;
        if (u02 == 0) {
            Y1 y13 = u0Var.f3499u;
            C0212u0.i(y13);
            if (y13.q0(obj, string) == 0) {
                Object w6 = y13.w(obj, string);
                if (w6 == null) {
                    C0212u0.k(z4);
                    z4.f3172f.c("Unable to normalize conditional user property value", s6.f(string), obj);
                    return;
                }
                K0.g(bundle2, w6);
                long j7 = bundle2.getLong("trigger_timeout");
                if (TextUtils.isEmpty(bundle2.getString("trigger_event_name")) || (j7 <= 15552000000L && j7 >= 1)) {
                    long j8 = bundle2.getLong("time_to_live");
                    if (j8 > 15552000000L || j8 < 1) {
                        C0212u0.k(z4);
                        z4.f3172f.c("Invalid conditional user property time to live", s6.f(string), Long.valueOf(j8));
                        return;
                    }
                    C0203r0 r0Var = u0Var.f3497s;
                    C0212u0.k(r0Var);
                    r0Var.y(new R0(this, bundle2, 1));
                    return;
                }
                C0212u0.k(z4);
                z4.f3172f.c("Invalid conditional user property timeout", s6.f(string), Long.valueOf(j7));
                return;
            }
            C0212u0.k(z4);
            z4.f3172f.c("Invalid conditional user property value", s6.f(string), obj);
            return;
        }
        C0212u0.k(z4);
        z4.f3172f.b(s6.f(string), "Invalid conditional user property name");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(android.os.Bundle r9, int r10, long r11) {
        /*
            r8 = this;
            r8.p()
            T1.J0 r0 = T1.J0.f2969c
            T1.H0 r0 = T1.H0.STORAGE
            T1.I0[] r0 = r0.f2959a
            int r1 = r0.length
            r2 = 0
        L_0x000b:
            r3 = 0
            if (r2 >= r1) goto L_0x003a
            r4 = r0[r2]
            java.lang.String r4 = r4.f2965a
            boolean r5 = r9.containsKey(r4)
            if (r5 == 0) goto L_0x0037
            java.lang.String r4 = r9.getString(r4)
            if (r4 == 0) goto L_0x0037
            java.lang.String r5 = "granted"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0029
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x0033
        L_0x0029:
            java.lang.String r5 = "denied"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0033
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        L_0x0033:
            if (r3 != 0) goto L_0x0037
            r3 = r4
            goto L_0x003a
        L_0x0037:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x003a:
            java.lang.Object r0 = r8.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            if (r3 == 0) goto L_0x0058
            T1.Z r1 = r0.f3496r
            T1.C0212u0.k(r1)
            java.lang.String r2 = "Ignoring invalid consent setting"
            T1.X r1 = r1.f3177t
            r1.b(r3, r2)
            T1.Z r1 = r0.f3496r
            T1.C0212u0.k(r1)
            java.lang.String r2 = "Valid consent values are 'granted', 'denied'"
            T1.X r1 = r1.f3177t
            r1.a(r2)
        L_0x0058:
            T1.r0 r0 = r0.f3497s
            T1.C0212u0.k(r0)
            boolean r0 = r0.A()
            T1.J0 r1 = T1.J0.d(r10, r9)
            java.util.EnumMap r2 = r1.f2970a
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x006f:
            boolean r3 = r2.hasNext()
            T1.G0 r4 = T1.G0.UNINITIALIZED
            if (r3 == 0) goto L_0x0082
            java.lang.Object r3 = r2.next()
            T1.G0 r3 = (T1.G0) r3
            if (r3 == r4) goto L_0x006f
            r8.H(r1, r0)
        L_0x0082:
            T1.p r1 = T1.C0197p.a(r10, r9)
            java.util.EnumMap r2 = r1.f3428e
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0090:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00a1
            java.lang.Object r3 = r2.next()
            T1.G0 r3 = (T1.G0) r3
            if (r3 == r4) goto L_0x0090
            r8.F(r1, r0)
        L_0x00a1:
            java.lang.Boolean r9 = T1.C0197p.d(r9)
            if (r9 == 0) goto L_0x00cc
            r1 = -30
            if (r10 != r1) goto L_0x00ae
            java.lang.String r10 = "tcf"
            goto L_0x00b0
        L_0x00ae:
            java.lang.String r10 = "app"
        L_0x00b0:
            if (r0 == 0) goto L_0x00bf
            java.lang.String r4 = r9.toString()
            java.lang.String r6 = "allow_personalized_ads"
            r1 = r8
            r2 = r11
            r5 = r10
            r1.J(r2, r4, r5, r6)
            return
        L_0x00bf:
            java.lang.String r4 = r9.toString()
            java.lang.String r3 = "allow_personalized_ads"
            r5 = 0
            r1 = r8
            r2 = r10
            r6 = r11
            r1.I(r2, r3, r4, r5, r6)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0157b1.E(android.os.Bundle, int, long):void");
    }

    public final void F(C0197p pVar, boolean z3) {
        a aVar = new a(this, pVar, 15, false);
        if (z3) {
            o();
            aVar.run();
            return;
        }
        C0203r0 r0Var = ((C0212u0) this.f398a).f3497s;
        C0212u0.k(r0Var);
        r0Var.y(aVar);
    }

    public final void G(J0 j02) {
        boolean z3;
        Boolean bool;
        o();
        if ((!j02.k(I0.ANALYTICS_STORAGE) || !j02.k(I0.AD_STORAGE)) && !((C0212u0) this.f398a).r().z()) {
            z3 = false;
        } else {
            z3 = true;
        }
        C0212u0 u0Var = (C0212u0) this.f398a;
        C0203r0 r0Var = u0Var.f3497s;
        C0212u0.k(r0Var);
        r0Var.o();
        if (z3 != u0Var.f3484L) {
            C0203r0 r0Var2 = u0Var.f3497s;
            C0212u0.k(r0Var2);
            r0Var2.o();
            u0Var.f3484L = z3;
            C0174h0 h0Var = ((C0212u0) this.f398a).f3495q;
            C0212u0.i(h0Var);
            h0Var.o();
            if (h0Var.t().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(h0Var.t().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z3 || bool == null || bool.booleanValue()) {
                K(Boolean.valueOf(z3), false);
            }
        }
    }

    public final void H(J0 j02, boolean z3) {
        boolean z4;
        boolean z5;
        J0 j03;
        boolean z6;
        p();
        int i2 = j02.f2971b;
        if (i2 != -10) {
            G0 g02 = (G0) j02.f2970a.get(I0.AD_STORAGE);
            if (g02 == null) {
                g02 = G0.UNINITIALIZED;
            }
            G0 g03 = G0.UNINITIALIZED;
            if (g02 == g03) {
                G0 g04 = (G0) j02.f2970a.get(I0.ANALYTICS_STORAGE);
                if (g04 == null) {
                    g04 = g03;
                }
                if (g04 == g03) {
                    Z z7 = ((C0212u0) this.f398a).f3496r;
                    C0212u0.k(z7);
                    z7.f3177t.a("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.f3248q) {
            try {
                z4 = false;
                if (J0.l(i2, this.f3255x.f2971b)) {
                    J0 j04 = this.f3255x;
                    EnumMap enumMap = j02.f2970a;
                    I0[] i0Arr = (I0[]) enumMap.keySet().toArray(new I0[0]);
                    int length = i0Arr.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            z6 = false;
                            break;
                        }
                        I0 i02 = i0Arr[i5];
                        G0 g05 = (G0) enumMap.get(i02);
                        G0 g06 = (G0) j04.f2970a.get(i02);
                        G0 g07 = G0.DENIED;
                        if (g05 == g07 && g06 != g07) {
                            z6 = true;
                            break;
                        }
                        i5++;
                    }
                    I0 i03 = I0.ANALYTICS_STORAGE;
                    if (j02.k(i03) && !this.f3255x.k(i03)) {
                        z4 = true;
                    }
                    J0 g = j02.g(this.f3255x);
                    this.f3255x = g;
                    j03 = g;
                    z5 = z4;
                    z4 = true;
                } else {
                    j03 = j02;
                    z6 = false;
                    z5 = false;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (!z4) {
            Z z8 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z8);
            z8.f3178u.b(j03, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f3256y.getAndIncrement();
        if (z6) {
            this.f3247p.set((Object) null);
            C0154a1 a1Var = new C0154a1(this, j03, andIncrement, z5, 0);
            if (z3) {
                o();
                a1Var.run();
                return;
            }
            C0203r0 r0Var = ((C0212u0) this.f398a).f3497s;
            C0212u0.k(r0Var);
            r0Var.z(a1Var);
            return;
        }
        C0154a1 a1Var2 = new C0154a1(this, j03, andIncrement, z5, 1);
        if (z3) {
            o();
            a1Var2.run();
        } else if (i2 == 30 || i2 == -10) {
            C0203r0 r0Var2 = ((C0212u0) this.f398a).f3497s;
            C0212u0.k(r0Var2);
            r0Var2.z(a1Var2);
        } else {
            C0203r0 r0Var3 = ((C0212u0) this.f398a).f3497s;
            C0212u0.k(r0Var3);
            r0Var3.y(a1Var2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(java.lang.String r13, java.lang.String r14, java.lang.Object r15, boolean r16, long r17) {
        /*
            r12 = this;
            r8 = r12
            r3 = r14
            r0 = r15
            r1 = 0
            r2 = 24
            java.lang.Object r4 = r8.f398a
            T1.u0 r4 = (T1.C0212u0) r4
            if (r16 == 0) goto L_0x0017
            T1.Y1 r5 = r4.f3499u
            T1.C0212u0.i(r5)
            int r5 = r5.u0(r14)
        L_0x0015:
            r9 = r5
            goto L_0x0041
        L_0x0017:
            T1.Y1 r5 = r4.f3499u
            T1.C0212u0.i(r5)
            java.lang.String r6 = "user property"
            boolean r7 = r5.c0(r6, r14)
            r9 = 6
            if (r7 != 0) goto L_0x0026
            goto L_0x0041
        L_0x0026:
            java.lang.String[] r7 = T1.K0.f2979i
            r10 = 0
            boolean r7 = r5.Z(r6, r7, r10, r14)
            if (r7 != 0) goto L_0x0032
            r5 = 15
            goto L_0x0015
        L_0x0032:
            java.lang.Object r7 = r5.f398a
            T1.u0 r7 = (T1.C0212u0) r7
            r7.getClass()
            boolean r5 = r5.Y(r2, r6, r14)
            if (r5 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r9 = r1
        L_0x0041:
            T1.A r5 = r8.F
            r6 = 1
            if (r9 == 0) goto L_0x006a
            T1.Y1 r0 = r4.f3499u
            T1.C0212u0.i(r0)
            java.lang.String r0 = T1.Y1.y(r14, r2, r6)
            if (r3 == 0) goto L_0x0055
            int r1 = r14.length()
        L_0x0055:
            T1.Y1 r2 = r4.f3499u
            T1.C0212u0.i(r2)
            r2 = 0
            java.lang.String r3 = "_ev"
            r13 = r5
            r14 = r2
            r15 = r9
            r16 = r3
            r17 = r0
            r18 = r1
            T1.Y1.I(r13, r14, r15, r16, r17, r18)
            return
        L_0x006a:
            if (r13 != 0) goto L_0x006f
            java.lang.String r7 = "app"
            goto L_0x0070
        L_0x006f:
            r7 = r13
        L_0x0070:
            if (r0 == 0) goto L_0x00c9
            T1.Y1 r9 = r4.f3499u
            T1.C0212u0.i(r9)
            int r9 = r9.q0(r15, r14)
            T1.Y1 r10 = r4.f3499u
            if (r9 == 0) goto L_0x00a9
            T1.C0212u0.i(r10)
            java.lang.String r2 = T1.Y1.y(r14, r2, r6)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 != 0) goto L_0x008e
            boolean r3 = r0 instanceof java.lang.CharSequence
            if (r3 == 0) goto L_0x0096
        L_0x008e:
            java.lang.String r0 = r15.toString()
            int r1 = r0.length()
        L_0x0096:
            T1.C0212u0.i(r10)
            r0 = 0
            java.lang.String r3 = "_ev"
            r13 = r5
            r14 = r0
            r15 = r9
            r16 = r3
            r17 = r2
            r18 = r1
            T1.Y1.I(r13, r14, r15, r16, r17, r18)
            return
        L_0x00a9:
            T1.C0212u0.i(r10)
            java.lang.Object r5 = r10.w(r15, r14)
            if (r5 == 0) goto L_0x00c8
            T1.r0 r9 = r4.f3497s
            T1.C0212u0.k(r9)
            T1.z0 r10 = new T1.z0
            r11 = 1
            r0 = r10
            r1 = r12
            r2 = r7
            r3 = r14
            r4 = r5
            r5 = r17
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r9.y(r10)
        L_0x00c8:
            return
        L_0x00c9:
            T1.r0 r9 = r4.f3497s
            T1.C0212u0.k(r9)
            T1.z0 r10 = new T1.z0
            r4 = 0
            r11 = 1
            r0 = r10
            r1 = r12
            r2 = r7
            r3 = r14
            r5 = r17
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r9.y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0157b1.I(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    public final void J(long j6, Object obj, String str, String str2) {
        String str3;
        Object obj2;
        boolean v6;
        long j7;
        Object obj3 = obj;
        I.d(str);
        I.d(str2);
        o();
        p();
        String str4 = str2;
        boolean equals = "allow_personalized_ads".equals(str4);
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (equals) {
            String str5 = "_npa";
            if (obj3 instanceof String) {
                String str6 = (String) obj3;
                if (!TextUtils.isEmpty(str6)) {
                    String lowerCase = str6.toLowerCase(Locale.ENGLISH);
                    String str7 = "false";
                    if (true != str7.equals(lowerCase)) {
                        j7 = 0;
                    } else {
                        j7 = 1;
                    }
                    obj3 = Long.valueOf(j7);
                    C0174h0 h0Var = u0Var.f3495q;
                    C0212u0.i(h0Var);
                    if (j7 == 1) {
                        str7 = "true";
                    }
                    h0Var.f3329w.D(str7);
                    Z z3 = u0Var.f3496r;
                    C0212u0.k(z3);
                    z3.f3180w.c("Setting user property(FE)", "non_personalized_ads(_npa)", obj3);
                    obj2 = obj3;
                    str3 = str5;
                }
            }
            if (obj3 == null) {
                C0174h0 h0Var2 = u0Var.f3495q;
                C0212u0.i(h0Var2);
                h0Var2.f3329w.D("unset");
            } else {
                str5 = str4;
            }
            Z z32 = u0Var.f3496r;
            C0212u0.k(z32);
            z32.f3180w.c("Setting user property(FE)", "non_personalized_ads(_npa)", obj3);
            obj2 = obj3;
            str3 = str5;
        } else {
            obj2 = obj3;
            str3 = str4;
        }
        if (!u0Var.a()) {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3180w.a("User property not set since app measurement is disabled");
        } else if (u0Var.e()) {
            W1 w12 = new W1(j6, obj2, str3, str);
            C0219w1 r6 = u0Var.r();
            r6.o();
            r6.p();
            r6.G();
            Q o6 = ((C0212u0) r6.f398a).o();
            o6.getClass();
            Parcel obtain = Parcel.obtain();
            w.b(w12, obtain);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                Z z5 = ((C0212u0) o6.f398a).f3496r;
                C0212u0.k(z5);
                z5.f3173p.a("User property too long for local database. Sending directly to service");
                v6 = false;
            } else {
                v6 = o6.v(marshall, 1);
            }
            r6.F(new C0204r1(r6, r6.C(true), v6, w12, 0));
        }
    }

    public final void K(Boolean bool, boolean z3) {
        o();
        p();
        C0212u0 u0Var = (C0212u0) this.f398a;
        Z z4 = u0Var.f3496r;
        C0212u0.k(z4);
        z4.f3179v.b(bool, "Setting app measurement enabled (FE)");
        C0174h0 h0Var = u0Var.f3495q;
        C0212u0.i(h0Var);
        h0Var.o();
        SharedPreferences.Editor edit = h0Var.t().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z3) {
            h0Var.o();
            SharedPreferences.Editor edit2 = h0Var.t().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        C0203r0 r0Var = u0Var.f3497s;
        C0212u0.k(r0Var);
        r0Var.o();
        if (u0Var.f3484L || (bool != null && !bool.booleanValue())) {
            L();
        }
    }

    public final void L() {
        long j6;
        o();
        C0212u0 u0Var = (C0212u0) this.f398a;
        C0174h0 h0Var = u0Var.f3495q;
        C0212u0.i(h0Var);
        String C6 = h0Var.f3329w.C();
        if (C6 != null) {
            boolean equals = "unset".equals(C6);
            b bVar = u0Var.f3501w;
            if (equals) {
                bVar.getClass();
                J(System.currentTimeMillis(), (Object) null, "app", "_npa");
            } else {
                if (true != "true".equals(C6)) {
                    j6 = 0;
                } else {
                    j6 = 1;
                }
                Long valueOf = Long.valueOf(j6);
                bVar.getClass();
                J(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        boolean a6 = u0Var.a();
        Z z3 = u0Var.f3496r;
        if (!a6 || !this.f3240B) {
            C0212u0.k(z3);
            z3.f3179v.a("Updating Scion state (FE)");
            C0219w1 r6 = u0Var.r();
            r6.o();
            r6.p();
            r6.F(new C0207s1(r6, r6.C(true), 3));
            return;
        }
        C0212u0.k(z3);
        z3.f3179v.a("Recording app launch after enabling measurement for the first time (FE)");
        t();
        E1 e12 = u0Var.f3498t;
        C0212u0.j(e12);
        e12.f2827e.t();
        C0203r0 r0Var = u0Var.f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new T0(this, 2));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, java.util.function.Function] */
    public final PriorityQueue M() {
        if (this.f3253v == null) {
            this.f3253v = new PriorityQueue(Comparator.comparing(new Object(), new i(4)));
        }
        return this.f3253v;
    }

    public final boolean r() {
        return false;
    }

    public final void t() {
        o();
        p();
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (u0Var.e()) {
            C0170g gVar = u0Var.f3494p;
            ((C0212u0) gVar.f398a).getClass();
            Boolean z3 = gVar.z("google_analytics_deferred_deep_link_enabled");
            if (z3 != null && z3.booleanValue()) {
                Z z4 = u0Var.f3496r;
                C0212u0.k(z4);
                z4.f3179v.a("Deferred Deep Link feature enabled.");
                C0203r0 r0Var = u0Var.f3497s;
                C0212u0.k(r0Var);
                r0Var.y(new T0(this, 0));
            }
            C0219w1 r6 = u0Var.r();
            r6.o();
            r6.p();
            Z1 C6 = r6.C(true);
            r6.G();
            C0212u0 u0Var2 = (C0212u0) r6.f398a;
            u0Var2.f3494p.B((String) null, H.f2923l1);
            u0Var2.o().v(new byte[0], 3);
            r6.F(new C0207s1(r6, C6, 1));
            this.f3240B = false;
            C0174h0 h0Var = u0Var.f3495q;
            C0212u0.i(h0Var);
            h0Var.o();
            String string = h0Var.t().getString("previous_os_version", (String) null);
            ((C0212u0) h0Var.f398a).m().q();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = h0Var.t().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                u0Var.m().q();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    z("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void u(String str, String str2, Bundle bundle) {
        C0212u0 u0Var = (C0212u0) this.f398a;
        u0Var.f3501w.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        I.d(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        C0203r0 r0Var = u0Var.f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new R0(this, bundle2, 2));
    }

    public final void v() {
        C0212u0 u0Var = (C0212u0) this.f398a;
        if ((u0Var.f3489a.getApplicationContext() instanceof Application) && this.f3244c != null) {
            ((Application) u0Var.f3489a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f3244c);
        }
    }

    public final void w() {
        zzqr.zzb();
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (u0Var.f3494p.B((String) null, H.f2886W0)) {
            C0203r0 r0Var = u0Var.f3497s;
            C0212u0.k(r0Var);
            boolean A6 = r0Var.A();
            Z z3 = u0Var.f3496r;
            if (A6) {
                C0212u0.k(z3);
                z3.f3172f.a("Cannot get trigger URIs from analytics worker thread");
            } else if (!e.n()) {
                p();
                C0212u0.k(z3);
                z3.f3180w.a("Getting trigger URIs (FE)");
                AtomicReference atomicReference = new AtomicReference();
                C0212u0.k(r0Var);
                r0Var.t(atomicReference, 10000, "get trigger URIs", new P0(this, atomicReference, 0));
                List list = (List) atomicReference.get();
                if (list == null) {
                    C0212u0.k(z3);
                    z3.f3172f.a("Timed out waiting for get trigger URIs");
                    return;
                }
                C0212u0.k(r0Var);
                r0Var.y(new a((Object) this, (Object) list, 12));
            } else {
                C0212u0.k(z3);
                z3.f3172f.a("Cannot get trigger URIs from main thread");
            }
        }
    }

    public final void x() {
        Object obj;
        F1 f12;
        String str;
        C0212u0 u0Var;
        F1 f13;
        int i2;
        C0157b1 b1Var;
        String str2;
        String str3;
        int i5;
        String str4;
        r rVar;
        boolean z3;
        boolean z4;
        Object obj2;
        boolean z5;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        F1 f14;
        zzkm zzkm;
        o();
        C0212u0 u0Var2 = (C0212u0) this.f398a;
        Z z6 = u0Var2.f3496r;
        C0212u0.k(z6);
        z6.f3179v.a("Handle tcf update.");
        C0174h0 h0Var = u0Var2.f3495q;
        C0212u0.i(h0Var);
        SharedPreferences s6 = h0Var.s();
        HashMap hashMap = new HashMap();
        G g = H.f2917j1;
        C0174h0 h0Var2 = h0Var;
        G g5 = g;
        C0212u0 u0Var3 = u0Var2;
        if (((Boolean) g.a((Object) null)).booleanValue()) {
            A2.i iVar = H1.f2960a;
            zzkl zzkl = zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            G1 g1 = G1.f2841a;
            AbstractMap.SimpleImmutableEntry c3 = Objects.requireNonNull(zzkl);
            zzkl zzkl2 = zzkl.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            String str5 = "";
            G1 g12 = G1.f2842b;
            Object obj11 = "CmpSdkID";
            Object obj12 = "PolicyVersion";
            Object obj13 = "EnableAdvertiserConsentMode";
            Object obj14 = "gdprApplies";
            List asList = Arrays.asList(new Map.Entry[]{c3, Objects.requireNonNull(zzkl2), Objects.requireNonNull(zzkl.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE), Objects.requireNonNull(zzkl.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS), Objects.requireNonNull(zzkl.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE), Objects.requireNonNull(zzkl.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS), Objects.requireNonNull(zzkl.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS)});
            if (asList != null) {
                i5 = asList.size();
            } else {
                i5 = 4;
            }
            A2.f fVar = new A2.f(i5);
            fVar.v(asList);
            n g6 = fVar.g();
            int i10 = A2.g.f31c;
            r rVar2 = new r("CH");
            char[] cArr = new char[5];
            int a6 = H1.a(s6, "IABTCF_CmpSdkID");
            int a7 = H1.a(s6, "IABTCF_PolicyVersion");
            int a8 = H1.a(s6, "IABTCF_gdprApplies");
            int a9 = H1.a(s6, "IABTCF_PurposeOneTreatment");
            int a10 = H1.a(s6, "IABTCF_EnableAdvertiserConsentMode");
            String b6 = H1.b(s6, "IABTCF_PublisherCC");
            A2.f fVar2 = new A2.f(4);
            l lVar = g6.f45b;
            if (lVar == null) {
                rVar = rVar2;
                str4 = b6;
                l lVar2 = new l(g6, new A2.m(g6.f47e, 0, g6.f48f));
                g6.f45b = lVar2;
                lVar = lVar2;
            } else {
                rVar = rVar2;
                str4 = b6;
            }
            s B6 = lVar.iterator();
            while (B6.hasNext()) {
                zzkl zzkl3 = (zzkl) B6.next();
                int zza = zzkl3.zza();
                s sVar = B6;
                String b7 = H1.b(s6, "IABTCF_PublisherRestrictions" + zza);
                if (TextUtils.isEmpty(b7) || b7.length() < 755) {
                    zzkm = zzkm.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int digit = Character.digit(b7.charAt(754), 10);
                    if (digit < 0 || digit > zzkm.values().length || digit == 0) {
                        zzkm = zzkm.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    } else if (digit == 1) {
                        zzkm = zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    } else if (digit != 2) {
                        zzkm = zzkm.PURPOSE_RESTRICTION_UNDEFINED;
                    } else {
                        zzkm = zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    }
                }
                fVar2.t(zzkl3, zzkm);
                B6 = sVar;
            }
            n g7 = fVar2.g();
            String b8 = H1.b(s6, "IABTCF_PurposeConsents");
            String b9 = H1.b(s6, "IABTCF_VendorConsents");
            if (TextUtils.isEmpty(b9) || b9.length() < 755 || b9.charAt(754) != '1') {
                z3 = false;
            } else {
                z3 = true;
            }
            String b10 = H1.b(s6, "IABTCF_PurposeLegitimateInterests");
            String b11 = H1.b(s6, "IABTCF_VendorLegitimateInterests");
            if (TextUtils.isEmpty(b11) || b11.length() < 755 || b11.charAt(754) != '1') {
                z4 = false;
            } else {
                z4 = true;
            }
            cArr[0] = '2';
            zzkl zzkl4 = zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            zzkm zzkm2 = (zzkm) g7.get(zzkl4);
            zzkl zzkl5 = zzkl.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            zzkm zzkm3 = (zzkm) g7.get(zzkl5);
            char[] cArr2 = cArr;
            zzkl zzkl6 = zzkl.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            zzkm zzkm4 = (zzkm) g7.get(zzkl6);
            n nVar = g6;
            zzkl zzkl7 = zzkl.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            zzkm zzkm5 = (zzkm) g7.get(zzkl7);
            n nVar2 = g7;
            zzkl zzkl8 = zzkl7;
            A2.f fVar3 = new A2.f(4);
            fVar3.t("Version", "2");
            if (true != z3) {
                obj = "Version";
                obj2 = "0";
            } else {
                obj = "Version";
                obj2 = "1";
            }
            fVar3.t("VendorConsent", obj2);
            if (true != z4) {
                z5 = z4;
                obj3 = "0";
            } else {
                z5 = z4;
                obj3 = "1";
            }
            fVar3.t("VendorLegitimateInterest", obj3);
            if (a8 != 1) {
                obj4 = "0";
            } else {
                obj4 = "1";
            }
            fVar3.t(obj14, obj4);
            if (a10 != 1) {
                obj5 = "0";
            } else {
                obj5 = "1";
            }
            fVar3.t(obj13, obj5);
            fVar3.t(obj12, String.valueOf(a7));
            fVar3.t(obj11, String.valueOf(a6));
            if (a9 != 1) {
                obj6 = "0";
            } else {
                obj6 = "1";
            }
            fVar3.t("PurposeOneTreatment", obj6);
            String str6 = str4;
            fVar3.t("PublisherCC", str6);
            if (zzkm2 != null) {
                i6 = zzkm2.zza();
            } else {
                i6 = zzkm.PURPOSE_RESTRICTION_UNDEFINED.zza();
            }
            fVar3.t("PublisherRestrictions1", String.valueOf(i6));
            if (zzkm3 != null) {
                i7 = zzkm3.zza();
            } else {
                i7 = zzkm.PURPOSE_RESTRICTION_UNDEFINED.zza();
            }
            fVar3.t("PublisherRestrictions3", String.valueOf(i7));
            if (zzkm4 != null) {
                i8 = zzkm4.zza();
            } else {
                i8 = zzkm.PURPOSE_RESTRICTION_UNDEFINED.zza();
            }
            fVar3.t("PublisherRestrictions4", String.valueOf(i8));
            if (zzkm5 != null) {
                i9 = zzkm5.zza();
            } else {
                i9 = zzkm.PURPOSE_RESTRICTION_UNDEFINED.zza();
            }
            fVar3.t("PublisherRestrictions7", String.valueOf(i9));
            String f6 = H1.f(zzkl4, b8, b10);
            String f7 = H1.f(zzkl5, b8, b10);
            String f8 = H1.f(zzkl6, b8, b10);
            zzkl zzkl9 = zzkl6;
            zzkl zzkl10 = zzkl8;
            zzkl zzkl11 = zzkl5;
            String f9 = H1.f(zzkl10, b8, b10);
            zzkl zzkl12 = zzkl10;
            d.c("Purpose1", f6);
            boolean z7 = z3;
            d.c("Purpose3", f7);
            String str7 = b10;
            d.c("Purpose4", f8);
            String str8 = b8;
            d.c("Purpose7", f9);
            fVar3.v(n.a(4, new Object[]{"Purpose1", f6, "Purpose3", f7, "Purpose4", f8, "Purpose7", f9}, (A2.f) null).entrySet());
            if (true != H1.c(zzkl4, nVar, nVar2, rVar, cArr2, a6, a10, a8, a7, a9, str6, str8, str7, z7, z5)) {
                obj7 = "0";
            } else {
                obj7 = "1";
            }
            if (true != H1.c(zzkl11, nVar, nVar2, rVar, cArr2, a6, a10, a8, a7, a9, str6, str8, str7, z7, z5)) {
                obj8 = "0";
            } else {
                obj8 = "1";
            }
            if (true != H1.c(zzkl9, nVar, nVar2, rVar, cArr2, a6, a10, a8, a7, a9, str6, str8, str7, z7, z5)) {
                obj9 = "0";
            } else {
                obj9 = "1";
            }
            if (true != H1.c(zzkl12, nVar, nVar2, rVar, cArr2, a6, a10, a8, a7, a9, str6, str8, str7, z7, z5)) {
                obj10 = "0";
            } else {
                obj10 = "1";
            }
            fVar3.v(n.a(5, new Object[]{"AuthorizePurpose1", obj7, "AuthorizePurpose3", obj8, "AuthorizePurpose4", obj9, "AuthorizePurpose7", obj10, "PurposeDiagnostics", new String(cArr2)}, (A2.f) null).entrySet());
            f14 = new F1(fVar3.g());
            f12 = f14;
            u0Var = u0Var3;
            str = str5;
        } else {
            obj = "Version";
            Object obj15 = "gdprApplies";
            Object obj16 = "CmpSdkID";
            Object obj17 = "PolicyVersion";
            Object obj18 = "EnableAdvertiserConsentMode";
            String b12 = H1.b(s6, "IABTCF_VendorConsents");
            str = "";
            if (!str.equals(b12) && b12.length() > 754) {
                hashMap.put("GoogleConsent", String.valueOf(b12.charAt(754)));
            }
            int a11 = H1.a(s6, "IABTCF_gdprApplies");
            if (a11 != -1) {
                hashMap.put(obj15, String.valueOf(a11));
            }
            int a12 = H1.a(s6, "IABTCF_EnableAdvertiserConsentMode");
            if (a12 != -1) {
                hashMap.put(obj18, String.valueOf(a12));
            }
            int a13 = H1.a(s6, "IABTCF_PolicyVersion");
            if (a13 != -1) {
                hashMap.put(obj17, String.valueOf(a13));
            }
            String b13 = H1.b(s6, "IABTCF_PurposeConsents");
            if (!str.equals(b13)) {
                hashMap.put("PurposeConsents", b13);
            }
            int a14 = H1.a(s6, "IABTCF_CmpSdkID");
            if (a14 != -1) {
                hashMap.put(obj16, String.valueOf(a14));
            }
            f12 = new F1(hashMap);
            u0Var = u0Var3;
        }
        Z z8 = u0Var.f3496r;
        C0212u0.k(z8);
        X x6 = z8.f3180w;
        x6.b(f12, "Tcf preferences read");
        boolean B7 = u0Var.f3494p.B((String) null, g5);
        b bVar = u0Var.f3501w;
        if (B7) {
            h0Var2.o();
            String string = h0Var2.t().getString("stored_tcf_param", str);
            HashMap hashMap2 = new HashMap();
            if (TextUtils.isEmpty(string)) {
                f13 = new F1(hashMap2);
            } else {
                String[] split = string.split(";");
                int length = split.length;
                int i11 = 0;
                while (i11 < length) {
                    String[] split2 = split[i11].split("=");
                    if (split2.length < 2) {
                        i2 = 1;
                    } else if (H1.f2960a.contains(split2[0])) {
                        i2 = 1;
                        hashMap2.put(split2[0], split2[1]);
                    } else {
                        i2 = 1;
                    }
                    i11 += i2;
                }
                f13 = new F1(hashMap2);
            }
            if (h0Var2.y(f12)) {
                Bundle a15 = f12.a();
                C0212u0.k(z8);
                x6.b(a15, "Consent generated from Tcf");
                if (a15 != Bundle.EMPTY) {
                    bVar.getClass();
                    b1Var = this;
                    b1Var.E(a15, -30, System.currentTimeMillis());
                } else {
                    b1Var = this;
                }
                Bundle bundle = new Bundle();
                HashMap hashMap3 = f13.f2830a;
                if (hashMap3.isEmpty() || ((String) hashMap3.get(obj)) != null) {
                    str2 = "0";
                } else {
                    str2 = "1";
                }
                Bundle a16 = f12.a();
                Bundle a17 = f13.a();
                if (a16.size() == a17.size() && Objects.equals(a16.getString("ad_storage"), a17.getString("ad_storage")) && Objects.equals(a16.getString("ad_personalization"), a17.getString("ad_personalization")) && Objects.equals(a16.getString("ad_user_data"), a17.getString("ad_user_data"))) {
                    str3 = "0";
                } else {
                    str3 = "1";
                }
                bundle.putString("_tcfm", str2.concat(str3));
                String str9 = (String) f12.f2830a.get("PurposeDiagnostics");
                if (TextUtils.isEmpty(str9)) {
                    str9 = "200000";
                }
                bundle.putString("_tcfd2", str9);
                bundle.putString("_tcfd", f12.b());
                b1Var.z("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        if (h0Var2.y(f12)) {
            Bundle a18 = f12.a();
            C0212u0.k(z8);
            x6.b(a18, "Consent generated from Tcf");
            if (a18 != Bundle.EMPTY) {
                bVar.getClass();
                E(a18, -30, System.currentTimeMillis());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfd", f12.b());
            z("auto", "_tcf", bundle2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (r4 > 500) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (r6 > 500) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ef, code lost:
        r0 = (T1.C0212u0) r2.f398a;
        r1 = r0.f3496r;
        T1.C0212u0.k(r1);
        r1 = r1.f3180w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fa, code lost:
        if (r13 != null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fc, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ff, code lost:
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0100, code lost:
        if (r14 != null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0102, code lost:
        r5 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0105, code lost:
        r5 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0106, code lost:
        r1.c("Logging screen view with name, class", r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010d, code lost:
        if (r2.f3380c != null) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010f, code lost:
        r1 = r2.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0111, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0113, code lost:
        r1 = r2.f3380c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0116, code lost:
        r1 = r0.f3499u;
        T1.C0212u0.i(r1);
        r12 = new T1.C0181j1(r13, r14, r1.y0(), true, r26);
        r2.f3380c = r12;
        r2.d = r5;
        r2.f3385r = r12;
        r0.f3501w.getClass();
        r6 = android.os.SystemClock.elapsedRealtime();
        r0 = r0.f3497s;
        T1.C0212u0.k(r0);
        r0.y(new T1.C0227z0(r2, r3, r12, r5, r6, 2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, boolean r24, boolean r25, long r26) {
        /*
            r20 = this;
            r11 = r20
            if (r23 != 0) goto L_0x000b
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r3 = r0
            goto L_0x000d
        L_0x000b:
            r3 = r23
        L_0x000d:
            java.lang.String r0 = "screen_view"
            r4 = r22
            boolean r0 = java.util.Objects.equals(r4, r0)
            r1 = 0
            if (r0 == 0) goto L_0x014a
            java.lang.Object r0 = r11.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.m1 r2 = r0.f3502x
            T1.C0212u0.j(r2)
            java.lang.Object r5 = r2.f3388u
            monitor-enter(r5)
            boolean r0 = r2.f3387t     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x003e
            java.lang.Object r0 = r2.f398a     // Catch:{ all -> 0x003b }
            T1.u0 r0 = (T1.C0212u0) r0     // Catch:{ all -> 0x003b }
            T1.Z r0 = r0.f3496r     // Catch:{ all -> 0x003b }
            T1.C0212u0.k(r0)     // Catch:{ all -> 0x003b }
            T1.X r0 = r0.f3177t     // Catch:{ all -> 0x003b }
            java.lang.String r1 = "Cannot log screen view event when the app is in the background."
            r0.a(r1)     // Catch:{ all -> 0x003b }
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            goto L_0x0147
        L_0x003b:
            r0 = move-exception
            goto L_0x0148
        L_0x003e:
            java.lang.String r0 = "screen_name"
            java.lang.String r13 = r3.getString(r0)     // Catch:{ all -> 0x003b }
            r0 = 500(0x1f4, float:7.0E-43)
            if (r13 == 0) goto L_0x0078
            int r4 = r13.length()     // Catch:{ all -> 0x003b }
            if (r4 <= 0) goto L_0x005d
            int r4 = r13.length()     // Catch:{ all -> 0x003b }
            java.lang.Object r6 = r2.f398a     // Catch:{ all -> 0x003b }
            T1.u0 r6 = (T1.C0212u0) r6     // Catch:{ all -> 0x003b }
            T1.g r6 = r6.f3494p     // Catch:{ all -> 0x003b }
            r6.getClass()     // Catch:{ all -> 0x003b }
            if (r4 <= r0) goto L_0x0078
        L_0x005d:
            java.lang.Object r0 = r2.f398a     // Catch:{ all -> 0x003b }
            T1.u0 r0 = (T1.C0212u0) r0     // Catch:{ all -> 0x003b }
            T1.Z r0 = r0.f3496r     // Catch:{ all -> 0x003b }
            T1.C0212u0.k(r0)     // Catch:{ all -> 0x003b }
            T1.X r0 = r0.f3177t     // Catch:{ all -> 0x003b }
            java.lang.String r1 = "Invalid screen name length for screen view. Length"
            int r2 = r13.length()     // Catch:{ all -> 0x003b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003b }
            r0.b(r2, r1)     // Catch:{ all -> 0x003b }
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            goto L_0x0147
        L_0x0078:
            java.lang.String r4 = "screen_class"
            java.lang.String r4 = r3.getString(r4)     // Catch:{ all -> 0x003b }
            if (r4 == 0) goto L_0x00b0
            int r6 = r4.length()     // Catch:{ all -> 0x003b }
            if (r6 <= 0) goto L_0x0095
            int r6 = r4.length()     // Catch:{ all -> 0x003b }
            java.lang.Object r7 = r2.f398a     // Catch:{ all -> 0x003b }
            T1.u0 r7 = (T1.C0212u0) r7     // Catch:{ all -> 0x003b }
            T1.g r7 = r7.f3494p     // Catch:{ all -> 0x003b }
            r7.getClass()     // Catch:{ all -> 0x003b }
            if (r6 <= r0) goto L_0x00b0
        L_0x0095:
            java.lang.Object r0 = r2.f398a     // Catch:{ all -> 0x003b }
            T1.u0 r0 = (T1.C0212u0) r0     // Catch:{ all -> 0x003b }
            T1.Z r0 = r0.f3496r     // Catch:{ all -> 0x003b }
            T1.C0212u0.k(r0)     // Catch:{ all -> 0x003b }
            T1.X r0 = r0.f3177t     // Catch:{ all -> 0x003b }
            java.lang.String r1 = "Invalid screen class length for screen view. Length"
            int r2 = r4.length()     // Catch:{ all -> 0x003b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003b }
            r0.b(r2, r1)     // Catch:{ all -> 0x003b }
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            goto L_0x0147
        L_0x00b0:
            if (r4 != 0) goto L_0x00c1
            com.google.android.gms.internal.measurement.zzdj r0 = r2.f3383p     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = r0.zzb     // Catch:{ all -> 0x003b }
            java.lang.String r0 = r2.w(r0)     // Catch:{ all -> 0x003b }
        L_0x00bc:
            r14 = r0
            goto L_0x00c2
        L_0x00be:
            java.lang.String r0 = "Activity"
            goto L_0x00bc
        L_0x00c1:
            r14 = r4
        L_0x00c2:
            T1.j1 r0 = r2.f3380c     // Catch:{ all -> 0x003b }
            boolean r4 = r2.f3384q     // Catch:{ all -> 0x003b }
            if (r4 == 0) goto L_0x00ee
            if (r0 == 0) goto L_0x00ee
            r2.f3384q = r1     // Catch:{ all -> 0x003b }
            java.lang.String r1 = r0.f3356b     // Catch:{ all -> 0x003b }
            boolean r1 = java.util.Objects.equals(r1, r14)     // Catch:{ all -> 0x003b }
            java.lang.String r0 = r0.f3355a     // Catch:{ all -> 0x003b }
            boolean r0 = java.util.Objects.equals(r0, r13)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x00ee
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r0 = r2.f398a     // Catch:{ all -> 0x003b }
            T1.u0 r0 = (T1.C0212u0) r0     // Catch:{ all -> 0x003b }
            T1.Z r0 = r0.f3496r     // Catch:{ all -> 0x003b }
            T1.C0212u0.k(r0)     // Catch:{ all -> 0x003b }
            T1.X r0 = r0.f3177t     // Catch:{ all -> 0x003b }
            java.lang.String r1 = "Ignoring call to log screen view event with duplicate parameters."
            r0.a(r1)     // Catch:{ all -> 0x003b }
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            goto L_0x0147
        L_0x00ee:
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            java.lang.Object r0 = r2.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.Z r1 = r0.f3496r
            T1.C0212u0.k(r1)
            T1.X r1 = r1.f3180w
            if (r13 != 0) goto L_0x00ff
            java.lang.String r4 = "null"
            goto L_0x0100
        L_0x00ff:
            r4 = r13
        L_0x0100:
            if (r14 != 0) goto L_0x0105
            java.lang.String r5 = "null"
            goto L_0x0106
        L_0x0105:
            r5 = r14
        L_0x0106:
            java.lang.String r6 = "Logging screen view with name, class"
            r1.c(r6, r4, r5)
            T1.j1 r1 = r2.f3380c
            if (r1 != 0) goto L_0x0113
            T1.j1 r1 = r2.d
        L_0x0111:
            r5 = r1
            goto L_0x0116
        L_0x0113:
            T1.j1 r1 = r2.f3380c
            goto L_0x0111
        L_0x0116:
            T1.j1 r4 = new T1.j1
            T1.Y1 r1 = r0.f3499u
            T1.C0212u0.i(r1)
            long r15 = r1.y0()
            r17 = 1
            r12 = r4
            r18 = r26
            r12.<init>(r13, r14, r15, r17, r18)
            r2.f3380c = r4
            r2.d = r5
            r2.f3385r = r4
            G1.b r1 = r0.f3501w
            r1.getClass()
            long r6 = android.os.SystemClock.elapsedRealtime()
            T1.r0 r0 = r0.f3497s
            T1.C0212u0.k(r0)
            T1.z0 r9 = new T1.z0
            r8 = 2
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r8)
            r0.y(r9)
        L_0x0147:
            return
        L_0x0148:
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            throw r0
        L_0x014a:
            r0 = 1
            if (r25 == 0) goto L_0x0157
            T1.L0 r2 = r11.d
            if (r2 == 0) goto L_0x0157
            boolean r2 = T1.Y1.i0(r22)
            if (r2 == 0) goto L_0x0159
        L_0x0157:
            r9 = r0
            goto L_0x015a
        L_0x0159:
            r9 = r1
        L_0x015a:
            if (r21 != 0) goto L_0x015f
            java.lang.String r0 = "app"
            goto L_0x0161
        L_0x015f:
            r0 = r21
        L_0x0161:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r3)
            java.util.Set r2 = r7.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x016e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01cb
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r7.get(r3)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x018d
            android.os.Bundle r6 = new android.os.Bundle
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6.<init>(r5)
            r7.putBundle(r3, r6)
            goto L_0x016e
        L_0x018d:
            boolean r3 = r5 instanceof android.os.Parcelable[]
            if (r3 == 0) goto L_0x01a9
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            r3 = r1
        L_0x0194:
            int r6 = r5.length
            if (r3 >= r6) goto L_0x016e
            r6 = r5[r3]
            boolean r8 = r6 instanceof android.os.Bundle
            if (r8 == 0) goto L_0x01a6
            android.os.Bundle r8 = new android.os.Bundle
            android.os.Bundle r6 = (android.os.Bundle) r6
            r8.<init>(r6)
            r5[r3] = r8
        L_0x01a6:
            int r3 = r3 + 1
            goto L_0x0194
        L_0x01a9:
            boolean r3 = r5 instanceof java.util.List
            if (r3 == 0) goto L_0x016e
            java.util.List r5 = (java.util.List) r5
            r3 = r1
        L_0x01b0:
            int r6 = r5.size()
            if (r3 >= r6) goto L_0x016e
            java.lang.Object r6 = r5.get(r3)
            boolean r8 = r6 instanceof android.os.Bundle
            if (r8 == 0) goto L_0x01c8
            android.os.Bundle r8 = new android.os.Bundle
            android.os.Bundle r6 = (android.os.Bundle) r6
            r8.<init>(r6)
            r5.set(r3, r8)
        L_0x01c8:
            int r3 = r3 + 1
            goto L_0x01b0
        L_0x01cb:
            java.lang.Object r1 = r11.f398a
            T1.u0 r1 = (T1.C0212u0) r1
            T1.r0 r12 = r1.f3497s
            T1.C0212u0.k(r12)
            T1.Y0 r13 = new T1.Y0
            r1 = r13
            r2 = r20
            r3 = r0
            r4 = r22
            r5 = r26
            r8 = r25
            r10 = r24
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10)
            r12.y(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0157b1.y(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void z(String str, String str2, Bundle bundle) {
        o();
        ((C0212u0) this.f398a).f3501w.getClass();
        A(str, str2, bundle, System.currentTimeMillis());
    }
}
