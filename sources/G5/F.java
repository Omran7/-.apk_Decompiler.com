package G5;

import I5.e;
import I5.s;
import I5.u;
import R2.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m5.C0847f;
import m5.C0849h;
import n5.C0883o;
import o5.d;
import o5.g;
import o5.i;
import o5.j;
import p5.a;
import q5.c;
import q5.h;
import x5.p;

public abstract class F {

    /* renamed from: a  reason: collision with root package name */
    public static final u f861a = new u("RESUME_TOKEN", 0);

    /* renamed from: b  reason: collision with root package name */
    public static final u f862b = new u("REMOVED_TASK", 0);

    /* renamed from: c  reason: collision with root package name */
    public static final u f863c = new u("CLOSED_EMPTY", 0);
    public static final u d = new u("COMPLETING_ALREADY", 0);

    /* renamed from: e  reason: collision with root package name */
    public static final u f864e = new u("COMPLETING_WAITING_CHILDREN", 0);

    /* renamed from: f  reason: collision with root package name */
    public static final u f865f = new u("COMPLETING_RETRY", 0);
    public static final u g = new u("TOO_LATE_TO_CANCEL", 0);
    public static final u h = new u("SEALED", 0);

    /* renamed from: i  reason: collision with root package name */
    public static final S f866i = new S(false);

    /* renamed from: j  reason: collision with root package name */
    public static final S f867j = new S(true);

    /* JADX WARNING: type inference failed for: r0v0, types: [G5.s, G5.v0] */
    public static C0046s a() {
        ? v0Var = new v0(true);
        v0Var.x((C0034h0) null);
        return v0Var;
    }

    public static final e b(A a6) {
        g gVar = a6.get(B.f856b);
        i iVar = a6;
        if (gVar == null) {
            iVar = b.v0(a6, new k0((C0034h0) null));
        }
        return new e(iVar);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [G5.a, G5.J] */
    public static J c(C c3, p pVar) {
        j jVar = j.f10479a;
        D d6 = D.f857a;
        i h6 = h(c3.b(), jVar, true);
        i iVar = N.f877a;
        if (h6 != iVar && h6.get(o5.e.f10478a) == null) {
            h6 = h6.plus(iVar);
        }
        D d7 = D.f857a;
        ? aVar = new C0019a(h6, true);
        aVar.L(d6, aVar, pVar);
        return aVar;
    }

    public static final Object d(I[] iArr, h hVar) {
        if (iArr.length == 0) {
            return C0883o.f10398a;
        }
        C0027e eVar = new C0027e(iArr);
        C0040l lVar = new C0040l(1, b.h0(hVar));
        lVar.s();
        int length = iArr.length;
        C0023c[] cVarArr = new C0023c[length];
        for (int i2 = 0; i2 < length; i2++) {
            I i5 = iArr[i2];
            i5.start();
            C0023c cVar = new C0023c(eVar, lVar);
            cVar.f899f = l(i5, false, cVar, 3);
            cVarArr[i2] = cVar;
        }
        C0025d dVar = new C0025d(cVarArr);
        for (int i6 = 0; i6 < length; i6++) {
            C0023c cVar2 = cVarArr[i6];
            cVar2.getClass();
            C0023c.f897q.set(cVar2, dVar);
        }
        if (!(C0040l.f921p.get(lVar) instanceof y0)) {
            dVar.b();
        } else {
            lVar.u(dVar);
        }
        Object r6 = lVar.r();
        a aVar = a.f11033a;
        return r6;
    }

    public static final void e(i iVar, CancellationException cancellationException) {
        C0034h0 h0Var = (C0034h0) iVar.get(B.f856b);
        if (h0Var != null) {
            h0Var.cancel(cancellationException);
        }
    }

    public static final Object f(p pVar, d dVar) {
        s sVar = new s(dVar.getContext(), dVar);
        Object H02 = I1.b.H0(sVar, sVar, pVar);
        a aVar = a.f11033a;
        return H02;
    }

    public static final Object g(long j6, c cVar) {
        int i2 = (j6 > 0 ? 1 : (j6 == 0 ? 0 : -1));
        C0849h hVar = C0849h.f10203c;
        if (i2 <= 0) {
            return hVar;
        }
        C0040l lVar = new C0040l(1, b.h0(cVar));
        lVar.s();
        if (j6 < Long.MAX_VALUE) {
            i(lVar.f923e).d(j6, lVar);
        }
        Object r6 = lVar.r();
        if (r6 == a.f11033a) {
            return r6;
        }
        return hVar;
    }

    public static final i h(i iVar, i iVar2, boolean z3) {
        Boolean bool = Boolean.FALSE;
        C0051x xVar = C0051x.f957c;
        boolean booleanValue = ((Boolean) iVar.fold(bool, xVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.fold(bool, xVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.plus(iVar2);
        }
        j jVar = j.f10479a;
        i iVar3 = (i) iVar.fold(jVar, new C0051x(2, 2));
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.fold(jVar, C0051x.f956b);
        }
        return iVar3.plus((i) obj);
    }

    public static final K i(i iVar) {
        K k6;
        g gVar = iVar.get(o5.e.f10478a);
        if (gVar instanceof K) {
            k6 = (K) gVar;
        } else {
            k6 = null;
        }
        if (k6 == null) {
            return H.f872a;
        }
        return k6;
    }

    public static final String j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final void k(i iVar, Throwable th) {
        try {
            H5.b bVar = (H5.b) iVar.get(B.f855a);
            if (bVar != null) {
                bVar.j(iVar, th);
            } else {
                I5.a.c(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                com.bumptech.glide.c.a(runtimeException, th);
                th = runtimeException;
            }
            I5.a.c(iVar, th);
        }
    }

    public static P l(C0034h0 h0Var, boolean z3, m0 m0Var, int i2) {
        boolean z4 = false;
        if ((i2 & 1) != 0) {
            z3 = false;
        }
        if ((i2 & 2) != 0) {
            z4 = true;
        }
        if (h0Var instanceof v0) {
            return ((v0) h0Var).y(z3, z4, m0Var);
        }
        return h0Var.invokeOnCompletion(z3, z4, new l0(1, m0Var, C0030f0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    public static final boolean m(C c3) {
        C0034h0 h0Var = (C0034h0) c3.b().get(B.f856b);
        if (h0Var != null) {
            return h0Var.isActive();
        }
        return true;
    }

    public static final boolean n(int i2) {
        if (i2 == 1 || i2 == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [q5.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object o(java.util.List r4, q5.c r5) {
        /*
            boolean r0 = r5 instanceof G5.C0031g
            if (r0 == 0) goto L_0x0013
            r0 = r5
            G5.g r0 = (G5.C0031g) r0
            int r1 = r0.f912c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f912c = r1
            goto L_0x0018
        L_0x0013:
            G5.g r0 = new G5.g
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f911b
            p5.a r1 = p5.a.f11033a
            int r2 = r0.f912c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.util.Iterator r4 = r0.f910a
            I1.b.I0(r5)
            goto L_0x0038
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            I1.b.I0(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0038:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            G5.h0 r5 = (G5.C0034h0) r5
            r0.f910a = r4
            r0.f912c = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L_0x0038
            return r1
        L_0x004f:
            m5.h r4 = m5.C0849h.f10203c
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.F.o(java.util.List, q5.c):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [q5.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object p(G5.C0034h0[] r6, q5.c r7) {
        /*
            boolean r0 = r7 instanceof G5.C0029f
            if (r0 == 0) goto L_0x0013
            r0 = r7
            G5.f r0 = (G5.C0029f) r0
            int r1 = r0.f909e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f909e = r1
            goto L_0x0018
        L_0x0013:
            G5.f r0 = new G5.f
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            p5.a r1 = p5.a.f11033a
            int r2 = r0.f909e
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            int r6 = r0.f908c
            int r2 = r0.f907b
            java.lang.Object[] r4 = r0.f906a
            G5.h0[] r4 = (G5.C0034h0[]) r4
            I1.b.I0(r7)
            r7 = r4
            goto L_0x0053
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            I1.b.I0(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0040:
            if (r2 >= r6) goto L_0x0055
            r4 = r7[r2]
            r0.f906a = r7
            r0.f907b = r2
            r0.f908c = r6
            r0.f909e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L_0x0053
            return r1
        L_0x0053:
            int r2 = r2 + r3
            goto L_0x0040
        L_0x0055:
            m5.h r6 = m5.C0849h.f10203c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.F.p(G5.h0[], q5.c):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [G5.a, G5.A0] */
    public static A0 q(C c3, A a6, p pVar, int i2) {
        i iVar = a6;
        if ((i2 & 1) != 0) {
            iVar = j.f10479a;
        }
        D d6 = D.f857a;
        i h6 = h(c3.b(), iVar, true);
        i iVar2 = N.f877a;
        if (h6 != iVar2 && h6.get(o5.e.f10478a) == null) {
            h6 = h6.plus(iVar2);
        }
        D d7 = D.f857a;
        ? aVar = new C0019a(h6, true);
        aVar.L(d6, aVar, pVar);
        return aVar;
    }

    public static final Object r(Object obj) {
        if (obj instanceof C0048u) {
            return I1.b.r(((C0048u) obj).f950a);
        }
        return obj;
    }

    public static final void s(C0040l lVar, d dVar, boolean z3) {
        Object obj;
        H0 h02;
        Object obj2 = C0040l.f921p.get(lVar);
        Throwable g5 = lVar.g(obj2);
        if (g5 != null) {
            obj = I1.b.r(g5);
        } else {
            obj = lVar.h(obj2);
        }
        if (z3) {
            kotlin.jvm.internal.j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            I5.h hVar = (I5.h) dVar;
            c cVar = hVar.f1257e;
            i context = cVar.getContext();
            Object i2 = I5.a.i(context, hVar.f1259p);
            if (i2 != I5.a.f1248f) {
                h02 = v(cVar, context, i2);
            } else {
                h02 = null;
            }
            try {
                cVar.resumeWith(obj);
            } finally {
                if (h02 == null || h02.M()) {
                    I5.a.d(context, i2);
                }
            }
        } else {
            dVar.resumeWith(obj);
        }
    }

    public static final String t(d dVar) {
        String str;
        if (dVar instanceof I5.h) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + j(dVar);
        } catch (Throwable th) {
            str = I1.b.r(th);
        }
        Throwable a6 = C0847f.a(str);
        String str2 = str;
        if (a6 != null) {
            str2 = dVar.getClass().getName() + '@' + j(dVar);
        }
        return (String) str2;
    }

    public static final Object u(Object obj) {
        C0026d0 d0Var;
        C0024c0 c0Var;
        if (obj instanceof C0026d0) {
            d0Var = (C0026d0) obj;
        } else {
            d0Var = null;
        }
        if (d0Var == null || (c0Var = d0Var.f902a) == null) {
            return obj;
        }
        return c0Var;
    }

    public static final H0 v(d dVar, i iVar, Object obj) {
        H0 h02 = null;
        if (!(dVar instanceof q5.d)) {
            return null;
        }
        if (iVar.get(I0.f874a) != null) {
            q5.d dVar2 = (q5.d) dVar;
            while (true) {
                if (!(dVar2 instanceof L) && (dVar2 = dVar2.getCallerFrame()) != null) {
                    if (dVar2 instanceof H0) {
                        h02 = (H0) dVar2;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (h02 != null) {
                h02.N(iVar, obj);
            }
        }
        return h02;
    }

    /* JADX INFO: finally extract failed */
    public static final Object w(i iVar, p pVar, d dVar) {
        i iVar2;
        Object obj;
        i context = dVar.getContext();
        if (!((Boolean) iVar.fold(Boolean.FALSE, C0051x.f957c)).booleanValue()) {
            iVar2 = context.plus(iVar);
        } else {
            iVar2 = h(context, iVar, false);
        }
        C0034h0 h0Var = (C0034h0) iVar2.get(B.f856b);
        if (h0Var == null || h0Var.isActive()) {
            if (iVar2 != context) {
                o5.e eVar = o5.e.f10478a;
                if (!kotlin.jvm.internal.j.a(iVar2.get(eVar), context.get(eVar))) {
                    s sVar = new s(iVar2, dVar);
                    com.bumptech.glide.d.d1(pVar, sVar, sVar);
                    while (true) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = L.f875e;
                        int i2 = atomicIntegerFieldUpdater.get(sVar);
                        if (i2 == 0) {
                            if (atomicIntegerFieldUpdater.compareAndSet(sVar, 0, 1)) {
                                obj = a.f11033a;
                                break;
                            }
                        } else if (i2 == 2) {
                            obj = u(sVar.u());
                            if (obj instanceof C0048u) {
                                throw ((C0048u) obj).f950a;
                            }
                        } else {
                            throw new IllegalStateException("Already suspended");
                        }
                    }
                } else {
                    H0 h02 = new H0(iVar2, dVar);
                    i iVar3 = h02.f893c;
                    Object i5 = I5.a.i(iVar3, (Object) null);
                    try {
                        Object H02 = I1.b.H0(h02, h02, pVar);
                        I5.a.d(iVar3, i5);
                        obj = H02;
                    } catch (Throwable th) {
                        I5.a.d(iVar3, i5);
                        throw th;
                    }
                }
            } else {
                s sVar2 = new s(iVar2, dVar);
                obj = I1.b.H0(sVar2, sVar2, pVar);
            }
            a aVar = a.f11033a;
            return obj;
        }
        throw h0Var.getCancellationException();
    }

    public static final Object x(long j6, p pVar, c cVar) {
        Object obj;
        Object B6;
        if (j6 > 0) {
            F0 f02 = new F0(j6, cVar);
            l(f02, false, new Q(i(f02.d.getContext()).c(f02.f868e, f02, f02.f893c), 0), 3);
            try {
                kotlin.jvm.internal.p.a(2, pVar);
                obj = pVar.invoke(f02, f02);
            } catch (Throwable th) {
                obj = new C0048u(false, th);
            }
            a aVar = a.f11033a;
            if (obj == aVar || (B6 = f02.B(obj)) == f864e) {
                return aVar;
            }
            if (B6 instanceof C0048u) {
                Throwable th2 = ((C0048u) B6).f950a;
                if (!(th2 instanceof E0) || ((E0) th2).f860a != f02) {
                    throw th2;
                } else if (obj instanceof C0048u) {
                    throw ((C0048u) obj).f950a;
                }
            } else {
                obj = u(B6);
            }
            return obj;
        }
        throw new E0("Timed out immediately", (F0) null);
    }
}
