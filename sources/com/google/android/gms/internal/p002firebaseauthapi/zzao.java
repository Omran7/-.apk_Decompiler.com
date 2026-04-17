package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzao  reason: invalid package */
final class zzao extends zzaj {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzaj zzc;

    public zzao(zzaj zzaj, int i2, int i5) {
        this.zzc = zzaj;
        this.zza = i2;
        this.zzb = i5;
    }

    public final Object get(int i2) {
        zzw.zza(i2, this.zzb);
        return this.zzc.get(i2 + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    public final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    public final boolean zze() {
        return true;
    }

    public final Object[] zzf() {
        return this.zzc.zzf();
    }

    /* renamed from: zza */
    public final zzaj subList(int i2, int i5) {
        zzw.zza(i2, i5, this.zzb);
        zzaj zzaj = this.zzc;
        int i6 = this.zza;
        return (zzaj) zzaj.subList(i2 + i6, i5 + i6);
    }
}
