package T1;

/* renamed from: T1.l1  reason: case insensitive filesystem */
public final class C0187l1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3375a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0190m1 f3376b;

    public /* synthetic */ C0187l1(C0190m1 m1Var, int i2) {
        this.f3375a = i2;
        this.f3376b = m1Var;
    }

    public final void run() {
        switch (this.f3375a) {
            case 0:
                C0190m1 m1Var = this.f3376b;
                m1Var.f3381e = m1Var.f3386s;
                return;
            default:
                this.f3376b.f3386s = null;
                return;
        }
    }
}
