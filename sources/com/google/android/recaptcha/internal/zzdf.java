package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzdf extends h implements p {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzsp zzc;
    final /* synthetic */ zzen zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdf(zzdt zzdt, zzsp zzsp, zzen zzen, d dVar) {
        super(2, dVar);
        this.zzb = zzdt;
        this.zzc = zzsp;
        this.zzd = zzen;
    }

    public final d create(Object obj, d dVar) {
        return new zzdf(this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdf) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.zza;
        b.I0(obj);
        if (i2 == 0) {
            zzdt zzdt = this.zzb;
            zzsp zzsp = this.zzc;
            zzfj zzh = zzdt.zzh(zzdt);
            zzbr zzd2 = zzdt.zzd(zzdt);
            this.zza = 1;
            obj = zzh.zzb(zzd2, zzsp, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        zzsr zzsr = (zzsr) obj;
        this.zzd.zza();
        return zzsr;
    }
}
