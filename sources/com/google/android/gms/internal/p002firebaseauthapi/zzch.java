package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzch  reason: invalid package */
public final class zzch {
    static {
        Logger.getLogger(zzch.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(zzbe.class);
        hashSet.add(zzbi.class);
        hashSet.add(zzcj.class);
        hashSet.add(zzbk.class);
        hashSet.add(zzbh.class);
        hashSet.add(zzcb.class);
        hashSet.add(zzso.class);
        hashSet.add(zzcf.class);
        hashSet.add(zzci.class);
        Collections.unmodifiableSet(hashSet);
    }

    private zzch() {
    }

    @Deprecated
    public static zzws zza(String str, zzajp zzajp) {
        zzbl<?> zza = zznt.zza().zza(str);
        if (zza instanceof zzcg) {
            return ((zzcg) zza).zzc(zzajp);
        }
        throw new GeneralSecurityException(C0552a.o("manager for key type ", str, " is not a PrivateKeyManager"));
    }
}
