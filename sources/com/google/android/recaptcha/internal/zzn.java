package com.google.android.recaptcha.internal;

import android.os.Build;
import m5.C0849h;
import n5.C0874f;
import n5.C0876h;
import o5.d;

public final class zzn implements zzy {
    private final zzek zza;

    public zzn(zzek zzek) {
        this.zza = zzek;
    }

    private static final zzth zzg(String str) {
        zztg zzf = zzth.zzf();
        zzf.zzw(str);
        return (zzth) zzf.zzk();
    }

    public final int zza() {
        return 11;
    }

    public final zzek zzb() {
        return this.zza;
    }

    public final Object zzc(String str, d dVar) {
        zzen zzb = zzz.zzb(this, str);
        zztf zzf = zzti.zzf();
        zzth zzg = zzg(Build.MANUFACTURER);
        zzth zzg2 = zzg(Build.MODEL);
        zzth zzg3 = zzg(Build.DEVICE);
        zzth zzg4 = zzg(Build.HARDWARE);
        zzth zzg5 = zzg(Build.FINGERPRINT);
        zzth zzg6 = zzg(Build.PRODUCT);
        zzth zzg7 = zzg(Build.BOARD);
        zzth zzg8 = zzg(Build.BRAND);
        zzth zzg9 = zzg(C0874f.y1(Build.SUPPORTED_ABIS));
        long j6 = Build.TIME;
        zztg zzf2 = zzth.zzf();
        zzf2.zzv(j6);
        zzf.zze(C0876h.S0(zzg, zzg2, zzg3, zzg4, zzg5, zzg6, zzg7, zzg8, zzg9, (zzth) zzf2.zzk(), zzg(Build.ID), zzg(Build.BOOTLOADER), zzg(Build.DISPLAY), zzg(Build.TYPE), zzg(Build.TAGS)));
        zzb.zza();
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
