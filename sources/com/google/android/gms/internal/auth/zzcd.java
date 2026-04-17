package com.google.android.gms.internal.auth;

import android.content.Context;
import h0.C0552a;

final class zzcd extends zzda {
    private final Context zza;
    private final zzdj zzb;

    public zzcd(Context context, zzdj zzdj) {
        if (context != null) {
            this.zza = context;
            this.zzb = zzdj;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final boolean equals(Object obj) {
        zzdj zzdj;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzda) {
            zzda zzda = (zzda) obj;
            if (!this.zza.equals(zzda.zza()) || ((zzdj = this.zzb) != null ? !zzdj.equals(zzda.zzb()) : zzda.zzb() != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzdj zzdj = this.zzb;
        if (zzdj == null) {
            i2 = 0;
        } else {
            i2 = zzdj.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        return C0552a.q("FlagsContext{context=", this.zza.toString(), ", hermeticFileOverrides=", String.valueOf(this.zzb), "}");
    }

    public final Context zza() {
        return this.zza;
    }

    public final zzdj zzb() {
        return this.zzb;
    }
}
