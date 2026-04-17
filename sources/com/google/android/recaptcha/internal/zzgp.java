package com.google.android.recaptcha.internal;

import F5.a;
import java.util.Collection;
import java.util.Objects;
import kotlin.jvm.internal.j;
import n5.C0874f;
import n5.C0875g;
import x5.l;

public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        String str;
        String str2;
        if (zzueArr.length == 1) {
            int i5 = 0;
            Object zza2 = zzgd.zzc().zza(zzueArr[0]);
            if (true != Objects.nonNull(zza2)) {
                zza2 = null;
            }
            if (zza2 != null) {
                if (zza2 instanceof int[]) {
                    int[] iArr = (int[]) zza2;
                    StringBuilder sb = new StringBuilder();
                    sb.append("[");
                    int length = iArr.length;
                    int i6 = 0;
                    while (i5 < length) {
                        int i7 = iArr[i5];
                        i6++;
                        if (i6 > 1) {
                            sb.append(",");
                        }
                        sb.append(String.valueOf(i7));
                        i5++;
                    }
                    sb.append("]");
                    str = sb.toString();
                    j.d(str, "toString(...)");
                } else {
                    if (zza2 instanceof byte[]) {
                        str2 = new String((byte[]) zza2, a.f795a);
                    } else if (zza2 instanceof long[]) {
                        long[] jArr = (long[]) zza2;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("[");
                        int length2 = jArr.length;
                        int i8 = 0;
                        while (i5 < length2) {
                            long j6 = jArr[i5];
                            i8++;
                            if (i8 > 1) {
                                sb2.append(",");
                            }
                            sb2.append(String.valueOf(j6));
                            i5++;
                        }
                        sb2.append("]");
                        str = sb2.toString();
                        j.d(str, "toString(...)");
                    } else if (zza2 instanceof short[]) {
                        short[] sArr = (short[]) zza2;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("[");
                        int length3 = sArr.length;
                        int i9 = 0;
                        while (i5 < length3) {
                            short s6 = sArr[i5];
                            i9++;
                            if (i9 > 1) {
                                sb3.append(",");
                            }
                            sb3.append(String.valueOf(s6));
                            i5++;
                        }
                        sb3.append("]");
                        str = sb3.toString();
                        j.d(str, "toString(...)");
                    } else if (zza2 instanceof float[]) {
                        float[] fArr = (float[]) zza2;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("[");
                        int length4 = fArr.length;
                        int i10 = 0;
                        while (i5 < length4) {
                            float f6 = fArr[i5];
                            i10++;
                            if (i10 > 1) {
                                sb4.append(",");
                            }
                            sb4.append(String.valueOf(f6));
                            i5++;
                        }
                        sb4.append("]");
                        str = sb4.toString();
                        j.d(str, "toString(...)");
                    } else if (zza2 instanceof double[]) {
                        double[] dArr = (double[]) zza2;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("[");
                        int length5 = dArr.length;
                        int i11 = 0;
                        while (i5 < length5) {
                            double d = dArr[i5];
                            i11++;
                            if (i11 > 1) {
                                sb5.append(",");
                            }
                            sb5.append(String.valueOf(d));
                            i5++;
                        }
                        sb5.append("]");
                        str = sb5.toString();
                        j.d(str, "toString(...)");
                    } else if (zza2 instanceof char[]) {
                        str2 = new String((char[]) zza2);
                    } else if (zza2 instanceof Object[]) {
                        str = C0874f.y1((Object[]) zza2);
                    } else if (zza2 instanceof Collection) {
                        str = C0875g.U0((Iterable) zza2, ",", "[", "]", (l) null, 56);
                    } else {
                        throw new zzce(4, 5, (Throwable) null);
                    }
                    str = str2;
                }
                zzgd.zzc().zze(i2, str);
                return;
            }
            throw new zzce(4, 5, (Throwable) null);
        }
        throw new zzce(4, 3, (Throwable) null);
    }
}
