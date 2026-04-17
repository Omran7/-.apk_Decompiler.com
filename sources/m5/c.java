package M5;

import G5.C0039k;
import G5.C0040l;
import G5.J0;
import I5.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.C0849h;
import o5.i;
import x5.l;

public final class c implements C0039k, J0 {

    /* renamed from: a  reason: collision with root package name */
    public final C0040l f1872a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f1873b;

    public c(d dVar, C0040l lVar) {
        this.f1873b = dVar;
        this.f1872a = lVar;
    }

    public final void a(l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.g;
        d dVar = this.f1873b;
        atomicReferenceFieldUpdater.set(dVar, (Object) null);
        this.f1872a.a(new b(dVar, this, 0));
    }

    public final void b(k kVar, int i2) {
        this.f1872a.b(kVar, i2);
    }

    public final u c(g gVar) {
        C0849h hVar = C0849h.f10203c;
        d dVar = this.f1873b;
        u C6 = this.f1872a.C(hVar, new b(dVar, this, 1));
        if (C6 != null) {
            d.g.set(dVar, (Object) null);
        }
        return C6;
    }

    public final void d(Object obj) {
        this.f1872a.d(obj);
    }

    public final i getContext() {
        return this.f1872a.f923e;
    }

    public final void resumeWith(Object obj) {
        this.f1872a.resumeWith(obj);
    }
}
