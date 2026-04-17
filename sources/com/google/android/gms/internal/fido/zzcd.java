package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.measurement.a;
import java.math.RoundingMode;
import java.util.Arrays;

final class zzcd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    /* access modifiers changed from: private */
    public final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzcd(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        L_0x000a:
            int r5 = r11.length
            if (r4 >= r5) goto L_0x002b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L_0x0014
            r7 = r6
            goto L_0x0015
        L_0x0014:
            r7 = r3
        L_0x0015:
            java.lang.String r8 = "Non-ASCII character: %s"
            com.google.android.gms.internal.fido.zzap.zzd(r7, r8, r5)
            byte r7 = r1[r5]
            if (r7 != r2) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r6 = r3
        L_0x0020:
            java.lang.String r7 = "Duplicate character: %s"
            com.google.android.gms.internal.fido.zzap.zzd(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto L_0x000a
        L_0x002b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzcd.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcd) {
            zzcd zzcd = (zzcd) obj;
            if (this.zzh != zzcd.zzh || !Arrays.equals(this.zzf, zzcd.zzf)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = Arrays.hashCode(this.zzf);
        if (true != this.zzh) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        return hashCode + i2;
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i2) {
        return this.zzf[i2];
    }

    public final zzcd zzb() {
        int i2;
        boolean z3;
        int i5 = 0;
        for (char zza2 : this.zzf) {
            if (zzad.zza(zza2)) {
                char[] cArr = this.zzf;
                int length = cArr.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        z3 = false;
                        break;
                    }
                    char c3 = cArr[i6];
                    if (c3 >= 'A' && c3 <= 'Z') {
                        z3 = true;
                        break;
                    }
                    i6++;
                }
                if (!z3) {
                    char[] cArr2 = new char[this.zzf.length];
                    while (true) {
                        char[] cArr3 = this.zzf;
                        if (i5 >= cArr3.length) {
                            break;
                        }
                        char c6 = cArr3[i5];
                        if (zzad.zza(c6)) {
                            c6 ^= ' ';
                        }
                        cArr2[i5] = (char) c6;
                        i5++;
                    }
                    zzcd zzcd = new zzcd(this.zze.concat(".upperCase()"), cArr2);
                    if (!this.zzh || zzcd.zzh) {
                        return zzcd;
                    }
                    byte[] bArr = zzcd.zzg;
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    for (i2 = 65; i2 <= 90; i2++) {
                        int i7 = i2 | 32;
                        byte[] bArr2 = zzcd.zzg;
                        byte b6 = bArr2[i2];
                        byte b7 = bArr2[i7];
                        if (b6 == -1) {
                            copyOf[i2] = b7;
                        } else {
                            char c7 = (char) i2;
                            char c8 = (char) i7;
                            if (b7 == -1) {
                                copyOf[i7] = b6;
                            } else {
                                throw new IllegalStateException(zzaq.zza("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c7), Character.valueOf(c8)));
                            }
                        }
                    }
                    return new zzcd(zzcd.zze.concat(".ignoreCase()"), zzcd.zzf, copyOf, true);
                }
                throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
            }
        }
        return this;
    }

    public final boolean zzc(char c3) {
        byte[] bArr = this.zzg;
        if (bArr.length <= 61 || bArr[61] == -1) {
            return false;
        }
        return true;
    }

    private zzcd(String str, char[] cArr, byte[] bArr, boolean z3) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb2 = zzcj.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb2;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzb2);
            int i2 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i2;
            this.zzd = zzb2 >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i2];
            for (int i5 = 0; i5 < this.zzd; i5++) {
                zArr[zzcj.zza(i5 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = z3;
        } catch (ArithmeticException e6) {
            throw new IllegalArgumentException(a.f(cArr.length, "Illegal alphabet length "), e6);
        }
    }
}
