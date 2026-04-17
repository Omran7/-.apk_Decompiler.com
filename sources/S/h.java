package s;

import java.util.ArrayList;
import q.C0925b;
import q.C0926c;
import q.C0928e;
import q.C0929f;

public final class h extends d {

    /* renamed from: q0  reason: collision with root package name */
    public float f11420q0 = -1.0f;

    /* renamed from: r0  reason: collision with root package name */
    public int f11421r0 = -1;
    public int s0 = -1;

    /* renamed from: t0  reason: collision with root package name */
    public c f11422t0 = this.f11297J;

    /* renamed from: u0  reason: collision with root package name */
    public int f11423u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f11424v0;

    public h() {
        this.f11423u0 = 0;
        this.f11305R.clear();
        this.f11305R.add(this.f11422t0);
        int length = this.f11304Q.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f11304Q[i2] = this.f11422t0;
        }
    }

    public final boolean A() {
        return this.f11424v0;
    }

    public final boolean B() {
        return this.f11424v0;
    }

    public final void Q(C0926c cVar, boolean z3) {
        if (this.f11307T != null) {
            c cVar2 = this.f11422t0;
            cVar.getClass();
            int n2 = C0926c.n(cVar2);
            if (this.f11423u0 == 1) {
                this.f11312Y = n2;
                this.f11313Z = 0;
                L(this.f11307T.k());
                O(0);
                return;
            }
            this.f11312Y = 0;
            this.f11313Z = n2;
            O(this.f11307T.q());
            L(0);
        }
    }

    public final void R(int i2) {
        this.f11422t0.l(i2);
        this.f11424v0 = true;
    }

    public final void S(int i2) {
        if (this.f11423u0 != i2) {
            this.f11423u0 = i2;
            ArrayList arrayList = this.f11305R;
            arrayList.clear();
            if (this.f11423u0 == 1) {
                this.f11422t0 = this.f11296I;
            } else {
                this.f11422t0 = this.f11297J;
            }
            arrayList.add(this.f11422t0);
            c[] cVarArr = this.f11304Q;
            int length = cVarArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                cVarArr[i5] = this.f11422t0;
            }
        }
    }

    public final void b(C0926c cVar, boolean z3) {
        boolean z4;
        e eVar = (e) this.f11307T;
        if (eVar != null) {
            c i2 = eVar.i(2);
            c i5 = eVar.i(4);
            d dVar = this.f11307T;
            boolean z5 = true;
            if (dVar == null || dVar.f11342p0[0] != 2) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (this.f11423u0 == 0) {
                i2 = eVar.i(3);
                i5 = eVar.i(5);
                d dVar2 = this.f11307T;
                if (dVar2 == null || dVar2.f11342p0[1] != 2) {
                    z5 = false;
                }
                z4 = z5;
            }
            if (this.f11424v0) {
                c cVar2 = this.f11422t0;
                if (cVar2.f11285c) {
                    C0929f k6 = cVar.k(cVar2);
                    cVar.d(k6, this.f11422t0.d());
                    if (this.f11421r0 != -1) {
                        if (z4) {
                            cVar.f(cVar.k(i5), k6, 0, 5);
                        }
                    } else if (this.s0 != -1 && z4) {
                        C0929f k7 = cVar.k(i5);
                        cVar.f(k6, cVar.k(i2), 0, 5);
                        cVar.f(k7, k6, 0, 5);
                    }
                    this.f11424v0 = false;
                    return;
                }
            }
            if (this.f11421r0 != -1) {
                C0929f k8 = cVar.k(this.f11422t0);
                cVar.e(k8, cVar.k(i2), this.f11421r0, 8);
                if (z4) {
                    cVar.f(cVar.k(i5), k8, 0, 5);
                }
            } else if (this.s0 != -1) {
                C0929f k9 = cVar.k(this.f11422t0);
                C0929f k10 = cVar.k(i5);
                cVar.e(k9, k10, -this.s0, 8);
                if (z4) {
                    cVar.f(k9, cVar.k(i2), 0, 5);
                    cVar.f(k10, k9, 0, 5);
                }
            } else if (this.f11420q0 != -1.0f) {
                C0929f k11 = cVar.k(this.f11422t0);
                C0929f k12 = cVar.k(i5);
                float f6 = this.f11420q0;
                C0925b l6 = cVar.l();
                l6.d.g(k11, -1.0f);
                l6.d.g(k12, f6);
                cVar.c(l6);
            }
        }
    }

    public final boolean c() {
        return true;
    }

    public final c i(int i2) {
        int c3 = C0928e.c(i2);
        if (c3 != 1) {
            if (c3 != 2) {
                if (c3 != 3) {
                    if (c3 != 4) {
                        return null;
                    }
                }
            }
            if (this.f11423u0 == 0) {
                return this.f11422t0;
            }
            return null;
        }
        if (this.f11423u0 == 1) {
            return this.f11422t0;
        }
        return null;
    }
}
