package com.google.firebase.appcheck.debug;

import R2.i;
import V2.a;
import V2.b;
import V2.c;
import com.google.firebase.components.ComponentRegistrar;
import g3.C0548a;
import g3.C0549b;
import g3.h;
import g3.p;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

public class FirebaseAppCheckDebugRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        Class<Executor> cls = Executor.class;
        p pVar = new p(c.class, cls);
        p pVar2 = new p(a.class, cls);
        p pVar3 = new p(b.class, cls);
        C0548a b6 = C0549b.b(Y2.a.class);
        b6.f8008a = "fire-app-check-debug";
        b6.a(h.b(i.class));
        b6.a(h.a(X2.a.class));
        b6.a(new h(pVar, 1, 0));
        b6.a(new h(pVar2, 1, 0));
        b6.a(new h(pVar3, 1, 0));
        b6.f8012f = new F3.b(pVar, pVar2, pVar3, 2);
        return Arrays.asList(new C0549b[]{b6.b(), android.support.v4.media.session.a.l("fire-app-check-debug", "18.0.0")});
    }
}
