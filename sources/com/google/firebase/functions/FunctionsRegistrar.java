package com.google.firebase.functions;

import F3.k;
import F3.l;
import F3.o;
import G3.c;
import J3.a;
import K3.b;
import R2.m;
import S3.z;
import V2.d;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import f3.C0524a;
import g3.C0548a;
import g3.C0549b;
import g3.C0550c;
import g3.h;
import g3.n;
import g3.p;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import l5.C0797a;
import n5.C0876h;
import x1.i;

public final class FunctionsRegistrar implements ComponentRegistrar {
    private static final o Companion = new Object();
    private static final String LIBRARY_NAME = "fire-fn";

    /* JADX WARNING: type inference failed for: r11v1, types: [java.lang.Object, l5.a, G3.a] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, l5.a, G3.a] */
    /* access modifiers changed from: private */
    public static final l getComponents$lambda$0(p pVar, p pVar2, C0550c cVar) {
        p pVar3 = pVar;
        p pVar4 = pVar2;
        C0550c cVar2 = cVar;
        j.e(pVar3, "$liteExecutor");
        j.e(pVar4, "$uiExecutor");
        j.e(cVar2, "c");
        Object a6 = cVar2.a(Context.class);
        j.d(a6, "c.get(Context::class.java)");
        Object a7 = cVar2.a(m.class);
        j.d(a7, "c.get(FirebaseOptions::class.java)");
        Object e6 = cVar2.e(pVar3);
        j.d(e6, "c.get(liteExecutor)");
        Object e7 = cVar2.e(pVar4);
        j.d(e7, "c.get(uiExecutor)");
        b c3 = cVar2.c(C0524a.class);
        j.d(c3, "c.getProvider(InternalAuthProvider::class.java)");
        b c6 = cVar2.c(a.class);
        j.d(c6, "c.getProvider(FirebaseIn…ceIdInternal::class.java)");
        n h = cVar2.h(b3.b.class);
        j.d(h, "c.getDeferred(InteropApp…okenProvider::class.java)");
        c a8 = c.a((Context) a6);
        i iVar = new i((Object) c.a((m) a7), 8);
        c a9 = c.a(c3);
        c a10 = c.a(c6);
        c a11 = c.a(h);
        c a12 = c.a((Executor) e6);
        z zVar = new z(a9, a10, a11, a12, 3);
        Object obj = G3.a.f837c;
        ? obj2 = new Object();
        obj2.f839b = obj;
        obj2.f838a = zVar;
        U3.c cVar3 = new U3.c((Object) c.a(new F3.m(new k(a8, iVar, (C0797a) obj2, a12, c.a((Executor) e7)))), 10);
        ? obj3 = new Object();
        obj3.f839b = obj;
        obj3.f838a = cVar3;
        return (l) obj3.get();
    }

    public List<C0549b> getComponents() {
        Class<Executor> cls = Executor.class;
        p pVar = new p(V2.c.class, cls);
        p pVar2 = new p(d.class, cls);
        C0548a b6 = C0549b.b(l.class);
        b6.f8008a = LIBRARY_NAME;
        b6.a(h.b(Context.class));
        b6.a(h.b(m.class));
        b6.a(h.a(C0524a.class));
        b6.a(new h(1, 1, a.class));
        b6.a(new h(0, 2, b3.b.class));
        b6.a(new h(pVar, 1, 0));
        b6.a(new h(pVar2, 1, 0));
        b6.f8012f = new F3.n(pVar, pVar2, 0);
        return C0876h.S0(b6.b(), android.support.v4.media.session.a.l(LIBRARY_NAME, "21.2.1"));
    }
}
