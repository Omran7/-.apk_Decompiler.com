package o3;

import androidx.emoji2.text.g;
import n3.C0866g;
import q3.l;
import v3.C1048c;

public final class b extends g {
    public b(e eVar, C0866g gVar) {
        super(4, eVar, gVar);
        boolean z3;
        if (eVar.f10442a == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        l.b("Can't have a listen complete from a user source", !z3);
    }

    public final g q(C1048c cVar) {
        C0866g gVar = (C0866g) this.f4931c;
        boolean isEmpty = gVar.isEmpty();
        e eVar = (e) this.f4930b;
        if (isEmpty) {
            return new b(eVar, C0866g.d);
        }
        return new b(eVar, gVar.C());
    }

    public final String toString() {
        return "ListenComplete { path=" + ((C0866g) this.f4931c) + ", source=" + ((e) this.f4930b) + " }";
    }
}
