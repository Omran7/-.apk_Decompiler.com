package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import java.util.List;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzr extends h implements p {
    int zza;
    final /* synthetic */ zzy zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ List zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzr(zzy zzy, String str, List list, d dVar) {
        super(2, dVar);
        this.zzb = zzy;
        this.zzc = str;
        this.zzd = list;
    }

    public final d create(Object obj, d dVar) {
        return new zzr(this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.zza;
        b.I0(obj);
        if (i2 == 0) {
            zzy zzy = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzy.zzc(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.zzd.add((zzaa) obj);
        return C0849h.f10203c;
    }
}
