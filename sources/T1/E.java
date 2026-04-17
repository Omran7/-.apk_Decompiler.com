package T1;

public abstract class E extends D {

    /* renamed from: b  reason: collision with root package name */
    public boolean f2824b;

    public E(C0212u0 u0Var) {
        super(u0Var);
        ((C0212u0) this.f398a).f3485M++;
    }

    public final void p() {
        if (!this.f2824b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void q() {
        if (this.f2824b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!r()) {
            ((C0212u0) this.f398a).f3487O.incrementAndGet();
            this.f2824b = true;
        }
    }

    public abstract boolean r();
}
