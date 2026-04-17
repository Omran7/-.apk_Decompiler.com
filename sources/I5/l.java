package I5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1269a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new n(8, false);

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b A[LOOP:1: B:7:0x001b->B:10:0x0026, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Runnable r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f1269a
            java.lang.Object r1 = r0.get(r4)
            I5.n r1 = (I5.n) r1
            int r2 = r1.a(r5)
            r3 = 1
            if (r2 == 0) goto L_0x0029
            if (r2 == r3) goto L_0x0017
            r0 = 2
            if (r2 == r0) goto L_0x0015
            goto L_0x0000
        L_0x0015:
            r5 = 0
            return r5
        L_0x0017:
            I5.n r2 = r1.c()
        L_0x001b:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L_0x0022
            goto L_0x0000
        L_0x0022:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L_0x001b
            goto L_0x0000
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.l.a(java.lang.Runnable):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0013 A[LOOP:1: B:4:0x0013->B:7:0x001e, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f1269a
            java.lang.Object r1 = r0.get(r4)
            I5.n r1 = (I5.n) r1
            boolean r2 = r1.b()
            if (r2 == 0) goto L_0x000f
            return
        L_0x000f:
            I5.n r2 = r1.c()
        L_0x0013:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L_0x001a
            goto L_0x0000
        L_0x001a:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L_0x0013
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.l.b():void");
    }

    public final int c() {
        n nVar = (n) f1269a.get(this);
        nVar.getClass();
        long j6 = n.f1272f.get(nVar);
        return (((int) ((j6 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j6))) & 1073741823;
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0015 A[LOOP:1: B:4:0x0015->B:7:0x0020, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d() {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f1269a
            java.lang.Object r1 = r0.get(r4)
            I5.n r1 = (I5.n) r1
            java.lang.Object r2 = r1.d()
            I5.u r3 = I5.n.g
            if (r2 == r3) goto L_0x0011
            return r2
        L_0x0011:
            I5.n r2 = r1.c()
        L_0x0015:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L_0x001c
            goto L_0x0000
        L_0x001c:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L_0x0015
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.l.d():java.lang.Object");
    }
}
