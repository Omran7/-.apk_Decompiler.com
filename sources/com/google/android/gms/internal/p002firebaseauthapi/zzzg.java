package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzg  reason: invalid package */
final class zzzg<JcePrimitiveT> implements zzzh<JcePrimitiveT> {
    private final zzzj<JcePrimitiveT> zza;

    public final JcePrimitiveT zza(String str) {
        Exception exc = null;
        for (Provider zza2 : zzzd.zza("GmsCore_OpenSSL", "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, zza2);
            } catch (Exception e6) {
                if (exc == null) {
                    exc = e6;
                }
            }
        }
        return this.zza.zza(str, (Provider) null);
    }

    private zzzg(zzzj<JcePrimitiveT> zzzj) {
        this.zza = zzzj;
    }
}
