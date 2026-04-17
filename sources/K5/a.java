package K5;

import I5.u;
import com.google.android.gms.common.api.f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

public final class a extends Thread {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1648r = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: a  reason: collision with root package name */
    public final m f1649a = new m();

    /* renamed from: b  reason: collision with root package name */
    public final m f1650b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public b f1651c = b.d;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public long f1652e;

    /* renamed from: f  reason: collision with root package name */
    public int f1653f;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker = c.f1664t;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1654p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ c f1655q;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARNING: type inference failed for: r3v4, types: [kotlin.jvm.internal.m, java.lang.Object] */
    public a(c cVar, int i2) {
        this.f1655q = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        int nanoTime = (int) System.nanoTime();
        this.f1653f = nanoTime == 0 ? 42 : nanoTime;
        f(i2);
    }

    public final i a(boolean z3) {
        i e6;
        i e7;
        c cVar;
        long j6;
        b bVar = this.f1651c;
        b bVar2 = b.f1656a;
        i iVar = null;
        m mVar = this.f1649a;
        boolean z4 = true;
        c cVar2 = this.f1655q;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f1662r;
            do {
                cVar = this.f1655q;
                j6 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j6) >> 42)) == 0) {
                    mVar.getClass();
                    loop1:
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f1683b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f1675b.f1464a == 1) {
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, (Object) null)) {
                                    iVar = iVar2;
                                    break loop1;
                                } else if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                }
                            }
                        }
                    }
                    int i2 = m.d.get(mVar);
                    int i5 = m.f1684c.get(mVar);
                    while (true) {
                        if (i2 != i5 && m.f1685e.get(mVar) != 0) {
                            i5--;
                            i c3 = mVar.c(i5, true);
                            if (c3 != null) {
                                iVar = c3;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar2.f1669f.d();
                    if (iVar3 == null) {
                        return i(1);
                    }
                    return iVar3;
                }
            } while (!c.f1662r.compareAndSet(cVar, j6, j6 - 4398046511104L));
            this.f1651c = b.f1656a;
        }
        if (z3) {
            if (d(cVar2.f1665a * 2) != 0) {
                z4 = false;
            }
            if (z4 && (e7 = e()) != null) {
                return e7;
            }
            mVar.getClass();
            i iVar4 = (i) m.f1683b.getAndSet(mVar, (Object) null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z4 && (e6 = e()) != null) {
                return e6;
            }
        } else {
            i e8 = e();
            if (e8 != null) {
                return e8;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i5 = this.f1653f;
        int i6 = i5 ^ (i5 << 13);
        int i7 = i6 ^ (i6 >> 17);
        int i8 = i7 ^ (i7 << 5);
        this.f1653f = i8;
        int i9 = i2 - 1;
        if ((i9 & i2) == 0) {
            return i8 & i9;
        }
        return (i8 & f.API_PRIORITY_OTHER) % i2;
    }

    public final i e() {
        int d6 = d(2);
        c cVar = this.f1655q;
        if (d6 == 0) {
            i iVar = (i) cVar.f1668e.d();
            if (iVar != null) {
                return iVar;
            }
            return (i) cVar.f1669f.d();
        }
        i iVar2 = (i) cVar.f1669f.d();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) cVar.f1668e.d();
    }

    public final void f(int i2) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1655q.d);
        sb.append("-worker-");
        if (i2 == 0) {
            str = "TERMINATED";
        } else {
            str = String.valueOf(i2);
        }
        sb.append(str);
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        boolean z3;
        b bVar2 = this.f1651c;
        if (bVar2 == b.f1656a) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            c.f1662r.addAndGet(this.f1655q, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f1651c = bVar;
        }
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        r19 = r6;
        r6 = -2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final K5.i i(int r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = K5.c.f1662r
            K5.c r3 = r0.f1655q
            long r4 = r2.get(r3)
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r2 = (int) r4
            r4 = 2
            r5 = 0
            if (r2 >= r4) goto L_0x0016
            return r5
        L_0x0016:
            int r6 = r0.d(r2)
            r10 = 0
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0020:
            if (r10 >= r2) goto L_0x00e7
            r15 = 1
            int r6 = r6 + r15
            if (r6 <= r2) goto L_0x0027
            r6 = r15
        L_0x0027:
            I5.r r4 = r3.f1670p
            java.lang.Object r4 = r4.b(r6)
            K5.a r4 = (K5.a) r4
            if (r4 == 0) goto L_0x00dd
            if (r4 == r0) goto L_0x00dd
            r7 = 3
            K5.m r4 = r4.f1649a
            if (r1 != r7) goto L_0x003d
            K5.i r7 = r4.b()
            goto L_0x0069
        L_0x003d:
            r4.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = K5.m.d
            int r7 = r7.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = K5.m.f1684c
            int r8 = r8.get(r4)
            if (r1 != r15) goto L_0x0050
            r9 = r15
            goto L_0x0051
        L_0x0050:
            r9 = 0
        L_0x0051:
            if (r7 == r8) goto L_0x005d
            if (r9 == 0) goto L_0x005f
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = K5.m.f1685e
            int r13 = r13.get(r4)
            if (r13 != 0) goto L_0x005f
        L_0x005d:
            r7 = r5
            goto L_0x0069
        L_0x005f:
            int r13 = r7 + 1
            K5.i r7 = r4.c(r7, r9)
            if (r7 != 0) goto L_0x0069
            r7 = r13
            goto L_0x0051
        L_0x0069:
            kotlin.jvm.internal.m r13 = r0.f1650b
            if (r7 == 0) goto L_0x0076
            r13.f9656a = r7
            r19 = r6
        L_0x0071:
            r6 = -1
        L_0x0073:
            r8 = -1
            goto L_0x00b9
        L_0x0076:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = K5.m.f1683b
            java.lang.Object r14 = r7.get(r4)
            K5.i r14 = (K5.i) r14
            r18 = -2
            if (r14 != 0) goto L_0x0089
        L_0x0082:
            r21 = r18
            r19 = r6
            r6 = r21
            goto L_0x0073
        L_0x0089:
            K1.h r8 = r14.f1675b
            int r8 = r8.f1464a
            if (r8 != r15) goto L_0x0091
            r8 = r15
            goto L_0x0092
        L_0x0091:
            r8 = 2
        L_0x0092:
            r8 = r8 & r1
            if (r8 != 0) goto L_0x0096
            goto L_0x0082
        L_0x0096:
            K5.g r8 = K5.k.f1681f
            r8.getClass()
            long r8 = java.lang.System.nanoTime()
            r19 = r6
            long r5 = r14.f1674a
            long r8 = r8 - r5
            long r5 = K5.k.f1678b
            int r20 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r20 >= 0) goto L_0x00af
            long r4 = r5 - r8
            r6 = r4
            r5 = 0
            goto L_0x0073
        L_0x00af:
            r5 = 0
            boolean r6 = r7.compareAndSet(r4, r14, r5)
            if (r6 == 0) goto L_0x00cf
            r13.f9656a = r14
            goto L_0x0071
        L_0x00b9:
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00c4
            java.lang.Object r1 = r13.f9656a
            K5.i r1 = (K5.i) r1
            r13.f9656a = r5
            return r1
        L_0x00c4:
            r16 = 0
            int r4 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x00df
            long r11 = java.lang.Math.min(r11, r6)
            goto L_0x00df
        L_0x00cf:
            r8 = -1
            r16 = 0
            java.lang.Object r5 = r7.get(r4)
            if (r5 == r14) goto L_0x00af
            r6 = r19
            r5 = 0
            goto L_0x0076
        L_0x00dd:
            r19 = r6
        L_0x00df:
            int r10 = r10 + 1
            r6 = r19
            r4 = 2
            r5 = 0
            goto L_0x0020
        L_0x00e7:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r16 = 0
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r11 = r16
        L_0x00f5:
            r0.f1652e = r11
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.a.i(int):K5.i");
    }

    public final void run() {
        b bVar;
        boolean z3;
        b bVar2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        loop0:
        while (true) {
            boolean z7 = z6;
            while (true) {
                c cVar = this.f1655q;
                cVar.getClass();
                if (c.f1663s.get(cVar) == 0 && this.f1651c != (bVar = b.f1659e)) {
                    i a6 = a(this.f1654p);
                    long j6 = -2097152;
                    if (a6 != null) {
                        this.f1652e = 0;
                        int i2 = a6.f1675b.f1464a;
                        this.d = 0;
                        if (this.f1651c == b.f1658c) {
                            this.f1651c = b.f1657b;
                        }
                        c cVar2 = this.f1655q;
                        if (i2 != 0 && h(b.f1657b) && !cVar2.l() && !cVar2.k(c.f1662r.get(cVar2))) {
                            cVar2.l();
                        }
                        cVar2.getClass();
                        try {
                            a6.run();
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                        }
                        if (i2 != 0) {
                            c.f1662r.addAndGet(cVar2, -2097152);
                            if (this.f1651c != bVar) {
                                this.f1651c = b.d;
                            }
                        }
                    } else {
                        this.f1654p = z6;
                        if (this.f1652e != 0) {
                            if (z7) {
                                h(b.f1658c);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f1652e);
                                this.f1652e = 0;
                                break;
                            }
                            z7 = true;
                        } else {
                            Object obj = this.nextParkedWorker;
                            u uVar = c.f1664t;
                            if (obj != uVar) {
                                z3 = true;
                            } else {
                                z3 = z6;
                            }
                            if (z3) {
                                f1648r.set(this, -1);
                                while (this.nextParkedWorker != c.f1664t) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f1648r;
                                    if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                        break;
                                    }
                                    c cVar3 = this.f1655q;
                                    cVar3.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = c.f1663s;
                                    if (atomicIntegerFieldUpdater3.get(cVar3) != 0 || this.f1651c == (bVar2 = b.f1659e)) {
                                        break;
                                    }
                                    h(b.f1658c);
                                    Thread.interrupted();
                                    if (this.d == 0) {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        this.d = System.nanoTime() + this.f1655q.f1667c;
                                    } else {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                    }
                                    LockSupport.parkNanos(this.f1655q.f1667c);
                                    if (System.nanoTime() - this.d >= 0) {
                                        this.d = 0;
                                        c cVar4 = this.f1655q;
                                        synchronized (cVar4.f1670p) {
                                            try {
                                                if (atomicIntegerFieldUpdater3.get(cVar4) != 0) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (!z5) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.f1662r;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar4) & 2097151)) > cVar4.f1665a) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i5 = this.indexInArray;
                                                            z4 = false;
                                                            f(0);
                                                            cVar4.j(this, i5, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar4) & 2097151);
                                                            if (andDecrement != i5) {
                                                                Object b6 = cVar4.f1670p.b(andDecrement);
                                                                j.b(b6);
                                                                a aVar = (a) b6;
                                                                cVar4.f1670p.c(i5, aVar);
                                                                aVar.f(i5);
                                                                cVar4.j(aVar, andDecrement, i5);
                                                            }
                                                            cVar4.f1670p.c(andDecrement, (a) null);
                                                            this.f1651c = bVar2;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                        z6 = z4;
                                    }
                                    z4 = false;
                                    z6 = z4;
                                }
                            } else {
                                c cVar5 = this.f1655q;
                                cVar5.getClass();
                                if (this.nextParkedWorker == uVar) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f1661q;
                                        long j7 = atomicLongFieldUpdater2.get(cVar5);
                                        int i6 = this.indexInArray;
                                        this.nextParkedWorker = cVar5.f1670p.b((int) (j7 & 2097151));
                                        if (atomicLongFieldUpdater2.compareAndSet(cVar5, j7, ((2097152 + j7) & j6) | ((long) i6))) {
                                            break;
                                        }
                                        j6 = -2097152;
                                    }
                                }
                            }
                            z6 = z6;
                        }
                    }
                }
            }
        }
        h(b.f1659e);
    }
}
