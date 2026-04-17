package com.google.android.recaptcha.internal;

import G5.C;
import G5.C0046s;
import G5.r;
import I1.b;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzdx extends h implements p {
    int zza;
    final /* synthetic */ zzec zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdx(zzec zzec, d dVar) {
        super(2, dVar);
        this.zzb = zzec;
    }

    public final d create(Object obj, d dVar) {
        return new zzdx(this.zzb, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.zza;
        b.I0(obj);
        if (i2 == 0) {
            r zzg = this.zzb.zzc;
            this.zza = 1;
            if (((C0046s) zzg).h(this) == aVar) {
                return aVar;
            }
        }
        return C0849h.f10203c;
    }
}
