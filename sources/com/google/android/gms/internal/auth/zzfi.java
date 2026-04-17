package com.google.android.gms.internal.auth;

final class zzfi extends zzfk {
    public /* synthetic */ zzfi(zzfh zzfh) {
        super((zzfj) null);
    }

    public final void zza(Object obj, long j6) {
        ((zzey) zzhi.zzf(obj, j6)).zzb();
    }

    public final void zzb(Object obj, Object obj2, long j6) {
        zzey zzey = (zzey) zzhi.zzf(obj, j6);
        zzey zzey2 = (zzey) zzhi.zzf(obj2, j6);
        int size = zzey.size();
        int size2 = zzey2.size();
        if (size > 0 && size2 > 0) {
            if (!zzey.zzc()) {
                zzey = zzey.zzd(size2 + size);
            }
            zzey.addAll(zzey2);
        }
        if (size > 0) {
            zzey2 = zzey;
        }
        zzhi.zzp(obj, j6, zzey2);
    }

    private zzfi() {
        super((zzfj) null);
    }
}
