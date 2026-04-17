package com.google.android.recaptcha.internal;

import o5.d;
import q5.c;

final class zzdk extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdt zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdk(zzdt zzdt, d dVar) {
        super(dVar);
        this.zzb = zzdt;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzn((zzsc) null, 0, this);
    }
}
