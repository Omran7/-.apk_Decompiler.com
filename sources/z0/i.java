package z0;

import U0.d;
import java.security.MessageDigest;
import n.j;

public final class i implements C1130f {

    /* renamed from: b  reason: collision with root package name */
    public final d f12794b = new j(0);

    public final void a(MessageDigest messageDigest) {
        int i2 = 0;
        while (true) {
            d dVar = this.f12794b;
            if (i2 < dVar.f10226c) {
                h hVar = (h) dVar.f(i2);
                Object j6 = this.f12794b.j(i2);
                g gVar = hVar.f12792b;
                if (hVar.d == null) {
                    hVar.d = hVar.f12793c.getBytes(C1130f.f12789a);
                }
                gVar.b(hVar.d, j6, messageDigest);
                i2++;
            } else {
                return;
            }
        }
    }

    public final Object c(h hVar) {
        d dVar = this.f12794b;
        if (dVar.containsKey(hVar)) {
            return dVar.get(hVar);
        }
        return hVar.f12791a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f12794b.equals(((i) obj).f12794b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12794b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f12794b + '}';
    }
}
