package T1;

import I1.c;
import M5.g;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzcy;
import g0.C0545a;
import g0.C0546b;
import h0.C0552a;
import i0.C0581d;
import j0.e;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.j;
import z1.f;
import z1.i;

public final class Y1 extends E0 {

    /* renamed from: r  reason: collision with root package name */
    public static final String[] f3163r = {"firebase_", "google_", "ga_"};

    /* renamed from: s  reason: collision with root package name */
    public static final String[] f3164s = {"_err"};

    /* renamed from: c  reason: collision with root package name */
    public SecureRandom f3165c;
    public final AtomicLong d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    public int f3166e;

    /* renamed from: f  reason: collision with root package name */
    public C0581d f3167f;

    /* renamed from: p  reason: collision with root package name */
    public Boolean f3168p;

    /* renamed from: q  reason: collision with root package name */
    public Integer f3169q = null;

    public Y1(C0212u0 u0Var) {
        super(u0Var);
    }

    public static ArrayList B(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C0164e eVar = (C0164e) it2.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", eVar.f3271a);
            bundle.putString("origin", eVar.f3272b);
            bundle.putLong("creation_timestamp", eVar.d);
            bundle.putString("name", eVar.f3273c.f3140b);
            Object v6 = eVar.f3273c.v();
            I.g(v6);
            K0.g(bundle, v6);
            bundle.putBoolean("active", eVar.f3274e);
            String str = eVar.f3275f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C0214v vVar = eVar.f3276p;
            if (vVar != null) {
                bundle.putString("timed_out_event_name", vVar.f3508a);
                C0211u uVar = vVar.f3509b;
                if (uVar != null) {
                    bundle.putBundle("timed_out_event_params", uVar.v());
                }
            }
            bundle.putLong("trigger_timeout", eVar.f3277q);
            C0214v vVar2 = eVar.f3278r;
            if (vVar2 != null) {
                bundle.putString("triggered_event_name", vVar2.f3508a);
                C0211u uVar2 = vVar2.f3509b;
                if (uVar2 != null) {
                    bundle.putBundle("triggered_event_params", uVar2.v());
                }
            }
            bundle.putLong("triggered_timestamp", eVar.f3273c.f3141c);
            bundle.putLong("time_to_live", eVar.f3279s);
            C0214v vVar3 = eVar.f3280t;
            if (vVar3 != null) {
                bundle.putString("expired_event_name", vVar3.f3508a);
                C0211u uVar3 = vVar3.f3509b;
                if (uVar3 != null) {
                    bundle.putBundle("expired_event_params", uVar3.v());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void E(C0181j1 j1Var, Bundle bundle, boolean z3) {
        if (!(bundle == null || j1Var == null)) {
            if (!bundle.containsKey("_sc") || z3) {
                String str = j1Var.f3355a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = j1Var.f3356b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", j1Var.f3357c);
                return;
            }
            z3 = false;
        }
        if (bundle != null && j1Var == null && z3) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void I(A a6, String str, int i2, String str2, String str3, int i5) {
        Bundle bundle = new Bundle();
        p0(i2, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", (long) i5);
        }
        a6.v(str, "_err", bundle);
    }

    public static boolean U(String str, String[] strArr) {
        I.g(strArr);
        for (String equals : strArr) {
            if (Objects.equals(str, equals)) {
                return true;
            }
        }
        return false;
    }

    public static boolean W(String str) {
        String str2 = (String) H.f2937q0.a((Object) null);
        if (str2.equals("*") || Arrays.asList(str2.split(",")).contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean f0(Object obj) {
        if ((obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
            return true;
        }
        return false;
    }

    public static boolean i0(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("_")) {
            return false;
        }
        return true;
    }

    public static boolean j0(String str) {
        I.d(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    public static boolean k0(Context context) {
        ActivityInfo receiverInfo;
        I.g(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean l0(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static byte[] o0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static final boolean p0(int i2, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i2);
        return true;
    }

    public static long x0(byte[] bArr) {
        I.g(bArr);
        int length = bArr.length;
        if (length > 0) {
            int i2 = length - 1;
            int i5 = 0;
            long j6 = 0;
            while (i2 >= 0 && i2 >= bArr.length - 8) {
                j6 += (((long) bArr[i2]) & 255) << i5;
                i5 += 8;
                i2--;
            }
            return j6;
        }
        throw new IllegalStateException();
    }

    public static String y(String str, int i2, boolean z3) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (z3) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i2))).concat("...");
        }
        return null;
    }

    public static MessageDigest z() {
        int i2 = 0;
        while (i2 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i2++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public final SecureRandom A() {
        o();
        if (this.f3165c == null) {
            this.f3165c = new SecureRandom();
        }
        return this.f3165c;
    }

    public final Bundle A0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object v6 = v(bundle.get(next), next);
                if (v6 == null) {
                    C0212u0 u0Var = (C0212u0) this.f398a;
                    Z z3 = u0Var.f3496r;
                    C0212u0.k(z3);
                    z3.f3177t.b(u0Var.f3500v.e(next), "Param value can't be null");
                } else {
                    J(bundle2, next, v6);
                }
            }
        }
        return bundle2;
    }

    public final void C(Bundle bundle, long j6) {
        long j7 = bundle.getLong("_et");
        if (j7 != 0) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3175r.b(Long.valueOf(j7), "Params already contained engagement");
        } else {
            j7 = 0;
        }
        bundle.putLong("_et", j6 + j7);
    }

    public final void D(Bundle bundle, int i2, String str, Object obj) {
        if (p0(i2, bundle)) {
            ((C0212u0) this.f398a).getClass();
            bundle.putString("_ev", y(str, 40, true));
            if (obj == null) {
                return;
            }
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", (long) obj.toString().length());
            }
        }
    }

    public final void F(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String next : bundle2.keySet()) {
                if (!bundle.containsKey(next)) {
                    Y1 y12 = ((C0212u0) this.f398a).f3499u;
                    C0212u0.i(y12);
                    y12.J(bundle, next, bundle2.get(next));
                }
            }
        }
    }

    public final void G(Parcelable[] parcelableArr, int i2) {
        I.g(parcelableArr);
        for (Bundle bundle : parcelableArr) {
            Iterator it2 = new TreeSet(bundle.keySet()).iterator();
            int i5 = 0;
            boolean z3 = false;
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (j0(str) && !U(str, K0.h) && (i5 = i5 + 1) > i2) {
                    C0212u0 u0Var = (C0212u0) this.f398a;
                    if (!u0Var.f3494p.B((String) null, H.f2941r1) || !z3) {
                        Z z4 = u0Var.f3496r;
                        C0212u0.k(z4);
                        S s6 = u0Var.f3500v;
                        z4.f3174q.c("Param can't contain more than " + i2 + " item-scoped custom parameters", s6.e(str), s6.b(bundle));
                    }
                    p0(28, bundle);
                    bundle.remove(str);
                    z3 = true;
                }
            }
        }
    }

    public final void H(C0153a0 a0Var, int i2) {
        Bundle bundle = (Bundle) a0Var.f3223e;
        Iterator it2 = new TreeSet(bundle.keySet()).iterator();
        int i5 = 0;
        boolean z3 = false;
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (j0(str) && (i5 = i5 + 1) > i2) {
                C0212u0 u0Var = (C0212u0) this.f398a;
                if (!u0Var.f3494p.B((String) null, H.f2941r1) || !z3) {
                    String k6 = C0552a.k(i2, "Event can't contain more than ", " params");
                    Z z4 = u0Var.f3496r;
                    C0212u0.k(z4);
                    S s6 = u0Var.f3500v;
                    z4.f3174q.c(k6, s6.d((String) a0Var.f3222c), s6.b(bundle));
                    p0(5, bundle);
                }
                bundle.remove(str);
                z3 = true;
            }
        }
    }

    public final void J(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                if (obj != null) {
                    str2 = obj.getClass().getSimpleName();
                } else {
                    str2 = null;
                }
                C0212u0 u0Var = (C0212u0) this.f398a;
                Z z3 = u0Var.f3496r;
                C0212u0.k(z3);
                z3.f3177t.c("Not putting event parameter. Invalid value type. name, type", u0Var.f3500v.e(str), str2);
            }
        }
    }

    public final void K(zzcy zzcy, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z3);
        try {
            zzcy.zze(bundle);
        } catch (RemoteException e6) {
            Z z4 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z4);
            z4.f3175r.b(e6, "Error returning boolean value to wrapper");
        }
    }

    public final void L(zzcy zzcy, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcy.zze(bundle);
        } catch (RemoteException e6) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3175r.b(e6, "Error returning bundle list to wrapper");
        }
    }

    public final void M(zzcy zzcy, Bundle bundle) {
        try {
            zzcy.zze(bundle);
        } catch (RemoteException e6) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3175r.b(e6, "Error returning bundle value to wrapper");
        }
    }

    public final void N(zzcy zzcy, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcy.zze(bundle);
        } catch (RemoteException e6) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3175r.b(e6, "Error returning byte array to wrapper");
        }
    }

    public final void O(zzcy zzcy, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            zzcy.zze(bundle);
        } catch (RemoteException e6) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3175r.b(e6, "Error returning int value to wrapper");
        }
    }

    public final void P(zzcy zzcy, long j6) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j6);
        try {
            zzcy.zze(bundle);
        } catch (RemoteException e6) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3175r.b(e6, "Error returning long value to wrapper");
        }
    }

    public final void Q(String str, zzcy zzcy) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcy.zze(bundle);
        } catch (RemoteException e6) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3175r.b(e6, "Error returning string value to wrapper");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int R(java.lang.String r14, java.lang.String r15, java.lang.Object r16, android.os.Bundle r17, java.util.List r18, boolean r19, boolean r20) {
        /*
            r13 = this;
            r6 = r13
            r7 = r15
            r0 = r16
            r1 = r17
            r13.o()
            boolean r2 = f0(r16)
            java.lang.String r3 = "param"
            java.lang.Object r4 = r6.f398a
            r8 = r4
            T1.u0 r8 = (T1.C0212u0) r8
            r4 = 0
            if (r2 == 0) goto L_0x00a1
            if (r20 == 0) goto L_0x00a3
            java.lang.String[] r2 = T1.K0.g
            boolean r2 = U(r15, r2)
            if (r2 != 0) goto L_0x0024
            r0 = 20
            return r0
        L_0x0024:
            T1.w1 r2 = r8.r()
            r2.o()
            r2.p()
            boolean r5 = r2.B()
            if (r5 != 0) goto L_0x0035
            goto L_0x004a
        L_0x0035:
            java.lang.Object r2 = r2.f398a
            T1.u0 r2 = (T1.C0212u0) r2
            T1.Y1 r2 = r2.f3499u
            T1.C0212u0.i(r2)
            int r2 = r2.v0()
            r5 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r5) goto L_0x004a
            r0 = 25
            return r0
        L_0x004a:
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0053
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x005e
        L_0x0053:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x00a1
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x005e:
            r9 = 200(0xc8, float:2.8E-43)
            if (r5 <= r9) goto L_0x00a1
            T1.Z r10 = r8.f3496r
            T1.C0212u0.k(r10)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r11 = "Parameter array is too long; discarded. Value kind, name, array length"
            T1.X r10 = r10.f3177t
            r10.d(r11, r3, r15, r5)
            r5 = 17
            if (r2 == 0) goto L_0x0087
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r10 = r2.length
            if (r10 <= r9) goto L_0x0085
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r9)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r15, r2)
        L_0x0085:
            r9 = r5
            goto L_0x00a6
        L_0x0087:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x0085
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r10 = r2.size()
            if (r10 <= r9) goto L_0x0085
            java.util.ArrayList r10 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r4, r9)
            r10.<init>(r2)
            r1.putParcelableArrayList(r15, r10)
            goto L_0x0085
        L_0x00a1:
            r9 = r4
            goto L_0x00a6
        L_0x00a3:
            r0 = 21
            return r0
        L_0x00a6:
            boolean r1 = i0(r14)
            r2 = 500(0x1f4, float:7.0E-43)
            if (r1 != 0) goto L_0x00bb
            boolean r1 = i0(r15)
            if (r1 == 0) goto L_0x00b5
            goto L_0x00bb
        L_0x00b5:
            T1.g r1 = r8.f3494p
            r1.getClass()
            goto L_0x00c6
        L_0x00bb:
            T1.g r1 = r8.f3494p
            r1.getClass()
            r1 = 256(0x100, float:3.59E-43)
            int r2 = java.lang.Math.max(r2, r1)
        L_0x00c6:
            boolean r1 = r13.a0(r2, r0, r3, r15)
            if (r1 == 0) goto L_0x00cd
            return r9
        L_0x00cd:
            if (r20 == 0) goto L_0x0151
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e2
            r3 = r0
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0 = r13
            r1 = r14
            r2 = r15
            r4 = r18
            r5 = r19
            r0.V(r1, r2, r3, r4, r5)
            goto L_0x0150
        L_0x00e2:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x0114
            r10 = r0
            android.os.Parcelable[] r10 = (android.os.Parcelable[]) r10
            int r11 = r10.length
            r12 = r4
        L_0x00eb:
            if (r12 >= r11) goto L_0x0150
            r0 = r10[r12]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0104
            T1.Z r1 = r8.f3496r
            T1.C0212u0.k(r1)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            T1.X r1 = r1.f3177t
            r1.c(r2, r0, r15)
            goto L_0x0151
        L_0x0104:
            r3 = r0
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0 = r13
            r1 = r14
            r2 = r15
            r4 = r18
            r5 = r19
            r0.V(r1, r2, r3, r4, r5)
            int r12 = r12 + 1
            goto L_0x00eb
        L_0x0114:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0151
            r10 = r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r11 = r10.size()
            r12 = r4
        L_0x0120:
            if (r12 >= r11) goto L_0x0150
            java.lang.Object r0 = r10.get(r12)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0140
            T1.Z r1 = r8.f3496r
            T1.C0212u0.k(r1)
            if (r0 == 0) goto L_0x0136
            java.lang.Class r0 = r0.getClass()
            goto L_0x0138
        L_0x0136:
            java.lang.String r0 = "null"
        L_0x0138:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            T1.X r1 = r1.f3177t
            r1.c(r2, r0, r15)
            goto L_0x0151
        L_0x0140:
            r3 = r0
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0 = r13
            r1 = r14
            r2 = r15
            r4 = r18
            r5 = r19
            r0.V(r1, r2, r3, r4, r5)
            int r12 = r12 + 1
            goto L_0x0120
        L_0x0150:
            return r9
        L_0x0151:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.Y1.R(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int S(String str) {
        boolean equals = "_ldl".equals(str);
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (equals) {
            u0Var.getClass();
            return 2048;
        } else if ("_id".equals(str)) {
            u0Var.getClass();
            return 256;
        } else if ("_lgclid".equals(str)) {
            u0Var.getClass();
            return 100;
        } else {
            u0Var.getClass();
            return 36;
        }
    }

    public final Object T(int i2, Object obj, boolean z3, boolean z4) {
        long j6;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            if (true != ((Boolean) obj).booleanValue()) {
                j6 = 0;
            } else {
                j6 = 1;
            }
            return Long.valueOf(j6);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return y(obj.toString(), i2, z3);
            }
            if (!z4 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle A02 = A0((Bundle) parcelable);
                    if (!A02.isEmpty()) {
                        arrayList.add(A02);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public final void V(String str, String str2, Bundle bundle, List list, boolean z3) {
        int i2;
        int i5;
        int i6;
        int i7;
        Z z4;
        String str3;
        int i8;
        String str4 = str;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            C0212u0 u0Var = (C0212u0) this.f398a;
            Y1 y12 = ((C0212u0) u0Var.f3494p.f398a).f3499u;
            C0212u0.i(y12);
            if (true != y12.h0(231100000)) {
                i2 = 0;
            } else {
                i2 = 35;
            }
            Iterator it2 = new TreeSet(bundle.keySet()).iterator();
            int i9 = 0;
            boolean z5 = false;
            while (it2.hasNext()) {
                String str5 = (String) it2.next();
                if (list2 == null || !list2.contains(str5)) {
                    if (!z3) {
                        i5 = t0(str5);
                    } else {
                        i5 = 0;
                    }
                    if (i5 == 0) {
                        i5 = s0(str5);
                    }
                } else {
                    i5 = 0;
                }
                String str6 = null;
                if (i5 != 0) {
                    if (i5 == 3) {
                        str6 = str5;
                    }
                    D(bundle2, i5, str5, str6);
                    bundle2.remove(str5);
                    i6 = i2;
                } else {
                    boolean f02 = f0(bundle2.get(str5));
                    Z z6 = u0Var.f3496r;
                    if (f02) {
                        C0212u0.k(z6);
                        z6.f3177t.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str4, str2, str5);
                        i8 = 22;
                        z4 = z6;
                        str3 = str5;
                        i6 = i2;
                    } else {
                        String str7 = str2;
                        z4 = z6;
                        str3 = str5;
                        i6 = i2;
                        i8 = R(str, str5, bundle2.get(str5), bundle, list, z3, false);
                    }
                    if (i8 != 0 && !"_ev".equals(str3)) {
                        D(bundle2, i8, str3, bundle2.get(str3));
                        bundle2.remove(str3);
                    } else if (j0(str3) && !U(str3, K0.h)) {
                        int i10 = i9 + 1;
                        boolean h02 = h0(231100000);
                        S s6 = u0Var.f3500v;
                        if (!h02) {
                            C0212u0.k(z4);
                            z4.f3174q.c("Item array not supported on client's version of Google Play Services (Android Only)", s6.d(str4), s6.b(bundle2));
                            p0(23, bundle2);
                            bundle2.remove(str3);
                        } else {
                            Z z7 = z4;
                            if (i10 > i6) {
                                if (!u0Var.f3494p.B((String) null, H.f2941r1) || !z5) {
                                    C0212u0.k(z7);
                                    z7.f3174q.c("Item can't contain more than " + i6 + " item-scoped custom params", s6.d(str4), s6.b(bundle2));
                                }
                                p0(28, bundle2);
                                bundle2.remove(str3);
                                i9 = i10;
                                i7 = i6;
                                z5 = true;
                            }
                        }
                        i9 = i10;
                    }
                }
                i7 = i6;
            }
        }
    }

    public final boolean X(String str, String str2) {
        C0212u0 u0Var = (C0212u0) this.f398a;
        boolean B6 = u0Var.f3494p.B((String) null, H.f2935p1);
        String str3 = u0Var.f3490b;
        Z z3 = u0Var.f3496r;
        if (B6) {
            if (!TextUtils.isEmpty(str)) {
                if (n0(str)) {
                    return true;
                }
                if (TextUtils.isEmpty(str3)) {
                    C0212u0.k(z3);
                    z3.f3174q.b(Z.w(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                    return false;
                }
            } else if (TextUtils.isEmpty(str3)) {
                C0212u0.k(z3);
                z3.f3174q.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                return false;
            }
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            if (!n0(str)) {
                if (TextUtils.isEmpty(str3)) {
                    C0212u0.k(z3);
                    z3.f3174q.b(Z.w(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                }
                return false;
            }
        } else if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str3)) {
                C0212u0.k(z3);
                z3.f3174q.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (!n0(str2)) {
            C0212u0.k(z3);
            z3.f3174q.b(Z.w(str2), "Invalid admob_app_id. Analytics disabled.");
            return false;
        }
        return true;
    }

    public final boolean Y(int i2, String str, String str2) {
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (str2 == null) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3174q.b(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        } else {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3174q.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
            return false;
        }
    }

    public final boolean Z(String str, String[] strArr, String[] strArr2, String str2) {
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (str2 == null) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3174q.b(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = f3163r;
        for (int i2 = 0; i2 < 3; i2++) {
            if (str2.startsWith(strArr3[i2])) {
                Z z4 = u0Var.f3496r;
                C0212u0.k(z4);
                z4.f3174q.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !U(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && U(str2, strArr2)) {
            return true;
        }
        Z z5 = u0Var.f3496r;
        C0212u0.k(z5);
        z5.f3174q.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean a0(int i2, Object obj, String str, String str2) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i2) {
                Z z3 = ((C0212u0) this.f398a).f3496r;
                C0212u0.k(z3);
                z3.f3177t.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean b0(String str, String str2) {
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (str2 == null) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3174q.b(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.length() == 0) {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3174q.b(str, "Name is required and can't be empty. Type");
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    Z z5 = u0Var.f3496r;
                    C0212u0.k(z5);
                    z5.f3174q.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    Z z6 = u0Var.f3496r;
                    C0212u0.k(z6);
                    z6.f3174q.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean c0(String str, String str2) {
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (str2 == null) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3174q.b(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.length() == 0) {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3174q.b(str, "Name is required and can't be empty. Type");
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                Z z5 = u0Var.f3496r;
                C0212u0.k(z5);
                z5.f3174q.c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    Z z6 = u0Var.f3496r;
                    C0212u0.k(z6);
                    z6.f3174q.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean d0(String str) {
        o();
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (c.a(u0Var.f3489a).f494b.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        Z z3 = u0Var.f3496r;
        C0212u0.k(z3);
        z3.f3179v.b(str, "Permission not granted");
        return false;
    }

    public final boolean e0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((C0212u0) this.f398a).f3494p.s("debug.firebase.analytics.app").equals(str);
    }

    public final boolean g0(Context context, String str) {
        Signature[] signatureArr;
        C0212u0 u0Var = (C0212u0) this.f398a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo i2 = c.a(context).i(64, str);
            if (i2 == null || (signatureArr = i2.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e6) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3172f.b(e6, "Error obtaining certificate");
            return true;
        } catch (PackageManager.NameNotFoundException e7) {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3172f.b(e7, "Package name not found");
            return true;
        }
    }

    public final boolean h0(int i2) {
        Boolean bool = ((C0212u0) this.f398a).r().f3526e;
        if (v0() >= i2 / 1000) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        if (!bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean m0(String str, String str2, String str3, String str4) {
        if (((C0212u0) this.f398a).f3494p.B((String) null, H.f2935p1)) {
            boolean isEmpty = TextUtils.isEmpty(str);
            boolean isEmpty2 = TextUtils.isEmpty(str2);
            if (!isEmpty && !isEmpty2) {
                I.g(str);
                if (!str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }
        boolean isEmpty3 = TextUtils.isEmpty(str);
        boolean isEmpty4 = TextUtils.isEmpty(str2);
        if (!isEmpty3 && !isEmpty4) {
            I.g(str);
            if (!str.equals(str2)) {
                return true;
            }
            return false;
        } else if (!isEmpty3 || !isEmpty4) {
            if (!isEmpty3) {
                if (TextUtils.isEmpty(str4)) {
                    return false;
                }
                if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                    return true;
                }
                return false;
            } else if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            } else {
                return false;
            }
        } else if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (!TextUtils.isEmpty(str4)) {
                return true;
            }
            return false;
        } else if (!str3.equals(str4)) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean n0(String str) {
        String str2;
        I.g(str);
        if (true != ((C0212u0) this.f398a).f3494p.B((String) null, H.f2935p1)) {
            str2 = "^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$";
        } else {
            str2 = "^1:\\d+:android:[a-f0-9]+$";
        }
        return str.matches(str2);
    }

    public final boolean p() {
        return true;
    }

    public final int q0(Object obj, String str) {
        boolean z3;
        if ("_ldl".equals(str)) {
            z3 = a0(S(str), obj, "user property referrer", str);
        } else {
            z3 = a0(S(str), obj, "user property", str);
        }
        if (z3) {
            return 0;
        }
        return 7;
    }

    public final int r0(String str) {
        if (!b0("event", str)) {
            return 2;
        }
        if (!Z("event", K0.f2974a, K0.f2975b, str)) {
            return 13;
        }
        ((C0212u0) this.f398a).getClass();
        if (!Y(40, "event", str)) {
            return 2;
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle s(java.lang.String r21, android.os.Bundle r22, java.util.List r23, boolean r24) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            java.lang.String[] r0 = T1.K0.d
            boolean r12 = U(r9, r0)
            if (r10 == 0) goto L_0x0102
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>(r10)
            java.lang.Object r0 = r8.f398a
            r15 = r0
            T1.u0 r15 = (T1.C0212u0) r15
            T1.g r0 = r15.f3494p
            java.lang.Object r0 = r0.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.Y1 r0 = r0.f3499u
            T1.C0212u0.i(r0)
            r1 = 201500000(0xc02a560, float:1.0064601E-31)
            boolean r0 = r0.h0(r1)
            if (r0 == 0) goto L_0x0032
            r0 = 100
        L_0x0030:
            r7 = r0
            goto L_0x0035
        L_0x0032:
            r0 = 25
            goto L_0x0030
        L_0x0035:
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = r17
            r19 = r18
        L_0x0048:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r0 = r16.next()
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            if (r11 == 0) goto L_0x0061
            boolean r0 = r11.contains(r6)
            if (r0 != 0) goto L_0x005e
            goto L_0x0061
        L_0x005e:
            r0 = r17
            goto L_0x0070
        L_0x0061:
            if (r24 != 0) goto L_0x0068
            int r0 = r8.t0(r6)
            goto L_0x006a
        L_0x0068:
            r0 = r17
        L_0x006a:
            if (r0 != 0) goto L_0x0070
            int r0 = r8.s0(r6)
        L_0x0070:
            if (r0 == 0) goto L_0x0082
            r1 = 3
            if (r0 != r1) goto L_0x0077
            r1 = r6
            goto L_0x0078
        L_0x0077:
            r1 = 0
        L_0x0078:
            r8.D(r14, r0, r6, r1)
            r14.remove(r6)
            r11 = r7
        L_0x007f:
            r3 = 0
            goto L_0x00fb
        L_0x0082:
            java.lang.Object r3 = r10.get(r6)
            r0 = r20
            r1 = r21
            r2 = r6
            r4 = r14
            r5 = r23
            r13 = r6
            r6 = r24
            r11 = r7
            r7 = r12
            int r0 = r0.R(r1, r2, r3, r4, r5, r6, r7)
            r1 = 17
            if (r0 != r1) goto L_0x00a1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.D(r14, r1, r13, r0)
            goto L_0x00bd
        L_0x00a1:
            if (r0 == 0) goto L_0x00bd
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x00bd
            r1 = 21
            if (r0 != r1) goto L_0x00b1
            r6 = r9
            goto L_0x00b2
        L_0x00b1:
            r6 = r13
        L_0x00b2:
            java.lang.Object r1 = r10.get(r13)
            r8.D(r14, r0, r6, r1)
            r14.remove(r13)
            goto L_0x007f
        L_0x00bd:
            boolean r0 = j0(r13)
            if (r0 == 0) goto L_0x007f
            int r0 = r18 + 1
            if (r0 <= r11) goto L_0x00f9
            T1.G r1 = T1.H.f2941r1
            T1.g r2 = r15.f3494p
            r3 = 0
            boolean r1 = r2.B(r3, r1)
            if (r1 == 0) goto L_0x00d4
            if (r19 != 0) goto L_0x00f0
        L_0x00d4:
            java.lang.String r1 = "Event can't contain more than "
            java.lang.String r2 = " params"
            java.lang.String r1 = h0.C0552a.k(r11, r1, r2)
            T1.Z r2 = r15.f3496r
            T1.C0212u0.k(r2)
            T1.S r4 = r15.f3500v
            java.lang.String r5 = r4.d(r9)
            java.lang.String r4 = r4.b(r10)
            T1.X r2 = r2.f3174q
            r2.c(r1, r5, r4)
        L_0x00f0:
            r1 = 5
            p0(r1, r14)
            r14.remove(r13)
            r19 = 1
        L_0x00f9:
            r18 = r0
        L_0x00fb:
            r7 = r11
            r11 = r23
            goto L_0x0048
        L_0x0100:
            r13 = r14
            goto L_0x0104
        L_0x0102:
            r3 = 0
            r13 = r3
        L_0x0104:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.Y1.s(java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final int s0(String str) {
        if (!b0("event param", str)) {
            return 3;
        }
        if (!Z("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        ((C0212u0) this.f398a).getClass();
        if (!Y(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public final C0581d t() {
        int i2;
        int i5;
        e eVar;
        int i6;
        Object obj;
        if (this.f3167f == null) {
            Context context = ((C0212u0) this.f398a).f3489a;
            j.e(context, "context");
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i7 = Build.VERSION.SDK_INT;
            C0546b bVar = C0546b.f7981a;
            int i8 = 0;
            if (i7 >= 33) {
                i2 = bVar.a();
            } else {
                i2 = 0;
            }
            sb.append(i2);
            Log.d("MeasurementManager", sb.toString());
            if (i7 >= 33) {
                i5 = bVar.a();
            } else {
                i5 = 0;
            }
            C0581d dVar = null;
            if (i5 >= 5) {
                Object systemService = context.getSystemService(C0209t0.f());
                j.d(systemService, "context.getSystemService…ementManager::class.java)");
                eVar = new e(C0209t0.b(systemService));
            } else {
                C0545a aVar = C0545a.f7980a;
                if (i7 == 31 || i7 == 32) {
                    i6 = aVar.a();
                } else {
                    i6 = 0;
                }
                if (i6 >= 9) {
                    try {
                        obj = new g(context, 1).invoke(context);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i9 = Build.VERSION.SDK_INT;
                        if (i9 == 31 || i9 == 32) {
                            i8 = aVar.a();
                        }
                        sb2.append(i8);
                        Log.d("MeasurementManager", sb2.toString());
                        obj = null;
                    }
                    eVar = (e) obj;
                } else {
                    eVar = null;
                }
            }
            if (eVar != null) {
                dVar = new C0581d(eVar);
            }
            this.f3167f = dVar;
        }
        return this.f3167f;
    }

    public final int t0(String str) {
        if (!c0("event param", str)) {
            return 3;
        }
        if (!Z("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        ((C0212u0) this.f398a).getClass();
        if (!Y(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public final C0214v u(String str, Bundle bundle, String str2, long j6, boolean z3) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (r0(str) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str2);
            Bundle s6 = s(str, bundle2, Collections.singletonList("_o"), true);
            if (z3) {
                s6 = A0(s6);
            }
            I.g(s6);
            return new C0214v(str, new C0211u(s6), str2, j6);
        }
        C0212u0 u0Var = (C0212u0) this.f398a;
        Z z4 = u0Var.f3496r;
        C0212u0.k(z4);
        z4.f3172f.b(u0Var.f3500v.f(str), "Invalid conditional property event name");
        throw new IllegalArgumentException();
    }

    public final int u0(String str) {
        if (!b0("user property", str)) {
            return 6;
        }
        if (!Z("user property", K0.f2979i, (String[]) null, str)) {
            return 15;
        }
        ((C0212u0) this.f398a).getClass();
        if (!Y(24, "user property", str)) {
            return 6;
        }
        return 0;
    }

    public final Object v(Object obj, String str) {
        boolean equals = "_ev".equals(str);
        int i2 = 500;
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (equals) {
            u0Var.f3494p.getClass();
            return T(Math.max(500, 256), obj, true, true);
        }
        if (i0(str)) {
            u0Var.f3494p.getClass();
            i2 = Math.max(500, 256);
        } else {
            u0Var.f3494p.getClass();
        }
        return T(i2, obj, false, true);
    }

    public final int v0() {
        if (this.f3169q == null) {
            f fVar = f.f12811b;
            Context context = ((C0212u0) this.f398a).f3489a;
            fVar.getClass();
            AtomicBoolean atomicBoolean = i.f12814a;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f3169q = Integer.valueOf(i2 / 1000);
        }
        return this.f3169q.intValue();
    }

    public final Object w(Object obj, String str) {
        if ("_ldl".equals(str)) {
            return T(S(str), obj, true, false);
        }
        return T(S(str), obj, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c7 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long w0() {
        /*
            r11 = this;
            r11.o()
            java.lang.Object r0 = r11.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.O r1 = r0.n()
            T1.Z r0 = r0.f3496r
            java.lang.String r1 = r1.u()
            boolean r1 = W(r1)
            r2 = 0
            if (r1 != 0) goto L_0x001a
            return r2
        L_0x001a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r5 = 30
            r6 = 0
            if (r1 >= r5) goto L_0x0025
            r7 = 4
            goto L_0x0050
        L_0x0025:
            int r7 = android.os.ext.SdkExtensions.getExtensionVersion(30)
            r8 = 4
            if (r7 >= r8) goto L_0x002f
            r7 = 8
            goto L_0x0050
        L_0x002f:
            if (r1 < r5) goto L_0x003d
            int r1 = android.os.ext.SdkExtensions.getExtensionVersion(30)
            r5 = 3
            if (r1 <= r5) goto L_0x003d
            int r1 = android.os.ext.SdkExtensions.getExtensionVersion(1000000)
            goto L_0x003e
        L_0x003d:
            r1 = r4
        L_0x003e:
            T1.G r5 = T1.H.f2919k0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r1 >= r5) goto L_0x004f
            r7 = 16
            goto L_0x0050
        L_0x004f:
            r7 = r2
        L_0x0050:
            java.lang.String r1 = "android.permission.ACCESS_ADSERVICES_ATTRIBUTION"
            boolean r1 = r11.d0(r1)
            if (r1 != 0) goto L_0x005b
            r9 = 2
            long r7 = r7 | r9
        L_0x005b:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x00c0
            java.lang.Boolean r1 = r11.f3168p
            if (r1 != 0) goto L_0x00b6
            i0.d r1 = r11.t()
            if (r1 != 0) goto L_0x006a
            goto L_0x00bc
        L_0x006a:
            B2.b r1 = r1.b()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ CancellationException -> 0x009b, ExecutionException -> 0x0099, InterruptedException -> 0x0097, TimeoutException -> 0x0094 }
            r9 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r1 = r1.get(r9, r5)     // Catch:{ CancellationException -> 0x009b, ExecutionException -> 0x0099, InterruptedException -> 0x0097, TimeoutException -> 0x0094 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ CancellationException -> 0x009b, ExecutionException -> 0x0099, InterruptedException -> 0x0097, TimeoutException -> 0x0094 }
            if (r1 == 0) goto L_0x008b
            int r5 = r1.intValue()     // Catch:{ CancellationException -> 0x0089, ExecutionException -> 0x0087, InterruptedException -> 0x0085, TimeoutException -> 0x0083 }
            r6 = 1
            if (r5 != r6) goto L_0x008b
            r4 = r6
            goto L_0x008b
        L_0x0083:
            r4 = move-exception
            goto L_0x0092
        L_0x0085:
            r4 = move-exception
            goto L_0x0092
        L_0x0087:
            r4 = move-exception
            goto L_0x0092
        L_0x0089:
            r4 = move-exception
            goto L_0x0092
        L_0x008b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ CancellationException -> 0x0089, ExecutionException -> 0x0087, InterruptedException -> 0x0085, TimeoutException -> 0x0083 }
            r11.f3168p = r4     // Catch:{ CancellationException -> 0x0089, ExecutionException -> 0x0087, InterruptedException -> 0x0085, TimeoutException -> 0x0083 }
            goto L_0x00ac
        L_0x0092:
            r6 = r1
            goto L_0x009d
        L_0x0094:
            r1 = move-exception
        L_0x0095:
            r4 = r1
            goto L_0x009d
        L_0x0097:
            r1 = move-exception
            goto L_0x0095
        L_0x0099:
            r1 = move-exception
            goto L_0x0095
        L_0x009b:
            r1 = move-exception
            goto L_0x0095
        L_0x009d:
            T1.C0212u0.k(r0)
            java.lang.String r1 = "Measurement manager api exception"
            T1.X r5 = r0.f3175r
            r5.b(r4, r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r11.f3168p = r1
            r1 = r6
        L_0x00ac:
            T1.C0212u0.k(r0)
            java.lang.String r4 = "Measurement manager api status result"
            T1.X r0 = r0.f3180w
            r0.b(r1, r4)
        L_0x00b6:
            java.lang.Boolean r0 = r11.f3168p
            boolean r4 = r0.booleanValue()
        L_0x00bc:
            if (r4 != 0) goto L_0x00c0
            r7 = 64
        L_0x00c0:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00c7
            r0 = 1
            return r0
        L_0x00c7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.Y1.w0():long");
    }

    public final String x() {
        byte[] bArr = new byte[16];
        A().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final long y0() {
        long andIncrement;
        long j6;
        AtomicLong atomicLong = this.d;
        if (atomicLong.get() == 0) {
            synchronized (atomicLong) {
                long nanoTime = System.nanoTime();
                ((C0212u0) this.f398a).f3501w.getClass();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i2 = this.f3166e + 1;
                this.f3166e = i2;
                j6 = nextLong + ((long) i2);
            }
            return j6;
        }
        AtomicLong atomicLong2 = this.d;
        synchronized (atomicLong2) {
            atomicLong2.compareAndSet(-1, 1);
            andIncrement = atomicLong2.getAndIncrement();
        }
        return andIncrement;
    }

    public final Bundle z0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Uri uri2 = uri;
        if (uri2 != null) {
            try {
                if (uri.isHierarchical()) {
                    str9 = uri2.getQueryParameter("utm_campaign");
                    str8 = uri2.getQueryParameter("utm_source");
                    str7 = uri2.getQueryParameter("utm_medium");
                    str6 = uri2.getQueryParameter("gclid");
                    str5 = uri2.getQueryParameter("gbraid");
                    str4 = uri2.getQueryParameter("utm_id");
                    str3 = uri2.getQueryParameter("dclid");
                    str2 = uri2.getQueryParameter("srsltid");
                    str = uri2.getQueryParameter("sfmc_id");
                } else {
                    str9 = null;
                    str8 = null;
                    str7 = null;
                    str6 = null;
                    str5 = null;
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str9) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str9)) {
                    str10 = "sfmc_id";
                    bundle.putString("campaign", str9);
                } else {
                    str10 = "sfmc_id";
                }
                if (!TextUtils.isEmpty(str8)) {
                    bundle.putString("source", str8);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("medium", str7);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("gclid", str6);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("gbraid", str5);
                }
                String queryParameter = uri2.getQueryParameter("gad_source");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("gad_source", queryParameter);
                }
                String queryParameter2 = uri2.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("term", queryParameter2);
                }
                String queryParameter3 = uri2.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("content", queryParameter3);
                }
                String queryParameter4 = uri2.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("aclid", queryParameter4);
                }
                String queryParameter5 = uri2.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("cp1", queryParameter5);
                }
                String queryParameter6 = uri2.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("anid", queryParameter6);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("campaign_id", str4);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("dclid", str3);
                }
                String queryParameter7 = uri2.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("source_platform", queryParameter7);
                }
                String queryParameter8 = uri2.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("creative_format", queryParameter8);
                }
                String queryParameter9 = uri2.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString("marketing_tactic", queryParameter9);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("srsltid", str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString(str10, str);
                }
                return bundle;
            } catch (UnsupportedOperationException e6) {
                Z z3 = ((C0212u0) this.f398a).f3496r;
                C0212u0.k(z3);
                z3.f3175r.b(e6, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        } else {
            return null;
        }
    }
}
