package Q0;

public final class b implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2355a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2356b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f2357c;
    public volatile c d;

    /* renamed from: e  reason: collision with root package name */
    public int f2358e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f2359f = 3;

    public b(Object obj, d dVar) {
        this.f2355a = obj;
        this.f2356b = dVar;
    }

    public final boolean a() {
        boolean z3;
        synchronized (this.f2355a) {
            try {
                if (!this.f2357c.a()) {
                    if (!this.d.a()) {
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

    /* JADX WARNING: type inference failed for: r3v3, types: [Q0.d, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(Q0.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f2355a
            monitor-enter(r0)
            Q0.c r1 = r2.d     // Catch:{ all -> 0x001b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001b }
            r1 = 5
            if (r3 != 0) goto L_0x001f
            r2.f2358e = r1     // Catch:{ all -> 0x001b }
            int r3 = r2.f2359f     // Catch:{ all -> 0x001b }
            r1 = 1
            if (r3 == r1) goto L_0x001d
            r2.f2359f = r1     // Catch:{ all -> 0x001b }
            Q0.c r3 = r2.d     // Catch:{ all -> 0x001b }
            r3.h()     // Catch:{ all -> 0x001b }
            goto L_0x001d
        L_0x001b:
            r3 = move-exception
            goto L_0x002a
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001f:
            r2.f2359f = r1     // Catch:{ all -> 0x001b }
            java.lang.Object r3 = r2.f2356b     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x0028
            r3.b(r2)     // Catch:{ all -> 0x001b }
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.b.b(Q0.c):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [Q0.d, java.lang.Object] */
    public final boolean c(c cVar) {
        boolean z3;
        synchronized (this.f2355a) {
            ? r12 = this.f2356b;
            if ((r12 == 0 || r12.c(this)) && cVar.equals(this.f2357c)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public final void clear() {
        synchronized (this.f2355a) {
            try {
                this.f2358e = 3;
                this.f2357c.clear();
                if (this.f2359f != 3) {
                    this.f2359f = 3;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean z3;
        synchronized (this.f2355a) {
            try {
                if (this.f2358e == 3 && this.f2359f == 3) {
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

    public final boolean e(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        if (!this.f2357c.e(bVar.f2357c) || !this.d.e(bVar.d)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [Q0.d, java.lang.Object] */
    public final d f() {
        d dVar;
        synchronized (this.f2355a) {
            try {
                ? r12 = this.f2356b;
                if (r12 != 0) {
                    dVar = r12.f();
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
        synchronized (this.f2355a) {
            try {
                if (this.f2358e == 1) {
                    this.f2358e = 2;
                    this.f2357c.g();
                }
                if (this.f2359f == 1) {
                    this.f2359f = 2;
                    this.d.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f2355a) {
            try {
                if (this.f2358e != 1) {
                    this.f2358e = 1;
                    this.f2357c.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [Q0.d, java.lang.Object] */
    public final boolean i(c cVar) {
        boolean z3;
        synchronized (this.f2355a) {
            ? r02 = this.f2356b;
            if (r02 != 0) {
                if (!r02.i(this)) {
                    z3 = false;
                }
            }
            z3 = true;
        }
        return z3;
    }

    public final boolean isRunning() {
        boolean z3;
        synchronized (this.f2355a) {
            try {
                z3 = true;
                if (this.f2358e != 1) {
                    if (this.f2359f != 1) {
                        z3 = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [Q0.d, java.lang.Object] */
    public final boolean j(c cVar) {
        boolean z3;
        boolean z4;
        int i2;
        synchronized (this.f2355a) {
            ? r12 = this.f2356b;
            z3 = false;
            if (r12 == 0 || r12.j(this)) {
                if (this.f2358e != 5) {
                    z4 = cVar.equals(this.f2357c);
                } else if (!cVar.equals(this.d) || !((i2 = this.f2359f) == 4 || i2 == 5)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    public final boolean k() {
        boolean z3;
        synchronized (this.f2355a) {
            try {
                if (this.f2358e != 4) {
                    if (this.f2359f != 4) {
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

    /* JADX WARNING: type inference failed for: r4v2, types: [Q0.d, java.lang.Object] */
    public final void l(c cVar) {
        synchronized (this.f2355a) {
            try {
                if (cVar.equals(this.f2357c)) {
                    this.f2358e = 4;
                } else if (cVar.equals(this.d)) {
                    this.f2359f = 4;
                }
                ? r42 = this.f2356b;
                if (r42 != 0) {
                    r42.l(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
