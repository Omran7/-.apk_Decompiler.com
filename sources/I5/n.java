package I5;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class n {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1271e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1272f;
    public static final u g = new u("REMOVE_FROZEN", 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final int f1273a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1274b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1275c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Class<n> cls = n.class;
        f1271e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next$volatile");
        f1272f = AtomicLongFieldUpdater.newUpdater(cls, "_state$volatile");
    }

    public n(int i2, boolean z3) {
        this.f1273a = i2;
        this.f1274b = z3;
        int i5 = i2 - 1;
        this.f1275c = i5;
        this.d = new AtomicReferenceArray(i2);
        if (i5 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        } else if ((i2 & i5) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1272f;
            long j6 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j6) == 0) {
                int i2 = (int) (1073741823 & j6);
                int i5 = (int) ((1152921503533105152L & j6) >> 30);
                int i6 = this.f1275c;
                if (((i5 + 2) & i6) == (i2 & i6)) {
                    return 1;
                }
                AtomicReferenceArray atomicReferenceArray = this.d;
                if (this.f1274b || atomicReferenceArray.get(i5 & i6) == null) {
                    if (atomicLongFieldUpdater.compareAndSet(this, j6, (-1152921503533105153L & j6) | (((long) ((i5 + 1) & 1073741823)) << 30))) {
                        atomicReferenceArray.set(i5 & i6, runnable);
                        n nVar = this;
                        while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                            AtomicReferenceArray atomicReferenceArray2 = nVar.d;
                            int i7 = nVar.f1275c & i5;
                            Object obj = atomicReferenceArray2.get(i7);
                            if (!(obj instanceof m) || ((m) obj).f1270a != i5) {
                                nVar = null;
                                continue;
                            } else {
                                atomicReferenceArray2.set(i7, runnable);
                                continue;
                            }
                            if (nVar == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                } else {
                    int i8 = this.f1273a;
                    if (i8 < 1024 || ((i5 - i2) & 1073741823) > (i8 >> 1)) {
                        return 1;
                    }
                }
            } else if ((j6 & 2305843009213693952L) != 0) {
                return 2;
            } else {
                return 1;
            }
        }
        return 1;
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        do {
            atomicLongFieldUpdater = f1272f;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j6) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, 2305843009213693952L | j6));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a A[LOOP:3: B:16:0x006a->B:19:0x0076, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final I5.n c() {
        /*
            r10 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = f1272f
            long r2 = r6.get(r10)
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0011
            goto L_0x001d
        L_0x0011:
            long r7 = r2 | r0
            r0 = r6
            r1 = r10
            r4 = r7
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r7
        L_0x001d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f1271e
            java.lang.Object r1 = r0.get(r10)
            I5.n r1 = (I5.n) r1
            if (r1 == 0) goto L_0x0028
            return r1
        L_0x0028:
            I5.n r1 = new I5.n
            int r4 = r10.f1273a
            int r4 = r4 * 2
            boolean r5 = r10.f1274b
            r1.<init>(r4, r5)
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            int r4 = (int) r4
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r2
            r5 = 30
            long r7 = r7 >> r5
            int r5 = (int) r7
        L_0x0042:
            int r7 = r10.f1275c
            r8 = r4 & r7
            r7 = r7 & r5
            if (r8 == r7) goto L_0x0061
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.d
            java.lang.Object r7 = r7.get(r8)
            if (r7 != 0) goto L_0x0056
            I5.m r7 = new I5.m
            r7.<init>(r4)
        L_0x0056:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r1.d
            int r9 = r1.f1275c
            r9 = r9 & r4
            r8.set(r9, r7)
            int r4 = r4 + 1
            goto L_0x0042
        L_0x0061:
            r4 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r4 = r4 & r2
            r6.set(r1, r4)
        L_0x006a:
            r4 = 0
            boolean r4 = r0.compareAndSet(r10, r4, r1)
            if (r4 == 0) goto L_0x0072
            goto L_0x001d
        L_0x0072:
            java.lang.Object r4 = r0.get(r10)
            if (r4 == 0) goto L_0x006a
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.n.c():I5.n");
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1272f;
            long j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 1152921504606846976L) != 0) {
                return g;
            }
            int i2 = (int) (j6 & 1073741823);
            int i5 = this.f1275c;
            int i6 = i2 & i5;
            if ((((int) ((1152921503533105152L & j6) >> 30)) & i5) == i6) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            Object obj = atomicReferenceArray.get(i6);
            boolean z3 = this.f1274b;
            if (obj == null) {
                if (z3) {
                    return null;
                }
            } else if (obj instanceof m) {
                return null;
            } else {
                long j7 = (long) ((i2 + 1) & 1073741823);
                Object obj2 = obj;
                boolean z4 = z3;
                if (atomicLongFieldUpdater.compareAndSet(this, j6, (j6 & -1073741824) | j7)) {
                    atomicReferenceArray.set(i6, (Object) null);
                    return obj2;
                } else if (z4) {
                    n nVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1272f;
                        long j8 = atomicLongFieldUpdater2.get(nVar);
                        int i7 = (int) (j8 & 1073741823);
                        if ((j8 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(nVar, j8, (j8 & -1073741824) | j7)) {
                                nVar.d.set(nVar.f1275c & i7, (Object) null);
                                nVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
