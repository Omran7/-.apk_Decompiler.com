package K5;

import G5.A;
import G5.Z;
import java.util.concurrent.Executor;
import o5.i;
import o5.j;

public final class d extends Z implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public static final d f1671c = new A();
    public static final A d;

    /* JADX WARNING: type inference failed for: r0v0, types: [G5.A, K5.d] */
    /* JADX WARNING: type inference failed for: r2v3, types: [I5.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            K5.d r0 = new K5.d
            r0.<init>()
            f1671c = r0
            K5.l r0 = K5.l.f1682c
            int r1 = I5.v.f1281a
            r2 = 64
            if (r2 >= r1) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r1 = r2
        L_0x0011:
            r2 = 12
            java.lang.String r3 = "kotlinx.coroutines.io.parallelism"
            r4 = 0
            int r1 = I5.a.h(r3, r1, r4, r4, r2)
            r0.getClass()
            java.lang.String r2 = "Expected positive parallelism level, but got "
            r3 = 1
            if (r1 < r3) goto L_0x0040
            int r4 = K5.k.d
            if (r1 < r4) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            if (r1 < r3) goto L_0x0032
            I5.i r2 = new I5.i
            r2.<init>(r0, r1)
            r0 = r2
        L_0x002f:
            d = r0
            return
        L_0x0032:
            java.lang.String r0 = com.google.android.gms.internal.measurement.a.f(r1, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0040:
            java.lang.String r0 = com.google.android.gms.internal.measurement.a.f(r1, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.d.<clinit>():void");
    }

    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    public final void execute(Runnable runnable) {
        j(j.f10479a, runnable);
    }

    public final void j(i iVar, Runnable runnable) {
        d.j(iVar, runnable);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
