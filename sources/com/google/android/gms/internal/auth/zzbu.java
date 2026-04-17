package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import v1.C1041b;

final class zzbu implements s {
    private final Status zza;
    private C1041b zzb;

    public zzbu(Status status) {
        this.zza = status;
    }

    public final C1041b getResponse() {
        return this.zzb;
    }

    public final Status getStatus() {
        return this.zza;
    }

    public zzbu(C1041b bVar) {
        this.zzb = bVar;
        this.zza = Status.f6002e;
    }
}
