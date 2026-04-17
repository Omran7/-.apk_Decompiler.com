package com.google.android.recaptcha.internal;

import I1.b;
import android.os.Build;
import m5.C0849h;
import o5.d;

public final class zzab implements zzy {
    private final zzek zza;

    public zzab(zzek zzek) {
        this.zza = zzek;
    }

    public final int zza() {
        return 10;
    }

    public final zzek zzb() {
        return this.zza;
    }

    public final Object zzc(String str, d dVar) {
        zzen zzb = zzz.zzb(this, str);
        int i2 = Build.VERSION.SDK_INT;
        zzb.zza();
        zztf zzf = zzti.zzf();
        zztg zzf2 = zzth.zzf();
        zzf2.zzw(String.valueOf(i2));
        zzf.zze(b.t0(zzf2.zzk()));
        return zzz.zza(this, (zzti) zzf.zzk());
    }

    public final Object zzd(zzse zzse, d dVar) {
        zzz.zzc(this).zza();
        return C0849h.f10203c;
    }

    public final void zze(zzsr zzsr) {
    }

    public final boolean zzf() {
        return true;
    }
}
