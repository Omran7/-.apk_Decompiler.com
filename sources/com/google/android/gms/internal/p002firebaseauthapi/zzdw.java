package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdz;
import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdw  reason: invalid package */
public final class zzdw {
    private static final zzpr<zzds, zzbe> zza;
    private static final zzbl<zzbe> zzb;
    private static final zzow<zzdz> zzc = new zzdy();
    private static final zzou<zzdz> zzd = new zzdx();
    private static final zzix.zza zze = zzix.zza.ALGORITHM_REQUIRES_BORINGCRYPTO;

    static {
        Class<zzbe> cls = zzbe.class;
        zza = zzpr.zza(new zzdv(), zzds.class, cls);
        zzb = zzoc.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", cls, zzws.zza.SYMMETRIC, zzty.zze());
    }

    public static /* synthetic */ zzds zza(zzdz zzdz, Integer num) {
        if (zzdz.zzc() != 24) {
            return zzds.zze().zza(zzdz).zza(num).zza(zzaaf.zza(zzdz.zzc())).zza();
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public static void zza(boolean z3) {
        zzix.zza zza2 = zze;
        if (zza2.zza()) {
            zzgw.zza();
            zzoz.zza().zza(zza);
            zzpa zza3 = zzpa.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_GCM", zzfl.zza);
            zzdz.zza zzc2 = zzdz.zze().zza(12).zzb(16).zzc(16);
            zzdz.zzb zzb2 = zzdz.zzb.zzc;
            hashMap.put("AES128_GCM_RAW", zzc2.zza(zzb2).zza());
            hashMap.put("AES256_GCM", zzfl.zzb);
            hashMap.put("AES256_GCM_RAW", zzdz.zze().zza(12).zzb(32).zzc(16).zza(zzb2).zza());
            zza3.zza(Collections.unmodifiableMap(hashMap));
            Class<zzdz> cls = zzdz.class;
            zzot.zza().zza(zzc, cls);
            zzos.zza().zza(zzd, cls);
            zznt.zza().zza(zzb, zza2, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
