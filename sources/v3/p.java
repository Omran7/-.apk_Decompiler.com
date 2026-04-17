package v3;

import o3.d;
import q3.l;

public final class p extends o {

    /* renamed from: c  reason: collision with root package name */
    public final long f12302c;

    public p(Long l6, s sVar) {
        super(sVar);
        this.f12302c = l6.longValue();
    }

    public final s b(s sVar) {
        return new p(Long.valueOf(this.f12302c), sVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f12302c != pVar.f12302c || !this.f12300a.equals(pVar.f12300a)) {
            return false;
        }
        return true;
    }

    public final String g(int i2) {
        String f6 = d.f(v(i2), "number:");
        return f6 + l.a((double) this.f12302c);
    }

    public final Object getValue() {
        return Long.valueOf(this.f12302c);
    }

    public final int hashCode() {
        long j6 = this.f12302c;
        return this.f12300a.hashCode() + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final int k(o oVar) {
        long j6 = ((p) oVar).f12302c;
        char[] cArr = l.f11100a;
        int i2 = (this.f12302c > j6 ? 1 : (this.f12302c == j6 ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        if (i2 == 0) {
            return 0;
        }
        return 1;
    }

    public final int t() {
        return 3;
    }
}
