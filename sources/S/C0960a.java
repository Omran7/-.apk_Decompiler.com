package s;

import h0.C0552a;
import o3.d;
import q.C0925b;
import q.C0926c;
import q.C0929f;

/* renamed from: s.a  reason: case insensitive filesystem */
public final class C0960a extends i {
    public int s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f11266t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f11267u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f11268v0;

    public final boolean A() {
        return this.f11268v0;
    }

    public final boolean B() {
        return this.f11268v0;
    }

    public final boolean T() {
        int i2;
        int i5;
        int i6;
        boolean z3 = true;
        int i7 = 0;
        while (true) {
            i2 = this.f11426r0;
            if (i7 >= i2) {
                break;
            }
            d dVar = this.f11425q0[i7];
            if ((this.f11266t0 || dVar.c()) && ((((i5 = this.s0) == 0 || i5 == 1) && !dVar.A()) || (((i6 = this.s0) == 2 || i6 == 3) && !dVar.B()))) {
                z3 = false;
            }
            i7++;
        }
        if (!z3 || i2 <= 0) {
            return false;
        }
        int i8 = 0;
        boolean z4 = false;
        for (int i9 = 0; i9 < this.f11426r0; i9++) {
            d dVar2 = this.f11425q0[i9];
            if (this.f11266t0 || dVar2.c()) {
                if (!z4) {
                    int i10 = this.s0;
                    if (i10 == 0) {
                        i8 = dVar2.i(2).d();
                    } else if (i10 == 1) {
                        i8 = dVar2.i(4).d();
                    } else if (i10 == 2) {
                        i8 = dVar2.i(3).d();
                    } else if (i10 == 3) {
                        i8 = dVar2.i(5).d();
                    }
                    z4 = true;
                }
                int i11 = this.s0;
                if (i11 == 0) {
                    i8 = Math.min(i8, dVar2.i(2).d());
                } else if (i11 == 1) {
                    i8 = Math.max(i8, dVar2.i(4).d());
                } else if (i11 == 2) {
                    i8 = Math.min(i8, dVar2.i(3).d());
                } else if (i11 == 3) {
                    i8 = Math.max(i8, dVar2.i(5).d());
                }
            }
        }
        int i12 = i8 + this.f11267u0;
        int i13 = this.s0;
        if (i13 == 0 || i13 == 1) {
            J(i12, i12);
        } else {
            K(i12, i12);
        }
        this.f11268v0 = true;
        return true;
    }

    public final int U() {
        int i2 = this.s0;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        if (i2 == 2 || i2 == 3) {
            return 1;
        }
        return -1;
    }

    public final void b(C0926c cVar, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        int i5;
        int i6;
        int i7;
        C0926c cVar2 = cVar;
        c[] cVarArr = this.f11304Q;
        c cVar3 = this.f11296I;
        cVarArr[0] = cVar3;
        c cVar4 = this.f11297J;
        int i8 = 2;
        cVarArr[2] = cVar4;
        c cVar5 = this.f11298K;
        cVarArr[1] = cVar5;
        c cVar6 = this.f11299L;
        cVarArr[3] = cVar6;
        for (c cVar7 : cVarArr) {
            cVar7.f11288i = cVar2.k(cVar7);
        }
        int i9 = this.s0;
        if (i9 >= 0 && i9 < 4) {
            c cVar8 = cVarArr[i9];
            if (!this.f11268v0) {
                T();
            }
            if (this.f11268v0) {
                this.f11268v0 = false;
                int i10 = this.s0;
                if (i10 == 0 || i10 == 1) {
                    cVar2.d(cVar3.f11288i, this.f11312Y);
                    cVar2.d(cVar5.f11288i, this.f11312Y);
                } else if (i10 == 2 || i10 == 3) {
                    cVar2.d(cVar4.f11288i, this.f11313Z);
                    cVar2.d(cVar6.f11288i, this.f11313Z);
                }
            } else {
                int i11 = 0;
                while (true) {
                    if (i11 >= this.f11426r0) {
                        z4 = false;
                        break;
                    }
                    d dVar = this.f11425q0[i11];
                    if ((this.f11266t0 || dVar.c()) && ((((i7 = this.s0) == 0 || i7 == 1) && dVar.f11342p0[0] == 3 && dVar.f11296I.f11287f != null && dVar.f11298K.f11287f != null) || ((i7 == 2 || i7 == 3) && dVar.f11342p0[1] == 3 && dVar.f11297J.f11287f != null && dVar.f11299L.f11287f != null))) {
                        z4 = true;
                    } else {
                        i11++;
                    }
                }
                if (cVar3.g() || cVar5.g()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (cVar4.g() || cVar6.g()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z4 || (((i6 = this.s0) != 0 || !z5) && ((i6 != 2 || !z6) && ((i6 != 1 || !z5) && (i6 != 3 || !z6))))) {
                    i2 = 4;
                } else {
                    i2 = 5;
                }
                int i12 = 0;
                while (i12 < this.f11426r0) {
                    d dVar2 = this.f11425q0[i12];
                    if (this.f11266t0 || dVar2.c()) {
                        C0929f k6 = cVar2.k(dVar2.f11304Q[this.s0]);
                        int i13 = this.s0;
                        c cVar9 = dVar2.f11304Q[i13];
                        cVar9.f11288i = k6;
                        c cVar10 = cVar9.f11287f;
                        if (cVar10 == null || cVar10.d != this) {
                            i5 = 0;
                        } else {
                            i5 = cVar9.g;
                        }
                        if (i13 == 0 || i13 == i8) {
                            C0925b l6 = cVar.l();
                            C0929f m6 = cVar.m();
                            m6.d = 0;
                            l6.c(cVar8.f11288i, k6, m6, this.f11267u0 - i5);
                            cVar2.c(l6);
                        } else {
                            C0925b l7 = cVar.l();
                            C0929f m7 = cVar.m();
                            m7.d = 0;
                            l7.b(cVar8.f11288i, k6, m7, this.f11267u0 + i5);
                            cVar2.c(l7);
                        }
                        cVar2.e(cVar8.f11288i, k6, this.f11267u0 + i5, i2);
                    }
                    i12++;
                    i8 = 2;
                }
                int i14 = this.s0;
                if (i14 == 0) {
                    cVar2.e(cVar5.f11288i, cVar3.f11288i, 0, 8);
                    cVar2.e(cVar3.f11288i, this.f11307T.f11298K.f11288i, 0, 4);
                    cVar2.e(cVar3.f11288i, this.f11307T.f11296I.f11288i, 0, 0);
                } else if (i14 == 1) {
                    cVar2.e(cVar3.f11288i, cVar5.f11288i, 0, 8);
                    cVar2.e(cVar3.f11288i, this.f11307T.f11296I.f11288i, 0, 4);
                    cVar2.e(cVar3.f11288i, this.f11307T.f11298K.f11288i, 0, 0);
                } else if (i14 == 2) {
                    cVar2.e(cVar6.f11288i, cVar4.f11288i, 0, 8);
                    cVar2.e(cVar4.f11288i, this.f11307T.f11299L.f11288i, 0, 4);
                    cVar2.e(cVar4.f11288i, this.f11307T.f11297J.f11288i, 0, 0);
                } else if (i14 == 3) {
                    cVar2.e(cVar4.f11288i, cVar6.f11288i, 0, 8);
                    cVar2.e(cVar4.f11288i, this.f11307T.f11297J.f11288i, 0, 4);
                    cVar2.e(cVar4.f11288i, this.f11307T.f11299L.f11288i, 0, 0);
                }
            }
        }
    }

    public final boolean c() {
        return true;
    }

    public final String toString() {
        String r6 = C0552a.r(new StringBuilder("[Barrier] "), this.f11326h0, " {");
        for (int i2 = 0; i2 < this.f11426r0; i2++) {
            d dVar = this.f11425q0[i2];
            if (i2 > 0) {
                r6 = d.f(r6, ", ");
            }
            r6 = r6 + dVar.f11326h0;
        }
        return d.f(r6, "}");
    }
}
