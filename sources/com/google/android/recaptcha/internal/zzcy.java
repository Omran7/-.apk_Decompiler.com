package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import m5.C0847f;
import o5.d;
import p5.a;
import q5.c;

final class zzcy extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcy(zzdc zzdc, d dVar) {
        super(dVar);
        this.zzb = zzdc;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzb2 = this.zzb.zzf((RecaptchaAction) null, 0, this);
        if (zzb2 == a.f11033a) {
            return zzb2;
        }
        return new C0847f(zzb2);
    }
}
