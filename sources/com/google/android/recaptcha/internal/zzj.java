package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import m5.C0847f;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzj extends h implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzsc zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzj(zze zze, long j6, zzsc zzsc, d dVar) {
        super(2, dVar);
        this.zzb = zze;
        this.zzc = j6;
        this.zzd = zzsc;
    }

    public final d create(Object obj, d dVar) {
        return new zzj(this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzj) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
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
            long j6 = this.zzc;
            zzsc zzsc = this.zzd;
            this.zza = 1;
            obj2 = zze.zze(j6, zzsc, this);
            if (obj2 == aVar) {
                return aVar;
            }
        }
        return new C0847f(obj2);
    }
}
