package s;

import java.util.ArrayList;
import q.C0926c;
import t.C0976b;
import v.f;

public final class g extends i {

    /* renamed from: A0  reason: collision with root package name */
    public int f11388A0;

    /* renamed from: B0  reason: collision with root package name */
    public C0976b f11389B0;

    /* renamed from: C0  reason: collision with root package name */
    public f f11390C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f11391D0;

    /* renamed from: E0  reason: collision with root package name */
    public int f11392E0;

    /* renamed from: F0  reason: collision with root package name */
    public int f11393F0;

    /* renamed from: G0  reason: collision with root package name */
    public int f11394G0;

    /* renamed from: H0  reason: collision with root package name */
    public int f11395H0;

    /* renamed from: I0  reason: collision with root package name */
    public int f11396I0;

    /* renamed from: J0  reason: collision with root package name */
    public float f11397J0;

    /* renamed from: K0  reason: collision with root package name */
    public float f11398K0;
    public float L0;

    /* renamed from: M0  reason: collision with root package name */
    public float f11399M0;

    /* renamed from: N0  reason: collision with root package name */
    public float f11400N0;
    public float O0;

    /* renamed from: P0  reason: collision with root package name */
    public int f11401P0;

    /* renamed from: Q0  reason: collision with root package name */
    public int f11402Q0;

    /* renamed from: R0  reason: collision with root package name */
    public int f11403R0;

    /* renamed from: S0  reason: collision with root package name */
    public int f11404S0;

    /* renamed from: T0  reason: collision with root package name */
    public int f11405T0;

    /* renamed from: U0  reason: collision with root package name */
    public int f11406U0;

    /* renamed from: V0  reason: collision with root package name */
    public int f11407V0;

    /* renamed from: W0  reason: collision with root package name */
    public ArrayList f11408W0;
    public d[] X0;

    /* renamed from: Y0  reason: collision with root package name */
    public d[] f11409Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public int[] f11410Z0;

    /* renamed from: a1  reason: collision with root package name */
    public d[] f11411a1;

    /* renamed from: b1  reason: collision with root package name */
    public int f11412b1;
    public int s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f11413t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f11414u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f11415v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f11416w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f11417x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f11418y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f11419z0;

    public final void S() {
        for (int i2 = 0; i2 < this.f11426r0; i2++) {
            d dVar = this.f11425q0[i2];
            if (dVar != null) {
                dVar.F = true;
            }
        }
    }

    public final int T(d dVar, int i2) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f11342p0;
        if (iArr[1] == 3) {
            int i5 = dVar.f11345s;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (dVar.f11352z * ((float) i2));
                if (i6 != dVar.k()) {
                    dVar.g = true;
                    V(iArr[0], dVar.q(), 1, i6, dVar);
                }
                return i6;
            } else if (i5 == 1) {
                return dVar.k();
            } else {
                if (i5 == 3) {
                    return (int) ((((float) dVar.q()) * dVar.f11310W) + 0.5f);
                }
            }
        }
        return dVar.k();
    }

    public final int U(d dVar, int i2) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f11342p0;
        if (iArr[0] == 3) {
            int i5 = dVar.f11344r;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (dVar.f11349w * ((float) i2));
                if (i6 != dVar.q()) {
                    dVar.g = true;
                    V(1, i6, iArr[1], dVar.k(), dVar);
                }
                return i6;
            } else if (i5 == 1) {
                return dVar.q();
            } else {
                if (i5 == 3) {
                    return (int) ((((float) dVar.k()) * dVar.f11310W) + 0.5f);
                }
            }
        }
        return dVar.q();
    }

    public final void V(int i2, int i5, int i6, int i7, d dVar) {
        f fVar;
        d dVar2;
        while (true) {
            fVar = this.f11390C0;
            if (fVar != null || (dVar2 = this.f11307T) == null) {
                C0976b bVar = this.f11389B0;
                bVar.f11567a = i2;
                bVar.f11568b = i6;
                bVar.f11569c = i5;
                bVar.d = i7;
                fVar.b(dVar, bVar);
                dVar.O(bVar.f11570e);
                dVar.L(bVar.f11571f);
                dVar.f11293E = bVar.h;
                dVar.I(bVar.g);
            } else {
                this.f11390C0 = ((e) dVar2).f11367u0;
            }
        }
        C0976b bVar2 = this.f11389B0;
        bVar2.f11567a = i2;
        bVar2.f11568b = i6;
        bVar2.f11569c = i5;
        bVar2.d = i7;
        fVar.b(dVar, bVar2);
        dVar.O(bVar2.f11570e);
        dVar.L(bVar2.f11571f);
        dVar.f11293E = bVar2.h;
        dVar.I(bVar2.g);
    }

    public final void b(C0926c cVar, boolean z3) {
        boolean z4;
        boolean z5;
        d dVar;
        float f6;
        int i2;
        boolean z6;
        super.b(cVar, z3);
        d dVar2 = this.f11307T;
        if (dVar2 == null || !((e) dVar2).f11368v0) {
            z4 = false;
        } else {
            z4 = true;
        }
        int i5 = this.f11405T0;
        ArrayList arrayList = this.f11408W0;
        if (i5 != 0) {
            if (i5 == 1) {
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    f fVar = (f) arrayList.get(i6);
                    if (i6 == size - 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    fVar.b(i6, z4, z5);
                }
            } else if (i5 != 2) {
                if (i5 == 3) {
                    int size2 = arrayList.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        f fVar2 = (f) arrayList.get(i7);
                        if (i7 == size2 - 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        fVar2.b(i7, z4, z6);
                    }
                }
            } else if (!(this.f11410Z0 == null || this.f11409Y0 == null || this.X0 == null)) {
                for (int i8 = 0; i8 < this.f11412b1; i8++) {
                    this.f11411a1[i8].D();
                }
                int[] iArr = this.f11410Z0;
                int i9 = iArr[0];
                int i10 = iArr[1];
                float f7 = this.f11397J0;
                d dVar3 = null;
                int i11 = 0;
                while (i11 < i9) {
                    if (z4) {
                        i2 = (i9 - i11) - 1;
                        f6 = 1.0f - this.f11397J0;
                    } else {
                        f6 = f7;
                        i2 = i11;
                    }
                    d dVar4 = this.f11409Y0[i2];
                    if (!(dVar4 == null || dVar4.f11325g0 == 8)) {
                        c cVar2 = dVar4.f11296I;
                        if (i11 == 0) {
                            dVar4.f(cVar2, this.f11296I, this.f11416w0);
                            dVar4.f11328i0 = this.f11391D0;
                            dVar4.f11320d0 = f6;
                        }
                        if (i11 == i9 - 1) {
                            dVar4.f(dVar4.f11298K, this.f11298K, this.f11417x0);
                        }
                        if (i11 > 0 && dVar3 != null) {
                            int i12 = this.f11401P0;
                            c cVar3 = dVar3.f11298K;
                            dVar4.f(cVar2, cVar3, i12);
                            dVar3.f(cVar3, cVar2, 0);
                        }
                        dVar3 = dVar4;
                    }
                    i11++;
                    f7 = f6;
                }
                for (int i13 = 0; i13 < i10; i13++) {
                    d dVar5 = this.X0[i13];
                    if (!(dVar5 == null || dVar5.f11325g0 == 8)) {
                        c cVar4 = dVar5.f11297J;
                        if (i13 == 0) {
                            dVar5.f(cVar4, this.f11297J, this.s0);
                            dVar5.f11330j0 = this.f11392E0;
                            dVar5.f11322e0 = this.f11398K0;
                        }
                        if (i13 == i10 - 1) {
                            dVar5.f(dVar5.f11299L, this.f11299L, this.f11413t0);
                        }
                        if (i13 > 0 && dVar3 != null) {
                            int i14 = this.f11402Q0;
                            c cVar5 = dVar3.f11299L;
                            dVar5.f(cVar4, cVar5, i14);
                            dVar3.f(cVar5, cVar4, 0);
                        }
                        dVar3 = dVar5;
                    }
                }
                for (int i15 = 0; i15 < i9; i15++) {
                    for (int i16 = 0; i16 < i10; i16++) {
                        int i17 = (i16 * i9) + i15;
                        if (this.f11407V0 == 1) {
                            i17 = (i15 * i10) + i16;
                        }
                        d[] dVarArr = this.f11411a1;
                        if (!(i17 >= dVarArr.length || (dVar = dVarArr[i17]) == null || dVar.f11325g0 == 8)) {
                            d dVar6 = this.f11409Y0[i15];
                            d dVar7 = this.X0[i16];
                            if (dVar != dVar6) {
                                dVar.f(dVar.f11296I, dVar6.f11296I, 0);
                                dVar.f(dVar.f11298K, dVar6.f11298K, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.f11297J, dVar7.f11297J, 0);
                                dVar.f(dVar.f11299L, dVar7.f11299L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z4, true);
        }
        this.f11418y0 = false;
    }
}
