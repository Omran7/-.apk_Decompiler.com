package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqw;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqp  reason: invalid package */
public final class zzqp extends zzrn {
    private final zzqw zza;
    private final zzaaf zzb;
    private final zzaae zzc;
    private final Integer zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqp$zza */
    public static class zza {
        private zzqw zza;
        private zzaaf zzb;
        private Integer zzc;

        public final zza zza(zzaaf zzaaf) {
            this.zzb = zzaaf;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        public final zza zza(zzqw zzqw) {
            this.zza = zzqw;
            return this;
        }

        public final zzqp zza() {
            zzaae zza2;
            zzqw zzqw = this.zza;
            if (zzqw == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (zzqw.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            } else if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.zza.zza() || this.zzc == null) {
                if (this.zza.zze() == zzqw.zzb.zzd) {
                    zza2 = zzpd.zza;
                } else if (this.zza.zze() == zzqw.zzb.zzc || this.zza.zze() == zzqw.zzb.zzb) {
                    zza2 = zzpd.zza(this.zzc.intValue());
                } else if (this.zza.zze() == zzqw.zzb.zza) {
                    zza2 = zzpd.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
                }
                return new zzqp(this.zza, this.zzb, zza2, this.zzc);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }
    }

    public static zza zzc() {
        return new zza();
    }

    public final /* synthetic */ zzce zza() {
        return (zzqw) zzd();
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

    private zzqp(zzqw zzqw, zzaaf zzaaf, zzaae zzaae, Integer num) {
        this.zza = zzqw;
        this.zzb = zzaaf;
        this.zzc = zzaae;
        this.zzd = num;
    }
}
