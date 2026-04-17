package n3;

import java.util.HashMap;
import java.util.concurrent.Callable;
import o3.c;
import o3.e;
import o3.f;
import p3.C0917a;
import s3.C0969g;
import v3.s;

public final class w implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10344a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0866g f10345b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ y f10346c;
    public final /* synthetic */ Object d;

    public w(y yVar, C0866g gVar, s sVar) {
        this.f10346c = yVar;
        this.f10345b = gVar;
        this.d = sVar;
    }

    public final Object call() {
        switch (this.f10344a) {
            case 0:
                y yVar = this.f10346c;
                C0917a aVar = yVar.f10351f;
                C0866g gVar = this.f10345b;
                C0969g a6 = C0969g.a(gVar);
                s sVar = (s) this.d;
                aVar.d(a6, sVar);
                return y.a(yVar, new f(e.f10441e, gVar, sVar));
            default:
                C0861b y6 = C0861b.y((HashMap) this.d);
                y yVar2 = this.f10346c;
                C0917a aVar2 = yVar2.f10351f;
                C0866g gVar2 = this.f10345b;
                aVar2.c(gVar2, y6);
                return y.a(yVar2, new c(e.f10441e, gVar2, y6));
        }
    }

    public w(y yVar, HashMap hashMap, C0866g gVar) {
        this.f10346c = yVar;
        this.d = hashMap;
        this.f10345b = gVar;
    }
}
