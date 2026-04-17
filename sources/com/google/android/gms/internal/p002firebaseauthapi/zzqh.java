package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqh  reason: invalid package */
public final class zzqh {
    /* access modifiers changed from: private */
    public final Map<zzqm, zznw<?, ?>> zza;
    /* access modifiers changed from: private */
    public final Map<zzqj, zzns<?>> zzb;
    /* access modifiers changed from: private */
    public final Map<zzqm, zzpk<?, ?>> zzc;
    /* access modifiers changed from: private */
    public final Map<zzqj, zzpg<?>> zzd;

    private zzqh(zzqk zzqk) {
        this.zza = new HashMap(zzqk.zza);
        this.zzb = new HashMap(zzqk.zzb);
        this.zzc = new HashMap(zzqk.zzc);
        this.zzd = new HashMap(zzqk.zzd);
    }

    public final <SerializationT extends zzqi> zzbm zza(SerializationT serializationt, zzck zzck) {
        zzqj zzqj = new zzqj(serializationt.getClass(), serializationt.zzb());
        if (this.zzb.containsKey(zzqj)) {
            return this.zzb.get(zzqj).zza(serializationt, zzck);
        }
        throw new GeneralSecurityException(C0552a.o("No Key Parser for requested key type ", String.valueOf(zzqj), " available"));
    }

    public final <SerializationT extends zzqi> boolean zzb(SerializationT serializationt) {
        return this.zzb.containsKey(new zzqj(serializationt.getClass(), serializationt.zzb()));
    }

    public final <SerializationT extends zzqi> boolean zzc(SerializationT serializationt) {
        return this.zzd.containsKey(new zzqj(serializationt.getClass(), serializationt.zzb()));
    }

    public final <SerializationT extends zzqi> zzce zza(SerializationT serializationt) {
        zzqj zzqj = new zzqj(serializationt.getClass(), serializationt.zzb());
        if (this.zzd.containsKey(zzqj)) {
            return this.zzd.get(zzqj).zza(serializationt);
        }
        throw new GeneralSecurityException(C0552a.o("No Parameters Parser for requested key type ", String.valueOf(zzqj), " available"));
    }

    public final <KeyT extends zzbm, SerializationT extends zzqi> SerializationT zza(KeyT keyt, Class<SerializationT> cls, zzck zzck) {
        zzqm zzqm = new zzqm(keyt.getClass(), cls);
        if (this.zza.containsKey(zzqm)) {
            return this.zza.get(zzqm).zza(keyt, zzck);
        }
        throw new GeneralSecurityException(C0552a.o("No Key serializer for ", String.valueOf(zzqm), " available"));
    }

    public final <ParametersT extends zzce, SerializationT extends zzqi> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) {
        zzqm zzqm = new zzqm(parameterst.getClass(), cls);
        if (this.zzc.containsKey(zzqm)) {
            return this.zzc.get(zzqm).zza(parameterst);
        }
        throw new GeneralSecurityException(C0552a.o("No Key Format serializer for ", String.valueOf(zzqm), " available"));
    }
}
