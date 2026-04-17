package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzer  reason: invalid package */
public final class zzer {
    private static final zzbl<zzbe> zza;
    private static final zzou<zzfe> zzb = new zzeu();
    private static final zzpr<zzfc, zzbe> zzc;

    static {
        Class<zzbe> cls = zzbe.class;
        zza = zzoc.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", cls, zzws.zza.SYMMETRIC, zzxo.zze());
        zzc = zzpr.zza(new zzet(), zzfc.class, cls);
    }

    public static void zza(boolean z3) {
        if (zzix.zza.ALGORITHM_NOT_FIPS.zza()) {
            zzff.zza();
            zzos.zza().zza(zzb, zzfe.class);
            zzoz.zza().zza(zzc);
            zznt.zza().zza(zza, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
    }
}
