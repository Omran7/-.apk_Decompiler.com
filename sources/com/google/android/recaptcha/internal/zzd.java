package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import m5.C0847f;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzd extends h implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ zzsc zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzd(zze zze, zzsc zzsc, d dVar) {
        super(2, dVar);
        this.zzb = zze;
        this.zzc = zzsc;
    }

    public final d create(Object obj, d dVar) {
        return new zzd(this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.f11033a;
        int i2 = this.zza;
        b.I0(obj);
        if (i2 != 0) {
            obj2 = ((C0847f) obj).f10198a;
        } else {
            zze zze = this.zzb;
            zzsc zzsc = this.zzc;
            this.zza = 1;
            obj2 = zze.zzh(zzsc, this);
            if (obj2 == aVar) {
                return aVar;
            }
        }
        return new C0847f(obj2);
    }
}
