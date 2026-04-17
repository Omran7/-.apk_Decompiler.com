package v3;

import o3.d;
import q3.l;
import z0.C1129e;

public final class j extends o {

    /* renamed from: c  reason: collision with root package name */
    public final Double f12294c;

    public j(Double d, s sVar) {
        super(sVar);
        this.f12294c = d;
    }

    public final s b(s sVar) {
        l.c(C1129e.d(sVar));
        return new j(this.f12294c, sVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!this.f12294c.equals(jVar.f12294c) || !this.f12300a.equals(jVar.f12300a)) {
            return false;
        }
        return true;
    }

    public final String g(int i2) {
        String f6 = d.f(v(i2), "number:");
        return f6 + l.a(this.f12294c.doubleValue());
    }

    public final Object getValue() {
        return this.f12294c;
    }

    public final int hashCode() {
        return this.f12300a.hashCode() + this.f12294c.hashCode();
    }

    public final int k(o oVar) {
        return this.f12294c.compareTo(((j) oVar).f12294c);
    }

    public final int t() {
        return 3;
    }
}
