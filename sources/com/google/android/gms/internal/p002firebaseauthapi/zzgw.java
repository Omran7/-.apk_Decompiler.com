package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzdz;
import java.security.GeneralSecurityException;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgw  reason: invalid package */
public final class zzgw {
    private static final zzaae zza;
    private static final zzpk<zzdz, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzds, zzqe> zzd;
    private static final zzns<zzqe> zze;

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza = zzb2;
        Class<zzqd> cls = zzqd.class;
        zzb = zzpk.zza(new zzgv(), zzdz.class, cls);
        zzc = zzpg.zza(new zzgy(), zzb2, cls);
        Class<zzqe> cls2 = zzqe.class;
        zzd = zznw.zza(new zzgx(), zzds.class, cls2);
        zze = zzns.zza(new zzha(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzds zzb(zzqe zzqe, zzck zzck) {
        if (zzqe.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzty zza2 = zzty.zza(zzqe.zzd(), zzakk.zza());
                if (zza2.zza() == 0) {
                    return zzds.zze().zza(zzdz.zze().zzb(zza2.zzd().zzb()).zza(12).zzc(16).zza(zza(zzqe.zzc())).zza()).zza(zzaaf.zza(zza2.zzd().zzd(), zzck.zza(zzck))).zza(zzqe.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
    }

    private static zzdz.zzb zza(zzxu zzxu) {
        int i2 = zzgz.zza[zzxu.ordinal()];
        if (i2 == 1) {
            return zzdz.zzb.zza;
        }
        if (i2 == 2 || i2 == 3) {
            return zzdz.zzb.zzb;
        }
        if (i2 == 4) {
            return zzdz.zzb.zzc;
        }
        throw new GeneralSecurityException(a.f(zzxu.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* access modifiers changed from: private */
    public static zzdz zzb(zzqd zzqd) {
        if (zzqd.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzub zza2 = zzub.zza(zzqd.zza().zze(), zzakk.zza());
                if (zza2.zzb() == 0) {
                    return zzdz.zze().zzb(zza2.zza()).zza(12).zzc(16).zza(zza(zzqd.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzalf e6) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e6);
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", zzqd.zza().zzf()));
        }
    }

    private static zzxu zza(zzdz.zzb zzb2) {
        if (zzdz.zzb.zza.equals(zzb2)) {
            return zzxu.TINK;
        }
        if (zzdz.zzb.zzb.equals(zzb2)) {
            return zzxu.CRUNCHY;
        }
        if (zzdz.zzb.zzc.equals(zzb2)) {
            return zzxu.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzb2)));
    }

    /* access modifiers changed from: private */
    public static void zzb(zzdz zzdz) {
        if (zzdz.zzd() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", new Object[]{Integer.valueOf(zzdz.zzd())}));
        } else if (zzdz.zzb() != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", new Object[]{Integer.valueOf(zzdz.zzb())}));
        }
    }

    public static void zza() {
        zzpc zza2 = zzpc.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
