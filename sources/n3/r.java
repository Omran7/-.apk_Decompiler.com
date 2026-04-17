package n3;

import java.util.concurrent.Callable;

public final class r implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10321a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y f10322b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f10323c;
    public final /* synthetic */ Object d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f10324e;

    public /* synthetic */ r(y yVar, Object obj, Object obj2, Object obj3, int i2) {
        this.f10321a = i2;
        this.f10322b = yVar;
        this.f10323c = obj;
        this.d = obj2;
        this.f10324e = obj3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r14 = this;
            int r0 = r14.f10321a
            switch(r0) {
                case 0: goto L_0x0219;
                case 1: goto L_0x004c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.f10323c
            n3.z r0 = (n3.z) r0
            n3.y r1 = r14.f10322b
            java.util.HashMap r2 = r1.f10349c
            java.lang.Object r0 = r2.get(r0)
            s3.g r0 = (s3.C0969g) r0
            if (r0 == 0) goto L_0x0047
            java.lang.Object r2 = r14.d
            n3.g r2 = (n3.C0866g) r2
            n3.g r3 = r0.f11538a
            n3.g r3 = n3.C0866g.B(r3, r2)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0027
            r2 = r0
            goto L_0x002b
        L_0x0027:
            s3.g r2 = s3.C0969g.a(r2)
        L_0x002b:
            p3.a r4 = r1.f10351f
            java.lang.Object r5 = r14.f10324e
            v3.s r5 = (v3.s) r5
            r4.d(r2, r5)
            o3.f r2 = new o3.f
            o3.e r4 = new o3.e
            r6 = 2
            r7 = 1
            s3.f r8 = r0.f11539b
            r4.<init>(r6, r8, r7)
            r2.<init>(r4, r3, r5)
            java.util.ArrayList r0 = n3.y.b(r1, r0, r2)
            goto L_0x004b
        L_0x0047:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x004b:
            return r0
        L_0x004c:
            java.lang.Object r0 = r14.f10323c
            s3.g r0 = (s3.C0969g) r0
            n3.g r1 = r0.f11538a
            n3.y r2 = r14.f10322b
            q3.e r3 = r2.f10347a
            java.lang.Object r3 = r3.v(r1)
            n3.q r3 = (n3.q) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r3 == 0) goto L_0x0218
            boolean r5 = r0.b()
            if (r5 != 0) goto L_0x006f
            s3.h r5 = r3.g(r0)
            if (r5 == 0) goto L_0x0218
        L_0x006f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r6 = r3.f()
            boolean r7 = r0.b()
            java.util.HashMap r8 = r3.f10319a
            java.lang.Object r9 = r14.f10324e
            i3.d r9 = (i3.C0588d) r9
            java.lang.Object r10 = r14.d
            n3.f r10 = (n3.C0865f) r10
            if (r7 == 0) goto L_0x00c7
            java.util.Set r7 = r8.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0095:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x00f0
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            s3.h r11 = (s3.C0970h) r11
            java.util.List r12 = r11.b(r10, r9)
            r5.addAll(r12)
            java.util.ArrayList r12 = r11.d
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0095
            r7.remove()
            s3.g r11 = r11.f11540a
            s3.f r12 = r11.f11539b
            boolean r12 = r12.h()
            if (r12 != 0) goto L_0x0095
            r4.add(r11)
            goto L_0x0095
        L_0x00c7:
            s3.f r7 = r0.f11539b
            java.lang.Object r11 = r8.get(r7)
            s3.h r11 = (s3.C0970h) r11
            if (r11 == 0) goto L_0x00f0
            java.util.List r10 = r11.b(r10, r9)
            r5.addAll(r10)
            java.util.ArrayList r10 = r11.d
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x00f0
            r8.remove(r7)
            s3.g r7 = r11.f11540a
            s3.f r10 = r7.f11539b
            boolean r10 = r10.h()
            if (r10 != 0) goto L_0x00f0
            r4.add(r7)
        L_0x00f0:
            if (r6 == 0) goto L_0x0101
            boolean r3 = r3.f()
            if (r3 != 0) goto L_0x0101
            n3.g r3 = r0.f11538a
            s3.g r3 = s3.C0969g.a(r3)
            r4.add(r3)
        L_0x0101:
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L_0x010f
            q3.e r3 = r2.f10347a
            q3.e r3 = r3.x(r1)
            r2.f10347a = r3
        L_0x010f:
            java.util.Iterator r3 = r4.iterator()
            r6 = 0
        L_0x0114:
            r7 = r6
        L_0x0115:
            boolean r8 = r3.hasNext()
            r10 = 1
            if (r8 == 0) goto L_0x0133
            java.lang.Object r8 = r3.next()
            s3.g r8 = (s3.C0969g) r8
            p3.a r11 = r2.f10351f
            r11.e()
            if (r7 != 0) goto L_0x0131
            s3.f r7 = r8.f11539b
            boolean r7 = r7.h()
            if (r7 == 0) goto L_0x0114
        L_0x0131:
            r7 = r10
            goto L_0x0115
        L_0x0133:
            q3.e r3 = r2.f10347a
            java.lang.Object r8 = r3.f11088a
            if (r8 == 0) goto L_0x0143
            n3.q r8 = (n3.q) r8
            boolean r8 = r8.f()
            if (r8 == 0) goto L_0x0143
            r8 = r10
            goto L_0x0144
        L_0x0143:
            r8 = r6
        L_0x0144:
            k3.k r11 = new k3.k
            r11.<init>((n3.C0866g) r1)
        L_0x0149:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0173
            java.lang.Object r12 = r11.next()
            v3.c r12 = (v3.C1048c) r12
            q3.e r3 = r3.w(r12)
            if (r8 != 0) goto L_0x016a
            java.lang.Object r8 = r3.f11088a
            if (r8 == 0) goto L_0x0168
            n3.q r8 = (n3.q) r8
            boolean r8 = r8.f()
            if (r8 == 0) goto L_0x0168
            goto L_0x016a
        L_0x0168:
            r8 = r6
            goto L_0x016b
        L_0x016a:
            r8 = r10
        L_0x016b:
            if (r8 != 0) goto L_0x0173
            boolean r12 = r3.isEmpty()
            if (r12 == 0) goto L_0x0149
        L_0x0173:
            n3.x r3 = r2.f10350e
            if (r7 == 0) goto L_0x01b0
            if (r8 != 0) goto L_0x01b0
            q3.e r11 = r2.f10347a
            q3.e r1 = r11.A(r1)
            boolean r11 = r1.isEmpty()
            if (r11 != 0) goto L_0x01b0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            n3.y.i(r1, r11)
            java.util.Iterator r1 = r11.iterator()
        L_0x0191:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x01b0
            java.lang.Object r11 = r1.next()
            s3.h r11 = (s3.C0970h) r11
            n3.G r12 = new n3.G
            r12.<init>(r2, r11)
            s3.g r11 = r11.f11540a
            s3.g r11 = n3.y.j(r11)
            java.lang.Object r13 = r12.f10251b
            n3.z r13 = (n3.z) r13
            r3.c(r11, r13, r12, r12)
            goto L_0x0191
        L_0x01b0:
            if (r8 != 0) goto L_0x01e8
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x01e8
            if (r9 != 0) goto L_0x01e8
            if (r7 == 0) goto L_0x01c4
            s3.g r0 = n3.y.j(r0)
            r3.b(r0)
            goto L_0x01e8
        L_0x01c4:
            java.util.Iterator r0 = r4.iterator()
        L_0x01c8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01e8
            java.lang.Object r1 = r0.next()
            s3.g r1 = (s3.C0969g) r1
            n3.z r7 = r2.l(r1)
            if (r7 == 0) goto L_0x01dc
            r7 = r10
            goto L_0x01dd
        L_0x01dc:
            r7 = r6
        L_0x01dd:
            q3.l.c(r7)
            s3.g r1 = n3.y.j(r1)
            r3.b(r1)
            goto L_0x01c8
        L_0x01e8:
            java.util.Iterator r0 = r4.iterator()
        L_0x01ec:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0217
            java.lang.Object r1 = r0.next()
            s3.g r1 = (s3.C0969g) r1
            s3.f r3 = r1.f11539b
            boolean r3 = r3.h()
            if (r3 != 0) goto L_0x01ec
            n3.z r3 = r2.l(r1)
            if (r3 == 0) goto L_0x0208
            r4 = r10
            goto L_0x0209
        L_0x0208:
            r4 = r6
        L_0x0209:
            q3.l.c(r4)
            java.util.HashMap r4 = r2.d
            r4.remove(r1)
            java.util.HashMap r1 = r2.f10349c
            r1.remove(r3)
            goto L_0x01ec
        L_0x0217:
            r4 = r5
        L_0x0218:
            return r4
        L_0x0219:
            java.lang.Object r0 = r14.f10323c
            n3.z r0 = (n3.z) r0
            n3.y r1 = r14.f10322b
            java.util.HashMap r2 = r1.f10349c
            java.lang.Object r0 = r2.get(r0)
            s3.g r0 = (s3.C0969g) r0
            if (r0 == 0) goto L_0x0253
            java.lang.Object r2 = r14.d
            n3.g r2 = (n3.C0866g) r2
            n3.g r3 = r0.f11538a
            n3.g r3 = n3.C0866g.B(r3, r2)
            java.lang.Object r4 = r14.f10324e
            java.util.HashMap r4 = (java.util.HashMap) r4
            n3.b r4 = n3.C0861b.y(r4)
            p3.a r5 = r1.f10351f
            r5.c(r2, r4)
            o3.c r2 = new o3.c
            o3.e r5 = new o3.e
            r6 = 2
            r7 = 1
            s3.f r8 = r0.f11539b
            r5.<init>(r6, r8, r7)
            r2.<init>(r5, r3, r4)
            java.util.ArrayList r0 = n3.y.b(r1, r0, r2)
            goto L_0x0257
        L_0x0253:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0257:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.r.call():java.lang.Object");
    }
}
