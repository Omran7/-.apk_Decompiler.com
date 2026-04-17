package I5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1251a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1252b;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Class<d> cls = d.class;
        Class<Object> cls2 = Object.class;
        f1251a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next$volatile");
        f1252b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev$volatile");
    }

    public d(t tVar) {
        this._prev$volatile = tVar;
    }

    public abstract boolean b();

    public final void c() {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        d dVar5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1251a;
        Object obj = atomicReferenceFieldUpdater.get(this);
        u uVar = a.f1245b;
        if (obj == uVar) {
            dVar = null;
        } else {
            dVar = (d) obj;
        }
        if (dVar != null) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1252b;
                d dVar6 = (d) atomicReferenceFieldUpdater2.get(this);
                while (dVar6 != null && dVar6.b()) {
                    dVar6 = (d) atomicReferenceFieldUpdater2.get(dVar6);
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 == uVar) {
                    dVar2 = null;
                } else {
                    dVar2 = (d) obj2;
                }
                j.b(dVar2);
                while (dVar2.b()) {
                    Object obj3 = atomicReferenceFieldUpdater.get(dVar2);
                    if (obj3 == uVar) {
                        dVar5 = null;
                    } else {
                        dVar5 = (d) obj3;
                    }
                    if (dVar5 == null) {
                        break;
                    }
                    dVar2 = dVar5;
                }
                while (true) {
                    Object obj4 = atomicReferenceFieldUpdater2.get(dVar2);
                    if (((d) obj4) == null) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar6;
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(dVar2, obj4, dVar3)) {
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(dVar2) != obj4) {
                        }
                    }
                }
                if (dVar6 != null) {
                    atomicReferenceFieldUpdater.set(dVar6, dVar2);
                }
                if (dVar2.b()) {
                    Object obj5 = atomicReferenceFieldUpdater.get(dVar2);
                    if (obj5 == uVar) {
                        dVar4 = null;
                    } else {
                        dVar4 = (d) obj5;
                    }
                    if (dVar4 != null) {
                        continue;
                    }
                }
                if (dVar6 == null || !dVar6.b()) {
                    return;
                }
            }
        }
    }
}
