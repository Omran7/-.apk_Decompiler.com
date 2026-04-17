package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalk  reason: invalid package */
public class zzalk {
    private volatile zzamc zza;
    private volatile zzajp zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzalk)) {
            return false;
        }
        zzalk zzalk = (zzalk) obj;
        zzamc zzamc = this.zza;
        zzamc zzamc2 = zzalk.zza;
        if (zzamc == null && zzamc2 == null) {
            return zzb().equals(zzalk.zzb());
        }
        if (zzamc != null && zzamc2 != null) {
            return zzamc.equals(zzamc2);
        }
        if (zzamc != null) {
            return zzamc.equals(zzalk.zzb(zzamc.zzg()));
        }
        return zzb(zzamc2.zzg()).equals(zzamc2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return this.zzb.zzb();
        }
        if (this.zza != null) {
            return this.zza.zzl();
        }
        return 0;
    }

    public final zzajp zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    zzajp zzajp = this.zzb;
                    return zzajp;
                }
                if (this.zza == null) {
                    this.zzb = zzajp.zza;
                } else {
                    this.zzb = this.zza.a_();
                }
                zzajp zzajp2 = this.zzb;
                return zzajp2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzamc zza(zzamc zzamc) {
        zzamc zzamc2 = this.zza;
        this.zzb = null;
        this.zza = zzamc;
        return zzamc2;
    }

    private final zzamc zzb(zzamc zzamc) {
        if (this.zza == null) {
            synchronized (this) {
                if (this.zza == null) {
                    try {
                        this.zza = zzamc;
                        this.zzb = zzajp.zza;
                    } catch (zzalf unused) {
                        this.zzc = true;
                        this.zza = zzamc;
                        this.zzb = zzajp.zza;
                    }
                }
            }
        }
        return this.zza;
    }
}
