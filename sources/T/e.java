package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.c;
import s.d;
import s.h;
import s.i;
import v.f;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public s.e f11576a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11577b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11578c;
    public s.e d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f11579e;

    /* renamed from: f  reason: collision with root package name */
    public f f11580f;
    public C0976b g;
    public ArrayList h;

    /* JADX WARNING: type inference failed for: r10v2, types: [t.l, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(t.f r7, int r8, java.util.ArrayList r9, t.l r10) {
        /*
            r6 = this;
            t.o r7 = r7.d
            t.l r0 = r7.f11604c
            if (r0 != 0) goto L_0x00df
            s.e r0 = r6.f11576a
            t.k r1 = r0.d
            if (r7 == r1) goto L_0x00df
            t.m r0 = r0.f11321e
            if (r7 != r0) goto L_0x0012
            goto L_0x00df
        L_0x0012:
            if (r10 != 0) goto L_0x0028
            t.l r10 = new t.l
            r10.<init>()
            r0 = 0
            r10.f11593a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f11594b = r0
            r10.f11593a = r7
            r9.add(r10)
        L_0x0028:
            r7.f11604c = r10
            java.util.ArrayList r0 = r10.f11594b
            r0.add(r7)
            t.f r0 = r7.h
            java.util.ArrayList r1 = r0.f11588k
            java.util.Iterator r1 = r1.iterator()
        L_0x0037:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004d
            java.lang.Object r2 = r1.next()
            t.d r2 = (t.d) r2
            boolean r3 = r2 instanceof t.f
            if (r3 == 0) goto L_0x0037
            t.f r2 = (t.f) r2
            r6.a(r2, r8, r9, r10)
            goto L_0x0037
        L_0x004d:
            t.f r1 = r7.f11607i
            java.util.ArrayList r2 = r1.f11588k
            java.util.Iterator r2 = r2.iterator()
        L_0x0055:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r2.next()
            t.d r3 = (t.d) r3
            boolean r4 = r3 instanceof t.f
            if (r4 == 0) goto L_0x0055
            t.f r3 = (t.f) r3
            r6.a(r3, r8, r9, r10)
            goto L_0x0055
        L_0x006b:
            r2 = 1
            if (r8 != r2) goto L_0x0093
            boolean r3 = r7 instanceof t.m
            if (r3 == 0) goto L_0x0093
            r3 = r7
            t.m r3 = (t.m) r3
            t.f r3 = r3.f11595k
            java.util.ArrayList r3 = r3.f11588k
            java.util.Iterator r3 = r3.iterator()
        L_0x007d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0093
            java.lang.Object r4 = r3.next()
            t.d r4 = (t.d) r4
            boolean r5 = r4 instanceof t.f
            if (r5 == 0) goto L_0x007d
            t.f r4 = (t.f) r4
            r6.a(r4, r8, r9, r10)
            goto L_0x007d
        L_0x0093:
            java.util.ArrayList r0 = r0.f11589l
            java.util.Iterator r0 = r0.iterator()
        L_0x0099:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00a9
            java.lang.Object r3 = r0.next()
            t.f r3 = (t.f) r3
            r6.a(r3, r8, r9, r10)
            goto L_0x0099
        L_0x00a9:
            java.util.ArrayList r0 = r1.f11589l
            java.util.Iterator r0 = r0.iterator()
        L_0x00af:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00bf
            java.lang.Object r1 = r0.next()
            t.f r1 = (t.f) r1
            r6.a(r1, r8, r9, r10)
            goto L_0x00af
        L_0x00bf:
            if (r8 != r2) goto L_0x00df
            boolean r0 = r7 instanceof t.m
            if (r0 == 0) goto L_0x00df
            t.m r7 = (t.m) r7
            t.f r7 = r7.f11595k
            java.util.ArrayList r7 = r7.f11589l
            java.util.Iterator r7 = r7.iterator()
        L_0x00cf:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r0 = r7.next()
            t.f r0 = (t.f) r0
            r6.a(r0, r8, r9, r10)
            goto L_0x00cf
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.a(t.f, int, java.util.ArrayList, t.l):void");
    }

    public final void b(s.e eVar) {
        int i2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        s.e eVar2 = eVar;
        Iterator it2 = eVar2.f11364q0.iterator();
        while (it2.hasNext()) {
            d dVar = (d) it2.next();
            int[] iArr = dVar.f11342p0;
            int i11 = iArr[0];
            int i12 = iArr[1];
            if (dVar.f11325g0 == 8) {
                dVar.f11314a = true;
            } else {
                float f6 = dVar.f11349w;
                if (f6 < 1.0f && i11 == 3) {
                    dVar.f11344r = 2;
                }
                float f7 = dVar.f11352z;
                if (f7 < 1.0f && i12 == 3) {
                    dVar.f11345s = 2;
                }
                if (dVar.f11310W > 0.0f) {
                    if (i11 == 3 && (i12 == 2 || i12 == 1)) {
                        dVar.f11344r = 3;
                    } else if (i12 == 3 && (i11 == 2 || i11 == 1)) {
                        dVar.f11345s = 3;
                    } else if (i11 == 3 && i12 == 3) {
                        if (dVar.f11344r == 0) {
                            dVar.f11344r = 3;
                        }
                        if (dVar.f11345s == 0) {
                            dVar.f11345s = 3;
                        }
                    }
                }
                c cVar = dVar.f11298K;
                c cVar2 = dVar.f11296I;
                if (i11 == 3 && dVar.f11344r == 1 && (cVar2.f11287f == null || cVar.f11287f == null)) {
                    i11 = 2;
                }
                c cVar3 = dVar.f11299L;
                c cVar4 = dVar.f11297J;
                if (i12 == 3 && dVar.f11345s == 1 && (cVar4.f11287f == null || cVar3.f11287f == null)) {
                    i2 = 2;
                } else {
                    i2 = i12;
                }
                k kVar = dVar.d;
                kVar.d = i11;
                int i13 = dVar.f11344r;
                kVar.f11602a = i13;
                m mVar = dVar.f11321e;
                mVar.d = i2;
                int i14 = dVar.f11345s;
                mVar.f11602a = i14;
                if ((i11 == 4 || i11 == 1 || i11 == 2) && (i2 == 4 || i2 == 1 || i2 == 2)) {
                    int q6 = dVar.q();
                    if (i11 == 4) {
                        i8 = (eVar.q() - cVar2.g) - cVar.g;
                        i11 = 1;
                    } else {
                        i8 = q6;
                    }
                    int k6 = dVar.k();
                    if (i2 == 4) {
                        i9 = (eVar.k() - cVar4.g) - cVar3.g;
                        i10 = 1;
                    } else {
                        i9 = k6;
                        i10 = i2;
                    }
                    f(i11, i8, i10, i9, dVar);
                    dVar.d.f11605e.d(dVar.q());
                    dVar.f11321e.f11605e.d(dVar.k());
                    dVar.f11314a = true;
                } else {
                    int[] iArr2 = eVar2.f11342p0;
                    c[] cVarArr = dVar.f11304Q;
                    if (i11 != 3 || (i2 != 2 && i2 != 1)) {
                        i5 = 3;
                    } else if (i13 == 3) {
                        if (i2 == 2) {
                            f(2, 0, 2, 0, dVar);
                        }
                        int k7 = dVar.k();
                        f(1, (int) ((((float) k7) * dVar.f11310W) + 0.5f), 1, k7, dVar);
                        dVar.d.f11605e.d(dVar.q());
                        dVar.f11321e.f11605e.d(dVar.k());
                        dVar.f11314a = true;
                    } else if (i13 == 1) {
                        f(2, 0, i2, 0, dVar);
                        dVar.d.f11605e.f11590m = dVar.q();
                    } else {
                        if (i13 == 2) {
                            int i15 = iArr2[0];
                            if (i15 == 1 || i15 == 4) {
                                f(1, (int) ((f6 * ((float) eVar.q())) + 0.5f), i2, dVar.k(), dVar);
                                dVar.d.f11605e.d(dVar.q());
                                dVar.f11321e.f11605e.d(dVar.k());
                                dVar.f11314a = true;
                            }
                        } else if (cVarArr[0].f11287f == null || cVarArr[1].f11287f == null) {
                            f(2, 0, i2, 0, dVar);
                            dVar.d.f11605e.d(dVar.q());
                            dVar.f11321e.f11605e.d(dVar.k());
                            dVar.f11314a = true;
                        }
                        i5 = 3;
                    }
                    if (i2 == i5) {
                        if (i11 != 2 && i11 != 1) {
                            i6 = i5;
                            i7 = 1;
                            if (i11 == i6 && i2 == i6) {
                                if (i13 != i7 || i14 == i7) {
                                    f(2, 0, 2, 0, dVar);
                                    dVar.d.f11605e.f11590m = dVar.q();
                                    dVar.f11321e.f11605e.f11590m = dVar.k();
                                } else if (i14 == 2 && i13 == 2 && iArr2[0] == 1 && iArr2[i7] == 1) {
                                    f(1, (int) ((f6 * ((float) eVar.q())) + 0.5f), 1, (int) ((f7 * ((float) eVar.k())) + 0.5f), dVar);
                                    dVar.d.f11605e.d(dVar.q());
                                    dVar.f11321e.f11605e.d(dVar.k());
                                    dVar.f11314a = true;
                                }
                            }
                        } else if (i14 == i5) {
                            if (i11 == 2) {
                                f(2, 0, 2, 0, dVar);
                            }
                            int q7 = dVar.q();
                            float f8 = dVar.f11310W;
                            if (dVar.f11311X == -1) {
                                f8 = 1.0f / f8;
                            }
                            f(1, q7, 1, (int) ((((float) q7) * f8) + 0.5f), dVar);
                            dVar.d.f11605e.d(dVar.q());
                            dVar.f11321e.f11605e.d(dVar.k());
                            dVar.f11314a = true;
                        } else if (i14 == 1) {
                            f(i11, 0, 2, 0, dVar);
                            dVar.f11321e.f11605e.f11590m = dVar.k();
                        } else if (i14 == 2) {
                            int i16 = iArr2[1];
                            if (i16 == 1 || i16 == 4) {
                                f(i11, dVar.q(), 1, (int) ((f7 * ((float) eVar.k())) + 0.5f), dVar);
                                dVar.d.f11605e.d(dVar.q());
                                dVar.f11321e.f11605e.d(dVar.k());
                                dVar.f11314a = true;
                            }
                        } else if (cVarArr[2].f11287f == null || cVarArr[3].f11287f == null) {
                            f(2, 0, i2, 0, dVar);
                            dVar.d.f11605e.d(dVar.q());
                            dVar.f11321e.f11605e.d(dVar.k());
                            dVar.f11314a = true;
                        }
                    }
                    i7 = 1;
                    i6 = 3;
                    if (i13 != i7) {
                    }
                    f(2, 0, 2, 0, dVar);
                    dVar.d.f11605e.f11590m = dVar.q();
                    dVar.f11321e.f11605e.f11590m = dVar.k();
                }
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.f11579e;
        arrayList.clear();
        s.e eVar = this.d;
        eVar.d.f();
        eVar.f11321e.f();
        arrayList.add(eVar.d);
        arrayList.add(eVar.f11321e);
        Iterator it2 = eVar.f11364q0.iterator();
        HashSet hashSet = null;
        while (it2.hasNext()) {
            d dVar = (d) it2.next();
            if (dVar instanceof h) {
                o oVar = new o(dVar);
                dVar.d.f();
                dVar.f11321e.f();
                oVar.f11606f = ((h) dVar).f11423u0;
                arrayList.add(oVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f11316b == null) {
                        dVar.f11316b = new C0977c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f11316b);
                } else {
                    arrayList.add(dVar.d);
                }
                if (dVar.y()) {
                    if (dVar.f11318c == null) {
                        dVar.f11318c = new C0977c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f11318c);
                } else {
                    arrayList.add(dVar.f11321e);
                }
                if (dVar instanceof i) {
                    arrayList.add(new o(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((o) it3.next()).f();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            o oVar2 = (o) it4.next();
            if (oVar2.f11603b != eVar) {
                oVar2.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        s.e eVar2 = this.f11576a;
        e(eVar2.d, 0, arrayList2);
        e(eVar2.f11321e, 1, arrayList2);
        this.f11577b = false;
    }

    public final int d(s.e eVar, int i2) {
        ArrayList arrayList;
        int i5;
        int i6;
        long j6;
        o oVar;
        o oVar2;
        float f6;
        long j7;
        s.e eVar2 = eVar;
        int i7 = i2;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i8 = 0;
        long j8 = 0;
        while (i8 < size) {
            o oVar3 = ((l) arrayList2.get(i8)).f11593a;
            if (!(oVar3 instanceof C0977c) ? i7 != 0 ? (oVar3 instanceof m) : (oVar3 instanceof k) : ((C0977c) oVar3).f11606f == i7) {
                if (i7 == 0) {
                    oVar = eVar2.d;
                } else {
                    oVar = eVar2.f11321e;
                }
                f fVar = oVar.h;
                if (i7 == 0) {
                    oVar2 = eVar2.d;
                } else {
                    oVar2 = eVar2.f11321e;
                }
                f fVar2 = oVar2.f11607i;
                boolean contains = oVar3.h.f11589l.contains(fVar);
                f fVar3 = oVar3.f11607i;
                boolean contains2 = fVar3.f11589l.contains(fVar2);
                long j9 = oVar3.j();
                f fVar4 = oVar3.h;
                if (!contains || !contains2) {
                    arrayList = arrayList2;
                    i6 = size;
                    i5 = i8;
                    if (contains) {
                        j6 = Math.max(l.b(fVar4, (long) fVar4.f11585f), ((long) fVar4.f11585f) + j9);
                    } else if (contains2) {
                        j6 = Math.max(-l.a(fVar3, (long) fVar3.f11585f), ((long) (-fVar3.f11585f)) + j9);
                    } else {
                        j6 = (oVar3.j() + ((long) fVar4.f11585f)) - ((long) fVar3.f11585f);
                    }
                } else {
                    long b6 = l.b(fVar4, 0);
                    ArrayList arrayList3 = arrayList2;
                    i6 = size;
                    long a6 = l.a(fVar3, 0);
                    long j10 = b6 - j9;
                    int i9 = fVar3.f11585f;
                    arrayList = arrayList3;
                    i5 = i8;
                    if (j10 >= ((long) (-i9))) {
                        j10 += (long) i9;
                    }
                    long j11 = (long) fVar4.f11585f;
                    long j12 = ((-a6) - j9) - j11;
                    if (j12 >= j11) {
                        j12 -= j11;
                    }
                    d dVar = oVar3.f11603b;
                    if (i7 == 0) {
                        f6 = dVar.f11320d0;
                    } else if (i7 == 1) {
                        f6 = dVar.f11322e0;
                    } else {
                        dVar.getClass();
                        f6 = -1.0f;
                    }
                    if (f6 > 0.0f) {
                        j7 = (long) ((((float) j10) / (1.0f - f6)) + (((float) j12) / f6));
                    } else {
                        j7 = 0;
                    }
                    float f7 = (float) j7;
                    j6 = (((long) fVar4.f11585f) + ((((long) ((f7 * f6) + 0.5f)) + j9) + ((long) o3.d.a(1.0f, f6, f7, 0.5f)))) - ((long) fVar3.f11585f);
                }
            } else {
                arrayList = arrayList2;
                i6 = size;
                i5 = i8;
                j6 = 0;
            }
            j8 = Math.max(j8, j6);
            i8 = i5 + 1;
            eVar2 = eVar;
            size = i6;
            arrayList2 = arrayList;
        }
        return (int) j8;
    }

    public final void e(o oVar, int i2, ArrayList arrayList) {
        f fVar;
        Iterator it2 = oVar.h.f11588k.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            fVar = oVar.f11607i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it2.next();
            if (dVar instanceof f) {
                a((f) dVar, i2, arrayList, (l) null);
            } else if (dVar instanceof o) {
                a(((o) dVar).h, i2, arrayList, (l) null);
            }
        }
        Iterator it3 = fVar.f11588k.iterator();
        while (it3.hasNext()) {
            d dVar2 = (d) it3.next();
            if (dVar2 instanceof f) {
                a((f) dVar2, i2, arrayList, (l) null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).f11607i, i2, arrayList, (l) null);
            }
        }
        if (i2 == 1) {
            Iterator it4 = ((m) oVar).f11595k.f11588k.iterator();
            while (it4.hasNext()) {
                d dVar3 = (d) it4.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i2, arrayList, (l) null);
                }
            }
        }
    }

    public final void f(int i2, int i5, int i6, int i7, d dVar) {
        C0976b bVar = this.g;
        bVar.f11567a = i2;
        bVar.f11568b = i6;
        bVar.f11569c = i5;
        bVar.d = i7;
        this.f11580f.b(dVar, bVar);
        dVar.O(bVar.f11570e);
        dVar.L(bVar.f11571f);
        dVar.f11293E = bVar.h;
        dVar.I(bVar.g);
    }

    public final void g() {
        boolean z3;
        C0975a aVar;
        Iterator it2 = this.f11576a.f11364q0.iterator();
        while (it2.hasNext()) {
            d dVar = (d) it2.next();
            if (!dVar.f11314a) {
                int[] iArr = dVar.f11342p0;
                boolean z4 = false;
                int i2 = iArr[0];
                int i5 = iArr[1];
                int i6 = dVar.f11344r;
                int i7 = dVar.f11345s;
                if (i2 == 2 || (i2 == 3 && i6 == 1)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i5 == 2 || (i5 == 3 && i7 == 1)) {
                    z4 = true;
                }
                g gVar = dVar.d.f11605e;
                boolean z5 = gVar.f11587j;
                g gVar2 = dVar.f11321e.f11605e;
                boolean z6 = gVar2.f11587j;
                if (z5 && z6) {
                    f(1, gVar.g, 1, gVar2.g, dVar);
                    dVar.f11314a = true;
                } else if (z5 && z4) {
                    f(1, gVar.g, 2, gVar2.g, dVar);
                    if (i5 == 3) {
                        dVar.f11321e.f11605e.f11590m = dVar.k();
                    } else {
                        dVar.f11321e.f11605e.d(dVar.k());
                        dVar.f11314a = true;
                    }
                } else if (z6 && z3) {
                    f(2, gVar.g, 1, gVar2.g, dVar);
                    if (i2 == 3) {
                        dVar.d.f11605e.f11590m = dVar.q();
                    } else {
                        dVar.d.f11605e.d(dVar.q());
                        dVar.f11314a = true;
                    }
                }
                if (dVar.f11314a && (aVar = dVar.f11321e.f11596l) != null) {
                    aVar.d(dVar.f11315a0);
                }
            }
        }
    }
}
