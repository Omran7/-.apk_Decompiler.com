package com.google.android.gms.internal.play_billing;

import h0.C0552a;

final class zzt extends zzq {
    final /* synthetic */ zzu zzg;

    public zzt(zzu zzu) {
        this.zzg = zzu;
    }

    public final String zza() {
        zzr zzr = (zzr) this.zzg.zza.get();
        if (zzr == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return C0552a.o("tag=[", String.valueOf(zzr.zza), "]");
    }
}
