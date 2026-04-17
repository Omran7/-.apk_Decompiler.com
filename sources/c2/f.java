package C2;

import B0.C0009h;
import C0.a;
import J2.d;
import O2.W;
import O2.X;
import O2.Y;
import O2.d0;
import O2.f0;
import O2.g0;
import com.google.crypto.tink.shaded.protobuf.C0396a;
import com.google.crypto.tink.shaded.protobuf.C0403h;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0408m;
import com.google.crypto.tink.shaded.protobuf.C0418x;
import com.google.crypto.tink.shaded.protobuf.D;
import h0.C0552a;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f437c = new f((Object) "ENABLED", 0);
    public static final f d = new f((Object) "DISABLED", 0);

    /* renamed from: e  reason: collision with root package name */
    public static final f f438e = new f((Object) "DESTROYED", 0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f439a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f440b;

    public /* synthetic */ f(Object obj, int i2) {
        this.f439a = i2;
        this.f440b = obj;
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
    public synchronized void a(O2.b0 r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x0024 }
            O2.Y r0 = C2.n.d(r2)     // Catch:{ all -> 0x001f }
            O2.r0 r2 = r2.C()     // Catch:{ all -> 0x001f }
            O2.f0 r2 = r1.b(r0, r2)     // Catch:{ all -> 0x001f }
            monitor-exit(r1)     // Catch:{ all -> 0x0024 }
            java.lang.Object r0 = r1.f440b     // Catch:{ all -> 0x0024 }
            O2.d0 r0 = (O2.d0) r0     // Catch:{ all -> 0x0024 }
            r0.e()     // Catch:{ all -> 0x0024 }
            com.google.crypto.tink.shaded.protobuf.x r0 = r0.f6859b     // Catch:{ all -> 0x0024 }
            O2.g0 r0 = (O2.g0) r0     // Catch:{ all -> 0x0024 }
            O2.g0.z(r0, r2)     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)
            return
        L_0x001f:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r2     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0024 }
            throw r2
        L_0x0024:
            r2 = move-exception
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.f.a(O2.b0):void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized O2.f0 b(O2.Y r4, O2.r0 r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            monitor-enter(r3)     // Catch:{ all -> 0x004c }
            int r0 = J2.t.a()     // Catch:{ all -> 0x0011 }
        L_0x0006:
            boolean r1 = r3.d(r0)     // Catch:{ all -> 0x0011 }
            if (r1 == 0) goto L_0x0013
            int r0 = J2.t.a()     // Catch:{ all -> 0x0011 }
            goto L_0x0006
        L_0x0011:
            r4 = move-exception
            goto L_0x0056
        L_0x0013:
            monitor-exit(r3)     // Catch:{ all -> 0x004c }
            O2.r0 r1 = O2.r0.UNKNOWN_PREFIX     // Catch:{ all -> 0x004c }
            if (r5 == r1) goto L_0x004e
            O2.e0 r1 = O2.f0.H()     // Catch:{ all -> 0x004c }
            r1.e()     // Catch:{ all -> 0x004c }
            com.google.crypto.tink.shaded.protobuf.x r2 = r1.f6859b     // Catch:{ all -> 0x004c }
            O2.f0 r2 = (O2.f0) r2     // Catch:{ all -> 0x004c }
            O2.f0.y(r2, r4)     // Catch:{ all -> 0x004c }
            r1.e()     // Catch:{ all -> 0x004c }
            com.google.crypto.tink.shaded.protobuf.x r4 = r1.f6859b     // Catch:{ all -> 0x004c }
            O2.f0 r4 = (O2.f0) r4     // Catch:{ all -> 0x004c }
            O2.f0.B(r4, r0)     // Catch:{ all -> 0x004c }
            r1.e()     // Catch:{ all -> 0x004c }
            com.google.crypto.tink.shaded.protobuf.x r4 = r1.f6859b     // Catch:{ all -> 0x004c }
            O2.f0 r4 = (O2.f0) r4     // Catch:{ all -> 0x004c }
            O2.f0.A(r4)     // Catch:{ all -> 0x004c }
            r1.e()     // Catch:{ all -> 0x004c }
            com.google.crypto.tink.shaded.protobuf.x r4 = r1.f6859b     // Catch:{ all -> 0x004c }
            O2.f0 r4 = (O2.f0) r4     // Catch:{ all -> 0x004c }
            O2.f0.z(r4, r5)     // Catch:{ all -> 0x004c }
            com.google.crypto.tink.shaded.protobuf.x r4 = r1.b()     // Catch:{ all -> 0x004c }
            O2.f0 r4 = (O2.f0) r4     // Catch:{ all -> 0x004c }
            monitor-exit(r3)
            return r4
        L_0x004c:
            r4 = move-exception
            goto L_0x0058
        L_0x004e:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x004c }
            java.lang.String r5 = "unknown output prefix type"
            r4.<init>(r5)     // Catch:{ all -> 0x004c }
            throw r4     // Catch:{ all -> 0x004c }
        L_0x0056:
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            throw r4     // Catch:{ all -> 0x004c }
        L_0x0058:
            monitor-exit(r3)     // Catch:{ all -> 0x004c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.f.b(O2.Y, O2.r0):O2.f0");
    }

    public synchronized C0009h c() {
        return C0009h.u((g0) ((d0) this.f440b).b());
    }

    public synchronized boolean d(int i2) {
        for (f0 D4 : Collections.unmodifiableList(((g0) ((d0) this.f440b).f6859b).C())) {
            if (D4.D() == i2) {
                return true;
            }
        }
        return false;
    }

    public Y e(C0404i iVar) {
        C0396a i2;
        d dVar = (d) this.f440b;
        try {
            a d6 = dVar.d();
            C0396a m6 = d6.m(iVar);
            d6.n(m6);
            i2 = d6.i(m6);
            W F = Y.F();
            String b6 = dVar.b();
            F.e();
            Y.y((Y) F.f6859b, b6);
            int b7 = ((C0418x) i2).b((com.google.crypto.tink.shaded.protobuf.d0) null);
            byte[] bArr = new byte[b7];
            C0408m mVar = new C0408m(bArr, b7);
            i2.f(mVar);
            if (mVar.f6836r - mVar.f6837s == 0) {
                C0403h hVar = new C0403h(bArr);
                F.e();
                Y.z((Y) F.f6859b, hVar);
                X e6 = dVar.e();
                F.e();
                Y.A((Y) F.f6859b, e6);
                return (Y) F.b();
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e7) {
            throw new RuntimeException(i2.c("ByteString"), e7);
        } catch (D e8) {
            throw new GeneralSecurityException("Unexpected proto", e8);
        }
    }

    public String toString() {
        switch (this.f439a) {
            case 0:
                return (String) this.f440b;
            default:
                return super.toString();
        }
    }

    public f(d dVar, Class cls) {
        this.f439a = 2;
        if (dVar.f1300b.keySet().contains(cls) || Void.class.equals(cls)) {
            this.f440b = dVar;
            return;
        }
        throw new IllegalArgumentException(C0552a.p("Given internalKeyMananger ", dVar.toString(), " does not support primitive class ", cls.getName()));
    }
}
