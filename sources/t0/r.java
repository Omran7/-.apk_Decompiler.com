package t0;

public final class r extends n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11691a = 1;

    /* renamed from: b  reason: collision with root package name */
    public m f11692b;

    public /* synthetic */ r() {
    }

    public void e(m mVar) {
        switch (this.f11691a) {
            case 1:
                C0980a aVar = (C0980a) this.f11692b;
                if (!aVar.f11630M) {
                    aVar.H();
                    aVar.f11630M = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void f(m mVar) {
        switch (this.f11691a) {
            case 0:
                this.f11692b.A();
                mVar.y(this);
                return;
            default:
                C0980a aVar = (C0980a) this.f11692b;
                int i2 = aVar.f11629L - 1;
                aVar.f11629L = i2;
                if (i2 == 0) {
                    aVar.f11630M = false;
                    aVar.n();
                }
                mVar.y(this);
                return;
        }
    }

    public r(m mVar) {
        this.f11692b = mVar;
    }
}
