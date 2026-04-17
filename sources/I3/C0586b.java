package i3;

import T1.C0208t;
import java.util.Iterator;

/* renamed from: i3.b  reason: case insensitive filesystem */
public final class C0586b implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Iterator f8276a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0587c f8277b;

    public C0586b(C0587c cVar, Iterator it2) {
        this.f8277b = cVar;
        this.f8276a = it2;
    }

    public final Iterator iterator() {
        return new C0208t(this, 3);
    }
}
