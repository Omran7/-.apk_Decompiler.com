package T1;

import C0.a;

public abstract class E0 extends a {

    /* renamed from: b  reason: collision with root package name */
    public boolean f2825b;

    public E0(C0212u0 u0Var) {
        super(u0Var);
        ((C0212u0) this.f398a).f3485M++;
    }

    public abstract boolean p();

    public final void q() {
        if (!this.f2825b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void r() {
        if (this.f2825b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!p()) {
            ((C0212u0) this.f398a).f3487O.incrementAndGet();
            this.f2825b = true;
        }
    }
}
