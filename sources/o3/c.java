package o3;

import androidx.emoji2.text.g;
import n3.C0861b;
import n3.C0866g;
import q3.e;
import v3.C1048c;
import v3.s;

public final class c extends g {
    public final C0861b d;

    public c(e eVar, C0866g gVar, C0861b bVar) {
        super(2, eVar, gVar);
        this.d = bVar;
    }

    public final g q(C1048c cVar) {
        C0866g gVar = (C0866g) this.f4931c;
        boolean isEmpty = gVar.isEmpty();
        C0861b bVar = this.d;
        e eVar = (e) this.f4930b;
        if (isEmpty) {
            C0861b x6 = bVar.x(new C0866g(cVar));
            e eVar2 = x6.f10258a;
            if (eVar2.isEmpty()) {
                return null;
            }
            Object obj = eVar2.f11088a;
            if (((s) obj) != null) {
                return new f(eVar, C0866g.d, (s) obj);
            }
            return new c(eVar, C0866g.d, x6);
        } else if (gVar.z().equals(cVar)) {
            return new c(eVar, gVar.C(), bVar);
        } else {
            return null;
        }
    }

    public final String toString() {
        return "Merge { path=" + ((C0866g) this.f4931c) + ", source=" + ((e) this.f4930b) + ", children=" + this.d + " }";
    }
}
