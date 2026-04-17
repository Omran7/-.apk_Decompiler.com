package i0;

import G5.C;
import I1.b;
import android.net.Uri;
import android.view.InputEvent;
import j0.e;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

/* renamed from: i0.b  reason: case insensitive filesystem */
public final class C0579b extends h implements p {

    /* renamed from: a  reason: collision with root package name */
    public int f8240a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0581d f8241b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Uri f8242c;
    public final /* synthetic */ InputEvent d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0579b(C0581d dVar, Uri uri, InputEvent inputEvent, d dVar2) {
        super(2, dVar2);
        this.f8241b = dVar;
        this.f8242c = uri;
        this.d = inputEvent;
    }

    public final d create(Object obj, d dVar) {
        return new C0579b(this.f8241b, this.f8242c, this.d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C0579b) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.f8240a;
        if (i2 == 0) {
            b.I0(obj);
            e eVar = this.f8241b.f8246a;
            this.f8240a = 1;
            if (eVar.e(this.f8242c, this.d, this) == aVar) {
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
