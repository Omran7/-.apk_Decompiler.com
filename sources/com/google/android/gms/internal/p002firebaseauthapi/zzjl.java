package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjl  reason: invalid package */
public final class zzjl implements zzqc<zzbi, zzbi> {
    private static final zzjl zza = new zzjl();
    private static final zzpr<zzoe, zzbi> zzb = zzpr.zza(new zzjo(), zzoe.class, zzbi.class);

    public static void zzc() {
        zzoz.zza().zza(zza);
        zzoz.zza().zza(zzb);
    }

    public final Class<zzbi> zza() {
        return zzbi.class;
    }

    public final Class<zzbi> zzb() {
        return zzbi.class;
    }

    public final /* synthetic */ Object zza(zzoa zzoa, zzoj zzoj, zzqb zzqb) {
        zzon zzon;
        zzon zzon2;
        zzaae zzaae;
        zzpq zzpq = new zzpq();
        for (int i2 = 0; i2 < zzoa.zza(); i2++) {
            zzod zza2 = zzoa.zza(i2);
            if (zza2.zzc().equals(zzbo.zza)) {
                zzbi zzbi = (zzbi) zzqb.zza(zza2);
                zzbm zzb2 = zza2.zzb();
                if (zzb2 instanceof zzjj) {
                    zzaae = ((zzjj) zzb2).zze();
                } else if (zzb2 instanceof zzoe) {
                    zzaae = ((zzoe) zzb2).zzc();
                } else {
                    throw new GeneralSecurityException(C0552a.p("Cannot get output prefix for key of class ", zzb2.getClass().getName(), " with parameters ", String.valueOf(zzb2.zza())));
                }
                zzpq.zza(zzaae, new zzjn(zzbi, zza2.zza()));
            }
        }
        if (!zzoj.zza()) {
            zzoo zza3 = zzov.zzb().zza();
            zzon2 = zza3.zza(zzoa, zzoj, "daead", "encrypt");
            zzon = zza3.zza(zzoa, zzoj, "daead", "decrypt");
        } else {
            zzon2 = zzoq.zza;
            zzon = zzon2;
        }
        return new zzjq(new zzjn((zzbi) zzqb.zza(zzoa.zzc()), zzoa.zzc().zza()), zzpq.zza(), zzon2, zzon);
    }
}
