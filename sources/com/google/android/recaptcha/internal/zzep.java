package com.google.android.recaptcha.internal;

import G5.A;
import G5.F;
import java.util.TimerTask;
import o5.d;

public final class zzep extends TimerTask {
    final /* synthetic */ zzes zza;

    public zzep(zzes zzes) {
        this.zza = zzes;
    }

    public final void run() {
        zzes zzes = this.zza;
        F.q(zzes.zzd, (A) null, new zzeq(zzes, (d) null), 3);
    }
}
