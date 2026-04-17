package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsh  reason: invalid package */
public final class zzsh implements zzqz {
    private static final zzix.zza zza = zzix.zza.ALGORITHM_NOT_FIPS;

    public zzsh(zzqp zzqp) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
