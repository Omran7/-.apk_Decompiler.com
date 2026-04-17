package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzns  reason: invalid package */
public abstract class zzns<SerializationT extends zzqi> {
    private final zzaae zza;
    private final Class<SerializationT> zzb;

    public static <SerializationT extends zzqi> zzns<SerializationT> zza(zznu<SerializationT> zznu, zzaae zzaae, Class<SerializationT> cls) {
        return new zznv(zzaae, cls, zznu);
    }

    public abstract zzbm zza(SerializationT serializationt, zzck zzck);

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zzns(zzaae zzaae, Class<SerializationT> cls) {
        this.zza = zzaae;
        this.zzb = cls;
    }

    public final zzaae zza() {
        return this.zza;
    }
}
