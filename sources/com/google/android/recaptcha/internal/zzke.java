package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.measurement.a;

final class zzke extends zzkg {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzke(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
        /*
            r1 = this;
            com.google.android.recaptcha.internal.zzkd r0 = new com.google.android.recaptcha.internal.zzkd
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = r0.zzf
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            com.google.android.recaptcha.internal.zzjf.zza(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzke.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    public final int zza(byte[] bArr, CharSequence charSequence) {
        CharSequence zze = zze(charSequence);
        if (this.zza.zzc(zze.length())) {
            int i2 = 0;
            int i5 = 0;
            while (i2 < zze.length()) {
                int i6 = i5 + 1;
                int zzb = (this.zza.zzb(zze.charAt(i2)) << 18) | (this.zza.zzb(zze.charAt(i2 + 1)) << 12);
                bArr[i5] = (byte) (zzb >>> 16);
                int i7 = i2 + 2;
                if (i7 < zze.length()) {
                    int i8 = i2 + 3;
                    int zzb2 = zzb | (this.zza.zzb(zze.charAt(i7)) << 6);
                    int i9 = i5 + 2;
                    bArr[i6] = (byte) ((zzb2 >>> 8) & 255);
                    if (i8 < zze.length()) {
                        i2 += 4;
                        i5 += 3;
                        bArr[i9] = (byte) ((zzb2 | this.zza.zzb(zze.charAt(i8))) & 255);
                    } else {
                        i5 = i9;
                        i2 = i8;
                    }
                } else {
                    i2 = i7;
                    i5 = i6;
                }
            }
            return i5;
        }
        throw new zzkf(a.f(zze.length(), "Invalid input length "));
    }

    public final void zzb(Appendable appendable, byte[] bArr, int i2, int i5) {
        int i6 = 0;
        zzjf.zzd(0, i5, bArr.length);
        for (int i7 = i5; i7 >= 3; i7 -= 3) {
            byte b6 = ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6] & 255) << 16) | (bArr[i6 + 2] & 255);
            appendable.append(this.zza.zza(b6 >>> 18));
            appendable.append(this.zza.zza((b6 >>> 12) & 63));
            appendable.append(this.zza.zza((b6 >>> 6) & 63));
            appendable.append(this.zza.zza(b6 & 63));
            i6 += 3;
        }
        if (i6 < i5) {
            zzf(appendable, bArr, i6, i5 - i6);
        }
    }
}
