package M5;

import G5.C0039k;
import I5.a;
import I5.d;
import I5.t;
import I5.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class i {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1879b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1880c;
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1881e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1882f;
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final g f1883a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Class<i> cls = i.class;
        Class<Object> cls2 = Object.class;
        f1879b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "head$volatile");
        f1880c = AtomicLongFieldUpdater.newUpdater(cls, "deqIdx$volatile");
        d = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "tail$volatile");
        f1881e = AtomicLongFieldUpdater.newUpdater(cls, "enqIdx$volatile");
        f1882f = AtomicIntegerFieldUpdater.newUpdater(cls, "_availablePermits$volatile");
    }

    public i(int i2) {
        if (i2 < 0 || i2 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        k kVar = new k(0, (k) null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = 1 - i2;
        this.f1883a = new g(this, 0);
    }

    public final void a(c cVar) {
        Object a6;
        f fVar;
        long j6;
        c cVar2 = cVar;
        while (true) {
            int andDecrement = f1882f.getAndDecrement(this);
            if (andDecrement <= 1) {
                g gVar = this.f1883a;
                if (andDecrement > 0) {
                    cVar2.a(gVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                k kVar = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f1881e.getAndIncrement(this);
                f fVar2 = f.f1875a;
                long j7 = andIncrement / ((long) j.f1888f);
                while (true) {
                    a6 = a.a(kVar, j7, fVar2);
                    if (a6 != a.f1245b) {
                        t b6 = a.b(a6);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j6 = j7;
                            if (tVar.f1278c >= b6.f1278c) {
                                break;
                            } else if (!b6.g()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b6)) {
                                    if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                        if (b6.d()) {
                                            b6.c();
                                        }
                                        fVar2 = fVar;
                                        j7 = j6;
                                    }
                                }
                                if (tVar.d()) {
                                    tVar.c();
                                }
                            }
                        }
                    } else {
                        break;
                    }
                    fVar2 = fVar;
                    j7 = j6;
                }
                k kVar2 = (k) a.b(a6);
                int i2 = (int) (andIncrement % ((long) j.f1888f));
                AtomicReferenceArray atomicReferenceArray = kVar2.f1889e;
                while (!atomicReferenceArray.compareAndSet(i2, (Object) null, cVar2)) {
                    if (atomicReferenceArray.get(i2) != null) {
                        u uVar = j.f1885b;
                        u uVar2 = j.f1886c;
                        while (!atomicReferenceArray.compareAndSet(i2, uVar, uVar2)) {
                            if (atomicReferenceArray.get(i2) != uVar) {
                            }
                        }
                        cVar2.a(gVar);
                        return;
                    }
                }
                cVar2.b(kVar2, i2);
                return;
            }
        }
    }

    public final void b() {
        int i2;
        Object a6;
        boolean z3;
        boolean z4;
        k kVar;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1882f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            if (andIncrement >= 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= 1 || atomicIntegerFieldUpdater.compareAndSet(this, i2, 1)) {
                    }
                    i2 = atomicIntegerFieldUpdater.get(this);
                    break;
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            } else if (andIncrement < 0) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1879b;
                k kVar2 = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = f1880c.getAndIncrement(this);
                long j6 = andIncrement2 / ((long) j.f1888f);
                h hVar = h.f1878a;
                while (true) {
                    a6 = a.a(kVar2, j6, hVar);
                    if (a6 != a.f1245b) {
                        t b6 = a.b(a6);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            kVar = kVar2;
                            if (tVar.f1278c >= b6.f1278c) {
                                break;
                            } else if (!b6.g()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b6)) {
                                    if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                        if (b6.d()) {
                                            b6.c();
                                        }
                                        kVar2 = kVar;
                                    }
                                }
                                if (tVar.d()) {
                                    tVar.c();
                                }
                            }
                        }
                    } else {
                        break;
                    }
                    kVar2 = kVar;
                }
                k kVar3 = (k) a.b(a6);
                d.f1252b.set(kVar3, (Object) null);
                z3 = false;
                if (kVar3.f1278c <= j6) {
                    int i5 = (int) (andIncrement2 % ((long) j.f1888f));
                    u uVar = j.f1885b;
                    AtomicReferenceArray atomicReferenceArray = kVar3.f1889e;
                    Object andSet = atomicReferenceArray.getAndSet(i5, uVar);
                    if (andSet == null) {
                        int i6 = j.f1884a;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                u uVar2 = j.f1885b;
                                u uVar3 = j.d;
                                while (true) {
                                    if (!atomicReferenceArray.compareAndSet(i5, uVar2, uVar3)) {
                                        if (atomicReferenceArray.get(i5) != uVar2) {
                                            z4 = false;
                                            break;
                                        }
                                    } else {
                                        z4 = true;
                                        break;
                                    }
                                }
                                z3 = !z4;
                                continue;
                            } else if (atomicReferenceArray.get(i5) == j.f1886c) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                    } else if (andSet == j.f1887e) {
                        continue;
                    } else if (andSet instanceof C0039k) {
                        C0039k kVar4 = (C0039k) andSet;
                        u c3 = kVar4.c(this.f1883a);
                        if (c3 != null) {
                            kVar4.d(c3);
                        } else {
                            continue;
                        }
                    } else {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    z3 = true;
                    continue;
                }
            } else {
                return;
            }
        } while (!z3);
    }
}
