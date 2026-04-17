package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdq;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdl  reason: invalid package */
public final class zzdl extends zzcv {
    private final zzdq zza;
    private final zzaaf zzb;
    private final zzaae zzc;
    private final Integer zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdl$zza */
    public static class zza {
        private zzdq zza;
        private zzaaf zzb;
        private Integer zzc;

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(zzaaf zzaaf) {
            this.zzb = zzaaf;
            return this;
        }

        public final zza zza(zzdq zzdq) {
            this.zza = zzdq;
            return this;
        }

        public final zzdl zza() {
            zzaae zzb2;
            zzdq zzdq = this.zza;
            if (zzdq == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (zzdq.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            } else if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.zza.zza() || this.zzc == null) {
                if (this.zza.zzf() == zzdq.zza.zzc) {
                    zzb2 = zzpd.zza;
                } else if (this.zza.zzf() == zzdq.zza.zzb) {
                    zzb2 = zzpd.zza(this.zzc.intValue());
                } else if (this.zza.zzf() == zzdq.zza.zza) {
                    zzb2 = zzpd.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
                }
                return new zzdl(this.zza, this.zzb, zzb2, this.zzc);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }
    }

    public static zza zze() {
        return new zza();
    }

    public final /* synthetic */ zzce zza() {
        return (zzdq) zzc();
    }

    public final Integer zzb() {
        return this.zzd;
    }

    public final /* synthetic */ zzcx zzc() {
        return this.zza;
    }

    public final zzaae zzd() {
        return this.zzc;
    }

    public final zzaaf zzf() {
        return this.zzb;
    }

    private zzdl(zzdq zzdq, zzaaf zzaaf, zzaae zzaae, Integer num) {
        this.zza = zzdq;
        this.zzb = zzaaf;
        this.zzc = zzaae;
        this.zzd = num;
    }
}
