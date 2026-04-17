package com.google.android.gms.internal.fido;

final class zzcf extends zzcg {
    private zzcf(zzcd zzcd, Character ch) {
        super(zzcd, ch);
        zzap.zzc(zzcd.zzf.length == 64);
    }

    public final zzch zza(zzcd zzcd, Character ch) {
        return new zzcf(zzcd, ch);
    }

    public final void zzb(Appendable appendable, byte[] bArr, int i2, int i5) {
        int i6 = 0;
        zzap.zze(0, i5, bArr.length);
        for (int i7 = i5; i7 >= 3; i7 -= 3) {
            byte b6 = ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6] & 255) << 16) | (bArr[i6 + 2] & 255);
            appendable.append(this.zzb.zza(b6 >>> 18));
            appendable.append(this.zzb.zza((b6 >>> 12) & 63));
            appendable.append(this.zzb.zza((b6 >>> 6) & 63));
            appendable.append(this.zzb.zza(b6 & 63));
            i6 += 3;
        }
        if (i6 < i5) {
            zze(appendable, bArr, i6, i5 - i6);
        }
    }

    public zzcf(String str, String str2, Character ch) {
        this(new zzcd(str, str2.toCharArray()), ch);
    }
}
