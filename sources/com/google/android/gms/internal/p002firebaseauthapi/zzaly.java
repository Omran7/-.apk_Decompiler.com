package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaly  reason: invalid package */
final class zzaly implements zzalz {
    public final int zza(int i2, Object obj, Object obj2) {
        zzalw zzalw = (zzalw) obj;
        zzalu zzalu = (zzalu) obj2;
        if (zzalw.isEmpty()) {
            return 0;
        }
        Iterator it2 = zzalw.entrySet().iterator();
        if (!it2.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it2.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    public final Object zzb(Object obj) {
        return zzalw.zza().zzb();
    }

    public final Object zzc(Object obj) {
        ((zzalw) obj).zzc();
        return obj;
    }

    public final Map<?, ?> zzd(Object obj) {
        return (zzalw) obj;
    }

    public final Map<?, ?> zze(Object obj) {
        return (zzalw) obj;
    }

    public final boolean zzf(Object obj) {
        if (!((zzalw) obj).zzd()) {
            return true;
        }
        return false;
    }

    public final zzalx<?, ?> zza(Object obj) {
        zzalu zzalu = (zzalu) obj;
        throw new NoSuchMethodError();
    }

    public final Object zza(Object obj, Object obj2) {
        zzalw zzalw = (zzalw) obj;
        zzalw zzalw2 = (zzalw) obj2;
        if (!zzalw2.isEmpty()) {
            if (!zzalw.zzd()) {
                zzalw = zzalw.zzb();
            }
            zzalw.zza(zzalw2);
        }
        return zzalw;
    }
}
