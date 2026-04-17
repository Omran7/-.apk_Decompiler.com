package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzfz;
import java.security.GeneralSecurityException;
import java.util.Objects;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzid  reason: invalid package */
public final class zzid {
    private static final zzaae zza;
    private static final zzpk<zzfz, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzfv, zzqe> zzd;
    private static final zzns<zzqe> zze;

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zza = zzb2;
        Class<zzqd> cls = zzqd.class;
        zzb = zzpk.zza(new zzig(), zzfz.class, cls);
        zzc = zzpg.zza(new zzif(), zzb2, cls);
        Class<zzqe> cls2 = zzqe.class;
        zzd = zznw.zza(new zzii(), zzfv.class, cls2);
        zze = zzns.zza(new zzih(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzfv zzb(zzqe zzqe, zzck zzck) {
        if (zzqe.zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzxw zza2 = zzxw.zza(zzqe.zzd(), zzakk.zza());
                if (zza2.zza() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } else if (zza2.zze().zzb() == 32) {
                    return zzfv.zza(zzfz.zza(zza(zzqe.zzc()), zza2.zzd().zza()), zzaaf.zza(zza2.zze().zzd(), zzck.zza(zzck)), zzqe.zze());
                } else {
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                }
            } catch (zzalf unused) {
                throw new GeneralSecurityException("Parsing XAesGcmKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
    }

    private static zzfz.zza zza(zzxu zzxu) {
        int i2 = zzik.zza[zzxu.ordinal()];
        if (i2 == 1) {
            return zzfz.zza.zza;
        }
        if (i2 == 2) {
            return zzfz.zza.zzb;
        }
        throw new GeneralSecurityException(a.f(zzxu.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* access modifiers changed from: private */
    public static zzfz zzb(zzqd zzqd) {
        if (zzqd.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzxz zza2 = zzxz.zza(zzqd.zza().zze(), zzakk.zza());
                if (zza2.zza() == 0) {
                    return zzfz.zza(zza(zzqd.zza().zzd()), zza2.zzd().zza());
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzalf e6) {
                throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e6);
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ", zzqd.zza().zzf()));
        }
    }

    private static zzxu zza(zzfz.zza zza2) {
        if (Objects.equals(zza2, zzfz.zza.zza)) {
            return zzxu.TINK;
        }
        if (Objects.equals(zza2, zzfz.zza.zzb)) {
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
