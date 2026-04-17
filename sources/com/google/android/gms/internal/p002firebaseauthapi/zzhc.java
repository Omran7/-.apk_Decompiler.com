package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhc  reason: invalid package */
public final class zzhc implements zzbe {
    private static final byte[] zza = zzzr.zza("7a806c");
    private static final byte[] zzb = zzzr.zza("46bb91c3c5");
    private static final byte[] zzc = zzzr.zza("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] zzd = zzzr.zza("bae8e37fc83441b16034566b");
    private static final byte[] zze = zzzr.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private final zzhb<Cipher> zzf;
    private final SecretKey zzg;
    private final byte[] zzh;

    private zzhc(byte[] bArr, byte[] bArr2, zzhb<Cipher> zzhb) {
        this.zzh = bArr2;
        zzzz.zza(bArr.length);
        this.zzg = new SecretKeySpec(bArr, "AES");
        this.zzf = zzhb;
    }

    public static zzbe zza(zzeb zzeb, zzhb<Cipher> zzhb) {
        if (zza(zzhb.zza())) {
            return new zzhc(zzeb.zzf().zza(zzbj.zza()), zzeb.zzd().zzb(), zzhb);
        }
        throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        Cipher zza2 = this.zzf.zza();
        int length = bArr.length;
        byte[] bArr3 = this.zzh;
        if (length <= 2147483619 - bArr3.length) {
            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + bArr.length + 16);
            byte[] zza3 = zzqg.zza(12);
            System.arraycopy(zza3, 0, copyOf, this.zzh.length, 12);
            zza2.init(1, this.zzg, zza(zza3, 0, zza3.length));
            if (!(bArr2 == null || bArr2.length == 0)) {
                zza2.updateAAD(bArr2);
            }
            int doFinal = zza2.doFinal(bArr, 0, bArr.length, copyOf, this.zzh.length + 12);
            if (doFinal == bArr.length + 16) {
                return copyOf;
            }
            throw new GeneralSecurityException(C0552a.k(doFinal - bArr.length, "encryption failed; AES-GCM-SIV tag must be 16 bytes, but got only ", " bytes"));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    private static AlgorithmParameterSpec zza(byte[] bArr, int i2, int i5) {
        return new GCMParameterSpec(128, bArr, i2, i5);
    }

    public static boolean zza(Cipher cipher) {
        try {
            byte[] bArr = zzd;
            cipher.init(2, new SecretKeySpec(zzc, "AES"), zza(bArr, 0, bArr.length));
            cipher.updateAAD(zzb);
            byte[] bArr2 = zze;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), zza);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.zzh;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        } else if (zzqq.zza(bArr3, bArr)) {
            Cipher zza2 = this.zzf.zza();
            zza2.init(2, this.zzg, zza(bArr, this.zzh.length, 12));
            if (!(bArr2 == null || bArr2.length == 0)) {
                zza2.updateAAD(bArr2);
            }
            byte[] bArr4 = this.zzh;
            return zza2.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
        } else {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }
}
