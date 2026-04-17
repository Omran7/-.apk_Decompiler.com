package o3;

import androidx.emoji2.text.g;
import n3.C0866g;
import q3.e;
import q3.l;
import v3.C1048c;

public final class a extends g {
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final e f10440e;

    public a(C0866g gVar, e eVar, boolean z3) {
        super(3, e.d, gVar);
        this.f10440e = eVar;
        this.d = z3;
    }

    public final g q(C1048c cVar) {
        C0866g gVar = (C0866g) this.f4931c;
        boolean isEmpty = gVar.isEmpty();
        boolean z3 = this.d;
        e eVar = this.f10440e;
        if (!isEmpty) {
            l.b("operationForChild called for unrelated child.", gVar.z().equals(cVar));
            return new a(gVar.C(), eVar, z3);
        } else if (eVar.f11088a != null) {
            l.b("affectedTree should not have overlapping affected paths.", eVar.f11089b.isEmpty());
            return this;
        } else {
            return new a(C0866g.d, eVar.A(new C0866g(cVar)), z3);
        }
    }

    public final String toString() {
        return "AckUserWrite { path=" + ((C0866g) this.f4931c) + ", revert=" + this.d + ", affectedTree=" + this.f10440e + " }";
    }
}
