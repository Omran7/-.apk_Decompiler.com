package Q0;

import h0.C0552a;

public final class g implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final d f2386a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2387b;

    /* renamed from: c  reason: collision with root package name */
    public volatile f f2388c;
    public volatile c d;

    /* renamed from: e  reason: collision with root package name */
    public int f2389e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f2390f = 3;
    public boolean g;

    public g(Object obj, d dVar) {
        this.f2387b = obj;
        this.f2386a = dVar;
    }

    public final boolean a() {
        boolean z3;
        synchronized (this.f2387b) {
            try {
                if (!this.d.a()) {
                    if (!this.f2388c.a()) {
                        z3 = false;
                    }
                }
                z3 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(Q0.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f2387b
            monitor-enter(r0)
            Q0.f r1 = r2.f2388c     // Catch:{ all -> 0x0010 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0010 }
            r1 = 5
            if (r3 != 0) goto L_0x0012
            r2.f2390f = r1     // Catch:{ all -> 0x0010 }
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return
        L_0x0010:
            r3 = move-exception
            goto L_0x001d
        L_0x0012:
            r2.f2389e = r1     // Catch:{ all -> 0x0010 }
            Q0.d r3 = r2.f2386a     // Catch:{ all -> 0x0010 }
            if (r3 == 0) goto L_0x001b
            r3.b(r2)     // Catch:{ all -> 0x0010 }
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.g.b(Q0.c):void");
    }

    public final boolean c(c cVar) {
        boolean z3;
        synchronized (this.f2387b) {
            try {
                d dVar = this.f2386a;
                if ((dVar == null || dVar.c(this)) && cVar.equals(this.f2388c) && this.f2389e != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public final void clear() {
        synchronized (this.f2387b) {
            this.g = false;
            this.f2389e = 3;
            this.f2390f = 3;
            this.d.clear();
            this.f2388c.clear();
        }
    }

    public final boolean d() {
        boolean z3;
        synchronized (this.f2387b) {
            if (this.f2389e == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(Q0.c r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof Q0.g
            r1 = 0
            if (r0 == 0) goto L_0x002e
            Q0.g r4 = (Q0.g) r4
            Q0.f r0 = r3.f2388c
            if (r0 != 0) goto L_0x0010
            Q0.f r0 = r4.f2388c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            Q0.f r0 = r3.f2388c
            Q0.f r2 = r4.f2388c
            boolean r0 = r0.e(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            Q0.c r0 = r3.d
            if (r0 != 0) goto L_0x0023
            Q0.c r4 = r4.d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            Q0.c r0 = r3.d
            Q0.c r4 = r4.d
            boolean r4 = r0.e(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.g.e(Q0.c):boolean");
    }

    public final d f() {
        d dVar;
        synchronized (this.f2387b) {
            try {
                d dVar2 = this.f2386a;
                if (dVar2 != null) {
                    dVar = dVar2.f();
                } else {
                    dVar = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final void g() {
        synchronized (this.f2387b) {
            try {
                if (!C0552a.f(this.f2390f)) {
                    this.f2390f = 2;
                    this.d.g();
                }
                if (!C0552a.f(this.f2389e)) {
                    this.f2389e = 2;
                    this.f2388c.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f2387b) {
            try {
                this.g = true;
                if (!(this.f2389e == 4 || this.f2390f == 1)) {
                    this.f2390f = 1;
                    this.d.h();
                }
                if (this.g && this.f2389e != 1) {
                    this.f2389e = 1;
                    this.f2388c.h();
                }
                this.g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean i(c cVar) {
        boolean z3;
        synchronized (this.f2387b) {
            try {
                d dVar = this.f2386a;
                if (dVar == null || dVar.i(this)) {
                    if (!cVar.equals(this.f2388c)) {
                        if (this.f2389e != 4) {
                        }
                    }
                    z3 = true;
                }
                z3 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public final boolean isRunning() {
        boolean z3;
        synchronized (this.f2387b) {
            z3 = true;
            if (this.f2389e != 1) {
                z3 = false;
            }
        }
        return z3;
    }

    public final boolean j(c cVar) {
        boolean z3;
        synchronized (this.f2387b) {
            try {
                d dVar = this.f2386a;
                if ((dVar == null || dVar.j(this)) && cVar.equals(this.f2388c) && !a()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public final boolean k() {
        boolean z3;
        synchronized (this.f2387b) {
            if (this.f2389e == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(Q0.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f2387b
            monitor-enter(r0)
            Q0.c r1 = r2.d     // Catch:{ all -> 0x0010 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0010 }
            r1 = 4
            if (r3 == 0) goto L_0x0012
            r2.f2390f = r1     // Catch:{ all -> 0x0010 }
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return
        L_0x0010:
            r3 = move-exception
            goto L_0x002a
        L_0x0012:
            r2.f2389e = r1     // Catch:{ all -> 0x0010 }
            Q0.d r3 = r2.f2386a     // Catch:{ all -> 0x0010 }
            if (r3 == 0) goto L_0x001b
            r3.l(r2)     // Catch:{ all -> 0x0010 }
        L_0x001b:
            int r3 = r2.f2390f     // Catch:{ all -> 0x0010 }
            boolean r3 = h0.C0552a.f(r3)     // Catch:{ all -> 0x0010 }
            if (r3 != 0) goto L_0x0028
            Q0.c r3 = r2.d     // Catch:{ all -> 0x0010 }
            r3.clear()     // Catch:{ all -> 0x0010 }
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.g.l(Q0.c):void");
    }
}
