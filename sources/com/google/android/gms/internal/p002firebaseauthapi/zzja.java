package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjh;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzja  reason: invalid package */
public final class zzja extends zzjj {
    private final zzjh zza;
    private final zzaaf zzb;
    private final zzaae zzc;
    private final Integer zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzja$zza */
    public static class zza {
        private zzjh zza;
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

        public final zza zza(zzjh zzjh) {
            this.zza = zzjh;
            return this;
        }

        public final zzja zza() {
            zzaae zzb2;
            zzjh zzjh = this.zza;
            if (zzjh == null || this.zzb == null) {
                throw new IllegalArgumentException("Cannot build without parameters and/or key material");
            } else if (zzjh.zzb() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            } else if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.zza.zza() || this.zzc == null) {
                if (this.zza.zzd() == zzjh.zzb.zzc) {
                    zzb2 = zzpd.zza;
                } else if (this.zza.zzd() == zzjh.zzb.zzb) {
                    zzb2 = zzpd.zza(this.zzc.intValue());
                } else if (this.zza.zzd() == zzjh.zzb.zza) {
                    zzb2 = zzpd.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
                }
                return new zzja(this.zza, this.zzb, zzb2, this.zzc);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }
    }

    public static zza zzc() {
        return new zza();
    }

    public final /* synthetic */ zzce zza() {
        return (zzjh) zzd();
    }

    public final Integer zzb() {
        return this.zzd;
    }

    public final /* synthetic */ zzjm zzd() {
        return this.zza;
    }

    public final zzaae zze() {
        return this.zzc;
    }

    public final zzaaf zzf() {
        return this.zzb;
    }

    private zzja(zzjh zzjh, zzaaf zzaaf, zzaae zzaae, Integer num) {
        this.zza = zzjh;
        this.zzb = zzaaf;
        this.zzc = zzaae;
        this.zzd = num;
    }
}
