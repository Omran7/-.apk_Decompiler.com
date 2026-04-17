package com.google.firebase.messaging;

import E3.c;
import H3.h;
import J3.a;
import L3.e;
import R2.i;
import U3.b;
import Z0.f;
import com.google.firebase.components.ComponentRegistrar;
import g3.C0548a;
import g3.C0549b;
import g3.C0550c;
import g3.p;
import java.util.Arrays;
import java.util.List;

public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(p pVar, C0550c cVar) {
        return new FirebaseMessaging((i) cVar.a(i.class), (a) cVar.a(a.class), cVar.c(b.class), cVar.c(h.class), (e) cVar.a(e.class), cVar.b(pVar), (c) cVar.a(c.class));
    }

    public List<C0549b> getComponents() {
        p pVar = new p(y3.b.class, f.class);
        C0548a b6 = C0549b.b(FirebaseMessaging.class);
        b6.f8008a = LIBRARY_NAME;
        b6.a(g3.h.b(i.class));
        b6.a(new g3.h(0, 0, a.class));
        b6.a(g3.h.a(b.class));
        b6.a(g3.h.a(h.class));
        b6.a(g3.h.b(e.class));
        b6.a(new g3.h(pVar, 0, 1));
        b6.a(g3.h.b(c.class));
        b6.f8012f = new H3.b(pVar, 1);
        b6.c(1);
        return Arrays.asList(new C0549b[]{b6.b(), android.support.v4.media.session.a.l(LIBRARY_NAME, "24.1.1")});
    }
}
