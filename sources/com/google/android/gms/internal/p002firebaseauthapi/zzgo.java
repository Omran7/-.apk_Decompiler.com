package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzdq;
import java.security.GeneralSecurityException;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgo  reason: invalid package */
public final class zzgo {
    private static final zzaae zza;
    private static final zzpk<zzdq, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzdl, zzqe> zzd;
    private static final zzns<zzqe> zze;

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza = zzb2;
        Class<zzqd> cls = zzqd.class;
        zzb = zzpk.zza(new zzgn(), zzdq.class, cls);
        zzc = zzpg.zza(new zzgq(), zzb2, cls);
        Class<zzqe> cls2 = zzqe.class;
        zzd = zznw.zza(new zzgp(), zzdl.class, cls2);
        zze = zzns.zza(new zzgs(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzdl zzb(zzqe zzqe, zzck zzck) {
        if (zzqe.zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zztp zza2 = zztp.zza(zzqe.zzd(), zzakk.zza());
                if (zza2.zza() == 0) {
                    return zzdl.zze().zza(zzdq.zze().zzb(zza2.zze().zzb()).zza(zza2.zzd().zza()).zzc(16).zza(zza(zzqe.zzc())).zza()).zza(zzaaf.zza(zza2.zze().zzd(), zzck.zza(zzck))).zza(zzqe.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
    }

    private static zzdq.zza zza(zzxu zzxu) {
        int i2 = zzgr.zza[zzxu.ordinal()];
        if (i2 == 1) {
            return zzdq.zza.zza;
        }
        if (i2 == 2 || i2 == 3) {
            return zzdq.zza.zzb;
        }
        if (i2 == 4) {
            return zzdq.zza.zzc;
        }
        throw new GeneralSecurityException(a.f(zzxu.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* access modifiers changed from: private */
    public static zzdq zzb(zzqd zzqd) {
        if (zzqd.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzts zza2 = zzts.zza(zzqd.zza().zze(), zzakk.zza());
                return zzdq.zze().zzb(zza2.zza()).zza(zza2.zzd().zza()).zzc(16).zza(zza(zzqd.zza().zzd())).zza();
            } catch (zzalf e6) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e6);
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ", zzqd.zza().zzf()));
        }
    }

    private static zzxu zza(zzdq.zza zza2) {
        if (zzdq.zza.zza.equals(zza2)) {
            return zzxu.TINK;
        }
        if (zzdq.zza.zzb.equals(zza2)) {
            return zzxu.CRUNCHY;
        }
        if (zzdq.zza.zzc.equals(zza2)) {
            return zzxu.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zza2)));
    }

    private static zztv zzb(zzdq zzdq) {
        if (zzdq.zzd() == 16) {
            return (zztv) ((zzaky) zztv.zzb().zza(zzdq.zzb()).zze());
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", new Object[]{Integer.valueOf(zzdq.zzd())}));
    }

    public static void zza() {
        zzpc zza2 = zzpc.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
