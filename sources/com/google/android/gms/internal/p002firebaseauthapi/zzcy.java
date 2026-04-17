package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzww;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcy  reason: invalid package */
public final class zzcy {
    public static final zzww zza = zza(16);
    public static final zzww zzb = zza(32);
    public static final zzww zzc;

    static {
        zza(16, 16);
        zza(32, 16);
        zzvt zzvt = zzvt.SHA256;
        zzc = zza(16, 16, 32, 16, zzvt);
        zza(32, 16, 32, 32, zzvt);
        zzww.zza zza2 = zzww.zza().zza(zzel.zza());
        zzxu zzxu = zzxu.TINK;
        zzww zzww = (zzww) ((zzaky) zza2.zza(zzxu).zze());
        zzww zzww2 = (zzww) ((zzaky) zzww.zza().zza(zzgd.zza()).zza(zzxu).zze());
    }

    private static zzww zza(int i2, int i5, int i6, int i7, zzvt zzvt) {
        return (zzww) ((zzaky) zzww.zza().zza(((zztd) ((zzaky) zztd.zza().zza((zztj) ((zzaky) zztj.zzb().zza((zztm) ((zzaky) zztm.zzb().zza(16).zze())).zza(i2).zze())).zza((zzvv) ((zzaky) zzvv.zzc().zza((zzvy) ((zzaky) zzvy.zzc().zza(zzvt).zza(i7).zze())).zza(32).zze())).zze())).a_()).zza(zzdh.zza()).zza(zzxu.TINK).zze());
    }

    private static zzww zza(int i2, int i5) {
        return (zzww) ((zzaky) zzww.zza().zza(((zzts) ((zzaky) zzts.zzb().zza(i2).zza((zztv) ((zzaky) zztv.zzb().zza(16).zze())).zze())).a_()).zza(zzdp.zza()).zza(zzxu.TINK).zze());
    }

    private static zzww zza(int i2) {
        return (zzww) ((zzaky) zzww.zza().zza(((zzub) ((zzaky) zzub.zzc().zza(i2).zze())).a_()).zza(zzdw.zza()).zza(zzxu.TINK).zze());
    }
}
