package K5;

import G5.F;
import I5.l;
import I5.r;
import I5.u;
import K1.h;
import h0.C0552a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.j;

public final class c implements Executor, Closeable {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1661q;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1662r;

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1663s;

    /* renamed from: t  reason: collision with root package name */
    public static final u f1664t = new u("NOT_IN_STACK", 0);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final int f1665a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1666b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1667c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final f f1668e;

    /* renamed from: f  reason: collision with root package name */
    public final f f1669f;

    /* renamed from: p  reason: collision with root package name */
    public final r f1670p;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    static {
        Class<c> cls = c.class;
        f1661q = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack$volatile");
        f1662r = AtomicLongFieldUpdater.newUpdater(cls, "controlState$volatile");
        f1663s = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated$volatile");
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [K5.f, I5.l] */
    /* JADX WARNING: type inference failed for: r4v10, types: [K5.f, I5.l] */
    public c(int i2, int i5, long j6, String str) {
        this.f1665a = i2;
        this.f1666b = i5;
        this.f1667c = j6;
        this.d = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(C0552a.k(i2, "Core pool size ", " should be at least 1").toString());
        } else if (i5 < i2) {
            throw new IllegalArgumentException(C0552a.l("Max pool size ", i5, i2, " should be greater than or equals to core pool size ").toString());
        } else if (i5 > 2097150) {
            throw new IllegalArgumentException(C0552a.k(i5, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        } else if (j6 > 0) {
            this.f1668e = new l();
            this.f1669f = new l();
            this.f1670p = new r((i2 + 1) * 2);
            this.controlState$volatile = ((long) i2) << 42;
            this._isTerminated$volatile = 0;
        } else {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j6 + " must be positive").toString());
        }
    }

    public final int c() {
        boolean z3;
        synchronized (this.f1670p) {
            try {
                if (f1663s.get(this) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f1662r;
                long j6 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j6 & 2097151);
                int i5 = i2 - ((int) ((j6 & 4398044413952L) >> 21));
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i5 >= this.f1665a) {
                    return 0;
                }
                if (i2 >= this.f1666b) {
                    return 0;
                }
                int i6 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i6 <= 0 || this.f1670p.b(i6) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i6);
                this.f1670p.c(i6, aVar);
                if (i6 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    int i7 = i5 + 1;
                    aVar.start();
                    return i7;
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        if (r1 == null) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f1663s
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto L_0x000c
            goto L_0x00b2
        L_0x000c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof K5.a
            r3 = 0
            if (r1 == 0) goto L_0x0018
            K5.a r0 = (K5.a) r0
            goto L_0x0019
        L_0x0018:
            r0 = r3
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            K5.c r1 = r0.f1655q
            boolean r1 = kotlin.jvm.internal.j.a(r1, r8)
            if (r1 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r3
        L_0x0025:
            I5.r r1 = r8.f1670p
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f1662r     // Catch:{ all -> 0x00c4 }
            long r4 = r4.get(r8)     // Catch:{ all -> 0x00c4 }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L_0x0079
            r1 = r2
        L_0x0037:
            I5.r r5 = r8.f1670p
            java.lang.Object r5 = r5.b(r1)
            kotlin.jvm.internal.j.b(r5)
            K5.a r5 = (K5.a) r5
            if (r5 == r0) goto L_0x0074
        L_0x0044:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L_0x0055
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L_0x0044
        L_0x0055:
            K5.m r5 = r5.f1649a
            K5.f r6 = r8.f1669f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = K5.m.f1683b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            K5.i r7 = (K5.i) r7
            if (r7 == 0) goto L_0x0069
            r6.a(r7)
        L_0x0069:
            K5.i r7 = r5.b()
            if (r7 != 0) goto L_0x0070
            goto L_0x0074
        L_0x0070:
            r6.a(r7)
            goto L_0x0069
        L_0x0074:
            if (r1 == r4) goto L_0x0079
            int r1 = r1 + 1
            goto L_0x0037
        L_0x0079:
            K5.f r1 = r8.f1669f
            r1.b()
            K5.f r1 = r8.f1668e
            r1.b()
        L_0x0083:
            if (r0 == 0) goto L_0x008b
            K5.i r1 = r0.a(r2)
            if (r1 != 0) goto L_0x00b3
        L_0x008b:
            K5.f r1 = r8.f1668e
            java.lang.Object r1 = r1.d()
            K5.i r1 = (K5.i) r1
            if (r1 != 0) goto L_0x00b3
            K5.f r1 = r8.f1669f
            java.lang.Object r1 = r1.d()
            K5.i r1 = (K5.i) r1
            if (r1 != 0) goto L_0x00b3
            if (r0 == 0) goto L_0x00a6
            K5.b r1 = K5.b.f1659e
            r0.h(r1)
        L_0x00a6:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f1661q
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f1662r
            r0.set(r8, r1)
        L_0x00b2:
            return
        L_0x00b3:
            r1.run()     // Catch:{ all -> 0x00b7 }
            goto L_0x0083
        L_0x00b7:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L_0x0083
        L_0x00c4:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.c.close():void");
    }

    public final void d(Runnable runnable, h hVar, boolean z3) {
        i iVar;
        boolean z4;
        long j6;
        a aVar;
        boolean z5;
        b bVar;
        k.f1681f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            iVar = (i) runnable;
            iVar.f1674a = nanoTime;
            iVar.f1675b = hVar;
        } else {
            iVar = new j(runnable, nanoTime, hVar);
        }
        boolean z6 = false;
        if (iVar.f1675b.f1464a == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1662r;
        if (z4) {
            j6 = atomicLongFieldUpdater.addAndGet(this, 2097152);
        } else {
            j6 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !j.a(aVar.f1655q, this)) {
            aVar = null;
        }
        if (!(aVar == null || (bVar = aVar.f1651c) == b.f1659e || (iVar.f1675b.f1464a == 0 && bVar == b.f1657b))) {
            aVar.f1654p = true;
            m mVar = aVar.f1649a;
            if (z3) {
                iVar = mVar.a(iVar);
            } else {
                mVar.getClass();
                i iVar2 = (i) m.f1683b.getAndSet(mVar, iVar);
                if (iVar2 == null) {
                    iVar = null;
                } else {
                    iVar = mVar.a(iVar2);
                }
            }
        }
        if (iVar != null) {
            if (iVar.f1675b.f1464a == 1) {
                z5 = this.f1669f.a(iVar);
            } else {
                z5 = this.f1668e.a(iVar);
            }
            if (!z5) {
                throw new RejectedExecutionException(C0552a.r(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z3 && aVar != null) {
            z6 = true;
        }
        if (z4) {
            if (!z6 && !l() && !k(j6)) {
                l();
            }
        } else if (!z6 && !l() && !k(atomicLongFieldUpdater.get(this))) {
            l();
        }
    }

    public final void execute(Runnable runnable) {
        d(runnable, k.g, false);
    }

    public final void j(a aVar, int i2, int i5) {
        while (true) {
            long j6 = f1661q.get(this);
            int i6 = (int) (2097151 & j6);
            long j7 = (2097152 + j6) & -2097152;
            if (i6 == i2) {
                if (i5 == 0) {
                    Object c3 = aVar.c();
                    while (true) {
                        if (c3 == f1664t) {
                            i6 = -1;
                            break;
                        } else if (c3 == null) {
                            i6 = 0;
                            break;
                        } else {
                            a aVar2 = (a) c3;
                            int b6 = aVar2.b();
                            if (b6 != 0) {
                                i6 = b6;
                                break;
                            }
                            c3 = aVar2.c();
                        }
                    }
                } else {
                    i6 = i5;
                }
            }
            if (i6 >= 0) {
                if (f1661q.compareAndSet(this, j6, ((long) i6) | j7)) {
                    return;
                }
            }
        }
    }

    public final boolean k(long j6) {
        int i2 = ((int) (2097151 & j6)) - ((int) ((j6 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i5 = this.f1665a;
        if (i2 < i5) {
            int c3 = c();
            if (c3 == 1 && i5 > 1) {
                c();
            }
            if (c3 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        u uVar;
        int i2;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1661q;
            long j6 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f1670p.b((int) (2097151 & j6));
            if (aVar == null) {
                aVar = null;
            } else {
                long j7 = (2097152 + j6) & -2097152;
                Object c3 = aVar.c();
                while (true) {
                    uVar = f1664t;
                    if (c3 == uVar) {
                        i2 = -1;
                        break;
                    } else if (c3 == null) {
                        i2 = 0;
                        break;
                    } else {
                        a aVar2 = (a) c3;
                        i2 = aVar2.b();
                        if (i2 != 0) {
                            break;
                        }
                        c3 = aVar2.c();
                    }
                }
                if (i2 >= 0) {
                    if (atomicLongFieldUpdater.compareAndSet(this, j6, j7 | ((long) i2))) {
                        aVar.g(uVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f1648r.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        int i2;
        ArrayList arrayList = new ArrayList();
        r rVar = this.f1670p;
        int a6 = rVar.a();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 1; i10 < a6; i10++) {
            a aVar = (a) rVar.b(i10);
            if (aVar != null) {
                m mVar = aVar.f1649a;
                mVar.getClass();
                if (m.f1683b.get(mVar) != null) {
                    i2 = (m.f1684c.get(mVar) - m.d.get(mVar)) + 1;
                } else {
                    i2 = m.f1684c.get(mVar) - m.d.get(mVar);
                }
                int ordinal = aVar.f1651c.ordinal();
                if (ordinal == 0) {
                    i5++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i6++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i2);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i7++;
                } else if (ordinal == 3) {
                    i8++;
                    if (i2 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i2);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (ordinal == 4) {
                    i9++;
                }
            }
        }
        long j6 = f1662r.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(F.j(this));
        sb4.append("[Pool Size {core = ");
        int i11 = this.f1665a;
        sb4.append(i11);
        sb4.append(", max = ");
        sb4.append(this.f1666b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i5);
        sb4.append(", blocking = ");
        sb4.append(i6);
        sb4.append(", parked = ");
        sb4.append(i7);
        sb4.append(", dormant = ");
        sb4.append(i8);
        sb4.append(", terminated = ");
        sb4.append(i9);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f1668e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f1669f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j6));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j6) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i11 - ((int) ((j6 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
