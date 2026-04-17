package n3;

import S3.r;
import S3.z;
import T1.C0224y0;
import android.os.Handler;
import android.support.v4.media.session.a;
import androidx.emoji2.text.v;
import c1.i;
import com.mtma.criminal.city.fragments.gangBase.I;
import com.mtma.criminal.city.utils.C0442l;
import i3.C0588d;
import i3.C0589e;
import j3.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k.C0724m;
import k.C0737s0;
import l3.o;
import m0.a0;
import q.C0928e;
import q3.b;
import q3.j;
import q3.k;
import q3.l;
import s3.C0969g;
import v3.C1048c;
import v3.s;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final n f10299a;

    /* renamed from: b  reason: collision with root package name */
    public final C0442l f10300b;

    /* renamed from: c  reason: collision with root package name */
    public o f10301c;
    public C0724m d;

    /* renamed from: e  reason: collision with root package name */
    public v f10302e;

    /* renamed from: f  reason: collision with root package name */
    public i f10303f;
    public final a0 g;
    public final C0864e h;

    /* renamed from: i  reason: collision with root package name */
    public final i f10304i;

    /* renamed from: j  reason: collision with root package name */
    public final i f10305j;

    /* renamed from: k  reason: collision with root package name */
    public final i f10306k;

    /* renamed from: l  reason: collision with root package name */
    public long f10307l = 1;

    /* renamed from: m  reason: collision with root package name */
    public y f10308m;

    /* renamed from: n  reason: collision with root package name */
    public y f10309n;

    /* renamed from: o  reason: collision with root package name */
    public long f10310o = 0;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.mtma.criminal.city.utils.l] */
    public m(C0864e eVar, n nVar) {
        new v(24);
        ? obj = new Object();
        obj.f7431a = 0;
        this.f10300b = obj;
        this.f10299a = nVar;
        this.h = eVar;
        this.f10304i = eVar.b("RepoOperation");
        this.f10305j = eVar.b("Transaction");
        this.f10306k = eVar.b("DataOperation");
        this.g = new a0(eVar);
        o(new C0737s0(this, 10));
    }

    public static void c(m mVar, String str, C0866g gVar, C0588d dVar) {
        int i2;
        mVar.getClass();
        if (dVar != null && (i2 = dVar.f8281a) != -1 && i2 != -25) {
            StringBuilder b6 = C0928e.b(str, " at ");
            b6.append(gVar.toString());
            b6.append(" failed: ");
            b6.append(dVar.toString());
            mVar.f10304i.Q(b6.toString());
        }
    }

    public static void d(m mVar, long j6, C0866g gVar, C0588d dVar) {
        boolean z3;
        mVar.getClass();
        if (dVar == null || dVar.f8281a != -25) {
            if (dVar == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            List c3 = mVar.f10309n.c(j6, !z3, true, mVar.f10300b);
            if (c3.size() > 0) {
                mVar.n(gVar);
            }
            mVar.k(c3);
        }
    }

    public static void f(ArrayList arrayList, i iVar) {
        List list = ((j) iVar.d).f11098b;
        if (list != null) {
            arrayList.addAll(list);
        }
        Object[] array = ((j) iVar.d).f11097a.entrySet().toArray();
        for (Object obj : array) {
            Map.Entry entry = (Map.Entry) obj;
            f(arrayList, new i((Object) (C1048c) entry.getKey(), (Object) iVar, (Object) (j) entry.getValue(), 14));
        }
    }

    public static ArrayList g(i iVar) {
        ArrayList arrayList = new ArrayList();
        f(arrayList, iVar);
        Collections.sort(arrayList);
        return arrayList;
    }

    public final C0866g a(C0866g gVar) {
        C0866g s6 = i(gVar).s();
        if (this.f10305j.y()) {
            this.f10304i.d("Aborting transactions for path: " + gVar + ". Affected: " + s6, (Throwable) null, new Object[0]);
        }
        i J5 = this.f10303f.J(gVar);
        for (i iVar = (i) J5.f5606c; iVar != null; iVar = (i) iVar.f5606c) {
            b(iVar);
        }
        b(J5);
        j jVar = new j(this);
        Object[] array = ((j) J5.d).f11097a.entrySet().toArray();
        for (Object obj : array) {
            Map.Entry entry = (Map.Entry) obj;
            new i((Object) (C1048c) entry.getKey(), (Object) J5, (Object) (j) entry.getValue(), 14).i(jVar, true);
        }
        return s6;
    }

    public final void b(i iVar) {
        i iVar2 = iVar;
        List list = ((j) iVar2.d).f11098b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            C0588d b6 = C0588d.b("overriddenBySet", (String) null);
            int i2 = 0;
            int i5 = -1;
            while (true) {
                boolean z3 = true;
                if (i2 >= list.size()) {
                    break;
                }
                l lVar = (l) list.get(i2);
                int i6 = lVar.d;
                if (i6 != 5) {
                    if (i6 == 3) {
                        if (i5 != i2 - 1) {
                            z3 = false;
                        }
                        l.c(z3);
                        lVar.d = 5;
                        lVar.f10294q = b6;
                        i5 = i2;
                    } else {
                        if (i6 != 2) {
                            z3 = false;
                        }
                        l.c(z3);
                        m(new C0859D(this, lVar.f10290c, C0969g.a(lVar.f10288a)));
                        arrayList.addAll(this.f10309n.c(lVar.f10295r, true, false, this.f10300b));
                        arrayList2.add(new g(lVar, b6, 6));
                    }
                }
                i2++;
            }
            if (i5 == -1) {
                ((j) iVar2.d).f11098b = null;
                iVar.N();
            } else {
                ((j) iVar2.d).f11098b = list.subList(0, i5 + 1);
                iVar.N();
            }
            k(arrayList);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                j((Runnable) it2.next());
            }
        }
    }

    public final void e(C0865f fVar) {
        List list;
        C1048c z3 = fVar.e().f11538a.z();
        if (z3 == null || !z3.equals(C0862c.f10259a)) {
            y yVar = this.f10309n;
            yVar.getClass();
            list = (List) yVar.f10351f.a(new C0224y0(yVar, fVar, 3));
        } else {
            y yVar2 = this.f10308m;
            yVar2.getClass();
            list = (List) yVar2.f10351f.a(new C0224y0(yVar2, fVar, 3));
        }
        k(list);
    }

    public final void h(k kVar, C0588d dVar, C0866g gVar) {
        r rVar;
        if (kVar != null) {
            C1048c y6 = gVar.y();
            if (y6 == null || !y6.equals(C1048c.d)) {
                rVar = new r(this, gVar);
            } else {
                rVar = new r(this, gVar.A());
            }
            j(new g((Object) kVar, (Object) dVar, (Object) rVar, 7));
        }
    }

    public final i i(C0866g gVar) {
        i iVar = this.f10303f;
        while (!gVar.isEmpty() && ((j) iVar.d).f11098b == null) {
            iVar = iVar.J(new C0866g(gVar.z()));
            gVar = gVar.C();
        }
        return iVar;
    }

    public final void j(Runnable runnable) {
        ((Handler) this.h.f10266b.f7143b).post(runnable);
    }

    public final void k(List list) {
        if (!list.isEmpty()) {
            a0 a0Var = this.g;
            i iVar = (i) a0Var.f9926c;
            if (iVar.y()) {
                iVar.d("Raising " + list.size() + " event(s)", (Throwable) null, new Object[0]);
            }
            ((Handler) ((I) a0Var.f9925b).f7143b).post(new g((Object) a0Var, (Object) new ArrayList(list), 9, false));
        }
    }

    public final void l(i iVar) {
        List list = ((j) iVar.d).f11098b;
        if (list != null) {
            int i2 = 0;
            while (i2 < list.size()) {
                if (((l) list.get(i2)).d == 4) {
                    list.remove(i2);
                } else {
                    i2++;
                }
            }
            if (list.size() > 0) {
                ((j) iVar.d).f11098b = list;
                iVar.N();
            } else {
                ((j) iVar.d).f11098b = null;
                iVar.N();
            }
        }
        Object[] array = ((j) iVar.d).f11097a.entrySet().toArray();
        for (Object obj : array) {
            Map.Entry entry = (Map.Entry) obj;
            l(new i((Object) (C1048c) entry.getKey(), (Object) iVar, (Object) (j) entry.getValue(), 14));
        }
    }

    public final void m(C0865f fVar) {
        List list;
        if (C0862c.f10259a.equals(fVar.e().f11538a.z())) {
            y yVar = this.f10308m;
            yVar.getClass();
            list = yVar.k(fVar.e(), fVar, (C0588d) null);
        } else {
            y yVar2 = this.f10309n;
            yVar2.getClass();
            list = yVar2.k(fVar.e(), fVar, (C0588d) null);
        }
        k(list);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [S3.r, i3.f] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n3.C0866g n(n3.C0866g r28) {
        /*
            r27 = this;
            r1 = r27
            c1.i r0 = r27.i(r28)
            n3.g r2 = r0.s()
            java.util.ArrayList r0 = g(r0)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0018
            r25 = r2
            goto L_0x01b0
        L_0x0018:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        L_0x0026:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x003c
            java.lang.Object r6 = r5.next()
            n3.l r6 = (n3.l) r6
            long r6 = r6.f10295r
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r4.add(r6)
            goto L_0x0026
        L_0x003c:
            java.util.Iterator r5 = r0.iterator()
        L_0x0040:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x018e
            java.lang.Object r0 = r5.next()
            r7 = r0
            n3.l r7 = (n3.l) r7
            n3.g r0 = r7.f10288a
            n3.g r0 = n3.C0866g.B(r2, r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 1
            if (r0 == 0) goto L_0x005d
            r0 = r9
            goto L_0x005e
        L_0x005d:
            r0 = 0
        L_0x005e:
            q3.l.c(r0)
            int r0 = r7.d
            n3.g r10 = r7.f10288a
            com.mtma.criminal.city.utils.l r15 = r1.f10300b
            r11 = 6
            if (r0 != r11) goto L_0x0089
            i3.d r0 = r7.f10294q
            int r6 = r0.f8281a
            r11 = -25
            if (r6 == r11) goto L_0x0082
            n3.y r11 = r1.f10309n
            long r12 = r7.f10295r
            r14 = 1
            r6 = 0
            r16 = r15
            r15 = r6
            java.util.List r6 = r11.c(r12, r14, r15, r16)
            r8.addAll(r6)
        L_0x0082:
            r25 = r2
            r26 = r3
            r6 = r9
            goto L_0x015a
        L_0x0089:
            r16 = r15
            r11 = 2
            r15 = 0
            if (r0 != r11) goto L_0x0153
            int r0 = r7.f10293p
            r11 = 25
            if (r0 < r11) goto L_0x00a9
            java.lang.String r0 = "maxretries"
            i3.d r0 = i3.C0588d.b(r0, r15)
            n3.y r11 = r1.f10309n
            long r12 = r7.f10295r
            r14 = 1
            r15 = 0
            java.util.List r6 = r11.c(r12, r14, r15, r16)
            r8.addAll(r6)
            goto L_0x0082
        L_0x00a9:
            n3.y r0 = r1.f10309n
            v3.s r0 = r0.h(r10, r4)
            if (r0 != 0) goto L_0x00b3
            v3.k r0 = v3.k.f12295e
        L_0x00b3:
            r11 = r0
            r7.f10296s = r11
            i3.k r0 = new i3.k
            k.m r12 = new k.m
            r13 = 7
            r12.<init>(r11, r13)
            n3.g r13 = new n3.g
            java.lang.String r14 = ""
            r13.<init>((java.lang.String) r14)
            r0.<init>(r12, r13)
            i3.p r12 = r7.f10289b     // Catch:{ all -> 0x00d1 }
            B0.H r0 = r12.f(r0)     // Catch:{ all -> 0x00d1 }
            r17 = r15
            goto L_0x00e4
        L_0x00d1:
            r0 = move-exception
            c1.i r12 = r1.f10304i
            java.lang.String r13 = "Caught Throwable."
            r12.g(r13, r0)
            i3.d r0 = i3.C0588d.a(r0)
            B0.H r12 = R2.b.a()
            r17 = r0
            r0 = r12
        L_0x00e4:
            boolean r12 = r0.f200b
            if (r12 == 0) goto L_0x013e
            long r12 = r7.f10295r
            java.lang.Long r9 = java.lang.Long.valueOf(r12)
            java.util.HashMap r14 = R2.b.A(r16)
            java.lang.Object r0 = r0.f201c
            v3.s r0 = (v3.s) r0
            n3.F r6 = new n3.F
            r6.<init>(r11)
            v3.s r6 = R2.b.I0(r0, r6, r14)
            r7.f10297t = r0
            r7.f10298u = r6
            long r14 = r1.f10307l
            r17 = 1
            r25 = r2
            r26 = r3
            long r2 = r14 + r17
            r1.f10307l = r2
            r7.f10295r = r14
            r4.remove(r9)
            n3.y r2 = r1.f10309n
            long r14 = r7.f10295r
            n3.g r3 = r7.f10288a
            boolean r9 = r7.f10292f
            r24 = 0
            r17 = r2
            r18 = r3
            r19 = r0
            r20 = r6
            r21 = r14
            r23 = r9
            java.util.List r0 = r17.g(r18, r19, r20, r21, r23, r24)
            r8.addAll(r0)
            n3.y r11 = r1.f10309n
            r14 = 1
            r15 = 0
            r2 = 0
            java.util.List r0 = r11.c(r12, r14, r15, r16)
            r8.addAll(r0)
            goto L_0x0158
        L_0x013e:
            r25 = r2
            r26 = r3
            n3.y r11 = r1.f10309n
            long r12 = r7.f10295r
            r14 = 1
            r15 = 0
            java.util.List r0 = r11.c(r12, r14, r15, r16)
            r8.addAll(r0)
            r6 = r9
            r0 = r17
            goto L_0x015a
        L_0x0153:
            r25 = r2
            r26 = r3
            r2 = r15
        L_0x0158:
            r0 = r2
            r6 = 0
        L_0x015a:
            r1.k(r8)
            if (r6 == 0) goto L_0x0188
            r2 = 4
            r7.d = r2
            i3.f r2 = new i3.f
            r2.<init>((n3.m) r1, (n3.C0866g) r10)
            v3.s r3 = r7.f10296s
            v3.m r3 = v3.m.t(r3)
            i3.c r6 = new i3.c
            r6.<init>(r2, r3)
            j3.g r2 = new j3.g
            r3 = 5
            r8 = 0
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r7, (int) r3, (boolean) r8)
            r1.o(r2)
            n3.i r2 = new n3.i
            r3 = 1
            r2.<init>(r7, r0, r6, r3)
            r3 = r26
            r3.add(r2)
            goto L_0x018a
        L_0x0188:
            r3 = r26
        L_0x018a:
            r2 = r25
            goto L_0x0040
        L_0x018e:
            r25 = r2
            c1.i r0 = r1.f10303f
            r1.l(r0)
            r6 = 0
        L_0x0196:
            int r0 = r3.size()
            if (r6 >= r0) goto L_0x01a8
            java.lang.Object r0 = r3.get(r6)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.j(r0)
            int r6 = r6 + 1
            goto L_0x0196
        L_0x01a8:
            c1.i r0 = r1.f10303f
            r1.l(r0)
            r1.p(r0)
        L_0x01b0:
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.m.n(n3.g):n3.g");
    }

    public final void o(Runnable runnable) {
        ((b) this.h.f10268e.f5605b).execute(runnable);
    }

    public final void p(i iVar) {
        boolean z3;
        boolean z4;
        j jVar = (j) iVar.d;
        if (jVar.f11098b != null) {
            ArrayList g5 = g(iVar);
            if (g5.size() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            l.c(z3);
            Boolean bool = Boolean.TRUE;
            Iterator it2 = g5.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((l) it2.next()).d != 2) {
                        bool = Boolean.FALSE;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (bool.booleanValue()) {
                C0866g s6 = iVar.s();
                ArrayList arrayList = new ArrayList();
                Iterator it3 = g5.iterator();
                while (it3.hasNext()) {
                    arrayList.add(Long.valueOf(((l) it3.next()).f10295r));
                }
                s h6 = this.f10309n.h(s6, arrayList);
                if (h6 == null) {
                    h6 = v3.k.f12295e;
                }
                String u6 = h6.u();
                Iterator it4 = g5.iterator();
                while (it4.hasNext()) {
                    l lVar = (l) it4.next();
                    if (lVar.d == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    l.c(z4);
                    lVar.d = 3;
                    lVar.f10293p++;
                    h6 = h6.q(C0866g.B(s6, lVar.f10288a), lVar.f10297t);
                }
                this.f10301c.e("p", s6.k(), h6.o(true), u6, new z(this, s6, g5, this));
            }
        } else if (!jVar.f11097a.isEmpty()) {
            Object[] array = ((j) iVar.d).f11097a.entrySet().toArray();
            for (Object obj : array) {
                Map.Entry entry = (Map.Entry) obj;
                p(new i((Object) (C1048c) entry.getKey(), (Object) iVar, (Object) (j) entry.getValue(), 14));
            }
        }
    }

    public final void q(C1048c cVar, Object obj) {
        if (cVar.equals(C0862c.f10260b)) {
            this.f10300b.f7431a = ((Long) obj).longValue();
        }
        C0866g gVar = new C0866g(C0862c.f10259a, cVar);
        try {
            s a6 = a.a(obj, v3.k.f12295e);
            C0724m mVar = this.d;
            mVar.f9345b = ((s) mVar.f9345b).q(gVar, a6);
            k(this.f10308m.f(gVar, a6));
        } catch (C0589e e6) {
            this.f10304i.g("Failed to parse info update", e6);
        }
    }

    public final String toString() {
        return this.f10299a.toString();
    }
}
