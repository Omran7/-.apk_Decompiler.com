package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzy  reason: invalid package */
final class zzzy extends ThreadLocal<Mac> {
    private final /* synthetic */ zzzv zza;

    public zzzy(zzzv zzzv) {
        this.zza = zzzv;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final Mac initialValue() {
        try {
            Mac zza2 = zzzd.zzb.zza(this.zza.zzc);
            zza2.init(this.zza.zzd);
            return zza2;
        } catch (GeneralSecurityException e6) {
            throw new IllegalStateException(e6);
        }
    }
}
