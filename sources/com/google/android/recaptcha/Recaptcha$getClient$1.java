package com.google.android.recaptcha;

import android.app.Application;
import m5.C0847f;
import o5.d;
import p5.a;
import q5.c;

public final class Recaptcha$getClient$1 extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, d dVar) {
        super(dVar);
        this.zzb = recaptcha;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object r7 = this.zzb.m11getClientBWLJW6A((Application) null, (String) null, 0, this);
        if (r7 == a.f11033a) {
            return r7;
        }
        return new C0847f(r7);
    }
}
