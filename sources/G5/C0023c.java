package G5;

import I5.u;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x5.l;

/* renamed from: G5.c  reason: case insensitive filesystem */
public final class C0023c extends m0 {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f897q = AtomicReferenceFieldUpdater.newUpdater(C0023c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* renamed from: e  reason: collision with root package name */
    public final C0040l f898e;

    /* renamed from: f  reason: collision with root package name */
    public P f899f;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ C0027e f900p;

    public C0023c(C0027e eVar, C0040l lVar) {
        this.f900p = eVar;
        this.f898e = lVar;
    }

    public final void a(Throwable th) {
        C0040l lVar = this.f898e;
        if (th != null) {
            lVar.getClass();
            u C6 = lVar.C(new C0048u(false, th), (l) null);
            if (C6 != null) {
                lVar.d(C6);
                C0025d dVar = (C0025d) f897q.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0027e.f903b;
        C0027e eVar = this.f900p;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            I[] iArr = eVar.f904a;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (I completed : iArr) {
                arrayList.add(completed.getCompleted());
            }
            lVar.resumeWith(arrayList);
        }
    }
}
