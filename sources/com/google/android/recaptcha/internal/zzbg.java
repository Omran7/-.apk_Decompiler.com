package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzbg extends h implements p {
    public zzbg(d dVar) {
        super(2, dVar);
    }

    public final d create(Object obj, d dVar) {
        return new zzbg(dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbg) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        b.I0(obj);
        Thread.currentThread().setPriority(8);
        return C0849h.f10203c;
    }
}
