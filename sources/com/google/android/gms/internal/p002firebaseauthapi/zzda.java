package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzda  reason: invalid package */
public final class zzda implements zzqc<zzbe, zzbe> {
    private static final zzda zza = new zzda();
    private static final zzpr<zzoe, zzbe> zzb = zzpr.zza(new zzcz(), zzoe.class, zzbe.class);

    public static void zzc() {
        zzoz.zza().zza(zza);
        zzoz.zza().zza(zzb);
    }

    public final Class<zzbe> zza() {
        return zzbe.class;
    }

    public final Class<zzbe> zzb() {
        return zzbe.class;
    }

    public final /* synthetic */ Object zza(zzoa zzoa, zzoj zzoj, zzqb zzqb) {
        zzon zzon;
        zzon zzon2;
        zzaae zzaae;
        zzpq zzpq = new zzpq();
        for (int i2 = 0; i2 < zzoa.zza(); i2++) {
            zzod zza2 = zzoa.zza(i2);
            if (zza2.zzc().equals(zzbo.zza)) {
                zzbm zzb2 = zza2.zzb();
                if (zzb2 instanceof zzcv) {
                    zzaae = ((zzcv) zzb2).zzd();
                } else if (zzb2 instanceof zzoe) {
                    zzaae = ((zzoe) zzb2).zzc();
                } else {
                    throw new GeneralSecurityException(C0552a.p("Cannot get output prefix for key of class ", zzb2.getClass().getName(), " with parameters ", String.valueOf(zzb2.zza())));
                }
                zzpq.zza(zzaae, new zzdc((zzbe) zzqb.zza(zza2), zza2.zza()));
            }
        }
        if (!zzoj.zza()) {
            zzoo zza3 = zzov.zzb().zza();
            zzon zza4 = zza3.zza(zzoa, zzoj, "aead", "encrypt");
            zzon = zza3.zza(zzoa, zzoj, "aead", "decrypt");
            zzon2 = zza4;
        } else {
            zzon2 = zzoq.zza;
            zzon = zzon2;
        }
        return new zzdb(new zzdc((zzbe) zzqb.zza(zzoa.zzc()), zzoa.zzc().zza()), zzpq.zza(), zzon2, zzon);
    }

    public static void zza(zzpx zzpx) {
        zzpx.zza(zza);
    }
}
