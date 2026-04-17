package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import o5.d;
import q5.c;

final class zzed extends c {
    double zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzef zzc;
    int zzd;
    zzef zze;
    String zzf;
    RecaptchaAction zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzed(zzef zzef, d dVar) {
        super(dVar);
        this.zzc = zzef;
    }

    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zza((String) null, (RecaptchaAction) null, 0, this);
    }
}
