package T1;

public final class G {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f2831f = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f2832a;

    /* renamed from: b  reason: collision with root package name */
    public final F f2833b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2834c;
    public final Object d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f2835e = null;

    public /* synthetic */ G(String str, Object obj, F f6) {
        this.f2832a = str;
        this.f2834c = obj;
        this.f2833b = f6;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0046 */
    public final java.lang.Object a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.d
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            s2.e r4 = T1.K0.f2981k
            if (r4 != 0) goto L_0x000e
            java.lang.Object r4 = r3.f2834c
            return r4
        L_0x000e:
            java.lang.Object r4 = f2831f
            monitor-enter(r4)
            boolean r0 = s2.e.n()     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r3.f2835e     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x0020
            java.lang.Object r0 = r3.f2834c     // Catch:{ all -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r0 = move-exception
            goto L_0x0064
        L_0x0020:
            java.lang.Object r0 = r3.f2835e     // Catch:{ all -> 0x001e }
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            goto L_0x0063
        L_0x0024:
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            java.util.List r4 = T1.H.f2892a     // Catch:{ SecurityException -> 0x0058 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0058 }
        L_0x002b:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0058 }
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0058 }
            T1.G r0 = (T1.G) r0     // Catch:{ SecurityException -> 0x0058 }
            boolean r1 = s2.e.n()     // Catch:{ SecurityException -> 0x0058 }
            if (r1 != 0) goto L_0x0050
            r1 = 0
            T1.F r2 = r0.f2833b     // Catch:{ IllegalStateException -> 0x0046 }
            if (r2 == 0) goto L_0x0046
            java.lang.Object r1 = r2.zza()     // Catch:{ IllegalStateException -> 0x0046 }
        L_0x0046:
            java.lang.Object r2 = f2831f     // Catch:{ SecurityException -> 0x0058 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0058 }
            r0.f2835e = r1     // Catch:{ all -> 0x004d }
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            goto L_0x002b
        L_0x004d:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0050:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0058 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0058 }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0058:
            T1.F r4 = r3.f2833b
            if (r4 != 0) goto L_0x005f
        L_0x005c:
            java.lang.Object r0 = r3.f2834c
            goto L_0x0063
        L_0x005f:
            java.lang.Object r0 = r4.zza()     // Catch:{ IllegalStateException | SecurityException -> 0x005c }
        L_0x0063:
            return r0
        L_0x0064:
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            throw r0
        L_0x0066:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.G.a(java.lang.Object):java.lang.Object");
    }
}
