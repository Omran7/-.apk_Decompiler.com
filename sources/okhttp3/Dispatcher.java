package okhttp3;

import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;
import okhttp3.RealCall;

public final class Dispatcher {

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f10549a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f10550b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque f10551c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public final void a(RealCall.AsyncCall asyncCall) {
        ArrayDeque arrayDeque = this.f10551c;
        synchronized (this) {
            if (!arrayDeque.remove(asyncCall)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        b();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void b() {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r14)
            java.util.ArrayDeque r1 = r14.f10550b     // Catch:{ all -> 0x005f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x005f }
        L_0x000c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x005f }
            r3 = 0
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x005f }
            okhttp3.RealCall$AsyncCall r2 = (okhttp3.RealCall.AsyncCall) r2     // Catch:{ all -> 0x005f }
            java.util.ArrayDeque r4 = r14.f10551c     // Catch:{ all -> 0x005f }
            int r4 = r4.size()     // Catch:{ all -> 0x005f }
            r5 = 64
            if (r4 < r5) goto L_0x0024
            goto L_0x0062
        L_0x0024:
            java.util.ArrayDeque r4 = r14.f10551c     // Catch:{ all -> 0x005f }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x005f }
        L_0x002a:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x005f }
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x005f }
            okhttp3.RealCall$AsyncCall r5 = (okhttp3.RealCall.AsyncCall) r5     // Catch:{ all -> 0x005f }
            okhttp3.RealCall r5 = okhttp3.RealCall.this     // Catch:{ all -> 0x005f }
            okhttp3.Request r5 = r5.f10632e     // Catch:{ all -> 0x005f }
            okhttp3.HttpUrl r5 = r5.f10637a     // Catch:{ all -> 0x005f }
            java.lang.String r5 = r5.d     // Catch:{ all -> 0x005f }
            okhttp3.RealCall r6 = okhttp3.RealCall.this     // Catch:{ all -> 0x005f }
            okhttp3.Request r6 = r6.f10632e     // Catch:{ all -> 0x005f }
            okhttp3.HttpUrl r6 = r6.f10637a     // Catch:{ all -> 0x005f }
            java.lang.String r6 = r6.d     // Catch:{ all -> 0x005f }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x005f }
            if (r5 == 0) goto L_0x002a
            int r3 = r3 + 1
            goto L_0x002a
        L_0x004f:
            r4 = 5
            if (r3 < r4) goto L_0x0053
            goto L_0x000c
        L_0x0053:
            r1.remove()     // Catch:{ all -> 0x005f }
            r0.add(r2)     // Catch:{ all -> 0x005f }
            java.util.ArrayDeque r3 = r14.f10551c     // Catch:{ all -> 0x005f }
            r3.add(r2)     // Catch:{ all -> 0x005f }
            goto L_0x000c
        L_0x005f:
            r0 = move-exception
            goto L_0x00d6
        L_0x0062:
            monitor-enter(r14)     // Catch:{ all -> 0x005f }
            java.util.ArrayDeque r1 = r14.f10551c     // Catch:{ all -> 0x00d3 }
            r1.size()     // Catch:{ all -> 0x00d3 }
            java.util.ArrayDeque r1 = r14.d     // Catch:{ all -> 0x00d3 }
            r1.size()     // Catch:{ all -> 0x00d3 }
            monitor-exit(r14)     // Catch:{ all -> 0x005f }
            monitor-exit(r14)     // Catch:{ all -> 0x005f }
            int r1 = r0.size()
            r2 = r3
        L_0x0074:
            if (r2 >= r1) goto L_0x00d2
            java.lang.Object r4 = r0.get(r2)
            okhttp3.RealCall$AsyncCall r4 = (okhttp3.RealCall.AsyncCall) r4
            monitor-enter(r14)
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f10549a     // Catch:{ all -> 0x009d }
            if (r5 != 0) goto L_0x009f
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x009d }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x009d }
            java.util.concurrent.SynchronousQueue r12 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x009d }
            r12.<init>()     // Catch:{ all -> 0x009d }
            java.lang.String r6 = "OkHttp Dispatcher"
            java.util.concurrent.ThreadFactory r13 = okhttp3.internal.Util.u(r6, r3)     // Catch:{ all -> 0x009d }
            r9 = 60
            r7 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r6 = r5
            r6.<init>(r7, r8, r9, r11, r12, r13)     // Catch:{ all -> 0x009d }
            r14.f10549a = r5     // Catch:{ all -> 0x009d }
            goto L_0x009f
        L_0x009d:
            r0 = move-exception
            goto L_0x00d0
        L_0x009f:
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f10549a     // Catch:{ all -> 0x009d }
            monitor-exit(r14)
            okhttp3.RealCall r6 = okhttp3.RealCall.this
            r5.execute(r4)     // Catch:{ RejectedExecutionException -> 0x00a8 }
            goto L_0x00c4
        L_0x00a8:
            r5 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch:{ all -> 0x00c7 }
            java.lang.String r8 = "executor rejected"
            r7.<init>(r8)     // Catch:{ all -> 0x00c7 }
            r7.initCause(r5)     // Catch:{ all -> 0x00c7 }
            okhttp3.EventListener r5 = r6.d     // Catch:{ all -> 0x00c7 }
            r5.getClass()     // Catch:{ all -> 0x00c7 }
            I3.h r5 = r4.f10635b     // Catch:{ all -> 0x00c7 }
            r5.A(r6, r7)     // Catch:{ all -> 0x00c7 }
            okhttp3.OkHttpClient r5 = r6.f10629a
            okhttp3.Dispatcher r5 = r5.f10585a
            r5.a(r4)
        L_0x00c4:
            int r2 = r2 + 1
            goto L_0x0074
        L_0x00c7:
            r0 = move-exception
            okhttp3.OkHttpClient r1 = r6.f10629a
            okhttp3.Dispatcher r1 = r1.f10585a
            r1.a(r4)
            throw r0
        L_0x00d0:
            monitor-exit(r14)     // Catch:{ all -> 0x009d }
            throw r0
        L_0x00d2:
            return
        L_0x00d3:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x005f }
        L_0x00d6:
            monitor-exit(r14)     // Catch:{ all -> 0x005f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Dispatcher.b():void");
    }
}
