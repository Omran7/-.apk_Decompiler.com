package K;

import C.g;
import android.support.v4.media.session.a;

public abstract class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final v0 f1409a;

    /* renamed from: b  reason: collision with root package name */
    public g[] f1410b;

    public n0() {
        this(new v0());
    }

    public final void a() {
        g[] gVarArr = this.f1410b;
        if (gVarArr != null) {
            g gVar = gVarArr[0];
            g gVar2 = gVarArr[1];
            v0 v0Var = this.f1409a;
            if (gVar2 == null) {
                gVar2 = v0Var.f1432a.f(2);
            }
            if (gVar == null) {
                gVar = v0Var.f1432a.f(1);
            }
            g(g.a(gVar, gVar2));
            g gVar3 = this.f1410b[a.j0(16)];
            if (gVar3 != null) {
                f(gVar3);
            }
            g gVar4 = this.f1410b[a.j0(32)];
            if (gVar4 != null) {
                d(gVar4);
            }
            g gVar5 = this.f1410b[a.j0(64)];
            if (gVar5 != null) {
                h(gVar5);
            }
        }
    }

    public abstract v0 b();

    public void c(int i2, g gVar) {
        if (this.f1410b == null) {
            this.f1410b = new g[9];
        }
        for (int i5 = 1; i5 <= 256; i5 <<= 1) {
            if ((i2 & i5) != 0) {
                this.f1410b[a.j0(i5)] = gVar;
            }
        }
    }

    public abstract void e(g gVar);

    public abstract void g(g gVar);

    public n0(v0 v0Var) {
        this.f1409a = v0Var;
    }

    public void d(g gVar) {
    }

    public void f(g gVar) {
    }

    public void h(g gVar) {
    }
}
