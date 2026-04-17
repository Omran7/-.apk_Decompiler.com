package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzki;
import java.security.GeneralSecurityException;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkk  reason: invalid package */
public final class zzkk {
    private static final zzaae zza;
    private static final zzaae zzb;
    private static final zzpk<zzki, zzqd> zzc;
    private static final zzpg<zzqd> zzd;
    private static final zznw<zzkt, zzqe> zze;
    private static final zzns<zzqe> zzf;
    private static final zznw<zzkl, zzqe> zzg;
    private static final zzns<zzqe> zzh;
    private static final zznk<zzxu, zzki.zzf> zzi;
    private static final zznk<zzwd, zzki.zzd> zzj = zznk.zza().zza(zzwd.DHKEM_P256_HKDF_SHA256, zzki.zzd.zza).zza(zzwd.DHKEM_P384_HKDF_SHA384, zzki.zzd.zzb).zza(zzwd.DHKEM_P521_HKDF_SHA512, zzki.zzd.zzc).zza(zzwd.DHKEM_X25519_HKDF_SHA256, zzki.zzd.zzd).zza();
    private static final zznk<zzwe, zzki.zze> zzk = zznk.zza().zza(zzwe.HKDF_SHA256, zzki.zze.zza).zza(zzwe.HKDF_SHA384, zzki.zze.zzb).zza(zzwe.HKDF_SHA512, zzki.zze.zzc).zza();
    private static final zznk<zzwb, zzki.zza> zzl = zznk.zza().zza(zzwb.AES_128_GCM, zzki.zza.zza).zza(zzwb.AES_256_GCM, zzki.zza.zzb).zza(zzwb.CHACHA20_POLY1305, zzki.zza.zzc).zza();

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        zza = zzb2;
        zzaae zzb3 = zzqq.zzb("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        zzb = zzb3;
        Class<zzqd> cls = zzqd.class;
        zzc = zzpk.zza(new zzkn(), zzki.class, cls);
        zzd = zzpg.zza(new zzkm(), zzb2, cls);
        Class<zzqe> cls2 = zzqe.class;
        zze = zznw.zza(new zzkp(), zzkt.class, cls2);
        zzf = zzns.zza(new zzko(), zzb3, cls2);
        zzg = zznw.zza(new zzkr(), zzkl.class, cls2);
        zzh = zzns.zza(new zzkq(), zzb2, cls2);
        zznn zza2 = zznk.zza().zza(zzxu.RAW, zzki.zzf.zzc).zza(zzxu.TINK, zzki.zzf.zza);
        zzxu zzxu = zzxu.LEGACY;
        zzki.zzf zzf2 = zzki.zzf.zzb;
        zzi = zza2.zza(zzxu, zzf2).zza(zzxu.CRUNCHY, zzf2).zza();
    }

    /* access modifiers changed from: private */
    public static zzkl zzc(zzqe zzqe, zzck zzck) {
        if (zzqe.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            try {
                zzwm zza2 = zzwm.zza(zzqe.zzd(), zzakk.zza());
                if (zza2.zza() == 0) {
                    zzwp zzd2 = zza2.zzd();
                    if (zzd2.zza() == 0) {
                        zzki zza3 = zza(zzqe.zzc(), zzd2.zzb());
                        return zzkl.zza(zzkt.zza(zza3, zza(zza3.zze(), zzd2.zzf().zzd()), zzqe.zze()), zzaaf.zza(zznh.zza(zznh.zza(zza2.zze().zzd()), zzmn.zza(zza3.zze())), zzck.zza(zzck)));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf unused) {
                throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ", zzqe.zzf()));
        }
    }

    /* access modifiers changed from: private */
    public static zzkt zzd(zzqe zzqe, zzck zzck) {
        if (zzqe.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
            try {
                zzwp zza2 = zzwp.zza(zzqe.zzd(), zzakk.zza());
                if (zza2.zza() == 0) {
                    zzki zza3 = zza(zzqe.zzc(), zza2.zzb());
                    return zzkt.zza(zza3, zza(zza3.zze(), zza2.zzf().zzd()), zzqe.zze());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf unused) {
                throw new GeneralSecurityException("Parsing HpkePublicKey failed");
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ", zzqe.zzf()));
        }
    }

    /* access modifiers changed from: private */
    public static zzki zzb(zzqd zzqd) {
        if (zzqd.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            try {
                return zza(zzqd.zza().zzd(), zzwg.zza(zzqd.zza().zze(), zzakk.zza()).zzc());
            } catch (zzalf e6) {
                throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e6);
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ", zzqd.zza().zzf()));
        }
    }

    private static zzki zza(zzxu zzxu, zzwj zzwj) {
        return zzki.zzc().zza(zzi.zza(zzxu)).zza(zzj.zza(zzwj.zzc())).zza(zzk.zza(zzwj.zzb())).zza(zzl.zza(zzwj.zza())).zza();
    }

    private static zzwj zzb(zzki zzki) {
        return (zzwj) ((zzaky) zzwj.zzd().zza(zzj.zza(zzki.zze())).zza(zzk.zza(zzki.zzd())).zza(zzl.zza(zzki.zzb())).zze());
    }

    private static zzwp zza(zzkt zzkt) {
        return (zzwp) ((zzaky) zzwp.zzc().zza(0).zza(zzb((zzki) ((zzlj) zzkt.zza()))).zza(zzajp.zza(zzkt.zze().zzb())).zze());
    }

    private static zzaae zza(zzki.zzd zzd2, byte[] bArr) {
        return zzaae.zza(zznh.zza(zznh.zza(bArr), zzmn.zzb(zzd2)));
    }

    public static void zza() {
        zzpc zza2 = zzpc.zza();
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
        zza2.zza(zzf);
        zza2.zza(zzg);
        zza2.zza(zzh);
    }
}
