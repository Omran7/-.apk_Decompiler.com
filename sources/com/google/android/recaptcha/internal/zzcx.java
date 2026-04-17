package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import m5.C0847f;
import o5.d;
import p5.a;
import q5.c;

final class zzcx extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcx(zzdc zzdc, d dVar) {
        super(dVar);
        this.zzb = zzdc;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object r22 = this.zzb.m15executegIAlus((RecaptchaAction) null, this);
        if (r22 == a.f11033a) {
            return r22;
        }
        return new C0847f(r22);
    }
}
