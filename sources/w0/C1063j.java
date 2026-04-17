package w0;

import android.content.ServiceConnection;
import q4.C0938b;

/* renamed from: w0.j  reason: case insensitive filesystem */
public final class C1063j implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final C0938b f12378a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1054a f12379b;

    public /* synthetic */ C1063j(C1054a aVar, C0938b bVar) {
        this.f12379b = aVar;
        this.f12378a = bVar;
    }

    public final void a(C1056c cVar) {
        synchronized (this.f12379b.f12334a) {
            try {
                if (this.f12379b.f12335b != 3) {
                    this.f12378a.a(cVar);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onBindingDied(android.content.ComponentName r5) {
        /*
            r4 = this;
            java.lang.String r5 = "BillingClient"
            java.lang.String r0 = "Billing service died."
            com.google.android.gms.internal.play_billing.zze.zzl(r5, r0)
            r5 = 0
            w0.a r0 = r4.f12379b     // Catch:{ all -> 0x0039 }
            java.lang.Object r1 = r0.f12334a     // Catch:{ all -> 0x0039 }
            monitor-enter(r1)     // Catch:{ all -> 0x0039 }
            int r0 = r0.f12335b     // Catch:{ all -> 0x006b }
            r2 = 1
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r2 = r5
        L_0x0014:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x003b
            w0.a r0 = r4.f12379b     // Catch:{ all -> 0x0039 }
            m0.a0 r0 = r0.g     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.play_billing.zzjx r1 = com.google.android.gms.internal.play_billing.zzjz.zzc()     // Catch:{ all -> 0x0039 }
            r2 = 6
            r1.zzn(r2)     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.play_billing.zzke r2 = com.google.android.gms.internal.play_billing.zzki.zzc()     // Catch:{ all -> 0x0039 }
            r3 = 122(0x7a, float:1.71E-43)
            r2.zzo(r3)     // Catch:{ all -> 0x0039 }
            r1.zza(r2)     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.play_billing.zzhk r1 = r1.zzf()     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.play_billing.zzjz r1 = (com.google.android.gms.internal.play_billing.zzjz) r1     // Catch:{ all -> 0x0039 }
            r0.y(r1)     // Catch:{ all -> 0x0039 }
            goto L_0x0075
        L_0x0039:
            r0 = move-exception
            goto L_0x006e
        L_0x003b:
            w0.a r0 = r4.f12379b     // Catch:{ all -> 0x0039 }
            m0.a0 r0 = r0.g     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.play_billing.zzkl r1 = com.google.android.gms.internal.play_billing.zzkl.zzB()     // Catch:{ all -> 0x0039 }
            r0.getClass()     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.play_billing.zzli r2 = com.google.android.gms.internal.play_billing.zzlk.zzc()     // Catch:{ all -> 0x0062 }
            java.lang.Object r3 = r0.f9925b     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.play_billing.zzku r3 = (com.google.android.gms.internal.play_billing.zzku) r3     // Catch:{ all -> 0x0062 }
            r2.zzo(r3)     // Catch:{ all -> 0x0062 }
            r2.zzn(r1)     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.play_billing.zzhk r1 = r2.zzf()     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.play_billing.zzlk r1 = (com.google.android.gms.internal.play_billing.zzlk) r1     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r0.f9926c     // Catch:{ all -> 0x0062 }
            B0.H r0 = (B0.H) r0     // Catch:{ all -> 0x0062 }
            r0.h(r1)     // Catch:{ all -> 0x0062 }
            goto L_0x0075
        L_0x0062:
            r0 = move-exception
            java.lang.String r1 = "BillingLogger"
            java.lang.String r2 = "Unable to log."
            com.google.android.gms.internal.play_billing.zze.zzm(r1, r2, r0)     // Catch:{ all -> 0x0039 }
            goto L_0x0075
        L_0x006b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x006e:
            java.lang.String r1 = "BillingClient"
            java.lang.String r2 = "Unable to log."
            com.google.android.gms.internal.play_billing.zze.zzm(r1, r2, r0)
        L_0x0075:
            w0.a r0 = r4.f12379b
            java.lang.Object r0 = r0.f12334a
            monitor-enter(r0)
            w0.a r1 = r4.f12379b     // Catch:{ all -> 0x0094 }
            int r1 = r1.f12335b     // Catch:{ all -> 0x0094 }
            r2 = 3
            if (r1 == r2) goto L_0x0096
            w0.a r1 = r4.f12379b     // Catch:{ all -> 0x0094 }
            int r1 = r1.f12335b     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x0088
            goto L_0x0096
        L_0x0088:
            w0.a r1 = r4.f12379b     // Catch:{ all -> 0x0094 }
            r1.m(r5)     // Catch:{ all -> 0x0094 }
            w0.a r5 = r4.f12379b     // Catch:{ all -> 0x0094 }
            r5.n()     // Catch:{ all -> 0x0094 }
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            return
        L_0x0094:
            r5 = move-exception
            goto L_0x0098
        L_0x0096:
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            return
        L_0x0098:
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.C1063j.onBindingDied(android.content.ComponentName):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r7 = r6.f12379b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (w0.C1054a.f(new T1.C0186l0(r6, 3), 30000, new k.C0737s0(r6, 15), r7.r(), r7.j()) != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        r7 = r6.f12379b;
        r8 = r7.g();
        r7.t(25, 6, r8);
        a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r7, android.os.IBinder r8) {
        /*
            r6 = this;
            java.lang.String r7 = "BillingClient"
            java.lang.String r0 = "Billing service connected."
            com.google.android.gms.internal.play_billing.zze.zzk(r7, r0)
            w0.a r7 = r6.f12379b
            java.lang.Object r7 = r7.f12334a
            monitor-enter(r7)
            w0.a r0 = r6.f12379b     // Catch:{ all -> 0x0015 }
            int r0 = r0.f12335b     // Catch:{ all -> 0x0015 }
            r1 = 3
            if (r0 != r1) goto L_0x0017
            monitor-exit(r7)     // Catch:{ all -> 0x0015 }
            return
        L_0x0015:
            r8 = move-exception
            goto L_0x004f
        L_0x0017:
            w0.a r0 = r6.f12379b     // Catch:{ all -> 0x0015 }
            com.google.android.gms.internal.play_billing.zzan r8 = com.google.android.gms.internal.play_billing.zzam.zzu(r8)     // Catch:{ all -> 0x0015 }
            r0.h = r8     // Catch:{ all -> 0x0015 }
            monitor-exit(r7)     // Catch:{ all -> 0x0015 }
            w0.a r7 = r6.f12379b
            T1.l0 r0 = new T1.l0
            r8 = 3
            r0.<init>(r6, r8)
            k.s0 r3 = new k.s0
            r8 = 15
            r3.<init>(r6, r8)
            android.os.Handler r4 = r7.r()
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.ExecutorService r5 = r7.j()
            java.util.concurrent.Future r7 = w0.C1054a.f(r0, r1, r3, r4, r5)
            if (r7 != 0) goto L_0x004e
            w0.a r7 = r6.f12379b
            w0.c r8 = r7.g()
            r0 = 6
            r1 = 25
            r7.t(r1, r0, r8)
            r6.a(r8)
        L_0x004e:
            return
        L_0x004f:
            monitor-exit(r7)     // Catch:{ all -> 0x0015 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.C1063j.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onServiceDisconnected(android.content.ComponentName r5) {
        /*
            r4 = this;
            java.lang.String r5 = "BillingClient"
            java.lang.String r0 = "Billing service disconnected."
            com.google.android.gms.internal.play_billing.zze.zzl(r5, r0)
            r5 = 0
            w0.a r0 = r4.f12379b     // Catch:{ all -> 0x0039 }
            java.lang.Object r1 = r0.f12334a     // Catch:{ all -> 0x0039 }
            monitor-enter(r1)     // Catch:{ all -> 0x0039 }
            int r0 = r0.f12335b     // Catch:{ all -> 0x006e }
            r2 = 1
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r2 = r5
        L_0x0014:
            monitor-exit(r1)     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x003b
            w0.a r0 = r4.f12379b     // Catch:{ all -> 0x0039 }
            m0.a0 r0 = r0.g     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.play_billing.zzjx r1 = com.google.android.gms.internal.play_billing.zzjz.zzc()     // Catch:{ all -> 0x0039 }
            r2 = 6
            r1.zzn(r2)     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.play_billing.zzke r2 = com.google.android.gms.internal.play_billing.zzki.zzc()     // Catch:{ all -> 0x0039 }
            r3 = 121(0x79, float:1.7E-43)
            r2.zzo(r3)     // Catch:{ all -> 0x0039 }
            r1.zza(r2)     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.play_billing.zzhk r1 = r1.zzf()     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.play_billing.zzjz r1 = (com.google.android.gms.internal.play_billing.zzjz) r1     // Catch:{ all -> 0x0039 }
            r0.y(r1)     // Catch:{ all -> 0x0039 }
            goto L_0x0078
        L_0x0039:
            r0 = move-exception
            goto L_0x0071
        L_0x003b:
            w0.a r0 = r4.f12379b     // Catch:{ all -> 0x0039 }
            m0.a0 r0 = r0.g     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.play_billing.zzlu r1 = com.google.android.gms.internal.play_billing.zzlu.zzB()     // Catch:{ all -> 0x0039 }
            r0.getClass()     // Catch:{ all -> 0x0039 }
            if (r1 != 0) goto L_0x0049
            goto L_0x0078
        L_0x0049:
            com.google.android.gms.internal.play_billing.zzli r2 = com.google.android.gms.internal.play_billing.zzlk.zzc()     // Catch:{ all -> 0x0065 }
            java.lang.Object r3 = r0.f9925b     // Catch:{ all -> 0x0065 }
            com.google.android.gms.internal.play_billing.zzku r3 = (com.google.android.gms.internal.play_billing.zzku) r3     // Catch:{ all -> 0x0065 }
            r2.zzo(r3)     // Catch:{ all -> 0x0065 }
            r2.zzq(r1)     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = r0.f9926c     // Catch:{ all -> 0x0065 }
            B0.H r0 = (B0.H) r0     // Catch:{ all -> 0x0065 }
            com.google.android.gms.internal.play_billing.zzhk r1 = r2.zzf()     // Catch:{ all -> 0x0065 }
            com.google.android.gms.internal.play_billing.zzlk r1 = (com.google.android.gms.internal.play_billing.zzlk) r1     // Catch:{ all -> 0x0065 }
            r0.h(r1)     // Catch:{ all -> 0x0065 }
            goto L_0x0078
        L_0x0065:
            r0 = move-exception
            java.lang.String r1 = "BillingLogger"
            java.lang.String r2 = "Unable to log."
            com.google.android.gms.internal.play_billing.zze.zzm(r1, r2, r0)     // Catch:{ all -> 0x0039 }
            goto L_0x0078
        L_0x006e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0071:
            java.lang.String r1 = "BillingClient"
            java.lang.String r2 = "Unable to log."
            com.google.android.gms.internal.play_billing.zze.zzm(r1, r2, r0)
        L_0x0078:
            w0.a r0 = r4.f12379b
            java.lang.Object r0 = r0.f12334a
            monitor-enter(r0)
            w0.a r1 = r4.f12379b     // Catch:{ all -> 0x0086 }
            int r1 = r1.f12335b     // Catch:{ all -> 0x0086 }
            r2 = 3
            if (r1 != r2) goto L_0x0088
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            return
        L_0x0086:
            r5 = move-exception
            goto L_0x008f
        L_0x0088:
            w0.a r1 = r4.f12379b     // Catch:{ all -> 0x0086 }
            r1.m(r5)     // Catch:{ all -> 0x0086 }
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            return
        L_0x008f:
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.C1063j.onServiceDisconnected(android.content.ComponentName):void");
    }
}
