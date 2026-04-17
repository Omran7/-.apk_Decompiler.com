package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajr  reason: invalid package */
final class zzajr implements Comparator<zzajp> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzajp zzajp = (zzajp) obj;
        zzajp zzajp2 = (zzajp) obj2;
        zzajv zzajv = (zzajv) zzajp.iterator();
        zzajv zzajv2 = (zzajv) zzajp2.iterator();
        while (zzajv.hasNext() && zzajv2.hasNext()) {
            int compare = Integer.compare(zzajp.zza(zzajv.zza()), zzajp.zza(zzajv2.zza()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzajp.zzb(), zzajp2.zzb());
    }
}
