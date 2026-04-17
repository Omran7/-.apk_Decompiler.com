package com.google.android.gms.internal.fido;

final class zzce extends zzcg {
    final char[] zza;

    private zzce(zzcd zzcd) {
        super(zzcd, (Character) null);
        this.zza = new char[512];
        zzap.zzc(zzcd.zzf.length == 16);
        for (int i2 = 0; i2 < 256; i2++) {
            this.zza[i2] = zzcd.zza(i2 >>> 4);
            this.zza[i2 | 256] = zzcd.zza(i2 & 15);
        }
    }

    public final zzch zza(zzcd zzcd, Character ch) {
        return new zzce(zzcd);
    }

    public final void zzb(Appendable appendable, byte[] bArr, int i2, int i5) {
        zzap.zze(0, i5, bArr.length);
        for (int i6 = 0; i6 < i5; i6++) {
            byte b6 = bArr[i6] & 255;
            appendable.append(this.zza[b6]);
            appendable.append(this.zza[b6 | 256]);
        }
    }

    public zzce(String str, String str2) {
        this(new zzcd("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
