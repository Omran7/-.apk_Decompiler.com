package v3;

import java.util.Collections;
import java.util.Iterator;
import k3.C0762b;
import k3.c;
import n3.C0866g;

public final class k extends C1051f {

    /* renamed from: e  reason: collision with root package name */
    public static final k f12295e = new C1051f();

    public final boolean d(C1048c cVar) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (!sVar.isEmpty() || !equals(sVar.c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String g(int i2) {
        return "";
    }

    public final Object getValue() {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final int i() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Iterator iterator() {
        return Collections.emptyList().iterator();
    }

    /* renamed from: k */
    public final int compareTo(s sVar) {
        if (sVar.isEmpty()) {
            return 0;
        }
        return -1;
    }

    public final Object o(boolean z3) {
        return null;
    }

    public final C1048c p(C1048c cVar) {
        return null;
    }

    public final s q(C0866g gVar, s sVar) {
        if (gVar.isEmpty()) {
            return sVar;
        }
        return r(gVar.z(), q(gVar.C(), sVar));
    }

    public final s r(C1048c cVar, s sVar) {
        if (sVar.isEmpty()) {
            return this;
        }
        C1048c cVar2 = C1048c.d;
        if (cVar.equals(cVar2)) {
            return this;
        }
        C0762b bVar = new C0762b(C1051f.d);
        boolean equals = cVar.equals(cVar2);
        k kVar = f12295e;
        if (!equals) {
            boolean k6 = bVar.k(cVar);
            c cVar3 = bVar;
            if (k6) {
                cVar3 = bVar.B(cVar);
            }
            c cVar4 = cVar3;
            if (!sVar.isEmpty()) {
                cVar4 = cVar3.A(sVar, cVar);
            }
            if (cVar4.isEmpty()) {
                return kVar;
            }
            return new C1051f(cVar4, kVar);
        } else if (bVar.isEmpty()) {
            return kVar;
        } else {
            return new C1051f(bVar, sVar);
        }
    }

    public final Iterator s() {
        return Collections.emptyList().iterator();
    }

    public final String toString() {
        return "<Empty Node>";
    }

    public final String u() {
        return "";
    }

    public final s c() {
        return this;
    }

    public final s b(s sVar) {
        return this;
    }

    public final s f(C0866g gVar) {
        return this;
    }

    public final s l(C1048c cVar) {
        return this;
    }
}
