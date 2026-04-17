package H;

import J.a;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f972a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f973b;

    public /* synthetic */ e(Object obj, int i2) {
        this.f972a = i2;
        this.f973b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r0 >= r2.size()) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        ((J.a) r2.get(r0)).accept(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f972a
            switch(r0) {
                case 0: goto L_0x003a;
                default: goto L_0x0005;
            }
        L_0x0005:
            H.f r5 = (H.f) r5
            java.lang.Object r0 = H.g.f978c
            monitor-enter(r0)
            n.j r1 = H.g.d     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r4.f973b     // Catch:{ all -> 0x001a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x001a }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x001a }
            if (r2 != 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            goto L_0x0037
        L_0x001a:
            r5 = move-exception
            goto L_0x0038
        L_0x001c:
            java.lang.Object r3 = r4.f973b     // Catch:{ all -> 0x001a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x001a }
            r1.remove(r3)     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r0 = 0
        L_0x0025:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x0037
            java.lang.Object r1 = r2.get(r0)
            J.a r1 = (J.a) r1
            r1.accept(r5)
            int r0 = r0 + 1
            goto L_0x0025
        L_0x0037:
            return
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r5
        L_0x003a:
            H.f r5 = (H.f) r5
            if (r5 != 0) goto L_0x0044
            H.f r5 = new H.f
            r0 = -3
            r5.<init>((int) r0)
        L_0x0044:
            java.lang.Object r0 = r4.f973b
            I3.h r0 = (I3.h) r0
            r0.D(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H.e.accept(java.lang.Object):void");
    }
}
