package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzev;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzew  reason: invalid package */
public final class zzew extends zzcv {
    private final zzev zza;
    private final zzaae zzb;
    private final Integer zzc;

    private zzew(zzev zzev, zzaae zzaae, Integer num) {
        this.zza = zzev;
        this.zzb = zzaae;
        this.zzc = num;
    }

    public final /* synthetic */ zzce zza() {
        return (zzev) zzc();
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

    public static zzew zza(zzev zzev, Integer num) {
        zzaae zzaae;
        if (zzev.zzb() == zzev.zza.zza) {
            if (num != null) {
                zzaae = zzaae.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (zzev.zzb() != zzev.zza.zzb) {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzev.zzb())));
        } else if (num == null) {
            zzaae = zzaae.zza(new byte[0]);
        } else {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        return new zzew(zzev, zzaae, num);
    }
}
