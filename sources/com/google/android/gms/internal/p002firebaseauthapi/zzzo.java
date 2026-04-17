package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzo  reason: invalid package */
public final class zzzo implements zzzj<KeyFactory> {
    public final /* synthetic */ Object zza(String str, Provider provider) {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
