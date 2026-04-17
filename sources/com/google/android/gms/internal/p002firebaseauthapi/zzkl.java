package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzki;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkl  reason: invalid package */
public final class zzkl extends zzli {
    private final zzkt zza;
    private final zzaaf zzb;

    private zzkl(zzkt zzkt, zzaaf zzaaf) {
        this.zza = zzkt;
        this.zzb = zzaaf;
    }

    public final /* synthetic */ zzce zza() {
        return (zzki) zzd();
    }

    public final /* synthetic */ zzbm zzc() {
        return (zzkt) zze();
    }

    public final /* synthetic */ zzlj zzd() {
        return (zzki) ((zzlj) this.zza.zza());
    }

    public final /* synthetic */ zzll zze() {
        return this.zza;
    }

    public final zzaaf zzf() {
        return this.zzb;
    }

    public static zzkl zza(zzkt zzkt, zzaaf zzaaf) {
        ECParameterSpec eCParameterSpec;
        if (zzkt == null) {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without an HPKE public key");
        } else if (zzaaf != null) {
            zzki.zzd zze = ((zzki) ((zzlj) zzkt.zza())).zze();
            int zza2 = zzaaf.zza();
            String str = "Encoded private key byte length for " + String.valueOf(zze) + " must be %d, not " + zza2;
            zzki.zzd zzd = zzki.zzd.zza;
            if (zze == zzd) {
                if (zza2 != 32) {
                    throw new GeneralSecurityException(String.format(str, new Object[]{32}));
                }
            } else if (zze == zzki.zzd.zzb) {
                if (zza2 != 48) {
                    throw new GeneralSecurityException(String.format(str, new Object[]{48}));
                }
            } else if (zze == zzki.zzd.zzc) {
                if (zza2 != 66) {
                    throw new GeneralSecurityException(String.format(str, new Object[]{66}));
                }
            } else if (zze != zzki.zzd.zzd) {
                throw new GeneralSecurityException("Unable to validate private key length for ".concat(String.valueOf(zze)));
            } else if (zza2 != 32) {
                throw new GeneralSecurityException(String.format(str, new Object[]{32}));
            }
            zzki.zzd zze2 = ((zzki) ((zzlj) zzkt.zza())).zze();
            byte[] zzb2 = zzkt.zze().zzb();
            byte[] zza3 = zzaaf.zza(zzbj.zza());
            if (zze2 == zzd || zze2 == zzki.zzd.zzb || zze2 == zzki.zzd.zzc) {
                if (zze2 == zzd) {
                    eCParameterSpec = zzni.zza;
                } else if (zze2 == zzki.zzd.zzb) {
                    eCParameterSpec = zzni.zzb;
                } else if (zze2 == zzki.zzd.zzc) {
                    eCParameterSpec = zzni.zzc;
                } else {
                    throw new IllegalArgumentException("Unable to determine NIST curve params for ".concat(String.valueOf(zze2)));
                }
                BigInteger order = eCParameterSpec.getOrder();
                BigInteger zza4 = zznh.zza(zza3);
                if (zza4.signum() <= 0 || zza4.compareTo(order) >= 0) {
                    throw new GeneralSecurityException("Invalid private key.");
                } else if (!zzni.zza(zza4, eCParameterSpec).equals(zzyz.zza(eCParameterSpec.getCurve(), zzzb.UNCOMPRESSED, zzb2))) {
                    throw new GeneralSecurityException("Invalid private key for public key.");
                }
            } else if (zze2 != zzki.zzd.zzd) {
                throw new IllegalArgumentException("Unable to validate key pair for ".concat(String.valueOf(zze2)));
            } else if (!Arrays.equals(zzaac.zza(zza3), zzb2)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
            return new zzkl(zzkt, zzaaf);
        } else {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without secret");
        }
    }
}
