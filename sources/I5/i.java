package I5;

import G5.A;
import G5.C0040l;
import G5.F0;
import G5.H;
import G5.K;
import G5.P;
import K5.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class i extends A implements K {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1260q = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");

    /* renamed from: c  reason: collision with root package name */
    public final l f1261c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ K f1262e;

    /* renamed from: f  reason: collision with root package name */
    public final l f1263f;

    /* renamed from: p  reason: collision with root package name */
    public final Object f1264p;
    private volatile /* synthetic */ int runningWorkers$volatile;

    public i(l lVar, int i2) {
        K k6;
        this.f1261c = lVar;
        this.d = i2;
        if (lVar instanceof K) {
            k6 = (K) lVar;
        } else {
            k6 = null;
        }
        this.f1262e = k6 == null ? H.f872a : k6;
        this.f1263f = new l();
        this.f1264p = new Object();
    }

    public final P c(long j6, F0 f02, o5.i iVar) {
        return this.f1262e.c(j6, f02, iVar);
    }

    public final void d(long j6, C0040l lVar) {
        this.f1262e.d(j6, lVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r3 = l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r3 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r2.f1261c.j(r2, new B2.a(r2, r3, 6, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(o5.i r3, java.lang.Runnable r4) {
        /*
            r2 = this;
            I5.l r3 = r2.f1263f
            r3.a(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = f1260q
            int r4 = r3.get(r2)
            int r0 = r2.d
            if (r4 >= r0) goto L_0x0037
            java.lang.Object r4 = r2.f1264p
            monitor-enter(r4)
            int r0 = r3.get(r2)     // Catch:{ all -> 0x0034 }
            int r1 = r2.d     // Catch:{ all -> 0x0034 }
            if (r0 < r1) goto L_0x001c
            monitor-exit(r4)
            goto L_0x0037
        L_0x001c:
            r3.incrementAndGet(r2)     // Catch:{ all -> 0x0034 }
            monitor-exit(r4)
            java.lang.Runnable r3 = r2.l()
            if (r3 != 0) goto L_0x0027
            goto L_0x0037
        L_0x0027:
            B2.a r4 = new B2.a
            r0 = 6
            r1 = 0
            r4.<init>(r2, r3, r0, r1)
            K5.l r3 = r2.f1261c
            r3.j(r2, r4)
            goto L_0x0037
        L_0x0034:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.i.j(o5.i, java.lang.Runnable):void");
    }

    public final Runnable l() {
        while (true) {
            Runnable runnable = (Runnable) this.f1263f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1264p) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1260q;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1263f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
