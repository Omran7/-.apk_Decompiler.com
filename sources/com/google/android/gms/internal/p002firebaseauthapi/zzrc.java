package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzrj;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrc  reason: invalid package */
public final class zzrc extends zzrn {
    private final zzrj zza;
    private final zzaaf zzb;
    private final zzaae zzc;
    private final Integer zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrc$zza */
    public static class zza {
        private zzrj zza;
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

        public final zza zza(zzrj zzrj) {
            this.zza = zzrj;
            return this;
        }

        public final zzrc zza() {
            zzaae zza2;
            zzrj zzrj = this.zza;
            if (zzrj == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (zzrj.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            } else if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.zza.zza() || this.zzc == null) {
                if (this.zza.zzf() == zzrj.zzb.zzd) {
                    zza2 = zzpd.zza;
                } else if (this.zza.zzf() == zzrj.zzb.zzc || this.zza.zzf() == zzrj.zzb.zzb) {
                    zza2 = zzpd.zza(this.zzc.intValue());
                } else if (this.zza.zzf() == zzrj.zzb.zza) {
                    zza2 = zzpd.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
                }
                return new zzrc(this.zza, this.zzb, zza2, this.zzc);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }
    }

    public static zza zzc() {
        return new zza();
    }

    public final /* synthetic */ zzce zza() {
        return (zzrj) zzd();
    }

    public final Integer zzb() {
        return this.zzd;
    }

    public final /* synthetic */ zzrm zzd() {
        return this.zza;
    }

    public final zzaae zze() {
        return this.zzc;
    }

    public final zzaaf zzf() {
        return this.zzb;
    }

    private zzrc(zzrj zzrj, zzaaf zzaaf, zzaae zzaae, Integer num) {
        this.zza = zzrj;
        this.zzb = zzaaf;
        this.zzc = zzaae;
        this.zzd = num;
    }
}
