package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import com.google.android.recaptcha.RecaptchaAction;
import m5.C0847f;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzda extends h implements p {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzda(zzdc zzdc, RecaptchaAction recaptchaAction, long j6, d dVar) {
        super(2, dVar);
        this.zzb = zzdc;
        this.zzc = recaptchaAction;
        this.zzd = j6;
    }

    public final d create(Object obj, d dVar) {
        return new zzda(this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzda) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.f11033a;
        int i2 = this.zza;
        b.I0(obj);
        if (i2 != 0) {
            obj2 = ((C0847f) obj).f10198a;
        } else {
            zzdc zzdc = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j6 = this.zzd;
            this.zza = 1;
            obj2 = zzdc.zzf(recaptchaAction, j6, this);
            if (obj2 == aVar) {
                return aVar;
            }
        }
        b.I0(obj2);
        return obj2;
    }
}
