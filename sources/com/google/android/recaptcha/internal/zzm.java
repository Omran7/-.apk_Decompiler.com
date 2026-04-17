package com.google.android.recaptcha.internal;

import I1.b;
import android.content.ContentResolver;
import m5.C0849h;
import o5.d;

public final class zzm implements zzy {
    private final zzek zza;
    private final ContentResolver zzb;

    public zzm(zzek zzek, ContentResolver contentResolver) {
        this.zza = zzek;
        this.zzb = contentResolver;
    }

    public final int zza() {
        return 17;
    }

    public final zzek zzb() {
        return this.zza;
    }

    public final Object zzc(String str, d dVar) {
        zzen zzb2 = zzz.zzb(this, str);
        String zza2 = zzap.zza(this.zzb);
        zzb2.zza();
        zztf zzf = zzti.zzf();
        zztg zzf2 = zzth.zzf();
        zzf2.zzw(zza2);
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
