package com.google.android.recaptcha.internal;

import G5.A;
import G5.F;
import java.util.TimerTask;
import o5.d;

public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzan) {
        this.zza = zzan;
    }

    public final void run() {
        zzan zzan = this.zza;
        F.q(zzan.zzb, (A) null, new zzaj(zzan, (d) null), 3);
    }
}
