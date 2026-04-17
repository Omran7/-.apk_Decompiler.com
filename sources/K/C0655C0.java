package k;

/* renamed from: k.C0  reason: case insensitive filesystem */
public final class C0655C0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9147a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0657D0 f9148b;

    public /* synthetic */ C0655C0(C0657D0 d02, int i2) {
        this.f9147a = i2;
        this.f9148b = d02;
    }

    public final void run() {
        switch (this.f9147a) {
            case 0:
                C0739t0 t0Var = this.f9148b.f9164c;
                if (t0Var != null) {
                    t0Var.setListSelectionHidden(true);
                    t0Var.requestLayout();
                    return;
                }
                return;
            default:
                C0657D0 d02 = this.f9148b;
                C0739t0 t0Var2 = d02.f9164c;
                if (t0Var2 != null && t0Var2.isAttachedToWindow() && d02.f9164c.getCount() > d02.f9164c.getChildCount() && d02.f9164c.getChildCount() <= d02.f9173v) {
                    d02.f9161I.setInputMethodMode(2);
                    d02.c();
                    return;
                }
                return;
        }
    }
}
