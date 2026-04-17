package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzky  reason: invalid package */
public final class zzky implements zzqc<zzbh, zzbh> {
    private static final zzky zza = new zzky();
    private static final zzpr<zzoe, zzbh> zzb = zzpr.zza(new zzlb(), zzoe.class, zzbh.class);

    public static void zzc() {
        zzoz.zza().zza(zza);
        zzoz.zza().zza(zzb);
    }

    public final Class<zzbh> zza() {
        return zzbh.class;
    }

    public final Class<zzbh> zzb() {
        return zzbh.class;
    }

    public final /* synthetic */ Object zza(zzoa zzoa, zzoj zzoj, zzqb zzqb) {
        zzon zzon;
        zzaae zzaae;
        zzpq zzpq = new zzpq();
        for (int i2 = 0; i2 < zzoa.zza(); i2++) {
            zzod zza2 = zzoa.zza(i2);
            if (zza2.zzc().equals(zzbo.zza)) {
                zzbh zzbh = (zzbh) zzqb.zza(zza2);
                zzbm zzb2 = zza2.zzb();
                if (zzb2 instanceof zzli) {
                    zzaae = ((zzli) zzb2).zzh();
                } else if (zzb2 instanceof zzoe) {
                    zzaae = ((zzoe) zzb2).zzc();
                } else {
                    throw new GeneralSecurityException(C0552a.p("Cannot get output prefix for key of class ", zzb2.getClass().getName(), " with parameters ", String.valueOf(zzb2.zza())));
                }
                zzpq.zza(zzaae, new zzla(zzbh, zza2.zza()));
            }
        }
        if (!zzoj.zza()) {
            zzon = zzov.zzb().zza().zza(zzoa, zzoj, "hybrid_decrypt", "decrypt");
        } else {
            zzon = zzoq.zza;
        }
        return new zzld(zzpq.zza(), zzon);
    }

    public static void zza(zzpx zzpx) {
        zzpx.zza(zza);
    }
}
