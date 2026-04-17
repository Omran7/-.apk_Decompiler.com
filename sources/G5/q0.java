package G5;

import I5.a;
import I5.b;
import I5.k;
import I5.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;

public final class q0 extends b {

    /* renamed from: b  reason: collision with root package name */
    public final m0 f936b;

    /* renamed from: c  reason: collision with root package name */
    public w0 f937c;
    public final /* synthetic */ v0 d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0024c0 f938e;

    public q0(m0 m0Var, v0 v0Var, C0024c0 c0Var) {
        this.d = v0Var;
        this.f938e = c0Var;
        this.f936b = m0Var;
    }

    public final void b(Object obj, Object obj2) {
        boolean z3;
        Object obj3;
        k kVar = (k) obj;
        if (obj2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        m0 m0Var = this.f936b;
        if (z3) {
            obj3 = m0Var;
        } else {
            obj3 = this.f937c;
        }
        if (obj3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f1266a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, obj3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z3) {
                w0 w0Var = this.f937c;
                j.b(w0Var);
                m0Var.d(w0Var);
            }
        }
    }

    public final u c(Object obj) {
        k kVar = (k) obj;
        if (this.d.u() == this.f938e) {
            return null;
        }
        return a.f1247e;
    }
}
