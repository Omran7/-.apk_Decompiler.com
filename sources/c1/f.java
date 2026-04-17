package c1;

import A3.c;
import A3.d;
import D3.a;
import D3.e;
import h0.C0552a;

public final class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final f f5592a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final c f5593b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f5594c;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, c1.f] */
    static {
        Class<e> cls = e.class;
        f5593b = new c(C0552a.w(C0552a.v(cls, new a(1))), "currentCacheSizeBytes");
        f5594c = new c(C0552a.w(C0552a.v(cls, new a(2))), "maxCacheSizeBytes");
    }

    public final void a(Object obj, Object obj2) {
        f1.f fVar = (f1.f) obj;
        A3.e eVar = (A3.e) obj2;
        eVar.d(f5593b, fVar.f7897a);
        eVar.d(f5594c, fVar.f7898b);
    }
}
