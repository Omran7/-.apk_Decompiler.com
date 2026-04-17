package com.google.android.recaptcha.internal;

import I1.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.j;
import n5.C0874f;
import n5.C0877i;
import n5.C0883o;

public final class zzgy implements zzgx {
    public static final zzgy zza = new zzgy();

    private zzgy() {
    }

    private static final List zzc(Object obj) {
        boolean z3 = obj instanceof byte[];
        C0883o oVar = C0883o.f10398a;
        int i2 = 0;
        if (z3) {
            byte[] bArr = (byte[]) obj;
            j.e(bArr, "<this>");
            int length = bArr.length;
            if (length == 0) {
                return oVar;
            }
            if (length == 1) {
                return b.t0(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i2 < length2) {
                arrayList.add(Byte.valueOf(bArr[i2]));
                i2++;
            }
            return arrayList;
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            j.e(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 == 0) {
                return oVar;
            }
            if (length3 == 1) {
                return b.t0(Short.valueOf(sArr[0]));
            }
            ArrayList arrayList2 = new ArrayList(sArr.length);
            int length4 = sArr.length;
            while (i2 < length4) {
                arrayList2.add(Short.valueOf(sArr[i2]));
                i2++;
            }
            return arrayList2;
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            j.e(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 == 0) {
                return oVar;
            }
            if (length5 == 1) {
                return b.t0(Integer.valueOf(iArr[0]));
            }
            ArrayList arrayList3 = new ArrayList(iArr.length);
            int length6 = iArr.length;
            while (i2 < length6) {
                arrayList3.add(Integer.valueOf(iArr[i2]));
                i2++;
            }
            return arrayList3;
        } else if (obj instanceof long[]) {
            return C0874f.z1((long[]) obj);
        } else {
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                j.e(fArr, "<this>");
                int length7 = fArr.length;
                if (length7 == 0) {
                    return oVar;
                }
                if (length7 == 1) {
                    return b.t0(Float.valueOf(fArr[0]));
                }
                ArrayList arrayList4 = new ArrayList(fArr.length);
                int length8 = fArr.length;
                while (i2 < length8) {
                    arrayList4.add(Float.valueOf(fArr[i2]));
                    i2++;
                }
                return arrayList4;
            } else if (!(obj instanceof double[])) {
                return null;
            } else {
                double[] dArr = (double[]) obj;
                j.e(dArr, "<this>");
                int length9 = dArr.length;
                if (length9 == 0) {
                    return oVar;
                }
                if (length9 == 1) {
                    return b.t0(Double.valueOf(dArr[0]));
                }
                ArrayList arrayList5 = new ArrayList(dArr.length);
                int length10 = dArr.length;
                while (i2 < length10) {
                    arrayList5.add(Double.valueOf(dArr[i2]));
                    i2++;
                }
                return arrayList5;
            }
        }
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        if (zzueArr.length == 2) {
            Object zza2 = zzgd.zzc().zza(zzueArr[0]);
            if (true != Objects.nonNull(zza2)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object zza3 = zzgd.zzc().zza(zzueArr[1]);
                if (true != Objects.nonNull(zza3)) {
                    zza3 = null;
                }
                if (zza3 != null) {
                    zzgd.zzc().zze(i2, zzb(zza2, zza3));
                    return;
                }
                throw new zzce(4, 5, (Throwable) null);
            }
            throw new zzce(4, 5, (Throwable) null);
        }
        throw new zzce(4, 3, (Throwable) null);
    }

    public final Object zzb(Object obj, Object obj2) {
        List<Number> zzc = zzc(obj);
        List<Number> zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                ArrayList arrayList = new ArrayList(C0877i.T0(zzc2));
                for (Number doubleValue : zzc2) {
                    arrayList.add(Double.valueOf(Math.pow(doubleValue.doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(C0877i.T0(zzc));
            for (Number doubleValue2 : zzc) {
                arrayList2.add(Double.valueOf(Math.pow(doubleValue2.doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        } else if (zzc == null || zzc2 == null) {
            throw new zzce(4, 5, (Throwable) null);
        } else {
            zzgw.zza(this, zzc.size(), zzc2.size());
            int size = zzc.size();
            Double[] dArr = new Double[size];
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = Double.valueOf(Math.pow(((Number) zzc.get(i2)).doubleValue(), ((Number) zzc2.get(i2)).doubleValue()));
            }
            return dArr;
        }
    }
}
