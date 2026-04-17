package p;

import android.support.v4.media.session.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: p.e  reason: case insensitive filesystem */
public final class C0902e extends a {

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10949b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10950c;
    public final AtomicReferenceFieldUpdater d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10951e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10952f;

    public C0902e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f10949b = atomicReferenceFieldUpdater;
        this.f10950c = atomicReferenceFieldUpdater2;
        this.d = atomicReferenceFieldUpdater3;
        this.f10951e = atomicReferenceFieldUpdater4;
        this.f10952f = atomicReferenceFieldUpdater5;
    }

    public final boolean d(h hVar, C0901d dVar, C0901d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f10951e;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == dVar);
        return false;
    }

    public final boolean e(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f10952f;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    public final boolean f(h hVar, C0904g gVar, C0904g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    public final void r0(C0904g gVar, C0904g gVar2) {
        this.f10950c.lazySet(gVar, gVar2);
    }

    public final void s0(C0904g gVar, Thread thread) {
        this.f10949b.lazySet(gVar, thread);
    }
}
