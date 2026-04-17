package y1;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12665a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f12666b;

    public /* synthetic */ i(j jVar, int i2) {
        this.f12665a = i2;
        this.f12666b = jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
        android.util.Log.d("MessengerIpcClient", "Sending ".concat(java.lang.String.valueOf(r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        r3 = r0.f12671f;
        r4 = r0.f12668b;
        r5 = r1.f12674c;
        r6 = android.os.Message.obtain();
        r6.what = r5;
        r6.arg1 = r1.f12672a;
        r6.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.a());
        r4.putString("pkg", ((android.content.Context) r3.f12678b).getPackageName());
        r4.putBundle("data", r1.d);
        r6.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r1 = r0.f12669c;
        r3 = (android.os.Messenger) r1.f9925b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b5, code lost:
        if (r3 == null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b7, code lost:
        r3.send(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bc, code lost:
        r1 = (y1.g) r1.f9926c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c0, code lost:
        if (r1 == null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c2, code lost:
        r1 = r1.f12661a;
        r1.getClass();
        r1.send(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d3, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d5, code lost:
        r0.a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f12665a
            switch(r0) {
                case 0: goto L_0x0022;
                case 1: goto L_0x000e;
                default: goto L_0x0005;
            }
        L_0x0005:
            y1.j r0 = r8.f12666b
            r1 = 2
            java.lang.String r2 = "Service disconnected"
            r0.a(r1, r2)
            return
        L_0x000e:
            y1.j r0 = r8.f12666b
            monitor-enter(r0)
            int r1 = r0.f12667a     // Catch:{ all -> 0x001d }
            r2 = 1
            if (r1 != r2) goto L_0x001b
            java.lang.String r1 = "Timed out while binding"
            r0.a(r2, r1)     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r0)
            goto L_0x001f
        L_0x001d:
            r1 = move-exception
            goto L_0x0020
        L_0x001f:
            return
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r1
        L_0x0022:
            y1.j r0 = r8.f12666b
            monitor-enter(r0)
            int r1 = r0.f12667a     // Catch:{ all -> 0x002c }
            r2 = 2
            if (r1 == r2) goto L_0x002f
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            goto L_0x003b
        L_0x002c:
            r1 = move-exception
            goto L_0x00de
        L_0x002f:
            java.util.ArrayDeque r1 = r0.d     // Catch:{ all -> 0x002c }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x003c
            r0.c()     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x003b:
            return
        L_0x003c:
            java.util.ArrayDeque r1 = r0.d     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x002c }
            y1.k r1 = (y1.k) r1     // Catch:{ all -> 0x002c }
            android.util.SparseArray r3 = r0.f12670e     // Catch:{ all -> 0x002c }
            int r4 = r1.f12672a     // Catch:{ all -> 0x002c }
            r3.put(r4, r1)     // Catch:{ all -> 0x002c }
            y1.l r3 = r0.f12671f     // Catch:{ all -> 0x002c }
            java.lang.Object r3 = r3.f12679c     // Catch:{ all -> 0x002c }
            java.util.concurrent.ScheduledExecutorService r3 = (java.util.concurrent.ScheduledExecutorService) r3     // Catch:{ all -> 0x002c }
            j3.g r4 = new j3.g     // Catch:{ all -> 0x002c }
            r5 = 16
            r4.<init>(r0, r1, r5)     // Catch:{ all -> 0x002c }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x002c }
            r6 = 30
            r3.schedule(r4, r6, r5)     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0078
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "Sending "
            java.lang.String r5 = "MessengerIpcClient"
            java.lang.String r3 = r4.concat(r3)
            android.util.Log.d(r5, r3)
        L_0x0078:
            y1.l r3 = r0.f12671f
            android.os.Messenger r4 = r0.f12668b
            int r5 = r1.f12674c
            java.lang.Object r3 = r3.f12678b
            android.content.Context r3 = (android.content.Context) r3
            android.os.Message r6 = android.os.Message.obtain()
            r6.what = r5
            int r5 = r1.f12672a
            r6.arg1 = r5
            r6.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            boolean r5 = r1.a()
            java.lang.String r7 = "oneWay"
            r4.putBoolean(r7, r5)
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r5 = "pkg"
            r4.putString(r5, r3)
            android.os.Bundle r1 = r1.d
            java.lang.String r3 = "data"
            r4.putBundle(r3, r1)
            r6.setData(r4)
            m0.a0 r1 = r0.f12669c     // Catch:{ RemoteException -> 0x00d4 }
            java.lang.Object r3 = r1.f9925b     // Catch:{ RemoteException -> 0x00d4 }
            android.os.Messenger r3 = (android.os.Messenger) r3     // Catch:{ RemoteException -> 0x00d4 }
            if (r3 == 0) goto L_0x00bc
            r3.send(r6)     // Catch:{ RemoteException -> 0x00d4 }
            goto L_0x0022
        L_0x00bc:
            java.lang.Object r1 = r1.f9926c     // Catch:{ RemoteException -> 0x00d4 }
            y1.g r1 = (y1.g) r1     // Catch:{ RemoteException -> 0x00d4 }
            if (r1 == 0) goto L_0x00cc
            android.os.Messenger r1 = r1.f12661a     // Catch:{ RemoteException -> 0x00d4 }
            r1.getClass()     // Catch:{ RemoteException -> 0x00d4 }
            r1.send(r6)     // Catch:{ RemoteException -> 0x00d4 }
            goto L_0x0022
        L_0x00cc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x00d4 }
            java.lang.String r3 = "Both messengers are null"
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x00d4 }
            throw r1     // Catch:{ RemoteException -> 0x00d4 }
        L_0x00d4:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.a(r2, r1)
            goto L_0x0022
        L_0x00de:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.i.run():void");
    }
}
