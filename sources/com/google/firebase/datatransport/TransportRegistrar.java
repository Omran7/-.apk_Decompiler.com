package com.google.firebase.datatransport;

import Z0.f;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import g3.C0548a;
import g3.C0549b;
import g3.h;
import g3.p;
import h3.j;
import java.util.Arrays;
import java.util.List;
import y3.a;
import y3.b;

public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<C0549b> getComponents() {
        Class<f> cls = f.class;
        C0548a b6 = C0549b.b(cls);
        b6.f8008a = LIBRARY_NAME;
        Class<Context> cls2 = Context.class;
        b6.a(h.b(cls2));
        b6.f8012f = new j(11);
        C0549b b7 = b6.b();
        C0548a a6 = C0549b.a(new p(a.class, cls));
        a6.a(h.b(cls2));
        a6.f8012f = new j(12);
        C0549b b8 = a6.b();
        C0548a a7 = C0549b.a(new p(b.class, cls));
        a7.a(h.b(cls2));
        a7.f8012f = new j(13);
        return Arrays.asList(new C0549b[]{b7, b8, a7.b(), android.support.v4.media.session.a.l(LIBRARY_NAME, "18.2.0")});
    }
}
