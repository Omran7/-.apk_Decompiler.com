package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyo  reason: invalid package */
final class zzyo extends ThreadLocal<Cipher> {
    private static Cipher zza() {
        try {
            return zzzd.zza.zza("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public final /* synthetic */ Object initialValue() {
        return zza();
    }
}
