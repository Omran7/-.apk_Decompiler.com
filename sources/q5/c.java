package q5;

import G5.A;
import G5.C0040l;
import I5.a;
import I5.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;
import o5.d;
import o5.e;
import o5.f;
import o5.g;
import o5.i;

public abstract class c extends a {
    private final i _context;
    private transient d intercepted;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(dVar);
        i iVar;
        if (dVar != null) {
            iVar = dVar.getContext();
        } else {
            iVar = null;
        }
        this._context = iVar;
    }

    public i getContext() {
        i iVar = this._context;
        j.b(iVar);
        return iVar;
    }

    public final d intercepted() {
        d dVar = this.intercepted;
        if (dVar == null) {
            f fVar = (f) getContext().get(e.f10478a);
            if (fVar != null) {
                dVar = new h((A) fVar, this);
            } else {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0040l lVar;
        d dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            g gVar = getContext().get(e.f10478a);
            j.b(gVar);
            f fVar = (f) gVar;
            h hVar = (h) dVar;
            do {
                atomicReferenceFieldUpdater = h.f1256q;
            } while (atomicReferenceFieldUpdater.get(hVar) == a.d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            if (obj instanceof C0040l) {
                lVar = (C0040l) obj;
            } else {
                lVar = null;
            }
            if (lVar != null) {
                lVar.o();
            }
        }
        this.intercepted = b.f11122a;
    }
}
