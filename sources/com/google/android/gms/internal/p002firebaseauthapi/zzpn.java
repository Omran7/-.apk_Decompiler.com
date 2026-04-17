package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpn  reason: invalid package */
final class zzpn implements Iterable {
    private final /* synthetic */ List zza;
    private final /* synthetic */ List zzb;

    public zzpn(zzpo zzpo, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
    }

    public final Iterator iterator() {
        return new zzpp(this.zza.iterator(), this.zzb.iterator());
    }
}
