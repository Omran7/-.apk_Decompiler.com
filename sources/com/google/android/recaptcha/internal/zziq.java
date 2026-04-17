package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zziq extends h implements p {
    int zza;
    final /* synthetic */ zzja zzb;
    final /* synthetic */ String zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zziq(zzja zzja, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzja;
        this.zzc = str;
    }

    public final d create(Object obj, d dVar) {
        return new zziq(this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziq) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.zza;
        b.I0(obj);
        if (i2 == 0) {
            zzja zzja = this.zzb;
            this.zza = 1;
            obj = zzja.zzw(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        String str = this.zzc;
        ((WebView) obj).evaluateJavascript("recaptcha.m.Main.execute(\"" + str + "\")", (ValueCallback) null);
        return C0849h.f10203c;
    }
}
