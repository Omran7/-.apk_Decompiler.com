package com.google.android.recaptcha.internal;

import m5.C0847f;
import o5.d;
import p5.a;
import q5.c;

final class zza extends c {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zze zzd;
    int zze;
    String zzf;
    zzen zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zza(zze zze2, d dVar) {
        super(dVar);
        this.zzd = zze2;
    }

    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        Object zzc2 = this.zzd.zzc((String) null, 0, this);
        if (zzc2 == a.f11033a) {
            return zzc2;
        }
        return new C0847f(zzc2);
    }
}
