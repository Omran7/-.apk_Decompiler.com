package com.google.android.gms.internal.measurement;

import android.content.Context;
import h0.C0552a;
import z2.C1138e;

final class zzjj extends zzkg {
    private final Context zza;
    private final C1138e zzb;

    public zzjj(Context context, C1138e eVar) {
        this.zza = context;
        this.zzb = eVar;
    }

    public final boolean equals(Object obj) {
        C1138e eVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkg) {
            zzkg zzkg = (zzkg) obj;
            if (!this.zza.equals(zzkg.zza()) || ((eVar = this.zzb) != null ? !eVar.equals(zzkg.zzb()) : zzkg.zzb() != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.zza.hashCode() ^ 1000003;
        C1138e eVar = this.zzb;
        if (eVar == null) {
            i2 = 0;
        } else {
            i2 = eVar.hashCode();
        }
        return (hashCode * 1000003) ^ i2;
    }

    public final String toString() {
        return C0552a.q("FlagsContext{context=", this.zza.toString(), ", hermeticFileOverrides=", String.valueOf(this.zzb), "}");
    }

    public final Context zza() {
        return this.zza;
    }

    public final C1138e zzb() {
        return this.zzb;
    }
}
