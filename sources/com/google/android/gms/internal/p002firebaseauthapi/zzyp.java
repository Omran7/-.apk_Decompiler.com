package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyp  reason: invalid package */
final class zzyp extends ThreadLocal<Cipher> {
    private static Cipher zza() {
        try {
            return zzzd.zza.zza("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public final /* synthetic */ Object initialValue() {
        return zza();
    }
}
