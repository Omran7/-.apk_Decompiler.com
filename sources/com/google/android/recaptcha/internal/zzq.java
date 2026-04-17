package com.google.android.recaptcha.internal;

import m5.C0847f;
import o5.d;
import p5.a;
import q5.c;

final class zzq extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzv zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzq(zzv zzv, d dVar) {
        super(dVar);
        this.zzb = zzv;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzf = this.zzb.zzf((String) null, this);
        if (zzf == a.f11033a) {
            return zzf;
        }
        return new C0847f(zzf);
    }
}
