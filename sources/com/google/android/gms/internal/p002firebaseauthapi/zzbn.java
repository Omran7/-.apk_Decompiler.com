package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbn  reason: invalid package */
public final class zzbn {
    private final zzce zza;

    private zzbn(zzce zzce) {
        this.zza = zzce;
    }

    public static zzbn zza(zzce zzce) {
        return new zzbn(zzce);
    }

    private final zzww zzb() {
        try {
            zzce zzce = this.zza;
            if (zzce instanceof zzoh) {
                return ((zzoh) zzce).zzb().zza();
            }
            return ((zzqd) zzpc.zza().zza(this.zza, zzqd.class)).zza();
        } catch (GeneralSecurityException e6) {
            throw new zzqo("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(this.zza)), e6);
        }
    }

    public final zzce zza() {
        zzce zzce = this.zza;
        if (zzce != null) {
            return zzce;
        }
        return zzcm.zza(zzb().zzk());
    }
}
