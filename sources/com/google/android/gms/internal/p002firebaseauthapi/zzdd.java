package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdk;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdd  reason: invalid package */
public final class zzdd extends zzcv {
    private final zzdk zza;
    private final zzaaf zzb;
    private final zzaaf zzc;
    private final zzaae zzd;
    private final Integer zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdd$zza */
    public static class zza {
        private zzdk zza;
        private zzaaf zzb;
        private zzaaf zzc;
        private Integer zzd;

        public final zza zza(zzaaf zzaaf) {
            this.zzb = zzaaf;
            return this;
        }

        public final zza zzb(zzaaf zzaaf) {
            this.zzc = zzaaf;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
        }

        public final zza zza(Integer num) {
            this.zzd = num;
            return this;
        }

        public final zza zza(zzdk zzdk) {
            this.zza = zzdk;
            return this;
        }

        public final zzdd zza() {
            zzaae zzb2;
            zzdk zzdk = this.zza;
            if (zzdk == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            } else if (this.zzb == null || this.zzc == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            } else if (zzdk.zzb() != this.zzb.zza()) {
                throw new GeneralSecurityException("AES key size mismatch");
            } else if (this.zza.zzc() != this.zzc.zza()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            } else if (this.zza.zza() && this.zzd == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.zza.zza() || this.zzd == null) {
                if (this.zza.zzh() == zzdk.zzb.zzc) {
                    zzb2 = zzpd.zza;
                } else if (this.zza.zzh() == zzdk.zzb.zzb) {
                    zzb2 = zzpd.zza(this.zzd.intValue());
                } else if (this.zza.zzh() == zzdk.zzb.zza) {
                    zzb2 = zzpd.zzb(this.zzd.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzh())));
                }
                return new zzdd(this.zza, this.zzb, this.zzc, zzb2, this.zzd);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }
    }

    public static zza zze() {
        return new zza();
    }

    public final /* synthetic */ zzce zza() {
        return (zzdk) zzc();
    }

    public final Integer zzb() {
        return this.zze;
    }

    public final /* synthetic */ zzcx zzc() {
        return this.zza;
    }

    public final zzaae zzd() {
        return this.zzd;
    }

    public final zzaaf zzf() {
        return this.zzb;
    }

    public final zzaaf zzg() {
        return this.zzc;
    }

    private zzdd(zzdk zzdk, zzaaf zzaaf, zzaaf zzaaf2, zzaae zzaae, Integer num) {
        this.zza = zzdk;
        this.zzb = zzaaf;
        this.zzc = zzaaf2;
        this.zzd = zzaae;
        this.zze = num;
    }
}
