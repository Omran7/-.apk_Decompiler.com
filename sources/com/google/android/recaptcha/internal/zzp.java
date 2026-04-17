package com.google.android.recaptcha.internal;

import I1.b;
import com.bumptech.glide.d;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.j;
import m5.C0844c;
import m5.C0848g;
import m5.C0849h;

public final class zzp implements zzy {
    private final zzek zza;
    private final C0844c zzb = d.N0(zzo.zza);
    private boolean zzc = true;

    public zzp(zzek zzek) {
        this.zza = zzek;
        int i2 = zzav.zza;
    }

    private final zzbf zzg() {
        return (zzbf) ((C0848g) this.zzb).a();
    }

    public final int zza() {
        return 25;
    }

    public final zzek zzb() {
        return this.zza;
    }

    public final Object zzc(String str, o5.d dVar) {
        zzen zzb2 = zzz.zzb(this, str);
        String zza2 = zzg().zza();
        zzb2.zza();
        zztf zzf = zzti.zzf();
        zztg zzf2 = zzth.zzf();
        zzf2.zzw(zza2);
        zzf.zze(b.t0(zzf2.zzk()));
        return zzz.zza(this, (zzti) zzf.zzk());
    }

    public final Object zzd(zzse zzse, o5.d dVar) {
        zzen zzc2 = zzz.zzc(this);
        int length = zzse.zzl().length();
        C0849h hVar = C0849h.f10203c;
        if (length == 0) {
            this.zzc = false;
            zzc2.zzb(new zzbd(zzbb.zzb, zzba.zzab, (String) null));
            return hVar;
        }
        zzbf zzg = zzg();
        Map singletonMap = Collections.singletonMap("_GRECAPTCHA_KC", zzse.zzl());
        j.d(singletonMap, "singletonMap(...)");
        zzg.zzb(singletonMap);
        zzc2.zza();
        return hVar;
    }

    public final void zze(zzsr zzsr) {
    }

    public final boolean zzf() {
        return this.zzc;
    }
}
