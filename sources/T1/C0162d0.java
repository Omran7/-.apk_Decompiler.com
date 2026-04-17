package T1;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzhc;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhi;
import com.google.android.gms.internal.measurement.zzhk;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzhm;
import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzie;
import com.google.android.gms.internal.measurement.zzim;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzlp;
import com.google.android.gms.internal.measurement.zzlz;
import com.google.android.gms.internal.measurement.zzng;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzrd;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* renamed from: T1.d0  reason: case insensitive filesystem */
public final class C0162d0 extends O1 {
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0162d0(T1 t12, int i2) {
        super(t12);
        this.d = i2;
    }

    public static final void B(int i2, StringBuilder sb) {
        for (int i5 = 0; i5 < i2; i5++) {
            sb.append("  ");
        }
    }

    public static final void C(Uri.Builder builder, String str, String str2, Set set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    public static final String D(boolean z3, boolean z4, boolean z5) {
        StringBuilder sb = new StringBuilder();
        if (z3) {
            sb.append("Dynamic ");
        }
        if (z4) {
            sb.append("Sequence ");
        }
        if (z5) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void E(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String split : strArr) {
            String[] split2 = split.split(",");
            String str = split2[0];
            String str2 = split2[split2.length - 1];
            String string = bundle.getString(str);
            if (string != null) {
                C(builder, str2, string, set);
            }
        }
    }

    public static final void F(StringBuilder sb, String str, zzic zzic) {
        Integer num;
        Integer num2;
        Long l6;
        if (zzic != null) {
            B(3, sb);
            sb.append(str);
            sb.append(" {\n");
            if (zzic.zzb() != 0) {
                B(4, sb);
                sb.append("results: ");
                int i2 = 0;
                for (Long l7 : zzic.zzi()) {
                    int i5 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l7);
                    i2 = i5;
                }
                sb.append(10);
            }
            if (zzic.zzd() != 0) {
                B(4, sb);
                sb.append("status: ");
                int i6 = 0;
                for (Long l8 : zzic.zzk()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l8);
                    i6 = i7;
                }
                sb.append(10);
            }
            if (zzic.zza() != 0) {
                B(4, sb);
                sb.append("dynamic_filter_timestamps: {");
                int i8 = 0;
                for (zzhk zzhk : zzic.zzh()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    if (zzhk.zzh()) {
                        num2 = Integer.valueOf(zzhk.zza());
                    } else {
                        num2 = null;
                    }
                    sb.append(num2);
                    sb.append(":");
                    if (zzhk.zzg()) {
                        l6 = Long.valueOf(zzhk.zzb());
                    } else {
                        l6 = null;
                    }
                    sb.append(l6);
                    i8 = i9;
                }
                sb.append("}\n");
            }
            if (zzic.zzc() != 0) {
                B(4, sb);
                sb.append("sequence_filter_timestamps: {");
                int i10 = 0;
                for (zzie zzie : zzic.zzj()) {
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    if (zzie.zzi()) {
                        num = Integer.valueOf(zzie.zzb());
                    } else {
                        num = null;
                    }
                    sb.append(num);
                    sb.append(": [");
                    int i12 = 0;
                    for (Long longValue : zzie.zzf()) {
                        long longValue2 = longValue.longValue();
                        int i13 = i12 + 1;
                        if (i12 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i12 = i13;
                    }
                    sb.append("]");
                    i10 = i11;
                }
                sb.append("}\n");
            }
            B(3, sb);
            sb.append("}\n");
        }
    }

    public static final void G(StringBuilder sb, int i2, String str, Object obj) {
        if (obj != null) {
            B(i2 + 1, sb);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    public static final void H(StringBuilder sb, int i2, String str, zzfp zzfp) {
        String str2;
        if (zzfp != null) {
            B(i2, sb);
            sb.append(str);
            sb.append(" {\n");
            if (zzfp.zzg()) {
                int zzm = zzfp.zzm();
                if (zzm == 1) {
                    str2 = "UNKNOWN_COMPARISON_TYPE";
                } else if (zzm == 2) {
                    str2 = "LESS_THAN";
                } else if (zzm == 3) {
                    str2 = "GREATER_THAN";
                } else if (zzm != 4) {
                    str2 = "BETWEEN";
                } else {
                    str2 = "EQUAL";
                }
                G(sb, i2, "comparison_type", str2);
            }
            if (zzfp.zzi()) {
                G(sb, i2, "match_as_float", Boolean.valueOf(zzfp.zzf()));
            }
            if (zzfp.zzh()) {
                G(sb, i2, "comparison_value", zzfp.zzc());
            }
            if (zzfp.zzk()) {
                G(sb, i2, "min_comparison_value", zzfp.zze());
            }
            if (zzfp.zzj()) {
                G(sb, i2, "max_comparison_value", zzfp.zzd());
            }
            B(i2, sb);
            sb.append("}\n");
        }
    }

    public static int I(zzhw zzhw, String str) {
        for (int i2 = 0; i2 < zzhw.zzd(); i2++) {
            if (str.equals(zzhw.zzaE(i2).zzg())) {
                return i2;
            }
        }
        return -1;
    }

    public static Bundle P(Map map, boolean z3) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z3) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList2.add(P((Map) arrayList.get(i2), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static C0214v R(zzaa zzaa) {
        String str;
        Object obj;
        Bundle P5 = P(zzaa.zzf(), true);
        if (!P5.containsKey("_o") || (obj = P5.get("_o")) == null) {
            str = "app";
        } else {
            str = obj.toString();
        }
        String str2 = str;
        String e6 = K0.e(zzaa.zze(), K0.f2974a, K0.f2976c);
        if (e6 == null) {
            e6 = zzaa.zze();
        }
        return new C0214v(e6, new C0211u(P5), str2, zzaa.zza());
    }

    public static zzng U(zzlz zzlz, byte[] bArr) {
        zzlp zza = zzlp.zza();
        if (zza != null) {
            return zzlz.zzaV(bArr, zza);
        }
        return zzlz.zzaU(bArr);
    }

    public static ArrayList Y(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            long j6 = 0;
            for (int i5 = 0; i5 < 64; i5++) {
                int i6 = (i2 * 64) + i5;
                if (i6 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i6)) {
                    j6 |= 1 << i5;
                }
            }
            arrayList.add(Long.valueOf(j6));
        }
        return arrayList;
    }

    public static HashMap Z(Bundle bundle, boolean z3) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            boolean z4 = obj instanceof Parcelable[];
            if (z4 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z3) {
                    ArrayList arrayList = new ArrayList();
                    if (z4) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(Z((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            Object obj2 = arrayList2.get(i2);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(Z((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(Z((Bundle) obj, false));
                    }
                    hashMap.put(next, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public static boolean c0(int i2, List list) {
        if (i2 >= list.size() * 64) {
            return false;
        }
        if (((1 << (i2 % 64)) & ((Long) list.get(i2 / 64)).longValue()) != 0) {
            return true;
        }
        return false;
    }

    public static boolean s(String str) {
        if (str == null || !str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") || str.length() > 310) {
            return false;
        }
        return true;
    }

    public static Bundle[] u(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            zzhq zzhq = (zzhq) it2.next();
            if (zzhq != null) {
                Bundle bundle = new Bundle();
                for (zzhq zzhq2 : zzhq.zzi()) {
                    if (zzhq2.zzy()) {
                        bundle.putString(zzhq2.zzg(), zzhq2.zzh());
                    } else if (zzhq2.zzw()) {
                        bundle.putLong(zzhq2.zzg(), zzhq2.zzd());
                    } else if (zzhq2.zzu()) {
                        bundle.putDouble(zzhq2.zzg(), zzhq2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void v(zzhl zzhl, String str, Long l6) {
        List zzp = zzhl.zzp();
        int i2 = 0;
        while (true) {
            if (i2 >= zzp.size()) {
                i2 = -1;
                break;
            } else if (str.equals(((zzhq) zzp.get(i2)).zzg())) {
                break;
            } else {
                i2++;
            }
        }
        zzhp zze = zzhq.zze();
        zze.zzj(str);
        zze.zzi(l6.longValue());
        if (i2 >= 0) {
            zzhl.zzj(i2, zze);
        } else {
            zzhl.zze(zze);
        }
    }

    public static final Bundle w(List list) {
        Bundle bundle = new Bundle();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            zzhq zzhq = (zzhq) it2.next();
            String zzg = zzhq.zzg();
            if (zzhq.zzu()) {
                bundle.putDouble(zzg, zzhq.zza());
            } else if (zzhq.zzv()) {
                bundle.putFloat(zzg, zzhq.zzb());
            } else if (zzhq.zzy()) {
                bundle.putString(zzg, zzhq.zzh());
            } else if (zzhq.zzw()) {
                bundle.putLong(zzg, zzhq.zzd());
            }
        }
        return bundle;
    }

    public static final zzhq x(zzhm zzhm, String str) {
        for (zzhq zzhq : zzhm.zzi()) {
            if (zzhq.zzg().equals(str)) {
                return zzhq;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable y(zzhm zzhm, String str) {
        zzhq x6 = x(zzhm, str);
        if (x6 == null) {
            return null;
        }
        if (x6.zzy()) {
            return x6.zzh();
        }
        if (x6.zzw()) {
            return Long.valueOf(x6.zzd());
        }
        if (x6.zzu()) {
            return Double.valueOf(x6.zza());
        }
        if (x6.zzc() > 0) {
            return u(x6.zzi());
        }
        return null;
    }

    public void A(StringBuilder sb, int i2, zzfl zzfl) {
        String str;
        if (zzfl != null) {
            B(i2, sb);
            sb.append("filter {\n");
            if (zzfl.zzh()) {
                G(sb, i2, "complement", Boolean.valueOf(zzfl.zzg()));
            }
            if (zzfl.zzj()) {
                G(sb, i2, "param_name", ((C0212u0) this.f398a).f3500v.e(zzfl.zze()));
            }
            if (zzfl.zzk()) {
                int i5 = i2 + 1;
                zzfv zzd = zzfl.zzd();
                if (zzd != null) {
                    B(i5, sb);
                    sb.append("string_filter {\n");
                    if (zzd.zzi()) {
                        switch (zzd.zzj()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case zzaky.zzf.zzf /*6*/:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        G(sb, i5, "match_type", str);
                    }
                    if (zzd.zzh()) {
                        G(sb, i5, "expression", zzd.zzd());
                    }
                    if (zzd.zzg()) {
                        G(sb, i5, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                    }
                    if (zzd.zza() > 0) {
                        B(i2 + 2, sb);
                        sb.append("expression_list {\n");
                        for (String append : zzd.zze()) {
                            B(i2 + 3, sb);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    B(i5, sb);
                    sb.append("}\n");
                }
            }
            if (zzfl.zzi()) {
                H(sb, i2 + 1, "number_filter", zzfl.zzc());
            }
            B(i2, sb);
            sb.append("}\n");
        }
    }

    public void M(String str, P1 p12, zzhv zzhv, C0156b0 b0Var) {
        String str2 = p12.f3020a;
        C0212u0 u0Var = (C0212u0) this.f398a;
        o();
        p();
        try {
            URL url = new URI(str2).toURL();
            this.f2982b.a();
            byte[] zzcd = zzhv.zzcd();
            C0203r0 r0Var = u0Var.f3497s;
            C0212u0.k(r0Var);
            Map map = p12.f3021b;
            if (map == null) {
                map = Collections.emptyMap();
            }
            r0Var.x(new C0159c0(this, str, url, zzcd, map, b0Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3172f.c("Failed to parse URL. Not uploading MeasurementBatch. appId", Z.w(str), str2);
        }
    }

    public boolean N() {
        p();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C0212u0) this.f398a).f3489a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public long O(byte[] bArr) {
        I.g(bArr);
        C0212u0 u0Var = (C0212u0) this.f398a;
        Y1 y12 = u0Var.f3499u;
        C0212u0.i(y12);
        y12.o();
        MessageDigest z3 = Y1.z();
        if (z3 != null) {
            return Y1.x0(z3.digest(bArr));
        }
        Z z4 = u0Var.f3496r;
        C0212u0.k(z4);
        z4.f3172f.a("Failed to get MD5");
        return 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r5 = ((T1.C0212u0) r4.f398a).f3496r;
        T1.C0212u0.k(r5);
        r5.f3172f.a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable Q(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ b -> 0x001a }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ b -> 0x001a }
            r1.setDataPosition(r3)     // Catch:{ b -> 0x001a }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ b -> 0x001a }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ b -> 0x001a }
            r0 = r5
            goto L_0x002a
        L_0x0018:
            r5 = move-exception
            goto L_0x002e
        L_0x001a:
            java.lang.Object r5 = r4.f398a     // Catch:{ all -> 0x0018 }
            T1.u0 r5 = (T1.C0212u0) r5     // Catch:{ all -> 0x0018 }
            T1.Z r5 = r5.f3496r     // Catch:{ all -> 0x0018 }
            T1.C0212u0.k(r5)     // Catch:{ all -> 0x0018 }
            T1.X r5 = r5.f3172f     // Catch:{ all -> 0x0018 }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x0018 }
        L_0x002a:
            r1.recycle()
            return r0
        L_0x002e:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0162d0.Q(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    public I1 S(String str, zzhw zzhw, zzhl zzhl, String str2) {
        int indexOf;
        String str3 = str;
        zzqr.zzb();
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (!u0Var.f3494p.B(str3, H.f2884V0)) {
            return null;
        }
        u0Var.f3501w.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        G g = H.f2944t0;
        C0170g gVar = u0Var.f3494p;
        String[] split = gVar.A(str3, g).split(",");
        int length = split.length;
        HashSet hashSet = new HashSet(length);
        int i2 = 0;
        while (i2 < length) {
            String str4 = split[i2];
            Objects.requireNonNull(str4);
            if (hashSet.add(str4)) {
                i2++;
            } else {
                throw new IllegalArgumentException("duplicate element: ".concat(str4));
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        T1 t12 = this.f2982b;
        Q1 q12 = t12.f3068s;
        C0192n0 n0Var = q12.f2982b.f3060a;
        T1.L(n0Var);
        String E6 = n0Var.E(str3);
        Uri.Builder builder = new Uri.Builder();
        C0212u0 u0Var2 = (C0212u0) q12.f398a;
        builder.scheme(u0Var2.f3494p.A(str3, H.f2925m0));
        boolean isEmpty = TextUtils.isEmpty(E6);
        C0170g gVar2 = u0Var2.f3494p;
        if (!isEmpty) {
            builder.authority(E6 + "." + gVar2.A(str3, H.f2928n0));
        } else {
            builder.authority(gVar2.A(str3, H.f2928n0));
        }
        builder.path(gVar2.A(str3, H.f2931o0));
        C(builder, "gmp_app_id", zzhw.zzaJ(), unmodifiableSet);
        gVar.v();
        C(builder, "gmp_version", String.valueOf(119002), unmodifiableSet);
        String zzaG = zzhw.zzaG();
        G g5 = H.f2889Y0;
        boolean B6 = gVar.B(str3, g5);
        C0192n0 n0Var2 = t12.f3060a;
        if (B6) {
            T1.L(n0Var2);
            if (n0Var2.s(str3)) {
                zzaG = "";
            }
        }
        C(builder, "app_instance_id", zzaG, unmodifiableSet);
        C(builder, "rdid", zzhw.zzaL(), unmodifiableSet);
        C(builder, "bundle_id", zzhw.zzaF(), unmodifiableSet);
        String zzo = zzhl.zzo();
        String e6 = K0.e(zzo, K0.f2976c, K0.f2974a);
        if (true != TextUtils.isEmpty(e6)) {
            zzo = e6;
        }
        C(builder, "app_event_name", zzo, unmodifiableSet);
        C(builder, "app_version", String.valueOf(zzhw.zzb()), unmodifiableSet);
        String zzaK = zzhw.zzaK();
        if (gVar.B(str3, g5)) {
            T1.L(n0Var2);
            if (n0Var2.t(str3) && !TextUtils.isEmpty(zzaK) && (indexOf = zzaK.indexOf(".")) != -1) {
                zzaK = zzaK.substring(0, indexOf);
            }
        }
        C(builder, "os_version", zzaK, unmodifiableSet);
        C(builder, "timestamp", String.valueOf(zzhl.zzc()), unmodifiableSet);
        String str5 = "1";
        if (zzhw.zzaP()) {
            C(builder, "lat", str5, unmodifiableSet);
        }
        C(builder, "privacy_sandbox_version", String.valueOf(zzhw.zza()), unmodifiableSet);
        C(builder, "trigger_uri_source", str5, unmodifiableSet);
        C(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), unmodifiableSet);
        C(builder, "request_uuid", str2, unmodifiableSet);
        List<zzhq> zzp = zzhl.zzp();
        Bundle bundle = new Bundle();
        for (zzhq zzhq : zzp) {
            String zzg = zzhq.zzg();
            if (zzhq.zzu()) {
                bundle.putString(zzg, String.valueOf(zzhq.zza()));
            } else if (zzhq.zzv()) {
                bundle.putString(zzg, String.valueOf(zzhq.zzb()));
            } else if (zzhq.zzy()) {
                bundle.putString(zzg, zzhq.zzh());
            } else if (zzhq.zzw()) {
                bundle.putString(zzg, String.valueOf(zzhq.zzd()));
            }
        }
        E(builder, gVar.A(str3, H.s0).split("\\|"), bundle, unmodifiableSet);
        List<zzio> zzaN = zzhw.zzaN();
        Bundle bundle2 = new Bundle();
        for (zzio zzio : zzaN) {
            String zzg2 = zzio.zzg();
            if (zzio.zzr()) {
                bundle2.putString(zzg2, String.valueOf(zzio.zza()));
            } else if (zzio.zzs()) {
                bundle2.putString(zzg2, String.valueOf(zzio.zzb()));
            } else if (zzio.zzv()) {
                bundle2.putString(zzg2, zzio.zzh());
            } else if (zzio.zzt()) {
                bundle2.putString(zzg2, String.valueOf(zzio.zzc()));
            }
        }
        E(builder, gVar.A(str3, H.f2940r0).split("\\|"), bundle2, unmodifiableSet);
        if (true != zzhw.zzaO()) {
            str5 = "0";
        }
        C(builder, "dma", str5, unmodifiableSet);
        if (!zzhw.zzaI().isEmpty()) {
            C(builder, "dma_cps", zzhw.zzaI(), unmodifiableSet);
        }
        if (zzhw.zzaQ()) {
            zzhc zzg3 = zzhw.zzg();
            if (!zzg3.zzh().isEmpty()) {
                C(builder, "dl_gclid", zzg3.zzh(), unmodifiableSet);
            }
            if (!zzg3.zzg().isEmpty()) {
                C(builder, "dl_gbraid", zzg3.zzg(), unmodifiableSet);
            }
            if (!zzg3.zzf().isEmpty()) {
                C(builder, "dl_gs", zzg3.zzf(), unmodifiableSet);
            }
            if (zzg3.zza() > 0) {
                C(builder, "dl_ss_ts", String.valueOf(zzg3.zza()), unmodifiableSet);
            }
            if (!zzg3.zzk().isEmpty()) {
                C(builder, "mr_gclid", zzg3.zzk(), unmodifiableSet);
            }
            if (!zzg3.zzj().isEmpty()) {
                C(builder, "mr_gbraid", zzg3.zzj(), unmodifiableSet);
            }
            if (!zzg3.zzi().isEmpty()) {
                C(builder, "mr_gs", zzg3.zzi(), unmodifiableSet);
            }
            if (zzg3.zzb() > 0) {
                C(builder, "mr_click_ts", String.valueOf(zzg3.zzb()), unmodifiableSet);
            }
        }
        return new I1(builder.build().toString(), currentTimeMillis, 1);
    }

    public zzhm T(r rVar) {
        Bundle bundle;
        zzhl zze = zzhm.zze();
        zze.zzl(rVar.f3442e);
        C0211u uVar = rVar.f3443f;
        Iterator<String> it2 = uVar.f3472a.keySet().iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            bundle = uVar.f3472a;
            if (!hasNext) {
                break;
            }
            String next = it2.next();
            zzhp zze2 = zzhq.zze();
            zze2.zzj(next);
            Object obj = bundle.get(next);
            I.g(obj);
            a0(zze2, obj);
            zze.zze(zze2);
        }
        String str = rVar.f3441c;
        if (!TextUtils.isEmpty(str) && bundle.get("_o") == null) {
            zzhp zze3 = zzhq.zze();
            zze3.zzj("_o");
            zze3.zzk(str);
            zze.zzf((zzhq) zze3.zzba());
        }
        return (zzhm) zze.zzba();
    }

    public String V(zzhv zzhv) {
        Long l6;
        Long l7;
        String str;
        String str2;
        zzhg zzx;
        if (zzhv == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (zzhv.zzq()) {
            G(sb, 0, "upload_subdomain", zzhv.zzg());
        }
        if (zzhv.zzp()) {
            G(sb, 0, "sgtm_join_id", zzhv.zzf());
        }
        for (zzhx zzhx : zzhv.zzh()) {
            if (zzhx != null) {
                B(1, sb);
                sb.append("bundle {\n");
                if (zzhx.zzbQ()) {
                    G(sb, 1, "protocol_version", Integer.valueOf(zzhx.zzf()));
                }
                zzrd.zzb();
                C0212u0 u0Var = (C0212u0) this.f398a;
                if (u0Var.f3494p.B(zzhx.zzF(), H.L0) && zzhx.zzbT()) {
                    G(sb, 1, "session_stitching_token", zzhx.zzU());
                }
                G(sb, 1, "platform", zzhx.zzS());
                if (zzhx.zzbL()) {
                    G(sb, 1, "gmp_version", Long.valueOf(zzhx.zzp()));
                }
                if (zzhx.zzbZ()) {
                    G(sb, 1, "uploading_gmp_version", Long.valueOf(zzhx.zzv()));
                }
                if (zzhx.zzbJ()) {
                    G(sb, 1, "dynamite_version", Long.valueOf(zzhx.zzn()));
                }
                if (zzhx.zzbC()) {
                    G(sb, 1, "config_version", Long.valueOf(zzhx.zzk()));
                }
                G(sb, 1, "gmp_app_id", zzhx.zzP());
                G(sb, 1, "admob_app_id", zzhx.zzE());
                G(sb, 1, "app_id", zzhx.zzF());
                G(sb, 1, "app_version", zzhx.zzI());
                if (zzhx.zzby()) {
                    G(sb, 1, "app_version_major", Integer.valueOf(zzhx.zzb()));
                }
                G(sb, 1, "firebase_instance_id", zzhx.zzO());
                if (zzhx.zzbH()) {
                    G(sb, 1, "dev_cert_hash", Long.valueOf(zzhx.zzm()));
                }
                G(sb, 1, "app_store", zzhx.zzH());
                if (zzhx.zzbY()) {
                    G(sb, 1, "upload_timestamp_millis", Long.valueOf(zzhx.zzu()));
                }
                if (zzhx.zzbV()) {
                    G(sb, 1, "start_timestamp_millis", Long.valueOf(zzhx.zzs()));
                }
                if (zzhx.zzbK()) {
                    G(sb, 1, "end_timestamp_millis", Long.valueOf(zzhx.zzo()));
                }
                if (zzhx.zzbP()) {
                    G(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzhx.zzr()));
                }
                if (zzhx.zzbO()) {
                    G(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzhx.zzq()));
                }
                G(sb, 1, "app_instance_id", zzhx.zzG());
                G(sb, 1, "resettable_device_id", zzhx.zzT());
                G(sb, 1, "ds_id", zzhx.zzN());
                if (zzhx.zzbN()) {
                    G(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzhx.zzbv()));
                }
                G(sb, 1, "os_version", zzhx.zzR());
                G(sb, 1, "device_model", zzhx.zzM());
                G(sb, 1, "user_default_language", zzhx.zzV());
                if (zzhx.zzbX()) {
                    G(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzhx.zzh()));
                }
                if (zzhx.zzbB()) {
                    G(sb, 1, "bundle_sequential_index", Integer.valueOf(zzhx.zzc()));
                }
                if (zzhx.zzbG()) {
                    G(sb, 1, "delivery_index", Integer.valueOf(zzhx.zzd()));
                }
                if (zzhx.zzbS()) {
                    G(sb, 1, "service_upload", Boolean.valueOf(zzhx.zzbw()));
                }
                G(sb, 1, "health_monitor", zzhx.zzQ());
                if (zzhx.zzbR()) {
                    G(sb, 1, "retry_counter", Integer.valueOf(zzhx.zzg()));
                }
                if (zzhx.zzbE()) {
                    G(sb, 1, "consent_signals", zzhx.zzK());
                }
                if (zzhx.zzbM()) {
                    G(sb, 1, "is_dma_region", Boolean.valueOf(zzhx.zzbu()));
                }
                if (zzhx.zzbF()) {
                    G(sb, 1, "core_platform_services", zzhx.zzL());
                }
                if (zzhx.zzbD()) {
                    G(sb, 1, "consent_diagnostics", zzhx.zzJ());
                }
                if (zzhx.zzbW()) {
                    G(sb, 1, "target_os_version", Long.valueOf(zzhx.zzt()));
                }
                zzqr.zzb();
                if (u0Var.f3494p.B(zzhx.zzF(), H.f2884V0)) {
                    G(sb, 1, "ad_services_version", Integer.valueOf(zzhx.zza()));
                    if (zzhx.zzbz() && (zzx = zzhx.zzx()) != null) {
                        B(2, sb);
                        sb.append("attribution_eligibility_status {\n");
                        G(sb, 2, "eligible", Boolean.valueOf(zzx.zzn()));
                        G(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzx.zzp()));
                        G(sb, 2, "pre_r", Boolean.valueOf(zzx.zzq()));
                        G(sb, 2, "r_extensions_too_old", Boolean.valueOf(zzx.zzr()));
                        G(sb, 2, "adservices_extension_too_old", Boolean.valueOf(zzx.zzm()));
                        G(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(zzx.zzk()));
                        G(sb, 2, "measurement_manager_disabled", Boolean.valueOf(zzx.zzo()));
                        B(2, sb);
                        sb.append("}\n");
                    }
                }
                if (zzhx.zzbx()) {
                    zzhc zzw = zzhx.zzw();
                    B(2, sb);
                    sb.append("ad_campaign_info {\n");
                    if (zzw.zzC()) {
                        G(sb, 2, "deep_link_gclid", zzw.zzh());
                    }
                    if (zzw.zzB()) {
                        G(sb, 2, "deep_link_gbraid", zzw.zzg());
                    }
                    if (zzw.zzA()) {
                        G(sb, 2, "deep_link_gad_source", zzw.zzf());
                    }
                    if (zzw.zzD()) {
                        G(sb, 2, "deep_link_session_millis", Long.valueOf(zzw.zza()));
                    }
                    if (zzw.zzH()) {
                        G(sb, 2, "market_referrer_gclid", zzw.zzk());
                    }
                    if (zzw.zzG()) {
                        G(sb, 2, "market_referrer_gbraid", zzw.zzj());
                    }
                    if (zzw.zzF()) {
                        G(sb, 2, "market_referrer_gad_source", zzw.zzi());
                    }
                    if (zzw.zzE()) {
                        G(sb, 2, "market_referrer_click_millis", Long.valueOf(zzw.zzb()));
                    }
                    B(2, sb);
                    sb.append("}\n");
                }
                if (zzhx.zzbA()) {
                    G(sb, 1, "batching_timestamp_millis", Long.valueOf(zzhx.zzj()));
                }
                if (zzhx.zzbU()) {
                    zzim zzC = zzhx.zzC();
                    B(2, sb);
                    sb.append("sgtm_diagnostics {\n");
                    int zzg = zzC.zzg();
                    if (zzg == 1) {
                        str = "UPLOAD_TYPE_UNKNOWN";
                    } else if (zzg == 2) {
                        str = "GA_UPLOAD";
                    } else if (zzg == 3) {
                        str = "SDK_CLIENT_UPLOAD";
                    } else if (zzg != 4) {
                        str = "SDK_SERVICE_UPLOAD";
                    } else {
                        str = "PACKAGE_SERVICE_UPLOAD";
                    }
                    G(sb, 2, "upload_type", str);
                    G(sb, 2, "client_upload_eligibility", zzC.zzb().name());
                    int zzf = zzC.zzf();
                    if (zzf == 1) {
                        str2 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (zzf == 2) {
                        str2 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (zzf == 3) {
                        str2 = "NOT_IN_ROLLOUT";
                    } else if (zzf == 4) {
                        str2 = "MISSING_SGTM_SETTINGS";
                    } else if (zzf != 5) {
                        str2 = "NON_PLAY_MISSING_SGTM_SERVER_URL";
                    } else {
                        str2 = "MISSING_SGTM_PROXY_INFO";
                    }
                    G(sb, 2, "service_upload_eligibility", str2);
                    B(2, sb);
                    sb.append("}\n");
                }
                List<zzio> zzY = zzhx.zzY();
                S s6 = u0Var.f3500v;
                if (zzY != null) {
                    for (zzio zzio : zzY) {
                        if (zzio != null) {
                            B(2, sb);
                            sb.append("user_property {\n");
                            Double d6 = null;
                            if (zzio.zzu()) {
                                l6 = Long.valueOf(zzio.zzd());
                            } else {
                                l6 = null;
                            }
                            G(sb, 2, "set_timestamp_millis", l6);
                            G(sb, 2, "name", s6.f(zzio.zzg()));
                            G(sb, 2, "string_value", zzio.zzh());
                            if (zzio.zzt()) {
                                l7 = Long.valueOf(zzio.zzc());
                            } else {
                                l7 = null;
                            }
                            G(sb, 2, "int_value", l7);
                            if (zzio.zzr()) {
                                d6 = Double.valueOf(zzio.zza());
                            }
                            G(sb, 2, "double_value", d6);
                            B(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzhi> zzW = zzhx.zzW();
                if (zzW != null) {
                    for (zzhi zzhi : zzW) {
                        if (zzhi != null) {
                            B(2, sb);
                            sb.append("audience_membership {\n");
                            if (zzhi.zzk()) {
                                G(sb, 2, "audience_id", Integer.valueOf(zzhi.zza()));
                            }
                            if (zzhi.zzm()) {
                                G(sb, 2, "new_audience", Boolean.valueOf(zzhi.zzj()));
                            }
                            F(sb, "current_data", zzhi.zzd());
                            if (zzhi.zzn()) {
                                F(sb, "previous_data", zzhi.zze());
                            }
                            B(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzhm> zzX = zzhx.zzX();
                if (zzX != null) {
                    for (zzhm zzhm : zzX) {
                        if (zzhm != null) {
                            B(2, sb);
                            sb.append("event {\n");
                            G(sb, 2, "name", s6.d(zzhm.zzh()));
                            if (zzhm.zzu()) {
                                G(sb, 2, "timestamp_millis", Long.valueOf(zzhm.zzd()));
                            }
                            if (zzhm.zzt()) {
                                G(sb, 2, "previous_timestamp_millis", Long.valueOf(zzhm.zzc()));
                            }
                            if (zzhm.zzs()) {
                                G(sb, 2, "count", Integer.valueOf(zzhm.zza()));
                            }
                            if (zzhm.zzb() != 0) {
                                z(sb, 2, zzhm.zzi());
                            }
                            B(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                B(1, sb);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    public String W(zzfr zzfr) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzfr.zzj()) {
            G(sb, 0, "filter_id", Integer.valueOf(zzfr.zza()));
        }
        G(sb, 0, "property_name", ((C0212u0) this.f398a).f3500v.f(zzfr.zze()));
        String D4 = D(zzfr.zzg(), zzfr.zzh(), zzfr.zzi());
        if (!D4.isEmpty()) {
            G(sb, 0, "filter_type", D4);
        }
        A(sb, 1, zzfr.zzb());
        sb.append("}\n");
        return sb.toString();
    }

    public List X(List list, List list2) {
        int i2;
        ArrayList arrayList = new ArrayList(list);
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            int intValue = num.intValue();
            C0212u0 u0Var = (C0212u0) this.f398a;
            if (intValue < 0) {
                Z z3 = u0Var.f3496r;
                C0212u0.k(z3);
                z3.f3175r.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue2 = num.intValue() / 64;
                if (intValue2 >= arrayList.size()) {
                    Z z4 = u0Var.f3496r;
                    C0212u0.k(z4);
                    z4.f3175r.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue2, Long.valueOf(((Long) arrayList.get(intValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i5 = size2;
            i2 = size;
            size = i5;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i2);
    }

    public void a0(zzhp zzhp, Object obj) {
        zzhp.zzg();
        zzhp.zze();
        zzhp.zzd();
        zzhp.zzf();
        if (obj instanceof String) {
            zzhp.zzk((String) obj);
        } else if (obj instanceof Long) {
            zzhp.zzi(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzhp.zzh(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    zzhp zze = zzhq.zze();
                    for (String next : bundle.keySet()) {
                        zzhp zze2 = zzhq.zze();
                        zze2.zzj(next);
                        Object obj2 = bundle.get(next);
                        if (obj2 instanceof Long) {
                            zze2.zzi(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zze2.zzk((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zze2.zzh(((Double) obj2).doubleValue());
                        }
                        zze.zzc(zze2);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((zzhq) zze.zzba());
                    }
                }
            }
            zzhp.zzb(arrayList);
        } else {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3172f.b(obj, "Ignoring invalid (type) event param value");
        }
    }

    public void b0(zzin zzin, Object obj) {
        I.g(obj);
        zzin.zzc();
        zzin.zzb();
        zzin.zza();
        if (obj instanceof String) {
            zzin.zzh((String) obj);
        } else if (obj instanceof Long) {
            zzin.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzin.zzd(((Double) obj).doubleValue());
        } else {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3172f.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public boolean d0(long j6, long j7) {
        if (j6 == 0 || j7 <= 0) {
            return true;
        }
        ((C0212u0) this.f398a).f3501w.getClass();
        if (Math.abs(System.currentTimeMillis() - j6) > j7) {
            return true;
        }
        return false;
    }

    public final void r() {
        int i2 = this.d;
    }

    public byte[] t(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e6) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3172f.b(e6, "Failed to gzip content");
            throw e6;
        }
    }

    public void z(StringBuilder sb, int i2, List list) {
        String str;
        String str2;
        Long l6;
        if (list != null) {
            int i5 = i2 + 1;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                zzhq zzhq = (zzhq) it2.next();
                if (zzhq != null) {
                    B(i5, sb);
                    sb.append("param {\n");
                    Double d6 = null;
                    if (zzhq.zzx()) {
                        str = ((C0212u0) this.f398a).f3500v.e(zzhq.zzg());
                    } else {
                        str = null;
                    }
                    G(sb, i5, "name", str);
                    if (zzhq.zzy()) {
                        str2 = zzhq.zzh();
                    } else {
                        str2 = null;
                    }
                    G(sb, i5, "string_value", str2);
                    if (zzhq.zzw()) {
                        l6 = Long.valueOf(zzhq.zzd());
                    } else {
                        l6 = null;
                    }
                    G(sb, i5, "int_value", l6);
                    if (zzhq.zzu()) {
                        d6 = Double.valueOf(zzhq.zza());
                    }
                    G(sb, i5, "double_value", d6);
                    if (zzhq.zzc() > 0) {
                        z(sb, i5, zzhq.zzi());
                    }
                    B(i5, sb);
                    sb.append("}\n");
                }
            }
        }
    }

    private final void J() {
    }

    private final void K() {
    }

    private final void L() {
    }
}
