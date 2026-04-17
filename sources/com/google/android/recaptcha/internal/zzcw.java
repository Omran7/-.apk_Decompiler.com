package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import m5.C0847f;
import o5.d;
import p5.a;
import q5.c;

final class zzcw extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcw(zzdc zzdc, d dVar) {
        super(dVar);
        this.zzb = zzdc;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object r42 = this.zzb.m14execute0E7RQCE((RecaptchaAction) null, 0, this);
        if (r42 == a.f11033a) {
            return r42;
        }
        return new C0847f(r42);
    }
}
