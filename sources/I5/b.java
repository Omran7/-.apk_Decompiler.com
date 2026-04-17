package I5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b extends p {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1249a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = a.f1244a;

    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1249a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        u uVar = a.f1244a;
        if (obj2 == uVar) {
            u c3 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == uVar) {
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c3)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            obj2 = atomicReferenceFieldUpdater.get(this);
                            break;
                        }
                    } else {
                        obj2 = c3;
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract u c(Object obj);
}
