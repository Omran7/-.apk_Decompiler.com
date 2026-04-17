package L3;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f1709a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1710b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1711c;

    public a(String str, long j6, long j7) {
        this.f1709a = str;
        this.f1710b = j6;
        this.f1711c = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1709a.equals(aVar.f1709a) && this.f1710b == aVar.f1710b && this.f1711c == aVar.f1711c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f1710b;
        long j7 = this.f1711c;
        return ((((this.f1709a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f1709a + ", tokenExpirationTimestamp=" + this.f1710b + ", tokenCreationTimestamp=" + this.f1711c + "}";
    }
}
