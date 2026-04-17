package com.google.firebase.database;

import R2.i;
import android.support.v4.media.session.a;
import b3.b;
import com.google.firebase.components.ComponentRegistrar;
import f3.C0524a;
import g3.C0548a;
import g3.C0549b;
import g3.C0550c;
import g3.h;
import h3.j;
import i3.C0593i;
import java.util.Arrays;
import java.util.List;

public class DatabaseRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rtdb";

    /* access modifiers changed from: private */
    public static /* synthetic */ C0593i lambda$getComponents$0(C0550c cVar) {
        return new C0593i((i) cVar.a(i.class), cVar.h(C0524a.class), cVar.h(b.class));
    }

    public List<C0549b> getComponents() {
        C0548a b6 = C0549b.b(C0593i.class);
        b6.f8008a = LIBRARY_NAME;
        b6.a(h.b(i.class));
        b6.a(new h(0, 2, C0524a.class));
        b6.a(new h(0, 2, b.class));
        b6.f8012f = new j(3);
        return Arrays.asList(new C0549b[]{b6.b(), a.l(LIBRARY_NAME, "21.0.0")});
    }
}
