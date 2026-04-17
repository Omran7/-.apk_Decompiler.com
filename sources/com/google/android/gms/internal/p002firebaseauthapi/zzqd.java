package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqd  reason: invalid package */
public final class zzqd implements zzqi {
    private final zzaae zza;
    private final zzww zzb;

    private zzqd(zzww zzww, zzaae zzaae) {
        this.zzb = zzww;
        this.zza = zzaae;
    }

    public static zzqd zza(zzww zzww) {
        return new zzqd(zzww, zzqq.zza(zzww.zzf()));
    }

    public static zzqd zzb(zzww zzww) {
        return new zzqd(zzww, zzqq.zzb(zzww.zzf()));
    }

    public final zzww zza() {
        return this.zzb;
    }

    public final zzaae zzb() {
        return this.zza;
    }
}
