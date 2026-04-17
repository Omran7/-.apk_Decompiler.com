package j0;

import G5.C;
import I1.b;
import m5.C0849h;
import p5.a;
import q5.h;
import x5.p;

public final class d extends h implements p {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f8792a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f8793b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e eVar, o5.d dVar) {
        super(2, dVar);
        this.f8793b = eVar;
    }

    public final o5.d create(Object obj, o5.d dVar) {
        d dVar2 = new d(this.f8793b, dVar);
        dVar2.f8792a = obj;
        return dVar2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((d) create((C) obj, (o5.d) obj2)).invokeSuspend(C0849h.f10203c);
        throw null;
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        b.I0(obj);
        C c3 = (C) this.f8792a;
        throw null;
    }
}
