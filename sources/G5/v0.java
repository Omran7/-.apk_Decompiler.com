package G5;

import E5.c;
import E5.d;
import I5.k;
import I5.u;
import R2.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;
import m5.C0849h;
import o5.g;
import o5.h;
import o5.i;
import p5.a;
import x5.l;
import x5.p;

public class v0 implements C0034h0, C0045q, z0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f954a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f955b;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Class<v0> cls = v0.class;
        Class<Object> cls2 = Object.class;
        f954a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        f955b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
    }

    public v0(boolean z3) {
        S s6;
        if (z3) {
            s6 = F.f867j;
        } else {
            s6 = F.f866i;
        }
        this._state$volatile = s6;
    }

    public static C0044p D(k kVar) {
        while (kVar.h()) {
            k c3 = kVar.c();
            if (c3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f1267b;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (k) obj;
                    if (!kVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = c3;
            }
        }
        while (true) {
            kVar = kVar.g();
            if (!kVar.h()) {
                if (kVar instanceof C0044p) {
                    return (C0044p) kVar;
                }
                if (kVar instanceof w0) {
                    return null;
                }
            }
        }
    }

    public static String J(Object obj) {
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            if (p0Var.d()) {
                return "Cancelling";
            }
            if (p0Var.e()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof C0024c0) {
            if (((C0024c0) obj).isActive()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C0048u) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public final boolean A(Object obj) {
        Object K6;
        do {
            K6 = K(u(), obj);
            if (K6 == F.d) {
                return false;
            }
            if (K6 == F.f864e) {
                return true;
            }
        } while (K6 == F.f865f);
        f(K6);
        return true;
    }

    public final Object B(Object obj) {
        Object K6;
        C0048u uVar;
        do {
            K6 = K(u(), obj);
            if (K6 == F.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof C0048u) {
                    uVar = (C0048u) obj;
                } else {
                    uVar = null;
                }
                if (uVar != null) {
                    th = uVar.f950a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (K6 == F.f865f);
        return K6;
    }

    public String C() {
        return getClass().getSimpleName();
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(G5.w0 r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r7.f()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.j.c(r0, r1)
            I5.k r0 = (I5.k) r0
            r1 = 0
        L_0x000c:
            boolean r2 = r0.equals(r7)
            if (r2 != 0) goto L_0x0044
            boolean r2 = r0 instanceof G5.C0038j0
            if (r2 == 0) goto L_0x003f
            r2 = r0
            G5.m0 r2 = (G5.m0) r2
            r2.a(r8)     // Catch:{ all -> 0x001d }
            goto L_0x003f
        L_0x001d:
            r3 = move-exception
            if (r1 == 0) goto L_0x0024
            com.bumptech.glide.c.a(r1, r3)
            goto L_0x003f
        L_0x0024:
            G5.w r1 = new G5.w
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Exception in completion handler "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " for "
            r4.append(r2)
            r4.append(r6)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2, r3)
        L_0x003f:
            I5.k r0 = r0.g()
            goto L_0x000c
        L_0x0044:
            if (r1 == 0) goto L_0x0049
            r6.w(r1)
        L_0x0049:
            r6.j(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.v0.E(G5.w0, java.lang.Throwable):void");
    }

    public final void H(m0 m0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        k kVar = new k();
        m0Var.getClass();
        k.f1267b.set(kVar, m0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k.f1266a;
        atomicReferenceFieldUpdater2.set(kVar, m0Var);
        loop0:
        while (true) {
            if (m0Var.f() != m0Var) {
                break;
            }
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(m0Var, m0Var, kVar)) {
                    kVar.d(m0Var);
                    break loop0;
                } else if (atomicReferenceFieldUpdater2.get(m0Var) != m0Var) {
                }
            }
        }
        k g = m0Var.g();
        do {
            atomicReferenceFieldUpdater = f954a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, m0Var, g) || atomicReferenceFieldUpdater.get(this) != m0Var) {
            }
            atomicReferenceFieldUpdater = f954a;
            return;
        } while (atomicReferenceFieldUpdater.get(this) != m0Var);
    }

    public final int I(Object obj) {
        boolean z3 = obj instanceof S;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f954a;
        if (z3) {
            if (((S) obj).f882a) {
                return 0;
            }
            S s6 = F.f867j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, s6)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        } else if (!(obj instanceof C0022b0)) {
            return 0;
        } else {
            w0 w0Var = ((C0022b0) obj).f896a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a4, code lost:
        if (r5 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a6, code lost:
        E(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ab, code lost:
        if ((r7 instanceof G5.C0044p) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ad, code lost:
        r0 = (G5.C0044p) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00b1, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00b2, code lost:
        if (r0 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b4, code lost:
        r7 = r7.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00b8, code lost:
        if (r7 == null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ba, code lost:
        r2 = D(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00bf, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00c0, code lost:
        if (r2 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d0, code lost:
        if (G5.F.l(r2.f932e, false, new G5.o0(r6, r1, r2, r8), 1) == G5.x0.f959a) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d5, code lost:
        r2 = D(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00d9, code lost:
        if (r2 != null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return o(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        return G5.F.f864e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object K(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof G5.C0024c0
            if (r0 != 0) goto L_0x0007
            I5.u r7 = G5.F.d
            return r7
        L_0x0007:
            boolean r0 = r7 instanceof G5.S
            if (r0 != 0) goto L_0x000f
            boolean r0 = r7 instanceof G5.m0
            if (r0 == 0) goto L_0x0041
        L_0x000f:
            boolean r0 = r7 instanceof G5.C0044p
            if (r0 != 0) goto L_0x0041
            boolean r0 = r8 instanceof G5.C0048u
            if (r0 != 0) goto L_0x0041
            r0 = r7
            G5.c0 r0 = (G5.C0024c0) r0
            boolean r7 = r8 instanceof G5.C0024c0
            if (r7 == 0) goto L_0x0028
            G5.d0 r7 = new G5.d0
            r1 = r8
            G5.c0 r1 = (G5.C0024c0) r1
            r7.<init>(r1)
            r1 = r7
            goto L_0x0029
        L_0x0028:
            r1 = r8
        L_0x0029:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f954a
            boolean r2 = r7.compareAndSet(r6, r0, r1)
            if (r2 == 0) goto L_0x0038
            r6.F(r8)
            r6.m(r0, r8)
            return r8
        L_0x0038:
            java.lang.Object r7 = r7.get(r6)
            if (r7 == r0) goto L_0x0029
            I5.u r7 = G5.F.f865f
            return r7
        L_0x0041:
            G5.c0 r7 = (G5.C0024c0) r7
            G5.w0 r0 = r6.t(r7)
            if (r0 != 0) goto L_0x004d
            I5.u r7 = G5.F.f865f
            goto L_0x00df
        L_0x004d:
            boolean r1 = r7 instanceof G5.p0
            r2 = 0
            if (r1 == 0) goto L_0x0056
            r1 = r7
            G5.p0 r1 = (G5.p0) r1
            goto L_0x0057
        L_0x0056:
            r1 = r2
        L_0x0057:
            if (r1 != 0) goto L_0x005e
            G5.p0 r1 = new G5.p0
            r1.<init>(r0, r2)
        L_0x005e:
            monitor-enter(r1)
            boolean r3 = r1.e()     // Catch:{ all -> 0x0091 }
            if (r3 == 0) goto L_0x006a
            I5.u r7 = G5.F.d     // Catch:{ all -> 0x0091 }
            monitor-exit(r1)
            goto L_0x00df
        L_0x006a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = G5.p0.f933b     // Catch:{ all -> 0x0091 }
            r4 = 1
            r3.set(r1, r4)     // Catch:{ all -> 0x0091 }
            if (r1 == r7) goto L_0x0085
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f954a     // Catch:{ all -> 0x0091 }
        L_0x0074:
            boolean r5 = r3.compareAndSet(r6, r7, r1)     // Catch:{ all -> 0x0091 }
            if (r5 == 0) goto L_0x007b
            goto L_0x0085
        L_0x007b:
            java.lang.Object r5 = r3.get(r6)     // Catch:{ all -> 0x0091 }
            if (r5 == r7) goto L_0x0074
            I5.u r7 = G5.F.f865f     // Catch:{ all -> 0x0091 }
            monitor-exit(r1)
            goto L_0x00df
        L_0x0085:
            boolean r3 = r1.d()     // Catch:{ all -> 0x0091 }
            boolean r5 = r8 instanceof G5.C0048u     // Catch:{ all -> 0x0091 }
            if (r5 == 0) goto L_0x0093
            r5 = r8
            G5.u r5 = (G5.C0048u) r5     // Catch:{ all -> 0x0091 }
            goto L_0x0094
        L_0x0091:
            r7 = move-exception
            goto L_0x00e0
        L_0x0093:
            r5 = r2
        L_0x0094:
            if (r5 == 0) goto L_0x009b
            java.lang.Throwable r5 = r5.f950a     // Catch:{ all -> 0x0091 }
            r1.a(r5)     // Catch:{ all -> 0x0091 }
        L_0x009b:
            java.lang.Throwable r5 = r1.c()     // Catch:{ all -> 0x0091 }
            if (r3 != 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r5 = r2
        L_0x00a3:
            monitor-exit(r1)
            if (r5 == 0) goto L_0x00a9
            r6.E(r0, r5)
        L_0x00a9:
            boolean r0 = r7 instanceof G5.C0044p
            if (r0 == 0) goto L_0x00b1
            r0 = r7
            G5.p r0 = (G5.C0044p) r0
            goto L_0x00b2
        L_0x00b1:
            r0 = r2
        L_0x00b2:
            if (r0 != 0) goto L_0x00bf
            G5.w0 r7 = r7.b()
            if (r7 == 0) goto L_0x00c0
            G5.p r2 = D(r7)
            goto L_0x00c0
        L_0x00bf:
            r2 = r0
        L_0x00c0:
            if (r2 == 0) goto L_0x00db
        L_0x00c2:
            G5.o0 r7 = new G5.o0
            r7.<init>(r6, r1, r2, r8)
            G5.q r0 = r2.f932e
            r3 = 0
            G5.P r7 = G5.F.l(r0, r3, r7, r4)
            G5.x0 r0 = G5.x0.f959a
            if (r7 == r0) goto L_0x00d5
            I5.u r7 = G5.F.f864e
            goto L_0x00df
        L_0x00d5:
            G5.p r2 = D(r2)
            if (r2 != 0) goto L_0x00c2
        L_0x00db:
            java.lang.Object r7 = r6.o(r1, r8)
        L_0x00df:
            return r7
        L_0x00e0:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.v0.K(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final C0043o attachChild(C0045q qVar) {
        P l6 = F.l(this, true, new C0044p(qVar), 2);
        j.c(l6, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (C0043o) l6;
    }

    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0036i0(k(), (Throwable) null, this);
        }
        i(cancellationException);
    }

    public final boolean e(C0024c0 c0Var, w0 w0Var, m0 m0Var) {
        boolean z3;
        q0 q0Var = new q0(m0Var, this, c0Var);
        do {
            k c3 = w0Var.c();
            if (c3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f1267b;
                Object obj = atomicReferenceFieldUpdater.get(w0Var);
                while (true) {
                    c3 = (k) obj;
                    if (!c3.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c3);
                }
            }
            k.f1267b.set(m0Var, c3);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k.f1266a;
            atomicReferenceFieldUpdater2.set(m0Var, w0Var);
            q0Var.f937c = w0Var;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(c3, w0Var, q0Var)) {
                    if (atomicReferenceFieldUpdater2.get(c3) != w0Var) {
                        z3 = false;
                        break;
                    }
                } else if (q0Var.a(c3) == null) {
                    z3 = true;
                } else {
                    z3 = true;
                }
            }
            if (z3) {
                return true;
            }
        } while (!z3);
        return false;
    }

    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    public void g(Object obj) {
        f(obj);
    }

    public final g get(h hVar) {
        return b.B(this, hVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.concurrent.CancellationException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.CancellationException getCancellationException() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.u()
            boolean r1 = r0 instanceof G5.p0
            r2 = 0
            java.lang.String r3 = "Job is still new or active: "
            if (r1 == 0) goto L_0x004c
            G5.p0 r0 = (G5.p0) r0
            java.lang.Throwable r0 = r0.c()
            if (r0 == 0) goto L_0x0036
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " is cancelling"
            java.lang.String r1 = r1.concat(r3)
            boolean r3 = r0 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L_0x0028
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x0028:
            if (r2 != 0) goto L_0x0080
            G5.i0 r2 = new G5.i0
            if (r1 != 0) goto L_0x0032
            java.lang.String r1 = r4.k()
        L_0x0032:
            r2.<init>(r1, r0, r4)
            goto L_0x0080
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x004c:
            boolean r1 = r0 instanceof G5.C0024c0
            if (r1 != 0) goto L_0x0081
            boolean r1 = r0 instanceof G5.C0048u
            if (r1 == 0) goto L_0x006c
            G5.u r0 = (G5.C0048u) r0
            java.lang.Throwable r0 = r0.f950a
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L_0x005f
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x005f:
            if (r2 != 0) goto L_0x0080
            G5.i0 r1 = new G5.i0
            java.lang.String r2 = r4.k()
            r1.<init>(r2, r0, r4)
            r2 = r1
            goto L_0x0080
        L_0x006c:
            G5.i0 r0 = new G5.i0
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " has completed normally"
            java.lang.String r1 = r1.concat(r3)
            r0.<init>(r1, r2, r4)
            r2 = r0
        L_0x0080:
            return r2
        L_0x0081:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.v0.getCancellationException():java.util.concurrent.CancellationException");
    }

    public final d getChildren() {
        return new c(new r0(this, (o5.d) null), 1);
    }

    public Object getCompleted() {
        return p();
    }

    public final Throwable getCompletionExceptionOrNull() {
        C0048u uVar;
        Object u6 = u();
        if (!(u6 instanceof C0024c0)) {
            if (u6 instanceof C0048u) {
                uVar = (C0048u) u6;
            } else {
                uVar = null;
            }
            if (uVar != null) {
                return uVar.f950a;
            }
            return null;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    public final h getKey() {
        return B.f856b;
    }

    public final Object h(o5.d dVar) {
        Object u6;
        do {
            u6 = u();
            if (!(u6 instanceof C0024c0)) {
                if (!(u6 instanceof C0048u)) {
                    return F.u(u6);
                }
                throw ((C0048u) u6).f950a;
            }
        } while (I(u6) < 0);
        n0 n0Var = new n0(this, b.h0(dVar));
        n0Var.s();
        n0Var.u(new C0035i(F.l(this, false, new Q(n0Var, 2), 3), 2));
        Object r6 = n0Var.r();
        a aVar = a.f11033a;
        return r6;
    }

    public final boolean i(Object obj) {
        boolean z3;
        u uVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u uVar2 = F.d;
        if (s()) {
            while (true) {
                Object u6 = u();
                if ((u6 instanceof C0024c0) && (!(u6 instanceof p0) || !((p0) u6).e())) {
                    uVar2 = K(u6, new C0048u(false, n(obj)));
                    if (uVar2 != F.f865f) {
                        break;
                    }
                } else {
                    uVar2 = F.d;
                }
            }
            if (uVar2 == F.f864e) {
                return true;
            }
        }
        if (uVar2 == F.d) {
            Throwable th = null;
            Throwable th2 = null;
            loop1:
            while (true) {
                Object u7 = u();
                if (!(u7 instanceof p0)) {
                    if (!(u7 instanceof C0024c0)) {
                        uVar = F.g;
                        break;
                    }
                    if (th2 == null) {
                        th2 = n(obj);
                    }
                    C0024c0 c0Var = (C0024c0) u7;
                    if (c0Var.isActive()) {
                        w0 t6 = t(c0Var);
                        if (t6 == null) {
                            continue;
                        } else {
                            p0 p0Var = new p0(t6, th2);
                            do {
                                atomicReferenceFieldUpdater = f954a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, c0Var, p0Var)) {
                                    E(t6, th2);
                                    uVar = F.d;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == c0Var);
                        }
                    } else {
                        Object K6 = K(u7, new C0048u(false, th2));
                        if (K6 == F.d) {
                            throw new IllegalStateException(("Cannot happen in " + u7).toString());
                        } else if (K6 != F.f865f) {
                            uVar2 = K6;
                            break;
                        }
                    }
                } else {
                    synchronized (u7) {
                        try {
                            p0 p0Var2 = (p0) u7;
                            p0Var2.getClass();
                            if (p0.d.get(p0Var2) == F.h) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                uVar = F.g;
                            } else {
                                boolean d = ((p0) u7).d();
                                if (th2 == null) {
                                    th2 = n(obj);
                                }
                                ((p0) u7).a(th2);
                                Throwable c3 = ((p0) u7).c();
                                if (!d) {
                                    th = c3;
                                }
                                if (th != null) {
                                    E(((p0) u7).f935a, th);
                                }
                                uVar = F.d;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            uVar2 = uVar;
        }
        if (!(uVar2 == F.d || uVar2 == F.f864e)) {
            if (uVar2 == F.g) {
                return false;
            }
            f(uVar2);
        }
        return true;
    }

    public final P invokeOnCompletion(l lVar) {
        return y(false, true, new C0028e0(lVar));
    }

    public boolean isActive() {
        Object u6 = u();
        if (!(u6 instanceof C0024c0) || !((C0024c0) u6).isActive()) {
            return false;
        }
        return true;
    }

    public final boolean j(Throwable th) {
        if (z()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        C0043o oVar = (C0043o) f955b.get(this);
        if (oVar == null || oVar == x0.f959a) {
            return z3;
        }
        if (oVar.j(th) || z3) {
            return true;
        }
        return false;
    }

    public final Object join(o5.d dVar) {
        Object u6;
        C0849h hVar;
        do {
            u6 = u();
            boolean z3 = u6 instanceof C0024c0;
            hVar = C0849h.f10203c;
            if (!z3) {
                C0034h0 h0Var = (C0034h0) dVar.getContext().get(B.f856b);
                if (h0Var == null || h0Var.isActive()) {
                    return hVar;
                }
                throw h0Var.getCancellationException();
            }
        } while (I(u6) < 0);
        C0040l lVar = new C0040l(1, b.h0(dVar));
        lVar.s();
        lVar.u(new C0035i(F.l(this, false, new Q(lVar, 3), 3), 2));
        Object r6 = lVar.r();
        a aVar = a.f11033a;
        if (r6 != aVar) {
            r6 = hVar;
        }
        if (r6 == aVar) {
            return r6;
        }
        return hVar;
    }

    public String k() {
        return "Job was cancelled";
    }

    public boolean l(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!i(th) || !r()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r0v8, types: [G5.w, java.lang.RuntimeException] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(G5.C0024c0 r8, java.lang.Object r9) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f955b
            java.lang.Object r1 = r0.get(r7)
            G5.o r1 = (G5.C0043o) r1
            if (r1 == 0) goto L_0x0012
            r1.e()
            G5.x0 r1 = G5.x0.f959a
            r0.set(r7, r1)
        L_0x0012:
            boolean r0 = r9 instanceof G5.C0048u
            r1 = 0
            if (r0 == 0) goto L_0x001a
            G5.u r9 = (G5.C0048u) r9
            goto L_0x001b
        L_0x001a:
            r9 = r1
        L_0x001b:
            if (r9 == 0) goto L_0x0020
            java.lang.Throwable r9 = r9.f950a
            goto L_0x0021
        L_0x0020:
            r9 = r1
        L_0x0021:
            boolean r0 = r8 instanceof G5.m0
            java.lang.String r2 = " for "
            java.lang.String r3 = "Exception in completion handler "
            if (r0 == 0) goto L_0x004c
            r0 = r8
            G5.m0 r0 = (G5.m0) r0     // Catch:{ all -> 0x0030 }
            r0.a(r9)     // Catch:{ all -> 0x0030 }
            goto L_0x0096
        L_0x0030:
            r9 = move-exception
            G5.w r0 = new G5.w
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r8)
            r1.append(r2)
            r1.append(r7)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8, r9)
            r7.w(r0)
            goto L_0x0096
        L_0x004c:
            G5.w0 r8 = r8.b()
            if (r8 == 0) goto L_0x0096
            java.lang.Object r0 = r8.f()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.j.c(r0, r4)
            I5.k r0 = (I5.k) r0
        L_0x005d:
            boolean r4 = r0.equals(r8)
            if (r4 != 0) goto L_0x0091
            boolean r4 = r0 instanceof G5.m0
            if (r4 == 0) goto L_0x008c
            r4 = r0
            G5.m0 r4 = (G5.m0) r4
            r4.a(r9)     // Catch:{ all -> 0x006e }
            goto L_0x008c
        L_0x006e:
            r5 = move-exception
            if (r1 == 0) goto L_0x0075
            com.bumptech.glide.c.a(r1, r5)
            goto L_0x008c
        L_0x0075:
            G5.w r1 = new G5.w
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            r6.append(r4)
            r6.append(r2)
            r6.append(r7)
            java.lang.String r4 = r6.toString()
            r1.<init>(r4, r5)
        L_0x008c:
            I5.k r0 = r0.g()
            goto L_0x005d
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            r7.w(r1)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.v0.m(G5.c0, java.lang.Object):void");
    }

    public final i minusKey(h hVar) {
        return b.m0(this, hVar);
    }

    public final Throwable n(Object obj) {
        Throwable th;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        v0 v0Var = (v0) ((z0) obj);
        Object u6 = v0Var.u();
        CancellationException cancellationException = null;
        if (u6 instanceof p0) {
            th = ((p0) u6).c();
        } else if (u6 instanceof C0048u) {
            th = ((C0048u) u6).f950a;
        } else if (!(u6 instanceof C0024c0)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + u6).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException == null) {
            cancellationException = new C0036i0("Parent job is ".concat(J(u6)), th, v0Var);
        }
        return cancellationException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008e A[LOOP:1: B:39:0x008e->B:42:0x0099, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(G5.p0 r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof G5.C0048u
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r9
            G5.u r0 = (G5.C0048u) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 == 0) goto L_0x000e
            java.lang.Throwable r1 = r0.f950a
        L_0x000e:
            monitor-enter(r8)
            r8.d()     // Catch:{ all -> 0x009f }
            java.util.ArrayList r0 = r8.f(r1)     // Catch:{ all -> 0x009f }
            java.lang.Throwable r2 = r7.q(r8, r0)     // Catch:{ all -> 0x009f }
            r3 = 1
            if (r2 == 0) goto L_0x0053
            int r4 = r0.size()     // Catch:{ all -> 0x009f }
            if (r4 > r3) goto L_0x0024
            goto L_0x0053
        L_0x0024:
            int r4 = r0.size()     // Catch:{ all -> 0x009f }
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap     // Catch:{ all -> 0x009f }
            r5.<init>(r4)     // Catch:{ all -> 0x009f }
            java.util.Set r4 = java.util.Collections.newSetFromMap(r5)     // Catch:{ all -> 0x009f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x009f }
        L_0x0035:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x009f }
            if (r5 == 0) goto L_0x0053
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x009f }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x009f }
            if (r5 == r2) goto L_0x0035
            if (r5 == r2) goto L_0x0035
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x009f }
            if (r6 != 0) goto L_0x0035
            boolean r6 = r4.add(r5)     // Catch:{ all -> 0x009f }
            if (r6 == 0) goto L_0x0035
            com.bumptech.glide.c.a(r2, r5)     // Catch:{ all -> 0x009f }
            goto L_0x0035
        L_0x0053:
            monitor-exit(r8)
            r0 = 0
            if (r2 != 0) goto L_0x0058
            goto L_0x0060
        L_0x0058:
            if (r2 != r1) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            G5.u r9 = new G5.u
            r9.<init>(r0, r2)
        L_0x0060:
            if (r2 == 0) goto L_0x007b
            boolean r1 = r7.j(r2)
            if (r1 != 0) goto L_0x006e
            boolean r1 = r7.v(r2)
            if (r1 == 0) goto L_0x007b
        L_0x006e:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            kotlin.jvm.internal.j.c(r9, r1)
            r1 = r9
            G5.u r1 = (G5.C0048u) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = G5.C0048u.f949b
            r2.compareAndSet(r1, r0, r3)
        L_0x007b:
            r7.F(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f954a
            boolean r1 = r9 instanceof G5.C0024c0
            if (r1 == 0) goto L_0x008d
            G5.d0 r1 = new G5.d0
            r2 = r9
            G5.c0 r2 = (G5.C0024c0) r2
            r1.<init>(r2)
            goto L_0x008e
        L_0x008d:
            r1 = r9
        L_0x008e:
            boolean r2 = r0.compareAndSet(r7, r8, r1)
            if (r2 == 0) goto L_0x0095
            goto L_0x009b
        L_0x0095:
            java.lang.Object r2 = r0.get(r7)
            if (r2 == r8) goto L_0x008e
        L_0x009b:
            r7.m(r8, r9)
            return r9
        L_0x009f:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.v0.o(G5.p0, java.lang.Object):java.lang.Object");
    }

    public final Object p() {
        Object u6 = u();
        if (u6 instanceof C0024c0) {
            throw new IllegalStateException("This job has not completed yet");
        } else if (!(u6 instanceof C0048u)) {
            return F.u(u6);
        } else {
            throw ((C0048u) u6).f950a;
        }
    }

    public final i plus(i iVar) {
        return b.v0(this, iVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Throwable q(G5.p0 r4, java.util.ArrayList r5) {
        /*
            r3 = this;
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r4 = r4.d()
            if (r4 == 0) goto L_0x0017
            G5.i0 r4 = new G5.i0
            java.lang.String r5 = r3.k()
            r4.<init>(r5, r1, r3)
            return r4
        L_0x0017:
            return r1
        L_0x0018:
            java.util.Iterator r4 = r5.iterator()
        L_0x001c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r4.next()
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r2 = r2 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L_0x001c
            goto L_0x002f
        L_0x002e:
            r0 = r1
        L_0x002f:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x0034
            return r0
        L_0x0034:
            r4 = 0
            java.lang.Object r4 = r5.get(r4)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r0 = r4 instanceof G5.E0
            if (r0 == 0) goto L_0x005c
            java.util.Iterator r5 = r5.iterator()
        L_0x0043:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r5.next()
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == r4) goto L_0x0043
            boolean r2 = r2 instanceof G5.E0
            if (r2 == 0) goto L_0x0043
            r1 = r0
        L_0x0057:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x005c
            return r1
        L_0x005c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.v0.q(G5.p0, java.util.ArrayList):java.lang.Throwable");
    }

    public boolean r() {
        return true;
    }

    public boolean s() {
        return this instanceof C0046s;
    }

    public final boolean start() {
        int I6;
        do {
            I6 = I(u());
            if (I6 == 0) {
                return false;
            }
        } while (I6 != 1);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [I5.k, G5.w0] */
    public final w0 t(C0024c0 c0Var) {
        w0 b6 = c0Var.b();
        if (b6 != null) {
            return b6;
        }
        if (c0Var instanceof S) {
            return new k();
        }
        if (c0Var instanceof m0) {
            H((m0) c0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + c0Var).toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C() + '{' + J(u()) + '}');
        sb.append('@');
        sb.append(F.j(this));
        return sb.toString();
    }

    public final Object u() {
        while (true) {
            Object obj = f954a.get(this);
            if (!(obj instanceof I5.p)) {
                return obj;
            }
            ((I5.p) obj).a(this);
        }
    }

    public boolean v(Throwable th) {
        return false;
    }

    public final void x(C0034h0 h0Var) {
        x0 x0Var = x0.f959a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f955b;
        if (h0Var == null) {
            atomicReferenceFieldUpdater.set(this, x0Var);
            return;
        }
        h0Var.start();
        C0043o attachChild = h0Var.attachChild(this);
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (!(u() instanceof C0024c0)) {
            attachChild.e();
            atomicReferenceFieldUpdater.set(this, x0Var);
        }
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [I5.k, G5.w0] */
    public final P y(boolean z3, boolean z4, C0030f0 f0Var) {
        m0 m0Var;
        C0048u uVar;
        Throwable th;
        C0022b0 b0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m0 m0Var2;
        Throwable th2 = null;
        if (z3) {
            if (f0Var instanceof C0038j0) {
                m0Var = (C0038j0) f0Var;
            } else {
                m0Var = null;
            }
            if (m0Var == null) {
                m0Var = new C0032g0(f0Var);
            }
        } else {
            if (f0Var instanceof m0) {
                m0Var2 = (m0) f0Var;
            } else {
                m0Var2 = null;
            }
            if (m0Var == null) {
                m0Var = new Q(f0Var, 1);
            }
        }
        m0Var.d = this;
        while (true) {
            Object u6 = u();
            if (u6 instanceof S) {
                S s6 = (S) u6;
                if (!s6.f882a) {
                    ? kVar = new k();
                    if (s6.f882a) {
                        b0Var = kVar;
                    } else {
                        b0Var = new C0022b0(kVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = f954a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, s6, b0Var)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == s6);
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f954a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, u6, m0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != u6) {
                        }
                    }
                    return m0Var;
                }
            } else if (u6 instanceof C0024c0) {
                w0 b6 = ((C0024c0) u6).b();
                if (b6 == null) {
                    j.c(u6, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    H((m0) u6);
                } else {
                    P p6 = x0.f959a;
                    if (!z3 || !(u6 instanceof p0)) {
                        th = null;
                    } else {
                        synchronized (u6) {
                            try {
                                th = ((p0) u6).c();
                                if (th != null) {
                                    if ((f0Var instanceof C0044p) && !((p0) u6).e()) {
                                    }
                                }
                                if (e((C0024c0) u6, b6, m0Var)) {
                                    if (th == null) {
                                        return m0Var;
                                    }
                                    p6 = m0Var;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    if (th != null) {
                        if (z4) {
                            f0Var.a(th);
                        }
                        return p6;
                    } else if (e((C0024c0) u6, b6, m0Var)) {
                        return m0Var;
                    }
                }
            } else {
                if (z4) {
                    if (u6 instanceof C0048u) {
                        uVar = (C0048u) u6;
                    } else {
                        uVar = null;
                    }
                    if (uVar != null) {
                        th2 = uVar.f950a;
                    }
                    f0Var.a(th2);
                }
                return x0.f959a;
            }
        }
    }

    public boolean z() {
        return false;
    }

    public final P invokeOnCompletion(boolean z3, boolean z4, l lVar) {
        return y(z3, z4, new C0028e0(lVar));
    }

    public void G() {
    }

    public void F(Object obj) {
    }

    public void f(Object obj) {
    }

    public void w(C0050w wVar) {
        throw wVar;
    }
}
