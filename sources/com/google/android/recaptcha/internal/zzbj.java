package com.google.android.recaptcha.internal;

import F5.i;
import h0.C0552a;

public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String U02 = i.U0(10, String.valueOf(this.zzb / ((long) this.zza)));
        String U03 = i.U0(10, String.valueOf(this.zzc));
        String U04 = i.U0(10, String.valueOf(this.zzb));
        String U05 = i.U0(5, String.valueOf(this.zza));
        StringBuilder u6 = C0552a.u("avgExecutionTime: ", U02, " us| maxExecutionTime: ", U03, " us| totalTime: ");
        u6.append(U04);
        u6.append(" us| #Usages: ");
        u6.append(U05);
        return u6.toString();
    }

    /* renamed from: zza */
    public final int compareTo(zzbj zzbj) {
        Long valueOf = Long.valueOf(this.zzb);
        Long valueOf2 = Long.valueOf(zzbj.zzb);
        if (valueOf == valueOf2) {
            return 0;
        }
        return valueOf.compareTo(valueOf2);
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j6) {
        this.zzc = j6;
    }

    public final void zzf(long j6) {
        this.zzb = j6;
    }

    public final void zzg(int i2) {
        this.zza = i2;
    }
}
