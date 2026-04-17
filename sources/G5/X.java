package G5;

import I5.n;
import I5.u;
import I5.x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import n5.C0873e;
import o5.i;

public abstract class X extends Y implements K {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f888f;

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f889p;

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f890q;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Class<X> cls = X.class;
        Class<Object> cls2 = Object.class;
        f888f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue$volatile");
        f889p = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed$volatile");
        f890q = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted$volatile");
    }

    public P c(long j6, F0 f02, i iVar) {
        return H.f872a.c(j6, f02, iVar);
    }

    public final void d(long j6, C0040l lVar) {
        long j7 = 0;
        if (j6 > 0) {
            if (j6 >= 9223372036854L) {
                j7 = Long.MAX_VALUE;
            } else {
                j7 = 1000000 * j6;
            }
        }
        if (j7 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            T t6 = new T(this, j7 + nanoTime, lVar);
            u(nanoTime, t6);
            lVar.u(new C0035i(t6, 2));
        }
    }

    public final void j(i iVar, Runnable runnable) {
        q(runnable);
    }

    public void q(Runnable runnable) {
        if (r(runnable)) {
            Thread m6 = m();
            if (Thread.currentThread() != m6) {
                LockSupport.unpark(m6);
                return;
            }
            return;
        }
        G.f869r.q(runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[LOOP:2: B:21:0x003f->B:24:0x004a, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(java.lang.Runnable r7) {
        /*
            r6 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f888f
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f890q
            int r2 = r2.get(r6)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0012
            r2 = r4
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            if (r2 == 0) goto L_0x0016
            return r3
        L_0x0016:
            if (r1 != 0) goto L_0x0027
        L_0x0018:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L_0x0020
            return r4
        L_0x0020:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L_0x0018
            goto L_0x0000
        L_0x0027:
            boolean r2 = r1 instanceof I5.n
            if (r2 == 0) goto L_0x004e
            r2 = r1
            I5.n r2 = (I5.n) r2
            int r5 = r2.a(r7)
            if (r5 == 0) goto L_0x004d
            if (r5 == r4) goto L_0x003b
            r0 = 2
            if (r5 == r0) goto L_0x003a
            goto L_0x0000
        L_0x003a:
            return r3
        L_0x003b:
            I5.n r2 = r2.c()
        L_0x003f:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L_0x0046
            goto L_0x0000
        L_0x0046:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L_0x003f
            goto L_0x0000
        L_0x004d:
            return r4
        L_0x004e:
            I5.u r2 = G5.F.f863c
            if (r1 != r2) goto L_0x0053
            return r3
        L_0x0053:
            I5.n r2 = new I5.n
            r3 = 8
            r2.<init>(r3, r4)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r7)
        L_0x0063:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L_0x006a
            return r4
        L_0x006a:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L_0x0063
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.X.r(java.lang.Runnable):boolean");
    }

    public final boolean s() {
        boolean z3;
        C0873e eVar = this.f892e;
        if (eVar != null) {
            z3 = eVar.isEmpty();
        } else {
            z3 = true;
        }
        if (!z3) {
            return false;
        }
        W w6 = (W) f889p.get(this);
        if (w6 != null && x.f1285b.get(w6) != 0) {
            return false;
        }
        Object obj = f888f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof n) {
            long j6 = n.f1272f.get((n) obj);
            if (((int) (1073741823 & j6)) == ((int) ((j6 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == F.f863c) {
            return true;
        }
        return false;
    }

    public void shutdown() {
        V v6;
        D0.f859a.set((Object) null);
        f890q.set(this, 1);
        loop0:
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f888f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            u uVar = F.f863c;
            if (obj != null) {
                if (!(obj instanceof n)) {
                    if (obj != uVar) {
                        n nVar = new n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, uVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                }
            }
            break loop0;
        }
        do {
        } while (t() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            W w6 = (W) f889p.get(this);
            if (w6 != null) {
                synchronized (w6) {
                    if (x.f1285b.get(w6) > 0) {
                        v6 = w6.b(0);
                    } else {
                        v6 = null;
                    }
                }
                if (v6 != null) {
                    p(nanoTime, v6);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006e A[LOOP:2: B:40:0x006e->B:43:0x0079, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0056 A[EDGE_INSN: B:95:0x0056->B:33:0x0056 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long t() {
        /*
            r11 = this;
            boolean r0 = r11.o()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f889p
            java.lang.Object r0 = r0.get(r11)
            G5.W r0 = (G5.W) r0
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x004e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = I5.x.f1285b
            int r5 = r5.get(r0)
            if (r5 != 0) goto L_0x001e
            goto L_0x004e
        L_0x001e:
            long r5 = java.lang.System.nanoTime()
        L_0x0022:
            monitor-enter(r0)
            G5.V[] r7 = r0.f1286a     // Catch:{ all -> 0x003d }
            if (r7 == 0) goto L_0x002a
            r7 = r7[r4]     // Catch:{ all -> 0x003d }
            goto L_0x002b
        L_0x002a:
            r7 = r3
        L_0x002b:
            if (r7 != 0) goto L_0x0030
            monitor-exit(r0)
            r7 = r3
            goto L_0x0049
        L_0x0030:
            long r8 = r7.f885a     // Catch:{ all -> 0x003d }
            long r8 = r5 - r8
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 < 0) goto L_0x003f
            boolean r7 = r11.r(r7)     // Catch:{ all -> 0x003d }
            goto L_0x0040
        L_0x003d:
            r1 = move-exception
            goto L_0x004c
        L_0x003f:
            r7 = r4
        L_0x0040:
            if (r7 == 0) goto L_0x0047
            G5.V r7 = r0.b(r4)     // Catch:{ all -> 0x003d }
            goto L_0x0048
        L_0x0047:
            r7 = r3
        L_0x0048:
            monitor-exit(r0)
        L_0x0049:
            if (r7 != 0) goto L_0x0022
            goto L_0x004e
        L_0x004c:
            monitor-exit(r0)
            throw r1
        L_0x004e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f888f
            java.lang.Object r5 = r0.get(r11)
            if (r5 != 0) goto L_0x0058
        L_0x0056:
            r7 = r3
            goto L_0x008a
        L_0x0058:
            boolean r6 = r5 instanceof I5.n
            if (r6 == 0) goto L_0x007c
            r6 = r5
            I5.n r6 = (I5.n) r6
            java.lang.Object r7 = r6.d()
            I5.u r8 = I5.n.g
            if (r7 == r8) goto L_0x006a
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L_0x008a
        L_0x006a:
            I5.n r6 = r6.c()
        L_0x006e:
            boolean r7 = r0.compareAndSet(r11, r5, r6)
            if (r7 == 0) goto L_0x0075
            goto L_0x004e
        L_0x0075:
            java.lang.Object r7 = r0.get(r11)
            if (r7 == r5) goto L_0x006e
            goto L_0x004e
        L_0x007c:
            I5.u r6 = G5.F.f863c
            if (r5 != r6) goto L_0x0081
            goto L_0x0056
        L_0x0081:
            boolean r6 = r0.compareAndSet(r11, r5, r3)
            if (r6 == 0) goto L_0x0100
            r7 = r5
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L_0x008a:
            if (r7 == 0) goto L_0x0090
            r7.run()
            return r1
        L_0x0090:
            n5.e r0 = r11.f892e
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x009b
        L_0x0099:
            r7 = r5
            goto L_0x00a3
        L_0x009b:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a2
            goto L_0x0099
        L_0x00a2:
            r7 = r1
        L_0x00a3:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a8
            goto L_0x00ff
        L_0x00a8:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f888f
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L_0x00d9
            boolean r7 = r0 instanceof I5.n
            if (r7 == 0) goto L_0x00d3
            I5.n r0 = (I5.n) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = I5.n.f1272f
            long r7 = r7.get(r0)
            r9 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r9 = r9 & r7
            int r0 = (int) r9
            r9 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r9
            r9 = 30
            long r7 = r7 >> r9
            int r7 = (int) r7
            if (r0 != r7) goto L_0x00cf
            r0 = 1
            goto L_0x00d0
        L_0x00cf:
            r0 = r4
        L_0x00d0:
            if (r0 != 0) goto L_0x00d9
            goto L_0x00ff
        L_0x00d3:
            I5.u r3 = G5.F.f863c
            if (r0 != r3) goto L_0x00ff
        L_0x00d7:
            r1 = r5
            goto L_0x00ff
        L_0x00d9:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f889p
            java.lang.Object r0 = r0.get(r11)
            G5.W r0 = (G5.W) r0
            if (r0 == 0) goto L_0x00d7
            monitor-enter(r0)
            G5.V[] r7 = r0.f1286a     // Catch:{ all -> 0x00fc }
            if (r7 == 0) goto L_0x00ea
            r3 = r7[r4]     // Catch:{ all -> 0x00fc }
        L_0x00ea:
            monitor-exit(r0)
            if (r3 != 0) goto L_0x00ee
            goto L_0x00d7
        L_0x00ee:
            long r3 = r3.f885a
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fa
            goto L_0x00ff
        L_0x00fa:
            r1 = r3
            goto L_0x00ff
        L_0x00fc:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00ff:
            return r1
        L_0x0100:
            java.lang.Object r6 = r0.get(r11)
            if (r6 == r5) goto L_0x0081
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.X.t():long");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [G5.W, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023 A[LOOP:0: B:10:0x0023->B:13:0x002e, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(long r7, G5.V r9) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f890q
            int r0 = r0.get(r6)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000c
            r0 = r2
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f889p
            r4 = 0
            if (r0 == 0) goto L_0x0014
            r0 = r2
            goto L_0x003d
        L_0x0014:
            java.lang.Object r0 = r3.get(r6)
            G5.W r0 = (G5.W) r0
            if (r0 != 0) goto L_0x0039
            G5.W r5 = new G5.W
            r5.<init>()
            r5.f887c = r7
        L_0x0023:
            boolean r0 = r3.compareAndSet(r6, r4, r5)
            if (r0 == 0) goto L_0x002a
            goto L_0x0030
        L_0x002a:
            java.lang.Object r0 = r3.get(r6)
            if (r0 == 0) goto L_0x0023
        L_0x0030:
            java.lang.Object r0 = r3.get(r6)
            kotlin.jvm.internal.j.b(r0)
            G5.W r0 = (G5.W) r0
        L_0x0039:
            int r0 = r9.a(r7, r0, r6)
        L_0x003d:
            if (r0 == 0) goto L_0x0051
            if (r0 == r2) goto L_0x004d
            r7 = 2
            if (r0 != r7) goto L_0x0045
            goto L_0x0074
        L_0x0045:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "unexpected result"
            r7.<init>(r8)
            throw r7
        L_0x004d:
            r6.p(r7, r9)
            goto L_0x0074
        L_0x0051:
            java.lang.Object r7 = r3.get(r6)
            G5.W r7 = (G5.W) r7
            if (r7 == 0) goto L_0x0065
            monitor-enter(r7)
            G5.V[] r8 = r7.f1286a     // Catch:{ all -> 0x0062 }
            if (r8 == 0) goto L_0x0060
            r4 = r8[r1]     // Catch:{ all -> 0x0062 }
        L_0x0060:
            monitor-exit(r7)
            goto L_0x0065
        L_0x0062:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x0065:
            if (r4 != r9) goto L_0x0074
            java.lang.Thread r7 = r6.m()
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            if (r8 == r7) goto L_0x0074
            java.util.concurrent.locks.LockSupport.unpark(r7)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.X.u(long, G5.V):void");
    }
}
