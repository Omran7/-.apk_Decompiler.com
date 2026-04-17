package com.google.android.recaptcha.internal;

final class zzpn extends zzpl {
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zznd zznd = (zznd) obj;
        zzpm zzpm = zznd.zzc;
        if (zzpm != zzpm.zzc()) {
            return zzpm;
        }
        zzpm zzf = zzpm.zzf();
        zznd.zzc = zzf;
        return zzf;
    }

    public final /* synthetic */ Object zzb() {
        return zzpm.zzf();
    }

    public final /* synthetic */ Object zzc(Object obj) {
        zzpm zzpm = (zzpm) obj;
        zzpm.zzh();
        return zzpm;
    }

    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i2, int i5) {
        ((zzpm) obj).zzj((i2 << 3) | 5, Integer.valueOf(i5));
    }

    public final /* bridge */ /* synthetic */ void zze(Object obj, int i2, long j6) {
        ((zzpm) obj).zzj((i2 << 3) | 1, Long.valueOf(j6));
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i2, Object obj2) {
        ((zzpm) obj).zzj((i2 << 3) | 3, (zzpm) obj2);
    }

    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i2, zzle zzle) {
        ((zzpm) obj).zzj((i2 << 3) | 2, zzle);
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i2, long j6) {
        ((zzpm) obj).zzj(i2 << 3, Long.valueOf(j6));
    }

    public final void zzi(Object obj) {
        ((zznd) obj).zzc.zzh();
    }

    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zznd) obj).zzc = (zzpm) obj2;
    }
}
