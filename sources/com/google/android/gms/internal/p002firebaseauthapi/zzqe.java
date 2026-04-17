package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqe  reason: invalid package */
public final class zzqe implements zzqi {
    private final String zza;
    private final zzaae zzb;
    private final zzajp zzc;
    private final zzws.zza zzd;
    private final zzxu zze;
    private final Integer zzf;

    private zzqe(String str, zzaae zzaae, zzajp zzajp, zzws.zza zza2, zzxu zzxu, Integer num) {
        this.zza = str;
        this.zzb = zzaae;
        this.zzc = zzajp;
        this.zzd = zza2;
        this.zze = zzxu;
        this.zzf = num;
    }

    public static zzqe zza(String str, zzajp zzajp, zzws.zza zza2, zzxu zzxu, Integer num) {
        if (zzxu == zzxu.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzqe(str, zzqq.zza(str), zzajp, zza2, zzxu, num);
    }

    public final zzaae zzb() {
        return this.zzb;
    }

    public final zzxu zzc() {
        return this.zze;
    }

    public final zzajp zzd() {
        return this.zzc;
    }

    public final Integer zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zza;
    }

    public final zzws.zza zza() {
        return this.zzd;
    }
}
