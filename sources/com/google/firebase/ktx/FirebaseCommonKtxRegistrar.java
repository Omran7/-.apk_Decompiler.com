package com.google.firebase.ktx;

import G5.A;
import V2.a;
import V2.b;
import V2.c;
import V2.d;
import com.google.firebase.components.ComponentRegistrar;
import g3.C0548a;
import g3.C0549b;
import g3.h;
import g3.p;
import java.util.List;
import java.util.concurrent.Executor;
import n5.C0876h;

public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    public List<C0549b> getComponents() {
        Class<a> cls = a.class;
        Class<A> cls2 = A.class;
        C0548a a6 = C0549b.a(new p(cls, cls2));
        Class<Executor> cls3 = Executor.class;
        a6.a(new h(new p(cls, cls3), 1, 0));
        a6.f8012f = R3.a.f2505b;
        C0549b b6 = a6.b();
        Class<c> cls4 = c.class;
        C0548a a7 = C0549b.a(new p(cls4, cls2));
        a7.a(new h(new p(cls4, cls3), 1, 0));
        a7.f8012f = R3.a.f2506c;
        C0549b b7 = a7.b();
        Class<b> cls5 = b.class;
        C0548a a8 = C0549b.a(new p(cls5, cls2));
        a8.a(new h(new p(cls5, cls3), 1, 0));
        a8.f8012f = R3.a.d;
        C0549b b8 = a8.b();
        Class<d> cls6 = d.class;
        C0548a a9 = C0549b.a(new p(cls6, cls2));
        a9.a(new h(new p(cls6, cls3), 1, 0));
        a9.f8012f = R3.a.f2507e;
        return C0876h.S0(b6, b7, b8, a9.b());
    }
}
