package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzq  reason: invalid package */
public final class zzzq implements zzzj<Mac> {
    public final /* synthetic */ Object zza(String str, Provider provider) {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }
}
