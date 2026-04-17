package com.google.android.recaptcha.internal;

public abstract class zzjv {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zzb = 0;

    public final boolean equals(Object obj) {
        if (obj instanceof zzjv) {
            zzjv zzjv = (zzjv) obj;
            if (zzb() != zzjv.zzb() || !zzc(zzjv)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] zze = zze();
        byte b6 = zze[0] & 255;
        for (int i2 = 1; i2 < zze.length; i2++) {
            b6 |= (zze[i2] & 255) << (i2 * 8);
        }
        return b6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(r1 + r1);
        for (byte b6 : zze()) {
            char[] cArr = zza;
            sb.append(cArr[(b6 >> 4) & 15]);
            sb.append(cArr[b6 & 15]);
        }
        return sb.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract boolean zzc(zzjv zzjv);

    public abstract byte[] zzd();

    public byte[] zze() {
        throw null;
    }
}
