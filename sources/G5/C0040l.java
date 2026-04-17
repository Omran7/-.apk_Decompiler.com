package G5;

import I5.h;
import I5.t;
import I5.u;
import M5.g;
import M5.k;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;
import m5.C0847f;
import m5.C0849h;
import n5.C0873e;
import o5.i;
import p5.a;
import q5.d;
import x5.l;

/* renamed from: G5.l  reason: case insensitive filesystem */
public class C0040l extends M implements C0039k, d, J0 {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f920f;

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f921p;

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f922q;
    private volatile /* synthetic */ int _decisionAndIndex$volatile = 536870911;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile = C0021b.f895a;
    public final o5.d d;

    /* renamed from: e  reason: collision with root package name */
    public final i f923e;

    static {
        Class<C0040l> cls = C0040l.class;
        f920f = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex$volatile");
        Class<Object> cls2 = Object.class;
        f921p = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        f922q = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
    }

    public C0040l(int i2, o5.d dVar) {
        super(i2);
        this.d = dVar;
        this.f923e = dVar.getContext();
    }

    public static Object B(y0 y0Var, Object obj, int i2, l lVar) {
        C0037j jVar;
        if ((obj instanceof C0048u) || !F.n(i2)) {
            return obj;
        }
        if (lVar == null && !(y0Var instanceof C0037j)) {
            return obj;
        }
        if (y0Var instanceof C0037j) {
            jVar = (C0037j) y0Var;
        } else {
            jVar = null;
        }
        return new C0047t(obj, jVar, lVar, (CancellationException) null, 16);
    }

    public static void w(y0 y0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + y0Var + ", already has " + obj).toString());
    }

    public final void A(A a6) {
        h hVar;
        A a7;
        int i2;
        C0849h hVar2 = C0849h.f10203c;
        o5.d dVar = this.d;
        if (dVar instanceof h) {
            hVar = (h) dVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            a7 = hVar.d;
        } else {
            a7 = null;
        }
        if (a7 == a6) {
            i2 = 4;
        } else {
            i2 = this.f876c;
        }
        z(hVar2, i2, (l) null);
    }

    public final u C(Object obj, l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f921p;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj2 instanceof y0;
            u uVar = F.f861a;
            if (z3) {
                Object B6 = B((y0) obj2, obj, this.f876c, lVar);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, B6)) {
                        if (!v()) {
                            o();
                        }
                        return uVar;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
            } else {
                boolean z4 = obj2 instanceof C0047t;
                return null;
            }
        }
    }

    public final void a(l lVar) {
        z(C0849h.f10203c, this.f876c, lVar);
    }

    public final void b(k kVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f920f;
            i5 = atomicIntegerFieldUpdater.get(this);
            if ((i5 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, ((i5 >> 29) << 29) + i2));
        u(kVar);
    }

    public final u c(g gVar) {
        return C(C0849h.f10203c, gVar);
    }

    public final void d(Object obj) {
        p(this.f876c);
    }

    public final void e(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f921p;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y0) {
                throw new IllegalStateException("Not completed");
            } else if (!(obj2 instanceof C0048u)) {
                if (obj2 instanceof C0047t) {
                    C0047t tVar = (C0047t) obj2;
                    if (tVar.f947e == null) {
                        C0047t a6 = C0047t.a(tVar, (C0037j) null, cancellationException, 15);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a6)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            }
                        }
                        C0037j jVar = tVar.f945b;
                        if (jVar != null) {
                            k(jVar, cancellationException);
                        }
                        l lVar = tVar.f946c;
                        if (lVar != null) {
                            l(lVar, cancellationException);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must be called at most once");
                }
                C0047t tVar2 = new C0047t(obj2, (C0037j) null, (l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVar2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            } else {
                return;
            }
        }
    }

    public final o5.d f() {
        return this.d;
    }

    public final Throwable g(Object obj) {
        Throwable g = super.g(obj);
        if (g != null) {
            return g;
        }
        return null;
    }

    public final d getCallerFrame() {
        o5.d dVar = this.d;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final i getContext() {
        return this.f923e;
    }

    public final Object h(Object obj) {
        if (obj instanceof C0047t) {
            return ((C0047t) obj).f944a;
        }
        return obj;
    }

    public final Object j() {
        return f921p.get(this);
    }

    public final void k(C0037j jVar, Throwable th) {
        try {
            jVar.a(th);
        } catch (Throwable th2) {
            F.k(this.f923e, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            F.k(this.f923e, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(t tVar, Throwable th) {
        int i2 = f920f.get(this) & 536870911;
        if (i2 != 536870911) {
            try {
                tVar.f(i2);
            } catch (Throwable th2) {
                F.k(this.f923e, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
    }

    public final boolean n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f921p;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = false;
            if (!(obj instanceof y0)) {
                return false;
            }
            if ((obj instanceof C0037j) || (obj instanceof t)) {
                z3 = true;
            }
            C0041m mVar = new C0041m(this, th, z3);
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                    y0 y0Var = (y0) obj;
                    if (y0Var instanceof C0037j) {
                        k((C0037j) obj, th);
                    } else if (y0Var instanceof t) {
                        m((t) obj, th);
                    }
                    if (!v()) {
                        o();
                    }
                    p(this.f876c);
                    return true;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f922q;
        P p6 = (P) atomicReferenceFieldUpdater.get(this);
        if (p6 != null) {
            p6.e();
            atomicReferenceFieldUpdater.set(this, x0.f959a);
        }
    }

    public final void p(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        boolean z3;
        do {
            atomicIntegerFieldUpdater = f920f;
            i5 = atomicIntegerFieldUpdater.get(this);
            int i6 = i5 >> 29;
            if (i6 != 0) {
                if (i6 == 1) {
                    if (i2 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    o5.d dVar = this.d;
                    if (z3 || !(dVar instanceof h) || F.n(i2) != F.n(this.f876c)) {
                        F.s(this, dVar, z3);
                        return;
                    }
                    A a6 = ((h) dVar).d;
                    i context = ((h) dVar).f1257e.getContext();
                    if (a6.k()) {
                        a6.j(context, this);
                        return;
                    }
                    Y a7 = D0.a();
                    if (a7.f891c >= 4294967296L) {
                        C0873e eVar = a7.f892e;
                        if (eVar == null) {
                            eVar = new C0873e();
                            a7.f892e = eVar;
                        }
                        eVar.addLast(this);
                        return;
                    }
                    a7.n(true);
                    try {
                        F.s(this, dVar, true);
                        do {
                        } while (a7.o());
                    } catch (Throwable th) {
                        a7.l();
                        throw th;
                    }
                    a7.l();
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 1073741824 + (536870911 & i5)));
    }

    public Throwable q(v0 v0Var) {
        return v0Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean v6 = v();
        do {
            atomicIntegerFieldUpdater = f920f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i5 = i2 >> 29;
            if (i5 != 0) {
                if (i5 == 2) {
                    if (v6) {
                        y();
                    }
                    Object obj = f921p.get(this);
                    if (!(obj instanceof C0048u)) {
                        if (F.n(this.f876c)) {
                            C0034h0 h0Var = (C0034h0) this.f923e.get(B.f856b);
                            if (h0Var != null && !h0Var.isActive()) {
                                CancellationException cancellationException = h0Var.getCancellationException();
                                e(obj, cancellationException);
                                throw cancellationException;
                            }
                        }
                        return h(obj);
                    }
                    throw ((C0048u) obj).f950a;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((P) f922q.get(this)) == null) {
            t();
        }
        if (v6) {
            y();
        }
        return a.f11033a;
    }

    public final void resumeWith(Object obj) {
        Throwable a6 = C0847f.a(obj);
        if (a6 != null) {
            obj = new C0048u(false, a6);
        }
        z(obj, this.f876c, (l) null);
    }

    public final void s() {
        P t6 = t();
        if (t6 != null && !(f921p.get(this) instanceof y0)) {
            t6.e();
            f922q.set(this, x0.f959a);
        }
    }

    public final P t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0034h0 h0Var = (C0034h0) this.f923e.get(B.f856b);
        if (h0Var == null) {
            return null;
        }
        P l6 = F.l(h0Var, true, new C0042n(this), 2);
        do {
            atomicReferenceFieldUpdater = f922q;
            if (atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, l6) || atomicReferenceFieldUpdater.get(this) != null) {
                return l6;
            }
            atomicReferenceFieldUpdater = f922q;
            break;
        } while (atomicReferenceFieldUpdater.get(this) != null);
        return l6;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(F.t(this.d));
        sb.append("){");
        Object obj = f921p.get(this);
        if (obj instanceof y0) {
            str = "Active";
        } else if (obj instanceof C0041m) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(F.j(this));
        return sb.toString();
    }

    public final void u(y0 y0Var) {
        boolean z3;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f921p;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0021b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, y0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if (obj instanceof C0037j) {
                z3 = true;
            } else {
                z3 = obj instanceof t;
            }
            Throwable th = null;
            if (z3) {
                w(y0Var, obj);
                throw null;
            } else if (obj instanceof C0048u) {
                C0048u uVar = (C0048u) obj;
                uVar.getClass();
                if (!C0048u.f949b.compareAndSet(uVar, 0, 1)) {
                    w(y0Var, obj);
                    throw null;
                } else if (obj instanceof C0041m) {
                    if (!(obj instanceof C0048u)) {
                        uVar = null;
                    }
                    if (uVar != null) {
                        th = uVar.f950a;
                    }
                    if (y0Var instanceof C0037j) {
                        k((C0037j) y0Var, th);
                        return;
                    } else {
                        m((t) y0Var, th);
                        return;
                    }
                } else {
                    return;
                }
            } else if (obj instanceof C0047t) {
                C0047t tVar = (C0047t) obj;
                if (tVar.f945b != null) {
                    w(y0Var, obj);
                    throw null;
                } else if (!(y0Var instanceof t)) {
                    C0037j jVar = (C0037j) y0Var;
                    Throwable th2 = tVar.f947e;
                    if (th2 != null) {
                        k(jVar, th2);
                        return;
                    }
                    C0047t a6 = C0047t.a(tVar, jVar, (CancellationException) null, 29);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a6)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    return;
                } else {
                    return;
                }
            } else if (!(y0Var instanceof t)) {
                C0047t tVar2 = new C0047t(obj, (C0037j) y0Var, (l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, tVar2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            } else {
                return;
            }
        }
    }

    public final boolean v() {
        if (this.f876c == 2) {
            o5.d dVar = this.d;
            j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (h.f1256q.get((h) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public String x() {
        return "CancellableContinuation";
    }

    public final void y() {
        h hVar;
        o5.d dVar = this.d;
        Throwable th = null;
        if (dVar instanceof h) {
            hVar = (h) dVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            loop0:
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f1256q;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                u uVar = I5.a.d;
                if (obj == uVar) {
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(hVar, uVar, this)) {
                            break loop0;
                        } else if (atomicReferenceFieldUpdater.get(hVar) != uVar) {
                        }
                    }
                } else if (obj instanceof Throwable) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = obj;
                } else {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
            }
            if (th != null) {
                o();
                n(th);
            }
        }
    }

    public final void z(Object obj, int i2, l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f921p;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y0) {
                Object B6 = B((y0) obj2, obj, i2, lVar);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, B6)) {
                        if (!v()) {
                            o();
                        }
                        p(i2);
                        return;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
            } else {
                if (obj2 instanceof C0041m) {
                    C0041m mVar = (C0041m) obj2;
                    mVar.getClass();
                    if (C0041m.f925c.compareAndSet(mVar, 0, 1)) {
                        if (lVar != null) {
                            l(lVar, mVar.f950a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        }
    }
}
