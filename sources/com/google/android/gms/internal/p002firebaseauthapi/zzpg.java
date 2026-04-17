package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpg  reason: invalid package */
public abstract class zzpg<SerializationT extends zzqi> {
    private final zzaae zza;
    private final Class<SerializationT> zzb;

    public static <SerializationT extends zzqi> zzpg<SerializationT> zza(zzpi<SerializationT> zzpi, zzaae zzaae, Class<SerializationT> cls) {
        return new zzpf(zzaae, cls, zzpi);
    }

    public abstract zzce zza(SerializationT serializationt);

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zzpg(zzaae zzaae, Class<SerializationT> cls) {
        this.zza = zzaae;
        this.zzb = cls;
    }

    public final zzaae zza() {
        return this.zza;
    }
}
