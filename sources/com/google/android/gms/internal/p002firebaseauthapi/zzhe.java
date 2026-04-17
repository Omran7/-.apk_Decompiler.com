package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzeg;
import java.security.GeneralSecurityException;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhe  reason: invalid package */
public final class zzhe {
    private static final zzaae zza;
    private static final zzpk<zzeg, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzeb, zzqe> zzd;
    private static final zzns<zzqe> zze;

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zza = zzb2;
        Class<zzqd> cls = zzqd.class;
        zzb = zzpk.zza(new zzhd(), zzeg.class, cls);
        zzc = zzpg.zza(new zzhg(), zzb2, cls);
        Class<zzqe> cls2 = zzqe.class;
        zzd = zznw.zza(new zzhf(), zzeb.class, cls2);
        zze = zzns.zza(new zzhi(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzeb zzb(zzqe zzqe, zzck zzck) {
        if (zzqe.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzue zza2 = zzue.zza(zzqe.zzd(), zzakk.zza());
                if (zza2.zza() == 0) {
                    return zzeb.zze().zza(zzeg.zzc().zza(zza2.zzd().zzb()).zza(zza(zzqe.zzc())).zza()).zza(zzaaf.zza(zza2.zzd().zzd(), zzck.zza(zzck))).zza(zzqe.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
    }

    private static zzeg.zza zza(zzxu zzxu) {
        int i2 = zzhh.zza[zzxu.ordinal()];
        if (i2 == 1) {
            return zzeg.zza.zza;
        }
        if (i2 == 2 || i2 == 3) {
            return zzeg.zza.zzb;
        }
        if (i2 == 4) {
            return zzeg.zza.zzc;
        }
        throw new GeneralSecurityException(a.f(zzxu.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* access modifiers changed from: private */
    public static zzeg zzb(zzqd zzqd) {
        if (zzqd.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzuh zza2 = zzuh.zza(zzqd.zza().zze(), zzakk.zza());
                if (zza2.zzb() == 0) {
                    return zzeg.zzc().zza(zza2.zza()).zza(zza(zzqd.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzalf e6) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e6);
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ", zzqd.zza().zzf()));
        }
    }

    private static zzxu zza(zzeg.zza zza2) {
        if (zzeg.zza.zza.equals(zza2)) {
            return zzxu.TINK;
        }
        if (zzeg.zza.zzb.equals(zza2)) {
            return zzxu.CRUNCHY;
        }
        if (zzeg.zza.zzc.equals(zza2)) {
            return zzxu.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zza2)));
    }

    public static void zza() {
        zzpc zza2 = zzpc.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
