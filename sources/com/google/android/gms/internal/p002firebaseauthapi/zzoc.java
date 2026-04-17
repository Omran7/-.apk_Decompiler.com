package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzws;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoc  reason: invalid package */
public class zzoc<P> implements zzbl<P> {
    final String zza;
    final zzws.zza zzb;
    private final Class<P> zzc;

    public zzoc(String str, Class<P> cls, zzws.zza zza2, zzamp<? extends zzamc> zzamp) {
        this.zza = str;
        this.zzc = cls;
        this.zzb = zza2;
    }

    public static <P> zzbl<P> zza(String str, Class<P> cls, zzws.zza zza2, zzamp<? extends zzamc> zzamp) {
        return new zzoc(str, cls, zza2, zzamp);
    }

    public final P zzb(zzajp zzajp) {
        return zzoz.zza().zza(zzpc.zza().zza(zzqe.zza(this.zza, zzajp, this.zzb, zzxu.RAW, (Integer) null), zzbj.zza()), this.zzc);
    }

    public static <P> zzcg<P> zza(String str, Class<P> cls, zzamp<? extends zzamc> zzamp) {
        return new zzof(str, cls, zzamp);
    }

    public final zzws zza(zzajp zzajp) {
        zzqe zzqe = (zzqe) zzpc.zza().zza(zzos.zza().zza(zzpc.zza().zza(zzqd.zza((zzww) ((zzaky) zzww.zza().zza(this.zza).zza(zzajp).zza(zzxu.RAW).zze()))), (Integer) null), zzqe.class, zzbj.zza());
        return (zzws) ((zzaky) zzws.zza().zza(zzqe.zzf()).zza(zzqe.zzd()).zza(zzqe.zza()).zze());
    }

    public final String zzb() {
        return this.zza;
    }

    public final Class<P> zza() {
        return this.zzc;
    }
}
