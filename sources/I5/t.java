package I5;

import G5.y0;
import M5.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class t extends d implements y0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers$volatile");

    /* renamed from: c  reason: collision with root package name */
    public final long f1278c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public t(long j6, k kVar, int i2) {
        super(kVar);
        this.f1278c = j6;
        this.cleanedAndPointers$volatile = i2 << 16;
    }

    public final boolean b() {
        d dVar;
        if (d.get(this) == e()) {
            Object obj = d.f1251a.get(this);
            if (obj == a.f1245b) {
                dVar = null;
            } else {
                dVar = (d) obj;
            }
            if (dVar == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean d() {
        d dVar;
        if (d.addAndGet(this, -65536) == e()) {
            Object obj = d.f1251a.get(this);
            if (obj == a.f1245b) {
                dVar = null;
            } else {
                dVar = (d) obj;
            }
            if (dVar == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public abstract int e();

    public abstract void f(int i2);

    public final boolean g() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        d dVar;
        do {
            atomicIntegerFieldUpdater = d;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == e()) {
                Object obj = d.f1251a.get(this);
                if (obj == a.f1245b) {
                    dVar = null;
                } else {
                    dVar = (d) obj;
                }
                if (dVar != null) {
                    return false;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
