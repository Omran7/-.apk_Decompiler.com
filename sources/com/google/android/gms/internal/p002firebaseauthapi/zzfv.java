package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzfz;
import h0.C0552a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfv  reason: invalid package */
public final class zzfv extends zzcv {
    private final zzfz zza;
    private final zzaaf zzb;
    private final zzaae zzc;
    private final Integer zzd;

    private zzfv(zzfz zzfz, zzaaf zzaaf, zzaae zzaae, Integer num) {
        this.zza = zzfz;
        this.zzb = zzaaf;
        this.zzc = zzaae;
        this.zzd = num;
    }

    public final /* synthetic */ zzce zza() {
        return (zzfz) zzc();
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

    public static zzfv zza(zzfz zzfz, zzaaf zzaaf, Integer num) {
        zzaae zzaae;
        zzfz.zza zzc2 = zzfz.zzc();
        zzfz.zza zza2 = zzfz.zza.zzb;
        if (zzc2 != zza2 && num == null) {
            throw new GeneralSecurityException(C0552a.o("For given Variant ", String.valueOf(zzfz.zzc()), " the value of idRequirement must be non-null"));
        } else if (zzfz.zzc() == zza2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (zzaaf.zza() == 32) {
            if (zzfz.zzc() == zza2) {
                zzaae = zzpd.zza;
            } else if (zzfz.zzc() == zzfz.zza.zza) {
                zzaae = zzpd.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(String.valueOf(zzfz.zzc())));
            }
            return new zzfv(zzfz, zzaaf, zzaae, num);
        } else {
            throw new GeneralSecurityException(a.f(zzaaf.zza(), "XAesGcmKey key must be constructed with key of length 32 bytes, not "));
        }
    }
}
