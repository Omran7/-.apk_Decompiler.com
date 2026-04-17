package j4;

import n3.C0866g;
import v3.C1048c;
import v3.m;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8849a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8850b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8851c;

    public /* synthetic */ C(Object obj, boolean z3, boolean z4) {
        this.f8851c = obj;
        this.f8849a = z3;
        this.f8850b = z4;
    }

    public boolean a(C1048c cVar) {
        if ((!this.f8849a || this.f8850b) && !((m) this.f8851c).f12296a.d(cVar)) {
            return false;
        }
        return true;
    }

    public boolean b(C0866g gVar) {
        if (!gVar.isEmpty()) {
            return a(gVar.z());
        }
        if (!this.f8849a || this.f8850b) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03ff, code lost:
        r11 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0405, code lost:
        r11 = r16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02ce A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(boolean r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.f8851c
            A2.f r3 = (A2.f) r3
            if (r27 == 0) goto L_0x043c
            r4 = 1
            r6 = 2
            r7 = 5
            boolean r8 = r0.f8849a
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            boolean r13 = r0.f8850b
            if (r8 == 0) goto L_0x0256
            java.lang.Object r8 = r3.d
            j4.D r8 = (j4.D) r8
            int r8 = r8.f8857b
            r15 = 3
            r12 = 10
            java.lang.Object r11 = r3.f30c
            r23 = r11
            java.lang.String r23 = (java.lang.String) r23
            int r11 = r3.f29b
            java.lang.Object r14 = r3.d
            j4.D r14 = (j4.D) r14
            if (r8 == 0) goto L_0x0034
            if (r8 == r12) goto L_0x0093
            if (r8 == r6) goto L_0x0093
            if (r8 == r15) goto L_0x0093
            goto L_0x0039
        L_0x0034:
            if (r11 == r6) goto L_0x0093
            if (r11 != r7) goto L_0x0039
            goto L_0x0093
        L_0x0039:
            long r6 = android.support.v4.media.session.a.A(r8, r11, r2)
            long r11 = android.support.v4.media.session.a.A(r8, r11, r1)
            r17 = 0
            int r8 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r8 != 0) goto L_0x0048
            goto L_0x0051
        L_0x0048:
            java.util.concurrent.ThreadLocalRandom r8 = java.util.concurrent.ThreadLocalRandom.current()
            long r11 = r11 + r4
            long r6 = r8.nextLong(r6, r11)
        L_0x0051:
            double r6 = (double) r6
            double r6 = r6 * r9
            long r6 = (long) r6
            if (r13 == 0) goto L_0x007b
            d5.a r8 = d5.o.getAccountObject()
            java.lang.String r22 = r8.getId()
            Y4.D r8 = r14.f8858c
            int r9 = r8.f4293a
            int r10 = r8.f4294b
            int r8 = r8.f4298i
            j4.y r11 = new j4.y
            r11.<init>(r0, r6)
            r20 = -1
            r24 = 0
            r17 = r9
            r18 = r10
            r19 = r8
            r21 = r11
            android.support.v4.media.session.a.B0(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x008d
        L_0x007b:
            d5.a r8 = d5.o.getAccountObject()
            java.lang.String r8 = r8.getId()
            j4.y r9 = new j4.y
            r9.<init>(r0, r6)
            java.lang.String r10 = "cash"
            com.mtma.criminal.city.utils.U.g(r8, r10, r6, r9)
        L_0x008d:
            r16 = 24
            r25 = 25
            goto L_0x03db
        L_0x0093:
            int[] r6 = new int[r1]
            r7 = -1
            r6[r2] = r7
            int[] r9 = new int[r1]
            r10 = 100
            r9[r2] = r10
            r10 = 50
            if (r8 == 0) goto L_0x01aa
            r4 = 4
            if (r8 == r12) goto L_0x017e
            r5 = 2
            if (r8 == r5) goto L_0x0134
            if (r8 == r15) goto L_0x00b0
            r16 = 24
            r25 = 25
            goto L_0x0189
        L_0x00b0:
            r8 = 1007(0x3ef, float:1.411E-42)
            r10 = 1005(0x3ed, float:1.408E-42)
            r12 = 1004(0x3ec, float:1.407E-42)
            r18 = 1003(0x3eb, float:1.406E-42)
            if (r11 == 0) goto L_0x00ed
            if (r11 == r1) goto L_0x00f3
            if (r11 == r5) goto L_0x00ed
            if (r11 == r15) goto L_0x00ed
            r7 = 5
            if (r11 == r4) goto L_0x00ca
            if (r11 == r7) goto L_0x00ca
            r16 = 24
            r25 = 25
            goto L_0x0130
        L_0x00ca:
            int[] r6 = new int[r7]
            r9 = 1012(0x3f4, float:1.418E-42)
            r6[r2] = r9
            r6[r1] = r18
            r6[r5] = r12
            r6[r15] = r10
            r6[r4] = r8
            int[] r9 = new int[r7]
            r9[r2] = r1
            r7 = 24
            r9[r1] = r7
            r7 = 25
            r9[r5] = r7
            r9[r15] = r7
            r9[r4] = r7
            r25 = r7
            r16 = 24
            goto L_0x0130
        L_0x00ed:
            r7 = r5
            r16 = 24
            r25 = 25
            goto L_0x011c
        L_0x00f3:
            r5 = 6
            int[] r6 = new int[r5]
            r7 = 1010(0x3f2, float:1.415E-42)
            r6[r2] = r7
            r7 = 1011(0x3f3, float:1.417E-42)
            r6[r1] = r7
            r7 = 2
            r6[r7] = r18
            r6[r15] = r12
            r6[r4] = r10
            r9 = 5
            r6[r9] = r8
            int[] r5 = new int[r5]
            r5[r2] = r1
            r5[r1] = r1
            r16 = 24
            r5[r7] = r16
            r5[r15] = r16
            r25 = 25
            r5[r4] = r25
            r5[r9] = r25
            r9 = r5
            goto L_0x0130
        L_0x011c:
            int[] r6 = new int[r4]
            r6[r2] = r18
            r6[r1] = r12
            r6[r7] = r10
            r6[r15] = r8
            int[] r9 = new int[r4]
            r9[r2] = r25
            r9[r1] = r25
            r9[r7] = r25
            r9[r15] = r25
        L_0x0130:
            r4 = 100
            goto L_0x01c1
        L_0x0134:
            r16 = 24
            r25 = 25
            switch(r11) {
                case 0: goto L_0x0173;
                case 1: goto L_0x0173;
                case 2: goto L_0x0173;
                case 3: goto L_0x0168;
                case 4: goto L_0x015d;
                case 5: goto L_0x0152;
                case 6: goto L_0x0147;
                case 7: goto L_0x013c;
                default: goto L_0x013b;
            }
        L_0x013b:
            goto L_0x0130
        L_0x013c:
            int[] r6 = new int[r1]
            r4 = 1015(0x3f7, float:1.422E-42)
            r6[r2] = r4
            int[] r9 = new int[r1]
            r9[r2] = r10
            goto L_0x0130
        L_0x0147:
            int[] r6 = new int[r1]
            r4 = 1014(0x3f6, float:1.421E-42)
            r6[r2] = r4
            int[] r9 = new int[r1]
            r9[r2] = r10
            goto L_0x0130
        L_0x0152:
            int[] r6 = new int[r1]
            r4 = 1013(0x3f5, float:1.42E-42)
            r6[r2] = r4
            int[] r9 = new int[r1]
            r9[r2] = r10
            goto L_0x0130
        L_0x015d:
            int[] r6 = new int[r1]
            r4 = 1009(0x3f1, float:1.414E-42)
            r6[r2] = r4
            int[] r9 = new int[r1]
            r9[r2] = r10
            goto L_0x0130
        L_0x0168:
            int[] r6 = new int[r1]
            r4 = 1008(0x3f0, float:1.413E-42)
            r6[r2] = r4
            int[] r9 = new int[r1]
            r9[r2] = r10
            goto L_0x0130
        L_0x0173:
            int[] r6 = new int[r1]
            r4 = 1006(0x3ee, float:1.41E-42)
            r6[r2] = r4
            int[] r9 = new int[r1]
            r9[r2] = r10
            goto L_0x0130
        L_0x017e:
            r16 = 24
            r25 = 25
            if (r11 == 0) goto L_0x018a
            if (r11 == r1) goto L_0x018a
            r5 = 2
            if (r11 == r5) goto L_0x018a
        L_0x0189:
            goto L_0x0130
        L_0x018a:
            int[] r6 = new int[r4]
            r5 = 30009(0x7539, float:4.2052E-41)
            r6[r2] = r5
            r5 = 30006(0x7536, float:4.2047E-41)
            r6[r1] = r5
            r5 = 30007(0x7537, float:4.2049E-41)
            r7 = 2
            r6[r7] = r5
            r5 = 30008(0x7538, float:4.205E-41)
            r6[r15] = r5
            int[] r9 = new int[r4]
            r9[r2] = r1
            r4 = 12
            r9[r1] = r4
            r9[r7] = r4
            r9[r15] = r4
            goto L_0x0130
        L_0x01aa:
            r7 = 2
            r16 = 24
            r25 = 25
            int[] r6 = new int[r7]
            r4 = 1001(0x3e9, float:1.403E-42)
            r6[r2] = r4
            r4 = 1002(0x3ea, float:1.404E-42)
            r6[r1] = r4
            int[] r9 = new int[r7]
            r9[r2] = r10
            r9[r1] = r10
            goto L_0x0130
        L_0x01c1:
            int r4 = K1.e.J(r1, r4)
            r5 = r2
            r7 = r5
        L_0x01c7:
            int r8 = r6.length
            if (r5 >= r8) goto L_0x01d5
            r8 = r9[r5]
            int r7 = r7 + r8
            if (r4 > r7) goto L_0x01d2
            r4 = r6[r5]
            goto L_0x01d6
        L_0x01d2:
            int r5 = r5 + 1
            goto L_0x01c7
        L_0x01d5:
            r4 = -1
        L_0x01d6:
            if (r13 == 0) goto L_0x01ff
            d5.a r5 = d5.o.getAccountObject()
            java.lang.String r22 = r5.getId()
            Y4.D r5 = r14.f8858c
            int r6 = r5.f4293a
            int r7 = r5.f4294b
            int r5 = r5.f4298i
            j4.x r8 = new j4.x
            r9 = 0
            r8.<init>(r0, r4, r9)
            r20 = -1
            r24 = 0
            r17 = r6
            r18 = r7
            r19 = r5
            r21 = r8
            android.support.v4.media.session.a.B0(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x03db
        L_0x01ff:
            r5 = -1
            if (r4 != r5) goto L_0x022d
            R2.b.w(r2)
            com.mtma.criminal.city.app.MyApplication r4 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r4 = r4.getApplicationContext()
            com.mtma.criminal.city.app.MyApplication r5 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.Object r6 = r14.getItem(r11)
            Y4.f r6 = (Y4.f) r6
            int r6 = r6.f4346a
            java.lang.String r5 = r5.getString(r6)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r6 = 2131886873(0x7f120319, float:1.9408337E38)
            java.lang.String r4 = r4.getString(r6, r5)
            j4.D.b(r14, r11, r4)
            goto L_0x03db
        L_0x022d:
            Y4.D r5 = Y4.D.s(r4, r2, r1)
            d5.a r6 = d5.o.getAccountObject()
            java.lang.String r22 = r6.getId()
            int r6 = r5.f4293a
            int r7 = r5.f4294b
            int r5 = r5.f4298i
            j4.x r8 = new j4.x
            r9 = 1
            r8.<init>(r0, r4, r9)
            r20 = 1
            r24 = 0
            r17 = r6
            r18 = r7
            r19 = r5
            r21 = r8
            android.support.v4.media.session.a.B0(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x03db
        L_0x0256:
            r16 = 24
            r25 = 25
            java.lang.Object r4 = r3.d
            j4.D r4 = (j4.D) r4
            int r4 = r4.f8857b
            r5 = 2032(0x7f0, float:2.847E-42)
            boolean r5 = R2.b.i0(r5)
            int r6 = r3.f29b
            r7 = 0
            if (r5 == 0) goto L_0x026e
        L_0x026c:
            r4 = r2
            goto L_0x028f
        L_0x026e:
            double r11 = android.support.v4.media.session.a.a0(r4, r6)
            r5 = 16
            double r14 = K1.e.S(r5)
            double r9 = r9 - r14
            double r9 = r9 * r11
            double r4 = android.support.v4.media.session.a.a0(r4, r6)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x0283
            goto L_0x026c
        L_0x0283:
            r4 = 100
            int r5 = K1.e.J(r2, r4)
            double r4 = (double) r5
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x026c
            r4 = r1
        L_0x028f:
            java.lang.Object r5 = r3.d
            j4.D r5 = (j4.D) r5
            int r9 = r5.f8857b
            r10 = 2033(0x7f1, float:2.849E-42)
            boolean r10 = R2.b.i0(r10)
            if (r10 == 0) goto L_0x029f
        L_0x029d:
            r7 = r2
            goto L_0x02b8
        L_0x029f:
            double r10 = android.support.v4.media.session.a.Z(r9, r6)
            double r14 = android.support.v4.media.session.a.Z(r9, r6)
            int r7 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x02ac
            goto L_0x029d
        L_0x02ac:
            r7 = 100
            int r7 = K1.e.J(r2, r7)
            double r7 = (double) r7
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 > 0) goto L_0x029d
            r7 = r1
        L_0x02b8:
            if (r4 == 0) goto L_0x02c6
            if (r7 == 0) goto L_0x02c6
            r8 = 2
            int r9 = K1.e.J(r1, r8)
            if (r9 != r1) goto L_0x02c5
            r7 = r2
            goto L_0x02c6
        L_0x02c5:
            r4 = r2
        L_0x02c6:
            java.lang.Object r8 = r3.f30c
            r23 = r8
            java.lang.String r23 = (java.lang.String) r23
            if (r13 == 0) goto L_0x02f8
            if (r4 != 0) goto L_0x02f8
            if (r7 != 0) goto L_0x02f8
            d5.a r4 = d5.o.getAccountObject()
            java.lang.String r22 = r4.getId()
            Y4.D r4 = r5.f8858c
            int r5 = r4.f4293a
            int r6 = r4.f4294b
            int r4 = r4.f4298i
            j4.z r7 = new j4.z
            r7.<init>(r0)
            r20 = -1
            r24 = 0
            r17 = r5
            r18 = r6
            r19 = r4
            r21 = r7
            android.support.v4.media.session.a.B0(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x03db
        L_0x02f8:
            if (r4 == 0) goto L_0x034d
            if (r13 == 0) goto L_0x0323
            d5.a r4 = d5.o.getAccountObject()
            java.lang.String r22 = r4.getId()
            Y4.D r4 = r5.f8858c
            int r5 = r4.f4293a
            int r6 = r4.f4294b
            int r4 = r4.f4298i
            j4.A r7 = new j4.A
            r8 = 0
            r7.<init>(r0, r8)
            r20 = -1
            r24 = 0
            r17 = r5
            r18 = r6
            r19 = r4
            r21 = r7
            android.support.v4.media.session.a.B0(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x03db
        L_0x0323:
            d5.a r4 = d5.o.getAccountObject()
            java.lang.String r4 = r4.getId()
            int r7 = r5.f8857b
            long r7 = android.support.v4.media.session.a.d0(r7, r6)
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.Object r5 = r5.getItem(r6)
            Y4.f r5 = (Y4.f) r5
            int r5 = r5.f4346a
            java.lang.String r5 = r9.getString(r5)
            j4.z r6 = new j4.z
            r6.<init>(r0)
            K1.e.b(r4, r7, r5, r6)
            goto L_0x03db
        L_0x034d:
            if (r7 == 0) goto L_0x03b2
            if (r13 == 0) goto L_0x0377
            d5.a r4 = d5.o.getAccountObject()
            java.lang.String r22 = r4.getId()
            Y4.D r4 = r5.f8858c
            int r5 = r4.f4293a
            int r6 = r4.f4294b
            int r4 = r4.f4298i
            j4.A r7 = new j4.A
            r8 = 1
            r7.<init>(r0, r8)
            r20 = -1
            r24 = 0
            r17 = r5
            r18 = r6
            r19 = r4
            r21 = r7
            android.support.v4.media.session.a.B0(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x03db
        L_0x0377:
            d5.a r4 = d5.o.getAccountObject()
            java.lang.String r4 = r4.getId()
            int r7 = r5.f8857b
            long r7 = android.support.v4.media.session.a.d0(r7, r6)
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            com.mtma.criminal.city.app.MyApplication r10 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r10 = r10.getApplicationContext()
            java.lang.Object r5 = r5.getItem(r6)
            Y4.f r5 = (Y4.f) r5
            int r5 = r5.f4346a
            java.lang.String r5 = r10.getString(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r10 = 2131888453(0x7f120945, float:1.9411542E38)
            java.lang.String r5 = r9.getString(r10, r5)
            com.mtma.criminal.city.utils.t r9 = new com.mtma.criminal.city.utils.t
            r10 = 1
            r9.<init>(r0, r6, r10)
            android.support.v4.media.session.a.b(r4, r7, r5, r9)
            goto L_0x03db
        L_0x03b2:
            R2.b.w(r2)
            com.mtma.criminal.city.app.MyApplication r4 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r4 = r4.getApplicationContext()
            com.mtma.criminal.city.app.MyApplication r7 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.Object r8 = r5.getItem(r6)
            Y4.f r8 = (Y4.f) r8
            int r8 = r8.f4346a
            java.lang.String r7 = r7.getString(r8)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            r8 = 2131886851(0x7f120303, float:1.9408293E38)
            java.lang.String r4 = r4.getString(r8, r7)
            j4.D.b(r5, r6, r4)
        L_0x03db:
            d5.a r4 = d5.o.getAccountObject()
            java.lang.String r4 = r4.getId()
            java.lang.Object r3 = r3.d
            j4.D r3 = (j4.D) r3
            int r3 = r3.f8857b
            if (r3 == 0) goto L_0x040e
            if (r3 == r1) goto L_0x040b
            switch(r3) {
                case 6: goto L_0x0408;
                case 7: goto L_0x0405;
                case 8: goto L_0x0402;
                case 9: goto L_0x03ff;
                default: goto L_0x03f0;
            }
        L_0x03f0:
            switch(r3) {
                case 11: goto L_0x03fc;
                case 12: goto L_0x03fc;
                case 13: goto L_0x03f9;
                case 14: goto L_0x03f6;
                case 15: goto L_0x03ff;
                case 16: goto L_0x0405;
                default: goto L_0x03f3;
            }
        L_0x03f3:
            r11 = 22
            goto L_0x0410
        L_0x03f6:
            r11 = 29
            goto L_0x0410
        L_0x03f9:
            r11 = 28
            goto L_0x0410
        L_0x03fc:
            r11 = 27
            goto L_0x0410
        L_0x03ff:
            r11 = 26
            goto L_0x0410
        L_0x0402:
            r11 = r25
            goto L_0x0410
        L_0x0405:
            r11 = r16
            goto L_0x0410
        L_0x0408:
            r11 = 23
            goto L_0x0410
        L_0x040b:
            r11 = 21
            goto L_0x0410
        L_0x040e:
            r11 = 20
        L_0x0410:
            long r5 = (long) r1
            com.mtma.criminal.city.utils.Q.b(r11, r4, r5)
            d5.a r1 = d5.o.getAccountObject()
            java.lang.String r1 = r1.getId()
            r3 = 89
            com.mtma.criminal.city.utils.Q.b(r3, r1, r5)
            d5.a r1 = d5.o.getAccountObject()
            java.lang.String r1 = r1.getId()
            r3 = 1
            android.support.v4.media.session.a.C0(r2, r2, r3, r1)
            d5.a r1 = d5.o.getAccountObject()
            java.lang.String r1 = r1.getId()
            r2 = 2
            r5 = 5
            android.support.v4.media.session.a.C0(r2, r5, r3, r1)
            goto L_0x0461
        L_0x043c:
            R2.b.w(r2)
            d5.k r2 = d5.o.getMainStatesObject()
            int r2 = r2.getCourageCurrent()
            java.lang.Object r3 = r3.d
            j4.D r3 = (j4.D) r3
            int r4 = r3.f8857b
            int r4 = r4 + r1
            android.content.Context r1 = r3.f8856a
            if (r2 >= r4) goto L_0x0458
            r2 = 2002(0x7d2, float:2.805E-42)
            com.bumptech.glide.c.p(r1, r2)
            goto L_0x0461
        L_0x0458:
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            r3 = 2131886362(0x7f12011a, float:1.94073E38)
            r4 = 0
            com.google.android.gms.internal.measurement.a.n(r2, r3, r1, r4)
        L_0x0461:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.C.c(boolean):void");
    }
}
