package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzfe;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfc  reason: invalid package */
public final class zzfc extends zzcv {
    private final zzfe zza;
    private final zzaae zzb;
    private final Integer zzc;

    private zzfc(zzfe zzfe, zzaae zzaae, Integer num) {
        this.zza = zzfe;
        this.zzb = zzaae;
        this.zzc = num;
    }

    public final /* synthetic */ zzce zza() {
        return (zzfe) zzc();
    }

    public final Integer zzb() {
        return this.zzc;
    }

    public final /* synthetic */ zzcx zzc() {
        return this.zza;
    }

    public final zzaae zzd() {
        return this.zzb;
    }

    public static zzfc zza(zzfe zzfe, Integer num) {
        zzaae zzaae;
        if (zzfe.zzc() == zzfe.zzb.zzb) {
            if (num == null) {
                zzaae = zzpd.zza;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (zzfe.zzc() != zzfe.zzb.zza) {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzfe.zzc())));
        } else if (num != null) {
            zzaae = zzpd.zzb(num.intValue());
        } else {
            throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
        }
        return new zzfc(zzfe, zzaae, num);
    }
}
