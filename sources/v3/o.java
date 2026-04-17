package v3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import n3.C0866g;
import o3.d;
import q.C0928e;
import q3.l;

public abstract class o implements s {

    /* renamed from: a  reason: collision with root package name */
    public final s f12300a;

    /* renamed from: b  reason: collision with root package name */
    public String f12301b;

    public o(s sVar) {
        this.f12300a = sVar;
    }

    public final s c() {
        return this.f12300a;
    }

    public final int compareTo(Object obj) {
        s sVar = (s) obj;
        if (sVar.isEmpty()) {
            return 1;
        }
        if (sVar instanceof C1051f) {
            return -1;
        }
        l.b("Node is not leaf node!", sVar.h());
        if ((this instanceof p) && (sVar instanceof j)) {
            return Double.valueOf((double) ((p) this).f12302c).compareTo(((j) sVar).f12294c);
        }
        if ((this instanceof j) && (sVar instanceof p)) {
            return Double.valueOf((double) ((p) sVar).f12302c).compareTo(((j) this).f12294c) * -1;
        }
        o oVar = (o) sVar;
        int t6 = t();
        int t7 = oVar.t();
        if (C0928e.a(t6, t7)) {
            return k(oVar);
        }
        if (t6 != 0 && t7 != 0) {
            return t6 - t7;
        }
        throw null;
    }

    public final boolean d(C1048c cVar) {
        return false;
    }

    public final s f(C0866g gVar) {
        if (gVar.isEmpty()) {
            return this;
        }
        if (gVar.z().equals(C1048c.d)) {
            return this.f12300a;
        }
        return k.f12295e;
    }

    public final boolean h() {
        return true;
    }

    public final int i() {
        return 0;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final Iterator iterator() {
        return Collections.emptyList().iterator();
    }

    public abstract int k(o oVar);

    public final s l(C1048c cVar) {
        if (cVar.equals(C1048c.d)) {
            return this.f12300a;
        }
        return k.f12295e;
    }

    public final Object o(boolean z3) {
        if (z3) {
            s sVar = this.f12300a;
            if (!sVar.isEmpty()) {
                HashMap hashMap = new HashMap();
                hashMap.put(".value", getValue());
                hashMap.put(".priority", sVar.getValue());
                return hashMap;
            }
        }
        return getValue();
    }

    public final C1048c p(C1048c cVar) {
        return null;
    }

    public final s q(C0866g gVar, s sVar) {
        C1048c z3 = gVar.z();
        if (z3 == null) {
            return sVar;
        }
        boolean isEmpty = sVar.isEmpty();
        C1048c cVar = C1048c.d;
        if (isEmpty && !z3.equals(cVar)) {
            return this;
        }
        boolean equals = gVar.z().equals(cVar);
        boolean z4 = true;
        if (equals && gVar.size() != 1) {
            z4 = false;
        }
        l.c(z4);
        return r(z3, k.f12295e.q(gVar.C(), sVar));
    }

    public final s r(C1048c cVar, s sVar) {
        if (cVar.equals(C1048c.d)) {
            return b(sVar);
        }
        if (sVar.isEmpty()) {
            return this;
        }
        return k.f12295e.r(cVar, sVar).b(this.f12300a);
    }

    public final Iterator s() {
        return Collections.emptyList().iterator();
    }

    public abstract int t();

    public final String toString() {
        String obj = o(true).toString();
        if (obj.length() <= 100) {
            return obj;
        }
        return obj.substring(0, 100) + "...";
    }

    public final String u() {
        if (this.f12301b == null) {
            this.f12301b = l.e(g(1));
        }
        return this.f12301b;
    }

    public final String v(int i2) {
        int c3 = C0928e.c(i2);
        if (c3 == 0 || c3 == 1) {
            s sVar = this.f12300a;
            if (sVar.isEmpty()) {
                return "";
            }
            return "priority:" + sVar.g(i2) + ":";
        }
        throw new IllegalArgumentException("Unknown hash version: ".concat(d.l(i2)));
    }
}
