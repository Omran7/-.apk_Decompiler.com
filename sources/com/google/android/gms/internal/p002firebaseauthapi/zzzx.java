package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqw;
import com.google.android.gms.internal.p002firebaseauthapi.zzrj;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzx  reason: invalid package */
public final class zzzx implements zzcb {
    private static final byte[] zza = {0};
    private final zzso zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzzx(zzqp zzqp) {
        this.zzb = new zzzt(zzqp.zzf().zza(zzbj.zza()));
        this.zzc = ((zzqw) ((zzrm) zzqp.zza())).zzb();
        this.zzd = zzqp.zze().zzb();
        if (((zzqw) ((zzrm) zzqp.zza())).zze().equals(zzqw.zzb.zzc)) {
            byte[] bArr = zza;
            this.zze = Arrays.copyOf(bArr, bArr.length);
            return;
        }
        this.zze = new byte[0];
    }

    public static zzcb zza(zzqp zzqp) {
        return new zzzx(zzqp);
    }

    public static zzcb zza(zzrc zzrc) {
        return new zzzx(zzrc);
    }

    public final void zza(byte[] bArr, byte[] bArr2) {
        if (!MessageDigest.isEqual(zza(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public final byte[] zza(byte[] bArr) {
        byte[] bArr2 = this.zze;
        if (bArr2.length > 0) {
            return zzyt.zza(this.zzd, this.zzb.zza(zzyt.zza(bArr, bArr2), this.zzc));
        }
        return zzyt.zza(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzzx(zzrc zzrc) {
        this.zzb = new zzzv("HMAC".concat(String.valueOf(((zzrj) ((zzrm) zzrc.zza())).zze())), new SecretKeySpec(zzrc.zzf().zza(zzbj.zza()), "HMAC"));
        this.zzc = ((zzrj) ((zzrm) zzrc.zza())).zzb();
        this.zzd = zzrc.zze().zzb();
        if (((zzrj) ((zzrm) zzrc.zza())).zzf().equals(zzrj.zzb.zzc)) {
            byte[] bArr = zza;
            this.zze = Arrays.copyOf(bArr, bArr.length);
            return;
        }
        this.zze = new byte[0];
    }

    public zzzx(zzso zzso, int i2) {
        this.zzb = zzso;
        this.zzc = i2;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        if (i2 >= 10) {
            zzso.zza(new byte[0], i2);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }
}
