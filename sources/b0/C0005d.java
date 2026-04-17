package B0;

import U0.g;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: B0.d  reason: case insensitive filesystem */
public final class C0005d extends WeakReference {

    /* renamed from: a  reason: collision with root package name */
    public final v f213a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f214b;

    /* renamed from: c  reason: collision with root package name */
    public D f215c = null;

    public C0005d(v vVar, w wVar, ReferenceQueue referenceQueue) {
        super(wVar, referenceQueue);
        g.c(vVar, "Argument must not be null");
        this.f213a = vVar;
        boolean z3 = wVar.f325a;
        this.f214b = z3;
    }
}
