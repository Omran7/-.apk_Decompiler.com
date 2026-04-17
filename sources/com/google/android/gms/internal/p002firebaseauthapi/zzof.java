package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzof  reason: invalid package */
final class zzof<P> extends zzoc<P> implements zzcg<P> {
    public zzof(String str, Class<P> cls, zzamp<? extends zzamc> zzamp) {
        super(str, cls, zzws.zza.ASYMMETRIC_PRIVATE, zzamp);
    }

    public final zzws zzc(zzajp zzajp) {
        zzbm zza = zzpc.zza().zza(zzqe.zza(this.zza, zzajp, this.zzb, zzxu.RAW, (Integer) null), zzbj.zza());
        if (zza instanceof zzcd) {
            zzqe zzqe = (zzqe) zzpc.zza().zza(((zzcd) zza).zzc(), zzqe.class, zzbj.zza());
            return (zzws) ((zzaky) zzws.zza().zza(zzqe.zzf()).zza(zzqe.zzd()).zza(zzqe.zza()).zze());
        }
        throw new GeneralSecurityException("Key not private key");
    }
}
