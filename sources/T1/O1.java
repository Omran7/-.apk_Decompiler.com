package T1;

public abstract class O1 extends K1 {

    /* renamed from: c  reason: collision with root package name */
    public boolean f3013c;

    public O1(T1 t12) {
        super(t12);
        this.f2982b.f3042A++;
    }

    public final void p() {
        if (!this.f3013c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void q() {
        if (!this.f3013c) {
            r();
            this.f2982b.f3043B++;
            this.f3013c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract void r();
}
