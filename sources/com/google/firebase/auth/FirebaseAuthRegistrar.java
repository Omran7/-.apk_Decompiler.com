package com.google.firebase.auth;

import F3.e;
import F3.k;
import H3.f;
import H3.g;
import K3.b;
import R2.i;
import V2.a;
import V2.c;
import V2.d;
import com.google.firebase.components.ComponentRegistrar;
import f3.C0524a;
import g3.C0548a;
import g3.C0549b;
import g3.C0550c;
import g3.h;
import g3.p;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static FirebaseAuth lambda$getComponents$0(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, C0550c cVar) {
        b c3 = cVar.c(b3.b.class);
        b c6 = cVar.c(g.class);
        Executor executor = (Executor) cVar.e(pVar);
        return new FirebaseAuth((i) cVar.a(i.class), c3, c6, (Executor) cVar.e(pVar2), (Executor) cVar.e(pVar3), (ScheduledExecutorService) cVar.e(pVar4), (Executor) cVar.e(pVar5));
    }

    public List<C0549b> getComponents() {
        Class<Executor> cls = Executor.class;
        p pVar = new p(a.class, cls);
        p pVar2 = new p(V2.b.class, cls);
        Class<c> cls2 = c.class;
        p pVar3 = new p(cls2, cls);
        p pVar4 = new p(cls2, ScheduledExecutorService.class);
        p pVar5 = new p(d.class, cls);
        C0548a aVar = new C0548a(FirebaseAuth.class, new Class[]{C0524a.class});
        aVar.a(h.b(i.class));
        aVar.a(new h(1, 1, g.class));
        aVar.a(new h(pVar, 1, 0));
        aVar.a(new h(pVar2, 1, 0));
        aVar.a(new h(pVar3, 1, 0));
        aVar.a(new h(pVar4, 1, 0));
        aVar.a(new h(pVar5, 1, 0));
        aVar.a(h.a(b3.b.class));
        k kVar = new k();
        kVar.f769b = pVar;
        kVar.f770c = pVar2;
        kVar.d = pVar3;
        kVar.f771e = pVar4;
        kVar.f772f = pVar5;
        aVar.f8012f = kVar;
        C0549b b6 = aVar.b();
        f fVar = new f(0);
        C0548a b7 = C0549b.b(f.class);
        b7.f8011e = 1;
        b7.f8012f = new e((Object) fVar, 11);
        return Arrays.asList(new C0549b[]{b6, b7.b(), android.support.v4.media.session.a.l("fire-auth", "23.2.1")});
    }
}
