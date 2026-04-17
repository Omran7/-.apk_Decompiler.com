package Z3;

import h4.C0566a;
import h4.C0567b;

public final class c extends p {

    /* renamed from: a  reason: collision with root package name */
    public p f4519a;

    public final Object a(C0566a aVar) {
        p pVar = this.f4519a;
        if (pVar != null) {
            return pVar.a(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    public final void b(C0567b bVar, Object obj) {
        p pVar = this.f4519a;
        if (pVar != null) {
            pVar.b(bVar, obj);
            return;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
