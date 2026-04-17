package com.google.android.gms.internal.play_billing;

import h0.C0552a;

final class zzcp {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzcp(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(obj3);
        String valueOf4 = String.valueOf(obj);
        StringBuilder u6 = C0552a.u("Multiple entries with same key: ", valueOf, "=", valueOf2, " and ");
        u6.append(valueOf3);
        u6.append("=");
        u6.append(valueOf4);
        return new IllegalArgumentException(u6.toString());
    }
}
