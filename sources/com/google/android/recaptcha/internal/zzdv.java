package com.google.android.recaptcha.internal;

import o5.d;
import q5.c;
import x5.l;

final class zzdv extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzec zzb;
    int zzc;
    zzbn zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdv(zzec zzec, d dVar) {
        super(dVar);
        this.zzb = zzec;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzl((l) null, this);
    }
}
