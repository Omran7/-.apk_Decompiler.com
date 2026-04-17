package E0;

public final class a extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f578a = 0;

    public /* synthetic */ a(Runnable runnable) {
        super(runnable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1.m();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            int r0 = r3.f578a
            switch(r0) {
                case 0: goto L_0x0032;
                case 1: goto L_0x0022;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Class<N5.c> r0 = N5.c.class
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0005 }
            N5.c r1 = N5.c.h()     // Catch:{ all -> 0x0010 }
            if (r1 != 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            goto L_0x0005
        L_0x0010:
            r1 = move-exception
            goto L_0x0020
        L_0x0012:
            N5.c r2 = N5.c.f1927j     // Catch:{ all -> 0x0010 }
            if (r1 != r2) goto L_0x001b
            r1 = 0
            N5.c.f1927j = r1     // Catch:{ all -> 0x0010 }
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            r1.m()     // Catch:{ InterruptedException -> 0x0005 }
            goto L_0x0005
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r1     // Catch:{ InterruptedException -> 0x0005 }
        L_0x0022:
            r0 = 19
            android.os.Process.setThreadPriority(r0)
            monitor-enter(r3)
        L_0x0028:
            r3.wait()     // Catch:{ InterruptedException -> 0x002e }
            goto L_0x0028
        L_0x002c:
            r0 = move-exception
            goto L_0x0030
        L_0x002e:
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            return
        L_0x0030:
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            throw r0
        L_0x0032:
            r0 = 9
            android.os.Process.setThreadPriority(r0)
            super.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.a.run():void");
    }

    public /* synthetic */ a(String str) {
        super(str);
    }

    public /* synthetic */ a(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
