package c1;

import A3.c;
import D3.a;
import D3.e;
import h0.C0552a;

public final class d implements A3.d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f5588a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final c f5589b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f5590c;

    /* JADX WARNING: type inference failed for: r0v0, types: [c1.d, java.lang.Object] */
    static {
        Class<e> cls = e.class;
        f5589b = new c(C0552a.w(C0552a.v(cls, new a(1))), "logSource");
        f5590c = new c(C0552a.w(C0552a.v(cls, new a(2))), "logEventDropped");
    }

    public final void a(Object obj, Object obj2) {
        f1.e eVar = (f1.e) obj;
        A3.e eVar2 = (A3.e) obj2;
        eVar2.a(f5589b, eVar.f7895a);
        eVar2.a(f5590c, eVar.f7896b);
    }
}
