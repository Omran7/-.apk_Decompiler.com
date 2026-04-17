package com.google.android.recaptcha.internal;

import o5.d;
import q5.c;

final class zzdd extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdt zzb;
    int zzc;
    zzen zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdd(zzdt zzdt, d dVar) {
        super(dVar);
        this.zzb = zzdt;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzl((String) null, 0, this);
    }
}
