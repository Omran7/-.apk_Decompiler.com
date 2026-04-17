package D2;

import java.util.Objects;

public final class r extends c {

    /* renamed from: b  reason: collision with root package name */
    public final int f549b;

    /* renamed from: c  reason: collision with root package name */
    public final j f550c;

    public r(int i2, j jVar) {
        this.f549b = i2;
        this.f550c = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (rVar.f549b == this.f549b && rVar.f550c == this.f550c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f549b), this.f550c});
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f550c + ", " + this.f549b + "-byte key)";
    }
}
