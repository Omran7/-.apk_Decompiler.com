package t;

public final class k extends o {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f11592k = new int[2];

    public static void m(int[] iArr, int i2, int i5, int i6, int i7, float f6, int i8) {
        int i9 = i5 - i2;
        int i10 = i7 - i6;
        if (i8 == -1) {
            int i11 = (int) ((((float) i10) * f6) + 0.5f);
            int i12 = (int) ((((float) i9) / f6) + 0.5f);
            if (i11 <= i9) {
                iArr[0] = i11;
                iArr[1] = i10;
            } else if (i12 <= i10) {
                iArr[0] = i9;
                iArr[1] = i12;
            }
        } else if (i8 == 0) {
            iArr[0] = (int) ((((float) i10) * f6) + 0.5f);
            iArr[1] = i10;
        } else if (i8 == 1) {
            iArr[0] = i9;
            iArr[1] = (int) ((((float) i9) * f6) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0244, code lost:
        if (r3 != 1) goto L_0x029f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(t.d r24) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.f11608j
            int r1 = q.C0928e.c(r1)
            r2 = 0
            r3 = 3
            if (r1 == r3) goto L_0x0381
            t.g r1 = r0.f11605e
            boolean r4 = r1.f11587j
            t.f r5 = r0.h
            t.f r6 = r0.f11607i
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 1
            if (r4 != 0) goto L_0x029f
            int r4 = r0.d
            if (r4 != r3) goto L_0x029f
            s.d r4 = r0.f11603b
            int r9 = r4.f11344r
            r10 = 2
            if (r9 == r10) goto L_0x0288
            if (r9 == r3) goto L_0x0028
            goto L_0x029f
        L_0x0028:
            int r9 = r4.f11345s
            r10 = -1
            if (r9 == 0) goto L_0x0061
            if (r9 != r3) goto L_0x0030
            goto L_0x0061
        L_0x0030:
            int r9 = r4.f11311X
            if (r9 == r10) goto L_0x0052
            if (r9 == 0) goto L_0x0047
            if (r9 == r8) goto L_0x003a
            r4 = r2
            goto L_0x005c
        L_0x003a:
            t.m r9 = r4.f11321e
            t.g r9 = r9.f11605e
            int r9 = r9.g
            float r9 = (float) r9
            float r4 = r4.f11310W
        L_0x0043:
            float r9 = r9 * r4
        L_0x0044:
            float r9 = r9 + r7
            int r4 = (int) r9
            goto L_0x005c
        L_0x0047:
            t.m r9 = r4.f11321e
            t.g r9 = r9.f11605e
            int r9 = r9.g
            float r9 = (float) r9
            float r4 = r4.f11310W
            float r9 = r9 / r4
            goto L_0x0044
        L_0x0052:
            t.m r9 = r4.f11321e
            t.g r9 = r9.f11605e
            int r9 = r9.g
            float r9 = (float) r9
            float r4 = r4.f11310W
            goto L_0x0043
        L_0x005c:
            r1.d(r4)
            goto L_0x029f
        L_0x0061:
            t.m r9 = r4.f11321e
            t.f r11 = r9.h
            t.f r9 = r9.f11607i
            s.c r12 = r4.f11296I
            s.c r12 = r12.f11287f
            if (r12 == 0) goto L_0x006f
            r12 = r8
            goto L_0x0070
        L_0x006f:
            r12 = r2
        L_0x0070:
            s.c r13 = r4.f11297J
            s.c r13 = r13.f11287f
            if (r13 == 0) goto L_0x0078
            r13 = r8
            goto L_0x0079
        L_0x0078:
            r13 = r2
        L_0x0079:
            s.c r14 = r4.f11298K
            s.c r14 = r14.f11287f
            if (r14 == 0) goto L_0x0081
            r14 = r8
            goto L_0x0082
        L_0x0081:
            r14 = r2
        L_0x0082:
            s.c r15 = r4.f11299L
            s.c r15 = r15.f11287f
            if (r15 == 0) goto L_0x008a
            r15 = r8
            goto L_0x008b
        L_0x008a:
            r15 = r2
        L_0x008b:
            int r3 = r4.f11311X
            if (r12 == 0) goto L_0x01a3
            if (r13 == 0) goto L_0x01a3
            if (r14 == 0) goto L_0x01a3
            if (r15 == 0) goto L_0x01a3
            float r4 = r4.f11310W
            boolean r10 = r11.f11587j
            int[] r12 = f11592k
            if (r10 == 0) goto L_0x00ec
            boolean r10 = r9.f11587j
            if (r10 == 0) goto L_0x00ec
            boolean r7 = r5.f11583c
            if (r7 == 0) goto L_0x00eb
            boolean r7 = r6.f11583c
            if (r7 != 0) goto L_0x00aa
            goto L_0x00eb
        L_0x00aa:
            java.util.ArrayList r7 = r5.f11589l
            java.lang.Object r7 = r7.get(r2)
            t.f r7 = (t.f) r7
            int r7 = r7.g
            int r5 = r5.f11585f
            int r17 = r7 + r5
            java.util.ArrayList r5 = r6.f11589l
            java.lang.Object r5 = r5.get(r2)
            t.f r5 = (t.f) r5
            int r5 = r5.g
            int r6 = r6.f11585f
            int r18 = r5 - r6
            int r5 = r11.g
            int r6 = r11.f11585f
            int r19 = r5 + r6
            int r5 = r9.g
            int r6 = r9.f11585f
            int r20 = r5 - r6
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r2 = r12[r2]
            r1.d(r2)
            s.d r1 = r0.f11603b
            t.m r1 = r1.f11321e
            t.g r1 = r1.f11605e
            r2 = r12[r8]
            r1.d(r2)
        L_0x00eb:
            return
        L_0x00ec:
            boolean r10 = r5.f11587j
            java.util.ArrayList r13 = r11.f11589l
            if (r10 == 0) goto L_0x0140
            boolean r10 = r6.f11587j
            if (r10 == 0) goto L_0x0140
            boolean r10 = r11.f11583c
            if (r10 == 0) goto L_0x013f
            boolean r10 = r9.f11583c
            if (r10 != 0) goto L_0x00ff
            goto L_0x013f
        L_0x00ff:
            int r10 = r5.g
            int r14 = r5.f11585f
            int r17 = r10 + r14
            int r10 = r6.g
            int r14 = r6.f11585f
            int r18 = r10 - r14
            java.lang.Object r10 = r13.get(r2)
            t.f r10 = (t.f) r10
            int r10 = r10.g
            int r14 = r11.f11585f
            int r19 = r10 + r14
            java.util.ArrayList r10 = r9.f11589l
            java.lang.Object r10 = r10.get(r2)
            t.f r10 = (t.f) r10
            int r10 = r10.g
            int r14 = r9.f11585f
            int r20 = r10 - r14
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r10 = r12[r2]
            r1.d(r10)
            s.d r10 = r0.f11603b
            t.m r10 = r10.f11321e
            t.g r10 = r10.f11605e
            r14 = r12[r8]
            r10.d(r14)
            goto L_0x0140
        L_0x013f:
            return
        L_0x0140:
            boolean r10 = r5.f11583c
            if (r10 == 0) goto L_0x01a2
            boolean r10 = r6.f11583c
            if (r10 == 0) goto L_0x01a2
            boolean r10 = r11.f11583c
            if (r10 == 0) goto L_0x01a2
            boolean r10 = r9.f11583c
            if (r10 != 0) goto L_0x0151
            goto L_0x01a2
        L_0x0151:
            java.util.ArrayList r10 = r5.f11589l
            java.lang.Object r10 = r10.get(r2)
            t.f r10 = (t.f) r10
            int r10 = r10.g
            int r14 = r5.f11585f
            int r17 = r10 + r14
            java.util.ArrayList r10 = r6.f11589l
            java.lang.Object r10 = r10.get(r2)
            t.f r10 = (t.f) r10
            int r10 = r10.g
            int r14 = r6.f11585f
            int r18 = r10 - r14
            java.lang.Object r10 = r13.get(r2)
            t.f r10 = (t.f) r10
            int r10 = r10.g
            int r11 = r11.f11585f
            int r19 = r10 + r11
            java.util.ArrayList r10 = r9.f11589l
            java.lang.Object r10 = r10.get(r2)
            t.f r10 = (t.f) r10
            int r10 = r10.g
            int r9 = r9.f11585f
            int r20 = r10 - r9
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r3 = r12[r2]
            r1.d(r3)
            s.d r3 = r0.f11603b
            t.m r3 = r3.f11321e
            t.g r3 = r3.f11605e
            r4 = r12[r8]
            r3.d(r4)
            goto L_0x029f
        L_0x01a2:
            return
        L_0x01a3:
            if (r12 == 0) goto L_0x0217
            if (r14 == 0) goto L_0x0217
            boolean r9 = r5.f11583c
            if (r9 == 0) goto L_0x0216
            boolean r9 = r6.f11583c
            if (r9 != 0) goto L_0x01b0
            goto L_0x0216
        L_0x01b0:
            float r4 = r4.f11310W
            java.util.ArrayList r9 = r5.f11589l
            java.lang.Object r9 = r9.get(r2)
            t.f r9 = (t.f) r9
            int r9 = r9.g
            int r11 = r5.f11585f
            int r9 = r9 + r11
            java.util.ArrayList r11 = r6.f11589l
            java.lang.Object r11 = r11.get(r2)
            t.f r11 = (t.f) r11
            int r11 = r11.g
            int r12 = r6.f11585f
            int r11 = r11 - r12
            if (r3 == r10) goto L_0x01f5
            if (r3 == 0) goto L_0x01f5
            if (r3 == r8) goto L_0x01d4
            goto L_0x029f
        L_0x01d4:
            int r11 = r11 - r9
            int r3 = r0.g(r11, r2)
            float r9 = (float) r3
            float r9 = r9 / r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x01e7
            float r3 = (float) r10
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x01e7:
            r1.d(r3)
            s.d r3 = r0.f11603b
            t.m r3 = r3.f11321e
            t.g r3 = r3.f11605e
            r3.d(r10)
            goto L_0x029f
        L_0x01f5:
            int r11 = r11 - r9
            int r3 = r0.g(r11, r2)
            float r9 = (float) r3
            float r9 = r9 * r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x0208
            float r3 = (float) r10
            float r3 = r3 / r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x0208:
            r1.d(r3)
            s.d r3 = r0.f11603b
            t.m r3 = r3.f11321e
            t.g r3 = r3.f11605e
            r3.d(r10)
            goto L_0x029f
        L_0x0216:
            return
        L_0x0217:
            if (r13 == 0) goto L_0x029f
            if (r15 == 0) goto L_0x029f
            boolean r12 = r11.f11583c
            if (r12 == 0) goto L_0x0287
            boolean r12 = r9.f11583c
            if (r12 != 0) goto L_0x0224
            goto L_0x0287
        L_0x0224:
            float r4 = r4.f11310W
            java.util.ArrayList r12 = r11.f11589l
            java.lang.Object r12 = r12.get(r2)
            t.f r12 = (t.f) r12
            int r12 = r12.g
            int r11 = r11.f11585f
            int r12 = r12 + r11
            java.util.ArrayList r11 = r9.f11589l
            java.lang.Object r11 = r11.get(r2)
            t.f r11 = (t.f) r11
            int r11 = r11.g
            int r9 = r9.f11585f
            int r11 = r11 - r9
            if (r3 == r10) goto L_0x0267
            if (r3 == 0) goto L_0x0247
            if (r3 == r8) goto L_0x0267
            goto L_0x029f
        L_0x0247:
            int r11 = r11 - r12
            int r3 = r0.g(r11, r8)
            float r9 = (float) r3
            float r9 = r9 * r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x025a
            float r3 = (float) r10
            float r3 = r3 / r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x025a:
            r1.d(r10)
            s.d r4 = r0.f11603b
            t.m r4 = r4.f11321e
            t.g r4 = r4.f11605e
            r4.d(r3)
            goto L_0x029f
        L_0x0267:
            int r11 = r11 - r12
            int r3 = r0.g(r11, r8)
            float r9 = (float) r3
            float r9 = r9 / r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x027a
            float r3 = (float) r10
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x027a:
            r1.d(r10)
            s.d r4 = r0.f11603b
            t.m r4 = r4.f11321e
            t.g r4 = r4.f11605e
            r4.d(r3)
            goto L_0x029f
        L_0x0287:
            return
        L_0x0288:
            s.d r3 = r4.f11307T
            if (r3 == 0) goto L_0x029f
            t.k r3 = r3.d
            t.g r3 = r3.f11605e
            boolean r9 = r3.f11587j
            if (r9 == 0) goto L_0x029f
            float r4 = r4.f11349w
            int r3 = r3.g
            float r3 = (float) r3
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
            r1.d(r3)
        L_0x029f:
            boolean r3 = r5.f11583c
            if (r3 == 0) goto L_0x0380
            boolean r3 = r6.f11583c
            if (r3 != 0) goto L_0x02a9
            goto L_0x0380
        L_0x02a9:
            boolean r3 = r5.f11587j
            if (r3 == 0) goto L_0x02b6
            boolean r3 = r6.f11587j
            if (r3 == 0) goto L_0x02b6
            boolean r3 = r1.f11587j
            if (r3 == 0) goto L_0x02b6
            return
        L_0x02b6:
            boolean r3 = r1.f11587j
            if (r3 != 0) goto L_0x02f1
            int r3 = r0.d
            r4 = 3
            if (r3 != r4) goto L_0x02f1
            s.d r3 = r0.f11603b
            int r4 = r3.f11344r
            if (r4 != 0) goto L_0x02f1
            boolean r3 = r3.x()
            if (r3 != 0) goto L_0x02f1
            java.util.ArrayList r3 = r5.f11589l
            java.lang.Object r3 = r3.get(r2)
            t.f r3 = (t.f) r3
            java.util.ArrayList r4 = r6.f11589l
            java.lang.Object r2 = r4.get(r2)
            t.f r2 = (t.f) r2
            int r3 = r3.g
            int r4 = r5.f11585f
            int r3 = r3 + r4
            int r2 = r2.g
            int r4 = r6.f11585f
            int r2 = r2 + r4
            int r4 = r2 - r3
            r5.d(r3)
            r6.d(r2)
            r1.d(r4)
            return
        L_0x02f1:
            boolean r3 = r1.f11587j
            if (r3 != 0) goto L_0x0342
            int r3 = r0.d
            r4 = 3
            if (r3 != r4) goto L_0x0342
            int r3 = r0.f11602a
            if (r3 != r8) goto L_0x0342
            java.util.ArrayList r3 = r5.f11589l
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0342
            java.util.ArrayList r3 = r6.f11589l
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0342
            java.util.ArrayList r3 = r5.f11589l
            java.lang.Object r3 = r3.get(r2)
            t.f r3 = (t.f) r3
            java.util.ArrayList r4 = r6.f11589l
            java.lang.Object r4 = r4.get(r2)
            t.f r4 = (t.f) r4
            int r3 = r3.g
            int r8 = r5.f11585f
            int r3 = r3 + r8
            int r4 = r4.g
            int r8 = r6.f11585f
            int r4 = r4 + r8
            int r4 = r4 - r3
            int r3 = r1.f11590m
            int r3 = java.lang.Math.min(r4, r3)
            s.d r4 = r0.f11603b
            int r8 = r4.f11348v
            int r4 = r4.f11347u
            int r3 = java.lang.Math.max(r4, r3)
            if (r8 <= 0) goto L_0x033f
            int r3 = java.lang.Math.min(r8, r3)
        L_0x033f:
            r1.d(r3)
        L_0x0342:
            boolean r3 = r1.f11587j
            if (r3 != 0) goto L_0x0347
            return
        L_0x0347:
            java.util.ArrayList r3 = r5.f11589l
            java.lang.Object r3 = r3.get(r2)
            t.f r3 = (t.f) r3
            java.util.ArrayList r4 = r6.f11589l
            java.lang.Object r2 = r4.get(r2)
            t.f r2 = (t.f) r2
            int r4 = r3.g
            int r8 = r5.f11585f
            int r8 = r8 + r4
            int r9 = r2.g
            int r10 = r6.f11585f
            int r10 = r10 + r9
            s.d r11 = r0.f11603b
            float r11 = r11.f11320d0
            if (r3 != r2) goto L_0x0369
            r11 = r7
            goto L_0x036b
        L_0x0369:
            r4 = r8
            r9 = r10
        L_0x036b:
            int r9 = r9 - r4
            int r2 = r1.g
            int r9 = r9 - r2
            float r2 = (float) r4
            float r2 = r2 + r7
            float r3 = (float) r9
            float r3 = r3 * r11
            float r3 = r3 + r2
            int r2 = (int) r3
            r5.d(r2)
            int r2 = r5.g
            int r1 = r1.g
            int r2 = r2 + r1
            r6.d(r2)
        L_0x0380:
            return
        L_0x0381:
            s.d r1 = r0.f11603b
            s.c r3 = r1.f11296I
            s.c r1 = r1.f11298K
            r0.l(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.k.a(t.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        r0 = r11.f11603b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r11 = this;
            s.d r0 = r11.f11603b
            boolean r1 = r0.f11314a
            t.g r2 = r11.f11605e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.q()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.f11587j
            t.f r1 = r11.f11607i
            t.f r3 = r11.h
            r4 = 1
            r5 = 3
            r6 = 4
            r7 = 0
            if (r0 != 0) goto L_0x0076
            s.d r0 = r11.f11603b
            int[] r8 = r0.f11342p0
            r8 = r8[r7]
            r11.d = r8
            if (r8 == r5) goto L_0x00a6
            if (r8 != r6) goto L_0x006c
            s.d r9 = r0.f11307T
            if (r9 == 0) goto L_0x006c
            int[] r10 = r9.f11342p0
            r10 = r10[r7]
            if (r10 == r4) goto L_0x0033
            if (r10 != r6) goto L_0x006c
        L_0x0033:
            int r0 = r9.q()
            s.d r4 = r11.f11603b
            s.c r4 = r4.f11296I
            int r4 = r4.e()
            int r0 = r0 - r4
            s.d r4 = r11.f11603b
            s.c r4 = r4.f11298K
            int r4 = r4.e()
            int r0 = r0 - r4
            t.k r4 = r9.d
            t.f r4 = r4.h
            s.d r5 = r11.f11603b
            s.c r5 = r5.f11296I
            int r5 = r5.e()
            t.o.b(r3, r4, r5)
            t.k r3 = r9.d
            t.f r3 = r3.f11607i
            s.d r4 = r11.f11603b
            s.c r4 = r4.f11298K
            int r4 = r4.e()
            int r4 = -r4
            t.o.b(r1, r3, r4)
            r2.d(r0)
            return
        L_0x006c:
            if (r8 != r4) goto L_0x00a6
            int r0 = r0.q()
            r2.d(r0)
            goto L_0x00a6
        L_0x0076:
            int r0 = r11.d
            if (r0 != r6) goto L_0x00a6
            s.d r0 = r11.f11603b
            s.d r8 = r0.f11307T
            if (r8 == 0) goto L_0x00a6
            int[] r9 = r8.f11342p0
            r9 = r9[r7]
            if (r9 == r4) goto L_0x0088
            if (r9 != r6) goto L_0x00a6
        L_0x0088:
            t.k r2 = r8.d
            t.f r2 = r2.h
            s.c r0 = r0.f11296I
            int r0 = r0.e()
            t.o.b(r3, r2, r0)
            t.k r0 = r8.d
            t.f r0 = r0.f11607i
            s.d r2 = r11.f11603b
            s.c r2 = r2.f11298K
            int r2 = r2.e()
            int r2 = -r2
            t.o.b(r1, r0, r2)
            return
        L_0x00a6:
            boolean r0 = r2.f11587j
            if (r0 == 0) goto L_0x017d
            s.d r0 = r11.f11603b
            boolean r8 = r0.f11314a
            if (r8 == 0) goto L_0x017d
            s.c[] r5 = r0.f11304Q
            r6 = r5[r7]
            s.c r8 = r6.f11287f
            if (r8 == 0) goto L_0x0118
            r9 = r5[r4]
            s.c r9 = r9.f11287f
            if (r9 == 0) goto L_0x0118
            boolean r0 = r0.x()
            if (r0 == 0) goto L_0x00df
            s.d r0 = r11.f11603b
            s.c[] r0 = r0.f11304Q
            r0 = r0[r7]
            int r0 = r0.e()
            r3.f11585f = r0
            s.d r0 = r11.f11603b
            s.c[] r0 = r0.f11304Q
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f11585f = r0
            goto L_0x0313
        L_0x00df:
            s.d r0 = r11.f11603b
            s.c[] r0 = r0.f11304Q
            r0 = r0[r7]
            t.f r0 = t.o.h(r0)
            if (r0 == 0) goto L_0x00f8
            s.d r2 = r11.f11603b
            s.c[] r2 = r2.f11304Q
            r2 = r2[r7]
            int r2 = r2.e()
            t.o.b(r3, r0, r2)
        L_0x00f8:
            s.d r0 = r11.f11603b
            s.c[] r0 = r0.f11304Q
            r0 = r0[r4]
            t.f r0 = t.o.h(r0)
            if (r0 == 0) goto L_0x0112
            s.d r2 = r11.f11603b
            s.c[] r2 = r2.f11304Q
            r2 = r2[r4]
            int r2 = r2.e()
            int r2 = -r2
            t.o.b(r1, r0, r2)
        L_0x0112:
            r3.f11582b = r4
            r1.f11582b = r4
            goto L_0x0313
        L_0x0118:
            if (r8 == 0) goto L_0x0134
            t.f r0 = t.o.h(r6)
            if (r0 == 0) goto L_0x0313
            s.d r4 = r11.f11603b
            s.c[] r4 = r4.f11304Q
            r4 = r4[r7]
            int r4 = r4.e()
            t.o.b(r3, r0, r4)
            int r0 = r2.g
            t.o.b(r1, r3, r0)
            goto L_0x0313
        L_0x0134:
            r5 = r5[r4]
            s.c r6 = r5.f11287f
            if (r6 == 0) goto L_0x0156
            t.f r0 = t.o.h(r5)
            if (r0 == 0) goto L_0x0313
            s.d r5 = r11.f11603b
            s.c[] r5 = r5.f11304Q
            r4 = r5[r4]
            int r4 = r4.e()
            int r4 = -r4
            t.o.b(r1, r0, r4)
            int r0 = r2.g
            int r0 = -r0
            t.o.b(r3, r1, r0)
            goto L_0x0313
        L_0x0156:
            boolean r4 = r0 instanceof s.i
            if (r4 != 0) goto L_0x0313
            s.d r4 = r0.f11307T
            if (r4 == 0) goto L_0x0313
            r4 = 7
            s.c r0 = r0.i(r4)
            s.c r0 = r0.f11287f
            if (r0 != 0) goto L_0x0313
            s.d r0 = r11.f11603b
            s.d r4 = r0.f11307T
            t.k r4 = r4.d
            t.f r4 = r4.h
            int r0 = r0.r()
            t.o.b(r3, r4, r0)
            int r0 = r2.g
            t.o.b(r1, r3, r0)
            goto L_0x0313
        L_0x017d:
            int r0 = r11.d
            if (r0 != r5) goto L_0x0273
            s.d r0 = r11.f11603b
            int r8 = r0.f11344r
            r9 = 2
            if (r8 == r9) goto L_0x0254
            if (r8 == r5) goto L_0x018c
            goto L_0x0273
        L_0x018c:
            int r8 = r0.f11345s
            if (r8 != r5) goto L_0x0219
            r3.f11581a = r11
            r1.f11581a = r11
            t.m r5 = r0.f11321e
            t.f r8 = r5.h
            r8.f11581a = r11
            t.f r5 = r5.f11607i
            r5.f11581a = r11
            r2.f11581a = r11
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x01ee
            java.util.ArrayList r0 = r2.f11589l
            s.d r5 = r11.f11603b
            t.m r5 = r5.f11321e
            t.g r5 = r5.f11605e
            r0.add(r5)
            s.d r0 = r11.f11603b
            t.m r0 = r0.f11321e
            t.g r0 = r0.f11605e
            java.util.ArrayList r0 = r0.f11588k
            r0.add(r2)
            s.d r0 = r11.f11603b
            t.m r0 = r0.f11321e
            t.g r5 = r0.f11605e
            r5.f11581a = r11
            java.util.ArrayList r5 = r2.f11589l
            t.f r0 = r0.h
            r5.add(r0)
            java.util.ArrayList r0 = r2.f11589l
            s.d r5 = r11.f11603b
            t.m r5 = r5.f11321e
            t.f r5 = r5.f11607i
            r0.add(r5)
            s.d r0 = r11.f11603b
            t.m r0 = r0.f11321e
            t.f r0 = r0.h
            java.util.ArrayList r0 = r0.f11588k
            r0.add(r2)
            s.d r0 = r11.f11603b
            t.m r0 = r0.f11321e
            t.f r0 = r0.f11607i
            java.util.ArrayList r0 = r0.f11588k
            r0.add(r2)
            goto L_0x0273
        L_0x01ee:
            s.d r0 = r11.f11603b
            boolean r0 = r0.x()
            if (r0 == 0) goto L_0x020d
            s.d r0 = r11.f11603b
            t.m r0 = r0.f11321e
            t.g r0 = r0.f11605e
            java.util.ArrayList r0 = r0.f11589l
            r0.add(r2)
            java.util.ArrayList r0 = r2.f11588k
            s.d r5 = r11.f11603b
            t.m r5 = r5.f11321e
            t.g r5 = r5.f11605e
            r0.add(r5)
            goto L_0x0273
        L_0x020d:
            s.d r0 = r11.f11603b
            t.m r0 = r0.f11321e
            t.g r0 = r0.f11605e
            java.util.ArrayList r0 = r0.f11589l
            r0.add(r2)
            goto L_0x0273
        L_0x0219:
            t.m r0 = r0.f11321e
            t.g r0 = r0.f11605e
            java.util.ArrayList r5 = r2.f11589l
            r5.add(r0)
            java.util.ArrayList r0 = r0.f11588k
            r0.add(r2)
            s.d r0 = r11.f11603b
            t.m r0 = r0.f11321e
            t.f r0 = r0.h
            java.util.ArrayList r0 = r0.f11588k
            r0.add(r2)
            s.d r0 = r11.f11603b
            t.m r0 = r0.f11321e
            t.f r0 = r0.f11607i
            java.util.ArrayList r0 = r0.f11588k
            r0.add(r2)
            r2.f11582b = r4
            java.util.ArrayList r0 = r2.f11588k
            r0.add(r3)
            java.util.ArrayList r0 = r2.f11588k
            r0.add(r1)
            java.util.ArrayList r0 = r3.f11589l
            r0.add(r2)
            java.util.ArrayList r0 = r1.f11589l
            r0.add(r2)
            goto L_0x0273
        L_0x0254:
            s.d r0 = r0.f11307T
            if (r0 != 0) goto L_0x0259
            goto L_0x0273
        L_0x0259:
            t.m r0 = r0.f11321e
            t.g r0 = r0.f11605e
            java.util.ArrayList r5 = r2.f11589l
            r5.add(r0)
            java.util.ArrayList r0 = r0.f11588k
            r0.add(r2)
            r2.f11582b = r4
            java.util.ArrayList r0 = r2.f11588k
            r0.add(r3)
            java.util.ArrayList r0 = r2.f11588k
            r0.add(r1)
        L_0x0273:
            s.d r0 = r11.f11603b
            s.c[] r5 = r0.f11304Q
            r8 = r5[r7]
            s.c r9 = r8.f11287f
            if (r9 == 0) goto L_0x02c5
            r10 = r5[r4]
            s.c r10 = r10.f11287f
            if (r10 == 0) goto L_0x02c5
            boolean r0 = r0.x()
            if (r0 == 0) goto L_0x02a4
            s.d r0 = r11.f11603b
            s.c[] r0 = r0.f11304Q
            r0 = r0[r7]
            int r0 = r0.e()
            r3.f11585f = r0
            s.d r0 = r11.f11603b
            s.c[] r0 = r0.f11304Q
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f11585f = r0
            goto L_0x0313
        L_0x02a4:
            s.d r0 = r11.f11603b
            s.c[] r0 = r0.f11304Q
            r0 = r0[r7]
            t.f r0 = t.o.h(r0)
            s.d r1 = r11.f11603b
            s.c[] r1 = r1.f11304Q
            r1 = r1[r4]
            t.f r1 = t.o.h(r1)
            if (r0 == 0) goto L_0x02bd
            r0.b(r11)
        L_0x02bd:
            if (r1 == 0) goto L_0x02c2
            r1.b(r11)
        L_0x02c2:
            r11.f11608j = r6
            goto L_0x0313
        L_0x02c5:
            if (r9 == 0) goto L_0x02de
            t.f r0 = t.o.h(r8)
            if (r0 == 0) goto L_0x0313
            s.d r5 = r11.f11603b
            s.c[] r5 = r5.f11304Q
            r5 = r5[r7]
            int r5 = r5.e()
            t.o.b(r3, r0, r5)
            r11.c(r1, r3, r4, r2)
            goto L_0x0313
        L_0x02de:
            r5 = r5[r4]
            s.c r6 = r5.f11287f
            if (r6 == 0) goto L_0x02fd
            t.f r0 = t.o.h(r5)
            if (r0 == 0) goto L_0x0313
            s.d r5 = r11.f11603b
            s.c[] r5 = r5.f11304Q
            r4 = r5[r4]
            int r4 = r4.e()
            int r4 = -r4
            t.o.b(r1, r0, r4)
            r0 = -1
            r11.c(r3, r1, r0, r2)
            goto L_0x0313
        L_0x02fd:
            boolean r5 = r0 instanceof s.i
            if (r5 != 0) goto L_0x0313
            s.d r5 = r0.f11307T
            if (r5 == 0) goto L_0x0313
            t.k r5 = r5.d
            t.f r5 = r5.h
            int r0 = r0.r()
            t.o.b(r3, r5, r0)
            r11.c(r1, r3, r4, r2)
        L_0x0313:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.k.d():void");
    }

    public final void e() {
        f fVar = this.h;
        if (fVar.f11587j) {
            this.f11603b.f11312Y = fVar.g;
        }
    }

    public final void f() {
        this.f11604c = null;
        this.h.c();
        this.f11607i.c();
        this.f11605e.c();
        this.g = false;
    }

    public final boolean k() {
        if (this.d != 3 || this.f11603b.f11344r == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f11587j = false;
        f fVar2 = this.f11607i;
        fVar2.c();
        fVar2.f11587j = false;
        this.f11605e.f11587j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f11603b.f11326h0;
    }
}
