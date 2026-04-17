package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzaj extends h implements p {
    int zza;
    final /* synthetic */ zzan zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzaj(zzan zzan, d dVar) {
        super(2, dVar);
        this.zzb = zzan;
    }

    public final d create(Object obj, d dVar) {
        return new zzaj(this.zzb, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaj) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.zza;
        b.I0(obj);
        if (i2 == 0) {
            this.zzb.zze = zzao.zza;
            zzan zzan = this.zzb;
            this.zza = 1;
            if (zzan.zze(this) == aVar) {
                return aVar;
            }
        }
        return C0849h.f10203c;
    }
}
