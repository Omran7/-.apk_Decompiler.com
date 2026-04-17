package com.google.firebase.appcheck.playintegrity;

import F3.n;
import R2.i;
import V2.b;
import V2.c;
import android.support.v4.media.session.a;
import com.google.firebase.components.ComponentRegistrar;
import d3.C0467c;
import g3.C0548a;
import g3.C0549b;
import g3.h;
import g3.p;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

public class FirebaseAppCheckPlayIntegrityRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        Class<Executor> cls = Executor.class;
        p pVar = new p(c.class, cls);
        p pVar2 = new p(b.class, cls);
        C0548a b6 = C0549b.b(C0467c.class);
        b6.f8008a = "fire-app-check-play-integrity";
        b6.a(h.b(i.class));
        b6.a(new h(pVar, 1, 0));
        b6.a(new h(pVar2, 1, 0));
        b6.f8012f = new n(pVar, pVar2, 1);
        return Arrays.asList(new C0549b[]{b6.b(), a.l("fire-app-check-play-integrity", "18.0.0")});
    }
}
