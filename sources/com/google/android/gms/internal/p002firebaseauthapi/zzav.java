package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzav  reason: invalid package */
final class zzav<K> extends zzas<K> {
    private final transient zzan<K, ?> zza;
    private final transient zzaj<K> zzb;

    public zzav(zzan<K, ?> zzan, zzaj<K> zzaj) {
        this.zza = zzan;
        this.zzb = zzaj;
    }

    public final boolean contains(Object obj) {
        if (this.zza.get(obj) != null) {
            return true;
        }
        return false;
    }

    public final int size() {
        return this.zza.size();
    }

    public final int zza(Object[] objArr, int i2) {
        return zzc().zza(objArr, i2);
    }

    public final zzaj<K> zzc() {
        return this.zzb;
    }

    /* renamed from: zzd */
    public final zzba<K> iterator() {
        return (zzba) zzc().iterator();
    }

    public final boolean zze() {
        return true;
    }
}
