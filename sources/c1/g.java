package c1;

import A3.c;
import A3.d;
import D3.a;
import D3.e;
import h0.C0552a;

public final class g implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final g f5595a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final c f5596b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f5597c;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, c1.g] */
    static {
        Class<e> cls = e.class;
        f5596b = new c(C0552a.w(C0552a.v(cls, new a(1))), "startMs");
        f5597c = new c(C0552a.w(C0552a.v(cls, new a(2))), "endMs");
    }

    public final void a(Object obj, Object obj2) {
        f1.g gVar = (f1.g) obj;
        A3.e eVar = (A3.e) obj2;
        eVar.d(f5596b, gVar.f7899a);
        eVar.d(f5597c, gVar.f7900b);
    }
}
