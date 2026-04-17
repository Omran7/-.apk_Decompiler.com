package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeo  reason: invalid package */
public final class zzeo {
    private static final zzpr<zzew, zzbe> zza;
    private static final zzbl<zzbe> zzb;
    private static final zzou<zzev> zzc = new zzep();

    static {
        Class<zzbe> cls = zzbe.class;
        zza = zzpr.zza(new zzeq(), zzew.class, cls);
        zzb = zzoc.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", cls, zzws.zza.REMOTE, zzxi.zze());
    }

    public static void zza(boolean z3) {
        if (zzix.zza.ALGORITHM_NOT_FIPS.zza()) {
            zzex.zza();
            zzoz.zza().zza(zza);
            zzos.zza().zza(zzc, zzev.class);
            zznt.zza().zza(zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
    }
}
