package s3;

import B0.A;
import androidx.emoji2.text.v;
import c1.i;
import j4.C;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m0.a0;
import n3.C0861b;
import n3.C0866g;
import n3.G;
import q3.e;
import q3.l;
import t3.C1007a;
import t3.C1008b;
import v3.C1048c;
import v3.C1051f;
import v3.k;
import v3.m;
import v3.s;

/* renamed from: s3.i  reason: case insensitive filesystem */
public final class C0971i {

    /* renamed from: b  reason: collision with root package name */
    public static final v f11544b = new v(25);

    /* renamed from: a  reason: collision with root package name */
    public final C1008b f11545a;

    public C0971i(C1008b bVar) {
        this.f11545a = bVar;
    }

    public final a0 a(a0 a0Var, C0866g gVar, C0861b bVar, a0 a0Var2, s sVar, boolean z3, A a6) {
        boolean z4;
        a0 a0Var3;
        boolean z5;
        a0 a0Var4 = a0Var;
        C0861b bVar2 = bVar;
        boolean isEmpty = ((m) ((C) a0Var4.f9926c).f8851c).f12296a.isEmpty();
        C c3 = (C) a0Var4.f9926c;
        if (isEmpty && !c3.f8849a) {
            return a0Var4;
        }
        if (((s) bVar2.f10258a.f11088a) == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        l.b("Can't have a merge that is an overwrite", z4);
        if (!gVar.isEmpty()) {
            bVar2 = C0861b.f10257b.t(gVar, bVar2);
        }
        s sVar2 = ((m) c3.f8851c).f12296a;
        bVar2.getClass();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : bVar2.f10258a.f11089b) {
            hashMap.put((C1048c) entry.getKey(), new C0861b((e) entry.getValue()));
        }
        loop1:
        while (true) {
            a0Var3 = a0Var4;
            for (Map.Entry entry2 : hashMap.entrySet()) {
                C1048c cVar = (C1048c) entry2.getKey();
                if (sVar2.d(cVar)) {
                    a0Var4 = b(a0Var3, new C0866g(cVar), ((C0861b) entry2.getValue()).v(sVar2.l(cVar)), a0Var2, sVar, z3, a6);
                }
            }
            break loop1;
        }
        a0 a0Var5 = a0Var3;
        for (Map.Entry entry3 : hashMap.entrySet()) {
            C1048c cVar2 = (C1048c) entry3.getKey();
            C0861b bVar3 = (C0861b) entry3.getValue();
            if (c3.a(cVar2) || ((s) bVar3.f10258a.f11088a) != null) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!sVar2.d(cVar2) && !z5) {
                a0Var5 = b(a0Var5, new C0866g(cVar2), ((C0861b) entry3.getValue()).v(sVar2.l(cVar2)), a0Var2, sVar, z3, a6);
            }
        }
        return a0Var5;
    }

    public final a0 b(a0 a0Var, C0866g gVar, s sVar, a0 a0Var2, s sVar2, boolean z3, A a6) {
        m mVar;
        a0 a0Var3 = a0Var;
        s sVar3 = sVar;
        C c3 = (C) a0Var3.f9926c;
        C1008b bVar = this.f11545a;
        if (!z3) {
            bVar = bVar.j();
        }
        boolean isEmpty = gVar.isEmpty();
        m mVar2 = (m) c3.f8851c;
        boolean z4 = true;
        if (isEmpty) {
            mVar = bVar.A(mVar2, new m(sVar3, bVar.n()), (A) null);
        } else if (!bVar.m() || c3.f8850b) {
            C1048c z5 = gVar.z();
            if (!c3.b(gVar) && gVar.size() > 1) {
                return a0Var3;
            }
            C0866g C6 = gVar.C();
            s q6 = mVar2.f12296a.l(z5).q(C6, sVar3);
            if (z5.equals(C1048c.d)) {
                mVar = bVar.b(mVar2, q6);
            } else {
                C1008b bVar2 = bVar;
                mVar = bVar2.g((m) c3.f8851c, z5, q6, C6, f11544b, (A) null);
            }
            if (!c3.f8849a && !gVar.isEmpty()) {
                z4 = false;
            }
            a0 a0Var4 = new a0((C) a0Var3.f9925b, new C(mVar, z4, bVar.m()), 14);
            return d(a0Var4, gVar, a0Var2, new i((Object) a0Var2, (Object) a0Var4, (Object) sVar2, 16), a6);
        } else {
            l.b("An empty path should have been caught in the other branch", !gVar.isEmpty());
            C1048c z6 = gVar.z();
            mVar = bVar.A(mVar2, mVar2.v(z6, mVar2.f12296a.l(z6).q(gVar.C(), sVar3)), (A) null);
        }
        C0866g gVar2 = gVar;
        z4 = false;
        a0 a0Var42 = new a0((C) a0Var3.f9925b, new C(mVar, z4, bVar.m()), 14);
        return d(a0Var42, gVar, a0Var2, new i((Object) a0Var2, (Object) a0Var42, (Object) sVar2, 16), a6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: j4.C} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final m0.a0 c(m0.a0 r18, n3.C0866g r19, v3.s r20, m0.a0 r21, v3.s r22, B0.A r23) {
        /*
            r17 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.Object r4 = r0.f9925b
            j4.C r4 = (j4.C) r4
            c1.i r10 = new c1.i
            r5 = 16
            r10.<init>((java.lang.Object) r2, (java.lang.Object) r0, (java.lang.Object) r3, (int) r5)
            boolean r5 = r19.isEmpty()
            r12 = r17
            t3.b r13 = r12.f11545a
            java.lang.Object r6 = r0.f9925b
            j4.C r6 = (j4.C) r6
            r7 = 1
            java.lang.Object r8 = r6.f8851c
            v3.m r8 = (v3.m) r8
            if (r5 == 0) goto L_0x003f
            v3.l r2 = r13.n()
            v3.m r3 = new v3.m
            r3.<init>(r1, r2)
            r11 = r23
            v3.m r1 = r13.A(r8, r3, r11)
            boolean r2 = r13.m()
            m0.a0 r0 = r0.x(r1, r7, r2)
            goto L_0x00d8
        L_0x003f:
            r11 = r23
            v3.c r9 = r19.z()
            v3.c r5 = v3.C1048c.d
            boolean r14 = r9.equals(r5)
            boolean r15 = r4.f8849a
            if (r14 == 0) goto L_0x005b
            v3.m r1 = r13.b(r8, r1)
            boolean r2 = r4.f8850b
            m0.a0 r0 = r0.x(r1, r15, r2)
            goto L_0x00d8
        L_0x005b:
            n3.g r14 = r19.C()
            java.lang.Object r7 = r4.f8851c
            v3.m r7 = (v3.m) r7
            v3.s r7 = r7.f12296a
            v3.s r7 = r7.l(r9)
            boolean r16 = r14.isEmpty()
            if (r16 == 0) goto L_0x0071
        L_0x006f:
            r8 = r1
            goto L_0x00bc
        L_0x0071:
            boolean r6 = r6.a(r9)
            if (r6 == 0) goto L_0x007e
            v3.s r2 = r8.f12296a
            v3.s r2 = r2.l(r9)
            goto L_0x0098
        L_0x007e:
            if (r3 == 0) goto L_0x008f
            j4.C r6 = new j4.C
            v3.n r8 = v3.n.f12299a
            v3.m r11 = new v3.m
            r11.<init>(r3, r8)
            r3 = 0
            r8 = 1
            r6.<init>(r11, r8, r3)
            goto L_0x0094
        L_0x008f:
            java.lang.Object r3 = r0.f9926c
            r6 = r3
            j4.C r6 = (j4.C) r6
        L_0x0094:
            v3.s r2 = r2.f(r9, r6)
        L_0x0098:
            if (r2 == 0) goto L_0x00b9
            v3.c r3 = r14.y()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00b4
            n3.g r3 = r14.A()
            v3.s r3 = r2.f(r3)
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00b4
            r8 = r2
            goto L_0x00bc
        L_0x00b4:
            v3.s r1 = r2.q(r14, r1)
            goto L_0x006f
        L_0x00b9:
            v3.k r1 = v3.k.f12295e
            goto L_0x006f
        L_0x00bc:
            boolean r1 = r7.equals(r8)
            if (r1 != 0) goto L_0x00d8
            java.lang.Object r1 = r4.f8851c
            r6 = r1
            v3.m r6 = (v3.m) r6
            r5 = r13
            r7 = r9
            r9 = r14
            r11 = r23
            v3.m r1 = r5.g(r6, r7, r8, r9, r10, r11)
            boolean r2 = r13.m()
            m0.a0 r0 = r0.x(r1, r15, r2)
        L_0x00d8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C0971i.c(m0.a0, n3.g, v3.s, m0.a0, v3.s, B0.A):m0.a0");
    }

    public final a0 d(a0 a0Var, C0866g gVar, a0 a0Var2, C1007a aVar, A a6) {
        m mVar;
        s sVar;
        boolean z3;
        s sVar2;
        a0 a0Var3 = a0Var;
        C0866g gVar2 = gVar;
        a0 a0Var4 = a0Var2;
        C c3 = (C) a0Var3.f9925b;
        if (a0Var4.w(gVar2) != null) {
            return a0Var3;
        }
        boolean isEmpty = gVar.isEmpty();
        C1008b bVar = this.f11545a;
        C c6 = (C) a0Var3.f9926c;
        boolean z4 = false;
        if (isEmpty) {
            l.b("If change path is empty, we must have complete server data", c6.f8849a);
            if (c6.f8850b) {
                s l6 = a0Var.l();
                if (!(l6 instanceof C1051f)) {
                    l6 = k.f12295e;
                }
                sVar2 = a0Var4.g(l6);
            } else {
                sVar2 = ((G) a0Var4.f9926c).a((C0866g) a0Var4.f9925b, a0Var.l(), Collections.emptyList(), false);
            }
            mVar = bVar.A((m) c3.f8851c, new m(sVar2, bVar.n()), a6);
        } else {
            A a7 = a6;
            C1048c z5 = gVar.z();
            boolean equals = z5.equals(C1048c.d);
            m mVar2 = (m) c3.f8851c;
            m mVar3 = (m) c6.f8851c;
            if (equals) {
                if (gVar.size() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                l.b("Can't have a priority with additional path components", z3);
                s h = a0Var4.h(gVar2, mVar2.f12296a, mVar3.f12296a);
                if (h != null) {
                    mVar = bVar.b(mVar2, h);
                }
            } else {
                C0866g C6 = gVar.C();
                if (c3.a(z5)) {
                    s h6 = a0Var4.h(gVar2, mVar2.f12296a, mVar3.f12296a);
                    s sVar3 = mVar2.f12296a;
                    if (h6 != null) {
                        sVar = sVar3.l(z5).q(C6, h6);
                    } else {
                        sVar = sVar3.l(z5);
                    }
                } else {
                    sVar = a0Var4.f(z5, c6);
                }
                if (sVar != null) {
                    mVar = bVar.g((m) c3.f8851c, z5, sVar, C6, aVar, a6);
                }
            }
            mVar = mVar2;
        }
        if (c3.f8849a || gVar.isEmpty()) {
            z4 = true;
        }
        return a0Var3.x(mVar, z4, bVar.m());
    }
}
