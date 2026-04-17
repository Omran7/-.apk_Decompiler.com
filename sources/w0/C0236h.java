package W0;

import B0.l;
import G5.C;
import G5.F;
import G5.N;
import I1.b;
import I5.o;
import K5.e;
import T1.X;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

/* renamed from: W0.h  reason: case insensitive filesystem */
public final class C0236h extends h implements p {

    /* renamed from: a  reason: collision with root package name */
    public int f3950a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f3951b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0237i f3952c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0236h(C0237i iVar, d dVar) {
        super(2, dVar);
        this.f3952c = iVar;
    }

    public final d create(Object obj, d dVar) {
        C0236h hVar = new C0236h(this.f3952c, dVar);
        hVar.f3951b = obj;
        return hVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C0236h) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.f3950a;
        C0237i iVar = this.f3952c;
        Uri uri = iVar.f3954b;
        C0849h hVar = C0849h.f10203c;
        if (i2 == 0) {
            b.I0(obj);
            C c3 = (C) this.f3951b;
            if (F.m(c3)) {
                Rect rect = C0239k.f3959a;
                Context context = iVar.f3953a;
                l i5 = C0239k.i(context, uri, iVar.f3955c, iVar.d);
                if (F.m(c3)) {
                    X u6 = C0239k.u((Bitmap) i5.f247c, context, uri);
                    C0234f fVar = new C0234f(iVar.f3954b, (Bitmap) u6.d, i5.f246b, u6.f3145a, u6.f3146b, u6.f3147c, (Exception) null);
                    this.f3950a = 1;
                    e eVar = N.f877a;
                    Object w6 = F.w(o.f1276a, new C0235g(iVar, fVar, (d) null), this);
                    if (w6 != aVar) {
                        w6 = hVar;
                    }
                    if (w6 == aVar) {
                        return aVar;
                    }
                }
            }
        } else if (i2 == 1) {
            try {
                b.I0(obj);
            } catch (Exception e6) {
                C0234f fVar2 = new C0234f(iVar.f3954b, (Bitmap) null, 0, 0, false, false, e6);
                this.f3950a = 2;
                e eVar2 = N.f877a;
                Object w7 = F.w(o.f1276a, new C0235g(iVar, fVar2, (d) null), this);
                if (w7 != a.f11033a) {
                    w7 = hVar;
                }
                if (w7 == aVar) {
                    return aVar;
                }
            }
        } else if (i2 == 2) {
            b.I0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return hVar;
    }
}
