package j1;

/* renamed from: j1.a  reason: case insensitive filesystem */
public final class C0605a {

    /* renamed from: f  reason: collision with root package name */
    public static final C0605a f8795f = new C0605a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a  reason: collision with root package name */
    public final long f8796a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8797b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8798c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8799e;

    public C0605a(long j6, int i2, int i5, long j7, int i6) {
        this.f8796a = j6;
        this.f8797b = i2;
        this.f8798c = i5;
        this.d = j7;
        this.f8799e = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0605a)) {
            return false;
        }
        C0605a aVar = (C0605a) obj;
        if (this.f8796a == aVar.f8796a && this.f8797b == aVar.f8797b && this.f8798c == aVar.f8798c && this.d == aVar.d && this.f8799e == aVar.f8799e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f8796a;
        long j7 = this.d;
        return ((((((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f8797b) * 1000003) ^ this.f8798c) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f8799e;
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f8796a + ", loadBatchSize=" + this.f8797b + ", criticalSectionEnterTimeoutMs=" + this.f8798c + ", eventCleanUpAge=" + this.d + ", maxBlobByteSizePerRow=" + this.f8799e + "}";
    }
}
