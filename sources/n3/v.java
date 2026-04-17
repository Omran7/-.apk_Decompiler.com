package n3;

import java.util.concurrent.Callable;
import q3.C0936a;

public final class v implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f10340a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f10341b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f10342c;
    public final /* synthetic */ C0936a d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ y f10343e;

    public v(y yVar, boolean z3, long j6, boolean z4, C0936a aVar) {
        this.f10343e = yVar;
        this.f10340a = z3;
        this.f10341b = j6;
        this.f10342c = z4;
        this.d = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r15 = this;
            boolean r0 = r15.f10340a
            long r1 = r15.f10341b
            n3.y r3 = r15.f10343e
            if (r0 == 0) goto L_0x000d
            p3.a r0 = r3.f10351f
            r0.e()
        L_0x000d:
            n3.G r0 = r3.f10348b
            java.lang.Object r0 = r0.f10251b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r4 = r0.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x002b
            java.lang.Object r4 = r0.next()
            n3.B r4 = (n3.C0857B) r4
            long r6 = r4.f10239a
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x0017
            goto L_0x002c
        L_0x002b:
            r4 = r5
        L_0x002c:
            n3.G r0 = r3.f10348b
            java.lang.Object r6 = r0.f10251b
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.util.Iterator r7 = r6.iterator()
            r8 = 0
            r9 = r8
        L_0x0038:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x004f
            java.lang.Object r10 = r7.next()
            n3.B r10 = (n3.C0857B) r10
            long r11 = r10.f10239a
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 != 0) goto L_0x004c
            r5 = r10
            goto L_0x004f
        L_0x004c:
            int r9 = r9 + 1
            goto L_0x0038
        L_0x004f:
            r1 = 1
            if (r5 == 0) goto L_0x0054
            r2 = r1
            goto L_0x0055
        L_0x0054:
            r2 = r8
        L_0x0055:
            java.lang.String r7 = "removeWrite called with nonexistent writeId"
            q3.l.b(r7, r2)
            r6.remove(r5)
            boolean r2 = r5.f10242e
            int r7 = r6.size()
            int r7 = r7 - r1
            r10 = r8
        L_0x0065:
            n3.g r11 = r5.f10240b
            if (r2 == 0) goto L_0x00bb
            if (r7 < 0) goto L_0x00bb
            java.lang.Object r12 = r6.get(r7)
            n3.B r12 = (n3.C0857B) r12
            boolean r13 = r12.f10242e
            if (r13 == 0) goto L_0x00b8
            n3.g r13 = r12.f10240b
            if (r7 < r9) goto L_0x00b1
            boolean r14 = r12.c()
            if (r14 == 0) goto L_0x0084
            boolean r12 = r13.x(r11)
            goto L_0x00ad
        L_0x0084:
            n3.b r12 = r12.a()
            q3.e r12 = r12.f10258a
            java.util.Iterator r12 = r12.iterator()
        L_0x008e:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x00ac
            java.lang.Object r14 = r12.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r14 = r14.getKey()
            n3.g r14 = (n3.C0866g) r14
            n3.g r14 = r13.t(r14)
            boolean r14 = r14.x(r11)
            if (r14 == 0) goto L_0x008e
            r12 = r1
            goto L_0x00ad
        L_0x00ac:
            r12 = r8
        L_0x00ad:
            if (r12 == 0) goto L_0x00b1
            r2 = r8
            goto L_0x00b8
        L_0x00b1:
            boolean r11 = r11.x(r13)
            if (r11 == 0) goto L_0x00b8
            r10 = r1
        L_0x00b8:
            int r7 = r7 + -1
            goto L_0x0065
        L_0x00bb:
            if (r2 != 0) goto L_0x00bf
            goto L_0x0157
        L_0x00bf:
            if (r10 == 0) goto L_0x00ef
            androidx.fragment.app.D r2 = n3.G.d
            n3.g r5 = n3.C0866g.d
            n3.b r2 = n3.G.b(r6, r2, r5)
            r0.f10250a = r2
            int r2 = r6.size()
            if (r2 <= 0) goto L_0x00e5
            int r2 = r6.size()
            int r2 = r2 - r1
            java.lang.Object r2 = r6.get(r2)
            n3.B r2 = (n3.C0857B) r2
            long r5 = r2.f10239a
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r0.f10252c = r2
            goto L_0x00ed
        L_0x00e5:
            r5 = -1
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r0.f10252c = r2
        L_0x00ed:
            r8 = r1
            goto L_0x0157
        L_0x00ef:
            boolean r2 = r5.c()
            if (r2 == 0) goto L_0x0116
            java.lang.Object r2 = r0.f10250a
            n3.b r2 = (n3.C0861b) r2
            r2.getClass()
            boolean r5 = r11.isEmpty()
            if (r5 == 0) goto L_0x0105
            n3.b r2 = n3.C0861b.f10257b
            goto L_0x0113
        L_0x0105:
            q3.e r5 = q3.e.d
            q3.e r2 = r2.f10258a
            q3.e r2 = r2.z(r11, r5)
            n3.b r5 = new n3.b
            r5.<init>(r2)
            r2 = r5
        L_0x0113:
            r0.f10250a = r2
            goto L_0x00ed
        L_0x0116:
            n3.b r2 = r5.a()
            q3.e r2 = r2.f10258a
            java.util.Iterator r2 = r2.iterator()
        L_0x0120:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00ed
            java.lang.Object r5 = r2.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getKey()
            n3.g r5 = (n3.C0866g) r5
            java.lang.Object r6 = r0.f10250a
            n3.b r6 = (n3.C0861b) r6
            n3.g r5 = r11.t(r5)
            r6.getClass()
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L_0x0146
            n3.b r5 = n3.C0861b.f10257b
            goto L_0x0154
        L_0x0146:
            q3.e r7 = q3.e.d
            q3.e r6 = r6.f10258a
            q3.e r5 = r6.z(r5, r7)
            n3.b r6 = new n3.b
            r6.<init>(r5)
            r5 = r6
        L_0x0154:
            r0.f10250a = r5
            goto L_0x0120
        L_0x0157:
            boolean r0 = r4.f10242e
            boolean r1 = r15.f10342c
            n3.g r2 = r4.f10240b
            if (r0 == 0) goto L_0x0189
            if (r1 != 0) goto L_0x0189
            q3.a r0 = r15.d
            java.util.HashMap r0 = R2.b.A(r0)
            boolean r5 = r4.c()
            p3.a r6 = r3.f10351f
            if (r5 == 0) goto L_0x017f
            v3.s r5 = r4.b()
            n3.E r7 = new n3.E
            r7.<init>(r3, r2)
            R2.b.I0(r5, r7, r0)
            r6.e()
            goto L_0x0189
        L_0x017f:
            n3.b r5 = r4.a()
            R2.b.H0(r5, r3, r2, r0)
            r6.e()
        L_0x0189:
            if (r8 != 0) goto L_0x0190
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x01cd
        L_0x0190:
            q3.e r0 = q3.e.d
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x01a1
            n3.g r4 = n3.C0866g.d
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            q3.e r0 = r0.y(r4, r5)
            goto L_0x01c4
        L_0x01a1:
            n3.b r4 = r4.a()
            q3.e r4 = r4.f10258a
            java.util.Iterator r4 = r4.iterator()
        L_0x01ab:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01c4
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getKey()
            n3.g r5 = (n3.C0866g) r5
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            q3.e r0 = r0.y(r5, r6)
            goto L_0x01ab
        L_0x01c4:
            o3.a r4 = new o3.a
            r4.<init>(r2, r0, r1)
            java.util.ArrayList r0 = n3.y.a(r3, r4)
        L_0x01cd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.v.call():java.lang.Object");
    }
}
