package com.google.android.recaptcha.internal;

import o5.d;
import q5.c;
import x5.p;

final class zzdb extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;
    zzen zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdb(zzdc zzdc, d dVar) {
        super(dVar);
        this.zzb = zzdc;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzg((String) null, (p) null, this);
    }
}
