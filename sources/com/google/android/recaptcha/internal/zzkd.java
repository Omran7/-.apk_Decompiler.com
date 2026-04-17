package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.measurement.a;
import java.math.RoundingMode;
import java.util.Arrays;

final class zzkd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    /* access modifiers changed from: private */
    public final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzkd(java.lang.String r10, char[] r11) {
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
            com.google.android.recaptcha.internal.zzjf.zzc(r7, r8, r5)
            byte r7 = r1[r5]
            if (r7 != r2) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r6 = r3
        L_0x0020:
            java.lang.String r7 = "Duplicate character: %s"
            com.google.android.recaptcha.internal.zzjf.zzc(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto L_0x000a
        L_0x002b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkd.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkd) {
            zzkd zzkd = (zzkd) obj;
            boolean z3 = zzkd.zzi;
            if (Arrays.equals(this.zzf, zzkd.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i2) {
        return this.zzf[i2];
    }

    public final int zzb(char c3) {
        if (c3 <= 127) {
            byte b6 = this.zzg[c3];
            if (b6 != -1) {
                return b6;
            }
            if (c3 <= ' ' || c3 == 127) {
                throw new zzkf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c3))));
            }
            throw new zzkf("Unrecognized character: " + c3);
        }
        throw new zzkf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c3))));
    }

    public final boolean zzc(int i2) {
        return this.zzh[i2 % this.zzc];
    }

    public final boolean zzd(char c3) {
        return this.zzg[61] != -1;
    }

    private zzkd(String str, char[] cArr, byte[] bArr, boolean z3) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb2 = zzkj.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb2;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzb2);
            int i2 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i2;
            this.zzd = zzb2 >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i2];
            for (int i5 = 0; i5 < this.zzd; i5++) {
                zArr[zzkj.zza(i5 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = false;
        } catch (ArithmeticException e6) {
            throw new IllegalArgumentException(a.f(cArr.length, "Illegal alphabet length "), e6);
        }
    }
}
