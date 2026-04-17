package i;

import R2.b;
import k.a1;

public final class i extends b {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f8229t = 0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f8230u;

    /* renamed from: v  reason: collision with root package name */
    public int f8231v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f8232w;

    public i(j jVar) {
        this.f8232w = jVar;
        this.f8230u = false;
        this.f8231v = 0;
    }

    public final void b() {
        switch (this.f8229t) {
            case 0:
                int i2 = this.f8231v + 1;
                this.f8231v = i2;
                j jVar = (j) this.f8232w;
                if (i2 == jVar.f8233a.size()) {
                    b bVar = jVar.d;
                    if (bVar != null) {
                        bVar.b();
                    }
                    this.f8231v = 0;
                    this.f8230u = false;
                    jVar.f8236e = false;
                    return;
                }
                return;
            default:
                if (!this.f8230u) {
                    ((a1) this.f8232w).f9257a.setVisibility(this.f8231v);
                    return;
                }
                return;
        }
    }

    public void e() {
        switch (this.f8229t) {
            case 1:
                this.f8230u = true;
                return;
            default:
                return;
        }
    }

    public final void g() {
        switch (this.f8229t) {
            case 0:
                if (!this.f8230u) {
                    this.f8230u = true;
                    b bVar = ((j) this.f8232w).d;
                    if (bVar != null) {
                        bVar.g();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((a1) this.f8232w).f9257a.setVisibility(0);
                return;
        }
    }

    public i(a1 a1Var, int i2) {
        this.f8232w = a1Var;
        this.f8231v = i2;
        this.f8230u = false;
    }
}
