package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import java.security.Signature;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzs  reason: invalid package */
public final class zzzs implements zzzj<Signature> {
    public final /* synthetic */ Object zza(String str, Provider provider) {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }
}
