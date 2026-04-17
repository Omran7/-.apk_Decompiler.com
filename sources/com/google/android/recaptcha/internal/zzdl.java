package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzdl extends h implements p {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzsc zzc;
    final /* synthetic */ long zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdl(zzdt zzdt, zzsc zzsc, long j6, d dVar) {
        super(2, dVar);
        this.zzb = zzdt;
        this.zzc = zzsc;
        this.zzd = j6;
    }

    public final d create(Object obj, d dVar) {
        return new zzdl(this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdl) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.zza;
        b.I0(obj);
        if (i2 == 0) {
            zzdt zzdt = this.zzb;
            zzsc zzsc = this.zzc;
            long j6 = this.zzd;
            this.zza = 1;
            if (zzdt.zzv(zzsc, j6, this) == aVar) {
                return aVar;
            }
        }
        return C0849h.f10203c;
    }
}
