package c1;

import A3.d;
import D3.a;
import D3.e;
import h0.C0552a;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f5585a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final A3.c f5586b;

    /* renamed from: c  reason: collision with root package name */
    public static final A3.c f5587c;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, c1.c] */
    static {
        Class<e> cls = e.class;
        f5586b = new A3.c(C0552a.w(C0552a.v(cls, new a(1))), "eventsDroppedCount");
        f5587c = new A3.c(C0552a.w(C0552a.v(cls, new a(3))), "reason");
    }

    public final void a(Object obj, Object obj2) {
        f1.d dVar = (f1.d) obj;
        A3.e eVar = (A3.e) obj2;
        eVar.d(f5586b, dVar.f7892a);
        eVar.a(f5587c, dVar.f7893b);
    }
}
