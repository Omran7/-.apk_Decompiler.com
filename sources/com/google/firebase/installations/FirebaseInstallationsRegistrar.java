package com.google.firebase.installations;

import H3.f;
import H3.g;
import L3.d;
import L3.e;
import R2.i;
import V2.a;
import V2.b;
import com.google.firebase.components.ComponentRegistrar;
import g3.C0548a;
import g3.C0549b;
import g3.C0550c;
import g3.h;
import g3.p;
import h3.l;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static e lambda$getComponents$0(C0550c cVar) {
        return new d((i) cVar.a(i.class), cVar.c(g.class), (ExecutorService) cVar.e(new p(a.class, ExecutorService.class)), new l((Executor) cVar.e(new p(b.class, Executor.class))));
    }

    public List<C0549b> getComponents() {
        C0548a b6 = C0549b.b(e.class);
        b6.f8008a = LIBRARY_NAME;
        b6.a(h.b(i.class));
        b6.a(h.a(g.class));
        b6.a(new h(new p(a.class, ExecutorService.class), 1, 0));
        b6.a(new h(new p(b.class, Executor.class), 1, 0));
        b6.f8012f = new D2.l(12);
        C0549b b7 = b6.b();
        f fVar = new f(0);
        C0548a b8 = C0549b.b(f.class);
        b8.f8011e = 1;
        b8.f8012f = new F3.e((Object) fVar, 11);
        return Arrays.asList(new C0549b[]{b7, b8.b(), android.support.v4.media.session.a.l(LIBRARY_NAME, "18.0.0")});
    }
}
