package G5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class V implements Runnable, Comparable, P {
    private volatile Object _heap;

    /* renamed from: a  reason: collision with root package name */
    public long f885a;

    /* renamed from: b  reason: collision with root package name */
    public int f886b = -1;

    public V(long j6) {
        this.f885a = j6;
    }

    public final int a(long j6, W w6, X x6) {
        V v6;
        boolean z3;
        synchronized (this) {
            if (this._heap == F.f862b) {
                return 2;
            }
            synchronized (w6) {
                try {
                    V[] vArr = w6.f1286a;
                    if (vArr != null) {
                        v6 = vArr[0];
                    } else {
                        v6 = null;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X.f888f;
                    x6.getClass();
                    if (X.f890q.get(x6) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        return 1;
                    }
                    if (v6 == null) {
                        w6.f887c = j6;
                    } else {
                        long j7 = v6.f885a;
                        if (j7 - j6 < 0) {
                            j6 = j7;
                        }
                        if (j6 - w6.f887c > 0) {
                            w6.f887c = j6;
                        }
                    }
                    long j8 = this.f885a;
                    long j9 = w6.f887c;
                    if (j8 - j9 < 0) {
                        this.f885a = j9;
                    }
                    w6.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final int compareTo(Object obj) {
        int i2 = ((this.f885a - ((V) obj).f885a) > 0 ? 1 : ((this.f885a - ((V) obj).f885a) == 0 ? 0 : -1));
        if (i2 > 0) {
            return 1;
        }
        if (i2 < 0) {
            return -1;
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: I5.x} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0032, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Object r0 = r5._heap     // Catch:{ all -> 0x0011 }
            I5.u r1 = G5.F.f862b     // Catch:{ all -> 0x0011 }
            if (r0 != r1) goto L_0x0009
            monitor-exit(r5)
            return
        L_0x0009:
            boolean r2 = r0 instanceof G5.W     // Catch:{ all -> 0x0011 }
            r3 = 0
            if (r2 == 0) goto L_0x0013
            G5.W r0 = (G5.W) r0     // Catch:{ all -> 0x0011 }
            goto L_0x0014
        L_0x0011:
            r0 = move-exception
            goto L_0x0031
        L_0x0013:
            r0 = r3
        L_0x0014:
            if (r0 == 0) goto L_0x002d
            monitor-enter(r0)     // Catch:{ all -> 0x0011 }
            java.lang.Object r2 = r5._heap     // Catch:{ all -> 0x002a }
            boolean r4 = r2 instanceof I5.x     // Catch:{ all -> 0x002a }
            if (r4 == 0) goto L_0x0020
            r3 = r2
            I5.x r3 = (I5.x) r3     // Catch:{ all -> 0x002a }
        L_0x0020:
            if (r3 != 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            int r2 = r5.f886b     // Catch:{ all -> 0x002a }
            r0.b(r2)     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            goto L_0x002d
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r1     // Catch:{ all -> 0x0011 }
        L_0x002d:
            r5._heap = r1     // Catch:{ all -> 0x0011 }
            monitor-exit(r5)
            return
        L_0x0031:
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.V.e():void");
    }

    public final void k(W w6) {
        if (this._heap != F.f862b) {
            this._heap = w6;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public String toString() {
        return "Delayed[nanos=" + this.f885a + ']';
    }
}
