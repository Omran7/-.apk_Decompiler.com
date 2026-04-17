package i1;

import c1.j;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f8258a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f8259b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8260c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ f(i iVar, j jVar, int i2, Runnable runnable) {
        this.f8258a = iVar;
        this.f8259b = jVar;
        this.f8260c = i2;
        this.d = runnable;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3.d.a(r0, r1 + 1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            c1.j r0 = r8.f8259b
            int r1 = r8.f8260c
            java.lang.Runnable r2 = r8.d
            i1.i r3 = r8.f8258a
            k1.c r4 = r3.f8271f
            j1.d r5 = r3.f8269c     // Catch:{ a -> 0x0046 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ a -> 0x0046 }
            F3.e r6 = new F3.e     // Catch:{ a -> 0x0046 }
            r7 = 13
            r6.<init>((java.lang.Object) r5, (int) r7)     // Catch:{ a -> 0x0046 }
            r5 = r4
            j1.g r5 = (j1.g) r5     // Catch:{ a -> 0x0046 }
            r5.m(r6)     // Catch:{ a -> 0x0046 }
            android.content.Context r5 = r3.f8267a     // Catch:{ a -> 0x0046 }
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ a -> 0x0046 }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ a -> 0x0046 }
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch:{ a -> 0x0046 }
            if (r5 == 0) goto L_0x0038
            boolean r5 = r5.isConnected()     // Catch:{ a -> 0x0046 }
            if (r5 == 0) goto L_0x0038
            r3.a(r0, r1)     // Catch:{ a -> 0x0046 }
            goto L_0x0042
        L_0x0036:
            r0 = move-exception
            goto L_0x0050
        L_0x0038:
            com.mtma.criminal.city.utils.o r5 = new com.mtma.criminal.city.utils.o     // Catch:{ a -> 0x0046 }
            r5.<init>((java.lang.Object) r3, (java.lang.Object) r0, (int) r1)     // Catch:{ a -> 0x0046 }
            j1.g r4 = (j1.g) r4     // Catch:{ a -> 0x0046 }
            r4.m(r5)     // Catch:{ a -> 0x0046 }
        L_0x0042:
            r2.run()
            goto L_0x004f
        L_0x0046:
            i1.d r3 = r3.d     // Catch:{ all -> 0x0036 }
            int r1 = r1 + 1
            r4 = 0
            r3.a(r0, r1, r4)     // Catch:{ all -> 0x0036 }
            goto L_0x0042
        L_0x004f:
            return
        L_0x0050:
            r2.run()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.f.run():void");
    }
}
