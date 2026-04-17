package o3;

import androidx.emoji2.text.g;
import n3.C0866g;
import v3.C1048c;
import v3.s;

public final class f extends g {
    public final s d;

    public f(e eVar, C0866g gVar, s sVar) {
        super(1, eVar, gVar);
        this.d = sVar;
    }

    public final g q(C1048c cVar) {
        C0866g gVar = (C0866g) this.f4931c;
        boolean isEmpty = gVar.isEmpty();
        s sVar = this.d;
        e eVar = (e) this.f4930b;
        if (isEmpty) {
            return new f(eVar, C0866g.d, sVar.l(cVar));
        }
        return new f(eVar, gVar.C(), sVar);
    }

    public final String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", new Object[]{(C0866g) this.f4931c, (e) this.f4930b, this.d});
    }
}
