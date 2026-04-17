package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.j;

public final class zzej {
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzej(String str, long j6, int i2) {
        this.zza = str;
        this.zzb = j6;
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzej)) {
            return false;
        }
        zzej zzej = (zzej) obj;
        if (j.a(zzej.zza, this.zza) && zzej.zzb == this.zzb && zzej.zzc == this.zzc) {
            return true;
        }
        return false;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
