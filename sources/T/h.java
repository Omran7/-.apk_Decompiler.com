package t;

import java.util.HashSet;
import java.util.Iterator;
import s.c;
import s.d;
import s.e;
import v.f;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final C0976b f11591a = new Object();

    public static boolean a(d dVar) {
        e eVar;
        boolean z3;
        boolean z4;
        int[] iArr = dVar.f11342p0;
        int i2 = iArr[0];
        int i5 = iArr[1];
        d dVar2 = dVar.f11307T;
        if (dVar2 != null) {
            eVar = (e) dVar2;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            int i6 = eVar.f11342p0[0];
        }
        if (eVar != null) {
            int i7 = eVar.f11342p0[1];
        }
        if (i2 == 1 || dVar.A() || i2 == 2 || ((i2 == 3 && dVar.f11344r == 0 && dVar.f11310W == 0.0f && dVar.t(0)) || (i2 == 3 && dVar.f11344r == 1 && dVar.u(0, dVar.q())))) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i5 == 1 || dVar.B() || i5 == 2 || ((i5 == 3 && dVar.f11345s == 0 && dVar.f11310W == 0.0f && dVar.t(1)) || (i5 == 3 && dVar.f11345s == 1 && dVar.u(1, dVar.k())))) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (dVar.f11310W > 0.0f && (z3 || z4)) {
            return true;
        }
        if (!z3 || !z4) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [t.n, java.lang.Object] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static t.n b(s.d r7, int r8, java.util.ArrayList r9, t.n r10) {
        /*
            if (r8 != 0) goto L_0x0005
            int r0 = r7.f11338n0
            goto L_0x0007
        L_0x0005:
            int r0 = r7.f11340o0
        L_0x0007:
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L_0x002f
            if (r10 == 0) goto L_0x0011
            int r3 = r10.f11599b
            if (r0 == r3) goto L_0x002f
        L_0x0011:
            r3 = r1
        L_0x0012:
            int r4 = r9.size()
            if (r3 >= r4) goto L_0x0032
            java.lang.Object r4 = r9.get(r3)
            t.n r4 = (t.n) r4
            int r5 = r4.f11599b
            if (r5 != r0) goto L_0x002c
            if (r10 == 0) goto L_0x002a
            r10.c(r8, r4)
            r9.remove(r10)
        L_0x002a:
            r10 = r4
            goto L_0x0032
        L_0x002c:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x002f:
            if (r0 == r2) goto L_0x0032
            return r10
        L_0x0032:
            r0 = 1
            if (r10 != 0) goto L_0x008f
            boolean r3 = r7 instanceof s.i
            if (r3 == 0) goto L_0x006f
            r3 = r7
            s.i r3 = (s.i) r3
            r4 = r1
        L_0x003d:
            int r5 = r3.f11426r0
            if (r4 >= r5) goto L_0x0056
            s.d[] r5 = r3.f11425q0
            r5 = r5[r4]
            if (r8 != 0) goto L_0x004c
            int r6 = r5.f11338n0
            if (r6 == r2) goto L_0x004c
            goto L_0x0057
        L_0x004c:
            if (r8 != r0) goto L_0x0053
            int r6 = r5.f11340o0
            if (r6 == r2) goto L_0x0053
            goto L_0x0057
        L_0x0053:
            int r4 = r4 + 1
            goto L_0x003d
        L_0x0056:
            r6 = r2
        L_0x0057:
            if (r6 == r2) goto L_0x006f
            r3 = r1
        L_0x005a:
            int r4 = r9.size()
            if (r3 >= r4) goto L_0x006f
            java.lang.Object r4 = r9.get(r3)
            t.n r4 = (t.n) r4
            int r5 = r4.f11599b
            if (r5 != r6) goto L_0x006c
            r10 = r4
            goto L_0x006f
        L_0x006c:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x006f:
            if (r10 != 0) goto L_0x008c
            t.n r10 = new t.n
            r10.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10.f11598a = r3
            r3 = 0
            r10.d = r3
            r10.f11601e = r2
            int r2 = t.n.f11597f
            int r3 = r2 + 1
            t.n.f11597f = r3
            r10.f11599b = r2
            r10.f11600c = r8
        L_0x008c:
            r9.add(r10)
        L_0x008f:
            java.util.ArrayList r2 = r10.f11598a
            boolean r3 = r2.contains(r7)
            if (r3 == 0) goto L_0x0098
            goto L_0x00d3
        L_0x0098:
            r2.add(r7)
            boolean r2 = r7 instanceof s.h
            if (r2 == 0) goto L_0x00ac
            r2 = r7
            s.h r2 = (s.h) r2
            s.c r3 = r2.f11422t0
            int r2 = r2.f11423u0
            if (r2 != 0) goto L_0x00a9
            r1 = r0
        L_0x00a9:
            r3.c(r1, r9, r10)
        L_0x00ac:
            int r0 = r10.f11599b
            if (r8 != 0) goto L_0x00bd
            r7.f11338n0 = r0
            s.c r0 = r7.f11296I
            r0.c(r8, r9, r10)
            s.c r0 = r7.f11298K
            r0.c(r8, r9, r10)
            goto L_0x00ce
        L_0x00bd:
            r7.f11340o0 = r0
            s.c r0 = r7.f11297J
            r0.c(r8, r9, r10)
            s.c r0 = r7.f11300M
            r0.c(r8, r9, r10)
            s.c r0 = r7.f11299L
            r0.c(r8, r9, r10)
        L_0x00ce:
            s.c r7 = r7.f11303P
            r7.c(r8, r9, r10)
        L_0x00d3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t.h.b(s.d, int, java.util.ArrayList, t.n):t.n");
    }

    /* JADX WARNING: type inference failed for: r9v7, types: [t.b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v8, types: [t.b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v11, types: [t.b, java.lang.Object] */
    public static void c(int i2, d dVar, f fVar, boolean z3) {
        boolean z4;
        c cVar;
        c cVar2;
        char c3;
        c cVar3;
        c cVar4;
        d dVar2 = dVar;
        f fVar2 = fVar;
        boolean z5 = z3;
        if (!dVar2.f11335m) {
            if (!(dVar2 instanceof e) && dVar.z() && a(dVar)) {
                e.V(dVar2, fVar2, new Object());
            }
            c i5 = dVar2.i(2);
            c i6 = dVar2.i(4);
            int d = i5.d();
            int d6 = i6.d();
            HashSet hashSet = i5.f11283a;
            char c6 = 0;
            if (hashSet != null && i5.f11285c) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    c cVar5 = (c) it2.next();
                    d dVar3 = cVar5.d;
                    int i7 = i2 + 1;
                    boolean a6 = a(dVar3);
                    if (dVar3.z() && a6) {
                        e.V(dVar3, fVar2, new Object());
                    }
                    c cVar6 = dVar3.f11296I;
                    c cVar7 = dVar3.f11298K;
                    if ((cVar5 != cVar6 || (cVar4 = cVar7.f11287f) == null || !cVar4.f11285c) && (cVar5 != cVar7 || (cVar3 = cVar6.f11287f) == null || !cVar3.f11285c)) {
                        c3 = c6;
                    } else {
                        c3 = 1;
                    }
                    int i8 = dVar3.f11342p0[c6];
                    if (i8 != 3 || a6) {
                        if (!dVar3.z()) {
                            if (cVar5 == cVar6 && cVar7.f11287f == null) {
                                int e6 = cVar6.e() + d;
                                dVar3.J(e6, dVar3.q() + e6);
                                c(i7, dVar3, fVar2, z5);
                            } else if (cVar5 == cVar7 && cVar6.f11287f == null) {
                                int e7 = d - cVar7.e();
                                dVar3.J(e7 - dVar3.q(), e7);
                                c(i7, dVar3, fVar2, z5);
                            } else if (c3 != 0 && !dVar3.x()) {
                                d(i7, dVar3, fVar2, z5);
                            }
                        }
                    } else if (i8 == 3 && dVar3.f11348v >= 0 && dVar3.f11347u >= 0 && ((dVar3.f11325g0 == 8 || (dVar3.f11344r == 0 && dVar3.f11310W == 0.0f)) && !dVar3.x() && !dVar3.F && c3 != 0 && !dVar3.x())) {
                        e(i7, dVar2, fVar2, dVar3, z5);
                    }
                    c6 = 0;
                }
            }
            if (!(dVar2 instanceof s.h)) {
                HashSet hashSet2 = i6.f11283a;
                if (hashSet2 != null && i6.f11285c) {
                    Iterator it3 = hashSet2.iterator();
                    while (it3.hasNext()) {
                        c cVar8 = (c) it3.next();
                        d dVar4 = cVar8.d;
                        int i9 = i2 + 1;
                        boolean a7 = a(dVar4);
                        if (dVar4.z() && a7) {
                            e.V(dVar4, fVar2, new Object());
                        }
                        c cVar9 = dVar4.f11296I;
                        c cVar10 = dVar4.f11298K;
                        if ((cVar8 != cVar9 || (cVar2 = cVar10.f11287f) == null || !cVar2.f11285c) && (cVar8 != cVar10 || (cVar = cVar9.f11287f) == null || !cVar.f11285c)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        int i10 = dVar4.f11342p0[0];
                        if (i10 != 3 || a7) {
                            if (!dVar4.z()) {
                                if (cVar8 == cVar9 && cVar10.f11287f == null) {
                                    int e8 = cVar9.e() + d6;
                                    dVar4.J(e8, dVar4.q() + e8);
                                    c(i9, dVar4, fVar2, z5);
                                } else if (cVar8 == cVar10 && cVar9.f11287f == null) {
                                    int e9 = d6 - cVar10.e();
                                    dVar4.J(e9 - dVar4.q(), e9);
                                    c(i9, dVar4, fVar2, z5);
                                } else if (z4 && !dVar4.x()) {
                                    d(i9, dVar4, fVar2, z5);
                                }
                            }
                        } else if (i10 == 3 && dVar4.f11348v >= 0 && dVar4.f11347u >= 0) {
                            if (dVar4.f11325g0 != 8) {
                                if (dVar4.f11344r == 0) {
                                    if (dVar4.f11310W != 0.0f) {
                                    }
                                }
                            }
                            if (!dVar4.x() && !dVar4.F && z4 && !dVar4.x()) {
                                e(i9, dVar2, fVar2, dVar4, z5);
                            }
                        }
                    }
                }
                dVar2.f11335m = true;
            }
        }
    }

    public static void d(int i2, d dVar, f fVar, boolean z3) {
        float f6;
        float f7 = dVar.f11320d0;
        c cVar = dVar.f11296I;
        int d = cVar.f11287f.d();
        c cVar2 = dVar.f11298K;
        int d6 = cVar2.f11287f.d();
        int e6 = cVar.e() + d;
        int e7 = d6 - cVar2.e();
        if (d == d6) {
            f7 = 0.5f;
        } else {
            d = e6;
            d6 = e7;
        }
        int q6 = dVar.q();
        int i5 = (d6 - d) - q6;
        if (d > d6) {
            i5 = (d - d6) - q6;
        }
        if (i5 > 0) {
            f6 = (f7 * ((float) i5)) + 0.5f;
        } else {
            f6 = f7 * ((float) i5);
        }
        int i6 = ((int) f6) + d;
        int i7 = i6 + q6;
        if (d > d6) {
            i7 = i6 - q6;
        }
        dVar.J(i6, i7);
        c(i2 + 1, dVar, fVar, z3);
    }

    public static void e(int i2, d dVar, f fVar, d dVar2, boolean z3) {
        int i5;
        float f6 = dVar2.f11320d0;
        c cVar = dVar2.f11296I;
        int e6 = cVar.e() + cVar.f11287f.d();
        c cVar2 = dVar2.f11298K;
        int d = cVar2.f11287f.d() - cVar2.e();
        if (d >= e6) {
            int q6 = dVar2.q();
            if (dVar2.f11325g0 != 8) {
                int i6 = dVar2.f11344r;
                if (i6 == 2) {
                    if (dVar instanceof e) {
                        i5 = dVar.q();
                    } else {
                        i5 = dVar.f11307T.q();
                    }
                    q6 = (int) (dVar2.f11320d0 * 0.5f * ((float) i5));
                } else if (i6 == 0) {
                    q6 = d - e6;
                }
                q6 = Math.max(dVar2.f11347u, q6);
                int i7 = dVar2.f11348v;
                if (i7 > 0) {
                    q6 = Math.min(i7, q6);
                }
            }
            int i8 = e6 + ((int) ((f6 * ((float) ((d - e6) - q6))) + 0.5f));
            dVar2.J(i8, q6 + i8);
            c(i2 + 1, dVar2, fVar, z3);
        }
    }

    public static void f(int i2, d dVar, f fVar) {
        float f6;
        float f7 = dVar.f11322e0;
        c cVar = dVar.f11297J;
        int d = cVar.f11287f.d();
        c cVar2 = dVar.f11299L;
        int d6 = cVar2.f11287f.d();
        int e6 = cVar.e() + d;
        int e7 = d6 - cVar2.e();
        if (d == d6) {
            f7 = 0.5f;
        } else {
            d = e6;
            d6 = e7;
        }
        int k6 = dVar.k();
        int i5 = (d6 - d) - k6;
        if (d > d6) {
            i5 = (d - d6) - k6;
        }
        if (i5 > 0) {
            f6 = (f7 * ((float) i5)) + 0.5f;
        } else {
            f6 = f7 * ((float) i5);
        }
        int i6 = (int) f6;
        int i7 = d + i6;
        int i8 = i7 + k6;
        if (d > d6) {
            i7 = d - i6;
            i8 = i7 - k6;
        }
        dVar.K(i7, i8);
        i(i2 + 1, dVar, fVar);
    }

    public static void g(int i2, d dVar, f fVar, d dVar2) {
        int i5;
        float f6 = dVar2.f11322e0;
        c cVar = dVar2.f11297J;
        int e6 = cVar.e() + cVar.f11287f.d();
        c cVar2 = dVar2.f11299L;
        int d = cVar2.f11287f.d() - cVar2.e();
        if (d >= e6) {
            int k6 = dVar2.k();
            if (dVar2.f11325g0 != 8) {
                int i6 = dVar2.f11345s;
                if (i6 == 2) {
                    if (dVar instanceof e) {
                        i5 = dVar.k();
                    } else {
                        i5 = dVar.f11307T.k();
                    }
                    k6 = (int) (f6 * 0.5f * ((float) i5));
                } else if (i6 == 0) {
                    k6 = d - e6;
                }
                k6 = Math.max(dVar2.f11350x, k6);
                int i7 = dVar2.f11351y;
                if (i7 > 0) {
                    k6 = Math.min(i7, k6);
                }
            }
            int i8 = e6 + ((int) ((f6 * ((float) ((d - e6) - k6))) + 0.5f));
            dVar2.K(i8, k6 + i8);
            i(i2 + 1, dVar2, fVar);
        }
    }

    public static boolean h(int i2, int i5, int i6, int i7) {
        boolean z3;
        boolean z4;
        if (i6 == 1 || i6 == 2 || (i6 == 4 && i2 != 2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i7 == 1 || i7 == 2 || (i7 == 4 && i5 != 2)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 || z4) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r10v7, types: [t.b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v14, types: [t.b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v2, types: [t.b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v5, types: [t.b, java.lang.Object] */
    public static void i(int i2, d dVar, f fVar) {
        c cVar;
        boolean z3;
        c cVar2;
        c cVar3;
        boolean z4;
        c cVar4;
        c cVar5;
        d dVar2 = dVar;
        f fVar2 = fVar;
        if (!dVar2.f11337n) {
            if (!(dVar2 instanceof e) && dVar.z() && a(dVar)) {
                e.V(dVar2, fVar2, new Object());
            }
            c i5 = dVar2.i(3);
            c i6 = dVar2.i(5);
            int d = i5.d();
            int d6 = i6.d();
            HashSet hashSet = i5.f11283a;
            if (hashSet != null && i5.f11285c) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    c cVar6 = (c) it2.next();
                    d dVar3 = cVar6.d;
                    int i7 = i2 + 1;
                    boolean a6 = a(dVar3);
                    if (dVar3.z() && a6) {
                        e.V(dVar3, fVar2, new Object());
                    }
                    c cVar7 = dVar3.f11297J;
                    c cVar8 = dVar3.f11299L;
                    if ((cVar6 != cVar7 || (cVar5 = cVar8.f11287f) == null || !cVar5.f11285c) && (cVar6 != cVar8 || (cVar4 = cVar7.f11287f) == null || !cVar4.f11285c)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    int i8 = dVar3.f11342p0[1];
                    if (i8 != 3 || a6) {
                        if (!dVar3.z()) {
                            if (cVar6 == cVar7 && cVar8.f11287f == null) {
                                int e6 = cVar7.e() + d;
                                dVar3.K(e6, dVar3.k() + e6);
                                i(i7, dVar3, fVar2);
                            } else if (cVar6 == cVar8 && cVar7.f11287f == null) {
                                int e7 = d - cVar8.e();
                                dVar3.K(e7 - dVar3.k(), e7);
                                i(i7, dVar3, fVar2);
                            } else if (z4 && !dVar3.y()) {
                                f(i7, dVar3, fVar2);
                            }
                        }
                    } else if (i8 == 3 && dVar3.f11351y >= 0 && dVar3.f11350x >= 0) {
                        if ((dVar3.f11325g0 == 8 || (dVar3.f11345s == 0 && dVar3.f11310W == 0.0f)) && !dVar3.y() && !dVar3.F && z4 && !dVar3.y()) {
                            g(i7, dVar2, fVar2, dVar3);
                        }
                    }
                }
            }
            if (!(dVar2 instanceof s.h)) {
                HashSet hashSet2 = i6.f11283a;
                if (hashSet2 != null && i6.f11285c) {
                    Iterator it3 = hashSet2.iterator();
                    while (it3.hasNext()) {
                        c cVar9 = (c) it3.next();
                        d dVar4 = cVar9.d;
                        int i9 = i2 + 1;
                        boolean a7 = a(dVar4);
                        if (dVar4.z() && a7) {
                            e.V(dVar4, fVar2, new Object());
                        }
                        c cVar10 = dVar4.f11297J;
                        c cVar11 = dVar4.f11299L;
                        if ((cVar9 != cVar10 || (cVar3 = cVar11.f11287f) == null || !cVar3.f11285c) && (cVar9 != cVar11 || (cVar2 = cVar10.f11287f) == null || !cVar2.f11285c)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        int i10 = dVar4.f11342p0[1];
                        if (i10 != 3 || a7) {
                            if (!dVar4.z()) {
                                if (cVar9 == cVar10 && cVar11.f11287f == null) {
                                    int e8 = cVar10.e() + d6;
                                    dVar4.K(e8, dVar4.k() + e8);
                                    i(i9, dVar4, fVar2);
                                } else if (cVar9 == cVar11 && cVar10.f11287f == null) {
                                    int e9 = d6 - cVar11.e();
                                    dVar4.K(e9 - dVar4.k(), e9);
                                    i(i9, dVar4, fVar2);
                                } else if (z3 && !dVar4.y()) {
                                    f(i9, dVar4, fVar2);
                                }
                            }
                        } else if (i10 == 3 && dVar4.f11351y >= 0 && dVar4.f11350x >= 0) {
                            if (dVar4.f11325g0 != 8) {
                                if (dVar4.f11345s == 0) {
                                    if (dVar4.f11310W != 0.0f) {
                                    }
                                }
                            }
                            if (!dVar4.y() && !dVar4.F && z3 && !dVar4.y()) {
                                g(i9, dVar2, fVar2, dVar4);
                            }
                        }
                    }
                }
                c i11 = dVar2.i(6);
                if (i11.f11283a != null && i11.f11285c) {
                    int d7 = i11.d();
                    Iterator it4 = i11.f11283a.iterator();
                    while (it4.hasNext()) {
                        c cVar12 = (c) it4.next();
                        d dVar5 = cVar12.d;
                        int i12 = i2 + 1;
                        boolean a8 = a(dVar5);
                        if (dVar5.z() && a8) {
                            e.V(dVar5, fVar2, new Object());
                        }
                        if ((dVar5.f11342p0[1] != 3 || a8) && !dVar5.z() && cVar12 == (cVar = dVar5.f11300M)) {
                            int e10 = cVar12.e() + d7;
                            if (dVar5.f11293E) {
                                int i13 = e10 - dVar5.f11315a0;
                                int i14 = dVar5.f11309V + i13;
                                dVar5.f11313Z = i13;
                                dVar5.f11297J.l(i13);
                                dVar5.f11299L.l(i14);
                                cVar.l(e10);
                                dVar5.f11333l = true;
                            }
                            i(i12, dVar5, fVar2);
                        }
                    }
                }
                dVar2.f11337n = true;
            }
        }
    }
}
