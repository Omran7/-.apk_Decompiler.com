package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzrj;
import java.security.GeneralSecurityException;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsj  reason: invalid package */
public final class zzsj {
    private static final zzaae zza;
    private static final zznk<zzxu, zzrj.zzb> zzb = zznk.zza().zza(zzxu.RAW, zzrj.zzb.zzd).zza(zzxu.TINK, zzrj.zzb.zza).zza(zzxu.LEGACY, zzrj.zzb.zzc).zza(zzxu.CRUNCHY, zzrj.zzb.zzb).zza();
    private static final zznk<zzvt, zzrj.zzc> zzc = zznk.zza().zza(zzvt.SHA1, zzrj.zzc.zza).zza(zzvt.SHA224, zzrj.zzc.zzb).zza(zzvt.SHA256, zzrj.zzc.zzc).zza(zzvt.SHA384, zzrj.zzc.zzd).zza(zzvt.SHA512, zzrj.zzc.zze).zza();
    private static final zzpk<zzrj, zzqd> zzd;
    private static final zzpg<zzqd> zze;
    private static final zznw<zzrc, zzqe> zzf;
    private static final zzns<zzqe> zzg;

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zza = zzb2;
        Class<zzqd> cls = zzqd.class;
        zzd = zzpk.zza(new zzsi(), zzrj.class, cls);
        zze = zzpg.zza(new zzsl(), zzb2, cls);
        Class<zzqe> cls2 = zzqe.class;
        zzf = zznw.zza(new zzsk(), zzrc.class, cls2);
        zzg = zzns.zza(new zzsn(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzrc zzb(zzqe zzqe, zzck zzck) {
        if (zzqe.zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzvs zza2 = zzvs.zza(zzqe.zzd(), zzakk.zza());
                if (zza2.zza() == 0) {
                    return zzrc.zzc().zza(zzrj.zzd().zza(zza2.zzf().zzb()).zzb(zza2.zze().zza()).zza(zzc.zza(zza2.zze().zzb())).zza(zzb.zza(zzqe.zzc())).zza()).zza(zzaaf.zza(zza2.zzf().zzd(), zzck.zza(zzck))).zza(zzqe.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
    }

    /* access modifiers changed from: private */
    public static zzrj zzb(zzqd zzqd) {
        if (zzqd.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzvv zza2 = zzvv.zza(zzqd.zza().zze(), zzakk.zza());
                if (zza2.zzb() == 0) {
                    return zzrj.zzd().zza(zza2.zza()).zzb(zza2.zzf().zza()).zza(zzc.zza(zza2.zzf().zzb())).zza(zzb.zza(zzqd.zza().zzd())).zza();
                }
                throw new GeneralSecurityException(a.f(zza2.zzb(), "Parsing HmacParameters failed: unknown Version "));
            } catch (zzalf e6) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e6);
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to HmacProtoSerialization.parseParameters: ", zzqd.zza().zzf()));
        }
    }

    public static void zza() {
        zzpc zza2 = zzpc.zza();
        zza2.zza(zzd);
        zza2.zza(zze);
        zza2.zza(zzf);
        zza2.zza(zzg);
    }

    private static zzvy zzb(zzrj zzrj) {
        return (zzvy) ((zzaky) zzvy.zzc().zza(zzrj.zzb()).zza(zzc.zza(zzrj.zze())).zze());
    }
}
