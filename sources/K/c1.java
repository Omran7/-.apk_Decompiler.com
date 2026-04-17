package k;

public final /* synthetic */ class c1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9277a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d1 f9278b;

    public /* synthetic */ c1(d1 d1Var, int i2) {
        this.f9277a = i2;
        this.f9278b = d1Var;
    }

    public final void run() {
        switch (this.f9277a) {
            case 0:
                this.f9278b.c(false);
                return;
            default:
                this.f9278b.a();
                return;
        }
    }
}
