package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalp  reason: invalid package */
final class zzalp implements zzalm {
    private static <E> zzalc<E> zzc(Object obj, long j6) {
        return (zzalc) zzanp.zze(obj, j6);
    }

    public final <L> List<L> zza(Object obj, long j6) {
        zzalc zzc = zzc(obj, j6);
        if (zzc.zzc()) {
            return zzc;
        }
        int size = zzc.size();
        zzalc zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzanp.zza(obj, j6, (Object) zza);
        return zza;
    }

    public final void zzb(Object obj, long j6) {
        zzc(obj, j6).zzb();
    }

    public final <E> void zza(Object obj, Object obj2, long j6) {
        zzalc zzc = zzc(obj, j6);
        zzalc zzc2 = zzc(obj2, j6);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzc()) {
                zzc = zzc.zza(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        zzanp.zza(obj, j6, (Object) zzc2);
    }
}
