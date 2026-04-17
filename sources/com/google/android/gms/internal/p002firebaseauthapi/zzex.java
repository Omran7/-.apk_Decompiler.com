package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzev;
import java.security.GeneralSecurityException;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzex  reason: invalid package */
final class zzex {
    private static final zzaae zza;
    private static final zzpk<zzev, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzew, zzqe> zzd;
    private static final zzns<zzqe> zze;

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zza = zzb2;
        Class<zzqd> cls = zzqd.class;
        zzb = zzpk.zza(new zzez(), zzev.class, cls);
        zzc = zzpg.zza(new zzey(), zzb2, cls);
        Class<zzqe> cls2 = zzqe.class;
        zzd = zznw.zza(new zzfb(), zzew.class, cls2);
        zze = zzns.zza(new zzfa(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzew zzb(zzqe zzqe, zzck zzck) {
        if (zzqe.zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                zzxi zza2 = zzxi.zza(zzqe.zzd(), zzakk.zza());
                if (zza2.zza() == 0) {
                    return zzew.zza(zzev.zza(zza2.zzd().zzd(), zza(zzqe.zzc())), zzqe.zze());
                }
                throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(zza2)));
            } catch (zzalf e6) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e6);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
    }

    private static zzev.zza zza(zzxu zzxu) {
        int i2 = zzfd.zza[zzxu.ordinal()];
        if (i2 == 1) {
            return zzev.zza.zza;
        }
        if (i2 == 2) {
            return zzev.zza.zzb;
        }
        throw new GeneralSecurityException(a.f(zzxu.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* access modifiers changed from: private */
    public static zzev zzb(zzqd zzqd) {
        if (zzqd.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzev.zza(zzxl.zza(zzqd.zza().zze(), zzakk.zza()).zzd(), zza(zzqd.zza().zzd()));
            } catch (zzalf e6) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e6);
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ", zzqd.zza().zzf()));
        }
    }

    private static zzxu zza(zzev.zza zza2) {
        if (zzev.zza.zza.equals(zza2)) {
            return zzxu.TINK;
        }
        if (zzev.zza.zzb.equals(zza2)) {
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
