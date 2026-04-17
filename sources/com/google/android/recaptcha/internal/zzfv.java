package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import android.webkit.ValueCallback;
import java.util.ArrayList;
import m5.C0849h;
import n5.C0875g;
import o5.d;
import p5.a;
import q5.h;
import x5.l;
import x5.p;

final class zzfv extends h implements p {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzfw zzb;
    final /* synthetic */ String zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfv(String[] strArr, zzfw zzfw, String str, d dVar) {
        super(2, dVar);
        this.zza = strArr;
        this.zzb = zzfw;
        this.zzc = str;
    }

    public final d create(Object obj, d dVar) {
        return new zzfv(this.zza, this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfv) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        b.I0(obj);
        ArrayList arrayList = new ArrayList(r0);
        for (String str : this.zza) {
            arrayList.add("\"" + str + "\"");
        }
        zzfw zzfw = this.zzb;
        String str2 = this.zzc;
        zzfw.zza.evaluateJavascript(str2 + "(" + C0875g.U0(arrayList, ",", (String) null, (String) null, (l) null, 62) + ")", (ValueCallback) null);
        return C0849h.f10203c;
    }
}
