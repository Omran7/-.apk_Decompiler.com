package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzeg;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeb  reason: invalid package */
public final class zzeb extends zzcv {
    private final zzeg zza;
    private final zzaaf zzb;
    private final zzaae zzc;
    private final Integer zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeb$zza */
    public static class zza {
        private zzeg zza;
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

        public final zza zza(zzeg zzeg) {
            this.zza = zzeg;
            return this;
        }

        public final zzeb zza() {
            zzaae zzb2;
            zzeg zzeg = this.zza;
            if (zzeg == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (zzeg.zzb() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            } else if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.zza.zza() || this.zzc == null) {
                if (this.zza.zzd() == zzeg.zza.zzc) {
                    zzb2 = zzpd.zza;
                } else if (this.zza.zzd() == zzeg.zza.zzb) {
                    zzb2 = zzpd.zza(this.zzc.intValue());
                } else if (this.zza.zzd() == zzeg.zza.zza) {
                    zzb2 = zzpd.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
                }
                return new zzeb(this.zza, this.zzb, zzb2, this.zzc);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }
    }

    public static zza zze() {
        return new zza();
    }

    public final /* synthetic */ zzce zza() {
        return (zzeg) zzc();
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

    private zzeb(zzeg zzeg, zzaaf zzaaf, zzaae zzaae, Integer num) {
        this.zza = zzeg;
        this.zzb = zzaaf;
        this.zzc = zzaae;
        this.zzd = num;
    }
}
