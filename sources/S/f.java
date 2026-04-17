package s;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f11373a;

    /* renamed from: b  reason: collision with root package name */
    public d f11374b = null;

    /* renamed from: c  reason: collision with root package name */
    public int f11375c = 0;
    public c d;

    /* renamed from: e  reason: collision with root package name */
    public c f11376e;

    /* renamed from: f  reason: collision with root package name */
    public c f11377f;
    public c g;
    public int h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f11378i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f11379j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f11380k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f11381l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f11382m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f11383n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f11384o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f11385p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f11386q = 0;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ g f11387r;

    public f(g gVar, int i2, c cVar, c cVar2, c cVar3, c cVar4, int i5) {
        this.f11387r = gVar;
        this.f11373a = i2;
        this.d = cVar;
        this.f11376e = cVar2;
        this.f11377f = cVar3;
        this.g = cVar4;
        this.h = gVar.f11416w0;
        this.f11378i = gVar.s0;
        this.f11379j = gVar.f11417x0;
        this.f11380k = gVar.f11413t0;
        this.f11386q = i5;
    }

    public final void a(d dVar) {
        int i2 = this.f11373a;
        int i5 = 0;
        g gVar = this.f11387r;
        if (i2 == 0) {
            int U5 = gVar.U(dVar, this.f11386q);
            if (dVar.f11342p0[0] == 3) {
                this.f11385p++;
                U5 = 0;
            }
            int i6 = gVar.f11401P0;
            if (dVar.f11325g0 != 8) {
                i5 = i6;
            }
            this.f11381l = U5 + i5 + this.f11381l;
            int T5 = gVar.T(dVar, this.f11386q);
            if (this.f11374b == null || this.f11375c < T5) {
                this.f11374b = dVar;
                this.f11375c = T5;
                this.f11382m = T5;
            }
        } else {
            int U6 = gVar.U(dVar, this.f11386q);
            int T6 = gVar.T(dVar, this.f11386q);
            if (dVar.f11342p0[1] == 3) {
                this.f11385p++;
                T6 = 0;
            }
            int i7 = gVar.f11402Q0;
            if (dVar.f11325g0 != 8) {
                i5 = i7;
            }
            this.f11382m = T6 + i5 + this.f11382m;
            if (this.f11374b == null || this.f11375c < U6) {
                this.f11374b = dVar;
                this.f11375c = U6;
                this.f11381l = U6;
            }
        }
        this.f11384o++;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r21, boolean r22, boolean r23) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.f11384o
            r2 = 0
            r3 = r2
        L_0x0006:
            s.g r4 = r0.f11387r
            if (r3 >= r1) goto L_0x001e
            int r5 = r0.f11383n
            int r5 = r5 + r3
            int r6 = r4.f11412b1
            if (r5 < r6) goto L_0x0012
            goto L_0x001e
        L_0x0012:
            s.d[] r4 = r4.f11411a1
            r4 = r4[r5]
            if (r4 == 0) goto L_0x001b
            r4.D()
        L_0x001b:
            int r3 = r3 + 1
            goto L_0x0006
        L_0x001e:
            if (r1 == 0) goto L_0x02d0
            s.d r3 = r0.f11374b
            if (r3 != 0) goto L_0x0026
            goto L_0x02d0
        L_0x0026:
            if (r23 == 0) goto L_0x002c
            if (r21 != 0) goto L_0x002c
            r5 = 1
            goto L_0x002d
        L_0x002c:
            r5 = r2
        L_0x002d:
            r6 = -1
            r7 = r2
            r8 = r6
            r9 = r8
        L_0x0031:
            if (r7 >= r1) goto L_0x0053
            if (r22 == 0) goto L_0x0039
            int r10 = r1 + -1
            int r10 = r10 - r7
            goto L_0x003a
        L_0x0039:
            r10 = r7
        L_0x003a:
            int r11 = r0.f11383n
            int r11 = r11 + r10
            int r10 = r4.f11412b1
            if (r11 < r10) goto L_0x0042
            goto L_0x0053
        L_0x0042:
            s.d[] r10 = r4.f11411a1
            r10 = r10[r11]
            if (r10 == 0) goto L_0x0050
            int r10 = r10.f11325g0
            if (r10 != 0) goto L_0x0050
            if (r8 != r6) goto L_0x004f
            r8 = r7
        L_0x004f:
            r9 = r7
        L_0x0050:
            int r7 = r7 + 1
            goto L_0x0031
        L_0x0053:
            int r7 = r0.f11373a
            if (r7 != 0) goto L_0x01ad
            s.d r7 = r0.f11374b
            int r11 = r4.f11392E0
            r7.f11330j0 = r11
            int r11 = r0.f11378i
            if (r21 <= 0) goto L_0x0064
            int r12 = r4.f11402Q0
            int r11 = r11 + r12
        L_0x0064:
            s.c r12 = r0.f11376e
            s.c r13 = r7.f11297J
            r13.a(r12, r11)
            s.c r11 = r7.f11299L
            if (r23 == 0) goto L_0x0076
            s.c r12 = r0.g
            int r14 = r0.f11380k
            r11.a(r12, r14)
        L_0x0076:
            if (r21 <= 0) goto L_0x0081
            s.c r12 = r0.f11376e
            s.d r12 = r12.d
            s.c r12 = r12.f11299L
            r12.a(r13, r2)
        L_0x0081:
            int r12 = r4.f11404S0
            r14 = 3
            if (r12 != r14) goto L_0x00a8
            boolean r12 = r7.f11293E
            if (r12 != 0) goto L_0x00a8
            r12 = r2
        L_0x008b:
            if (r12 >= r1) goto L_0x00a8
            if (r22 == 0) goto L_0x0093
            int r15 = r1 + -1
            int r15 = r15 - r12
            goto L_0x0094
        L_0x0093:
            r15 = r12
        L_0x0094:
            int r10 = r0.f11383n
            int r10 = r10 + r15
            int r15 = r4.f11412b1
            if (r10 < r15) goto L_0x009c
            goto L_0x00a8
        L_0x009c:
            s.d[] r15 = r4.f11411a1
            r10 = r15[r10]
            boolean r15 = r10.f11293E
            if (r15 == 0) goto L_0x00a5
            goto L_0x00a9
        L_0x00a5:
            int r12 = r12 + 1
            goto L_0x008b
        L_0x00a8:
            r10 = r7
        L_0x00a9:
            r15 = r2
            r12 = 0
        L_0x00ab:
            if (r15 >= r1) goto L_0x02d0
            if (r22 == 0) goto L_0x00b4
            int r16 = r1 + -1
            int r16 = r16 - r15
            goto L_0x00b6
        L_0x00b4:
            r16 = r15
        L_0x00b6:
            int r14 = r0.f11383n
            int r14 = r14 + r16
            int r3 = r4.f11412b1
            if (r14 < r3) goto L_0x00c0
            goto L_0x02d0
        L_0x00c0:
            s.d[] r3 = r4.f11411a1
            r3 = r3[r14]
            if (r3 != 0) goto L_0x00cb
            r17 = r1
            r2 = 3
            goto L_0x01a4
        L_0x00cb:
            s.c r14 = r3.f11296I
            if (r15 != 0) goto L_0x00d6
            s.c r2 = r0.d
            int r6 = r0.h
            r3.f(r14, r2, r6)
        L_0x00d6:
            if (r16 != 0) goto L_0x0122
            int r2 = r4.f11391D0
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r22 == 0) goto L_0x00e5
            r16 = r2
            float r2 = r4.f11397J0
            float r2 = r6 - r2
            goto L_0x00e9
        L_0x00e5:
            r16 = r2
            float r2 = r4.f11397J0
        L_0x00e9:
            int r6 = r0.f11383n
            if (r6 != 0) goto L_0x0105
            int r6 = r4.f11393F0
            r18 = r2
            r2 = -1
            if (r6 == r2) goto L_0x0107
            if (r22 == 0) goto L_0x00fd
            float r2 = r4.L0
            r16 = 1065353216(0x3f800000, float:1.0)
            float r2 = r16 - r2
            goto L_0x00ff
        L_0x00fd:
            float r2 = r4.L0
        L_0x00ff:
            r19 = r6
            r6 = r2
            r2 = r19
            goto L_0x011e
        L_0x0105:
            r18 = r2
        L_0x0107:
            if (r23 == 0) goto L_0x011a
            int r2 = r4.f11395H0
            r6 = -1
            if (r2 == r6) goto L_0x011a
            if (r22 == 0) goto L_0x0117
            float r6 = r4.f11400N0
            r16 = 1065353216(0x3f800000, float:1.0)
            float r6 = r16 - r6
            goto L_0x011e
        L_0x0117:
            float r6 = r4.f11400N0
            goto L_0x011e
        L_0x011a:
            r2 = r16
            r6 = r18
        L_0x011e:
            r3.f11328i0 = r2
            r3.f11320d0 = r6
        L_0x0122:
            int r2 = r1 + -1
            if (r15 != r2) goto L_0x0132
            s.c r2 = r0.f11377f
            int r6 = r0.f11379j
            r17 = r1
            s.c r1 = r3.f11298K
            r3.f(r1, r2, r6)
            goto L_0x0134
        L_0x0132:
            r17 = r1
        L_0x0134:
            if (r12 == 0) goto L_0x015c
            int r1 = r4.f11401P0
            s.c r2 = r12.f11298K
            r14.a(r2, r1)
            if (r15 != r8) goto L_0x0149
            int r1 = r0.h
            boolean r6 = r14.h()
            if (r6 == 0) goto L_0x0149
            r14.h = r1
        L_0x0149:
            r1 = 0
            r2.a(r14, r1)
            r1 = 1
            int r6 = r9 + 1
            if (r15 != r6) goto L_0x015c
            int r1 = r0.f11379j
            boolean r6 = r2.h()
            if (r6 == 0) goto L_0x015c
            r2.h = r1
        L_0x015c:
            if (r3 == r7) goto L_0x01a2
            int r1 = r4.f11404S0
            r2 = 3
            if (r1 != r2) goto L_0x0176
            boolean r6 = r10.f11293E
            if (r6 == 0) goto L_0x0176
            if (r3 == r10) goto L_0x0176
            boolean r6 = r3.f11293E
            if (r6 == 0) goto L_0x0176
            s.c r1 = r3.f11300M
            s.c r6 = r10.f11300M
            r12 = 0
            r1.a(r6, r12)
            goto L_0x01a3
        L_0x0176:
            s.c r6 = r3.f11297J
            if (r1 == 0) goto L_0x019d
            s.c r12 = r3.f11299L
            r14 = 1
            if (r1 == r14) goto L_0x0198
            if (r5 == 0) goto L_0x0190
            s.c r1 = r0.f11376e
            int r14 = r0.f11378i
            r6.a(r1, r14)
            s.c r1 = r0.g
            int r6 = r0.f11380k
            r12.a(r1, r6)
            goto L_0x01a3
        L_0x0190:
            r1 = 0
            r6.a(r13, r1)
            r12.a(r11, r1)
            goto L_0x01a3
        L_0x0198:
            r1 = 0
            r12.a(r11, r1)
            goto L_0x01a3
        L_0x019d:
            r1 = 0
            r6.a(r13, r1)
            goto L_0x01a3
        L_0x01a2:
            r2 = 3
        L_0x01a3:
            r12 = r3
        L_0x01a4:
            int r15 = r15 + 1
            r14 = r2
            r1 = r17
            r2 = 0
            r6 = -1
            goto L_0x00ab
        L_0x01ad:
            r17 = r1
            s.d r1 = r0.f11374b
            int r2 = r4.f11391D0
            r1.f11328i0 = r2
            int r2 = r0.h
            if (r21 <= 0) goto L_0x01bc
            int r3 = r4.f11401P0
            int r2 = r2 + r3
        L_0x01bc:
            s.c r3 = r1.f11296I
            s.c r6 = r1.f11298K
            if (r22 == 0) goto L_0x01dd
            s.c r7 = r0.f11377f
            r6.a(r7, r2)
            if (r23 == 0) goto L_0x01d0
            s.c r2 = r0.d
            int r7 = r0.f11379j
            r3.a(r2, r7)
        L_0x01d0:
            if (r21 <= 0) goto L_0x01f7
            s.c r2 = r0.f11377f
            s.d r2 = r2.d
            s.c r2 = r2.f11296I
            r7 = 0
            r2.a(r6, r7)
            goto L_0x01f7
        L_0x01dd:
            s.c r7 = r0.d
            r3.a(r7, r2)
            if (r23 == 0) goto L_0x01eb
            s.c r2 = r0.f11377f
            int r7 = r0.f11379j
            r6.a(r2, r7)
        L_0x01eb:
            if (r21 <= 0) goto L_0x01f7
            s.c r2 = r0.d
            s.d r2 = r2.d
            s.c r2 = r2.f11298K
            r7 = 0
            r2.a(r3, r7)
        L_0x01f7:
            r7 = r17
            r2 = 0
            r10 = 0
        L_0x01fb:
            if (r2 >= r7) goto L_0x02d0
            int r11 = r0.f11383n
            int r11 = r11 + r2
            int r12 = r4.f11412b1
            if (r11 < r12) goto L_0x0206
            goto L_0x02d0
        L_0x0206:
            s.d[] r12 = r4.f11411a1
            r11 = r12[r11]
            if (r11 != 0) goto L_0x0210
            r13 = 0
            r15 = 1
            goto L_0x02cc
        L_0x0210:
            s.c r12 = r11.f11297J
            if (r2 != 0) goto L_0x0240
            s.c r13 = r0.f11376e
            int r14 = r0.f11378i
            r11.f(r12, r13, r14)
            int r13 = r4.f11392E0
            float r14 = r4.f11398K0
            int r15 = r0.f11383n
            if (r15 != 0) goto L_0x022d
            int r15 = r4.f11394G0
            r16 = r13
            r13 = -1
            if (r15 == r13) goto L_0x0230
            float r14 = r4.f11399M0
            goto L_0x023b
        L_0x022d:
            r16 = r13
            r13 = -1
        L_0x0230:
            if (r23 == 0) goto L_0x0239
            int r15 = r4.f11396I0
            if (r15 == r13) goto L_0x0239
            float r14 = r4.O0
            goto L_0x023b
        L_0x0239:
            r15 = r16
        L_0x023b:
            r11.f11330j0 = r15
            r11.f11322e0 = r14
            goto L_0x0241
        L_0x0240:
            r13 = -1
        L_0x0241:
            int r14 = r7 + -1
            if (r2 != r14) goto L_0x024e
            s.c r14 = r0.g
            int r15 = r0.f11380k
            s.c r13 = r11.f11299L
            r11.f(r13, r14, r15)
        L_0x024e:
            if (r10 == 0) goto L_0x0276
            int r13 = r4.f11402Q0
            s.c r10 = r10.f11299L
            r12.a(r10, r13)
            if (r2 != r8) goto L_0x0263
            int r13 = r0.f11378i
            boolean r14 = r12.h()
            if (r14 == 0) goto L_0x0263
            r12.h = r13
        L_0x0263:
            r13 = 0
            r10.a(r12, r13)
            r12 = 1
            int r13 = r9 + 1
            if (r2 != r13) goto L_0x0276
            int r12 = r0.f11380k
            boolean r13 = r10.h()
            if (r13 == 0) goto L_0x0276
            r10.h = r12
        L_0x0276:
            if (r11 == r1) goto L_0x029a
            s.c r10 = r11.f11298K
            s.c r12 = r11.f11296I
            r13 = 2
            if (r22 == 0) goto L_0x029d
            int r14 = r4.f11403R0
            if (r14 == 0) goto L_0x0296
            r15 = 1
            if (r14 == r15) goto L_0x0291
            if (r14 == r13) goto L_0x0289
            goto L_0x029a
        L_0x0289:
            r13 = 0
            r12.a(r3, r13)
            r10.a(r6, r13)
            goto L_0x029a
        L_0x0291:
            r13 = 0
            r12.a(r3, r13)
            goto L_0x029a
        L_0x0296:
            r13 = 0
            r10.a(r6, r13)
        L_0x029a:
            r13 = 0
            r15 = 1
            goto L_0x02cb
        L_0x029d:
            int r14 = r4.f11403R0
            if (r14 == 0) goto L_0x02c6
            r15 = 1
            if (r14 == r15) goto L_0x02c1
            if (r14 == r13) goto L_0x02a8
        L_0x02a6:
            r13 = 0
            goto L_0x02cb
        L_0x02a8:
            if (r5 == 0) goto L_0x02b9
            s.c r13 = r0.d
            int r14 = r0.h
            r12.a(r13, r14)
            s.c r12 = r0.f11377f
            int r13 = r0.f11379j
            r10.a(r12, r13)
            goto L_0x02a6
        L_0x02b9:
            r13 = 0
            r12.a(r3, r13)
            r10.a(r6, r13)
            goto L_0x02cb
        L_0x02c1:
            r13 = 0
            r10.a(r6, r13)
            goto L_0x02cb
        L_0x02c6:
            r13 = 0
            r15 = 1
            r12.a(r3, r13)
        L_0x02cb:
            r10 = r11
        L_0x02cc:
            int r2 = r2 + 1
            goto L_0x01fb
        L_0x02d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.f.b(int, boolean, boolean):void");
    }

    public final int c() {
        if (this.f11373a == 1) {
            return this.f11382m - this.f11387r.f11402Q0;
        }
        return this.f11382m;
    }

    public final int d() {
        if (this.f11373a == 0) {
            return this.f11381l - this.f11387r.f11401P0;
        }
        return this.f11381l;
    }

    public final void e(int i2) {
        g gVar;
        int i5;
        int i6 = this.f11385p;
        if (i6 != 0) {
            int i7 = this.f11384o;
            int i8 = i2 / i6;
            int i9 = 0;
            while (true) {
                gVar = this.f11387r;
                if (i9 >= i7 || (i5 = this.f11383n + i9) >= gVar.f11412b1) {
                    this.f11381l = 0;
                    this.f11382m = 0;
                    this.f11374b = null;
                    this.f11375c = 0;
                    int i10 = this.f11384o;
                    int i11 = 0;
                } else {
                    d dVar = gVar.f11411a1[i5];
                    if (this.f11373a == 0) {
                        if (dVar != null) {
                            int[] iArr = dVar.f11342p0;
                            if (iArr[0] == 3 && dVar.f11344r == 0) {
                                gVar.V(1, i8, iArr[1], dVar.k(), dVar);
                            }
                        }
                    } else if (dVar != null) {
                        int[] iArr2 = dVar.f11342p0;
                        if (iArr2[1] == 3 && dVar.f11345s == 0) {
                            gVar.V(iArr2[0], dVar.q(), 1, i8, dVar);
                        }
                    }
                    i9++;
                }
            }
            this.f11381l = 0;
            this.f11382m = 0;
            this.f11374b = null;
            this.f11375c = 0;
            int i102 = this.f11384o;
            int i112 = 0;
            while (i112 < i102) {
                int i12 = this.f11383n + i112;
                if (i12 < gVar.f11412b1) {
                    d dVar2 = gVar.f11411a1[i12];
                    if (this.f11373a == 0) {
                        int q6 = dVar2.q();
                        int i13 = gVar.f11401P0;
                        if (dVar2.f11325g0 == 8) {
                            i13 = 0;
                        }
                        this.f11381l = q6 + i13 + this.f11381l;
                        int T5 = gVar.T(dVar2, this.f11386q);
                        if (this.f11374b == null || this.f11375c < T5) {
                            this.f11374b = dVar2;
                            this.f11375c = T5;
                            this.f11382m = T5;
                        }
                    } else {
                        int U5 = gVar.U(dVar2, this.f11386q);
                        int T6 = gVar.T(dVar2, this.f11386q);
                        int i14 = gVar.f11402Q0;
                        if (dVar2.f11325g0 == 8) {
                            i14 = 0;
                        }
                        this.f11382m = T6 + i14 + this.f11382m;
                        if (this.f11374b == null || this.f11375c < U5) {
                            this.f11374b = dVar2;
                            this.f11375c = U5;
                            this.f11381l = U5;
                        }
                    }
                    i112++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i2, c cVar, c cVar2, c cVar3, c cVar4, int i5, int i6, int i7, int i8, int i9) {
        this.f11373a = i2;
        this.d = cVar;
        this.f11376e = cVar2;
        this.f11377f = cVar3;
        this.g = cVar4;
        this.h = i5;
        this.f11378i = i6;
        this.f11379j = i7;
        this.f11380k = i8;
        this.f11386q = i9;
    }
}
