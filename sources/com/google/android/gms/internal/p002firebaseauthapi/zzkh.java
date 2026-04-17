package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzke;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkh  reason: invalid package */
public final class zzkh extends zzli {
    private final zzkg zza;
    private final zzaad zzb;
    private final zzaaf zzc;

    private zzkh(zzkg zzkg, zzaad zzaad, zzaaf zzaaf) {
        this.zza = zzkg;
        this.zzb = zzaad;
        this.zzc = zzaaf;
    }

    public final /* synthetic */ zzce zza() {
        return (zzke) zzd();
    }

    public final /* synthetic */ zzbm zzc() {
        return (zzkg) zze();
    }

    public final /* synthetic */ zzlj zzd() {
        return (zzke) ((zzlj) this.zza.zza());
    }

    public final /* synthetic */ zzll zze() {
        return this.zza;
    }

    public final zzaad zzf() {
        return this.zzb;
    }

    public final zzaaf zzg() {
        return this.zzc;
    }

    public static zzkh zza(zzkg zzkg, zzaaf zzaaf) {
        if (zzkg == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        } else if (zzkg.zze() == null) {
            throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
        } else if (zzaaf != null) {
            byte[] zza2 = zzaaf.zza(zzbj.zza());
            byte[] zzb2 = zzkg.zze().zzb();
            if (zza2.length != 32) {
                throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
            } else if (Arrays.equals(zzaac.zza(zza2), zzb2)) {
                return new zzkh(zzkg, (zzaad) null, zzaaf);
            } else {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
    }

    public static zzkh zza(zzkg zzkg, zzaad zzaad) {
        if (zzkg == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        } else if (zzkg.zzf() == null) {
            throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
        } else if (zzaad != null) {
            BigInteger zza2 = zzaad.zza(zzbj.zza());
            ECPoint zzf = zzkg.zzf();
            zzke.zza zzd = ((zzke) ((zzlj) zzkg.zza())).zzd();
            BigInteger order = zza(zzd).getOrder();
            if (zza2.signum() <= 0 || zza2.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private value");
            } else if (zzni.zza(zza2, zza(zzd)).equals(zzf)) {
                return new zzkh(zzkg, zzaad, (zzaaf) null);
            } else {
                throw new GeneralSecurityException("Invalid private value");
            }
        } else {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
    }

    private static ECParameterSpec zza(zzke.zza zza2) {
        if (zza2 == zzke.zza.zza) {
            return zzni.zza;
        }
        if (zza2 == zzke.zza.zzb) {
            return zzni.zzb;
        }
        if (zza2 == zzke.zza.zzc) {
            return zzni.zzc;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(zza2)));
    }
}
