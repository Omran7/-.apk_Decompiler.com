package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznc  reason: invalid package */
public final class zznc {
    public static zzbe zza(String str) {
        return new zznb(str, zza());
    }

    public static boolean zzb(String str) {
        return zza().containsAlias(str);
    }

    private static KeyStore zza() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            return instance;
        } catch (IOException e6) {
            throw new GeneralSecurityException(e6);
        }
    }
}
