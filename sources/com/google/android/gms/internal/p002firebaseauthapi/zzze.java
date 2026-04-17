package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzze  reason: invalid package */
public final class zzze implements zzbe {
    private final zzzu zza;
    private final zzcb zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzze(zzzu zzzu, zzcb zzcb, int i2, byte[] bArr) {
        this.zza = zzzu;
        this.zzb = zzcb;
        this.zzc = i2;
        this.zzd = bArr;
    }

    public static zzbe zza(zzdd zzdd) {
        return new zzze(new zzyl(zzdd.zzf().zza(zzbj.zza()), ((zzdk) ((zzcx) zzdd.zza())).zzd()), new zzzx(new zzzv("HMAC".concat(String.valueOf(((zzdk) ((zzcx) zzdd.zza())).zzg())), new SecretKeySpec(zzdd.zzg().zza(zzbj.zza()), "HMAC")), ((zzdk) ((zzcx) zzdd.zza())).zze()), ((zzdk) ((zzcx) zzdd.zza())).zze(), zzdd.zzd().zzb());
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        byte[] zzb2 = this.zza.zzb(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return zzyt.zza(this.zzd, zzb2, this.zzb.zza(zzyt.zza(bArr2, zzb2, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i2 = this.zzc;
        byte[] bArr3 = this.zzd;
        if (length < i2 + bArr3.length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        } else if (zzqq.zza(bArr3, bArr)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, bArr.length - this.zzc);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.zzc, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.zzb.zza(copyOfRange2, zzyt.zza(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
            return this.zza.zza(copyOfRange);
        } else {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }
}
