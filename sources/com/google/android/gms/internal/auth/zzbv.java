package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.internal.I;

public final class zzbv implements s {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        I.g(status);
        this.zza = status;
        this.zzb = "";
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    public final Status getStatus() {
        return this.zza;
    }

    public zzbv(String str) {
        I.g(str);
        this.zzb = str;
        this.zza = Status.f6002e;
    }
}
