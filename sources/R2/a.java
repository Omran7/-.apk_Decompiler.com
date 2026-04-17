package R2;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f2469a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2470b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2471c;

    public a(long j6, long j7, long j8) {
        this.f2469a = j6;
        this.f2470b = j7;
        this.f2471c = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2469a == aVar.f2469a && this.f2470b == aVar.f2470b && this.f2471c == aVar.f2471c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f2469a;
        long j7 = this.f2470b;
        long j8 = this.f2471c;
        return ((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f2469a + ", elapsedRealtime=" + this.f2470b + ", uptimeMillis=" + this.f2471c + "}";
    }
}
