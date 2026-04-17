package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyn  reason: invalid package */
public final class zzyn implements zzbe {
    private static final zzix.zza zza = zzix.zza.ALGORITHM_NOT_FIPS;
    private static final ThreadLocal<Cipher> zzb = new zzyq();
    private static final ThreadLocal<Cipher> zzc = new zzyp();
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final SecretKeySpec zzg;
    private final int zzh;

    private zzyn(byte[] bArr, int i2, byte[] bArr2) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i2 == 12 || i2 == 16) {
            this.zzh = i2;
            zzzz.zza(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.zzg = secretKeySpec;
            Cipher cipher = zzb.get();
            cipher.init(1, secretKeySpec);
            byte[] zza2 = zza(cipher.doFinal(new byte[16]));
            this.zzd = zza2;
            this.zze = zza(zza2);
            this.zzf = bArr2;
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    public static zzbe zza(zzdl zzdl) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (((zzdq) ((zzcx) zzdl.zza())).zzd() == 16) {
            return new zzyn(zzdl.zzf().zza(zzbj.zza()), ((zzdq) ((zzcx) zzdl.zza())).zzb(), zzdl.zzd().zzb());
        } else {
            throw new GeneralSecurityException(a.f(((zzdq) ((zzcx) zzdl.zza())).zzd(), "AesEaxJce only supports 16 byte tag size, not "));
        }
    }

    private static void zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4 = bArr;
        int length = bArr4.length;
        byte[] bArr5 = this.zzf;
        int length2 = f.API_PRIORITY_OTHER - bArr5.length;
        int i2 = this.zzh;
        if (length <= (length2 - i2) - 16) {
            byte[] copyOf = Arrays.copyOf(bArr5, bArr5.length + i2 + bArr4.length + 16);
            byte[] zza2 = zzqg.zza(this.zzh);
            System.arraycopy(zza2, 0, copyOf, this.zzf.length, this.zzh);
            Cipher cipher = zzb.get();
            cipher.init(1, this.zzg);
            byte[] zza3 = zza(cipher, 0, zza2, 0, zza2.length);
            if (bArr2 == null) {
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr2;
            }
            byte[] zza4 = zza(cipher, 1, bArr3, 0, bArr3.length);
            Cipher cipher2 = zzc.get();
            cipher2.init(1, this.zzg, new IvParameterSpec(zza3));
            cipher2.doFinal(bArr, 0, bArr4.length, copyOf, this.zzf.length + this.zzh);
            byte[] zza5 = zza(cipher, 2, copyOf, this.zzf.length + this.zzh, bArr4.length);
            int length3 = this.zzf.length + bArr4.length + this.zzh;
            for (int i5 = 0; i5 < 16; i5++) {
                copyOf[length3 + i5] = (byte) ((zza4[i5] ^ zza3[i5]) ^ zza5[i5]);
            }
            return copyOf;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.zzf;
        int length2 = ((length - bArr3.length) - this.zzh) - 16;
        if (length2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        } else if (zzqq.zza(bArr3, bArr)) {
            Cipher cipher = zzb.get();
            cipher.init(1, this.zzg);
            byte[] zza2 = zza(cipher, 0, bArr, this.zzf.length, this.zzh);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr4 = bArr2;
            byte[] zza3 = zza(cipher, 1, bArr4, 0, bArr4.length);
            byte[] zza4 = zza(cipher, 2, bArr, this.zzf.length + this.zzh, length2);
            int length3 = bArr.length - 16;
            byte b6 = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                b6 = (byte) (b6 | (((bArr[length3 + i2] ^ zza3[i2]) ^ zza2[i2]) ^ zza4[i2]));
            }
            if (b6 == 0) {
                Cipher cipher2 = zzc.get();
                cipher2.init(1, this.zzg, new IvParameterSpec(zza2));
                return cipher2.doFinal(bArr, this.zzf.length + this.zzh, length2);
            }
            throw new AEADBadTagException("tag mismatch");
        } else {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }

    private static byte[] zza(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        while (i2 < 15) {
            int i5 = i2 + 1;
            bArr2[i2] = (byte) ((bArr[i2] << 1) ^ ((bArr[i5] & 255) >>> 7));
            i2 = i5;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    private final byte[] zza(Cipher cipher, int i2, byte[] bArr, int i5, int i6) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i2;
        if (i6 == 0) {
            zzc(bArr2, this.zzd);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        int i7 = 0;
        while (true) {
            byte[] bArr4 = bArr2;
            bArr2 = bArr3;
            bArr3 = bArr4;
            if (i6 - i7 <= 16) {
                break;
            }
            for (int i8 = 0; i8 < 16; i8++) {
                bArr2[i8] = (byte) (bArr2[i8] ^ bArr[(i5 + i7) + i8]);
            }
            cipher.doFinal(bArr2, 0, 16, bArr3);
            i7 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i7 + i5, i5 + i6);
        if (copyOfRange.length == 16) {
            zzc(copyOfRange, this.zzd);
        } else {
            byte[] copyOf = Arrays.copyOf(this.zze, 16);
            for (int i9 = 0; i9 < copyOfRange.length; i9++) {
                copyOf[i9] = (byte) (copyOf[i9] ^ copyOfRange[i9]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            copyOfRange = copyOf;
        }
        zzc(bArr2, copyOfRange);
        cipher.doFinal(bArr2, 0, 16, bArr3);
        return bArr3;
    }
}
