package M0;

import android.os.Handler;

public final class g implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1799a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1800b;

    public /* synthetic */ g(Object obj, int i2) {
        this.f1799a = i2;
        this.f1800b = obj;
    }

    /* JADX WARNING: type inference failed for: r5v12, types: [S3.y, java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r0v16, types: [S3.y, java.lang.Exception] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        r3.b(new java.lang.Exception("Not supported by GmsCore", (java.lang.Throwable) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        switch(r3.f12675e) {
            case 0: goto L_0x007e;
            default: goto L_0x0070;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        r5 = r5.getBundle("data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        if (r5 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        r5 = android.os.Bundle.EMPTY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        r3.c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r5.getBoolean("ack", false) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        r3.c((android.os.Bundle) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        r3.b(new java.lang.Exception("Invalid response to one way request", (java.lang.Throwable) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r4.f1799a
            switch(r0) {
                case 0: goto L_0x00b7;
                case 1: goto L_0x009a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = "Received response for unknown request: "
            java.lang.String r1 = "MessengerIpcClient"
            int r2 = r5.arg1
            r3 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r3)
            if (r1 == 0) goto L_0x0025
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Received response to request: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MessengerIpcClient"
            android.util.Log.d(r3, r1)
        L_0x0025:
            java.lang.Object r1 = r4.f1800b
            y1.j r1 = (y1.j) r1
            monitor-enter(r1)
            android.util.SparseArray r3 = r1.f12670e     // Catch:{ all -> 0x0047 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0047 }
            y1.k r3 = (y1.k) r3     // Catch:{ all -> 0x0047 }
            if (r3 != 0) goto L_0x0049
            java.lang.String r5 = "MessengerIpcClient"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r3.<init>(r0)     // Catch:{ all -> 0x0047 }
            r3.append(r2)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0047 }
            android.util.Log.w(r5, r0)     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            goto L_0x0096
        L_0x0047:
            r5 = move-exception
            goto L_0x0098
        L_0x0049:
            android.util.SparseArray r0 = r1.f12670e     // Catch:{ all -> 0x0047 }
            r0.remove(r2)     // Catch:{ all -> 0x0047 }
            r1.c()     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            android.os.Bundle r5 = r5.getData()
            java.lang.String r0 = "unsupported"
            r1 = 0
            boolean r0 = r5.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x006b
            java.lang.String r5 = "Not supported by GmsCore"
            S3.y r0 = new S3.y
            r1 = 0
            r0.<init>(r5, r1)
            r3.b(r0)
            goto L_0x0096
        L_0x006b:
            int r0 = r3.f12675e
            switch(r0) {
                case 0: goto L_0x007e;
                default: goto L_0x0070;
            }
        L_0x0070:
            java.lang.String r0 = "data"
            android.os.Bundle r5 = r5.getBundle(r0)
            if (r5 != 0) goto L_0x007a
            android.os.Bundle r5 = android.os.Bundle.EMPTY
        L_0x007a:
            r3.c(r5)
            goto L_0x0096
        L_0x007e:
            java.lang.String r0 = "ack"
            r1 = 0
            boolean r5 = r5.getBoolean(r0, r1)
            r0 = 0
            if (r5 == 0) goto L_0x008c
            r3.c(r0)
            goto L_0x0096
        L_0x008c:
            S3.y r5 = new S3.y
            java.lang.String r1 = "Invalid response to one way request"
            r5.<init>(r1, r0)
            r3.b(r5)
        L_0x0096:
            r5 = 1
            return r5
        L_0x0098:
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            throw r5
        L_0x009a:
            int r0 = r5.what
            if (r0 == 0) goto L_0x00a0
            r5 = 0
            return r5
        L_0x00a0:
            java.lang.Object r0 = r4.f1800b
            e1.c r0 = (e1.C0484c) r0
            java.lang.Object r5 = r5.obj
            if (r5 != 0) goto L_0x00b1
            java.lang.Object r5 = r0.f7573a
            monitor-enter(r5)
            r0 = 0
            throw r0     // Catch:{ all -> 0x00af }
        L_0x00ad:
            monitor-exit(r5)     // Catch:{ all -> 0x00af }
            throw r0
        L_0x00af:
            r0 = move-exception
            goto L_0x00ad
        L_0x00b1:
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        L_0x00b7:
            int r0 = r5.what
            java.lang.Object r1 = r4.f1800b
            M0.h r1 = (M0.h) r1
            r2 = 1
            if (r0 != r2) goto L_0x00c8
            java.lang.Object r5 = r5.obj
            M0.e r5 = (M0.e) r5
            r1.b(r5)
            goto L_0x00d5
        L_0x00c8:
            r2 = 2
            if (r0 != r2) goto L_0x00d4
            java.lang.Object r5 = r5.obj
            M0.e r5 = (M0.e) r5
            com.bumptech.glide.l r0 = r1.d
            r0.m(r5)
        L_0x00d4:
            r2 = 0
        L_0x00d5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.g.handleMessage(android.os.Message):boolean");
    }
}
