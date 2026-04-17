package com.google.android.recaptcha.internal;

import m5.C0847f;
import o5.d;
import p5.a;
import q5.c;

final class zzt extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzv zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzt(zzv zzv, d dVar) {
        super(dVar);
        this.zzb = zzv;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzh = this.zzb.zzh((zzsc) null, this);
        if (zzh == a.f11033a) {
            return zzh;
        }
        return new C0847f(zzh);
    }
}
