package n3;

import androidx.emoji2.text.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import m0.a0;
import o3.e;
import p3.C0917a;
import q3.l;
import s3.C0968f;
import s3.C0969g;
import s3.C0970h;
import v3.s;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f10319a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final C0917a f10320b;

    public q(C0917a aVar) {
        this.f10320b = aVar;
    }

    public final ArrayList a(g gVar, a0 a0Var, s sVar) {
        boolean z3;
        C0968f fVar = ((e) gVar.f4930b).f10443b;
        HashMap hashMap = this.f10319a;
        if (fVar != null) {
            C0970h hVar = (C0970h) hashMap.get(fVar);
            if (hVar != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            l.c(z3);
            return b(hVar, gVar, a0Var, sVar);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : hashMap.entrySet()) {
            arrayList.addAll(b((C0970h) value.getValue(), gVar, a0Var, sVar));
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03fb, code lost:
        if (r4.equals(r3) != false) goto L_0x03fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0419, code lost:
        if (r3.equals(r4.c()) == false) goto L_0x041b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList b(s3.C0970h r23, androidx.emoji2.text.g r24, m0.a0 r25, v3.s r26) {
        /*
            r22 = this;
            r0 = r23
            r1 = r24
            r8 = r25
            r23.getClass()
            r10 = 0
            r11 = 2
            r12 = 1
            int r2 = r1.f4929a
            if (r2 != r11) goto L_0x0044
            java.lang.Object r3 = r1.f4930b
            o3.e r3 = (o3.e) r3
            s3.f r3 = r3.f10443b
            if (r3 == 0) goto L_0x0044
            m0.a0 r3 = r0.f11542c
            v3.s r3 = r3.l()
            if (r3 == 0) goto L_0x0022
            r3 = r12
            goto L_0x0023
        L_0x0022:
            r3 = r10
        L_0x0023:
            java.lang.String r4 = "We should always have a full cache before handling merges"
            q3.l.b(r4, r3)
            m0.a0 r3 = r0.f11542c
            java.lang.Object r3 = r3.f9925b
            j4.C r3 = (j4.C) r3
            boolean r4 = r3.f8849a
            if (r4 == 0) goto L_0x0039
            java.lang.Object r3 = r3.f8851c
            v3.m r3 = (v3.m) r3
            v3.s r3 = r3.f12296a
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r3 == 0) goto L_0x003e
            r3 = r12
            goto L_0x003f
        L_0x003e:
            r3 = r10
        L_0x003f:
            java.lang.String r4 = "Missing event cache, even though we have a server cache"
            q3.l.b(r4, r3)
        L_0x0044:
            m0.a0 r13 = r0.f11542c
            s3.i r14 = r0.f11541b
            r14.getClass()
            B0.A r15 = new B0.A
            r3 = 4
            r15.<init>((int) r3)
            int r3 = q.C0928e.c(r2)
            if (r3 == 0) goto L_0x0357
            if (r3 == r12) goto L_0x027b
            if (r3 == r11) goto L_0x00c0
            r4 = 3
            if (r3 != r4) goto L_0x009a
            java.lang.Object r2 = r13.f9926c
            j4.C r2 = (j4.C) r2
            boolean r3 = r2.f8849a
            java.lang.Object r1 = r1.f4931c
            r4 = r1
            n3.g r4 = (n3.C0866g) r4
            if (r3 != 0) goto L_0x0074
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r1 = r10
            goto L_0x0075
        L_0x0074:
            r1 = r12
        L_0x0075:
            m0.a0 r3 = new m0.a0
            j4.C r5 = new j4.C
            java.lang.Object r6 = r2.f8851c
            v3.m r6 = (v3.m) r6
            boolean r2 = r2.f8850b
            r5.<init>(r6, r1, r2)
            java.lang.Object r1 = r13.f9925b
            j4.C r1 = (j4.C) r1
            r2 = 14
            r3.<init>(r1, r5, r2)
            androidx.emoji2.text.v r5 = s3.C0971i.f11544b
            r1 = r14
            r2 = r3
            r3 = r4
            r4 = r25
            r6 = r15
            m0.a0 r1 = r1.d(r2, r3, r4, r5, r6)
        L_0x0097:
            r11 = r15
            goto L_0x03ac
        L_0x009a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = 1
            if (r2 == r1) goto L_0x00b4
            r1 = 2
            if (r2 == r1) goto L_0x00b1
            r1 = 3
            if (r2 == r1) goto L_0x00ae
            r1 = 4
            if (r2 == r1) goto L_0x00ab
            java.lang.String r1 = "null"
            goto L_0x00b6
        L_0x00ab:
            java.lang.String r1 = "ListenComplete"
            goto L_0x00b6
        L_0x00ae:
            java.lang.String r1 = "AckUserWrite"
            goto L_0x00b6
        L_0x00b1:
            java.lang.String r1 = "Merge"
            goto L_0x00b6
        L_0x00b4:
            java.lang.String r1 = "Overwrite"
        L_0x00b6:
            java.lang.String r2 = "Unknown operation: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x00c0:
            o3.a r1 = (o3.a) r1
            boolean r2 = r1.d
            java.lang.Object r3 = r1.f4931c
            n3.g r3 = (n3.C0866g) r3
            if (r2 != 0) goto L_0x017c
            v3.s r2 = r8.w(r3)
            if (r2 == 0) goto L_0x00d2
        L_0x00d0:
            r1 = r13
            goto L_0x0097
        L_0x00d2:
            java.lang.Object r2 = r13.f9926c
            j4.C r2 = (j4.C) r2
            q3.e r1 = r1.f10440e
            java.lang.Object r4 = r1.f11088a
            boolean r7 = r2.f8850b
            java.lang.Object r5 = r2.f8851c
            v3.m r5 = (v3.m) r5
            if (r4 == 0) goto L_0x0141
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x00ec
            boolean r1 = r2.f8849a
            if (r1 != 0) goto L_0x00f2
        L_0x00ec:
            boolean r1 = r2.b(r3)
            if (r1 == 0) goto L_0x0104
        L_0x00f2:
            v3.s r1 = r5.f12296a
            v3.s r4 = r1.f(r3)
            r1 = r14
            r2 = r13
            r5 = r25
            r6 = r26
            r8 = r15
            m0.a0 r1 = r1.b(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0097
        L_0x0104:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x00d0
            n3.b r1 = n3.C0861b.f10257b
            v3.s r2 = r5.f12296a
            java.util.Iterator r2 = r2.iterator()
            r4 = r1
        L_0x0113:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0134
            java.lang.Object r1 = r2.next()
            v3.q r1 = (v3.q) r1
            v3.c r5 = r1.f12304a
            r4.getClass()
            n3.g r6 = new n3.g
            v3.c[] r5 = new v3.C1048c[]{r5}
            r6.<init>((v3.C1048c[]) r5)
            v3.s r1 = r1.f12305b
            n3.b r4 = r4.k(r6, r1)
            goto L_0x0113
        L_0x0134:
            r1 = r14
            r2 = r13
            r5 = r25
            r6 = r26
            r8 = r15
            m0.a0 r1 = r1.a(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0097
        L_0x0141:
            n3.b r4 = n3.C0861b.f10257b
            java.util.Iterator r1 = r1.iterator()
        L_0x0147:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x016f
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getKey()
            n3.g r6 = (n3.C0866g) r6
            n3.g r9 = r3.t(r6)
            boolean r16 = r2.b(r9)
            if (r16 == 0) goto L_0x016d
            v3.s r11 = r5.f12296a
            v3.s r9 = r11.f(r9)
            n3.b r4 = r4.k(r6, r9)
        L_0x016d:
            r11 = 2
            goto L_0x0147
        L_0x016f:
            r1 = r14
            r2 = r13
            r5 = r25
            r6 = r26
            r8 = r15
            m0.a0 r1 = r1.a(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0097
        L_0x017c:
            v3.s r1 = r8.w(r3)
            if (r1 == 0) goto L_0x0186
            r1 = r13
            r14 = r15
            goto L_0x0278
        L_0x0186:
            c1.i r1 = new c1.i
            r2 = 16
            r9 = r26
            r1.<init>((java.lang.Object) r8, (java.lang.Object) r13, (java.lang.Object) r9, (int) r2)
            java.lang.Object r2 = r13.f9925b
            j4.C r2 = (j4.C) r2
            boolean r4 = r3.isEmpty()
            t3.b r5 = r14.f11545a
            java.lang.Object r6 = r13.f9926c
            j4.C r6 = (j4.C) r6
            java.lang.Object r7 = r8.f9926c
            n3.G r7 = (n3.G) r7
            java.lang.Object r9 = r8.f9925b
            n3.g r9 = (n3.C0866g) r9
            java.lang.Object r2 = r2.f8851c
            v3.m r2 = (v3.m) r2
            boolean r11 = r6.f8849a
            if (r4 != 0) goto L_0x01b9
            v3.c r4 = r3.z()
            v3.c r14 = v3.C1048c.d
            boolean r4 = r4.equals(r14)
            if (r4 == 0) goto L_0x01bc
        L_0x01b9:
            r14 = r15
            goto L_0x023c
        L_0x01bc:
            v3.c r4 = r3.z()
            v3.s r14 = r8.f(r4, r6)
            if (r14 != 0) goto L_0x01d5
            boolean r6 = r6.a(r4)
            if (r6 == 0) goto L_0x01d5
            v3.s r6 = r2.f12296a
            v3.s r6 = r6.l(r4)
            r18 = r6
            goto L_0x01d7
        L_0x01d5:
            r18 = r14
        L_0x01d7:
            if (r18 == 0) goto L_0x01ec
            n3.g r19 = r3.C()
            r14 = r15
            r15 = r5
            r16 = r2
            r17 = r4
            r20 = r1
            r21 = r14
            v3.m r2 = r15.g(r16, r17, r18, r19, r20, r21)
            goto L_0x0212
        L_0x01ec:
            r14 = r15
            if (r18 != 0) goto L_0x0212
            java.lang.Object r6 = r13.f9925b
            j4.C r6 = (j4.C) r6
            java.lang.Object r6 = r6.f8851c
            v3.m r6 = (v3.m) r6
            v3.s r6 = r6.f12296a
            boolean r6 = r6.d(r4)
            if (r6 == 0) goto L_0x0212
            v3.k r18 = v3.k.f12295e
            n3.g r19 = r3.C()
            r15 = r5
            r16 = r2
            r17 = r4
            r20 = r1
            r21 = r14
            v3.m r2 = r15.g(r16, r17, r18, r19, r20, r21)
        L_0x0212:
            v3.s r1 = r2.f12296a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0262
            if (r11 == 0) goto L_0x0262
            v3.s r1 = r13.l()
            java.util.List r3 = java.util.Collections.emptyList()
            v3.s r1 = r7.a(r9, r1, r3, r10)
            boolean r3 = r1.h()
            if (r3 == 0) goto L_0x0262
            v3.l r3 = r5.n()
            v3.m r4 = new v3.m
            r4.<init>(r1, r3)
            v3.m r2 = r5.A(r2, r4, r14)
            goto L_0x0262
        L_0x023c:
            if (r11 == 0) goto L_0x024b
            v3.s r1 = r13.l()
            java.util.List r3 = java.util.Collections.emptyList()
            v3.s r1 = r7.a(r9, r1, r3, r10)
            goto L_0x0255
        L_0x024b:
            java.lang.Object r1 = r6.f8851c
            v3.m r1 = (v3.m) r1
            v3.s r1 = r1.f12296a
            v3.s r1 = r8.g(r1)
        L_0x0255:
            v3.l r3 = r5.n()
            v3.m r4 = new v3.m
            r4.<init>(r1, r3)
            v3.m r2 = r5.A(r2, r4, r14)
        L_0x0262:
            if (r11 != 0) goto L_0x026f
            n3.g r1 = n3.C0866g.d
            v3.s r1 = r8.w(r1)
            if (r1 == 0) goto L_0x026d
            goto L_0x026f
        L_0x026d:
            r1 = r10
            goto L_0x0270
        L_0x026f:
            r1 = r12
        L_0x0270:
            boolean r3 = r5.m()
            m0.a0 r1 = r13.x(r2, r1, r3)
        L_0x0278:
            r11 = r14
            goto L_0x03ac
        L_0x027b:
            r9 = r26
            r11 = r15
            r15 = r1
            o3.c r15 = (o3.c) r15
            java.lang.Object r1 = r15.f4930b
            o3.e r1 = (o3.e) r1
            int r2 = r1.f10442a
            if (r2 != r12) goto L_0x032a
            n3.b r1 = r15.d
            q3.e r2 = r1.f10258a
            java.lang.Object r2 = r2.f11088a
            v3.s r2 = (v3.s) r2
            if (r2 != 0) goto L_0x0295
            r2 = r12
            goto L_0x0296
        L_0x0295:
            r2 = r10
        L_0x0296:
            java.lang.String r3 = "Can't have a merge that is an overwrite"
            q3.l.b(r3, r2)
            q3.e r7 = r1.f10258a
            java.util.Iterator r16 = r7.iterator()
            r2 = r13
        L_0x02a2:
            boolean r1 = r16.hasNext()
            java.lang.Object r3 = r15.f4931c
            r6 = r3
            n3.g r6 = (n3.C0866g) r6
            if (r1 == 0) goto L_0x02e4
            java.lang.Object r1 = r16.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            n3.g r3 = (n3.C0866g) r3
            n3.g r3 = r6.t(r3)
            v3.c r4 = r3.z()
            java.lang.Object r5 = r13.f9925b
            j4.C r5 = (j4.C) r5
            boolean r4 = r5.a(r4)
            if (r4 == 0) goto L_0x02df
            java.lang.Object r1 = r1.getValue()
            r4 = r1
            v3.s r4 = (v3.s) r4
            r1 = r14
            r5 = r25
            r6 = r26
            r17 = r7
            r7 = r11
            m0.a0 r2 = r1.c(r2, r3, r4, r5, r6, r7)
            goto L_0x02e1
        L_0x02df:
            r17 = r7
        L_0x02e1:
            r7 = r17
            goto L_0x02a2
        L_0x02e4:
            r17 = r7
            java.util.Iterator r15 = r17.iterator()
        L_0x02ea:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0327
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            n3.g r3 = (n3.C0866g) r3
            n3.g r3 = r6.t(r3)
            v3.c r4 = r3.z()
            java.lang.Object r5 = r13.f9925b
            j4.C r5 = (j4.C) r5
            boolean r4 = r5.a(r4)
            if (r4 != 0) goto L_0x0322
            java.lang.Object r1 = r1.getValue()
            r4 = r1
            v3.s r4 = (v3.s) r4
            r1 = r14
            r5 = r25
            r16 = r6
            r6 = r26
            r7 = r11
            m0.a0 r2 = r1.c(r2, r3, r4, r5, r6, r7)
            goto L_0x0324
        L_0x0322:
            r16 = r6
        L_0x0324:
            r6 = r16
            goto L_0x02ea
        L_0x0327:
            r1 = r2
            goto L_0x03ac
        L_0x032a:
            r3 = 2
            if (r2 != r3) goto L_0x032f
            r2 = r12
            goto L_0x0330
        L_0x032f:
            r2 = r10
        L_0x0330:
            q3.l.c(r2)
            boolean r1 = r1.f10444c
            if (r1 != 0) goto L_0x0342
            java.lang.Object r1 = r13.f9926c
            j4.C r1 = (j4.C) r1
            boolean r1 = r1.f8850b
            if (r1 == 0) goto L_0x0340
            goto L_0x0342
        L_0x0340:
            r7 = r10
            goto L_0x0343
        L_0x0342:
            r7 = r12
        L_0x0343:
            java.lang.Object r1 = r15.f4931c
            r3 = r1
            n3.g r3 = (n3.C0866g) r3
            n3.b r4 = r15.d
            r1 = r14
            r2 = r13
            r5 = r25
            r6 = r26
            r8 = r11
            m0.a0 r1 = r1.a(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x03ac
        L_0x0357:
            r9 = r26
            r11 = r15
            o3.f r1 = (o3.f) r1
            java.lang.Object r2 = r1.f4930b
            o3.e r2 = (o3.e) r2
            int r3 = r2.f10442a
            if (r3 != r12) goto L_0x0377
            java.lang.Object r2 = r1.f4931c
            r3 = r2
            n3.g r3 = (n3.C0866g) r3
            v3.s r4 = r1.d
            r1 = r14
            r2 = r13
            r5 = r25
            r6 = r26
            r7 = r11
            m0.a0 r1 = r1.c(r2, r3, r4, r5, r6, r7)
            goto L_0x03ac
        L_0x0377:
            r4 = 2
            if (r3 != r4) goto L_0x037c
            r3 = r12
            goto L_0x037d
        L_0x037c:
            r3 = r10
        L_0x037d:
            q3.l.c(r3)
            boolean r2 = r2.f10444c
            if (r2 != 0) goto L_0x0399
            java.lang.Object r2 = r13.f9926c
            j4.C r2 = (j4.C) r2
            boolean r2 = r2.f8850b
            if (r2 == 0) goto L_0x0397
            java.lang.Object r2 = r1.f4931c
            n3.g r2 = (n3.C0866g) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0397
            goto L_0x0399
        L_0x0397:
            r7 = r10
            goto L_0x039a
        L_0x0399:
            r7 = r12
        L_0x039a:
            java.lang.Object r2 = r1.f4931c
            r3 = r2
            n3.g r3 = (n3.C0866g) r3
            v3.s r4 = r1.d
            r1 = r14
            r2 = r13
            r5 = r25
            r6 = r26
            r8 = r11
            m0.a0 r1 = r1.b(r2, r3, r4, r5, r6, r7, r8)
        L_0x03ac:
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.HashMap r4 = r11.f175a
            java.util.Collection r4 = r4.values()
            r3.<init>(r4)
            r2.<init>(r3)
            java.lang.Object r3 = r1.f9925b
            j4.C r3 = (j4.C) r3
            boolean r4 = r3.f8849a
            if (r4 == 0) goto L_0x0428
            java.lang.Object r3 = r3.f8851c
            r6 = r3
            v3.m r6 = (v3.m) r6
            v3.s r3 = r6.f12296a
            boolean r3 = r3.h()
            v3.s r4 = r6.f12296a
            if (r3 != 0) goto L_0x03dc
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x03da
            goto L_0x03dc
        L_0x03da:
            r3 = r10
            goto L_0x03dd
        L_0x03dc:
            r3 = r12
        L_0x03dd:
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x041b
            java.lang.Object r5 = r13.f9925b
            j4.C r5 = (j4.C) r5
            boolean r7 = r5.f8849a
            if (r7 == 0) goto L_0x041b
            if (r3 == 0) goto L_0x03fd
            if (r7 == 0) goto L_0x03f6
            java.lang.Object r3 = r5.f8851c
            v3.m r3 = (v3.m) r3
            v3.s r3 = r3.f12296a
            goto L_0x03f7
        L_0x03f6:
            r3 = 0
        L_0x03f7:
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x041b
        L_0x03fd:
            v3.s r3 = r4.c()
            java.lang.Object r4 = r13.f9925b
            j4.C r4 = (j4.C) r4
            boolean r5 = r4.f8849a
            if (r5 == 0) goto L_0x0410
            java.lang.Object r4 = r4.f8851c
            v3.m r4 = (v3.m) r4
            v3.s r4 = r4.f12296a
            goto L_0x0411
        L_0x0410:
            r4 = 0
        L_0x0411:
            v3.s r4 = r4.c()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0428
        L_0x041b:
            s3.b r3 = new s3.b
            r5 = 5
            r8 = 0
            r7 = 0
            r9 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r2.add(r3)
        L_0x0428:
            java.lang.Object r3 = r1.f9926c
            j4.C r3 = (j4.C) r3
            boolean r3 = r3.f8849a
            if (r3 != 0) goto L_0x0438
            java.lang.Object r3 = r13.f9926c
            j4.C r3 = (j4.C) r3
            boolean r3 = r3.f8849a
            if (r3 != 0) goto L_0x0439
        L_0x0438:
            r10 = r12
        L_0x0439:
            java.lang.String r3 = "Once a server snap is complete, it should never go back"
            q3.l.b(r3, r10)
            r0.f11542c = r1
            java.lang.Object r1 = r1.f9925b
            j4.C r1 = (j4.C) r1
            java.lang.Object r1 = r1.f8851c
            v3.m r1 = (v3.m) r1
            r3 = 0
            java.util.ArrayList r1 = r0.a(r2, r1, r3)
            s3.g r0 = r0.f11540a
            s3.f r0 = r0.f11539b
            boolean r0 = r0.h()
            if (r0 != 0) goto L_0x0491
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0465:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0482
            java.lang.Object r4 = r2.next()
            s3.b r4 = (s3.C0964b) r4
            int r5 = r4.f11525a
            v3.c r4 = r4.d
            r6 = 2
            if (r5 != r6) goto L_0x047c
            r3.add(r4)
            goto L_0x0465
        L_0x047c:
            if (r5 != r12) goto L_0x0465
            r0.add(r4)
            goto L_0x0465
        L_0x0482:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x048e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0491
        L_0x048e:
            r0 = r22
            goto L_0x0494
        L_0x0491:
            r0 = r22
            goto L_0x0499
        L_0x0494:
            p3.a r2 = r0.f10320b
            r2.e()
        L_0x0499:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.q.b(s3.h, androidx.emoji2.text.g, m0.a0, v3.s):java.util.ArrayList");
    }

    public final s c(C0866g gVar) {
        s sVar;
        Iterator it2 = this.f10319a.values().iterator();
        do {
            sVar = null;
            if (!it2.hasNext()) {
                break;
            }
            C0970h hVar = (C0970h) it2.next();
            s l6 = hVar.f11542c.l();
            if (l6 != null && (hVar.f11540a.f11539b.h() || (!gVar.isEmpty() && !l6.l(gVar.z()).isEmpty()))) {
                sVar = l6.f(gVar);
                continue;
            }
        } while (sVar == null);
        return sVar;
    }

    public final C0970h d() {
        for (Map.Entry value : this.f10319a.entrySet()) {
            C0970h hVar = (C0970h) value.getValue();
            if (hVar.f11540a.f11539b.h()) {
                return hVar;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : this.f10319a.entrySet()) {
            C0970h hVar = (C0970h) value.getValue();
            if (!hVar.f11540a.f11539b.h()) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public final boolean f() {
        if (d() != null) {
            return true;
        }
        return false;
    }

    public final C0970h g(C0969g gVar) {
        if (gVar.f11539b.h()) {
            return d();
        }
        return (C0970h) this.f10319a.get(gVar.f11539b);
    }
}
