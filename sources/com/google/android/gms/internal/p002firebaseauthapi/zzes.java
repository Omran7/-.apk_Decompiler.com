package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import h0.C0552a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzes  reason: invalid package */
public final class zzes implements zzbe {
    private static final byte[] zza = new byte[0];
    private static final Set<String> zzb;
    private final String zzc;
    private final zzce zzd;
    private final zzbe zze;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    private zzes(zzww zzww, zzbe zzbe) {
        if (zzb.contains(zzww.zzf())) {
            this.zzc = zzww.zzf();
            this.zzd = zzcm.zza(((zzww) ((zzaky) zzww.zza(zzww).zza(zzxu.RAW).zze())).zzk());
            this.zze = zzbe;
            return;
        }
        throw new IllegalArgumentException(C0552a.o("Unsupported DEK key type: ", zzww.zzf(), ". Only Tink AEAD key types are supported."));
    }

    public static zzbe zza(zzcx zzcx, zzbe zzbe) {
        try {
            return new zzes(zzww.zza(zzcm.zza((zzce) zzcx), zzakk.zza()), zzbe);
        } catch (zzalf e6) {
            throw new GeneralSecurityException(e6);
        }
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        zzbm zza2 = zzos.zza().zza(this.zzd, (Integer) null);
        byte[] zzb2 = this.zze.zzb(((zzqe) zzpc.zza().zza(zza2, zzqe.class, zzbj.zza())).zzd().zzd(), zza);
        if (zzb2.length <= 4096) {
            byte[] zzb3 = ((zzbe) zzoz.zza().zza(zza2, zzbe.class)).zzb(bArr, bArr2);
            return ByteBuffer.allocate(zzb2.length + 4 + zzb3.length).putInt(zzb2.length).put(zzb2).put(zzb3).array();
        }
        throw new GeneralSecurityException("length of encrypted DEK too large");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i2 = wrap.getInt();
            if (i2 <= 0 || i2 > 4096 || i2 > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i2];
            wrap.get(bArr3, 0, i2);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((zzbe) zzoz.zza().zza(zzpc.zza().zza(zzqe.zza(this.zzc, zzajp.zza(this.zze.zza(bArr3, zza)), zzws.zza.SYMMETRIC, zzxu.RAW, (Integer) null), zzbj.zza()), zzbe.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e6) {
            e = e6;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e7) {
            e = e7;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e8) {
            e = e8;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
