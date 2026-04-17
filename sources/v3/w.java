package v3;

import o3.d;
import q.C0928e;
import q3.l;

public final class w extends o {

    /* renamed from: c  reason: collision with root package name */
    public final String f12312c;

    public w(String str, s sVar) {
        super(sVar);
        this.f12312c = str;
    }

    public final s b(s sVar) {
        return new w(this.f12312c, sVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.f12312c.equals(wVar.f12312c) || !this.f12300a.equals(wVar.f12300a)) {
            return false;
        }
        return true;
    }

    public final String g(int i2) {
        int c3 = C0928e.c(i2);
        String str = this.f12312c;
        if (c3 == 0) {
            return v(i2) + "string:" + str;
        } else if (c3 == 1) {
            return v(i2) + "string:" + l.f(str);
        } else {
            throw new IllegalArgumentException("Invalid hash version for string node: ".concat(d.l(i2)));
        }
    }

    public final Object getValue() {
        return this.f12312c;
    }

    public final int hashCode() {
        return this.f12300a.hashCode() + this.f12312c.hashCode();
    }

    public final int k(o oVar) {
        return this.f12312c.compareTo(((w) oVar).f12312c);
    }

    public final int t() {
        return 4;
    }
}
