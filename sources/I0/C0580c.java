package i0;

import G5.C;
import I1.b;
import android.net.Uri;
import j0.e;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

/* renamed from: i0.c  reason: case insensitive filesystem */
public final class C0580c extends h implements p {

    /* renamed from: a  reason: collision with root package name */
    public int f8243a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0581d f8244b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Uri f8245c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0580c(C0581d dVar, Uri uri, d dVar2) {
        super(2, dVar2);
        this.f8244b = dVar;
        this.f8245c = uri;
    }

    public final d create(Object obj, d dVar) {
        return new C0580c(this.f8244b, this.f8245c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C0580c) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.f8243a;
        if (i2 == 0) {
            b.I0(obj);
            e eVar = this.f8244b.f8246a;
            this.f8243a = 1;
            if (eVar.i(this.f8245c, this) == aVar) {
                return aVar;
            }
        } else if (i2 == 1) {
            b.I0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C0849h.f10203c;
    }
}
