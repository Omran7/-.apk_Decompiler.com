package com.google.android.recaptcha.internal;

import m5.C0847f;
import o5.d;
import p5.a;
import q5.c;

final class zzc extends c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzen zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzc(zze zze2, d dVar) {
        super(dVar);
        this.zzc = zze2;
    }

    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object zze2 = this.zzc.zze(0, (zzsc) null, this);
        if (zze2 == a.f11033a) {
            return zze2;
        }
        return new C0847f(zze2);
    }
}
