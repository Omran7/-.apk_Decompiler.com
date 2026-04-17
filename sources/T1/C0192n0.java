package T1;

import B0.C0009h;
import S3.t;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzfz;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.internal.measurement.zzgo;
import com.google.android.gms.internal.measurement.zzgw;
import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zziv;
import com.google.android.gms.internal.measurement.zzmm;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import n.e;
import n.j;

/* renamed from: T1.n0  reason: case insensitive filesystem */
public final class C0192n0 extends O1 implements C0167f {
    public final e d = new j(0);

    /* renamed from: e  reason: collision with root package name */
    public final e f3401e = new j(0);

    /* renamed from: f  reason: collision with root package name */
    public final e f3402f = new j(0);

    /* renamed from: p  reason: collision with root package name */
    public final e f3403p = new j(0);

    /* renamed from: q  reason: collision with root package name */
    public final e f3404q = new j(0);

    /* renamed from: r  reason: collision with root package name */
    public final e f3405r = new j(0);

    /* renamed from: s  reason: collision with root package name */
    public final C0189m0 f3406s = new C0189m0(this);

    /* renamed from: t  reason: collision with root package name */
    public final t f3407t = new t(this, 2);

    /* renamed from: u  reason: collision with root package name */
    public final e f3408u = new j(0);

    /* renamed from: v  reason: collision with root package name */
    public final e f3409v = new j(0);

    /* renamed from: w  reason: collision with root package name */
    public final e f3410w = new j(0);

    /* JADX WARNING: type inference failed for: r2v1, types: [n.e, n.j] */
    /* JADX WARNING: type inference failed for: r2v2, types: [n.e, n.j] */
    /* JADX WARNING: type inference failed for: r2v3, types: [n.e, n.j] */
    /* JADX WARNING: type inference failed for: r2v4, types: [n.e, n.j] */
    /* JADX WARNING: type inference failed for: r2v5, types: [n.e, n.j] */
    /* JADX WARNING: type inference failed for: r2v6, types: [n.e, n.j] */
    /* JADX WARNING: type inference failed for: r2v7, types: [n.e, n.j] */
    /* JADX WARNING: type inference failed for: r2v8, types: [n.e, n.j] */
    /* JADX WARNING: type inference failed for: r2v9, types: [n.e, n.j] */
    public C0192n0(T1 t12) {
        super(t12);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [n.e, n.j] */
    public static final e y(zzgo zzgo) {
        ? jVar = new j(0);
        if (zzgo != null) {
            for (zzgw zzgw : zzgo.zzp()) {
                jVar.put(zzgw.zzb(), zzgw.zzc());
            }
        }
        return jVar;
    }

    public static final I0 z(int i2) {
        int i5 = i2 - 1;
        if (i5 == 1) {
            return I0.AD_STORAGE;
        }
        if (i5 == 2) {
            return I0.ANALYTICS_STORAGE;
        }
        if (i5 == 3) {
            return I0.AD_USER_DATA;
        }
        if (i5 != 4) {
            return null;
        }
        return I0.AD_PERSONALIZATION;
    }

    public final int A(String str, String str2) {
        Integer num;
        o();
        w(str);
        Map map = (Map) this.f3405r.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final G0 B(String str, I0 i02) {
        o();
        w(str);
        zzgi C6 = C(str);
        G0 g02 = G0.UNINITIALIZED;
        if (C6 == null) {
            return g02;
        }
        for (zzfz zzfz : C6.zzf()) {
            if (z(zzfz.zzc()) == i02) {
                int zzb = zzfz.zzb() - 1;
                if (zzb == 1) {
                    return G0.GRANTED;
                }
                if (zzb != 2) {
                    return g02;
                }
                return G0.DENIED;
            }
        }
        return g02;
    }

    public final zzgi C(String str) {
        o();
        w(str);
        zzgo D4 = D(str);
        if (D4 == null || !D4.zzt()) {
            return null;
        }
        return D4.zzd();
    }

    public final zzgo D(String str) {
        p();
        o();
        I.d(str);
        w(str);
        return (zzgo) this.f3404q.get(str);
    }

    public final String E(String str) {
        o();
        w(str);
        return (String) this.f3408u.get(str);
    }

    public final boolean F(String str, I0 i02) {
        o();
        w(str);
        zzgi C6 = C(str);
        if (C6 == null) {
            return false;
        }
        Iterator it2 = C6.zzd().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            zzfz zzfz = (zzfz) it2.next();
            if (i02 == z(zzfz.zzc())) {
                if (zzfz.zzb() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean G(String str, String str2) {
        Boolean bool;
        o();
        w(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f3403p.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean H(String str, String str2) {
        Boolean bool;
        o();
        w(str);
        if ("1".equals(a(str, "measurement.upload.blacklist_internal")) && Y1.i0(str2)) {
            return true;
        }
        if ("1".equals(a(str, "measurement.upload.blacklist_public")) && Y1.j0(str2)) {
            return true;
        }
        Map map = (Map) this.f3402f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0376, code lost:
        if (r1.zzj() == false) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0378, code lost:
        r1 = java.lang.Integer.valueOf(r1.zza());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0381, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0382, code lost:
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r4, r5, java.lang.String.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x038b, code lost:
        r7 = r1.zzcd();
        r8 = new android.content.ContentValues();
        r8.put(r3, r2);
        r24 = r0;
        r8.put("audience_id", java.lang.Integer.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03a4, code lost:
        if (r1.zzj() == false) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03a6, code lost:
        r0 = java.lang.Integer.valueOf(r1.zza());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03af, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03b0, code lost:
        r8.put("filter_id", r0);
        r26 = r3;
        r8.put("property_name", r1.zze());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03c2, code lost:
        if (r1.zzk() == false) goto L_0x03cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03c4, code lost:
        r0 = java.lang.Boolean.valueOf(r1.zzi());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03cd, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03ce, code lost:
        r8.put("session_scoped", r0);
        r8.put("data", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03e0, code lost:
        if (r10.k0().insertWithOnConflict("property_filters", (java.lang.String) null, r8, 5) != -1) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03e2, code lost:
        r0 = r5.f3496r;
        T1.C0212u0.k(r0);
        r0.f3172f.b(T1.Z.w(r28), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03f5, code lost:
        r0 = r24;
        r3 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r1 = r5.f3496r;
        T1.C0212u0.k(r1);
        r1.f3172f.c("Error storing property filter. appId", T1.Z.w(r28), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x021c, code lost:
        r7 = r0.zzh().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0228, code lost:
        if (r7.hasNext() == false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0234, code lost:
        if (((com.google.android.gms.internal.measurement.zzfr) r7.next()).zzj() != false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0236, code lost:
        r0 = r5.f3496r;
        T1.C0212u0.k(r0);
        r0.f3175r.c("Property filter with no ID. Audience definition ignored. appId, audienceId", T1.Z.w(r28), java.lang.Integer.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x024c, code lost:
        r7 = r0.zzg().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0258, code lost:
        r23 = r3;
        r3 = "app_id";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0266, code lost:
        if (r7.hasNext() == false) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r8 = (com.google.android.gms.internal.measurement.zzfj) r7.next();
        r10.p();
        r10.o();
        com.google.android.gms.common.internal.I.d(r28);
        com.google.android.gms.common.internal.I.g(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0282, code lost:
        if (r8.zzg().isEmpty() == false) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0284, code lost:
        r0 = r5.f3496r;
        T1.C0212u0.k(r0);
        r0 = r0.f3175r;
        r4 = T1.Z.w(r28);
        r5 = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0299, code lost:
        if (r8.zzp() == false) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x029b, code lost:
        r7 = java.lang.Integer.valueOf(r8.zzb());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02a4, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02a5, code lost:
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r5, java.lang.String.valueOf(r7));
        r25 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02b0, code lost:
        r24 = r7;
        r7 = r8.zzcd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02b6, code lost:
        r25 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r1 = new android.content.ContentValues();
        r1.put(r3, r2);
        r1.put("audience_id", java.lang.Integer.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02cb, code lost:
        if (r8.zzp() == false) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02cd, code lost:
        r3 = java.lang.Integer.valueOf(r8.zzb());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02d6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02d9, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02da, code lost:
        r1.put("filter_id", r3);
        r1.put("event_name", r8.zzg());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02ea, code lost:
        if (r8.zzq() == false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02ec, code lost:
        r3 = java.lang.Boolean.valueOf(r8.zzn());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02f5, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02f6, code lost:
        r1.put("session_scoped", r3);
        r1.put("data", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0308, code lost:
        if (r10.k0().insertWithOnConflict("event_filters", (java.lang.String) null, r1, 5) != -1) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x030a, code lost:
        r1 = r5.f3496r;
        T1.C0212u0.k(r1);
        r1.f3172f.b(T1.Z.w(r28), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x031a, code lost:
        r3 = r23;
        r7 = r24;
        r1 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0322, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r1 = r5.f3496r;
        T1.C0212u0.k(r1);
        r1.f3172f.c("Error storing event filter. appId", T1.Z.w(r28), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0335, code lost:
        r25 = r1;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0343, code lost:
        if (r0.hasNext() == false) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0345, code lost:
        r1 = (com.google.android.gms.internal.measurement.zzfr) r0.next();
        r10.p();
        r10.o();
        com.google.android.gms.common.internal.I.d(r28);
        com.google.android.gms.common.internal.I.g(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x035f, code lost:
        if (r1.zze().isEmpty() == false) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0361, code lost:
        r0 = r5.f3496r;
        T1.C0212u0.k(r0);
        r0 = r0.f3175r;
        r4 = T1.Z.w(r28);
        r5 = java.lang.Integer.valueOf(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(java.lang.String r28, java.lang.String r29, java.lang.String r30, byte[] r31) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            java.lang.Object r0 = r1.f398a
            r5 = r0
            T1.u0 r5 = (T1.C0212u0) r5
            r27.p()
            r27.o()
            com.google.android.gms.common.internal.I.d(r28)
            r6 = r31
            com.google.android.gms.internal.measurement.zzgo r0 = r1.u(r2, r6)
            com.google.android.gms.internal.measurement.zzlz r0 = r0.zzch()
            r7 = r0
            com.google.android.gms.internal.measurement.zzgn r7 = (com.google.android.gms.internal.measurement.zzgn) r7
            r1.v(r2, r7)
            com.google.android.gms.internal.measurement.zzmd r0 = r7.zzba()
            com.google.android.gms.internal.measurement.zzgo r0 = (com.google.android.gms.internal.measurement.zzgo) r0
            r1.x(r2, r0)
            com.google.android.gms.internal.measurement.zzmd r0 = r7.zzba()
            com.google.android.gms.internal.measurement.zzgo r0 = (com.google.android.gms.internal.measurement.zzgo) r0
            n.e r8 = r1.f3404q
            r8.put(r2, r0)
            java.lang.String r0 = r7.zzf()
            n.e r9 = r1.f3408u
            r9.put(r2, r0)
            n.e r0 = r1.f3409v
            r0.put(r2, r3)
            n.e r0 = r1.f3410w
            r0.put(r2, r4)
            com.google.android.gms.internal.measurement.zzmd r0 = r7.zzba()
            com.google.android.gms.internal.measurement.zzgo r0 = (com.google.android.gms.internal.measurement.zzgo) r0
            n.e r0 = y(r0)
            n.e r9 = r1.d
            r9.put(r2, r0)
            T1.T1 r9 = r1.f2982b
            T1.n r10 = r9.f3062c
            T1.T1.L(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            java.util.List r0 = r7.zzg()
            r11.<init>(r0)
            java.lang.String r12 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r13 = "event_filters"
            java.lang.String r14 = "property_filters"
            r15 = 0
        L_0x0075:
            int r1 = r11.size()
            if (r15 >= r1) goto L_0x0178
            java.lang.Object r1 = r11.get(r15)
            com.google.android.gms.internal.measurement.zzfh r1 = (com.google.android.gms.internal.measurement.zzfh) r1
            com.google.android.gms.internal.measurement.zzlz r1 = r1.zzch()
            com.google.android.gms.internal.measurement.zzfg r1 = (com.google.android.gms.internal.measurement.zzfg) r1
            int r16 = r1.zza()
            if (r16 == 0) goto L_0x0126
            r16 = r8
            r6 = 0
        L_0x0090:
            int r8 = r1.zza()
            if (r6 >= r8) goto L_0x011d
            com.google.android.gms.internal.measurement.zzfj r8 = r1.zze(r6)
            com.google.android.gms.internal.measurement.zzlz r8 = r8.zzch()
            com.google.android.gms.internal.measurement.zzfi r8 = (com.google.android.gms.internal.measurement.zzfi) r8
            com.google.android.gms.internal.measurement.zzlz r17 = r8.zzaR()
            r4 = r17
            com.google.android.gms.internal.measurement.zzfi r4 = (com.google.android.gms.internal.measurement.zzfi) r4
            java.lang.String r3 = r8.zze()
            r17 = r9
            java.lang.String[] r9 = T1.K0.f2974a
            r18 = r5
            java.lang.String[] r5 = T1.K0.f2976c
            java.lang.String r3 = T1.K0.e(r3, r9, r5)
            if (r3 == 0) goto L_0x00bf
            r4.zzb(r3)
            r3 = 1
            goto L_0x00c0
        L_0x00bf:
            r3 = 0
        L_0x00c0:
            r9 = 0
        L_0x00c1:
            int r5 = r8.zza()
            if (r9 >= r5) goto L_0x00fb
            com.google.android.gms.internal.measurement.zzfl r5 = r8.zzd(r9)
            r20 = r8
            java.lang.String r8 = r5.zze()
            r21 = r7
            java.lang.String[] r7 = T1.K0.f2977e
            r22 = r12
            java.lang.String[] r12 = T1.K0.f2978f
            java.lang.String r7 = T1.K0.e(r8, r7, r12)
            if (r7 == 0) goto L_0x00f2
            com.google.android.gms.internal.measurement.zzlz r3 = r5.zzch()
            com.google.android.gms.internal.measurement.zzfk r3 = (com.google.android.gms.internal.measurement.zzfk) r3
            r3.zza(r7)
            com.google.android.gms.internal.measurement.zzmd r3 = r3.zzba()
            com.google.android.gms.internal.measurement.zzfl r3 = (com.google.android.gms.internal.measurement.zzfl) r3
            r4.zzc(r9, r3)
            r3 = 1
        L_0x00f2:
            int r9 = r9 + 1
            r8 = r20
            r7 = r21
            r12 = r22
            goto L_0x00c1
        L_0x00fb:
            r21 = r7
            r22 = r12
            if (r3 == 0) goto L_0x010d
            r1.zzc(r6, r4)
            com.google.android.gms.internal.measurement.zzmd r3 = r1.zzba()
            com.google.android.gms.internal.measurement.zzfh r3 = (com.google.android.gms.internal.measurement.zzfh) r3
            r11.set(r15, r3)
        L_0x010d:
            int r6 = r6 + 1
            r3 = r29
            r4 = r30
            r9 = r17
            r5 = r18
            r7 = r21
            r12 = r22
            goto L_0x0090
        L_0x011d:
            r18 = r5
            r21 = r7
        L_0x0121:
            r17 = r9
            r22 = r12
            goto L_0x012d
        L_0x0126:
            r18 = r5
            r21 = r7
            r16 = r8
            goto L_0x0121
        L_0x012d:
            int r3 = r1.zzb()
            if (r3 == 0) goto L_0x0164
            r3 = 0
        L_0x0134:
            int r4 = r1.zzb()
            if (r3 >= r4) goto L_0x0164
            com.google.android.gms.internal.measurement.zzfr r4 = r1.zzf(r3)
            java.lang.String r5 = r4.zze()
            java.lang.String[] r6 = T1.K0.f2979i
            java.lang.String[] r7 = T1.K0.f2980j
            java.lang.String r5 = T1.K0.e(r5, r6, r7)
            if (r5 == 0) goto L_0x0161
            com.google.android.gms.internal.measurement.zzlz r4 = r4.zzch()
            com.google.android.gms.internal.measurement.zzfq r4 = (com.google.android.gms.internal.measurement.zzfq) r4
            r4.zza(r5)
            r1.zzd(r3, r4)
            com.google.android.gms.internal.measurement.zzmd r4 = r1.zzba()
            com.google.android.gms.internal.measurement.zzfh r4 = (com.google.android.gms.internal.measurement.zzfh) r4
            r11.set(r15, r4)
        L_0x0161:
            int r3 = r3 + 1
            goto L_0x0134
        L_0x0164:
            int r15 = r15 + 1
            r3 = r29
            r4 = r30
            r6 = r31
            r8 = r16
            r9 = r17
            r5 = r18
            r7 = r21
            r12 = r22
            goto L_0x0075
        L_0x0178:
            r18 = r5
            r21 = r7
            r16 = r8
            r17 = r9
            r22 = r12
            r10.p()
            r10.o()
            com.google.android.gms.common.internal.I.d(r28)
            android.database.sqlite.SQLiteDatabase r1 = r10.k0()
            r1.beginTransaction()
            r10.p()     // Catch:{ all -> 0x01e4 }
            r10.o()     // Catch:{ all -> 0x01e4 }
            com.google.android.gms.common.internal.I.d(r28)     // Catch:{ all -> 0x01e4 }
            android.database.sqlite.SQLiteDatabase r3 = r10.k0()     // Catch:{ all -> 0x01e4 }
            java.lang.String[] r4 = new java.lang.String[]{r28}     // Catch:{ all -> 0x01e4 }
            r3.delete(r14, r0, r4)     // Catch:{ all -> 0x01e4 }
            java.lang.String[] r4 = new java.lang.String[]{r28}     // Catch:{ all -> 0x01e4 }
            r3.delete(r13, r0, r4)     // Catch:{ all -> 0x01e4 }
            java.util.Iterator r3 = r11.iterator()     // Catch:{ all -> 0x01e4 }
        L_0x01b1:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x01e4 }
            java.lang.Object r5 = r10.f398a
            T1.u0 r5 = (T1.C0212u0) r5
            if (r0 == 0) goto L_0x0438
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x01e4 }
            com.google.android.gms.internal.measurement.zzfh r0 = (com.google.android.gms.internal.measurement.zzfh) r0     // Catch:{ all -> 0x01e4 }
            r10.p()     // Catch:{ all -> 0x01e4 }
            r10.o()     // Catch:{ all -> 0x01e4 }
            com.google.android.gms.common.internal.I.d(r28)     // Catch:{ all -> 0x01e4 }
            com.google.android.gms.common.internal.I.g(r0)     // Catch:{ all -> 0x01e4 }
            boolean r6 = r0.zzk()     // Catch:{ all -> 0x01e4 }
            if (r6 != 0) goto L_0x01e9
            T1.Z r0 = r5.f3496r     // Catch:{ all -> 0x01e4 }
            T1.C0212u0.k(r0)     // Catch:{ all -> 0x01e4 }
            T1.X r0 = r0.f3175r     // Catch:{ all -> 0x01e4 }
            java.lang.String r4 = "Audience with no ID. appId"
            T1.Y r5 = T1.Z.w(r28)     // Catch:{ all -> 0x01e4 }
            r0.b(r5, r4)     // Catch:{ all -> 0x01e4 }
            goto L_0x01b1
        L_0x01e4:
            r0 = move-exception
            r25 = r1
            goto L_0x05b2
        L_0x01e9:
            int r6 = r0.zza()     // Catch:{ all -> 0x01e4 }
            java.util.List r7 = r0.zzg()     // Catch:{ all -> 0x01e4 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x01e4 }
        L_0x01f5:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x01e4 }
            if (r8 == 0) goto L_0x021c
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x01e4 }
            com.google.android.gms.internal.measurement.zzfj r8 = (com.google.android.gms.internal.measurement.zzfj) r8     // Catch:{ all -> 0x01e4 }
            boolean r8 = r8.zzp()     // Catch:{ all -> 0x01e4 }
            if (r8 != 0) goto L_0x01f5
            T1.Z r0 = r5.f3496r     // Catch:{ all -> 0x01e4 }
            T1.C0212u0.k(r0)     // Catch:{ all -> 0x01e4 }
            T1.X r0 = r0.f3175r     // Catch:{ all -> 0x01e4 }
            java.lang.String r4 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            T1.Y r5 = T1.Z.w(r28)     // Catch:{ all -> 0x01e4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01e4 }
            r0.c(r4, r5, r6)     // Catch:{ all -> 0x01e4 }
            goto L_0x01b1
        L_0x021c:
            java.util.List r7 = r0.zzh()     // Catch:{ all -> 0x01e4 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x01e4 }
        L_0x0224:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x01e4 }
            if (r8 == 0) goto L_0x024c
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x01e4 }
            com.google.android.gms.internal.measurement.zzfr r8 = (com.google.android.gms.internal.measurement.zzfr) r8     // Catch:{ all -> 0x01e4 }
            boolean r8 = r8.zzj()     // Catch:{ all -> 0x01e4 }
            if (r8 != 0) goto L_0x0224
            T1.Z r0 = r5.f3496r     // Catch:{ all -> 0x01e4 }
            T1.C0212u0.k(r0)     // Catch:{ all -> 0x01e4 }
            T1.X r0 = r0.f3175r     // Catch:{ all -> 0x01e4 }
            java.lang.String r4 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            T1.Y r5 = T1.Z.w(r28)     // Catch:{ all -> 0x01e4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01e4 }
            r0.c(r4, r5, r6)     // Catch:{ all -> 0x01e4 }
            goto L_0x01b1
        L_0x024c:
            java.util.List r7 = r0.zzg()     // Catch:{ all -> 0x01e4 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x01e4 }
        L_0x0254:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x01e4 }
            r19 = -1
            java.lang.String r12 = "data"
            java.lang.String r15 = "session_scoped"
            java.lang.String r4 = "filter_id"
            java.lang.String r9 = "audience_id"
            r23 = r3
            java.lang.String r3 = "app_id"
            if (r8 == 0) goto L_0x0335
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x01e4 }
            com.google.android.gms.internal.measurement.zzfj r8 = (com.google.android.gms.internal.measurement.zzfj) r8     // Catch:{ all -> 0x01e4 }
            r10.p()     // Catch:{ all -> 0x01e4 }
            r10.o()     // Catch:{ all -> 0x01e4 }
            com.google.android.gms.common.internal.I.d(r28)     // Catch:{ all -> 0x01e4 }
            com.google.android.gms.common.internal.I.g(r8)     // Catch:{ all -> 0x01e4 }
            java.lang.String r24 = r8.zzg()     // Catch:{ all -> 0x01e4 }
            boolean r24 = r24.isEmpty()     // Catch:{ all -> 0x01e4 }
            if (r24 == 0) goto L_0x02b0
            T1.Z r0 = r5.f3496r     // Catch:{ all -> 0x01e4 }
            T1.C0212u0.k(r0)     // Catch:{ all -> 0x01e4 }
            T1.X r0 = r0.f3175r     // Catch:{ all -> 0x01e4 }
            java.lang.String r3 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            T1.Y r4 = T1.Z.w(r28)     // Catch:{ all -> 0x01e4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01e4 }
            boolean r7 = r8.zzp()     // Catch:{ all -> 0x01e4 }
            if (r7 == 0) goto L_0x02a4
            int r7 = r8.zzb()     // Catch:{ all -> 0x01e4 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01e4 }
            goto L_0x02a5
        L_0x02a4:
            r7 = 0
        L_0x02a5:
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x01e4 }
            r0.d(r3, r4, r5, r7)     // Catch:{ all -> 0x01e4 }
            r25 = r1
            goto L_0x040b
        L_0x02b0:
            r24 = r7
            byte[] r7 = r8.zzcd()     // Catch:{ all -> 0x01e4 }
            r25 = r1
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x02d6 }
            r1.<init>()     // Catch:{ all -> 0x02d6 }
            r1.put(r3, r2)     // Catch:{ all -> 0x02d6 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x02d6 }
            r1.put(r9, r3)     // Catch:{ all -> 0x02d6 }
            boolean r3 = r8.zzp()     // Catch:{ all -> 0x02d6 }
            if (r3 == 0) goto L_0x02d9
            int r3 = r8.zzb()     // Catch:{ all -> 0x02d6 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x02d6 }
            goto L_0x02da
        L_0x02d6:
            r0 = move-exception
            goto L_0x05b2
        L_0x02d9:
            r3 = 0
        L_0x02da:
            r1.put(r4, r3)     // Catch:{ all -> 0x02d6 }
            java.lang.String r3 = "event_name"
            java.lang.String r4 = r8.zzg()     // Catch:{ all -> 0x02d6 }
            r1.put(r3, r4)     // Catch:{ all -> 0x02d6 }
            boolean r3 = r8.zzq()     // Catch:{ all -> 0x02d6 }
            if (r3 == 0) goto L_0x02f5
            boolean r3 = r8.zzn()     // Catch:{ all -> 0x02d6 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x02d6 }
            goto L_0x02f6
        L_0x02f5:
            r3 = 0
        L_0x02f6:
            r1.put(r15, r3)     // Catch:{ all -> 0x02d6 }
            r1.put(r12, r7)     // Catch:{ all -> 0x02d6 }
            android.database.sqlite.SQLiteDatabase r3 = r10.k0()     // Catch:{ SQLiteException -> 0x0322 }
            r4 = 0
            r7 = 5
            long r7 = r3.insertWithOnConflict(r13, r4, r1, r7)     // Catch:{ SQLiteException -> 0x0322 }
            int r1 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r1 != 0) goto L_0x031a
            T1.Z r1 = r5.f3496r     // Catch:{ SQLiteException -> 0x0322 }
            T1.C0212u0.k(r1)     // Catch:{ SQLiteException -> 0x0322 }
            T1.X r1 = r1.f3172f     // Catch:{ SQLiteException -> 0x0322 }
            java.lang.String r3 = "Failed to insert event filter (got -1). appId"
            T1.Y r4 = T1.Z.w(r28)     // Catch:{ SQLiteException -> 0x0322 }
            r1.b(r4, r3)     // Catch:{ SQLiteException -> 0x0322 }
        L_0x031a:
            r3 = r23
            r7 = r24
            r1 = r25
            goto L_0x0254
        L_0x0322:
            r0 = move-exception
            T1.Z r1 = r5.f3496r     // Catch:{ all -> 0x02d6 }
            T1.C0212u0.k(r1)     // Catch:{ all -> 0x02d6 }
            T1.X r1 = r1.f3172f     // Catch:{ all -> 0x02d6 }
            java.lang.String r3 = "Error storing event filter. appId"
            T1.Y r4 = T1.Z.w(r28)     // Catch:{ all -> 0x02d6 }
            r1.c(r3, r4, r0)     // Catch:{ all -> 0x02d6 }
            goto L_0x040b
        L_0x0335:
            r25 = r1
            java.util.List r0 = r0.zzh()     // Catch:{ all -> 0x02d6 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x02d6 }
        L_0x033f:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x02d6 }
            if (r1 == 0) goto L_0x0432
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x02d6 }
            com.google.android.gms.internal.measurement.zzfr r1 = (com.google.android.gms.internal.measurement.zzfr) r1     // Catch:{ all -> 0x02d6 }
            r10.p()     // Catch:{ all -> 0x02d6 }
            r10.o()     // Catch:{ all -> 0x02d6 }
            com.google.android.gms.common.internal.I.d(r28)     // Catch:{ all -> 0x02d6 }
            com.google.android.gms.common.internal.I.g(r1)     // Catch:{ all -> 0x02d6 }
            java.lang.String r7 = r1.zze()     // Catch:{ all -> 0x02d6 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x02d6 }
            if (r7 == 0) goto L_0x038b
            T1.Z r0 = r5.f3496r     // Catch:{ all -> 0x02d6 }
            T1.C0212u0.k(r0)     // Catch:{ all -> 0x02d6 }
            T1.X r0 = r0.f3175r     // Catch:{ all -> 0x02d6 }
            java.lang.String r3 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            T1.Y r4 = T1.Z.w(r28)     // Catch:{ all -> 0x02d6 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x02d6 }
            boolean r7 = r1.zzj()     // Catch:{ all -> 0x02d6 }
            if (r7 == 0) goto L_0x0381
            int r1 = r1.zza()     // Catch:{ all -> 0x02d6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x02d6 }
            goto L_0x0382
        L_0x0381:
            r1 = 0
        L_0x0382:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x02d6 }
            r0.d(r3, r4, r5, r1)     // Catch:{ all -> 0x02d6 }
            goto L_0x040b
        L_0x038b:
            byte[] r7 = r1.zzcd()     // Catch:{ all -> 0x02d6 }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x02d6 }
            r8.<init>()     // Catch:{ all -> 0x02d6 }
            r8.put(r3, r2)     // Catch:{ all -> 0x02d6 }
            r24 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x02d6 }
            r8.put(r9, r0)     // Catch:{ all -> 0x02d6 }
            boolean r0 = r1.zzj()     // Catch:{ all -> 0x02d6 }
            if (r0 == 0) goto L_0x03af
            int r0 = r1.zza()     // Catch:{ all -> 0x02d6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02d6 }
            goto L_0x03b0
        L_0x03af:
            r0 = 0
        L_0x03b0:
            r8.put(r4, r0)     // Catch:{ all -> 0x02d6 }
            java.lang.String r0 = "property_name"
            r26 = r3
            java.lang.String r3 = r1.zze()     // Catch:{ all -> 0x02d6 }
            r8.put(r0, r3)     // Catch:{ all -> 0x02d6 }
            boolean r0 = r1.zzk()     // Catch:{ all -> 0x02d6 }
            if (r0 == 0) goto L_0x03cd
            boolean r0 = r1.zzi()     // Catch:{ all -> 0x02d6 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x02d6 }
            goto L_0x03ce
        L_0x03cd:
            r0 = 0
        L_0x03ce:
            r8.put(r15, r0)     // Catch:{ all -> 0x02d6 }
            r8.put(r12, r7)     // Catch:{ all -> 0x02d6 }
            android.database.sqlite.SQLiteDatabase r0 = r10.k0()     // Catch:{ SQLiteException -> 0x03f3 }
            r1 = 0
            r3 = 5
            long r7 = r0.insertWithOnConflict(r14, r1, r8, r3)     // Catch:{ SQLiteException -> 0x03f3 }
            int r0 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x03f5
            T1.Z r0 = r5.f3496r     // Catch:{ SQLiteException -> 0x03f3 }
            T1.C0212u0.k(r0)     // Catch:{ SQLiteException -> 0x03f3 }
            T1.X r0 = r0.f3172f     // Catch:{ SQLiteException -> 0x03f3 }
            java.lang.String r1 = "Failed to insert property filter (got -1). appId"
            T1.Y r3 = T1.Z.w(r28)     // Catch:{ SQLiteException -> 0x03f3 }
            r0.b(r3, r1)     // Catch:{ SQLiteException -> 0x03f3 }
            goto L_0x040b
        L_0x03f3:
            r0 = move-exception
            goto L_0x03fb
        L_0x03f5:
            r0 = r24
            r3 = r26
            goto L_0x033f
        L_0x03fb:
            T1.Z r1 = r5.f3496r     // Catch:{ all -> 0x02d6 }
            T1.C0212u0.k(r1)     // Catch:{ all -> 0x02d6 }
            T1.X r1 = r1.f3172f     // Catch:{ all -> 0x02d6 }
            java.lang.String r3 = "Error storing property filter. appId"
            T1.Y r4 = T1.Z.w(r28)     // Catch:{ all -> 0x02d6 }
            r1.c(r3, r4, r0)     // Catch:{ all -> 0x02d6 }
        L_0x040b:
            r10.p()     // Catch:{ all -> 0x02d6 }
            r10.o()     // Catch:{ all -> 0x02d6 }
            com.google.android.gms.common.internal.I.d(r28)     // Catch:{ all -> 0x02d6 }
            android.database.sqlite.SQLiteDatabase r0 = r10.k0()     // Catch:{ all -> 0x02d6 }
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x02d6 }
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}     // Catch:{ all -> 0x02d6 }
            r3 = r22
            r0.delete(r14, r3, r1)     // Catch:{ all -> 0x02d6 }
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x02d6 }
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}     // Catch:{ all -> 0x02d6 }
            r0.delete(r13, r3, r1)     // Catch:{ all -> 0x02d6 }
            r22 = r3
        L_0x0432:
            r3 = r23
            r1 = r25
            goto L_0x01b1
        L_0x0438:
            r25 = r1
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x02d6 }
            r0.<init>()     // Catch:{ all -> 0x02d6 }
            java.util.Iterator r1 = r11.iterator()     // Catch:{ all -> 0x02d6 }
        L_0x0443:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x02d6 }
            if (r3 == 0) goto L_0x0463
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x02d6 }
            com.google.android.gms.internal.measurement.zzfh r3 = (com.google.android.gms.internal.measurement.zzfh) r3     // Catch:{ all -> 0x02d6 }
            boolean r4 = r3.zzk()     // Catch:{ all -> 0x02d6 }
            if (r4 == 0) goto L_0x045e
            int r3 = r3.zza()     // Catch:{ all -> 0x02d6 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x02d6 }
            goto L_0x045f
        L_0x045e:
            r4 = 0
        L_0x045f:
            r0.add(r4)     // Catch:{ all -> 0x02d6 }
            goto L_0x0443
        L_0x0463:
            com.google.android.gms.common.internal.I.d(r28)     // Catch:{ all -> 0x02d6 }
            r10.p()     // Catch:{ all -> 0x02d6 }
            r10.o()     // Catch:{ all -> 0x02d6 }
            android.database.sqlite.SQLiteDatabase r1 = r10.k0()     // Catch:{ all -> 0x02d6 }
            java.lang.String r3 = "select count(1) from audience_filter_values where app_id=?"
            java.lang.String[] r4 = new java.lang.String[]{r28}     // Catch:{ SQLiteException -> 0x04f5 }
            long r3 = r10.f0(r3, r4)     // Catch:{ SQLiteException -> 0x04f5 }
            T1.g r5 = r5.f3494p     // Catch:{ all -> 0x02d6 }
            T1.G r6 = T1.H.f2879T     // Catch:{ all -> 0x02d6 }
            int r5 = r5.u(r2, r6)     // Catch:{ all -> 0x02d6 }
            r6 = 2000(0x7d0, float:2.803E-42)
            int r5 = java.lang.Math.min(r6, r5)     // Catch:{ all -> 0x02d6 }
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)     // Catch:{ all -> 0x02d6 }
            long r7 = (long) r5     // Catch:{ all -> 0x02d6 }
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0493
            goto L_0x0506
        L_0x0493:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x02d6 }
            r3.<init>()     // Catch:{ all -> 0x02d6 }
            r15 = r6
        L_0x0499:
            int r4 = r0.size()     // Catch:{ all -> 0x02d6 }
            if (r15 >= r4) goto L_0x04b5
            java.lang.Object r4 = r0.get(r15)     // Catch:{ all -> 0x02d6 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x02d6 }
            if (r4 == 0) goto L_0x0506
            int r4 = r4.intValue()     // Catch:{ all -> 0x02d6 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x02d6 }
            r3.add(r4)     // Catch:{ all -> 0x02d6 }
            int r15 = r15 + 1
            goto L_0x0499
        L_0x04b5:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r3)     // Catch:{ all -> 0x02d6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d6 }
            r3.<init>()     // Catch:{ all -> 0x02d6 }
            java.lang.String r4 = "("
            r3.append(r4)     // Catch:{ all -> 0x02d6 }
            r3.append(r0)     // Catch:{ all -> 0x02d6 }
            java.lang.String r0 = ")"
            r3.append(r0)     // Catch:{ all -> 0x02d6 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x02d6 }
            java.lang.String r3 = "audience_filter_values"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d6 }
            r4.<init>()     // Catch:{ all -> 0x02d6 }
            java.lang.String r6 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r4.append(r6)     // Catch:{ all -> 0x02d6 }
            r4.append(r0)     // Catch:{ all -> 0x02d6 }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r4.append(r0)     // Catch:{ all -> 0x02d6 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x02d6 }
            java.lang.String r4 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x02d6 }
            java.lang.String[] r4 = new java.lang.String[]{r2, r4}     // Catch:{ all -> 0x02d6 }
            r1.delete(r3, r0, r4)     // Catch:{ all -> 0x02d6 }
            goto L_0x0506
        L_0x04f5:
            r0 = move-exception
            T1.Z r1 = r5.f3496r     // Catch:{ all -> 0x02d6 }
            T1.C0212u0.k(r1)     // Catch:{ all -> 0x02d6 }
            T1.X r1 = r1.f3172f     // Catch:{ all -> 0x02d6 }
            java.lang.String r3 = "Database error querying filters. appId"
            T1.Y r4 = T1.Z.w(r28)     // Catch:{ all -> 0x02d6 }
            r1.c(r3, r4, r0)     // Catch:{ all -> 0x02d6 }
        L_0x0506:
            r25.setTransactionSuccessful()     // Catch:{ all -> 0x02d6 }
            r25.endTransaction()
            r21.zzc()     // Catch:{ RuntimeException -> 0x051e }
            com.google.android.gms.internal.measurement.zzmd r0 = r21.zzba()     // Catch:{ RuntimeException -> 0x051e }
            com.google.android.gms.internal.measurement.zzgo r0 = (com.google.android.gms.internal.measurement.zzgo) r0     // Catch:{ RuntimeException -> 0x051e }
            byte[] r0 = r0.zzcd()     // Catch:{ RuntimeException -> 0x051e }
            r3 = r17
            r1 = r18
            goto L_0x0535
        L_0x051e:
            r0 = move-exception
            r1 = r18
            T1.Z r3 = r1.f3496r
            T1.C0212u0.k(r3)
            T1.Y r4 = T1.Z.w(r28)
            java.lang.String r5 = "Unable to serialize reduced-size config. Storing full config instead. appId"
            T1.X r3 = r3.f3175r
            r3.c(r5, r4, r0)
            r0 = r31
            r3 = r17
        L_0x0535:
            T1.n r3 = r3.f3062c
            T1.T1.L(r3)
            java.lang.Object r4 = r3.f398a
            T1.u0 r4 = (T1.C0212u0) r4
            com.google.android.gms.common.internal.I.d(r28)
            r3.o()
            r3.p()
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r6 = "remote_config"
            r5.put(r6, r0)
            java.lang.String r0 = "config_last_modified_time"
            r6 = r29
            r5.put(r0, r6)
            java.lang.String r0 = "e_tag"
            r6 = r30
            r5.put(r0, r6)
            android.database.sqlite.SQLiteDatabase r0 = r3.k0()     // Catch:{ SQLiteException -> 0x0587 }
            java.lang.String r3 = "apps"
            java.lang.String r6 = "app_id = ?"
            java.lang.String[] r7 = new java.lang.String[]{r28}     // Catch:{ SQLiteException -> 0x0587 }
            int r0 = r0.update(r3, r5, r6, r7)     // Catch:{ SQLiteException -> 0x0587 }
            long r5 = (long) r0     // Catch:{ SQLiteException -> 0x0587 }
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0598
            T1.Z r0 = r4.f3496r     // Catch:{ SQLiteException -> 0x0587 }
            T1.C0212u0.k(r0)     // Catch:{ SQLiteException -> 0x0587 }
            T1.X r0 = r0.f3172f     // Catch:{ SQLiteException -> 0x0587 }
            java.lang.String r3 = "Failed to update remote config (got 0). appId"
            T1.Y r5 = T1.Z.w(r28)     // Catch:{ SQLiteException -> 0x0587 }
            r0.b(r5, r3)     // Catch:{ SQLiteException -> 0x0587 }
            goto L_0x0598
        L_0x0587:
            r0 = move-exception
            T1.Z r3 = r4.f3496r
            T1.C0212u0.k(r3)
            T1.Y r4 = T1.Z.w(r28)
            java.lang.String r5 = "Error storing remote config. appId"
            T1.X r3 = r3.f3172f
            r3.c(r5, r4, r0)
        L_0x0598:
            T1.g r0 = r1.f3494p
            T1.G r1 = T1.H.f2929n1
            r3 = 0
            boolean r0 = r0.B(r3, r1)
            if (r0 == 0) goto L_0x05a6
            r21.zzd()
        L_0x05a6:
            com.google.android.gms.internal.measurement.zzmd r0 = r21.zzba()
            com.google.android.gms.internal.measurement.zzgo r0 = (com.google.android.gms.internal.measurement.zzgo) r0
            r1 = r16
            r1.put(r2, r0)
            return
        L_0x05b2:
            r25.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0192n0.I(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final String a(String str, String str2) {
        o();
        w(str);
        Map map = (Map) this.d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final boolean s(String str) {
        o();
        w(str);
        e eVar = this.f3401e;
        if (eVar.get(str) == null || !((Set) eVar.get(str)).contains("app_instance_id")) {
            return false;
        }
        return true;
    }

    public final boolean t(String str) {
        o();
        w(str);
        e eVar = this.f3401e;
        if (eVar.get(str) == null) {
            return false;
        }
        if (((Set) eVar.get(str)).contains("os_version")) {
            return true;
        }
        if (!((Set) eVar.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    public final zzgo u(String str, byte[] bArr) {
        Long l6;
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (bArr == null) {
            return zzgo.zzh();
        }
        try {
            zzgo zzgo = (zzgo) ((zzgn) C0162d0.U(zzgo.zzf(), bArr)).zzba();
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            X x6 = z3.f3180w;
            String str2 = null;
            if (zzgo.zzw()) {
                l6 = Long.valueOf(zzgo.zzc());
            } else {
                l6 = null;
            }
            if (zzgo.zzu()) {
                str2 = zzgo.zzj();
            }
            x6.c("Parsed config. version, gmp_app_id", l6, str2);
            return zzgo;
        } catch (zzmm e6) {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3175r.c("Unable to merge remote config. appId", Z.w(str), e6);
            return zzgo.zzh();
        } catch (RuntimeException e7) {
            Z z5 = u0Var.f3496r;
            C0212u0.k(z5);
            z5.f3175r.c("Unable to merge remote config. appId", Z.w(str), e7);
            return zzgo.zzh();
        }
    }

    public final void v(String str, zzgn zzgn) {
        HashSet hashSet = new HashSet();
        j jVar = new j(0);
        j jVar2 = new j(0);
        j jVar3 = new j(0);
        for (zzgk zzb : zzgn.zzh()) {
            hashSet.add(zzb.zzb());
        }
        for (int i2 = 0; i2 < zzgn.zza(); i2++) {
            zzgl zzgl = (zzgl) zzgn.zzb(i2).zzch();
            boolean isEmpty = zzgl.zzc().isEmpty();
            C0212u0 u0Var = (C0212u0) this.f398a;
            if (isEmpty) {
                Z z3 = u0Var.f3496r;
                C0212u0.k(z3);
                z3.f3175r.a("EventConfig contained null event name");
            } else {
                String zzc = zzgl.zzc();
                String e6 = K0.e(zzgl.zzc(), K0.f2974a, K0.f2976c);
                if (!TextUtils.isEmpty(e6)) {
                    zzgl.zzb(e6);
                    zzgn.zze(i2, zzgl);
                }
                if (zzgl.zzf() && zzgl.zzd()) {
                    jVar.put(zzc, Boolean.TRUE);
                }
                if (zzgl.zzg() && zzgl.zze()) {
                    jVar2.put(zzgl.zzc(), Boolean.TRUE);
                }
                if (zzgl.zzh()) {
                    if (zzgl.zza() < 2 || zzgl.zza() > 65535) {
                        Z z4 = u0Var.f3496r;
                        C0212u0.k(z4);
                        z4.f3175r.c("Invalid sampling rate. Event name, sample rate", zzgl.zzc(), Integer.valueOf(zzgl.zza()));
                    } else {
                        jVar3.put(zzgl.zzc(), Integer.valueOf(zzgl.zza()));
                    }
                }
            }
        }
        this.f3401e.put(str, hashSet);
        this.f3402f.put(str, jVar);
        this.f3403p.put(str, jVar2);
        this.f3405r.put(str, jVar3);
    }

    public final void w(String str) {
        p();
        o();
        I.d(str);
        e eVar = this.f3404q;
        if (eVar.get(str) == null) {
            C0191n nVar = this.f2982b.f3062c;
            T1.L(nVar);
            C0009h n02 = nVar.n0(str);
            e eVar2 = this.f3410w;
            e eVar3 = this.f3409v;
            e eVar4 = this.f3408u;
            e eVar5 = this.d;
            if (n02 == null) {
                eVar5.put(str, (Object) null);
                this.f3402f.put(str, (Object) null);
                this.f3401e.put(str, (Object) null);
                this.f3403p.put(str, (Object) null);
                eVar.put(str, (Object) null);
                eVar4.put(str, (Object) null);
                eVar3.put(str, (Object) null);
                eVar2.put(str, (Object) null);
                this.f3405r.put(str, (Object) null);
                return;
            }
            zzgn zzgn = (zzgn) u(str, (byte[]) n02.f228b).zzch();
            v(str, zzgn);
            eVar5.put(str, y((zzgo) zzgn.zzba()));
            eVar.put(str, (zzgo) zzgn.zzba());
            x(str, (zzgo) zzgn.zzba());
            eVar4.put(str, zzgn.zzf());
            eVar3.put(str, (String) n02.f229c);
            eVar2.put(str, (String) n02.d);
        }
    }

    public final void x(String str, zzgo zzgo) {
        int zza = zzgo.zza();
        C0189m0 m0Var = this.f3406s;
        if (zza != 0) {
            C0212u0 u0Var = (C0212u0) this.f398a;
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3180w.b(Integer.valueOf(zzgo.zza()), "EES programs found");
            zziv zziv = (zziv) zzgo.zzo().get(0);
            try {
                zzc zzc = new zzc();
                zzc.zzd("internal.remoteConfig", new C0183k0(this, str, 0));
                zzc.zzd("internal.appMetadata", new C0183k0(this, str, 1));
                zzc.zzd("internal.logger", new C0186l0(this, 0));
                zzc.zzc(zziv);
                m0Var.put(str, zzc);
                C0212u0.k(z3);
                X x6 = z3.f3180w;
                x6.c("EES program loaded for appId, activities", str, Integer.valueOf(zziv.zza().zza()));
                for (zzit zzb : zziv.zza().zzd()) {
                    C0212u0.k(z3);
                    x6.b(zzb.zzb(), "EES program activity");
                }
            } catch (zzd unused) {
                Z z4 = u0Var.f3496r;
                C0212u0.k(z4);
                z4.f3172f.b(str, "Failed to load EES program. appId");
            }
        } else {
            m0Var.remove(str);
        }
    }

    public final void r() {
    }
}
