package com.google.firebase;

import D2.l;
import H3.e;
import H3.f;
import H3.g;
import R2.i;
import U3.a;
import U3.b;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import g3.C0548a;
import g3.C0549b;
import g3.h;
import g3.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import m5.C0843b;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        Class<b> cls = b.class;
        C0548a b6 = C0549b.b(cls);
        b6.a(new h(2, 0, a.class));
        b6.f8012f = new l(21);
        arrayList.add(b6.b());
        p pVar = new p(V2.a.class, Executor.class);
        C0548a aVar = new C0548a(e.class, new Class[]{g.class, H3.h.class});
        aVar.a(h.b(Context.class));
        aVar.a(h.b(i.class));
        aVar.a(new h(2, 0, f.class));
        aVar.a(new h(1, 1, (Class) cls));
        aVar.a(new h(pVar, 1, 0));
        aVar.f8012f = new H3.b(pVar, 0);
        arrayList.add(aVar.b());
        arrayList.add(android.support.v4.media.session.a.l("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(android.support.v4.media.session.a.l("fire-core", "21.0.0"));
        arrayList.add(android.support.v4.media.session.a.l("device-name", a(Build.PRODUCT)));
        arrayList.add(android.support.v4.media.session.a.l("device-model", a(Build.DEVICE)));
        arrayList.add(android.support.v4.media.session.a.l("device-brand", a(Build.BRAND)));
        arrayList.add(android.support.v4.media.session.a.u("android-target-sdk", new l(13)));
        arrayList.add(android.support.v4.media.session.a.u("android-min-sdk", new l(14)));
        arrayList.add(android.support.v4.media.session.a.u("android-platform", new l(15)));
        arrayList.add(android.support.v4.media.session.a.u("android-installer", new l(16)));
        try {
            C0843b.f10193b.getClass();
            str = "2.0.0";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(android.support.v4.media.session.a.l("kotlin", str));
        }
        return arrayList;
    }
}
