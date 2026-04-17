package T1;

/* renamed from: T1.a1  reason: case insensitive filesystem */
public final class C0154a1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3224a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ J0 f3225b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f3226c;
    public final /* synthetic */ boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0157b1 f3227e;

    public /* synthetic */ C0154a1(C0157b1 b1Var, J0 j02, long j6, boolean z3, int i2) {
        this.f3224a = i2;
        this.f3225b = j02;
        this.f3226c = j6;
        this.d = z3;
        this.f3227e = b1Var;
    }

    public final void run() {
        switch (this.f3224a) {
            case 0:
                C0157b1 b1Var = this.f3227e;
                J0 j02 = this.f3225b;
                b1Var.G(j02);
                C0157b1.s(b1Var, j02, this.f3226c, true, this.d);
                return;
            default:
                C0157b1 b1Var2 = this.f3227e;
                J0 j03 = this.f3225b;
                b1Var2.G(j03);
                C0157b1.s(b1Var2, j03, this.f3226c, false, this.d);
                return;
        }
    }
}
