package i1;

import Z0.d;
import java.util.HashMap;
import l1.C0780a;

/* renamed from: i1.b  reason: case insensitive filesystem */
public final class C0583b {

    /* renamed from: a  reason: collision with root package name */
    public final C0780a f8247a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f8248b;

    public C0583b(C0780a aVar, HashMap hashMap) {
        this.f8247a = aVar;
        this.f8248b = hashMap;
    }

    public final long a(d dVar, long j6, int i2) {
        long j7;
        long g = j6 - this.f8247a.g();
        C0584c cVar = (C0584c) this.f8248b.get(dVar);
        long j8 = cVar.f8249a;
        int i5 = i2 - 1;
        if (j8 > 1) {
            j7 = j8;
        } else {
            j7 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, (double) i5) * ((double) j8) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) (j7 * ((long) i5))))), g), cVar.f8250b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0583b)) {
            return false;
        }
        C0583b bVar = (C0583b) obj;
        if (!this.f8247a.equals(bVar.f8247a) || !this.f8248b.equals(bVar.f8248b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f8247a.hashCode() ^ 1000003) * 1000003) ^ this.f8248b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f8247a + ", values=" + this.f8248b + "}";
    }
}
