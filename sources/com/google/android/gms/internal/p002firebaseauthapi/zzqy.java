package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqy  reason: invalid package */
public final class zzqy implements zzqc<zzqz, zzqz> {
    private static final zzqy zza = new zzqy();

    private zzqy() {
    }

    public static void zzc() {
        zzoz.zza().zza(zza);
    }

    public final Class<zzqz> zza() {
        return zzqz.class;
    }

    public final Class<zzqz> zzb() {
        return zzqz.class;
    }

    public final /* synthetic */ Object zza(zzoa zzoa, zzoj zzoj, zzqb zzqb) {
        zzaae zzaae;
        zzod zzc = zzoa.zzc();
        if (zzc != null) {
            zzpq zzpq = new zzpq();
            for (int i2 = 0; i2 < zzoa.zza(); i2++) {
                zzod zza2 = zzoa.zza(i2);
                if (zza2.zzc().equals(zzbo.zza)) {
                    zzqz zzqz = (zzqz) zzqb.zza(zza2);
                    zzbm zzb = zza2.zzb();
                    if (zzb instanceof zzrn) {
                        zzaae = ((zzrn) zzb).zze();
                    } else if (zzb instanceof zzoe) {
                        zzaae = ((zzoe) zzb).zzc();
                    } else {
                        throw new GeneralSecurityException(C0552a.p("Cannot get output prefix for key of class ", zzb.getClass().getName(), " with parameters ", String.valueOf(zzb.zza())));
                    }
                    zzpq.zza(zzaae, zzqz);
                }
            }
            return new zzrb(zzpq.zza(), (zzqz) zzqb.zza(zzc));
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}
