package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlc  reason: invalid package */
public final class zzlc implements zzqc<zzbk, zzbk> {
    private static final zzlc zza = new zzlc();
    private static final zzpr<zzoe, zzbk> zzb = zzpr.zza(new zzlf(), zzoe.class, zzbk.class);

    public static void zzc() {
        zzoz.zza().zza(zza);
        zzoz.zza().zza(zzb);
    }

    public final Class<zzbk> zza() {
        return zzbk.class;
    }

    public final Class<zzbk> zzb() {
        return zzbk.class;
    }

    public final /* synthetic */ Object zza(zzoa zzoa, zzoj zzoj, zzqb zzqb) {
        zzon zzon;
        if (!zzoj.zza()) {
            zzon = zzov.zzb().zza().zza(zzoa, zzoj, "hybrid_encrypt", "encrypt");
        } else {
            zzon = zzoq.zza;
        }
        zzod zzc = zzoa.zzc();
        return new zzlh(new zzle((zzbk) zzqb.zza(zzc), zzc.zza()), zzon);
    }

    public static void zza(zzpx zzpx) {
        zzpx.zza(zza);
    }
}
