package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzn  reason: invalid package */
public final class zzzn implements zzzj<KeyPairGenerator> {
    public final /* synthetic */ Object zza(String str, Provider provider) {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
