package n3;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final long f10352a;

    public z(long j6) {
        this.f10352a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass() && this.f10352a == ((z) obj).f10352a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f10352a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return "Tag{tagNumber=" + this.f10352a + '}';
    }
}
