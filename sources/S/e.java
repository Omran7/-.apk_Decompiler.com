package s;

import c1.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import q.C0926c;
import t.C0976b;
import v.f;

public final class e extends d {

    /* renamed from: A0  reason: collision with root package name */
    public int f11353A0;

    /* renamed from: B0  reason: collision with root package name */
    public b[] f11354B0;

    /* renamed from: C0  reason: collision with root package name */
    public b[] f11355C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f11356D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f11357E0;

    /* renamed from: F0  reason: collision with root package name */
    public boolean f11358F0;

    /* renamed from: G0  reason: collision with root package name */
    public WeakReference f11359G0;

    /* renamed from: H0  reason: collision with root package name */
    public WeakReference f11360H0;

    /* renamed from: I0  reason: collision with root package name */
    public WeakReference f11361I0;

    /* renamed from: J0  reason: collision with root package name */
    public WeakReference f11362J0;

    /* renamed from: K0  reason: collision with root package name */
    public final HashSet f11363K0;
    public final C0976b L0;

    /* renamed from: q0  reason: collision with root package name */
    public ArrayList f11364q0 = new ArrayList();

    /* renamed from: r0  reason: collision with root package name */
    public final i f11365r0 = new i(this);
    public final t.e s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f11366t0;

    /* renamed from: u0  reason: collision with root package name */
    public f f11367u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f11368v0;

    /* renamed from: w0  reason: collision with root package name */
    public final C0926c f11369w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f11370x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f11371y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f11372z0;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, t.e] */
    /* JADX WARNING: type inference failed for: r2v0, types: [t.b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [t.b, java.lang.Object] */
    public e() {
        ? obj = new Object();
        obj.f11577b = true;
        obj.f11578c = true;
        obj.f11579e = new ArrayList();
        new ArrayList();
        obj.f11580f = null;
        obj.g = new Object();
        obj.h = new ArrayList();
        obj.f11576a = this;
        obj.d = this;
        this.s0 = obj;
        this.f11367u0 = null;
        this.f11368v0 = false;
        this.f11369w0 = new C0926c();
        this.f11372z0 = 0;
        this.f11353A0 = 0;
        this.f11354B0 = new b[4];
        this.f11355C0 = new b[4];
        this.f11356D0 = 257;
        this.f11357E0 = false;
        this.f11358F0 = false;
        this.f11359G0 = null;
        this.f11360H0 = null;
        this.f11361I0 = null;
        this.f11362J0 = null;
        this.f11363K0 = new HashSet();
        this.L0 = new Object();
    }

    public static void V(d dVar, f fVar, C0976b bVar) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        int i5;
        if (fVar != null) {
            if (dVar.f11325g0 == 8 || (dVar instanceof h) || (dVar instanceof C0960a)) {
                bVar.f11570e = 0;
                bVar.f11571f = 0;
                return;
            }
            int[] iArr = dVar.f11342p0;
            bVar.f11567a = iArr[0];
            bVar.f11568b = iArr[1];
            bVar.f11569c = dVar.q();
            bVar.d = dVar.k();
            bVar.f11572i = false;
            bVar.f11573j = 0;
            if (bVar.f11567a == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVar.f11568b == 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z3 || dVar.f11310W <= 0.0f) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z4 || dVar.f11310W <= 0.0f) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (z3 && dVar.t(0) && dVar.f11344r == 0 && !z5) {
                bVar.f11567a = 2;
                if (z4 && dVar.f11345s == 0) {
                    bVar.f11567a = 1;
                }
                z3 = false;
            }
            if (z4 && dVar.t(1) && dVar.f11345s == 0 && !z6) {
                bVar.f11568b = 2;
                if (z3 && dVar.f11344r == 0) {
                    bVar.f11568b = 1;
                }
                z4 = false;
            }
            if (dVar.A()) {
                bVar.f11567a = 1;
                z3 = false;
            }
            if (dVar.B()) {
                bVar.f11568b = 1;
                z4 = false;
            }
            int[] iArr2 = dVar.f11346t;
            if (z5) {
                if (iArr2[0] == 4) {
                    bVar.f11567a = 1;
                } else if (!z4) {
                    if (bVar.f11568b == 1) {
                        i5 = bVar.d;
                    } else {
                        bVar.f11567a = 2;
                        fVar.b(dVar, bVar);
                        i5 = bVar.f11571f;
                    }
                    bVar.f11567a = 1;
                    bVar.f11569c = (int) (dVar.f11310W * ((float) i5));
                }
            }
            if (z6) {
                if (iArr2[1] == 4) {
                    bVar.f11568b = 1;
                } else if (!z3) {
                    if (bVar.f11567a == 1) {
                        i2 = bVar.f11569c;
                    } else {
                        bVar.f11568b = 2;
                        fVar.b(dVar, bVar);
                        i2 = bVar.f11570e;
                    }
                    bVar.f11568b = 1;
                    if (dVar.f11311X == -1) {
                        bVar.d = (int) (((float) i2) / dVar.f11310W);
                    } else {
                        bVar.d = (int) (dVar.f11310W * ((float) i2));
                    }
                }
            }
            fVar.b(dVar, bVar);
            dVar.O(bVar.f11570e);
            dVar.L(bVar.f11571f);
            dVar.f11293E = bVar.h;
            dVar.I(bVar.g);
            bVar.f11573j = 0;
        }
    }

    public final void C() {
        this.f11369w0.t();
        this.f11370x0 = 0;
        this.f11371y0 = 0;
        this.f11364q0.clear();
        super.C();
    }

    public final void F(i iVar) {
        super.F(iVar);
        int size = this.f11364q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((d) this.f11364q0.get(i2)).F(iVar);
        }
    }

    public final void P(boolean z3, boolean z4) {
        super.P(z3, z4);
        int size = this.f11364q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((d) this.f11364q0.get(i2)).P(z3, z4);
        }
    }

    public final void R(d dVar, int i2) {
        if (i2 == 0) {
            int i5 = this.f11372z0 + 1;
            b[] bVarArr = this.f11355C0;
            if (i5 >= bVarArr.length) {
                this.f11355C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.f11355C0;
            int i6 = this.f11372z0;
            bVarArr2[i6] = new b(dVar, 0, this.f11368v0);
            this.f11372z0 = i6 + 1;
        } else if (i2 == 1) {
            int i7 = this.f11353A0 + 1;
            b[] bVarArr3 = this.f11354B0;
            if (i7 >= bVarArr3.length) {
                this.f11354B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.f11354B0;
            int i8 = this.f11353A0;
            bVarArr4[i8] = new b(dVar, 1, this.f11368v0);
            this.f11353A0 = i8 + 1;
        }
    }

    public final void S(C0926c cVar) {
        int i2;
        boolean W5 = W(64);
        b(cVar, W5);
        int size = this.f11364q0.size();
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = (d) this.f11364q0.get(i5);
            boolean[] zArr = dVar.f11306S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof C0960a) {
                z3 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                d dVar2 = (d) this.f11364q0.get(i6);
                if (dVar2 instanceof C0960a) {
                    C0960a aVar = (C0960a) dVar2;
                    for (int i7 = 0; i7 < aVar.f11426r0; i7++) {
                        d dVar3 = aVar.f11425q0[i7];
                        if (aVar.f11266t0 || dVar3.c()) {
                            int i8 = aVar.s0;
                            if (i8 == 0 || i8 == 1) {
                                dVar3.f11306S[0] = true;
                            } else if (i8 == 2 || i8 == 3) {
                                dVar3.f11306S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f11363K0;
        hashSet.clear();
        for (int i9 = 0; i9 < size; i9++) {
            d dVar4 = (d) this.f11364q0.get(i9);
            dVar4.getClass();
            boolean z4 = dVar4 instanceof g;
            if (z4 || (dVar4 instanceof h)) {
                if (z4) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, W5);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it2 = hashSet.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                g gVar = (g) ((d) it2.next());
                int i10 = 0;
                while (true) {
                    if (i10 < gVar.f11426r0) {
                        if (hashSet.contains(gVar.f11425q0[i10])) {
                            gVar.b(cVar, W5);
                            hashSet.remove(gVar);
                            break;
                        }
                        i10++;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    ((d) it3.next()).b(cVar, W5);
                }
                hashSet.clear();
            }
        }
        if (C0926c.f11046q) {
            HashSet hashSet2 = new HashSet();
            for (int i11 = 0; i11 < size; i11++) {
                d dVar5 = (d) this.f11364q0.get(i11);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            if (this.f11342p0[0] == 2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            a(this, cVar, hashSet2, i2, false);
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                d dVar6 = (d) it4.next();
                j.b(this, cVar, dVar6);
                dVar6.b(cVar, W5);
            }
        } else {
            for (int i12 = 0; i12 < size; i12++) {
                d dVar7 = (d) this.f11364q0.get(i12);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f11342p0;
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    if (i13 == 2) {
                        dVar7.M(1);
                    }
                    if (i14 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(cVar, W5);
                    if (i13 == 2) {
                        dVar7.M(i13);
                    }
                    if (i14 == 2) {
                        dVar7.N(i14);
                    }
                } else {
                    j.b(this, cVar, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar, W5);
                    }
                }
            }
        }
        if (this.f11372z0 > 0) {
            j.a(this, cVar, (ArrayList) null, 0);
        }
        if (this.f11353A0 > 0) {
            j.a(this, cVar, (ArrayList) null, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0108 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean T(int r14, boolean r15) {
        /*
            r13 = this;
            t.e r0 = r13.s0
            s.e r1 = r0.f11576a
            r2 = 0
            int r3 = r1.j(r2)
            r4 = 1
            int r5 = r1.j(r4)
            int r6 = r1.r()
            int r7 = r1.s()
            java.util.ArrayList r8 = r0.f11579e
            if (r15 == 0) goto L_0x006f
            r9 = 2
            if (r3 == r9) goto L_0x001f
            if (r5 != r9) goto L_0x006f
        L_0x001f:
            java.util.Iterator r10 = r8.iterator()
        L_0x0023:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x003a
            java.lang.Object r11 = r10.next()
            t.o r11 = (t.o) r11
            int r12 = r11.f11606f
            if (r12 != r14) goto L_0x0023
            boolean r11 = r11.k()
            if (r11 != 0) goto L_0x0023
            r15 = r2
        L_0x003a:
            if (r14 != 0) goto L_0x0056
            if (r15 == 0) goto L_0x006f
            if (r3 != r9) goto L_0x006f
            r1.M(r4)
            int r15 = r0.d(r1, r2)
            r1.O(r15)
            t.k r15 = r1.d
            t.g r15 = r15.f11605e
            int r9 = r1.q()
            r15.d(r9)
            goto L_0x006f
        L_0x0056:
            if (r15 == 0) goto L_0x006f
            if (r5 != r9) goto L_0x006f
            r1.N(r4)
            int r15 = r0.d(r1, r4)
            r1.L(r15)
            t.m r15 = r1.f11321e
            t.g r15 = r15.f11605e
            int r9 = r1.k()
            r15.d(r9)
        L_0x006f:
            int[] r15 = r1.f11342p0
            r9 = 4
            if (r14 != 0) goto L_0x0090
            r15 = r15[r2]
            if (r15 == r4) goto L_0x007a
            if (r15 != r9) goto L_0x0097
        L_0x007a:
            int r15 = r1.q()
            int r15 = r15 + r6
            t.k r7 = r1.d
            t.f r7 = r7.f11607i
            r7.d(r15)
            t.k r7 = r1.d
            t.g r7 = r7.f11605e
            int r15 = r15 - r6
            r7.d(r15)
        L_0x008e:
            r15 = r4
            goto L_0x00ae
        L_0x0090:
            r15 = r15[r4]
            if (r15 == r4) goto L_0x0099
            if (r15 != r9) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r15 = r2
            goto L_0x00ae
        L_0x0099:
            int r15 = r1.k()
            int r15 = r15 + r7
            t.m r6 = r1.f11321e
            t.f r6 = r6.f11607i
            r6.d(r15)
            t.m r6 = r1.f11321e
            t.g r6 = r6.f11605e
            int r15 = r15 - r7
            r6.d(r15)
            goto L_0x008e
        L_0x00ae:
            r0.g()
            java.util.Iterator r0 = r8.iterator()
        L_0x00b5:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x00d3
            java.lang.Object r6 = r0.next()
            t.o r6 = (t.o) r6
            int r7 = r6.f11606f
            if (r7 == r14) goto L_0x00c6
            goto L_0x00b5
        L_0x00c6:
            s.d r7 = r6.f11603b
            if (r7 != r1) goto L_0x00cf
            boolean r7 = r6.g
            if (r7 != 0) goto L_0x00cf
            goto L_0x00b5
        L_0x00cf:
            r6.e()
            goto L_0x00b5
        L_0x00d3:
            java.util.Iterator r0 = r8.iterator()
        L_0x00d7:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0108
            java.lang.Object r6 = r0.next()
            t.o r6 = (t.o) r6
            int r7 = r6.f11606f
            if (r7 == r14) goto L_0x00e8
            goto L_0x00d7
        L_0x00e8:
            if (r15 != 0) goto L_0x00ef
            s.d r7 = r6.f11603b
            if (r7 != r1) goto L_0x00ef
            goto L_0x00d7
        L_0x00ef:
            t.f r7 = r6.h
            boolean r7 = r7.f11587j
            if (r7 != 0) goto L_0x00f6
            goto L_0x0109
        L_0x00f6:
            t.f r7 = r6.f11607i
            boolean r7 = r7.f11587j
            if (r7 != 0) goto L_0x00fd
            goto L_0x0109
        L_0x00fd:
            boolean r7 = r6 instanceof t.C0977c
            if (r7 != 0) goto L_0x00d7
            t.g r6 = r6.f11605e
            boolean r6 = r6.f11587j
            if (r6 != 0) goto L_0x00d7
            goto L_0x0109
        L_0x0108:
            r2 = r4
        L_0x0109:
            r1.M(r3)
            r1.N(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.T(int, boolean):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: int[]} */
    /* JADX WARNING: type inference failed for: r6v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r5v52, types: [t.b, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02a3, code lost:
        r27 = r0;
        r26 = r3;
        r25 = r7;
        r28 = r8;
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x060f, code lost:
        r5 = r21;
        r4 = r25;
        r3 = r27;
        r2 = r28;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x05db  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x061a  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0633  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0639  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x064f  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0668  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x066a  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0688  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x068a  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0694  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x06b1  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0719 A[SYNTHETIC, Splitter:B:433:0x0719] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x073f A[SYNTHETIC, Splitter:B:440:0x073f] */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0772 A[Catch:{ Exception -> 0x0797 }] */
    /* JADX WARNING: Removed duplicated region for block: B:474:0x079b A[Catch:{ Exception -> 0x078f }] */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x07c0  */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x07fd  */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x0824 A[LOOP:34: B:501:0x0822->B:502:0x0824, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x088a  */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x0896  */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x08a9  */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x08b2  */
    /* JADX WARNING: Removed duplicated region for block: B:521:0x08b6  */
    /* JADX WARNING: Removed duplicated region for block: B:534:0x08ed  */
    /* JADX WARNING: Removed duplicated region for block: B:536:0x08f1  */
    /* JADX WARNING: Removed duplicated region for block: B:540:0x08fe  */
    /* JADX WARNING: Removed duplicated region for block: B:632:0x08f2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U() {
        /*
            r31 = this;
            r1 = r31
            r2 = 0
            r1.f11312Y = r2
            r1.f11313Z = r2
            r1.f11357E0 = r2
            r1.f11358F0 = r2
            java.util.ArrayList r0 = r1.f11364q0
            int r3 = r0.size()
            int r0 = r31.q()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r31.k()
            int r4 = java.lang.Math.max(r2, r4)
            int[] r5 = r1.f11342p0
            r6 = 1
            r7 = r5[r6]
            r8 = r5[r2]
            int r9 = r1.f11366t0
            s.c r10 = r1.f11297J
            s.c r11 = r1.f11296I
            if (r9 != 0) goto L_0x0254
            int r9 = r1.f11356D0
            boolean r9 = s.j.c(r9, r6)
            if (r9 == 0) goto L_0x0254
            v.f r9 = r1.f11367u0
            r14 = r5[r2]
            r15 = r5[r6]
            r31.E()
            java.util.ArrayList r12 = r1.f11364q0
            int r13 = r12.size()
        L_0x0047:
            if (r2 >= r13) goto L_0x0055
            java.lang.Object r18 = r12.get(r2)
            s.d r18 = (s.d) r18
            r18.E()
            int r2 = r2 + 1
            goto L_0x0047
        L_0x0055:
            boolean r2 = r1.f11368v0
            if (r14 != r6) goto L_0x0062
            int r14 = r31.q()
            r6 = 0
            r1.J(r6, r14)
            goto L_0x0068
        L_0x0062:
            r6 = 0
            r11.l(r6)
            r1.f11312Y = r6
        L_0x0068:
            r6 = 0
            r14 = 0
            r19 = 0
        L_0x006c:
            r20 = 1056964608(0x3f000000, float:0.5)
            if (r6 >= r13) goto L_0x00d6
            java.lang.Object r21 = r12.get(r6)
            r22 = r11
            r11 = r21
            s.d r11 = (s.d) r11
            r21 = r4
            boolean r4 = r11 instanceof s.h
            if (r4 == 0) goto L_0x00bd
            s.h r11 = (s.h) r11
            int r4 = r11.f11423u0
            r23 = r5
            r5 = 1
            if (r4 != r5) goto L_0x00cd
            int r4 = r11.f11421r0
            r5 = -1
            if (r4 == r5) goto L_0x0092
            r11.R(r4)
            goto L_0x00bb
        L_0x0092:
            int r4 = r11.s0
            if (r4 == r5) goto L_0x00a7
            boolean r4 = r31.A()
            if (r4 == 0) goto L_0x00a7
            int r4 = r31.q()
            int r5 = r11.s0
            int r4 = r4 - r5
            r11.R(r4)
            goto L_0x00bb
        L_0x00a7:
            boolean r4 = r31.A()
            if (r4 == 0) goto L_0x00bb
            float r4 = r11.f11420q0
            int r5 = r31.q()
            float r5 = (float) r5
            float r4 = r4 * r5
            float r4 = r4 + r20
            int r4 = (int) r4
            r11.R(r4)
        L_0x00bb:
            r14 = 1
            goto L_0x00cd
        L_0x00bd:
            r23 = r5
            boolean r4 = r11 instanceof s.C0960a
            if (r4 == 0) goto L_0x00cd
            s.a r11 = (s.C0960a) r11
            int r4 = r11.U()
            if (r4 != 0) goto L_0x00cd
            r19 = 1
        L_0x00cd:
            int r6 = r6 + 1
            r4 = r21
            r11 = r22
            r5 = r23
            goto L_0x006c
        L_0x00d6:
            r21 = r4
            r23 = r5
            r22 = r11
            if (r14 == 0) goto L_0x00fb
            r4 = 0
        L_0x00df:
            if (r4 >= r13) goto L_0x00fb
            java.lang.Object r5 = r12.get(r4)
            s.d r5 = (s.d) r5
            boolean r6 = r5 instanceof s.h
            if (r6 == 0) goto L_0x00f7
            s.h r5 = (s.h) r5
            int r6 = r5.f11423u0
            r11 = 1
            if (r6 != r11) goto L_0x00f7
            r6 = 0
            t.h.c(r6, r5, r9, r2)
            goto L_0x00f8
        L_0x00f7:
            r6 = 0
        L_0x00f8:
            int r4 = r4 + 1
            goto L_0x00df
        L_0x00fb:
            r6 = 0
            t.h.c(r6, r1, r9, r2)
            if (r19 == 0) goto L_0x0125
            r4 = 0
        L_0x0102:
            if (r4 >= r13) goto L_0x0125
            java.lang.Object r5 = r12.get(r4)
            s.d r5 = (s.d) r5
            boolean r6 = r5 instanceof s.C0960a
            if (r6 == 0) goto L_0x0121
            s.a r5 = (s.C0960a) r5
            int r6 = r5.U()
            if (r6 != 0) goto L_0x0121
            boolean r6 = r5.T()
            if (r6 == 0) goto L_0x0121
            r6 = 1
            t.h.c(r6, r5, r9, r2)
            goto L_0x0122
        L_0x0121:
            r6 = 1
        L_0x0122:
            int r4 = r4 + 1
            goto L_0x0102
        L_0x0125:
            r6 = 1
            if (r15 != r6) goto L_0x0131
            int r4 = r31.k()
            r5 = 0
            r1.K(r5, r4)
            goto L_0x0137
        L_0x0131:
            r5 = 0
            r10.l(r5)
            r1.f11313Z = r5
        L_0x0137:
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x013a:
            if (r4 >= r13) goto L_0x0191
            java.lang.Object r11 = r12.get(r4)
            s.d r11 = (s.d) r11
            boolean r14 = r11 instanceof s.h
            if (r14 == 0) goto L_0x0180
            s.h r11 = (s.h) r11
            int r14 = r11.f11423u0
            if (r14 != 0) goto L_0x018e
            int r5 = r11.f11421r0
            r14 = -1
            if (r5 == r14) goto L_0x0155
            r11.R(r5)
            goto L_0x017e
        L_0x0155:
            int r5 = r11.s0
            if (r5 == r14) goto L_0x016a
            boolean r5 = r31.B()
            if (r5 == 0) goto L_0x016a
            int r5 = r31.k()
            int r14 = r11.s0
            int r5 = r5 - r14
            r11.R(r5)
            goto L_0x017e
        L_0x016a:
            boolean r5 = r31.B()
            if (r5 == 0) goto L_0x017e
            float r5 = r11.f11420q0
            int r14 = r31.k()
            float r14 = (float) r14
            float r5 = r5 * r14
            float r5 = r5 + r20
            int r5 = (int) r5
            r11.R(r5)
        L_0x017e:
            r5 = 1
            goto L_0x018e
        L_0x0180:
            boolean r14 = r11 instanceof s.C0960a
            if (r14 == 0) goto L_0x018e
            s.a r11 = (s.C0960a) r11
            int r11 = r11.U()
            r14 = 1
            if (r11 != r14) goto L_0x018e
            r6 = 1
        L_0x018e:
            int r4 = r4 + 1
            goto L_0x013a
        L_0x0191:
            if (r5 == 0) goto L_0x01ad
            r4 = 0
        L_0x0194:
            if (r4 >= r13) goto L_0x01ad
            java.lang.Object r5 = r12.get(r4)
            s.d r5 = (s.d) r5
            boolean r11 = r5 instanceof s.h
            if (r11 == 0) goto L_0x01aa
            s.h r5 = (s.h) r5
            int r11 = r5.f11423u0
            if (r11 != 0) goto L_0x01aa
            r11 = 1
            t.h.i(r11, r5, r9)
        L_0x01aa:
            int r4 = r4 + 1
            goto L_0x0194
        L_0x01ad:
            r4 = 0
            t.h.i(r4, r1, r9)
            if (r6 == 0) goto L_0x01d5
            r4 = 0
        L_0x01b4:
            if (r4 >= r13) goto L_0x01d5
            java.lang.Object r5 = r12.get(r4)
            s.d r5 = (s.d) r5
            boolean r6 = r5 instanceof s.C0960a
            if (r6 == 0) goto L_0x01d2
            s.a r5 = (s.C0960a) r5
            int r6 = r5.U()
            r11 = 1
            if (r6 != r11) goto L_0x01d2
            boolean r6 = r5.T()
            if (r6 == 0) goto L_0x01d2
            t.h.i(r11, r5, r9)
        L_0x01d2:
            int r4 = r4 + 1
            goto L_0x01b4
        L_0x01d5:
            r4 = 0
        L_0x01d6:
            if (r4 >= r13) goto L_0x020e
            java.lang.Object r5 = r12.get(r4)
            s.d r5 = (s.d) r5
            boolean r6 = r5.z()
            if (r6 == 0) goto L_0x020b
            boolean r6 = t.h.a(r5)
            if (r6 == 0) goto L_0x020b
            t.b r6 = t.h.f11591a
            V(r5, r9, r6)
            boolean r6 = r5 instanceof s.h
            if (r6 == 0) goto L_0x0204
            r6 = r5
            s.h r6 = (s.h) r6
            int r6 = r6.f11423u0
            if (r6 != 0) goto L_0x01ff
            r6 = 0
            t.h.i(r6, r5, r9)
            goto L_0x020b
        L_0x01ff:
            r6 = 0
            t.h.c(r6, r5, r9, r2)
            goto L_0x020b
        L_0x0204:
            r6 = 0
            t.h.c(r6, r5, r9, r2)
            t.h.i(r6, r5, r9)
        L_0x020b:
            int r4 = r4 + 1
            goto L_0x01d6
        L_0x020e:
            r2 = 0
        L_0x020f:
            if (r2 >= r3) goto L_0x025a
            java.util.ArrayList r4 = r1.f11364q0
            java.lang.Object r4 = r4.get(r2)
            s.d r4 = (s.d) r4
            boolean r5 = r4.z()
            if (r5 == 0) goto L_0x0251
            boolean r5 = r4 instanceof s.h
            if (r5 != 0) goto L_0x0251
            boolean r5 = r4 instanceof s.C0960a
            if (r5 != 0) goto L_0x0251
            boolean r5 = r4 instanceof s.g
            if (r5 != 0) goto L_0x0251
            boolean r5 = r4.F
            if (r5 != 0) goto L_0x0251
            r5 = 0
            int r6 = r4.j(r5)
            r5 = 1
            int r9 = r4.j(r5)
            r11 = 3
            if (r6 != r11) goto L_0x0247
            int r6 = r4.f11344r
            if (r6 == r5) goto L_0x0247
            if (r9 != r11) goto L_0x0247
            int r6 = r4.f11345s
            if (r6 == r5) goto L_0x0247
            goto L_0x0251
        L_0x0247:
            t.b r5 = new t.b
            r5.<init>()
            v.f r6 = r1.f11367u0
            V(r4, r6, r5)
        L_0x0251:
            int r2 = r2 + 1
            goto L_0x020f
        L_0x0254:
            r21 = r4
            r23 = r5
            r22 = r11
        L_0x025a:
            q.c r2 = r1.f11369w0
            r5 = 2
            if (r3 <= r5) goto L_0x0264
            if (r8 == r5) goto L_0x0273
            if (r7 != r5) goto L_0x0264
            goto L_0x0273
        L_0x0264:
            r26 = r3
            r4 = r7
            r24 = r10
            r5 = r21
            r3 = r0
            r30 = r8
            r8 = r2
            r2 = r30
            goto L_0x0656
        L_0x0273:
            int r9 = r1.f11356D0
            r11 = 1024(0x400, float:1.435E-42)
            boolean r9 = s.j.c(r9, r11)
            if (r9 == 0) goto L_0x0264
            v.f r9 = r1.f11367u0
            java.util.ArrayList r11 = r1.f11364q0
            int r12 = r11.size()
            r13 = 0
        L_0x0286:
            if (r13 >= r12) goto L_0x02b9
            java.lang.Object r14 = r11.get(r13)
            s.d r14 = (s.d) r14
            r15 = 0
            r6 = r23[r15]
            r18 = 1
            r5 = r23[r18]
            int[] r4 = r14.f11342p0
            r24 = r10
            r10 = r4[r15]
            r4 = r4[r18]
            boolean r4 = t.h.h(r6, r5, r10, r4)
            if (r4 != 0) goto L_0x02ae
        L_0x02a3:
            r27 = r0
            r26 = r3
            r25 = r7
            r28 = r8
            r8 = r2
            goto L_0x060f
        L_0x02ae:
            boolean r4 = r14 instanceof s.g
            if (r4 == 0) goto L_0x02b3
            goto L_0x02a3
        L_0x02b3:
            int r13 = r13 + 1
            r10 = r24
            r5 = 2
            goto L_0x0286
        L_0x02b9:
            r24 = r10
            r4 = 0
            r5 = 0
            r6 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x02c2:
            if (r4 >= r12) goto L_0x03a3
            java.lang.Object r25 = r11.get(r4)
            r26 = r3
            r3 = r25
            s.d r3 = (s.d) r3
            r25 = r7
            r17 = 0
            r7 = r23[r17]
            r27 = r0
            r18 = 1
            r0 = r23[r18]
            r28 = r8
            int[] r8 = r3.f11342p0
            r29 = r2
            r2 = r8[r17]
            r8 = r8[r18]
            boolean r0 = t.h.h(r7, r0, r2, r8)
            if (r0 != 0) goto L_0x02ef
            t.b r0 = r1.L0
            V(r3, r9, r0)
        L_0x02ef:
            boolean r0 = r3 instanceof s.h
            if (r0 == 0) goto L_0x0313
            r2 = r3
            s.h r2 = (s.h) r2
            int r7 = r2.f11423u0
            if (r7 != 0) goto L_0x0304
            if (r10 != 0) goto L_0x0301
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0301:
            r10.add(r2)
        L_0x0304:
            int r7 = r2.f11423u0
            r8 = 1
            if (r7 != r8) goto L_0x0313
            if (r5 != 0) goto L_0x0310
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0310:
            r5.add(r2)
        L_0x0313:
            boolean r2 = r3 instanceof s.i
            if (r2 == 0) goto L_0x0357
            boolean r2 = r3 instanceof s.C0960a
            if (r2 == 0) goto L_0x0340
            r2 = r3
            s.a r2 = (s.C0960a) r2
            int r7 = r2.U()
            if (r7 != 0) goto L_0x032e
            if (r6 != 0) goto L_0x032b
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x032b:
            r6.add(r2)
        L_0x032e:
            int r7 = r2.U()
            r8 = 1
            if (r7 != r8) goto L_0x0357
            if (r13 != 0) goto L_0x033c
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x033c:
            r13.add(r2)
            goto L_0x0357
        L_0x0340:
            r2 = r3
            s.i r2 = (s.i) r2
            if (r6 != 0) goto L_0x034a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x034a:
            r6.add(r2)
            if (r13 != 0) goto L_0x0354
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x0354:
            r13.add(r2)
        L_0x0357:
            s.c r2 = r3.f11296I
            s.c r2 = r2.f11287f
            if (r2 != 0) goto L_0x0373
            s.c r2 = r3.f11298K
            s.c r2 = r2.f11287f
            if (r2 != 0) goto L_0x0373
            if (r0 != 0) goto L_0x0373
            boolean r2 = r3 instanceof s.C0960a
            if (r2 != 0) goto L_0x0373
            if (r14 != 0) goto L_0x0370
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0370:
            r14.add(r3)
        L_0x0373:
            s.c r2 = r3.f11297J
            s.c r2 = r2.f11287f
            if (r2 != 0) goto L_0x0395
            s.c r2 = r3.f11299L
            s.c r2 = r2.f11287f
            if (r2 != 0) goto L_0x0395
            s.c r2 = r3.f11300M
            s.c r2 = r2.f11287f
            if (r2 != 0) goto L_0x0395
            if (r0 != 0) goto L_0x0395
            boolean r0 = r3 instanceof s.C0960a
            if (r0 != 0) goto L_0x0395
            if (r15 != 0) goto L_0x0392
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x0392:
            r15.add(r3)
        L_0x0395:
            int r4 = r4 + 1
            r7 = r25
            r3 = r26
            r0 = r27
            r8 = r28
            r2 = r29
            goto L_0x02c2
        L_0x03a3:
            r27 = r0
            r29 = r2
            r26 = r3
            r25 = r7
            r28 = r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r5 == 0) goto L_0x03ca
            java.util.Iterator r2 = r5.iterator()
        L_0x03b8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03ca
            java.lang.Object r3 = r2.next()
            s.h r3 = (s.h) r3
            r4 = 0
            r5 = 0
            t.h.b(r3, r4, r0, r5)
            goto L_0x03b8
        L_0x03ca:
            r4 = 0
            r5 = 0
            if (r6 == 0) goto L_0x03eb
            java.util.Iterator r2 = r6.iterator()
        L_0x03d2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03eb
            java.lang.Object r3 = r2.next()
            s.i r3 = (s.i) r3
            t.n r6 = t.h.b(r3, r4, r0, r5)
            r3.R(r4, r0, r6)
            r6.a(r0)
            r4 = 0
            r5 = 0
            goto L_0x03d2
        L_0x03eb:
            r2 = 2
            s.c r3 = r1.i(r2)
            java.util.HashSet r2 = r3.f11283a
            if (r2 == 0) goto L_0x040c
            java.util.Iterator r2 = r2.iterator()
        L_0x03f8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x040c
            java.lang.Object r3 = r2.next()
            s.c r3 = (s.c) r3
            s.d r3 = r3.d
            r4 = 0
            r5 = 0
            t.h.b(r3, r4, r0, r5)
            goto L_0x03f8
        L_0x040c:
            r2 = 4
            s.c r2 = r1.i(r2)
            java.util.HashSet r2 = r2.f11283a
            if (r2 == 0) goto L_0x042d
            java.util.Iterator r2 = r2.iterator()
        L_0x0419:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x042d
            java.lang.Object r3 = r2.next()
            s.c r3 = (s.c) r3
            s.d r3 = r3.d
            r4 = 0
            r5 = 0
            t.h.b(r3, r4, r0, r5)
            goto L_0x0419
        L_0x042d:
            r2 = 7
            s.c r3 = r1.i(r2)
            java.util.HashSet r3 = r3.f11283a
            if (r3 == 0) goto L_0x044e
            java.util.Iterator r3 = r3.iterator()
        L_0x043a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x044e
            java.lang.Object r4 = r3.next()
            s.c r4 = (s.c) r4
            s.d r4 = r4.d
            r5 = 0
            r6 = 0
            t.h.b(r4, r5, r0, r6)
            goto L_0x043a
        L_0x044e:
            r5 = 0
            r6 = 0
            if (r14 == 0) goto L_0x0466
            java.util.Iterator r3 = r14.iterator()
        L_0x0456:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0466
            java.lang.Object r4 = r3.next()
            s.d r4 = (s.d) r4
            t.h.b(r4, r5, r0, r6)
            goto L_0x0456
        L_0x0466:
            if (r10 == 0) goto L_0x047d
            java.util.Iterator r3 = r10.iterator()
        L_0x046c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x047d
            java.lang.Object r4 = r3.next()
            s.h r4 = (s.h) r4
            r5 = 1
            t.h.b(r4, r5, r0, r6)
            goto L_0x046c
        L_0x047d:
            r5 = 1
            if (r13 == 0) goto L_0x049d
            java.util.Iterator r3 = r13.iterator()
        L_0x0484:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x049d
            java.lang.Object r4 = r3.next()
            s.i r4 = (s.i) r4
            t.n r7 = t.h.b(r4, r5, r0, r6)
            r4.R(r5, r0, r7)
            r7.a(r0)
            r5 = 1
            r6 = 0
            goto L_0x0484
        L_0x049d:
            r3 = 3
            s.c r4 = r1.i(r3)
            java.util.HashSet r3 = r4.f11283a
            if (r3 == 0) goto L_0x04be
            java.util.Iterator r3 = r3.iterator()
        L_0x04aa:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04be
            java.lang.Object r4 = r3.next()
            s.c r4 = (s.c) r4
            s.d r4 = r4.d
            r5 = 1
            r6 = 0
            t.h.b(r4, r5, r0, r6)
            goto L_0x04aa
        L_0x04be:
            r3 = 6
            s.c r3 = r1.i(r3)
            java.util.HashSet r3 = r3.f11283a
            if (r3 == 0) goto L_0x04df
            java.util.Iterator r3 = r3.iterator()
        L_0x04cb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04df
            java.lang.Object r4 = r3.next()
            s.c r4 = (s.c) r4
            s.d r4 = r4.d
            r5 = 1
            r6 = 0
            t.h.b(r4, r5, r0, r6)
            goto L_0x04cb
        L_0x04df:
            r3 = 5
            s.c r4 = r1.i(r3)
            java.util.HashSet r3 = r4.f11283a
            if (r3 == 0) goto L_0x0500
            java.util.Iterator r3 = r3.iterator()
        L_0x04ec:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0500
            java.lang.Object r4 = r3.next()
            s.c r4 = (s.c) r4
            s.d r4 = r4.d
            r5 = 1
            r6 = 0
            t.h.b(r4, r5, r0, r6)
            goto L_0x04ec
        L_0x0500:
            s.c r2 = r1.i(r2)
            java.util.HashSet r2 = r2.f11283a
            if (r2 == 0) goto L_0x0520
            java.util.Iterator r2 = r2.iterator()
        L_0x050c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0520
            java.lang.Object r3 = r2.next()
            s.c r3 = (s.c) r3
            s.d r3 = r3.d
            r4 = 1
            r5 = 0
            t.h.b(r3, r4, r0, r5)
            goto L_0x050c
        L_0x0520:
            r4 = 1
            r5 = 0
            if (r15 == 0) goto L_0x0538
            java.util.Iterator r2 = r15.iterator()
        L_0x0528:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0538
            java.lang.Object r3 = r2.next()
            s.d r3 = (s.d) r3
            t.h.b(r3, r4, r0, r5)
            goto L_0x0528
        L_0x0538:
            r2 = 0
        L_0x0539:
            if (r2 >= r12) goto L_0x058f
            java.lang.Object r3 = r11.get(r2)
            s.d r3 = (s.d) r3
            int[] r4 = r3.f11342p0
            r5 = 0
            r6 = r4[r5]
            r5 = 3
            if (r6 != r5) goto L_0x058c
            r6 = 1
            r4 = r4[r6]
            if (r4 != r5) goto L_0x058c
            int r4 = r3.f11338n0
            int r6 = r0.size()
            r7 = 0
        L_0x0555:
            if (r7 >= r6) goto L_0x0565
            java.lang.Object r8 = r0.get(r7)
            t.n r8 = (t.n) r8
            int r9 = r8.f11599b
            if (r4 != r9) goto L_0x0562
            goto L_0x0566
        L_0x0562:
            int r7 = r7 + 1
            goto L_0x0555
        L_0x0565:
            r8 = 0
        L_0x0566:
            int r3 = r3.f11340o0
            int r4 = r0.size()
            r6 = 0
        L_0x056d:
            if (r6 >= r4) goto L_0x057d
            java.lang.Object r7 = r0.get(r6)
            t.n r7 = (t.n) r7
            int r9 = r7.f11599b
            if (r3 != r9) goto L_0x057a
            goto L_0x057e
        L_0x057a:
            int r6 = r6 + 1
            goto L_0x056d
        L_0x057d:
            r7 = 0
        L_0x057e:
            if (r8 == 0) goto L_0x058c
            if (r7 == 0) goto L_0x058c
            r3 = 0
            r8.c(r3, r7)
            r3 = 2
            r7.f11600c = r3
            r0.remove(r8)
        L_0x058c:
            int r2 = r2 + 1
            goto L_0x0539
        L_0x058f:
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L_0x059a
            r8 = r29
            goto L_0x060f
        L_0x059a:
            r2 = 0
            r3 = r23[r2]
            r2 = 2
            if (r3 != r2) goto L_0x05d2
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
            r4 = 0
        L_0x05a6:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x05c6
            java.lang.Object r5 = r2.next()
            t.n r5 = (t.n) r5
            int r6 = r5.f11600c
            r7 = 1
            if (r6 != r7) goto L_0x05b8
            goto L_0x05a6
        L_0x05b8:
            r8 = r29
            r6 = 0
            int r9 = r5.b(r8, r6)
            if (r9 <= r3) goto L_0x05c3
            r4 = r5
            r3 = r9
        L_0x05c3:
            r29 = r8
            goto L_0x05a6
        L_0x05c6:
            r8 = r29
            r7 = 1
            if (r4 == 0) goto L_0x05d5
            r1.M(r7)
            r1.O(r3)
            goto L_0x05d6
        L_0x05d2:
            r8 = r29
            r7 = 1
        L_0x05d5:
            r4 = 0
        L_0x05d6:
            r2 = r23[r7]
            r3 = 2
            if (r2 != r3) goto L_0x0606
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L_0x05e1:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05fc
            java.lang.Object r5 = r0.next()
            t.n r5 = (t.n) r5
            int r6 = r5.f11600c
            if (r6 != 0) goto L_0x05f2
            goto L_0x05e1
        L_0x05f2:
            r6 = 1
            int r7 = r5.b(r8, r6)
            if (r7 <= r2) goto L_0x05e1
            r3 = r5
            r2 = r7
            goto L_0x05e1
        L_0x05fc:
            r6 = 1
            if (r3 == 0) goto L_0x0606
            r1.N(r6)
            r1.L(r2)
            goto L_0x0607
        L_0x0606:
            r3 = 0
        L_0x0607:
            if (r4 != 0) goto L_0x060b
            if (r3 == 0) goto L_0x060f
        L_0x060b:
            r2 = r28
            r3 = 2
            goto L_0x0618
        L_0x060f:
            r5 = r21
            r4 = r25
            r3 = r27
            r2 = r28
            goto L_0x0656
        L_0x0618:
            if (r2 != r3) goto L_0x0633
            int r0 = r31.q()
            r3 = r27
            if (r3 >= r0) goto L_0x062b
            if (r3 <= 0) goto L_0x062b
            r1.O(r3)
            r4 = 1
            r1.f11357E0 = r4
            goto L_0x0635
        L_0x062b:
            int r0 = r31.q()
        L_0x062f:
            r4 = r25
            r3 = 2
            goto L_0x0637
        L_0x0633:
            r3 = r27
        L_0x0635:
            r0 = r3
            goto L_0x062f
        L_0x0637:
            if (r4 != r3) goto L_0x064f
            int r3 = r31.k()
            r5 = r21
            if (r5 >= r3) goto L_0x064a
            if (r5 <= 0) goto L_0x064a
            r1.L(r5)
            r3 = 1
            r1.f11358F0 = r3
            goto L_0x0651
        L_0x064a:
            int r3 = r31.k()
            goto L_0x0652
        L_0x064f:
            r5 = r21
        L_0x0651:
            r3 = r5
        L_0x0652:
            r5 = r3
            r3 = r0
            r0 = 1
            goto L_0x0657
        L_0x0656:
            r0 = 0
        L_0x0657:
            r6 = 64
            boolean r7 = r1.W(r6)
            if (r7 != 0) goto L_0x066a
            r7 = 128(0x80, float:1.794E-43)
            boolean r7 = r1.W(r7)
            if (r7 == 0) goto L_0x0668
            goto L_0x066a
        L_0x0668:
            r7 = 0
            goto L_0x066b
        L_0x066a:
            r7 = 1
        L_0x066b:
            r8.getClass()
            r9 = 0
            r8.h = r9
            int r10 = r1.f11356D0
            if (r10 == 0) goto L_0x067b
            if (r7 == 0) goto L_0x067b
            r7 = 1
            r8.h = r7
            goto L_0x067c
        L_0x067b:
            r7 = 1
        L_0x067c:
            java.util.ArrayList r10 = r1.f11364q0
            r11 = r23[r9]
            r12 = 2
            if (r11 == r12) goto L_0x068a
            r11 = r23[r7]
            if (r11 != r12) goto L_0x0688
            goto L_0x068a
        L_0x0688:
            r7 = r9
            goto L_0x068b
        L_0x068a:
            r7 = 1
        L_0x068b:
            r1.f11372z0 = r9
            r1.f11353A0 = r9
            r11 = r26
            r9 = 0
        L_0x0692:
            if (r9 >= r11) goto L_0x06a8
            java.util.ArrayList r12 = r1.f11364q0
            java.lang.Object r12 = r12.get(r9)
            s.d r12 = (s.d) r12
            boolean r13 = r12 instanceof s.e
            if (r13 == 0) goto L_0x06a5
            s.e r12 = (s.e) r12
            r12.U()
        L_0x06a5:
            int r9 = r9 + 1
            goto L_0x0692
        L_0x06a8:
            boolean r9 = r1.W(r6)
            r12 = r0
            r0 = 0
            r13 = 1
        L_0x06af:
            if (r13 == 0) goto L_0x08f8
            r14 = 1
            int r15 = r0 + 1
            r8.t()     // Catch:{ Exception -> 0x06d0 }
            r14 = 0
            r1.f11372z0 = r14     // Catch:{ Exception -> 0x06d0 }
            r1.f11353A0 = r14     // Catch:{ Exception -> 0x06d0 }
            r1.g(r8)     // Catch:{ Exception -> 0x06d0 }
            r0 = 0
        L_0x06c0:
            if (r0 >= r11) goto L_0x06d7
            java.util.ArrayList r14 = r1.f11364q0     // Catch:{ Exception -> 0x06d0 }
            java.lang.Object r14 = r14.get(r0)     // Catch:{ Exception -> 0x06d0 }
            s.d r14 = (s.d) r14     // Catch:{ Exception -> 0x06d0 }
            r14.g(r8)     // Catch:{ Exception -> 0x06d0 }
            int r0 = r0 + 1
            goto L_0x06c0
        L_0x06d0:
            r0 = move-exception
            r21 = r12
            r6 = 0
        L_0x06d4:
            r14 = 5
            goto L_0x07a6
        L_0x06d7:
            r1.S(r8)     // Catch:{ Exception -> 0x06d0 }
            java.lang.ref.WeakReference r0 = r1.f11359G0     // Catch:{ Exception -> 0x07a2 }
            if (r0 == 0) goto L_0x0713
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x070f }
            if (r0 == 0) goto L_0x0713
            java.lang.ref.WeakReference r0 = r1.f11359G0     // Catch:{ Exception -> 0x070f }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x070f }
            s.c r0 = (s.c) r0     // Catch:{ Exception -> 0x070f }
            r14 = r24
            q.f r13 = r8.k(r14)     // Catch:{ Exception -> 0x0709 }
            q.c r6 = r1.f11369w0     // Catch:{ Exception -> 0x0709 }
            q.f r0 = r6.k(r0)     // Catch:{ Exception -> 0x0709 }
            r21 = r12
            r24 = r14
            r12 = 5
            r14 = 0
            r6.f(r0, r13, r14, r12)     // Catch:{ Exception -> 0x0705 }
            r6 = 0
            r1.f11359G0 = r6     // Catch:{ Exception -> 0x0705 }
            goto L_0x0715
        L_0x0705:
            r0 = move-exception
        L_0x0706:
            r6 = 0
            r13 = 1
            goto L_0x06d4
        L_0x0709:
            r0 = move-exception
            r21 = r12
            r24 = r14
            goto L_0x0706
        L_0x070f:
            r0 = move-exception
            r21 = r12
            goto L_0x0706
        L_0x0713:
            r21 = r12
        L_0x0715:
            java.lang.ref.WeakReference r0 = r1.f11361I0     // Catch:{ Exception -> 0x0797 }
            if (r0 == 0) goto L_0x073b
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0705 }
            if (r0 == 0) goto L_0x073b
            java.lang.ref.WeakReference r0 = r1.f11361I0     // Catch:{ Exception -> 0x0705 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0705 }
            s.c r0 = (s.c) r0     // Catch:{ Exception -> 0x0705 }
            s.c r6 = r1.f11299L     // Catch:{ Exception -> 0x0705 }
            q.f r6 = r8.k(r6)     // Catch:{ Exception -> 0x0705 }
            q.c r12 = r1.f11369w0     // Catch:{ Exception -> 0x0705 }
            q.f r0 = r12.k(r0)     // Catch:{ Exception -> 0x0705 }
            r13 = 0
            r14 = 5
            r12.f(r6, r0, r13, r14)     // Catch:{ Exception -> 0x0705 }
            r6 = 0
            r1.f11361I0 = r6     // Catch:{ Exception -> 0x0705 }
        L_0x073b:
            java.lang.ref.WeakReference r0 = r1.f11360H0     // Catch:{ Exception -> 0x0797 }
            if (r0 == 0) goto L_0x0768
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0705 }
            if (r0 == 0) goto L_0x0768
            java.lang.ref.WeakReference r0 = r1.f11360H0     // Catch:{ Exception -> 0x0705 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0705 }
            s.c r0 = (s.c) r0     // Catch:{ Exception -> 0x0705 }
            r6 = r22
            q.f r12 = r8.k(r6)     // Catch:{ Exception -> 0x0764 }
            q.c r13 = r1.f11369w0     // Catch:{ Exception -> 0x0764 }
            q.f r0 = r13.k(r0)     // Catch:{ Exception -> 0x0764 }
            r22 = r6
            r6 = 5
            r14 = 0
            r13.f(r0, r12, r14, r6)     // Catch:{ Exception -> 0x0705 }
            r6 = 0
            r1.f11360H0 = r6     // Catch:{ Exception -> 0x0705 }
            goto L_0x0768
        L_0x0764:
            r0 = move-exception
            r22 = r6
            goto L_0x0706
        L_0x0768:
            java.lang.ref.WeakReference r0 = r1.f11362J0     // Catch:{ Exception -> 0x0797 }
            if (r0 == 0) goto L_0x079b
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0797 }
            if (r0 == 0) goto L_0x079b
            java.lang.ref.WeakReference r0 = r1.f11362J0     // Catch:{ Exception -> 0x0797 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0797 }
            s.c r0 = (s.c) r0     // Catch:{ Exception -> 0x0797 }
            s.c r6 = r1.f11298K     // Catch:{ Exception -> 0x0797 }
            q.f r6 = r8.k(r6)     // Catch:{ Exception -> 0x0797 }
            q.c r12 = r1.f11369w0     // Catch:{ Exception -> 0x0795 }
            q.f r0 = r12.k(r0)     // Catch:{ Exception -> 0x0795 }
            r13 = 0
            r14 = 5
            r12.f(r6, r0, r13, r14)     // Catch:{ Exception -> 0x0792 }
            r6 = 0
            r1.f11362J0 = r6     // Catch:{ Exception -> 0x078f }
            goto L_0x079d
        L_0x078f:
            r0 = move-exception
        L_0x0790:
            r13 = 1
            goto L_0x07a6
        L_0x0792:
            r0 = move-exception
            r6 = 0
            goto L_0x0790
        L_0x0795:
            r0 = move-exception
            goto L_0x0798
        L_0x0797:
            r0 = move-exception
        L_0x0798:
            r6 = 0
            r14 = 5
            goto L_0x0790
        L_0x079b:
            r6 = 0
            r14 = 5
        L_0x079d:
            r8.p()     // Catch:{ Exception -> 0x078f }
            r13 = 1
            goto L_0x07bc
        L_0x07a2:
            r0 = move-exception
            r21 = r12
            goto L_0x0798
        L_0x07a6:
            r0.printStackTrace()
            java.io.PrintStream r12 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r14 = "EXCEPTION : "
            r6.<init>(r14)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r12.println(r0)
        L_0x07bc:
            boolean[] r0 = s.j.f11427a
            if (r13 == 0) goto L_0x07fd
            r6 = 0
            r12 = 2
            r0[r12] = r6
            r6 = 64
            boolean r12 = r1.W(r6)
            r1.Q(r8, r12)
            java.util.ArrayList r13 = r1.f11364q0
            int r13 = r13.size()
            r14 = 0
            r16 = 0
        L_0x07d6:
            if (r14 >= r13) goto L_0x07fb
            java.util.ArrayList r6 = r1.f11364q0
            java.lang.Object r6 = r6.get(r14)
            s.d r6 = (s.d) r6
            r6.Q(r8, r12)
            r26 = r12
            int r12 = r6.h
            r27 = r13
            r13 = -1
            if (r12 != r13) goto L_0x07f0
            int r6 = r6.f11327i
            if (r6 == r13) goto L_0x07f2
        L_0x07f0:
            r16 = 1
        L_0x07f2:
            int r14 = r14 + 1
            r12 = r26
            r13 = r27
            r6 = 64
            goto L_0x07d6
        L_0x07fb:
            r13 = -1
            goto L_0x0814
        L_0x07fd:
            r13 = -1
            r1.Q(r8, r9)
            r6 = 0
        L_0x0802:
            if (r6 >= r11) goto L_0x0812
            java.util.ArrayList r12 = r1.f11364q0
            java.lang.Object r12 = r12.get(r6)
            s.d r12 = (s.d) r12
            r12.Q(r8, r9)
            int r6 = r6 + 1
            goto L_0x0802
        L_0x0812:
            r16 = 0
        L_0x0814:
            r6 = 8
            if (r7 == 0) goto L_0x087a
            if (r15 >= r6) goto L_0x087a
            r12 = 2
            boolean r0 = r0[r12]
            if (r0 == 0) goto L_0x087a
            r0 = 0
            r12 = 0
            r14 = 0
        L_0x0822:
            if (r0 >= r11) goto L_0x0849
            java.util.ArrayList r13 = r1.f11364q0
            java.lang.Object r13 = r13.get(r0)
            s.d r13 = (s.d) r13
            int r6 = r13.f11312Y
            int r27 = r13.q()
            int r6 = r27 + r6
            int r12 = java.lang.Math.max(r12, r6)
            int r6 = r13.f11313Z
            int r13 = r13.k()
            int r13 = r13 + r6
            int r14 = java.lang.Math.max(r14, r13)
            int r0 = r0 + 1
            r6 = 8
            r13 = -1
            goto L_0x0822
        L_0x0849:
            int r0 = r1.f11317b0
            int r0 = java.lang.Math.max(r0, r12)
            int r6 = r1.f11319c0
            int r6 = java.lang.Math.max(r6, r14)
            r12 = 2
            if (r2 != r12) goto L_0x0868
            int r13 = r31.q()
            if (r13 >= r0) goto L_0x0868
            r1.O(r0)
            r13 = 0
            r23[r13] = r12
            r16 = 1
            r21 = 1
        L_0x0868:
            if (r4 != r12) goto L_0x087a
            int r0 = r31.k()
            if (r0 >= r6) goto L_0x087a
            r1.L(r6)
            r6 = 1
            r23[r6] = r12
            r16 = 1
            r21 = 1
        L_0x087a:
            int r0 = r1.f11317b0
            int r6 = r31.q()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r31.q()
            if (r0 <= r6) goto L_0x0896
            r1.O(r0)
            r6 = 1
            r12 = 0
            r23[r12] = r6
            r16 = r6
            r18 = r16
            goto L_0x0899
        L_0x0896:
            r6 = 1
            r18 = r21
        L_0x0899:
            int r0 = r1.f11319c0
            int r12 = r31.k()
            int r0 = java.lang.Math.max(r0, r12)
            int r12 = r31.k()
            if (r0 <= r12) goto L_0x08b2
            r1.L(r0)
            r23[r6] = r6
            r0 = r6
            r16 = r0
            goto L_0x08b4
        L_0x08b2:
            r0 = r18
        L_0x08b4:
            if (r0 != 0) goto L_0x08ed
            r12 = 0
            r13 = r23[r12]
            r14 = 2
            if (r13 != r14) goto L_0x08ce
            if (r3 <= 0) goto L_0x08ce
            int r13 = r31.q()
            if (r13 <= r3) goto L_0x08ce
            r1.f11357E0 = r6
            r23[r12] = r6
            r1.O(r3)
            r0 = r6
            r16 = r0
        L_0x08ce:
            r12 = r23[r6]
            r13 = 2
            if (r12 != r13) goto L_0x08e7
            if (r5 <= 0) goto L_0x08e7
            int r12 = r31.k()
            if (r12 <= r5) goto L_0x08e7
            r1.f11358F0 = r6
            r23[r6] = r6
            r1.L(r5)
            r0 = 8
            r6 = 1
            r12 = 1
            goto L_0x08ef
        L_0x08e7:
            r12 = r0
            r6 = r16
            r0 = 8
            goto L_0x08ef
        L_0x08ed:
            r13 = 2
            goto L_0x08e7
        L_0x08ef:
            if (r15 <= r0) goto L_0x08f2
            r6 = 0
        L_0x08f2:
            r13 = r6
            r0 = r15
            r6 = 64
            goto L_0x06af
        L_0x08f8:
            r21 = r12
            r1.f11364q0 = r10
            if (r21 == 0) goto L_0x0904
            r3 = 0
            r23[r3] = r2
            r2 = 1
            r23[r2] = r4
        L_0x0904:
            c1.i r0 = r8.f11056m
            r1.F(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.U():void");
    }

    public final boolean W(int i2) {
        if ((this.f11356D0 & i2) == i2) {
            return true;
        }
        return false;
    }

    public final void n(StringBuilder sb) {
        sb.append(this.f11329j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f11308U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f11309V);
        sb.append("\n");
        Iterator it2 = this.f11364q0.iterator();
        while (it2.hasNext()) {
            ((d) it2.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
