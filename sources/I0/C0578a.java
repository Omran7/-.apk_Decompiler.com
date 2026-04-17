package i0;

import G5.C;
import I1.b;
import j0.e;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

/* renamed from: i0.a  reason: case insensitive filesystem */
public final class C0578a extends h implements p {

    /* renamed from: a  reason: collision with root package name */
    public int f8238a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0581d f8239b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0578a(C0581d dVar, d dVar2) {
        super(2, dVar2);
        this.f8239b = dVar;
    }

    public final d create(Object obj, d dVar) {
        return new C0578a(this.f8239b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C0578a) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.f8238a;
        if (i2 == 0) {
            b.I0(obj);
            e eVar = this.f8239b.f8246a;
            this.f8238a = 1;
            obj = eVar.c(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i2 == 1) {
            b.I0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
