package com.google.android.recaptcha.internal;

import G5.F;
import I1.b;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.l;

final class zzdy extends h implements l {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdy(long j6, zzec zzec, d dVar) {
        super(1, dVar);
        this.zzb = j6;
        this.zzc = zzec;
    }

    public final d create(d dVar) {
        return new zzdy(this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((d) obj)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.zza;
        b.I0(obj);
        if (i2 == 0) {
            long j6 = this.zzb;
            zzdx zzdx = new zzdx(this.zzc, (d) null);
            this.zza = 1;
            if (F.x(j6, zzdx, this) == aVar) {
                return aVar;
            }
        }
        return C0849h.f10203c;
    }
}
