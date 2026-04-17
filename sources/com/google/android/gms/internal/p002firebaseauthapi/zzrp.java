package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrp  reason: invalid package */
public final class zzrp implements zzqc<zzcb, zzcb> {
    private static final zzrp zza = new zzrp();
    private static final zzpr<zzoe, zzcb> zzb = zzpr.zza(new zzro(), zzoe.class, zzcb.class);

    public static void zzc() {
        zzoz.zza().zza(zza);
        zzoz.zza().zza(zzb);
    }

    public final Class<zzcb> zza() {
        return zzcb.class;
    }

    public final Class<zzcb> zzb() {
        return zzcb.class;
    }

    public final /* synthetic */ Object zza(zzoa zzoa, zzoj zzoj, zzqb zzqb) {
        zzon zzon;
        zzon zzon2;
        zzaae zzaae;
        zzpq zzpq = new zzpq();
        for (int i2 = 0; i2 < zzoa.zza(); i2++) {
            zzod zza2 = zzoa.zza(i2);
            if (zza2.zzc().equals(zzbo.zza)) {
                zzcb zzcb = (zzcb) zzqb.zza(zza2);
                zzbm zzb2 = zza2.zzb();
                if (zzb2 instanceof zzrn) {
                    zzaae = ((zzrn) zzb2).zze();
                } else if (zzb2 instanceof zzoe) {
                    zzaae = ((zzoe) zzb2).zzc();
                } else {
                    throw new GeneralSecurityException(C0552a.p("Cannot get output prefix for key of class ", zzb2.getClass().getName(), " with parameters ", String.valueOf(zzb2.zza())));
                }
                zzpq.zza(zzaae, new zzrr(zzcb, zza2.zza()));
            }
        }
        if (!zzoj.zza()) {
            zzoo zza3 = zzov.zzb().zza();
            zzon zza4 = zza3.zza(zzoa, zzoj, "mac", "compute");
            zzon = zza3.zza(zzoa, zzoj, "mac", "verify");
            zzon2 = zza4;
        } else {
            zzon2 = zzoq.zza;
            zzon = zzon2;
        }
        return new zzrq(new zzrr((zzcb) zzqb.zza(zzoa.zzc()), zzoa.zzc().zza()), zzpq.zza(), zzon2, zzon);
    }
}
