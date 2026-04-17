package com.google.android.recaptcha.internal;

import m5.C0847f;
import o5.d;
import p5.a;
import q5.c;

final class zzi extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzl zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzi(zzl zzl, d dVar) {
        super(dVar);
        this.zzb = zzl;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzc2 = this.zzb.zzc(0, (zzsc) null, (zzek) null, this);
        if (zzc2 == a.f11033a) {
            return zzc2;
        }
        return new C0847f(zzc2);
    }
}
