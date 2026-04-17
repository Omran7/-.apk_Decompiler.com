package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import android.app.Application;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzco extends h implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzco(Application application, String str, long j6, d dVar) {
        super(2, dVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j6;
    }

    public final d create(Object obj, d dVar) {
        return new zzco(this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzco) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.zza;
        b.I0(obj);
        if (i2 == 0) {
            Application application = this.zzb;
            String str = this.zzc;
            long j6 = this.zzd;
            this.zza = 1;
            obj = zzcq.zzb(application, str, j6, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
