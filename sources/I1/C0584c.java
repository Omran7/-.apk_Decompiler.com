package i1;

import java.util.Set;

/* renamed from: i1.c  reason: case insensitive filesystem */
public final class C0584c {

    /* renamed from: a  reason: collision with root package name */
    public final long f8249a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8250b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f8251c;

    public C0584c(long j6, long j7, Set set) {
        this.f8249a = j6;
        this.f8250b = j7;
        this.f8251c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0584c)) {
            return false;
        }
        C0584c cVar = (C0584c) obj;
        if (this.f8249a == cVar.f8249a && this.f8250b == cVar.f8250b && this.f8251c.equals(cVar.f8251c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f8249a;
        long j7 = this.f8250b;
        return ((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f8251c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f8249a + ", maxAllowedDelay=" + this.f8250b + ", flags=" + this.f8251c + "}";
    }
}
