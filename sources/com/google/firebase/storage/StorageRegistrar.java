package com.google.firebase.storage;

import F3.e;
import R2.i;
import V2.b;
import V2.d;
import android.support.v4.media.session.a;
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

public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";
    p blockingExecutor;
    p uiExecutor;

    public StorageRegistrar() {
        Class<Executor> cls = Executor.class;
        this.blockingExecutor = new p(b.class, cls);
        this.uiExecutor = new p(d.class, cls);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ d lambda$getComponents$0(C0550c cVar) {
        return new d((i) cVar.a(i.class), cVar.c(C0524a.class), cVar.c(b3.b.class), (Executor) cVar.e(this.blockingExecutor), (Executor) cVar.e(this.uiExecutor));
    }

    public List<C0549b> getComponents() {
        C0548a b6 = C0549b.b(d.class);
        b6.f8008a = LIBRARY_NAME;
        b6.a(h.b(i.class));
        b6.a(new h(this.blockingExecutor, 1, 0));
        b6.a(new h(this.uiExecutor, 1, 0));
        b6.a(h.a(C0524a.class));
        b6.a(h.a(b3.b.class));
        b6.f8012f = new e((Object) this, 7);
        return Arrays.asList(new C0549b[]{b6.b(), a.l(LIBRARY_NAME, "21.0.2")});
    }
}
