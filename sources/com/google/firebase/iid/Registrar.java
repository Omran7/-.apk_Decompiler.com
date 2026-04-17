package com.google.firebase.iid;

import H3.h;
import I3.f;
import I3.g;
import J3.a;
import L3.e;
import R2.i;
import U3.b;
import com.google.firebase.components.ComponentRegistrar;
import g3.C0548a;
import g3.C0549b;
import g3.C0550c;
import java.util.Arrays;
import java.util.List;

public final class Registrar implements ComponentRegistrar {
    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(C0550c cVar) {
        return new FirebaseInstanceId((i) cVar.a(i.class), cVar.c(b.class), cVar.c(h.class), (e) cVar.a(e.class));
    }

    public static final /* synthetic */ a lambda$getComponents$1$Registrar(C0550c cVar) {
        return new g((FirebaseInstanceId) cVar.a(FirebaseInstanceId.class));
    }

    public List<C0549b> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        C0548a b6 = C0549b.b(cls);
        b6.a(g3.h.b(i.class));
        b6.a(g3.h.a(b.class));
        b6.a(g3.h.a(h.class));
        b6.a(g3.h.b(e.class));
        b6.f8012f = f.f1174b;
        b6.c(1);
        C0549b b7 = b6.b();
        C0548a b8 = C0549b.b(a.class);
        b8.a(g3.h.b(cls));
        b8.f8012f = f.f1175c;
        return Arrays.asList(new C0549b[]{b7, b8.b(), android.support.v4.media.session.a.l("fire-iid", "21.1.0")});
    }
}
