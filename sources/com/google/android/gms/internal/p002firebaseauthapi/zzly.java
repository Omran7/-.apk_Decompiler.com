package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzly  reason: invalid package */
final class zzly implements zzmf {
    private final String zza;

    public zzly(String str) {
        this.zza = str;
    }

    public final int zza() {
        return Mac.getInstance(this.zza).getMacLength();
    }

    public final byte[] zzb() {
        String str = this.zza;
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case 984523022:
                if (str.equals("HmacSha256")) {
                    c3 = 0;
                    break;
                }
                break;
            case 984524074:
                if (str.equals("HmacSha384")) {
                    c3 = 1;
                    break;
                }
                break;
            case 984525777:
                if (str.equals("HmacSha512")) {
                    c3 = 2;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return zzmn.zzf;
            case 1:
                return zzmn.zzg;
            case 2:
                return zzmn.zzh;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2, int i2) {
        Mac zza2 = zzzd.zzb.zza(this.zza);
        if (i2 <= zza2.getMacLength() * 255) {
            byte[] bArr3 = new byte[i2];
            zza2.init(new SecretKeySpec(bArr, this.zza));
            byte[] bArr4 = new byte[0];
            int i5 = 1;
            int i6 = 0;
            while (true) {
                zza2.update(bArr4);
                zza2.update(bArr2);
                zza2.update((byte) i5);
                bArr4 = zza2.doFinal();
                if (bArr4.length + i6 < i2) {
                    System.arraycopy(bArr4, 0, bArr3, i6, bArr4.length);
                    i6 += bArr4.length;
                    i5++;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i6, i2 - i6);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2) {
        Mac zza2 = zzzd.zzb.zza(this.zza);
        if (bArr2 == null || bArr2.length == 0) {
            zza2.init(new SecretKeySpec(new byte[zza2.getMacLength()], this.zza));
        } else {
            zza2.init(new SecretKeySpec(bArr2, this.zza));
        }
        return zza2.doFinal(bArr);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i2) {
        return zza(zza(zzmn.zza(str, bArr2, bArr4), (byte[]) null), zzmn.zza(str2, bArr3, bArr4, i2), i2);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i2) {
        return zza(bArr, zzmn.zza(str, bArr2, bArr3, i2), i2);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return zza(zzmn.zza(str, bArr2, bArr3), bArr);
    }
}
