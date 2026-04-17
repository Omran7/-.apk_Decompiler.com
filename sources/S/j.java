package s;

import q.C0926c;
import q.C0929f;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean[] f11427a = new boolean[3];

    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0283, code lost:
        if (r2.d == r7) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0109, code lost:
        if (r4.d == r13) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x059b  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x05a4  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0674  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x06bb  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x06bd  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x06c8  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x06d1  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x06d4  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x06d8  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x06e8  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x0113 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(s.e r36, q.C0926c r37, java.util.ArrayList r38, int r39) {
        /*
            r0 = r36
            r10 = r37
            r11 = r38
            r12 = 2
            if (r39 != 0) goto L_0x0012
            int r1 = r0.f11372z0
            s.b[] r2 = r0.f11355C0
            r14 = r1
            r15 = r2
            r16 = 0
            goto L_0x001a
        L_0x0012:
            int r1 = r0.f11353A0
            s.b[] r2 = r0.f11354B0
            r14 = r1
            r15 = r2
            r16 = r12
        L_0x001a:
            r9 = 0
        L_0x001b:
            if (r9 >= r14) goto L_0x0714
            r1 = r15[r9]
            boolean r2 = r1.f11282q
            s.d r8 = r1.f11269a
            r3 = 3
            r4 = 1
            r7 = 8
            r17 = 0
            if (r2 != 0) goto L_0x0155
            int r2 = r1.f11277l
            int r6 = r2 * 2
            r13 = r8
            r20 = r13
            r18 = 0
        L_0x0034:
            if (r18 != 0) goto L_0x011f
            int r5 = r1.f11274i
            int r5 = r5 + r4
            r1.f11274i = r5
            s.d[] r5 = r13.f11336m0
            r5[r2] = r17
            s.d[] r5 = r13.f11334l0
            r5[r2] = r17
            int r5 = r13.f11325g0
            s.c[] r4 = r13.f11304Q
            if (r5 == r7) goto L_0x00ec
            r13.j(r2)
            r5 = r4[r6]
            r5.e()
            int r5 = r6 + 1
            r23 = r4[r5]
            r23.e()
            r23 = r4[r6]
            r23.e()
            r5 = r4[r5]
            r5.e()
            s.d r5 = r1.f11270b
            if (r5 != 0) goto L_0x0068
            r1.f11270b = r13
        L_0x0068:
            r1.d = r13
            int[] r5 = r13.f11342p0
            r5 = r5[r2]
            if (r5 != r3) goto L_0x00ec
            int[] r7 = r13.f11346t
            r7 = r7[r2]
            if (r7 == 0) goto L_0x007e
            if (r7 == r3) goto L_0x007e
            if (r7 != r12) goto L_0x007b
            goto L_0x007e
        L_0x007b:
            r25 = r9
            goto L_0x00d0
        L_0x007e:
            int r12 = r1.f11275j
            r22 = 1
            int r12 = r12 + 1
            r1.f11275j = r12
            float[] r12 = r13.f11332k0
            r12 = r12[r2]
            r21 = 0
            int r24 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r24 <= 0) goto L_0x0095
            float r3 = r1.f11276k
            float r3 = r3 + r12
            r1.f11276k = r3
        L_0x0095:
            int r3 = r13.f11325g0
            r25 = r9
            r9 = 8
            if (r3 == r9) goto L_0x00c0
            r3 = 3
            if (r5 != r3) goto L_0x00c0
            if (r7 == 0) goto L_0x00a4
            if (r7 != r3) goto L_0x00c0
        L_0x00a4:
            r3 = 0
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x00ad
            r3 = 1
            r1.f11279n = r3
            goto L_0x00b0
        L_0x00ad:
            r3 = 1
            r1.f11280o = r3
        L_0x00b0:
            java.util.ArrayList r3 = r1.h
            if (r3 != 0) goto L_0x00bb
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.h = r3
        L_0x00bb:
            java.util.ArrayList r3 = r1.h
            r3.add(r13)
        L_0x00c0:
            s.d r3 = r1.f11273f
            if (r3 != 0) goto L_0x00c6
            r1.f11273f = r13
        L_0x00c6:
            s.d r3 = r1.g
            if (r3 == 0) goto L_0x00ce
            s.d[] r3 = r3.f11334l0
            r3[r2] = r13
        L_0x00ce:
            r1.g = r13
        L_0x00d0:
            if (r2 != 0) goto L_0x00de
            int r3 = r13.f11344r
            if (r3 == 0) goto L_0x00d7
            goto L_0x00e9
        L_0x00d7:
            int r3 = r13.f11347u
            if (r3 != 0) goto L_0x00e9
            int r3 = r13.f11348v
            goto L_0x00e9
        L_0x00de:
            int r3 = r13.f11345s
            if (r3 == 0) goto L_0x00e3
            goto L_0x00e9
        L_0x00e3:
            int r3 = r13.f11350x
            if (r3 != 0) goto L_0x00e9
            int r3 = r13.f11351y
        L_0x00e9:
            r3 = r20
            goto L_0x00ef
        L_0x00ec:
            r25 = r9
            goto L_0x00e9
        L_0x00ef:
            if (r3 == r13) goto L_0x00f5
            s.d[] r3 = r3.f11336m0
            r3[r2] = r13
        L_0x00f5:
            int r3 = r6 + 1
            r3 = r4[r3]
            s.c r3 = r3.f11287f
            if (r3 == 0) goto L_0x010b
            s.d r3 = r3.d
            s.c[] r4 = r3.f11304Q
            r4 = r4[r6]
            s.c r4 = r4.f11287f
            if (r4 == 0) goto L_0x010b
            s.d r4 = r4.d
            if (r4 == r13) goto L_0x010d
        L_0x010b:
            r3 = r17
        L_0x010d:
            if (r3 == 0) goto L_0x0110
            goto L_0x0113
        L_0x0110:
            r3 = r13
            r18 = 1
        L_0x0113:
            r20 = r13
            r9 = r25
            r4 = 1
            r7 = 8
            r12 = 2
            r13 = r3
            r3 = 3
            goto L_0x0034
        L_0x011f:
            r25 = r9
            s.d r3 = r1.f11270b
            if (r3 == 0) goto L_0x012c
            s.c[] r3 = r3.f11304Q
            r3 = r3[r6]
            r3.e()
        L_0x012c:
            s.d r3 = r1.d
            if (r3 == 0) goto L_0x0139
            int r6 = r6 + 1
            s.c[] r3 = r3.f11304Q
            r3 = r3[r6]
            r3.e()
        L_0x0139:
            r1.f11271c = r13
            if (r2 != 0) goto L_0x0144
            boolean r2 = r1.f11278m
            if (r2 == 0) goto L_0x0144
            r1.f11272e = r13
            goto L_0x0146
        L_0x0144:
            r1.f11272e = r8
        L_0x0146:
            boolean r2 = r1.f11280o
            if (r2 == 0) goto L_0x0150
            boolean r2 = r1.f11279n
            if (r2 == 0) goto L_0x0150
            r2 = 1
            goto L_0x0151
        L_0x0150:
            r2 = 0
        L_0x0151:
            r1.f11281p = r2
            r2 = 1
            goto L_0x0158
        L_0x0155:
            r25 = r9
            r2 = r4
        L_0x0158:
            r1.f11282q = r2
            if (r11 == 0) goto L_0x016d
            boolean r2 = r11.contains(r8)
            if (r2 == 0) goto L_0x0163
            goto L_0x016d
        L_0x0163:
            r30 = r14
            r31 = r15
            r23 = r25
            r19 = 0
            goto L_0x0707
        L_0x016d:
            s.d r12 = r1.f11271c
            s.d r13 = r1.f11270b
            s.d r9 = r1.d
            s.d r2 = r1.f11272e
            float r3 = r1.f11276k
            int[] r4 = r0.f11342p0
            r4 = r4[r39]
            r7 = 2
            if (r4 != r7) goto L_0x0180
            r4 = 1
            goto L_0x0181
        L_0x0180:
            r4 = 0
        L_0x0181:
            if (r39 != 0) goto L_0x01a0
            int r5 = r2.f11328i0
            r6 = 1
            if (r5 != 0) goto L_0x018b
            r22 = 1
            goto L_0x018d
        L_0x018b:
            r22 = 0
        L_0x018d:
            if (r5 != r6) goto L_0x0192
            r18 = r6
            goto L_0x0194
        L_0x0192:
            r18 = 0
        L_0x0194:
            if (r5 != r7) goto L_0x0198
            r5 = r6
            goto L_0x0199
        L_0x0198:
            r5 = 0
        L_0x0199:
            r26 = r3
            r7 = r8
            r20 = r22
        L_0x019e:
            r6 = 0
            goto L_0x01bc
        L_0x01a0:
            r6 = 1
            int r5 = r2.f11330j0
            if (r5 != 0) goto L_0x01a8
            r18 = r6
            goto L_0x01aa
        L_0x01a8:
            r18 = 0
        L_0x01aa:
            if (r5 != r6) goto L_0x01ae
            r6 = 1
            goto L_0x01af
        L_0x01ae:
            r6 = 0
        L_0x01af:
            if (r5 != r7) goto L_0x01b3
            r5 = 1
            goto L_0x01b4
        L_0x01b3:
            r5 = 0
        L_0x01b4:
            r26 = r3
            r7 = r8
            r20 = r18
            r18 = r6
            goto L_0x019e
        L_0x01bc:
            s.c[] r3 = r0.f11304Q
            if (r6 != 0) goto L_0x029c
            s.c[] r11 = r7.f11304Q
            r11 = r11[r16]
            if (r5 == 0) goto L_0x01c9
            r27 = 1
            goto L_0x01cb
        L_0x01c9:
            r27 = 4
        L_0x01cb:
            int r28 = r11.e()
            r29 = r6
            int[] r6 = r7.f11342p0
            r30 = r14
            r14 = r6[r39]
            r31 = r15
            r15 = 3
            if (r14 != r15) goto L_0x01e4
            int[] r14 = r7.f11346t
            r14 = r14[r39]
            if (r14 != 0) goto L_0x01e4
            r14 = 1
            goto L_0x01e5
        L_0x01e4:
            r14 = 0
        L_0x01e5:
            s.c r15 = r11.f11287f
            if (r15 == 0) goto L_0x01f1
            if (r7 == r8) goto L_0x01f1
            int r15 = r15.e()
            int r28 = r15 + r28
        L_0x01f1:
            r15 = r28
            if (r5 == 0) goto L_0x01fe
            if (r7 == r8) goto L_0x01fe
            if (r7 == r13) goto L_0x01fe
            r28 = r2
            r27 = 8
            goto L_0x0200
        L_0x01fe:
            r28 = r2
        L_0x0200:
            s.c r2 = r11.f11287f
            if (r2 == 0) goto L_0x023e
            if (r7 != r13) goto L_0x0213
            r32 = r8
            q.f r8 = r11.f11288i
            q.f r2 = r2.f11288i
            r33 = r1
            r1 = 6
            r10.f(r8, r2, r15, r1)
            goto L_0x0220
        L_0x0213:
            r33 = r1
            r32 = r8
            q.f r1 = r11.f11288i
            q.f r2 = r2.f11288i
            r8 = 8
            r10.f(r1, r2, r15, r8)
        L_0x0220:
            if (r14 == 0) goto L_0x0226
            if (r5 != 0) goto L_0x0226
            r27 = 5
        L_0x0226:
            if (r7 != r13) goto L_0x0232
            if (r5 == 0) goto L_0x0232
            boolean[] r1 = r7.f11306S
            boolean r1 = r1[r39]
            if (r1 == 0) goto L_0x0232
            r1 = 5
            goto L_0x0234
        L_0x0232:
            r1 = r27
        L_0x0234:
            q.f r2 = r11.f11288i
            s.c r8 = r11.f11287f
            q.f r8 = r8.f11288i
            r10.e(r2, r8, r15, r1)
            goto L_0x0242
        L_0x023e:
            r33 = r1
            r32 = r8
        L_0x0242:
            s.c[] r1 = r7.f11304Q
            if (r4 == 0) goto L_0x026f
            int r2 = r7.f11325g0
            r8 = 8
            if (r2 == r8) goto L_0x0261
            r2 = r6[r39]
            r6 = 3
            if (r2 != r6) goto L_0x0261
            int r2 = r16 + 1
            r2 = r1[r2]
            q.f r2 = r2.f11288i
            r6 = r1[r16]
            q.f r6 = r6.f11288i
            r8 = 0
            r11 = 5
            r10.f(r2, r6, r8, r11)
            goto L_0x0262
        L_0x0261:
            r8 = 0
        L_0x0262:
            r2 = r1[r16]
            q.f r2 = r2.f11288i
            r3 = r3[r16]
            q.f r3 = r3.f11288i
            r6 = 8
            r10.f(r2, r3, r8, r6)
        L_0x026f:
            int r2 = r16 + 1
            r1 = r1[r2]
            s.c r1 = r1.f11287f
            if (r1 == 0) goto L_0x0285
            s.d r1 = r1.d
            s.c[] r2 = r1.f11304Q
            r2 = r2[r16]
            s.c r2 = r2.f11287f
            if (r2 == 0) goto L_0x0285
            s.d r2 = r2.d
            if (r2 == r7) goto L_0x0287
        L_0x0285:
            r1 = r17
        L_0x0287:
            if (r1 == 0) goto L_0x028d
            r7 = r1
            r6 = r29
            goto L_0x028e
        L_0x028d:
            r6 = 1
        L_0x028e:
            r11 = r38
            r2 = r28
            r14 = r30
            r15 = r31
            r8 = r32
            r1 = r33
            goto L_0x01bc
        L_0x029c:
            r33 = r1
            r28 = r2
            r32 = r8
            r30 = r14
            r31 = r15
            if (r9 == 0) goto L_0x0303
            s.c[] r1 = r12.f11304Q
            int r2 = r16 + 1
            r1 = r1[r2]
            s.c r1 = r1.f11287f
            if (r1 == 0) goto L_0x0303
            s.c[] r1 = r9.f11304Q
            r1 = r1[r2]
            int[] r6 = r9.f11342p0
            r6 = r6[r39]
            r7 = 3
            if (r6 != r7) goto L_0x02d9
            int[] r6 = r9.f11346t
            r6 = r6[r39]
            if (r6 != 0) goto L_0x02d9
            if (r5 != 0) goto L_0x02d9
            s.c r6 = r1.f11287f
            s.d r7 = r6.d
            if (r7 != r0) goto L_0x02d9
            q.f r7 = r1.f11288i
            q.f r6 = r6.f11288i
            int r8 = r1.e()
            int r8 = -r8
            r11 = 5
            r10.e(r7, r6, r8, r11)
            goto L_0x02ef
        L_0x02d9:
            r11 = 5
            if (r5 == 0) goto L_0x02ef
            s.c r6 = r1.f11287f
            s.d r7 = r6.d
            if (r7 != r0) goto L_0x02ef
            q.f r7 = r1.f11288i
            q.f r6 = r6.f11288i
            int r8 = r1.e()
            int r8 = -r8
            r14 = 4
            r10.e(r7, r6, r8, r14)
        L_0x02ef:
            q.f r6 = r1.f11288i
            s.c[] r7 = r12.f11304Q
            r2 = r7[r2]
            s.c r2 = r2.f11287f
            q.f r2 = r2.f11288i
            int r1 = r1.e()
            int r1 = -r1
            r7 = 6
            r10.g(r6, r2, r1, r7)
            goto L_0x0304
        L_0x0303:
            r11 = 5
        L_0x0304:
            if (r4 == 0) goto L_0x031b
            int r1 = r16 + 1
            r2 = r3[r1]
            q.f r2 = r2.f11288i
            s.c[] r3 = r12.f11304Q
            r1 = r3[r1]
            q.f r3 = r1.f11288i
            int r1 = r1.e()
            r4 = 8
            r10.f(r2, r3, r1, r4)
        L_0x031b:
            r1 = r33
            java.util.ArrayList r2 = r1.h
            if (r2 == 0) goto L_0x043a
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L_0x043a
            boolean r6 = r1.f11279n
            if (r6 == 0) goto L_0x0334
            boolean r6 = r1.f11281p
            if (r6 != 0) goto L_0x0334
            int r6 = r1.f11275j
            float r6 = (float) r6
            goto L_0x0336
        L_0x0334:
            r6 = r26
        L_0x0336:
            r14 = r17
            r7 = 0
            r8 = 0
        L_0x033a:
            if (r8 >= r3) goto L_0x043a
            java.lang.Object r15 = r2.get(r8)
            s.d r15 = (s.d) r15
            float[] r4 = r15.f11332k0
            r4 = r4[r39]
            r21 = 0
            int r24 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            s.c[] r11 = r15.f11304Q
            if (r24 >= 0) goto L_0x036b
            boolean r4 = r1.f11281p
            if (r4 == 0) goto L_0x0364
            int r0 = r16 + 1
            r0 = r11[r0]
            q.f r0 = r0.f11288i
            r4 = r11[r16]
            q.f r4 = r4.f11288i
            r11 = 0
            r15 = 4
            r10.e(r0, r4, r11, r15)
            r24 = r15
            goto L_0x0382
        L_0x0364:
            r24 = 4
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0368:
            r21 = 0
            goto L_0x036e
        L_0x036b:
            r24 = 4
            goto L_0x0368
        L_0x036e:
            int r26 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r26 != 0) goto L_0x038c
            int r0 = r16 + 1
            r0 = r11[r0]
            q.f r0 = r0.f11288i
            r4 = r11[r16]
            q.f r4 = r4.f11288i
            r11 = 0
            r15 = 8
            r10.e(r0, r4, r11, r15)
        L_0x0382:
            r29 = r2
            r27 = r3
            r19 = r11
            r21 = 0
            goto L_0x042e
        L_0x038c:
            r19 = 0
            if (r14 == 0) goto L_0x0420
            s.c[] r14 = r14.f11304Q
            r0 = r14[r16]
            q.f r0 = r0.f11288i
            int r27 = r16 + 1
            r14 = r14[r27]
            q.f r14 = r14.f11288i
            r29 = r2
            r2 = r11[r16]
            q.f r2 = r2.f11288i
            r11 = r11[r27]
            q.f r11 = r11.f11288i
            r27 = r3
            q.b r3 = r37.l()
            r33 = r15
            r15 = 0
            r3.f11043b = r15
            int r21 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r21 == 0) goto L_0x03bb
            int r21 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r21 != 0) goto L_0x03c3
        L_0x03bb:
            r26 = r4
            r4 = r15
            r15 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            goto L_0x0408
        L_0x03c3:
            r21 = 0
            int r34 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r34 != 0) goto L_0x03d8
            q.a r2 = r3.d
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.g(r0, r7)
            q.a r0 = r3.d
            r0.g(r14, r15)
        L_0x03d5:
            r26 = r4
            goto L_0x041c
        L_0x03d8:
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r26 != 0) goto L_0x03e9
            q.a r0 = r3.d
            r0.g(r2, r15)
            q.a r0 = r3.d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.g(r11, r2)
            goto L_0x03d5
        L_0x03e9:
            float r7 = r7 / r6
            float r26 = r4 / r6
            float r7 = r7 / r26
            r26 = r4
            q.a r4 = r3.d
            r4.g(r0, r15)
            q.a r0 = r3.d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.g(r14, r4)
            q.a r0 = r3.d
            r0.g(r11, r7)
            q.a r0 = r3.d
            float r4 = -r7
            r0.g(r2, r4)
            goto L_0x041c
        L_0x0408:
            q.a r7 = r3.d
            r7.g(r0, r15)
            q.a r0 = r3.d
            r0.g(r14, r4)
            q.a r0 = r3.d
            r0.g(r11, r15)
            q.a r0 = r3.d
            r0.g(r2, r4)
        L_0x041c:
            r10.c(r3)
            goto L_0x042a
        L_0x0420:
            r29 = r2
            r27 = r3
            r26 = r4
            r33 = r15
            r21 = 0
        L_0x042a:
            r7 = r26
            r14 = r33
        L_0x042e:
            int r8 = r8 + 1
            r3 = r27
            r2 = r29
            r4 = 1
            r11 = 5
            r0 = r36
            goto L_0x033a
        L_0x043a:
            r19 = 0
            r24 = 4
            if (r13 == 0) goto L_0x0447
            if (r13 == r9) goto L_0x0444
            if (r5 == 0) goto L_0x0447
        L_0x0444:
            r0 = r32
            goto L_0x044f
        L_0x0447:
            r14 = r9
            r15 = r25
            r0 = r32
            r11 = 2
            goto L_0x04a8
        L_0x044f:
            s.c[] r0 = r0.f11304Q
            r0 = r0[r16]
            s.c[] r1 = r12.f11304Q
            int r2 = r16 + 1
            r1 = r1[r2]
            s.c r0 = r0.f11287f
            if (r0 == 0) goto L_0x0461
            q.f r0 = r0.f11288i
            r3 = r0
            goto L_0x0463
        L_0x0461:
            r3 = r17
        L_0x0463:
            s.c r0 = r1.f11287f
            if (r0 == 0) goto L_0x046b
            q.f r0 = r0.f11288i
            r6 = r0
            goto L_0x046d
        L_0x046b:
            r6 = r17
        L_0x046d:
            s.c[] r0 = r13.f11304Q
            r0 = r0[r16]
            if (r9 == 0) goto L_0x0477
            s.c[] r1 = r9.f11304Q
            r1 = r1[r2]
        L_0x0477:
            if (r3 == 0) goto L_0x04a0
            if (r6 == 0) goto L_0x04a0
            if (r39 != 0) goto L_0x0483
            r2 = r28
            float r2 = r2.f11320d0
        L_0x0481:
            r5 = r2
            goto L_0x0488
        L_0x0483:
            r2 = r28
            float r2 = r2.f11322e0
            goto L_0x0481
        L_0x0488:
            int r4 = r0.e()
            int r8 = r1.e()
            q.f r2 = r0.f11288i
            q.f r7 = r1.f11288i
            r0 = 7
            r1 = r37
            r11 = 2
            r14 = r9
            r15 = r25
            r9 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x04a4
        L_0x04a0:
            r14 = r9
            r15 = r25
            r11 = 2
        L_0x04a4:
            r23 = r15
            goto L_0x06ad
        L_0x04a8:
            if (r20 == 0) goto L_0x058d
            if (r13 == 0) goto L_0x058d
            int r2 = r1.f11275j
            if (r2 <= 0) goto L_0x04b7
            int r1 = r1.f11274i
            if (r1 != r2) goto L_0x04b7
            r22 = 1
            goto L_0x04b9
        L_0x04b7:
            r22 = r19
        L_0x04b9:
            r8 = r13
            r9 = r8
        L_0x04bb:
            if (r9 == 0) goto L_0x04a4
            s.d[] r1 = r9.f11336m0
            r1 = r1[r39]
            r7 = r1
        L_0x04c2:
            if (r7 == 0) goto L_0x04cf
            int r1 = r7.f11325g0
            r6 = 8
            if (r1 != r6) goto L_0x04d1
            s.d[] r1 = r7.f11336m0
            r7 = r1[r39]
            goto L_0x04c2
        L_0x04cf:
            r6 = 8
        L_0x04d1:
            if (r7 != 0) goto L_0x04dd
            if (r9 != r14) goto L_0x04d6
            goto L_0x04dd
        L_0x04d6:
            r21 = r7
            r23 = r8
            r11 = r9
            goto L_0x057e
        L_0x04dd:
            s.c[] r1 = r9.f11304Q
            r2 = r1[r16]
            q.f r3 = r2.f11288i
            s.c r4 = r2.f11287f
            if (r4 == 0) goto L_0x04ea
            q.f r4 = r4.f11288i
            goto L_0x04ec
        L_0x04ea:
            r4 = r17
        L_0x04ec:
            if (r8 == r9) goto L_0x04f7
            s.c[] r4 = r8.f11304Q
            int r5 = r16 + 1
            r4 = r4[r5]
            q.f r4 = r4.f11288i
            goto L_0x0506
        L_0x04f7:
            if (r9 != r13) goto L_0x0506
            s.c[] r4 = r0.f11304Q
            r4 = r4[r16]
            s.c r4 = r4.f11287f
            if (r4 == 0) goto L_0x0504
            q.f r4 = r4.f11288i
            goto L_0x0506
        L_0x0504:
            r4 = r17
        L_0x0506:
            int r2 = r2.e()
            int r5 = r16 + 1
            r21 = r1[r5]
            int r21 = r21.e()
            if (r7 == 0) goto L_0x051b
            s.c[] r6 = r7.f11304Q
            r6 = r6[r16]
            q.f r11 = r6.f11288i
            goto L_0x0528
        L_0x051b:
            s.c[] r6 = r12.f11304Q
            r6 = r6[r5]
            s.c r6 = r6.f11287f
            if (r6 == 0) goto L_0x0526
            q.f r11 = r6.f11288i
            goto L_0x0528
        L_0x0526:
            r11 = r17
        L_0x0528:
            r1 = r1[r5]
            q.f r1 = r1.f11288i
            if (r6 == 0) goto L_0x0534
            int r6 = r6.e()
            int r21 = r6 + r21
        L_0x0534:
            s.c[] r6 = r8.f11304Q
            r6 = r6[r5]
            int r6 = r6.e()
            int r6 = r6 + r2
            if (r3 == 0) goto L_0x04d6
            if (r4 == 0) goto L_0x04d6
            if (r11 == 0) goto L_0x04d6
            if (r1 == 0) goto L_0x04d6
            if (r9 != r13) goto L_0x0550
            s.c[] r2 = r13.f11304Q
            r2 = r2[r16]
            int r2 = r2.e()
            r6 = r2
        L_0x0550:
            if (r9 != r14) goto L_0x055c
            s.c[] r2 = r14.f11304Q
            r2 = r2[r5]
            int r2 = r2.e()
            r21 = r2
        L_0x055c:
            if (r22 == 0) goto L_0x0561
            r24 = 8
            goto L_0x0563
        L_0x0561:
            r24 = 5
        L_0x0563:
            r5 = 1056964608(0x3f000000, float:0.5)
            r25 = r1
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r6
            r23 = 8
            r6 = r11
            r11 = r7
            r7 = r25
            r23 = r8
            r8 = r21
            r21 = r11
            r11 = r9
            r9 = r24
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x057e:
            int r1 = r11.f11325g0
            r9 = 8
            if (r1 == r9) goto L_0x0586
            r8 = r11
            goto L_0x0588
        L_0x0586:
            r8 = r23
        L_0x0588:
            r9 = r21
            r11 = 2
            goto L_0x04bb
        L_0x058d:
            r9 = 8
            if (r18 == 0) goto L_0x04a4
            if (r13 == 0) goto L_0x04a4
            int r2 = r1.f11275j
            if (r2 <= 0) goto L_0x059e
            int r1 = r1.f11274i
            if (r1 != r2) goto L_0x059e
            r22 = 1
            goto L_0x05a0
        L_0x059e:
            r22 = r19
        L_0x05a0:
            r8 = r13
            r11 = r8
        L_0x05a2:
            if (r11 == 0) goto L_0x0659
            s.d[] r1 = r11.f11336m0
            r1 = r1[r39]
        L_0x05a8:
            if (r1 == 0) goto L_0x05b3
            int r2 = r1.f11325g0
            if (r2 != r9) goto L_0x05b3
            s.d[] r1 = r1.f11336m0
            r1 = r1[r39]
            goto L_0x05a8
        L_0x05b3:
            if (r11 == r13) goto L_0x0646
            if (r11 == r14) goto L_0x0646
            if (r1 == 0) goto L_0x0646
            if (r1 != r14) goto L_0x05be
            r7 = r17
            goto L_0x05bf
        L_0x05be:
            r7 = r1
        L_0x05bf:
            s.c[] r1 = r11.f11304Q
            r2 = r1[r16]
            q.f r3 = r2.f11288i
            s.c[] r4 = r8.f11304Q
            int r5 = r16 + 1
            r4 = r4[r5]
            q.f r4 = r4.f11288i
            int r2 = r2.e()
            r6 = r1[r5]
            int r6 = r6.e()
            if (r7 == 0) goto L_0x05eb
            s.c[] r1 = r7.f11304Q
            r1 = r1[r16]
            q.f r9 = r1.f11288i
            r21 = r7
            s.c r7 = r1.f11287f
            if (r7 == 0) goto L_0x05e8
            q.f r7 = r7.f11288i
            goto L_0x0601
        L_0x05e8:
            r7 = r17
            goto L_0x0601
        L_0x05eb:
            r21 = r7
            s.c[] r7 = r14.f11304Q
            r7 = r7[r16]
            if (r7 == 0) goto L_0x05f6
            q.f r9 = r7.f11288i
            goto L_0x05f8
        L_0x05f6:
            r9 = r17
        L_0x05f8:
            r1 = r1[r5]
            q.f r1 = r1.f11288i
            r35 = r7
            r7 = r1
            r1 = r35
        L_0x0601:
            if (r1 == 0) goto L_0x060b
            int r1 = r1.e()
            int r1 = r1 + r6
            r23 = r1
            goto L_0x060d
        L_0x060b:
            r23 = r6
        L_0x060d:
            s.c[] r1 = r8.f11304Q
            r1 = r1[r5]
            int r1 = r1.e()
            int r5 = r1 + r2
            if (r22 == 0) goto L_0x061c
            r25 = 8
            goto L_0x061e
        L_0x061c:
            r25 = r24
        L_0x061e:
            if (r3 == 0) goto L_0x063d
            if (r4 == 0) goto L_0x063d
            if (r9 == 0) goto L_0x063d
            if (r7 == 0) goto L_0x063d
            r6 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r26 = r8
            r8 = r23
            r23 = r15
            r15 = 8
            r9 = r25
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0643
        L_0x063d:
            r26 = r8
            r23 = r15
            r15 = 8
        L_0x0643:
            r1 = r21
            goto L_0x064b
        L_0x0646:
            r26 = r8
            r23 = r15
            r15 = r9
        L_0x064b:
            int r2 = r11.f11325g0
            if (r2 == r15) goto L_0x0651
            r8 = r11
            goto L_0x0653
        L_0x0651:
            r8 = r26
        L_0x0653:
            r11 = r1
            r9 = r15
            r15 = r23
            goto L_0x05a2
        L_0x0659:
            r23 = r15
            s.c[] r1 = r13.f11304Q
            r1 = r1[r16]
            s.c[] r0 = r0.f11304Q
            r0 = r0[r16]
            s.c r0 = r0.f11287f
            s.c[] r2 = r14.f11304Q
            int r3 = r16 + 1
            r11 = r2[r3]
            s.c[] r2 = r12.f11304Q
            r2 = r2[r3]
            s.c r15 = r2.f11287f
            r9 = 5
            if (r0 == 0) goto L_0x0681
            if (r13 == r14) goto L_0x0683
            q.f r2 = r1.f11288i
            q.f r0 = r0.f11288i
            int r1 = r1.e()
            r10.e(r2, r0, r1, r9)
        L_0x0681:
            r0 = r9
            goto L_0x069d
        L_0x0683:
            if (r15 == 0) goto L_0x0681
            q.f r2 = r1.f11288i
            q.f r3 = r0.f11288i
            int r4 = r1.e()
            q.f r6 = r11.f11288i
            q.f r7 = r15.f11288i
            int r8 = r11.e()
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r0 = r9
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x069d:
            if (r15 == 0) goto L_0x06ad
            if (r13 == r14) goto L_0x06ad
            q.f r1 = r11.f11288i
            q.f r2 = r15.f11288i
            int r3 = r11.e()
            int r3 = -r3
            r10.e(r1, r2, r3, r0)
        L_0x06ad:
            if (r20 != 0) goto L_0x06b1
            if (r18 == 0) goto L_0x0707
        L_0x06b1:
            if (r13 == 0) goto L_0x0707
            if (r13 == r14) goto L_0x0707
            s.c[] r0 = r13.f11304Q
            r1 = r0[r16]
            if (r14 != 0) goto L_0x06bd
            r9 = r13
            goto L_0x06be
        L_0x06bd:
            r9 = r14
        L_0x06be:
            int r2 = r16 + 1
            s.c[] r3 = r9.f11304Q
            r4 = r3[r2]
            s.c r5 = r1.f11287f
            if (r5 == 0) goto L_0x06cb
            q.f r5 = r5.f11288i
            goto L_0x06cd
        L_0x06cb:
            r5 = r17
        L_0x06cd:
            s.c r6 = r4.f11287f
            if (r6 == 0) goto L_0x06d4
            q.f r6 = r6.f11288i
            goto L_0x06d6
        L_0x06d4:
            r6 = r17
        L_0x06d6:
            if (r12 == r9) goto L_0x06e6
            s.c[] r6 = r12.f11304Q
            r6 = r6[r2]
            s.c r6 = r6.f11287f
            if (r6 == 0) goto L_0x06e4
            q.f r6 = r6.f11288i
            r17 = r6
        L_0x06e4:
            r6 = r17
        L_0x06e6:
            if (r13 != r9) goto L_0x06ea
            r4 = r0[r2]
        L_0x06ea:
            if (r5 == 0) goto L_0x0707
            if (r6 == 0) goto L_0x0707
            int r0 = r1.e()
            r2 = r3[r2]
            int r8 = r2.e()
            q.f r2 = r1.f11288i
            q.f r7 = r4.f11288i
            r9 = 5
            r11 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r3 = r5
            r4 = r0
            r5 = r11
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0707:
            int r9 = r23 + 1
            r12 = 2
            r0 = r36
            r11 = r38
            r14 = r30
            r15 = r31
            goto L_0x001b
        L_0x0714:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.j.a(s.e, q.c, java.util.ArrayList, int):void");
    }

    public static void b(e eVar, C0926c cVar, d dVar) {
        dVar.f11339o = -1;
        dVar.f11341p = -1;
        int i2 = eVar.f11342p0[0];
        int[] iArr = dVar.f11342p0;
        if (i2 != 2 && iArr[0] == 4) {
            c cVar2 = dVar.f11296I;
            int i5 = cVar2.g;
            int q6 = eVar.q();
            c cVar3 = dVar.f11298K;
            int i6 = q6 - cVar3.g;
            cVar2.f11288i = cVar.k(cVar2);
            cVar3.f11288i = cVar.k(cVar3);
            cVar.d(cVar2.f11288i, i5);
            cVar.d(cVar3.f11288i, i6);
            dVar.f11339o = 2;
            dVar.f11312Y = i5;
            int i7 = i6 - i5;
            dVar.f11308U = i7;
            int i8 = dVar.f11317b0;
            if (i7 < i8) {
                dVar.f11308U = i8;
            }
        }
        if (eVar.f11342p0[1] != 2 && iArr[1] == 4) {
            c cVar4 = dVar.f11297J;
            int i9 = cVar4.g;
            int k6 = eVar.k();
            c cVar5 = dVar.f11299L;
            int i10 = k6 - cVar5.g;
            cVar4.f11288i = cVar.k(cVar4);
            cVar5.f11288i = cVar.k(cVar5);
            cVar.d(cVar4.f11288i, i9);
            cVar.d(cVar5.f11288i, i10);
            if (dVar.f11315a0 > 0 || dVar.f11325g0 == 8) {
                c cVar6 = dVar.f11300M;
                C0929f k7 = cVar.k(cVar6);
                cVar6.f11288i = k7;
                cVar.d(k7, dVar.f11315a0 + i9);
            }
            dVar.f11341p = 2;
            dVar.f11313Z = i9;
            int i11 = i10 - i9;
            dVar.f11309V = i11;
            int i12 = dVar.f11319c0;
            if (i11 < i12) {
                dVar.f11309V = i12;
            }
        }
    }

    public static final boolean c(int i2, int i5) {
        if ((i2 & i5) == i5) {
            return true;
        }
        return false;
    }
}
