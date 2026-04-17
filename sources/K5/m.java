package K5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1683b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1684c;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1685e;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray f1686a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Class<m> cls = m.class;
        f1683b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask$volatile");
        f1684c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex$volatile");
        d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex$volatile");
        f1685e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer$volatile");
    }

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1684c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f1675b.f1464a == 1) {
            f1685e.incrementAndGet(this);
        }
        int i2 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f1686a;
            if (atomicReferenceArray.get(i2) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i2, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final i b() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 - f1684c.get(this) == 0) {
                return null;
            }
            int i5 = i2 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 + 1) && (iVar = (i) this.f1686a.getAndSet(i5, (Object) null)) != null) {
                if (iVar.f1675b.f1464a == 1) {
                    f1685e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i c(int i2, boolean z3) {
        int i5 = i2 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f1686a;
        i iVar = (i) atomicReferenceArray.get(i5);
        if (iVar != null) {
            boolean z4 = true;
            if (iVar.f1675b.f1464a != 1) {
                z4 = false;
            }
            if (z4 == z3) {
                while (!atomicReferenceArray.compareAndSet(i5, iVar, (Object) null)) {
                    if (atomicReferenceArray.get(i5) != iVar) {
                    }
                }
                if (z3) {
                    f1685e.decrementAndGet(this);
                }
                return iVar;
            }
        }
        return null;
    }
}
