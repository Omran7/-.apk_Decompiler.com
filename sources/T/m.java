package t;

import q.C0928e;
import s.d;

public final class m extends o {

    /* renamed from: k  reason: collision with root package name */
    public f f11595k;

    /* renamed from: l  reason: collision with root package name */
    public C0975a f11596l;

    public final void a(d dVar) {
        int i2;
        float f6;
        float f7;
        float f8;
        if (C0928e.c(this.f11608j) != 3) {
            g gVar = this.f11605e;
            if (gVar.f11583c && !gVar.f11587j && this.d == 3) {
                d dVar2 = this.f11603b;
                int i5 = dVar2.f11345s;
                if (i5 == 2) {
                    d dVar3 = dVar2.f11307T;
                    if (dVar3 != null) {
                        g gVar2 = dVar3.f11321e.f11605e;
                        if (gVar2.f11587j) {
                            gVar.d((int) ((((float) gVar2.g) * dVar2.f11352z) + 0.5f));
                        }
                    }
                } else if (i5 == 3) {
                    g gVar3 = dVar2.d.f11605e;
                    if (gVar3.f11587j) {
                        int i6 = dVar2.f11311X;
                        if (i6 == -1) {
                            f6 = (float) gVar3.g;
                            f7 = dVar2.f11310W;
                        } else if (i6 == 0) {
                            f8 = ((float) gVar3.g) * dVar2.f11310W;
                            i2 = (int) (f8 + 0.5f);
                            gVar.d(i2);
                        } else if (i6 != 1) {
                            i2 = 0;
                            gVar.d(i2);
                        } else {
                            f6 = (float) gVar3.g;
                            f7 = dVar2.f11310W;
                        }
                        f8 = f6 / f7;
                        i2 = (int) (f8 + 0.5f);
                        gVar.d(i2);
                    }
                }
            }
            f fVar = this.h;
            if (fVar.f11583c) {
                f fVar2 = this.f11607i;
                if (fVar2.f11583c) {
                    if (!fVar.f11587j || !fVar2.f11587j || !gVar.f11587j) {
                        if (!gVar.f11587j && this.d == 3) {
                            d dVar4 = this.f11603b;
                            if (dVar4.f11344r == 0 && !dVar4.y()) {
                                int i7 = ((f) fVar.f11589l.get(0)).g + fVar.f11585f;
                                int i8 = ((f) fVar2.f11589l.get(0)).g + fVar2.f11585f;
                                fVar.d(i7);
                                fVar2.d(i8);
                                gVar.d(i8 - i7);
                                return;
                            }
                        }
                        if (!gVar.f11587j && this.d == 3 && this.f11602a == 1 && fVar.f11589l.size() > 0 && fVar2.f11589l.size() > 0) {
                            int i9 = (((f) fVar2.f11589l.get(0)).g + fVar2.f11585f) - (((f) fVar.f11589l.get(0)).g + fVar.f11585f);
                            int i10 = gVar.f11590m;
                            if (i9 < i10) {
                                gVar.d(i9);
                            } else {
                                gVar.d(i10);
                            }
                        }
                        if (gVar.f11587j && fVar.f11589l.size() > 0 && fVar2.f11589l.size() > 0) {
                            f fVar3 = (f) fVar.f11589l.get(0);
                            f fVar4 = (f) fVar2.f11589l.get(0);
                            int i11 = fVar3.g;
                            int i12 = fVar.f11585f + i11;
                            int i13 = fVar4.g;
                            int i14 = fVar2.f11585f + i13;
                            float f9 = this.f11603b.f11322e0;
                            if (fVar3 == fVar4) {
                                f9 = 0.5f;
                            } else {
                                i11 = i12;
                                i13 = i14;
                            }
                            fVar.d((int) ((((float) ((i13 - i11) - gVar.g)) * f9) + ((float) i11) + 0.5f));
                            fVar2.d(fVar.g + gVar.g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        d dVar5 = this.f11603b;
        l(dVar5.f11297J, dVar5.f11299L, 1);
    }

    /* JADX WARNING: type inference failed for: r0v124, types: [t.a, t.g] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        r0 = r14.f11603b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r14 = this;
            s.d r0 = r14.f11603b
            boolean r1 = r0.f11314a
            t.g r2 = r14.f11605e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.k()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.f11587j
            t.f r1 = r14.f11607i
            t.f r3 = r14.h
            r4 = 3
            r5 = 1
            r6 = 4
            if (r0 != 0) goto L_0x0084
            s.d r0 = r14.f11603b
            int[] r7 = r0.f11342p0
            r7 = r7[r5]
            r14.d = r7
            boolean r0 = r0.f11293E
            if (r0 == 0) goto L_0x002d
            t.a r0 = new t.a
            r0.<init>(r14)
            r14.f11596l = r0
        L_0x002d:
            int r0 = r14.d
            if (r0 == r4) goto L_0x00b2
            if (r0 != r6) goto L_0x0078
            s.d r7 = r14.f11603b
            s.d r7 = r7.f11307T
            if (r7 == 0) goto L_0x0078
            int[] r8 = r7.f11342p0
            r8 = r8[r5]
            if (r8 != r5) goto L_0x0078
            int r0 = r7.k()
            s.d r4 = r14.f11603b
            s.c r4 = r4.f11297J
            int r4 = r4.e()
            int r0 = r0 - r4
            s.d r4 = r14.f11603b
            s.c r4 = r4.f11299L
            int r4 = r4.e()
            int r0 = r0 - r4
            t.m r4 = r7.f11321e
            t.f r4 = r4.h
            s.d r5 = r14.f11603b
            s.c r5 = r5.f11297J
            int r5 = r5.e()
            t.o.b(r3, r4, r5)
            t.m r3 = r7.f11321e
            t.f r3 = r3.f11607i
            s.d r4 = r14.f11603b
            s.c r4 = r4.f11299L
            int r4 = r4.e()
            int r4 = -r4
            t.o.b(r1, r3, r4)
            r2.d(r0)
            return
        L_0x0078:
            if (r0 != r5) goto L_0x00b2
            s.d r0 = r14.f11603b
            int r0 = r0.k()
            r2.d(r0)
            goto L_0x00b2
        L_0x0084:
            int r0 = r14.d
            if (r0 != r6) goto L_0x00b2
            s.d r0 = r14.f11603b
            s.d r7 = r0.f11307T
            if (r7 == 0) goto L_0x00b2
            int[] r8 = r7.f11342p0
            r8 = r8[r5]
            if (r8 != r5) goto L_0x00b2
            t.m r2 = r7.f11321e
            t.f r2 = r2.h
            s.c r0 = r0.f11297J
            int r0 = r0.e()
            t.o.b(r3, r2, r0)
            t.m r0 = r7.f11321e
            t.f r0 = r0.f11607i
            s.d r2 = r14.f11603b
            s.c r2 = r2.f11299L
            int r2 = r2.e()
            int r2 = -r2
            t.o.b(r1, r0, r2)
            return
        L_0x00b2:
            boolean r0 = r2.f11587j
            t.f r7 = r14.f11595k
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x01d6
            s.d r10 = r14.f11603b
            boolean r11 = r10.f11314a
            if (r11 == 0) goto L_0x01d6
            s.c[] r0 = r10.f11304Q
            r11 = r0[r9]
            s.c r12 = r11.f11287f
            if (r12 == 0) goto L_0x0132
            r13 = r0[r4]
            s.c r13 = r13.f11287f
            if (r13 == 0) goto L_0x0132
            boolean r0 = r10.y()
            if (r0 == 0) goto L_0x00ee
            s.d r0 = r14.f11603b
            s.c[] r0 = r0.f11304Q
            r0 = r0[r9]
            int r0 = r0.e()
            r3.f11585f = r0
            s.d r0 = r14.f11603b
            s.c[] r0 = r0.f11304Q
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f11585f = r0
            goto L_0x0125
        L_0x00ee:
            s.d r0 = r14.f11603b
            s.c[] r0 = r0.f11304Q
            r0 = r0[r9]
            t.f r0 = t.o.h(r0)
            if (r0 == 0) goto L_0x0107
            s.d r2 = r14.f11603b
            s.c[] r2 = r2.f11304Q
            r2 = r2[r9]
            int r2 = r2.e()
            t.o.b(r3, r0, r2)
        L_0x0107:
            s.d r0 = r14.f11603b
            s.c[] r0 = r0.f11304Q
            r0 = r0[r4]
            t.f r0 = t.o.h(r0)
            if (r0 == 0) goto L_0x0121
            s.d r2 = r14.f11603b
            s.c[] r2 = r2.f11304Q
            r2 = r2[r4]
            int r2 = r2.e()
            int r2 = -r2
            t.o.b(r1, r0, r2)
        L_0x0121:
            r3.f11582b = r5
            r1.f11582b = r5
        L_0x0125:
            s.d r0 = r14.f11603b
            boolean r1 = r0.f11293E
            if (r1 == 0) goto L_0x036c
            int r0 = r0.f11315a0
            t.o.b(r7, r3, r0)
            goto L_0x036c
        L_0x0132:
            if (r12 == 0) goto L_0x0159
            t.f r0 = t.o.h(r11)
            if (r0 == 0) goto L_0x036c
            s.d r4 = r14.f11603b
            s.c[] r4 = r4.f11304Q
            r4 = r4[r9]
            int r4 = r4.e()
            t.o.b(r3, r0, r4)
            int r0 = r2.g
            t.o.b(r1, r3, r0)
            s.d r0 = r14.f11603b
            boolean r1 = r0.f11293E
            if (r1 == 0) goto L_0x036c
            int r0 = r0.f11315a0
            t.o.b(r7, r3, r0)
            goto L_0x036c
        L_0x0159:
            r5 = r0[r4]
            s.c r9 = r5.f11287f
            if (r9 == 0) goto L_0x0186
            t.f r0 = t.o.h(r5)
            if (r0 == 0) goto L_0x0179
            s.d r5 = r14.f11603b
            s.c[] r5 = r5.f11304Q
            r4 = r5[r4]
            int r4 = r4.e()
            int r4 = -r4
            t.o.b(r1, r0, r4)
            int r0 = r2.g
            int r0 = -r0
            t.o.b(r3, r1, r0)
        L_0x0179:
            s.d r0 = r14.f11603b
            boolean r1 = r0.f11293E
            if (r1 == 0) goto L_0x036c
            int r0 = r0.f11315a0
            t.o.b(r7, r3, r0)
            goto L_0x036c
        L_0x0186:
            r0 = r0[r6]
            s.c r4 = r0.f11287f
            if (r4 == 0) goto L_0x01a4
            t.f r0 = t.o.h(r0)
            if (r0 == 0) goto L_0x036c
            t.o.b(r7, r0, r8)
            s.d r0 = r14.f11603b
            int r0 = r0.f11315a0
            int r0 = -r0
            t.o.b(r3, r7, r0)
            int r0 = r2.g
            t.o.b(r1, r3, r0)
            goto L_0x036c
        L_0x01a4:
            boolean r0 = r10 instanceof s.i
            if (r0 != 0) goto L_0x036c
            s.d r0 = r10.f11307T
            if (r0 == 0) goto L_0x036c
            r0 = 7
            s.c r0 = r10.i(r0)
            s.c r0 = r0.f11287f
            if (r0 != 0) goto L_0x036c
            s.d r0 = r14.f11603b
            s.d r4 = r0.f11307T
            t.m r4 = r4.f11321e
            t.f r4 = r4.h
            int r0 = r0.s()
            t.o.b(r3, r4, r0)
            int r0 = r2.g
            t.o.b(r1, r3, r0)
            s.d r0 = r14.f11603b
            boolean r1 = r0.f11293E
            if (r1 == 0) goto L_0x036c
            int r0 = r0.f11315a0
            t.o.b(r7, r3, r0)
            goto L_0x036c
        L_0x01d6:
            if (r0 != 0) goto L_0x022d
            int r0 = r14.d
            if (r0 != r4) goto L_0x022d
            s.d r0 = r14.f11603b
            int r10 = r0.f11345s
            if (r10 == r9) goto L_0x020d
            if (r10 == r4) goto L_0x01e5
            goto L_0x0230
        L_0x01e5:
            boolean r0 = r0.y()
            if (r0 != 0) goto L_0x0230
            s.d r0 = r14.f11603b
            int r10 = r0.f11344r
            if (r10 != r4) goto L_0x01f2
            goto L_0x0230
        L_0x01f2:
            t.k r0 = r0.d
            t.g r0 = r0.f11605e
            java.util.ArrayList r10 = r2.f11589l
            r10.add(r0)
            java.util.ArrayList r0 = r0.f11588k
            r0.add(r2)
            r2.f11582b = r5
            java.util.ArrayList r0 = r2.f11588k
            r0.add(r3)
            java.util.ArrayList r0 = r2.f11588k
            r0.add(r1)
            goto L_0x0230
        L_0x020d:
            s.d r0 = r0.f11307T
            if (r0 != 0) goto L_0x0212
            goto L_0x0230
        L_0x0212:
            t.m r0 = r0.f11321e
            t.g r0 = r0.f11605e
            java.util.ArrayList r10 = r2.f11589l
            r10.add(r0)
            java.util.ArrayList r0 = r0.f11588k
            r0.add(r2)
            r2.f11582b = r5
            java.util.ArrayList r0 = r2.f11588k
            r0.add(r3)
            java.util.ArrayList r0 = r2.f11588k
            r0.add(r1)
            goto L_0x0230
        L_0x022d:
            r2.b(r14)
        L_0x0230:
            s.d r0 = r14.f11603b
            s.c[] r10 = r0.f11304Q
            r11 = r10[r9]
            s.c r12 = r11.f11287f
            if (r12 == 0) goto L_0x028d
            r13 = r10[r4]
            s.c r13 = r13.f11287f
            if (r13 == 0) goto L_0x028d
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x0260
            s.d r0 = r14.f11603b
            s.c[] r0 = r0.f11304Q
            r0 = r0[r9]
            int r0 = r0.e()
            r3.f11585f = r0
            s.d r0 = r14.f11603b
            s.c[] r0 = r0.f11304Q
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f11585f = r0
            goto L_0x0280
        L_0x0260:
            s.d r0 = r14.f11603b
            s.c[] r0 = r0.f11304Q
            r0 = r0[r9]
            t.f r0 = t.o.h(r0)
            s.d r1 = r14.f11603b
            s.c[] r1 = r1.f11304Q
            r1 = r1[r4]
            t.f r1 = t.o.h(r1)
            if (r0 == 0) goto L_0x0279
            r0.b(r14)
        L_0x0279:
            if (r1 == 0) goto L_0x027e
            r1.b(r14)
        L_0x027e:
            r14.f11608j = r6
        L_0x0280:
            s.d r0 = r14.f11603b
            boolean r0 = r0.f11293E
            if (r0 == 0) goto L_0x0362
            t.a r0 = r14.f11596l
            r14.c(r7, r3, r5, r0)
            goto L_0x0362
        L_0x028d:
            r13 = 0
            if (r12 == 0) goto L_0x02d9
            t.f r0 = t.o.h(r11)
            if (r0 == 0) goto L_0x0362
            s.d r6 = r14.f11603b
            s.c[] r6 = r6.f11304Q
            r6 = r6[r9]
            int r6 = r6.e()
            t.o.b(r3, r0, r6)
            r14.c(r1, r3, r5, r2)
            s.d r0 = r14.f11603b
            boolean r0 = r0.f11293E
            if (r0 == 0) goto L_0x02b1
            t.a r0 = r14.f11596l
            r14.c(r7, r3, r5, r0)
        L_0x02b1:
            int r0 = r14.d
            if (r0 != r4) goto L_0x0362
            s.d r0 = r14.f11603b
            float r1 = r0.f11310W
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0362
            t.k r0 = r0.d
            int r1 = r0.d
            if (r1 != r4) goto L_0x0362
            t.g r0 = r0.f11605e
            java.util.ArrayList r0 = r0.f11588k
            r0.add(r2)
            java.util.ArrayList r0 = r2.f11589l
            s.d r1 = r14.f11603b
            t.k r1 = r1.d
            t.g r1 = r1.f11605e
            r0.add(r1)
            r2.f11581a = r14
            goto L_0x0362
        L_0x02d9:
            r9 = r10[r4]
            s.c r11 = r9.f11287f
            r12 = -1
            if (r11 == 0) goto L_0x0303
            t.f r0 = t.o.h(r9)
            if (r0 == 0) goto L_0x0362
            s.d r6 = r14.f11603b
            s.c[] r6 = r6.f11304Q
            r4 = r6[r4]
            int r4 = r4.e()
            int r4 = -r4
            t.o.b(r1, r0, r4)
            r14.c(r3, r1, r12, r2)
            s.d r0 = r14.f11603b
            boolean r0 = r0.f11293E
            if (r0 == 0) goto L_0x0362
            t.a r0 = r14.f11596l
            r14.c(r7, r3, r5, r0)
            goto L_0x0362
        L_0x0303:
            r6 = r10[r6]
            s.c r9 = r6.f11287f
            if (r9 == 0) goto L_0x031b
            t.f r0 = t.o.h(r6)
            if (r0 == 0) goto L_0x0362
            t.o.b(r7, r0, r8)
            t.a r0 = r14.f11596l
            r14.c(r3, r7, r12, r0)
            r14.c(r1, r3, r5, r2)
            goto L_0x0362
        L_0x031b:
            boolean r6 = r0 instanceof s.i
            if (r6 != 0) goto L_0x0362
            s.d r6 = r0.f11307T
            if (r6 == 0) goto L_0x0362
            t.m r6 = r6.f11321e
            t.f r6 = r6.h
            int r0 = r0.s()
            t.o.b(r3, r6, r0)
            r14.c(r1, r3, r5, r2)
            s.d r0 = r14.f11603b
            boolean r0 = r0.f11293E
            if (r0 == 0) goto L_0x033c
            t.a r0 = r14.f11596l
            r14.c(r7, r3, r5, r0)
        L_0x033c:
            int r0 = r14.d
            if (r0 != r4) goto L_0x0362
            s.d r0 = r14.f11603b
            float r1 = r0.f11310W
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0362
            t.k r0 = r0.d
            int r1 = r0.d
            if (r1 != r4) goto L_0x0362
            t.g r0 = r0.f11605e
            java.util.ArrayList r0 = r0.f11588k
            r0.add(r2)
            java.util.ArrayList r0 = r2.f11589l
            s.d r1 = r14.f11603b
            t.k r1 = r1.d
            t.g r1 = r1.f11605e
            r0.add(r1)
            r2.f11581a = r14
        L_0x0362:
            java.util.ArrayList r0 = r2.f11589l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x036c
            r2.f11583c = r5
        L_0x036c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.m.d():void");
    }

    public final void e() {
        f fVar = this.h;
        if (fVar.f11587j) {
            this.f11603b.f11313Z = fVar.g;
        }
    }

    public final void f() {
        this.f11604c = null;
        this.h.c();
        this.f11607i.c();
        this.f11595k.c();
        this.f11605e.c();
        this.g = false;
    }

    public final boolean k() {
        if (this.d != 3 || this.f11603b.f11345s == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f11587j = false;
        f fVar2 = this.f11607i;
        fVar2.c();
        fVar2.f11587j = false;
        f fVar3 = this.f11595k;
        fVar3.c();
        fVar3.f11587j = false;
        this.f11605e.f11587j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f11603b.f11326h0;
    }
}
