package com.google.android.gms.internal.play_billing;

public final class zzr {
    Object zza;
    zzu zzb;
    private zzw zzc = zzw.zze();
    private boolean zzd;

    public final void finalize() {
        zzw zzw;
        zzu zzu = this.zzb;
        if (zzu != null && !zzu.isDone()) {
            zzu.zzc(new zzs("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.zza))));
        }
        if (!this.zzd && (zzw = this.zzc) != null) {
            zzw.zzd((Object) null);
        }
    }

    public final void zza() {
        this.zza = null;
        this.zzb = null;
        this.zzc.zzd((Object) null);
    }

    public final boolean zzb(Object obj) {
        boolean z3 = true;
        this.zzd = true;
        zzu zzu = this.zzb;
        if (zzu == null || !zzu.zza(obj)) {
            z3 = false;
        }
        if (z3) {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }
        return z3;
    }
}
