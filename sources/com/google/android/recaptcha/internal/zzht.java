package com.google.android.recaptcha.internal;

import C5.f;
import F5.a;
import K1.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import n5.C0875g;
import n5.C0877i;

public final class zzht implements zzgx {
    public static final zzht zza = new zzht();

    private zzht() {
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
        boolean z3 = obj instanceof Byte;
        if (z3 && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z4 = obj instanceof Short;
        if (z4 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z5 = obj instanceof Integer;
        if (z5 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z6 = obj instanceof Long;
        if (!z6 || !(obj2 instanceof Long)) {
            int i2 = 0;
            if (obj instanceof String) {
                if (obj2 instanceof Byte) {
                    byte[] bytes = ((String) obj).getBytes(a.f795a);
                    int length = bytes.length;
                    ArrayList arrayList = new ArrayList(length);
                    while (i2 < length) {
                        arrayList.add(Byte.valueOf((byte) (bytes[i2] ^ ((Number) obj2).byteValue())));
                        i2++;
                    }
                    return C0875g.W0(arrayList);
                } else if (obj2 instanceof Integer) {
                    char[] charArray = ((String) obj).toCharArray();
                    int length2 = charArray.length;
                    ArrayList arrayList2 = new ArrayList(length2);
                    while (i2 < length2) {
                        arrayList2.add(Integer.valueOf(charArray[i2] ^ ((Number) obj2).intValue()));
                        i2++;
                    }
                    return C0875g.Y0(arrayList2);
                }
            }
            if (z3 && (obj2 instanceof byte[])) {
                ArrayList arrayList3 = new ArrayList(r0);
                for (byte byteValue : (byte[]) obj2) {
                    arrayList3.add(Byte.valueOf((byte) (byteValue ^ ((Number) obj).byteValue())));
                }
                return arrayList3.toArray(new Byte[0]);
            } else if (z4 && (obj2 instanceof short[])) {
                ArrayList arrayList4 = new ArrayList(r0);
                for (short shortValue : (short[]) obj2) {
                    arrayList4.add(Short.valueOf((short) (shortValue ^ ((Number) obj).shortValue())));
                }
                return arrayList4.toArray(new Short[0]);
            } else if (z5 && (obj2 instanceof int[])) {
                ArrayList arrayList5 = new ArrayList(r0);
                for (int intValue : (int[]) obj2) {
                    arrayList5.add(Integer.valueOf(intValue ^ ((Number) obj).intValue()));
                }
                return arrayList5.toArray(new Integer[0]);
            } else if (!z6 || !(obj2 instanceof long[])) {
                boolean z7 = obj instanceof byte[];
                if (!z7 || !(obj2 instanceof Byte)) {
                    boolean z8 = obj instanceof short[];
                    if (!z8 || !(obj2 instanceof Short)) {
                        boolean z9 = obj instanceof int[];
                        if (!z9 || !(obj2 instanceof Integer)) {
                            boolean z10 = obj instanceof long[];
                            if (z10 && (obj2 instanceof Long)) {
                                ArrayList arrayList6 = new ArrayList(r0);
                                for (long longValue : (long[]) obj) {
                                    arrayList6.add(Long.valueOf(longValue ^ ((Number) obj2).longValue()));
                                }
                                return arrayList6.toArray(new Long[0]);
                            } else if (z7 && (obj2 instanceof byte[])) {
                                byte[] bArr = (byte[]) obj;
                                int length3 = bArr.length;
                                byte[] bArr2 = (byte[]) obj2;
                                zzgw.zza(this, length3, bArr2.length);
                                f s0 = e.s0(0, length3);
                                ArrayList arrayList7 = new ArrayList(C0877i.T0(s0));
                                Iterator it2 = s0.iterator();
                                while (((C5.e) it2).f485c) {
                                    int a6 = ((C5.e) it2).a();
                                    arrayList7.add(Byte.valueOf((byte) (bArr2[a6] ^ bArr[a6])));
                                }
                                return arrayList7.toArray(new Byte[0]);
                            } else if (z8 && (obj2 instanceof short[])) {
                                short[] sArr = (short[]) obj;
                                int length4 = sArr.length;
                                short[] sArr2 = (short[]) obj2;
                                zzgw.zza(this, length4, sArr2.length);
                                f s02 = e.s0(0, length4);
                                ArrayList arrayList8 = new ArrayList(C0877i.T0(s02));
                                Iterator it3 = s02.iterator();
                                while (((C5.e) it3).f485c) {
                                    int a7 = ((C5.e) it3).a();
                                    arrayList8.add(Short.valueOf((short) (sArr2[a7] ^ sArr[a7])));
                                }
                                return arrayList8.toArray(new Short[0]);
                            } else if (z9 && (obj2 instanceof int[])) {
                                int[] iArr = (int[]) obj;
                                int length5 = iArr.length;
                                int[] iArr2 = (int[]) obj2;
                                zzgw.zza(this, length5, iArr2.length);
                                f s03 = e.s0(0, length5);
                                ArrayList arrayList9 = new ArrayList(C0877i.T0(s03));
                                Iterator it4 = s03.iterator();
                                while (((C5.e) it4).f485c) {
                                    int a8 = ((C5.e) it4).a();
                                    arrayList9.add(Integer.valueOf(iArr2[a8] ^ iArr[a8]));
                                }
                                return arrayList9.toArray(new Integer[0]);
                            } else if (!z10 || !(obj2 instanceof long[])) {
                                throw new zzce(4, 5, (Throwable) null);
                            } else {
                                long[] jArr = (long[]) obj;
                                int length6 = jArr.length;
                                long[] jArr2 = (long[]) obj2;
                                zzgw.zza(this, length6, jArr2.length);
                                f s04 = e.s0(0, length6);
                                ArrayList arrayList10 = new ArrayList(C0877i.T0(s04));
                                Iterator it5 = s04.iterator();
                                while (((C5.e) it5).f485c) {
                                    int a9 = ((C5.e) it5).a();
                                    arrayList10.add(Long.valueOf(jArr[a9] ^ jArr2[a9]));
                                }
                                return arrayList10.toArray(new Long[0]);
                            }
                        } else {
                            ArrayList arrayList11 = new ArrayList(r0);
                            for (int intValue2 : (int[]) obj) {
                                arrayList11.add(Integer.valueOf(intValue2 ^ ((Number) obj2).intValue()));
                            }
                            return arrayList11.toArray(new Integer[0]);
                        }
                    } else {
                        ArrayList arrayList12 = new ArrayList(r0);
                        for (short shortValue2 : (short[]) obj) {
                            arrayList12.add(Short.valueOf((short) (shortValue2 ^ ((Number) obj2).shortValue())));
                        }
                        return arrayList12.toArray(new Short[0]);
                    }
                } else {
                    ArrayList arrayList13 = new ArrayList(r0);
                    for (byte byteValue2 : (byte[]) obj) {
                        arrayList13.add(Byte.valueOf((byte) (byteValue2 ^ ((Number) obj2).byteValue())));
                    }
                    return arrayList13.toArray(new Byte[0]);
                }
            } else {
                ArrayList arrayList14 = new ArrayList(r0);
                for (long longValue2 : (long[]) obj2) {
                    arrayList14.add(Long.valueOf(longValue2 ^ ((Number) obj).longValue()));
                }
                return arrayList14.toArray(new Long[0]);
            }
        } else {
            return Long.valueOf(((Number) obj2).longValue() ^ ((Number) obj).longValue());
        }
    }
}
