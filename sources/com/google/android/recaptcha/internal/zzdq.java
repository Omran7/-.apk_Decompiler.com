package com.google.android.recaptcha.internal;

import android.app.Application;
import kotlin.jvm.internal.k;
import x5.a;

public final class zzdq extends k implements a {
    public static final zzdq zza = new zzdq();

    public zzdq() {
        super(0);
    }

    public final Object invoke() {
        int i2 = zzav.zza;
        Object zzb = zzau.zza().zzb(735120228);
        if (zzb != null) {
            return (Application) zzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, (String) null);
    }
}
