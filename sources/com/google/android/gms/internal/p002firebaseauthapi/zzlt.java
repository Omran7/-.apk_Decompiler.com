package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzke;
import com.google.android.gms.internal.p002firebaseauthapi.zzve;
import com.google.android.gms.internal.p002firebaseauthapi.zzvk;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlt  reason: invalid package */
public final class zzlt {
    private static final zzaae zza;
    private static final zzaae zzb;
    private static final zzpk<zzke, zzqd> zzc;
    private static final zzpg<zzqd> zzd;
    private static final zznw<zzkg, zzqe> zze;
    private static final zzns<zzqe> zzf;
    private static final zznw<zzkh, zzqe> zzg;
    private static final zzns<zzqe> zzh;
    private static final zznk<zzxu, zzke.zze> zzi;
    private static final zznk<zzvt, zzke.zzd> zzj = zznk.zza().zza(zzvt.SHA1, zzke.zzd.zza).zza(zzvt.SHA224, zzke.zzd.zzb).zza(zzvt.SHA256, zzke.zzd.zzc).zza(zzvt.SHA384, zzke.zzd.zzd).zza(zzvt.SHA512, zzke.zzd.zze).zza();
    private static final zznk<zzvn, zzke.zza> zzk = zznk.zza().zza(zzvn.NIST_P256, zzke.zza.zza).zza(zzvn.NIST_P384, zzke.zza.zzb).zza(zzvn.NIST_P521, zzke.zza.zzc).zza(zzvn.CURVE25519, zzke.zza.zzd).zza();
    private static final zznk<zzuw, zzke.zzc> zzl = zznk.zza().zza(zzuw.UNCOMPRESSED, zzke.zzc.zzb).zza(zzuw.COMPRESSED, zzke.zzc.zza).zza(zzuw.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzke.zzc.zzc).zza();

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza = zzb2;
        zzaae zzb3 = zzqq.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        zzb = zzb3;
        Class<zzqd> cls = zzqd.class;
        zzc = zzpk.zza(new zzls(), zzke.class, cls);
        zzd = zzpg.zza(new zzlv(), zzb2, cls);
        Class<zzqe> cls2 = zzqe.class;
        zze = zznw.zza(new zzlu(), zzkg.class, cls2);
        zzf = zzns.zza(new zzlx(), zzb3, cls2);
        zzg = zznw.zza(new zzlw(), zzkh.class, cls2);
        zzh = zzns.zza(new zzlz(), zzb2, cls2);
        zznn zza2 = zznk.zza().zza(zzxu.RAW, zzke.zze.zzc).zza(zzxu.TINK, zzke.zze.zza);
        zzxu zzxu = zzxu.LEGACY;
        zzke.zze zze2 = zzke.zze.zzb;
        zzi = zza2.zza(zzxu, zze2).zza(zzxu.CRUNCHY, zze2).zza();
    }

    /* access modifiers changed from: private */
    public static zzkh zzc(zzqe zzqe, zzck zzck) {
        if (zzqe.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            try {
                zzve zza2 = zzve.zza(zzqe.zzd(), zzakk.zza());
                if (zza2.zza() == 0) {
                    zzvh zzd2 = zza2.zzd();
                    if (zzd2.zza() == 0) {
                        zzke zza3 = zza(zzqe.zzc(), zzd2.zzb());
                        if (zza3.zzd().equals(zzke.zza.zzd)) {
                            return zzkh.zza(zzkg.zza(zza3, zzaae.zza(zzd2.zzf().zzd()), zzqe.zze()), zzaaf.zza(zza2.zze().zzd(), zzck.zza(zzck)));
                        }
                        return zzkh.zza(zzkg.zza(zza3, new ECPoint(zznh.zza(zzd2.zzf().zzd()), zznh.zza(zzd2.b_().zzd())), zzqe.zze()), zzaad.zza(zznh.zza(zza2.zze().zzd()), zzck.zza(zzck)));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ", zzqe.zzf()));
        }
    }

    /* access modifiers changed from: private */
    public static zzkg zzd(zzqe zzqe, zzck zzck) {
        if (zzqe.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            try {
                zzvh zza2 = zzvh.zza(zzqe.zzd(), zzakk.zza());
                if (zza2.zza() == 0) {
                    zzke zza3 = zza(zzqe.zzc(), zza2.zzb());
                    if (!zza3.zzd().equals(zzke.zza.zzd)) {
                        return zzkg.zza(zza3, new ECPoint(zznh.zza(zza2.zzf().zzd()), zznh.zza(zza2.b_().zzd())), zzqe.zze());
                    }
                    if (zza2.b_().zzb() == 0) {
                        return zzkg.zza(zza3, zzaae.zza(zza2.zzf().zzd()), zzqe.zze());
                    }
                    throw new GeneralSecurityException("Y must be empty for X25519 points");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ", zzqe.zzf()));
        }
    }

    /* access modifiers changed from: private */
    public static zzke zzb(zzqd zzqd) {
        if (zzqd.zza().zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            try {
                return zza(zzqd.zza().zzd(), zzuy.zza(zzqd.zza().zze(), zzakk.zza()).zzc());
            } catch (zzalf e6) {
                throw new GeneralSecurityException("Parsing EciesParameters failed: ", e6);
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to EciesProtoSerialization.parseParameters: ", zzqd.zza().zzf()));
        }
    }

    private static int zza(zzke.zza zza2) {
        if (zzke.zza.zza.equals(zza2)) {
            return 33;
        }
        if (zzke.zza.zzb.equals(zza2)) {
            return 49;
        }
        if (zzke.zza.zzc.equals(zza2)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(String.valueOf(zza2)));
    }

    private static zzke zza(zzxu zzxu, zzvb zzvb) {
        zzke.zzb zza2 = zzke.zzc().zza(zzi.zza(zzxu)).zza(zzk.zza(zzvb.zzf().zzd())).zza(zzj.zza(zzvb.zzf().zze())).zza(zzcm.zza(((zzww) ((zzaky) zzww.zza().zza(zzvb.zzb().zzd().zzf()).zza(zzxu.RAW).zza(zzvb.zzb().zzd().zze()).zze())).zzk())).zza(zzaae.zza(zzvb.zzf().zzf().zzd()));
        if (!zzvb.zzf().zzd().equals(zzvn.CURVE25519)) {
            zza2.zza(zzl.zza(zzvb.zza()));
        } else if (!zzvb.zza().equals(zzuw.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return zza2.zza();
    }

    private static zzvb zzb(zzke zzke) {
        zzvk.zza zza2 = zzvk.zza().zza(zzk.zza(zzke.zzd())).zza(zzj.zza(zzke.zze()));
        if (zzke.zzh() != null && zzke.zzh().zza() > 0) {
            zza2.zza(zzajp.zza(zzke.zzh().zzb()));
        }
        zzvk zzvk = (zzvk) ((zzaky) zza2.zze());
        try {
            zzww zza3 = zzww.zza(zzcm.zza(zzke.zzb()), zzakk.zza());
            zzuv zzuv = (zzuv) ((zzaky) zzuv.zza().zza((zzww) ((zzaky) zzww.zza().zza(zza3.zzf()).zza(zzxu.TINK).zza(zza3.zze()).zze())).zze());
            zzke.zzc zzf2 = zzke.zzf();
            if (zzf2 == null) {
                zzf2 = zzke.zzc.zza;
            }
            return (zzvb) ((zzaky) zzvb.zzc().zza(zzvk).zza(zzuv).zza(zzl.zza(zzf2)).zze());
        } catch (zzalf e6) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e6);
        }
    }

    public static /* synthetic */ zzqe zza(zzkh zzkh, zzck zzck) {
        zzve.zza zza2 = zzve.zzb().zza(0).zza(zza((zzkg) ((zzll) zzkh.zzc())));
        if (((zzke) ((zzlj) zzkh.zza())).zzd().equals(zzke.zza.zzd)) {
            zza2.zza(zzajp.zza(zzkh.zzg().zza(zzck.zza(zzck))));
        } else {
            zza2.zza(zzajp.zza(zznh.zza(zzkh.zzf().zza(zzck.zza(zzck)), zza(((zzke) ((zzlj) zzkh.zza())).zzd()))));
        }
        return zzqe.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((zzve) ((zzaky) zza2.zze())).a_(), zzws.zza.ASYMMETRIC_PRIVATE, zzi.zza(((zzke) ((zzlj) zzkh.zza())).zzg()), zzkh.zzb());
    }

    private static zzvh zza(zzkg zzkg) {
        if (((zzke) ((zzlj) zzkg.zza())).zzd().equals(zzke.zza.zzd)) {
            return (zzvh) ((zzaky) zzvh.zzc().zza(0).zza(zzb((zzke) ((zzlj) zzkg.zza()))).zza(zzajp.zza(zzkg.zze().zzb())).zzb(zzajp.zza).zze());
        }
        int zza2 = zza(((zzke) ((zzlj) zzkg.zza())).zzd());
        ECPoint zzf2 = zzkg.zzf();
        if (zzf2 != null) {
            return (zzvh) ((zzaky) zzvh.zzc().zza(0).zza(zzb((zzke) ((zzlj) zzkg.zza()))).zza(zzajp.zza(zznh.zza(zzf2.getAffineX(), zza2))).zzb(zzajp.zza(zznh.zza(zzf2.getAffineY(), zza2))).zze());
        }
        throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
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
