package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpq  reason: invalid package */
public final class zzpq<P> {
    private final Map<zzaae, List<P>> zza = new HashMap();

    public final zzpq<P> zza(zzaae zzaae, P p6) {
        List list;
        if (zzaae.zza() == 0 || zzaae.zza() == 5) {
            if (this.zza.containsKey(zzaae)) {
                list = this.zza.get(zzaae);
            } else {
                ArrayList arrayList = new ArrayList();
                this.zza.put(zzaae, arrayList);
                list = arrayList;
            }
            list.add(p6);
            return this;
        }
        throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
    }

    public final zzpo<P> zza() {
        return new zzpo<>(this.zza);
    }
}
