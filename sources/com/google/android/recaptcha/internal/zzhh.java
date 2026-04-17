package com.google.android.recaptcha.internal;

import C5.f;
import F5.a;
import K1.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import n5.C0875g;
import n5.C0877i;

public final class zzhh implements zzgx {
    public static final zzhh zza = new zzhh();

    private zzhh() {
    }

    private final Object zzb(Object obj, Object obj2) {
        boolean z3 = obj instanceof Byte;
        if (z3 && (obj2 instanceof Byte)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z4 = obj instanceof Short;
        if (z4 && (obj2 instanceof Short)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z5 = obj instanceof Integer;
        if (z5 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z6 = obj instanceof Long;
        if (z6 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z7 = obj instanceof Float;
        if (z7 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z8 = obj instanceof Double;
        if (z8 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i2 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(a.f795a);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i2 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i2] % ((Number) obj2).intValue())));
                    i2++;
                }
                return new String(C0875g.W0(arrayList), a.f795a);
            } else if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i2 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i2] % ((Number) obj2).intValue()));
                    i2++;
                }
                return C0875g.Y0(arrayList2);
            }
        }
        if (z3 && (obj2 instanceof byte[])) {
            ArrayList arrayList3 = new ArrayList(r0);
            for (byte intValue : (byte[]) obj2) {
                arrayList3.add(Integer.valueOf(intValue % ((Number) obj).intValue()));
            }
            return arrayList3.toArray(new Integer[0]);
        } else if (z4 && (obj2 instanceof short[])) {
            ArrayList arrayList4 = new ArrayList(r0);
            for (short intValue2 : (short[]) obj2) {
                arrayList4.add(Integer.valueOf(intValue2 % ((Number) obj).intValue()));
            }
            return arrayList4.toArray(new Integer[0]);
        } else if (z5 && (obj2 instanceof int[])) {
            ArrayList arrayList5 = new ArrayList(r0);
            for (int intValue3 : (int[]) obj2) {
                arrayList5.add(Integer.valueOf(intValue3 % ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        } else if (z6 && (obj2 instanceof long[])) {
            ArrayList arrayList6 = new ArrayList(r0);
            for (long longValue : (long[]) obj2) {
                arrayList6.add(Long.valueOf(longValue % ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        } else if (z7 && (obj2 instanceof float[])) {
            ArrayList arrayList7 = new ArrayList(r0);
            for (float floatValue : (float[]) obj2) {
                arrayList7.add(Float.valueOf(floatValue % ((Number) obj).floatValue()));
            }
            return arrayList7.toArray(new Float[0]);
        } else if (!z8 || !(obj2 instanceof double[])) {
            boolean z9 = obj instanceof byte[];
            if (!z9 || !(obj2 instanceof Byte)) {
                boolean z10 = obj instanceof short[];
                if (!z10 || !(obj2 instanceof Short)) {
                    boolean z11 = obj instanceof int[];
                    if (!z11 || !(obj2 instanceof Integer)) {
                        boolean z12 = obj instanceof long[];
                        if (!z12 || !(obj2 instanceof Long)) {
                            boolean z13 = obj instanceof float[];
                            if (!z13 || !(obj2 instanceof Float)) {
                                boolean z14 = obj instanceof double[];
                                if (z14 && (obj2 instanceof Double)) {
                                    ArrayList arrayList8 = new ArrayList(r0);
                                    for (double doubleValue : (double[]) obj) {
                                        arrayList8.add(Double.valueOf(doubleValue % ((Number) obj2).doubleValue()));
                                    }
                                    return arrayList8.toArray(new Double[0]);
                                } else if (z9 && (obj2 instanceof byte[])) {
                                    byte[] bArr = (byte[]) obj;
                                    int length3 = bArr.length;
                                    byte[] bArr2 = (byte[]) obj2;
                                    zzgw.zza(this, length3, bArr2.length);
                                    f s0 = e.s0(0, length3);
                                    ArrayList arrayList9 = new ArrayList(C0877i.T0(s0));
                                    Iterator it2 = s0.iterator();
                                    while (((C5.e) it2).f485c) {
                                        int a6 = ((C5.e) it2).a();
                                        arrayList9.add(Integer.valueOf(bArr[a6] % bArr2[a6]));
                                    }
                                    return arrayList9.toArray(new Integer[0]);
                                } else if (z10 && (obj2 instanceof short[])) {
                                    short[] sArr = (short[]) obj;
                                    int length4 = sArr.length;
                                    short[] sArr2 = (short[]) obj2;
                                    zzgw.zza(this, length4, sArr2.length);
                                    f s02 = e.s0(0, length4);
                                    ArrayList arrayList10 = new ArrayList(C0877i.T0(s02));
                                    Iterator it3 = s02.iterator();
                                    while (((C5.e) it3).f485c) {
                                        int a7 = ((C5.e) it3).a();
                                        arrayList10.add(Integer.valueOf(sArr[a7] % sArr2[a7]));
                                    }
                                    return arrayList10.toArray(new Integer[0]);
                                } else if (z11 && (obj2 instanceof int[])) {
                                    int[] iArr = (int[]) obj;
                                    int length5 = iArr.length;
                                    int[] iArr2 = (int[]) obj2;
                                    zzgw.zza(this, length5, iArr2.length);
                                    f s03 = e.s0(0, length5);
                                    ArrayList arrayList11 = new ArrayList(C0877i.T0(s03));
                                    Iterator it4 = s03.iterator();
                                    while (((C5.e) it4).f485c) {
                                        int a8 = ((C5.e) it4).a();
                                        arrayList11.add(Integer.valueOf(iArr[a8] % iArr2[a8]));
                                    }
                                    return arrayList11.toArray(new Integer[0]);
                                } else if (z12 && (obj2 instanceof long[])) {
                                    long[] jArr = (long[]) obj;
                                    int length6 = jArr.length;
                                    long[] jArr2 = (long[]) obj2;
                                    zzgw.zza(this, length6, jArr2.length);
                                    f s04 = e.s0(0, length6);
                                    ArrayList arrayList12 = new ArrayList(C0877i.T0(s04));
                                    Iterator it5 = s04.iterator();
                                    while (((C5.e) it5).f485c) {
                                        int a9 = ((C5.e) it5).a();
                                        arrayList12.add(Long.valueOf(jArr[a9] % jArr2[a9]));
                                    }
                                    return arrayList12.toArray(new Long[0]);
                                } else if (z13 && (obj2 instanceof float[])) {
                                    float[] fArr = (float[]) obj;
                                    int length7 = fArr.length;
                                    float[] fArr2 = (float[]) obj2;
                                    zzgw.zza(this, length7, fArr2.length);
                                    f s05 = e.s0(0, length7);
                                    ArrayList arrayList13 = new ArrayList(C0877i.T0(s05));
                                    Iterator it6 = s05.iterator();
                                    while (((C5.e) it6).f485c) {
                                        int a10 = ((C5.e) it6).a();
                                        arrayList13.add(Float.valueOf(fArr[a10] % fArr2[a10]));
                                    }
                                    return arrayList13.toArray(new Float[0]);
                                } else if (!z14 || !(obj2 instanceof double[])) {
                                    throw new zzce(4, 5, (Throwable) null);
                                } else {
                                    double[] dArr = (double[]) obj;
                                    int length8 = dArr.length;
                                    double[] dArr2 = (double[]) obj2;
                                    zzgw.zza(this, length8, dArr2.length);
                                    f s06 = e.s0(0, length8);
                                    ArrayList arrayList14 = new ArrayList(C0877i.T0(s06));
                                    Iterator it7 = s06.iterator();
                                    while (((C5.e) it7).f485c) {
                                        int a11 = ((C5.e) it7).a();
                                        arrayList14.add(Double.valueOf(dArr[a11] % dArr2[a11]));
                                    }
                                    return arrayList14.toArray(new Double[0]);
                                }
                            } else {
                                ArrayList arrayList15 = new ArrayList(r0);
                                for (float floatValue2 : (float[]) obj) {
                                    arrayList15.add(Float.valueOf(floatValue2 % ((Number) obj2).floatValue()));
                                }
                                return arrayList15.toArray(new Float[0]);
                            }
                        } else {
                            ArrayList arrayList16 = new ArrayList(r0);
                            for (long longValue2 : (long[]) obj) {
                                arrayList16.add(Long.valueOf(longValue2 % ((Number) obj2).longValue()));
                            }
                            return arrayList16.toArray(new Long[0]);
                        }
                    } else {
                        int[] iArr3 = (int[]) obj;
                        int length9 = iArr3.length;
                        ArrayList arrayList17 = new ArrayList(length9);
                        while (i2 < length9) {
                            arrayList17.add(Integer.valueOf(iArr3[i2] % ((Number) obj2).intValue()));
                            i2++;
                        }
                        return C0875g.Y0(arrayList17);
                    }
                } else {
                    ArrayList arrayList18 = new ArrayList(r0);
                    for (short intValue4 : (short[]) obj) {
                        arrayList18.add(Integer.valueOf(intValue4 % ((Number) obj2).intValue()));
                    }
                    return arrayList18.toArray(new Integer[0]);
                }
            } else {
                ArrayList arrayList19 = new ArrayList(r0);
                for (byte intValue5 : (byte[]) obj) {
                    arrayList19.add(Integer.valueOf(intValue5 % ((Number) obj2).intValue()));
                }
                return arrayList19.toArray(new Integer[0]);
            }
        } else {
            ArrayList arrayList20 = new ArrayList(r0);
            for (double doubleValue2 : (double[]) obj2) {
                arrayList20.add(Double.valueOf(doubleValue2 % ((Number) obj).doubleValue()));
            }
            return arrayList20.toArray(new Double[0]);
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
                    try {
                        zzgd.zzc().zze(i2, zzb(zza2, zza3));
                    } catch (ArithmeticException e6) {
                        throw new zzce(4, 6, e6);
                    }
                } else {
                    throw new zzce(4, 5, (Throwable) null);
                }
            } else {
                throw new zzce(4, 5, (Throwable) null);
            }
        } else {
            throw new zzce(4, 3, (Throwable) null);
        }
    }
}
