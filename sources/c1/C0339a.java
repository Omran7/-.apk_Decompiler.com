package c1;

import A3.c;
import A3.d;
import D3.a;
import D3.e;
import f1.C0521a;
import h0.C0552a;

/* renamed from: c1.a  reason: case insensitive filesystem */
public final class C0339a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final C0339a f5579a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final c f5580b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f5581c;
    public static final c d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f5582e;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, c1.a] */
    static {
        Class<e> cls = e.class;
        f5580b = new c(C0552a.w(C0552a.v(cls, new a(1))), "window");
        f5581c = new c(C0552a.w(C0552a.v(cls, new a(2))), "logSourceMetrics");
        d = new c(C0552a.w(C0552a.v(cls, new a(3))), "globalMetrics");
        f5582e = new c(C0552a.w(C0552a.v(cls, new a(4))), "appNamespace");
    }

    public final void a(Object obj, Object obj2) {
        C0521a aVar = (C0521a) obj;
        A3.e eVar = (A3.e) obj2;
        eVar.a(f5580b, aVar.f7880a);
        eVar.a(f5581c, aVar.f7881b);
        eVar.a(d, aVar.f7882c);
        eVar.a(f5582e, aVar.d);
    }
}
