package I5;

import G5.C0019a;
import G5.F;
import R2.b;
import o5.i;
import q5.d;
import x5.l;

public class s extends C0019a implements d {
    public final o5.d d;

    public s(i iVar, o5.d dVar) {
        super(iVar, true);
        this.d = dVar;
    }

    public void f(Object obj) {
        a.e(b.h0(this.d), F.r(obj), (l) null);
    }

    public void g(Object obj) {
        this.d.resumeWith(F.r(obj));
    }

    public final d getCallerFrame() {
        o5.d dVar = this.d;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final boolean z() {
        return true;
    }
}
