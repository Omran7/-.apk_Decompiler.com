package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import android.content.Context;
import android.webkit.WebView;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzjc extends h implements p {
    final /* synthetic */ zzjd zza;
    final /* synthetic */ Context zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzjc(zzjd zzjd, Context context, d dVar) {
        super(2, dVar);
        this.zza = zzjd;
        this.zzb = context;
    }

    public final d create(Object obj, d dVar) {
        return new zzjc(this.zza, this.zzb, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjc) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        b.I0(obj);
        WebView zza2 = this.zza.zza;
        if (zza2 == null) {
            zza2 = new WebView(this.zzb);
        }
        this.zza.zza = zza2;
        return zza2;
    }
}
