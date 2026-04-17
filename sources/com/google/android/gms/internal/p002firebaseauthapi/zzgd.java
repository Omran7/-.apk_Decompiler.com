package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzgg;
import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgd  reason: invalid package */
public final class zzgd {
    private static final zzpr<zzgb, zzbe> zza;
    private static final zzbl<zzbe> zzb;
    private static final zzow<zzgg> zzc = new zzgf();
    private static final zzou<zzgg> zzd = new zzge();

    static {
        Class<zzbe> cls = zzbe.class;
        zza = zzpr.zza(new zzgc(), zzgb.class, cls);
        zzb = zzoc.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", cls, zzws.zza.SYMMETRIC, zzyf.zze());
    }

    public static /* synthetic */ zzbe zza(zzgb zzgb) {
        if (zzij.zza()) {
            return zzij.zza(zzgb);
        }
        return zzaab.zza(zzgb);
    }

    public static zzgb zza(zzgg zzgg, Integer num) {
        return zzgb.zza(zzgg.zzb(), zzaaf.zza(32), num);
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public static void zza(boolean z3) {
        if (zzix.zza.ALGORITHM_NOT_FIPS.zza()) {
            zzim.zza();
            zzoz.zza().zza(zza);
            zzpa zza2 = zzpa.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", zzgg.zza(zzgg.zza.zza));
            hashMap.put("XCHACHA20_POLY1305_RAW", zzgg.zza(zzgg.zza.zzc));
            zza2.zza(Collections.unmodifiableMap(hashMap));
            Class<zzgg> cls = zzgg.class;
            zzos.zza().zza(zzd, cls);
            zzot.zza().zza(zzc, cls);
            zznt.zza().zza(zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
    }
}
