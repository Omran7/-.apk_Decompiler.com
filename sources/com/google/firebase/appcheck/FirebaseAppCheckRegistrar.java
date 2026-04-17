package com.google.firebase.appcheck;

import F3.f;
import H3.g;
import R2.i;
import V2.a;
import V2.b;
import V2.c;
import V2.d;
import Z2.e;
import com.google.firebase.components.ComponentRegistrar;
import g3.C0548a;
import g3.C0549b;
import g3.h;
import g3.p;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        Class<Executor> cls = Executor.class;
        p pVar = new p(d.class, cls);
        p pVar2 = new p(c.class, cls);
        p pVar3 = new p(a.class, cls);
        p pVar4 = new p(b.class, ScheduledExecutorService.class);
        C0548a aVar = new C0548a(e.class, new Class[]{b3.b.class});
        aVar.f8008a = "fire-app-check";
        aVar.a(h.b(i.class));
        aVar.a(new h(pVar, 1, 0));
        aVar.a(new h(pVar2, 1, 0));
        aVar.a(new h(pVar3, 1, 0));
        aVar.a(new h(pVar4, 1, 0));
        aVar.a(h.a(g.class));
        aVar.f8012f = new f(pVar, pVar2, pVar3, pVar4, 1);
        aVar.c(1);
        C0549b b6 = aVar.b();
        H3.f fVar = new H3.f(0);
        C0548a b7 = C0549b.b(H3.f.class);
        b7.f8011e = 1;
        b7.f8012f = new F3.e((Object) fVar, 11);
        return Arrays.asList(new C0549b[]{b6, b7.b(), android.support.v4.media.session.a.l("fire-app-check", "18.0.0")});
    }
}
