package E5;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f653a;

    public a(d dVar) {
        this.f653a = new AtomicReference(dVar);
    }

    public final Iterator iterator() {
        d dVar = (d) this.f653a.getAndSet((Object) null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
