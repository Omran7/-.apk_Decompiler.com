package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import com.google.android.gms.internal.p002firebaseauthapi.zzki;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmj  reason: invalid package */
public final class zzmj {
    private static final zzpr<zzkl, zzbh> zza;
    private static final zzpr<zzkt, zzbk> zzb;
    private static final zzcg<zzbh> zzc;
    private static final zzbl<zzbk> zzd;
    private static final zzou<zzki> zze = new zzmk();

    static {
        Class<zzbh> cls = zzbh.class;
        zza = zzpr.zza(new zzmi(), zzkl.class, cls);
        Class<zzbk> cls2 = zzbk.class;
        zzb = zzpr.zza(new zzml(), zzkt.class, cls2);
        zzc = zzoc.zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey", cls, zzwm.zzf());
        zzd = zzoc.zza("type.googleapis.com/google.crypto.tink.HpkePublicKey", cls2, zzws.zza.ASYMMETRIC_PUBLIC, zzwp.d_());
    }

    public static /* synthetic */ zzkl zza(zzki zzki, Integer num) {
        zzaaf zzaaf;
        zzaae zzaae;
        byte[] bArr;
        if (zzki.zze().equals(zzki.zzd.zzd)) {
            byte[] zza2 = zzaac.zza();
            zzaaf = zzaaf.zza(zza2, zzbj.zza());
            zzaae = zzaae.zza(zzaac.zza(zza2));
        } else if (zzki.zze().equals(zzki.zzd.zza) || zzki.zze().equals(zzki.zzd.zzb) || zzki.zze().equals(zzki.zzd.zzc)) {
            zzzc zzc2 = zzmn.zzc(zzki.zze());
            KeyPair zza3 = zzyz.zza(zzyz.zza(zzc2));
            zzzb zzzb = zzzb.UNCOMPRESSED;
            ECPoint w6 = ((ECPublicKey) zza3.getPublic()).getW();
            EllipticCurve curve = zzyz.zza(zzc2).getCurve();
            zzni.zza(w6, curve);
            int zza4 = zzyz.zza(curve);
            int ordinal = zzzb.ordinal();
            if (ordinal != 0) {
                int i2 = 2;
                if (ordinal == 1) {
                    int i5 = zza4 + 1;
                    bArr = new byte[i5];
                    byte[] zza5 = zznh.zza(w6.getAffineX());
                    System.arraycopy(zza5, 0, bArr, i5 - zza5.length, zza5.length);
                    if (w6.getAffineY().testBit(0)) {
                        i2 = 3;
                    }
                    bArr[0] = (byte) i2;
                } else if (ordinal == 2) {
                    int i6 = zza4 * 2;
                    bArr = new byte[i6];
                    byte[] zza6 = zznh.zza(w6.getAffineX());
                    if (zza6.length > zza4) {
                        zza6 = Arrays.copyOfRange(zza6, zza6.length - zza4, zza6.length);
                    }
                    byte[] zza7 = zznh.zza(w6.getAffineY());
                    if (zza7.length > zza4) {
                        zza7 = Arrays.copyOfRange(zza7, zza7.length - zza4, zza7.length);
                    }
                    System.arraycopy(zza7, 0, bArr, i6 - zza7.length, zza7.length);
                    System.arraycopy(zza6, 0, bArr, zza4 - zza6.length, zza6.length);
                } else {
                    throw new GeneralSecurityException("invalid format:".concat(String.valueOf(zzzb)));
                }
            } else {
                int i7 = (zza4 * 2) + 1;
                bArr = new byte[i7];
                byte[] zza8 = zznh.zza(w6.getAffineX());
                byte[] zza9 = zznh.zza(w6.getAffineY());
                System.arraycopy(zza9, 0, bArr, i7 - zza9.length, zza9.length);
                System.arraycopy(zza8, 0, bArr, (zza4 + 1) - zza8.length, zza8.length);
                bArr[0] = 4;
            }
            zzaae = zzaae.zza(bArr);
            zzaaf = zzaaf.zza(zznh.zza(((ECPrivateKey) zza3.getPrivate()).getS(), zzmn.zza(zzki.zze())), zzbj.zza());
        } else {
            throw new GeneralSecurityException("Unknown KEM ID");
        }
        return zzkl.zza(zzkt.zza(zzki, zzaae, num), zzaaf);
    }

    public static void zza(boolean z3) {
        if (zzix.zza.ALGORITHM_NOT_FIPS.zza()) {
            zzkk.zza();
            zzpa zza2 = zzpa.zza();
            HashMap hashMap = new HashMap();
            zzki.zzb zzc2 = zzki.zzc();
            zzki.zzf zzf = zzki.zzf.zza;
            zzki.zzb zza3 = zzc2.zza(zzf);
            zzki.zzd zzd2 = zzki.zzd.zzd;
            zzki.zzb zza4 = zza3.zza(zzd2);
            zzki.zze zze2 = zzki.zze.zza;
            zzki.zzb zza5 = zza4.zza(zze2);
            zzki.zza zza6 = zzki.zza.zza;
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zza5.zza(zza6).zza());
            zzki.zzb zzc3 = zzki.zzc();
            zzki.zzf zzf2 = zzki.zzf.zzc;
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzc3.zza(zzf2).zza(zzd2).zza(zze2).zza(zza6).zza());
            zzki.zzb zza7 = zzki.zzc().zza(zzf).zza(zzd2).zza(zze2);
            zzki.zza zza8 = zzki.zza.zzb;
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zza7.zza(zza8).zza());
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzki.zzc().zza(zzf2).zza(zzd2).zza(zze2).zza(zza8).zza());
            zzki.zzb zza9 = zzki.zzc().zza(zzf).zza(zzd2).zza(zze2);
            zzki.zza zza10 = zzki.zza.zzc;
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zza9.zza(zza10).zza());
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzki.zzc().zza(zzf2).zza(zzd2).zza(zze2).zza(zza10).zza());
            zzki.zzb zza11 = zzki.zzc().zza(zzf);
            zzki.zzd zzd3 = zzki.zzd.zza;
            hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zza11.zza(zzd3).zza(zze2).zza(zza6).zza());
            hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzki.zzc().zza(zzf2).zza(zzd3).zza(zze2).zza(zza6).zza());
            hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzki.zzc().zza(zzf).zza(zzd3).zza(zze2).zza(zza8).zza());
            hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzki.zzc().zza(zzf2).zza(zzd3).zza(zze2).zza(zza8).zza());
            zzki.zzb zza12 = zzki.zzc().zza(zzf);
            zzki.zzd zzd4 = zzki.zzd.zzb;
            zzki.zzb zza13 = zza12.zza(zzd4);
            zzki.zze zze3 = zzki.zze.zzb;
            hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zza13.zza(zze3).zza(zza6).zza());
            hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzki.zzc().zza(zzf2).zza(zzd4).zza(zze3).zza(zza6).zza());
            hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzki.zzc().zza(zzf).zza(zzd4).zza(zze3).zza(zza8).zza());
            hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzki.zzc().zza(zzf2).zza(zzd4).zza(zze3).zza(zza8).zza());
            zzki.zzb zza14 = zzki.zzc().zza(zzf);
            zzki.zzd zzd5 = zzki.zzd.zzc;
            zzki.zzb zza15 = zza14.zza(zzd5);
            zzki.zze zze4 = zzki.zze.zzc;
            hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zza15.zza(zze4).zza(zza6).zza());
            hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzki.zzc().zza(zzf2).zza(zzd5).zza(zze4).zza(zza6).zza());
            hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzki.zzc().zza(zzf).zza(zzd5).zza(zze4).zza(zza8).zza());
            hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzki.zzc().zza(zzf2).zza(zzd5).zza(zze4).zza(zza8).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zzoz.zza().zza(zza);
            zzoz.zza().zza(zzb);
            zzos.zza().zza(zze, zzki.class);
            zznt.zza().zza(zzc, true);
            zznt.zza().zza(zzd, false);
            return;
        }
        throw new GeneralSecurityException("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
    }
}
