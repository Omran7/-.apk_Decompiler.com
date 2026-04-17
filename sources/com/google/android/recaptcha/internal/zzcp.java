package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import android.app.Application;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzcp extends h implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcp(Application application, String str, d dVar) {
        super(2, dVar);
        this.zzb = application;
        this.zzc = str;
    }

    public final d create(Object obj, d dVar) {
        return new zzcp(this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcp) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.zza;
        b.I0(obj);
        if (i2 == 0) {
            Application application = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzcq.zzd(application, str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
