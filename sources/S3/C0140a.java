package S3;

import A3.c;
import A3.d;
import D3.a;
import D3.e;
import h0.C0552a;

/* renamed from: S3.a  reason: case insensitive filesystem */
public final class C0140a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final C0140a f2646a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final c f2647b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f2648c;
    public static final c d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f2649e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f2650f;
    public static final c g;
    public static final c h;

    /* renamed from: i  reason: collision with root package name */
    public static final c f2651i;

    /* renamed from: j  reason: collision with root package name */
    public static final c f2652j;

    /* renamed from: k  reason: collision with root package name */
    public static final c f2653k;

    /* renamed from: l  reason: collision with root package name */
    public static final c f2654l;

    /* renamed from: m  reason: collision with root package name */
    public static final c f2655m;

    /* renamed from: n  reason: collision with root package name */
    public static final c f2656n;

    /* renamed from: o  reason: collision with root package name */
    public static final c f2657o;

    /* renamed from: p  reason: collision with root package name */
    public static final c f2658p;

    /* JADX WARNING: type inference failed for: r0v0, types: [S3.a, java.lang.Object] */
    static {
        Class<e> cls = e.class;
        f2647b = new c(C0552a.w(C0552a.v(cls, new a(1))), "projectNumber");
        f2648c = new c(C0552a.w(C0552a.v(cls, new a(2))), "messageId");
        d = new c(C0552a.w(C0552a.v(cls, new a(3))), "instanceId");
        f2649e = new c(C0552a.w(C0552a.v(cls, new a(4))), "messageType");
        f2650f = new c(C0552a.w(C0552a.v(cls, new a(5))), "sdkPlatform");
        g = new c(C0552a.w(C0552a.v(cls, new a(6))), "packageName");
        h = new c(C0552a.w(C0552a.v(cls, new a(7))), "collapseKey");
        f2651i = new c(C0552a.w(C0552a.v(cls, new a(8))), "priority");
        f2652j = new c(C0552a.w(C0552a.v(cls, new a(9))), "ttl");
        f2653k = new c(C0552a.w(C0552a.v(cls, new a(10))), "topic");
        f2654l = new c(C0552a.w(C0552a.v(cls, new a(11))), "bulkId");
        f2655m = new c(C0552a.w(C0552a.v(cls, new a(12))), "event");
        f2656n = new c(C0552a.w(C0552a.v(cls, new a(13))), "analyticsLabel");
        f2657o = new c(C0552a.w(C0552a.v(cls, new a(14))), "campaignId");
        f2658p = new c(C0552a.w(C0552a.v(cls, new a(15))), "composerLabel");
    }

    public final void a(Object obj, Object obj2) {
        T3.d dVar = (T3.d) obj;
        A3.e eVar = (A3.e) obj2;
        eVar.d(f2647b, dVar.f3569a);
        eVar.a(f2648c, dVar.f3570b);
        eVar.a(d, dVar.f3571c);
        eVar.a(f2649e, dVar.d);
        eVar.a(f2650f, T3.c.ANDROID);
        eVar.a(g, dVar.f3572e);
        eVar.a(h, dVar.f3573f);
        eVar.e(f2651i, dVar.g);
        eVar.e(f2652j, dVar.h);
        eVar.a(f2653k, dVar.f3574i);
        eVar.d(f2654l, 0);
        eVar.a(f2655m, T3.a.MESSAGE_DELIVERED);
        eVar.a(f2656n, dVar.f3575j);
        eVar.d(f2657o, 0);
        eVar.a(f2658p, dVar.f3576k);
    }
}
