package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzgg;
import h0.C0552a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgb  reason: invalid package */
public final class zzgb extends zzcv {
    private final zzgg zza;
    private final zzaaf zzb;
    private final zzaae zzc;
    private final Integer zzd;

    private zzgb(zzgg zzgg, zzaaf zzaaf, zzaae zzaae, Integer num) {
        this.zza = zzgg;
        this.zzb = zzaaf;
        this.zzc = zzaae;
        this.zzd = num;
    }

    public final /* synthetic */ zzce zza() {
        return (zzgg) zzc();
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

    public final zzaaf zze() {
        return this.zzb;
    }

    public static zzgb zza(zzgg.zza zza2, zzaaf zzaaf, Integer num) {
        zzaae zzaae;
        zzgg.zza zza3 = zzgg.zza.zzc;
        if (zza2 != zza3 && num == null) {
            throw new GeneralSecurityException(C0552a.o("For given Variant ", String.valueOf(zza2), " the value of idRequirement must be non-null"));
        } else if (zza2 == zza3 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (zzaaf.zza() == 32) {
            zzgg zza4 = zzgg.zza(zza2);
            if (zza4.zzb() == zza3) {
                zzaae = zzpd.zza;
            } else if (zza4.zzb() == zzgg.zza.zzb) {
                zzaae = zzpd.zza(num.intValue());
            } else if (zza4.zzb() == zzgg.zza.zza) {
                zzaae = zzpd.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(String.valueOf(zza4.zzb())));
            }
            return new zzgb(zza4, zzaaf, zzaae, num);
        } else {
            throw new GeneralSecurityException(a.f(zzaaf.zza(), "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
    }
}
