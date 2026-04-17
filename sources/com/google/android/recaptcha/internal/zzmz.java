package com.google.android.recaptcha.internal;

public class zzmz extends zzmx implements zzoj {
    public zzmz(zzna zzna) {
        super(zzna);
    }

    /* renamed from: zze */
    public final zzna zzl() {
        if (!((zzna) this.zza).zzL()) {
            return (zzna) this.zza;
        }
        ((zzna) this.zza).zzb.zzg();
        return (zzna) super.zzl();
    }

    public final void zzo() {
        super.zzo();
        if (((zzna) this.zza).zzb != zzmt.zzd()) {
            zzna zzna = (zzna) this.zza;
            zzna.zzb = zzna.zzb.clone();
        }
    }
}
