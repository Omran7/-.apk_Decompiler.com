package W0;

import B0.l;
import G5.C;
import I1.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

/* renamed from: W0.c  reason: case insensitive filesystem */
public final class C0231c extends h implements p {

    /* renamed from: a  reason: collision with root package name */
    public int f3917a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0233e f3918b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bitmap f3919c;
    public final /* synthetic */ l d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0231c(C0233e eVar, Bitmap bitmap, l lVar, d dVar) {
        super(2, dVar);
        this.f3918b = eVar;
        this.f3919c = bitmap;
        this.d = lVar;
    }

    public final d create(Object obj, d dVar) {
        return new C0231c(this.f3918b, this.f3919c, this.d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C0231c) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.f3917a;
        if (i2 == 0) {
            b.I0(obj);
            Rect rect = C0239k.f3959a;
            C0233e eVar = this.f3918b;
            Context context = eVar.f3926a;
            Bitmap bitmap = this.f3919c;
            C0229a aVar2 = new C0229a(bitmap, C0239k.w(context, bitmap, eVar.f3941z, eVar.f3923A, eVar.f3924B), (Exception) null, this.d.f246b);
            this.f3917a = 1;
            if (C0233e.a(eVar, aVar2, this) == aVar) {
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
