package L3;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1714a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f1715b;

    public /* synthetic */ c(d dVar, int i2) {
        this.f1714a = i2;
        this.f1715b = dVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f1714a
            switch(r0) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x000b;
                default: goto L_0x0005;
            }
        L_0x0005:
            L3.d r0 = r8.f1715b
            r0.a()
            return
        L_0x000b:
            L3.d r0 = r8.f1715b
            r0.getClass()
            java.lang.Object r1 = L3.d.f1716m
            monitor-enter(r1)
            R2.i r2 = r0.f1717a     // Catch:{ all -> 0x002a }
            r2.b()     // Catch:{ all -> 0x002a }
            android.content.Context r2 = r2.f2490a     // Catch:{ all -> 0x002a }
            I3.h r2 = I3.h.b(r2)     // Catch:{ all -> 0x002a }
            I3.h r3 = r0.f1719c     // Catch:{ all -> 0x00e1 }
            M3.b r3 = r3.F()     // Catch:{ all -> 0x00e1 }
            if (r2 == 0) goto L_0x002d
            r2.J()     // Catch:{ all -> 0x002a }
            goto L_0x002d
        L_0x002a:
            r0 = move-exception
            goto L_0x00e8
        L_0x002d:
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            int r2 = r3.f1830b     // Catch:{ f -> 0x004e }
            r4 = 0
            r5 = 5
            r6 = 1
            if (r2 != r5) goto L_0x0037
            r7 = r6
            goto L_0x0038
        L_0x0037:
            r7 = r4
        L_0x0038:
            if (r7 != 0) goto L_0x0051
            r7 = 3
            if (r2 != r7) goto L_0x003e
            r4 = r6
        L_0x003e:
            if (r4 == 0) goto L_0x0041
            goto L_0x0051
        L_0x0041:
            L3.k r2 = r0.d     // Catch:{ f -> 0x004e }
            boolean r2 = r2.a(r3)     // Catch:{ f -> 0x004e }
            if (r2 == 0) goto L_0x00e0
            M3.b r2 = r0.b(r3)     // Catch:{ f -> 0x004e }
            goto L_0x0055
        L_0x004e:
            r1 = move-exception
            goto L_0x00dd
        L_0x0051:
            M3.b r2 = r0.g(r3)     // Catch:{ f -> 0x004e }
        L_0x0055:
            monitor-enter(r1)
            R2.i r4 = r0.f1717a     // Catch:{ all -> 0x006c }
            r4.b()     // Catch:{ all -> 0x006c }
            android.content.Context r4 = r4.f2490a     // Catch:{ all -> 0x006c }
            I3.h r4 = I3.h.b(r4)     // Catch:{ all -> 0x006c }
            I3.h r7 = r0.f1719c     // Catch:{ all -> 0x00d4 }
            r7.t(r2)     // Catch:{ all -> 0x00d4 }
            if (r4 == 0) goto L_0x006f
            r4.J()     // Catch:{ all -> 0x006c }
            goto L_0x006f
        L_0x006c:
            r0 = move-exception
            goto L_0x00db
        L_0x006f:
            monitor-exit(r1)     // Catch:{ all -> 0x006c }
            monitor-enter(r0)
            java.util.HashSet r1 = r0.f1724k     // Catch:{ all -> 0x0098 }
            int r1 = r1.size()     // Catch:{ all -> 0x0098 }
            if (r1 == 0) goto L_0x00a0
            java.lang.String r1 = r3.f1829a     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = r2.f1829a     // Catch:{ all -> 0x0098 }
            boolean r1 = android.text.TextUtils.equals(r1, r3)     // Catch:{ all -> 0x0098 }
            if (r1 != 0) goto L_0x00a0
            java.util.HashSet r1 = r0.f1724k     // Catch:{ all -> 0x0098 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0098 }
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0098 }
            if (r3 != 0) goto L_0x0090
            goto L_0x00a0
        L_0x0090:
            java.lang.Object r1 = r1.next()     // Catch:{ all -> 0x0098 }
            if (r1 != 0) goto L_0x009a
            r1 = 0
            throw r1     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r1 = move-exception
            goto L_0x00d2
        L_0x009a:
            java.lang.ClassCastException r1 = new java.lang.ClassCastException     // Catch:{ all -> 0x0098 }
            r1.<init>()     // Catch:{ all -> 0x0098 }
            throw r1     // Catch:{ all -> 0x0098 }
        L_0x00a0:
            monitor-exit(r0)
            r1 = 4
            int r3 = r2.f1830b
            if (r3 != r1) goto L_0x00b0
            java.lang.String r1 = r2.f1829a
            monitor-enter(r0)
            r0.f1723j = r1     // Catch:{ all -> 0x00ad }
            monitor-exit(r0)
            goto L_0x00b0
        L_0x00ad:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            throw r1
        L_0x00b0:
            int r1 = r2.f1830b
            if (r1 != r5) goto L_0x00bd
            L3.f r1 = new L3.f
            r1.<init>()
            r0.h(r1)
            goto L_0x00e0
        L_0x00bd:
            r3 = 2
            if (r1 == r3) goto L_0x00c7
            if (r1 != r6) goto L_0x00c3
            goto L_0x00c7
        L_0x00c3:
            r0.i(r2)
            goto L_0x00e0
        L_0x00c7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r0.h(r1)
            goto L_0x00e0
        L_0x00d2:
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            throw r1
        L_0x00d4:
            r0 = move-exception
            if (r4 == 0) goto L_0x00da
            r4.J()     // Catch:{ all -> 0x006c }
        L_0x00da:
            throw r0     // Catch:{ all -> 0x006c }
        L_0x00db:
            monitor-exit(r1)     // Catch:{ all -> 0x006c }
            throw r0
        L_0x00dd:
            r0.h(r1)
        L_0x00e0:
            return
        L_0x00e1:
            r0 = move-exception
            if (r2 == 0) goto L_0x00e7
            r2.J()     // Catch:{ all -> 0x002a }
        L_0x00e7:
            throw r0     // Catch:{ all -> 0x002a }
        L_0x00e8:
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x00ea:
            L3.d r0 = r8.f1715b
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.c.run():void");
    }
}
