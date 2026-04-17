package com.google.android.recaptcha.internal;

import o5.d;
import q5.c;

final class zzag extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzan zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzag(zzan zzan, d dVar) {
        super(dVar);
        this.zzb = zzan;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzi(this);
    }
}
