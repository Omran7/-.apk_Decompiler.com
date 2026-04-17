package com.google.android.recaptcha.internal;

import java.io.IOException;

public abstract class zzkh {
    private static final zzkh zza = new zzke("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzkh zzb = new zzke("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    static {
        boolean z3;
        new zzkg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzkg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzkd zzkd = new zzkd("base16()", "0123456789ABCDEF".toCharArray());
        new zzkg(zzkd, (Character) null);
        char[] cArr = new char[512];
        if (zzkd.zzf.length == 16) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzjf.zza(z3);
        for (int i2 = 0; i2 < 256; i2++) {
            cArr[i2] = zzkd.zza(i2 >>> 4);
            cArr[i2 | 256] = zzkd.zza(i2 & 15);
        }
    }

    public static zzkh zzg() {
        return zza;
    }

    public static zzkh zzh() {
        return zzb;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence);

    public abstract void zzb(Appendable appendable, byte[] bArr, int i2, int i5);

    public abstract int zzc(int i2);

    public abstract int zzd(int i2);

    public CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i2, int i5) {
        zzjf.zzd(0, i5, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i5));
        try {
            zzb(sb, bArr, 0, i5);
            return sb.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence zze = zze(charSequence);
            int zzc = zzc(zze.length());
            byte[] bArr = new byte[zzc];
            int zza2 = zza(bArr, zze);
            if (zza2 == zzc) {
                return bArr;
            }
            byte[] bArr2 = new byte[zza2];
            System.arraycopy(bArr, 0, bArr2, 0, zza2);
            return bArr2;
        } catch (zzkf e6) {
            throw new IllegalArgumentException(e6);
        }
    }
}
