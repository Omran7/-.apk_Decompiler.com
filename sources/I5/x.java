package I5;

import G5.V;
import G5.W;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.j;

public class x {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1285b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a  reason: collision with root package name */
    public V[] f1286a;

    public final void a(V v6) {
        v6.k((W) this);
        V[] vArr = this.f1286a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1285b;
        if (vArr == null) {
            vArr = new V[4];
            this.f1286a = vArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= vArr.length) {
            Object[] copyOf = Arrays.copyOf(vArr, atomicIntegerFieldUpdater.get(this) * 2);
            j.d(copyOf, "copyOf(...)");
            vArr = (V[]) copyOf;
            this.f1286a = vArr;
        }
        int i2 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i2 + 1);
        vArr[i2] = v6;
        v6.f886b = i2;
        c(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0060, code lost:
        if (r6.compareTo(r7) < 0) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final G5.V b(int r9) {
        /*
            r8 = this;
            G5.V[] r0 = r8.f1286a
            kotlin.jvm.internal.j.b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = f1285b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L_0x007a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + -1
            int r2 = r2 / 2
            if (r9 <= 0) goto L_0x003a
            r4 = r0[r9]
            kotlin.jvm.internal.j.b(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.j.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L_0x003a
            r8.d(r9, r2)
            r8.c(r2)
            goto L_0x007a
        L_0x003a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L_0x0045
            goto L_0x007a
        L_0x0045:
            G5.V[] r5 = r8.f1286a
            kotlin.jvm.internal.j.b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L_0x0063
            r6 = r5[r2]
            kotlin.jvm.internal.j.b(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.j.b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r2 = r4
        L_0x0064:
            r4 = r5[r9]
            kotlin.jvm.internal.j.b(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.j.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L_0x0075
            goto L_0x007a
        L_0x0075:
            r8.d(r9, r2)
            r9 = r2
            goto L_0x003a
        L_0x007a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.j.b(r9)
            r2 = 0
            r9.k(r2)
            r9.f886b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.x.b(int):G5.V");
    }

    public final void c(int i2) {
        while (i2 > 0) {
            V[] vArr = this.f1286a;
            j.b(vArr);
            int i5 = (i2 - 1) / 2;
            V v6 = vArr[i5];
            j.b(v6);
            V v7 = vArr[i2];
            j.b(v7);
            if (v6.compareTo(v7) > 0) {
                d(i2, i5);
                i2 = i5;
            } else {
                return;
            }
        }
    }

    public final void d(int i2, int i5) {
        V[] vArr = this.f1286a;
        j.b(vArr);
        V v6 = vArr[i5];
        j.b(v6);
        V v7 = vArr[i2];
        j.b(v7);
        vArr[i2] = v6;
        vArr[i5] = v7;
        v6.f886b = i2;
        v7.f886b = i5;
    }
}
