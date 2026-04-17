package t;

import java.util.ArrayList;
import java.util.Iterator;
import s.c;
import s.d;
import s.e;

/* renamed from: t.c  reason: case insensitive filesystem */
public final class C0977c extends o {

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f11574k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public int f11575l;

    public C0977c(d dVar, int i2) {
        super(dVar);
        d dVar2;
        Object obj;
        int i5;
        Object obj2;
        this.f11606f = i2;
        d dVar3 = this.f11603b;
        d m6 = dVar3.m(i2);
        while (true) {
            d dVar4 = m6;
            dVar2 = dVar3;
            dVar3 = dVar4;
            if (dVar3 == null) {
                break;
            }
            m6 = dVar3.m(this.f11606f);
        }
        this.f11603b = dVar2;
        int i6 = this.f11606f;
        if (i6 == 0) {
            obj = dVar2.d;
        } else if (i6 == 1) {
            obj = dVar2.f11321e;
        } else {
            obj = null;
        }
        ArrayList arrayList = this.f11574k;
        arrayList.add(obj);
        d l6 = dVar2.l(this.f11606f);
        while (l6 != null) {
            int i7 = this.f11606f;
            if (i7 == 0) {
                obj2 = l6.d;
            } else if (i7 == 1) {
                obj2 = l6.f11321e;
            } else {
                obj2 = null;
            }
            arrayList.add(obj2);
            l6 = l6.l(this.f11606f);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            o oVar = (o) it2.next();
            int i8 = this.f11606f;
            if (i8 == 0) {
                oVar.f11603b.f11316b = this;
            } else if (i8 == 1) {
                oVar.f11603b.f11318c = this;
            }
        }
        if (this.f11606f == 0 && ((e) this.f11603b.f11307T).f11368v0 && arrayList.size() > 1) {
            this.f11603b = ((o) arrayList.get(arrayList.size() - 1)).f11603b;
        }
        if (this.f11606f == 0) {
            i5 = this.f11603b.f11328i0;
        } else {
            i5 = this.f11603b.f11330j0;
        }
        this.f11575l = i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(t.d r27) {
        /*
            r26 = this;
            r0 = r26
            t.f r1 = r0.h
            boolean r2 = r1.f11587j
            if (r2 == 0) goto L_0x03c8
            t.f r2 = r0.f11607i
            boolean r3 = r2.f11587j
            if (r3 != 0) goto L_0x0010
            goto L_0x03c8
        L_0x0010:
            s.d r3 = r0.f11603b
            s.d r3 = r3.f11307T
            boolean r4 = r3 instanceof s.e
            if (r4 == 0) goto L_0x001d
            s.e r3 = (s.e) r3
            boolean r3 = r3.f11368v0
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            int r4 = r2.g
            int r6 = r1.g
            int r4 = r4 - r6
            java.util.ArrayList r6 = r0.f11574k
            int r7 = r6.size()
            r8 = 0
        L_0x002a:
            r9 = -1
            r10 = 8
            if (r8 >= r7) goto L_0x003e
            java.lang.Object r11 = r6.get(r8)
            t.o r11 = (t.o) r11
            s.d r11 = r11.f11603b
            int r11 = r11.f11325g0
            if (r11 != r10) goto L_0x003f
            int r8 = r8 + 1
            goto L_0x002a
        L_0x003e:
            r8 = r9
        L_0x003f:
            int r11 = r7 + -1
            r12 = r11
        L_0x0042:
            if (r12 < 0) goto L_0x0054
            java.lang.Object r13 = r6.get(r12)
            t.o r13 = (t.o) r13
            s.d r13 = r13.f11603b
            int r13 = r13.f11325g0
            if (r13 != r10) goto L_0x0053
            int r12 = r12 + -1
            goto L_0x0042
        L_0x0053:
            r9 = r12
        L_0x0054:
            r12 = 0
        L_0x0055:
            r5 = 2
            if (r12 >= r5) goto L_0x0107
            r5 = 0
            r14 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x0060:
            if (r5 >= r7) goto L_0x00ef
            java.lang.Object r20 = r6.get(r5)
            r13 = r20
            t.o r13 = (t.o) r13
            s.d r15 = r13.f11603b
            r21 = r6
            int r6 = r15.f11325g0
            if (r6 != r10) goto L_0x0076
            r23 = r8
            goto L_0x00e5
        L_0x0076:
            int r18 = r18 + 1
            if (r5 <= 0) goto L_0x0081
            if (r5 < r8) goto L_0x0081
            t.f r6 = r13.h
            int r6 = r6.f11585f
            int r14 = r14 + r6
        L_0x0081:
            t.g r6 = r13.f11605e
            int r10 = r6.g
            r22 = r10
            int r10 = r13.d
            r23 = r8
            r8 = 3
            if (r10 == r8) goto L_0x0090
            r8 = 1
            goto L_0x0091
        L_0x0090:
            r8 = 0
        L_0x0091:
            if (r8 == 0) goto L_0x00af
            int r6 = r0.f11606f
            if (r6 != 0) goto L_0x00a0
            t.k r10 = r15.d
            t.g r10 = r10.f11605e
            boolean r10 = r10.f11587j
            if (r10 != 0) goto L_0x00a0
            return
        L_0x00a0:
            r10 = 1
            if (r6 != r10) goto L_0x00ac
            t.m r6 = r15.f11321e
            t.g r6 = r6.f11605e
            boolean r6 = r6.f11587j
            if (r6 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r24 = r8
            goto L_0x00c6
        L_0x00af:
            r24 = r8
            r10 = 1
            int r8 = r13.f11602a
            if (r8 != r10) goto L_0x00bf
            if (r12 != 0) goto L_0x00bf
            int r10 = r6.f11590m
            int r17 = r17 + 1
        L_0x00bc:
            r24 = 1
            goto L_0x00c8
        L_0x00bf:
            boolean r6 = r6.f11587j
            if (r6 == 0) goto L_0x00c6
            r10 = r22
            goto L_0x00bc
        L_0x00c6:
            r10 = r22
        L_0x00c8:
            if (r24 != 0) goto L_0x00da
            int r17 = r17 + 1
            float[] r6 = r15.f11332k0
            int r8 = r0.f11606f
            r6 = r6[r8]
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x00db
            float r19 = r19 + r6
            goto L_0x00db
        L_0x00da:
            int r14 = r14 + r10
        L_0x00db:
            if (r5 >= r11) goto L_0x00e5
            if (r5 >= r9) goto L_0x00e5
            t.f r6 = r13.f11607i
            int r6 = r6.f11585f
            int r6 = -r6
            int r14 = r14 + r6
        L_0x00e5:
            int r5 = r5 + 1
            r6 = r21
            r8 = r23
            r10 = 8
            goto L_0x0060
        L_0x00ef:
            r21 = r6
            r23 = r8
            if (r14 < r4) goto L_0x0102
            if (r17 != 0) goto L_0x00f8
            goto L_0x0102
        L_0x00f8:
            int r12 = r12 + 1
            r6 = r21
            r8 = r23
            r10 = 8
            goto L_0x0055
        L_0x0102:
            r5 = r17
            r6 = r18
            goto L_0x0110
        L_0x0107:
            r21 = r6
            r23 = r8
            r5 = 0
            r6 = 0
            r14 = 0
            r19 = 0
        L_0x0110:
            int r1 = r1.g
            if (r3 == 0) goto L_0x0116
            int r1 = r2.g
        L_0x0116:
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r4) goto L_0x012d
            r8 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L_0x0126
            int r10 = r14 - r4
            float r10 = (float) r10
            float r10 = r10 / r8
            float r10 = r10 + r2
            int r8 = (int) r10
            int r1 = r1 + r8
            goto L_0x012d
        L_0x0126:
            int r10 = r14 - r4
            float r10 = (float) r10
            float r10 = r10 / r8
            float r10 = r10 + r2
            int r8 = (int) r10
            int r1 = r1 - r8
        L_0x012d:
            if (r5 <= 0) goto L_0x020f
            int r8 = r4 - r14
            float r8 = (float) r8
            float r10 = (float) r5
            float r10 = r8 / r10
            float r10 = r10 + r2
            int r10 = (int) r10
            r12 = 0
            r13 = 0
        L_0x0139:
            if (r12 >= r7) goto L_0x01bc
            r15 = r21
            java.lang.Object r17 = r15.get(r12)
            r2 = r17
            t.o r2 = (t.o) r2
            r17 = r10
            s.d r10 = r2.f11603b
            r21 = r14
            int r14 = r10.f11325g0
            r22 = r1
            r1 = 8
            if (r14 != r1) goto L_0x0158
        L_0x0153:
            r24 = r3
            r25 = r8
            goto L_0x01aa
        L_0x0158:
            int r1 = r2.d
            r14 = 3
            if (r1 != r14) goto L_0x0153
            t.g r1 = r2.f11605e
            boolean r14 = r1.f11587j
            if (r14 != 0) goto L_0x0153
            r14 = 0
            int r16 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x0178
            float[] r14 = r10.f11332k0
            r24 = r3
            int r3 = r0.f11606f
            r3 = r14[r3]
            float r3 = r3 * r8
            float r3 = r3 / r19
            r14 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r14
            int r3 = (int) r3
            goto L_0x017c
        L_0x0178:
            r24 = r3
            r3 = r17
        L_0x017c:
            int r14 = r0.f11606f
            if (r14 != 0) goto L_0x0185
            int r14 = r10.f11348v
            int r10 = r10.f11347u
            goto L_0x0189
        L_0x0185:
            int r14 = r10.f11351y
            int r10 = r10.f11350x
        L_0x0189:
            int r2 = r2.f11602a
            r25 = r8
            r8 = 1
            if (r2 != r8) goto L_0x0197
            int r2 = r1.f11590m
            int r2 = java.lang.Math.min(r3, r2)
            goto L_0x0198
        L_0x0197:
            r2 = r3
        L_0x0198:
            int r2 = java.lang.Math.max(r10, r2)
            if (r14 <= 0) goto L_0x01a2
            int r2 = java.lang.Math.min(r14, r2)
        L_0x01a2:
            if (r2 == r3) goto L_0x01a7
            int r13 = r13 + 1
            r3 = r2
        L_0x01a7:
            r1.d(r3)
        L_0x01aa:
            int r12 = r12 + 1
            r10 = r17
            r14 = r21
            r1 = r22
            r3 = r24
            r8 = r25
            r2 = 1056964608(0x3f000000, float:0.5)
            r21 = r15
            goto L_0x0139
        L_0x01bc:
            r22 = r1
            r24 = r3
            r15 = r21
            r21 = r14
            if (r13 <= 0) goto L_0x01fe
            int r5 = r5 - r13
            r1 = 0
            r14 = 0
        L_0x01c9:
            if (r1 >= r7) goto L_0x01fb
            java.lang.Object r2 = r15.get(r1)
            t.o r2 = (t.o) r2
            s.d r3 = r2.f11603b
            int r3 = r3.f11325g0
            r8 = 8
            if (r3 != r8) goto L_0x01dc
            r8 = r23
            goto L_0x01f6
        L_0x01dc:
            r8 = r23
            if (r1 <= 0) goto L_0x01e7
            if (r1 < r8) goto L_0x01e7
            t.f r3 = r2.h
            int r3 = r3.f11585f
            int r14 = r14 + r3
        L_0x01e7:
            t.g r3 = r2.f11605e
            int r3 = r3.g
            int r14 = r14 + r3
            if (r1 >= r11) goto L_0x01f6
            if (r1 >= r9) goto L_0x01f6
            t.f r2 = r2.f11607i
            int r2 = r2.f11585f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x01f6:
            int r1 = r1 + 1
            r23 = r8
            goto L_0x01c9
        L_0x01fb:
            r8 = r23
            goto L_0x0202
        L_0x01fe:
            r8 = r23
            r14 = r21
        L_0x0202:
            int r1 = r0.f11575l
            r2 = 2
            if (r1 != r2) goto L_0x020d
            if (r13 != 0) goto L_0x020d
            r1 = 0
            r0.f11575l = r1
            goto L_0x021b
        L_0x020d:
            r1 = 0
            goto L_0x021b
        L_0x020f:
            r22 = r1
            r24 = r3
            r15 = r21
            r8 = r23
            r1 = 0
            r2 = 2
            r21 = r14
        L_0x021b:
            if (r14 <= r4) goto L_0x021f
            r0.f11575l = r2
        L_0x021f:
            if (r6 <= 0) goto L_0x0227
            if (r5 != 0) goto L_0x0227
            if (r8 != r9) goto L_0x0227
            r0.f11575l = r2
        L_0x0227:
            int r2 = r0.f11575l
            r3 = 1
            if (r2 != r3) goto L_0x02b3
            if (r6 <= r3) goto L_0x0232
            int r4 = r4 - r14
            int r6 = r6 - r3
            int r4 = r4 / r6
            goto L_0x0239
        L_0x0232:
            if (r6 != r3) goto L_0x0238
            int r4 = r4 - r14
            r2 = 2
            int r4 = r4 / r2
            goto L_0x0239
        L_0x0238:
            r4 = r1
        L_0x0239:
            if (r5 <= 0) goto L_0x023c
            r4 = r1
        L_0x023c:
            r5 = r1
            r1 = r22
        L_0x023f:
            if (r5 >= r7) goto L_0x03c8
            if (r24 == 0) goto L_0x0248
            int r2 = r5 + 1
            int r2 = r7 - r2
            goto L_0x0249
        L_0x0248:
            r2 = r5
        L_0x0249:
            java.lang.Object r2 = r15.get(r2)
            t.o r2 = (t.o) r2
            s.d r3 = r2.f11603b
            int r3 = r3.f11325g0
            t.f r6 = r2.f11607i
            t.f r10 = r2.h
            r12 = 8
            if (r3 != r12) goto L_0x0262
            r10.d(r1)
            r6.d(r1)
            goto L_0x02b0
        L_0x0262:
            if (r5 <= 0) goto L_0x0269
            if (r24 == 0) goto L_0x0268
            int r1 = r1 - r4
            goto L_0x0269
        L_0x0268:
            int r1 = r1 + r4
        L_0x0269:
            if (r5 <= 0) goto L_0x0276
            if (r5 < r8) goto L_0x0276
            if (r24 == 0) goto L_0x0273
            int r3 = r10.f11585f
            int r1 = r1 - r3
            goto L_0x0276
        L_0x0273:
            int r3 = r10.f11585f
            int r1 = r1 + r3
        L_0x0276:
            if (r24 == 0) goto L_0x027c
            r6.d(r1)
            goto L_0x027f
        L_0x027c:
            r10.d(r1)
        L_0x027f:
            t.g r3 = r2.f11605e
            int r12 = r3.g
            int r13 = r2.d
            r14 = 3
            if (r13 != r14) goto L_0x028f
            int r13 = r2.f11602a
            r14 = 1
            if (r13 != r14) goto L_0x028f
            int r12 = r3.f11590m
        L_0x028f:
            if (r24 == 0) goto L_0x0293
            int r1 = r1 - r12
            goto L_0x0294
        L_0x0293:
            int r1 = r1 + r12
        L_0x0294:
            if (r24 == 0) goto L_0x029b
            r10.d(r1)
        L_0x0299:
            r3 = 1
            goto L_0x029f
        L_0x029b:
            r6.d(r1)
            goto L_0x0299
        L_0x029f:
            r2.g = r3
            if (r5 >= r11) goto L_0x02b0
            if (r5 >= r9) goto L_0x02b0
            if (r24 == 0) goto L_0x02ac
            int r2 = r6.f11585f
            int r2 = -r2
            int r1 = r1 - r2
            goto L_0x02b0
        L_0x02ac:
            int r2 = r6.f11585f
            int r2 = -r2
            int r1 = r1 + r2
        L_0x02b0:
            int r5 = r5 + 1
            goto L_0x023f
        L_0x02b3:
            if (r2 != 0) goto L_0x0331
            int r4 = r4 - r14
            r2 = 1
            int r6 = r6 + r2
            int r4 = r4 / r6
            if (r5 <= 0) goto L_0x02bc
            r4 = r1
        L_0x02bc:
            r5 = r1
            r1 = r22
        L_0x02bf:
            if (r5 >= r7) goto L_0x03c8
            if (r24 == 0) goto L_0x02c8
            int r2 = r5 + 1
            int r2 = r7 - r2
            goto L_0x02c9
        L_0x02c8:
            r2 = r5
        L_0x02c9:
            java.lang.Object r2 = r15.get(r2)
            t.o r2 = (t.o) r2
            s.d r3 = r2.f11603b
            int r3 = r3.f11325g0
            t.f r6 = r2.f11607i
            t.f r10 = r2.h
            r12 = 8
            if (r3 != r12) goto L_0x02e2
            r10.d(r1)
            r6.d(r1)
            goto L_0x032e
        L_0x02e2:
            if (r24 == 0) goto L_0x02e6
            int r1 = r1 - r4
            goto L_0x02e7
        L_0x02e6:
            int r1 = r1 + r4
        L_0x02e7:
            if (r5 <= 0) goto L_0x02f4
            if (r5 < r8) goto L_0x02f4
            if (r24 == 0) goto L_0x02f1
            int r3 = r10.f11585f
            int r1 = r1 - r3
            goto L_0x02f4
        L_0x02f1:
            int r3 = r10.f11585f
            int r1 = r1 + r3
        L_0x02f4:
            if (r24 == 0) goto L_0x02fa
            r6.d(r1)
            goto L_0x02fd
        L_0x02fa:
            r10.d(r1)
        L_0x02fd:
            t.g r3 = r2.f11605e
            int r12 = r3.g
            int r13 = r2.d
            r14 = 3
            if (r13 != r14) goto L_0x0311
            int r2 = r2.f11602a
            r13 = 1
            if (r2 != r13) goto L_0x0311
            int r2 = r3.f11590m
            int r12 = java.lang.Math.min(r12, r2)
        L_0x0311:
            if (r24 == 0) goto L_0x0315
            int r1 = r1 - r12
            goto L_0x0316
        L_0x0315:
            int r1 = r1 + r12
        L_0x0316:
            if (r24 == 0) goto L_0x031c
            r10.d(r1)
            goto L_0x031f
        L_0x031c:
            r6.d(r1)
        L_0x031f:
            if (r5 >= r11) goto L_0x032e
            if (r5 >= r9) goto L_0x032e
            if (r24 == 0) goto L_0x032a
            int r2 = r6.f11585f
            int r2 = -r2
            int r1 = r1 - r2
            goto L_0x032e
        L_0x032a:
            int r2 = r6.f11585f
            int r2 = -r2
            int r1 = r1 + r2
        L_0x032e:
            int r5 = r5 + 1
            goto L_0x02bf
        L_0x0331:
            r3 = 2
            if (r2 != r3) goto L_0x03c8
            int r2 = r0.f11606f
            if (r2 != 0) goto L_0x033d
            s.d r2 = r0.f11603b
            float r2 = r2.f11320d0
            goto L_0x0341
        L_0x033d:
            s.d r2 = r0.f11603b
            float r2 = r2.f11322e0
        L_0x0341:
            if (r24 == 0) goto L_0x0347
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3 - r2
        L_0x0347:
            int r4 = r4 - r14
            float r3 = (float) r4
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x0352
            if (r5 <= 0) goto L_0x0353
        L_0x0352:
            r2 = r1
        L_0x0353:
            if (r24 == 0) goto L_0x0358
            int r2 = r22 - r2
            goto L_0x035a
        L_0x0358:
            int r2 = r22 + r2
        L_0x035a:
            r5 = r1
        L_0x035b:
            if (r5 >= r7) goto L_0x03c8
            if (r24 == 0) goto L_0x0364
            int r1 = r5 + 1
            int r1 = r7 - r1
            goto L_0x0365
        L_0x0364:
            r1 = r5
        L_0x0365:
            java.lang.Object r1 = r15.get(r1)
            t.o r1 = (t.o) r1
            s.d r3 = r1.f11603b
            int r3 = r3.f11325g0
            t.f r4 = r1.f11607i
            t.f r6 = r1.h
            r10 = 8
            if (r3 != r10) goto L_0x0380
            r6.d(r2)
            r4.d(r2)
            r13 = 1
            r14 = 3
            goto L_0x03c5
        L_0x0380:
            if (r5 <= 0) goto L_0x038d
            if (r5 < r8) goto L_0x038d
            if (r24 == 0) goto L_0x038a
            int r3 = r6.f11585f
            int r2 = r2 - r3
            goto L_0x038d
        L_0x038a:
            int r3 = r6.f11585f
            int r2 = r2 + r3
        L_0x038d:
            if (r24 == 0) goto L_0x0393
            r4.d(r2)
            goto L_0x0396
        L_0x0393:
            r6.d(r2)
        L_0x0396:
            t.g r3 = r1.f11605e
            int r12 = r3.g
            int r13 = r1.d
            r14 = 3
            if (r13 != r14) goto L_0x03a7
            int r1 = r1.f11602a
            r13 = 1
            if (r1 != r13) goto L_0x03a8
            int r12 = r3.f11590m
            goto L_0x03a8
        L_0x03a7:
            r13 = 1
        L_0x03a8:
            if (r24 == 0) goto L_0x03ac
            int r2 = r2 - r12
            goto L_0x03ad
        L_0x03ac:
            int r2 = r2 + r12
        L_0x03ad:
            if (r24 == 0) goto L_0x03b3
            r6.d(r2)
            goto L_0x03b6
        L_0x03b3:
            r4.d(r2)
        L_0x03b6:
            if (r5 >= r11) goto L_0x03c5
            if (r5 >= r9) goto L_0x03c5
            if (r24 == 0) goto L_0x03c1
            int r1 = r4.f11585f
            int r1 = -r1
            int r2 = r2 - r1
            goto L_0x03c5
        L_0x03c1:
            int r1 = r4.f11585f
            int r1 = -r1
            int r2 = r2 + r1
        L_0x03c5:
            int r5 = r5 + 1
            goto L_0x035b
        L_0x03c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0977c.a(t.d):void");
    }

    public final void d() {
        ArrayList arrayList = this.f11574k;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((o) it2.next()).d();
        }
        int size = arrayList.size();
        if (size >= 1) {
            d dVar = ((o) arrayList.get(0)).f11603b;
            d dVar2 = ((o) arrayList.get(size - 1)).f11603b;
            int i2 = this.f11606f;
            f fVar = this.f11607i;
            f fVar2 = this.h;
            if (i2 == 0) {
                c cVar = dVar.f11296I;
                c cVar2 = dVar2.f11298K;
                f i5 = o.i(cVar, 0);
                int e6 = cVar.e();
                d m6 = m();
                if (m6 != null) {
                    e6 = m6.f11296I.e();
                }
                if (i5 != null) {
                    o.b(fVar2, i5, e6);
                }
                f i6 = o.i(cVar2, 0);
                int e7 = cVar2.e();
                d n2 = n();
                if (n2 != null) {
                    e7 = n2.f11298K.e();
                }
                if (i6 != null) {
                    o.b(fVar, i6, -e7);
                }
            } else {
                c cVar3 = dVar.f11297J;
                c cVar4 = dVar2.f11299L;
                f i7 = o.i(cVar3, 1);
                int e8 = cVar3.e();
                d m7 = m();
                if (m7 != null) {
                    e8 = m7.f11297J.e();
                }
                if (i7 != null) {
                    o.b(fVar2, i7, e8);
                }
                f i8 = o.i(cVar4, 1);
                int e9 = cVar4.e();
                d n6 = n();
                if (n6 != null) {
                    e9 = n6.f11299L.e();
                }
                if (i8 != null) {
                    o.b(fVar, i8, -e9);
                }
            }
            fVar2.f11581a = this;
            fVar.f11581a = this;
        }
    }

    public final void e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f11574k;
            if (i2 < arrayList.size()) {
                ((o) arrayList.get(i2)).e();
                i2++;
            } else {
                return;
            }
        }
    }

    public final void f() {
        this.f11604c = null;
        Iterator it2 = this.f11574k.iterator();
        while (it2.hasNext()) {
            ((o) it2.next()).f();
        }
    }

    public final long j() {
        ArrayList arrayList = this.f11574k;
        int size = arrayList.size();
        long j6 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = (o) arrayList.get(i2);
            j6 = ((long) oVar.f11607i.f11585f) + oVar.j() + j6 + ((long) oVar.h.f11585f);
        }
        return j6;
    }

    public final boolean k() {
        ArrayList arrayList = this.f11574k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((o) arrayList.get(i2)).k()) {
                return false;
            }
        }
        return true;
    }

    public final d m() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f11574k;
            if (i2 >= arrayList.size()) {
                return null;
            }
            d dVar = ((o) arrayList.get(i2)).f11603b;
            if (dVar.f11325g0 != 8) {
                return dVar;
            }
            i2++;
        }
    }

    public final d n() {
        ArrayList arrayList = this.f11574k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = ((o) arrayList.get(size)).f11603b;
            if (dVar.f11325g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f11606f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator it2 = this.f11574k.iterator();
        while (it2.hasNext()) {
            sb.append("<");
            sb.append((o) it2.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
