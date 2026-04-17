package o5;

import java.io.Serializable;
import kotlin.jvm.internal.j;
import x5.p;

public final class c implements i, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final i f10476a;

    /* renamed from: b  reason: collision with root package name */
    public final g f10477b;

    public c(g gVar, i iVar) {
        j.e(iVar, "left");
        j.e(gVar, "element");
        this.f10476a = iVar;
        this.f10477b = gVar;
    }

    public final boolean equals(Object obj) {
        boolean z3;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i2 = 2;
            c cVar2 = cVar;
            int i5 = 2;
            while (true) {
                i iVar = cVar2.f10476a;
                if (iVar instanceof c) {
                    cVar2 = (c) iVar;
                } else {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    break;
                }
                i5++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f10476a;
                if (iVar2 instanceof c) {
                    cVar3 = (c) iVar2;
                } else {
                    cVar3 = null;
                }
                if (cVar3 == null) {
                    break;
                }
                i2++;
            }
            if (i5 != i2) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                g gVar = cVar4.f10477b;
                if (j.a(cVar.get(gVar.getKey()), gVar)) {
                    i iVar3 = cVar4.f10476a;
                    if (!(iVar3 instanceof c)) {
                        j.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        g gVar2 = (g) iVar3;
                        z3 = j.a(cVar.get(gVar2.getKey()), gVar2);
                        break;
                    }
                    cVar4 = (c) iVar3;
                } else {
                    z3 = false;
                    break;
                }
            }
            if (z3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(this.f10476a.fold(obj, pVar), this.f10477b);
    }

    public final g get(h hVar) {
        j.e(hVar, "key");
        c cVar = this;
        while (true) {
            g gVar = cVar.f10477b.get(hVar);
            if (gVar != null) {
                return gVar;
            }
            i iVar = cVar.f10476a;
            if (!(iVar instanceof c)) {
                return iVar.get(hVar);
            }
            cVar = (c) iVar;
        }
    }

    public final int hashCode() {
        return this.f10477b.hashCode() + this.f10476a.hashCode();
    }

    public final i minusKey(h hVar) {
        j.e(hVar, "key");
        g gVar = this.f10477b;
        g gVar2 = gVar.get(hVar);
        i iVar = this.f10476a;
        if (gVar2 != null) {
            return iVar;
        }
        i minusKey = iVar.minusKey(hVar);
        if (minusKey == iVar) {
            return this;
        }
        if (minusKey == j.f10479a) {
            return gVar;
        }
        return new c(gVar, minusKey);
    }

    public final i plus(i iVar) {
        j.e(iVar, "context");
        if (iVar == j.f10479a) {
            return this;
        }
        return (i) iVar.fold(this, b.f10474c);
    }

    public final String toString() {
        return "[" + ((String) fold("", b.f10473b)) + ']';
    }
}
