package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbz  reason: invalid package */
public final class zzbz {
    private static final CopyOnWriteArrayList<zzca> zza = new CopyOnWriteArrayList<>();

    public static zzca zza(String str) {
        Iterator<zzca> it2 = zza.iterator();
        while (it2.hasNext()) {
            zzca next = it2.next();
            if (next.zzb(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(d.i("No KMS client does support: ", str));
    }
}
