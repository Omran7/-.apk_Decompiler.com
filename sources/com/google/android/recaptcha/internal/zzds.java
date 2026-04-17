package com.google.android.recaptcha.internal;

import G5.C;
import G5.F;
import I1.b;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzds extends h implements p {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzen zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzds(zzdt zzdt, zzen zzen, d dVar) {
        super(2, dVar);
        this.zzb = zzdt;
        this.zzc = zzen;
    }

    public final d create(Object obj, d dVar) {
        return new zzds(this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzds) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.zza;
        b.I0(obj);
        if (i2 == 0) {
            zzdt zzdt = this.zzb;
            this.zza = 1;
            obj = F.w(zzdt.zzi.zza().b(), new zzdh(zzdt, (d) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        zzsc zzsc = (zzsc) obj;
        this.zzc.zza();
        return zzsc;
    }
}
