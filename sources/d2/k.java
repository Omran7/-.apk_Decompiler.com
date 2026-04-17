package D2;

import java.util.Objects;

public final class k extends c {

    /* renamed from: b  reason: collision with root package name */
    public final int f536b;

    /* renamed from: c  reason: collision with root package name */
    public final int f537c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final j f538e;

    public k(int i2, int i5, int i6, j jVar) {
        this.f536b = i2;
        this.f537c = i5;
        this.d = i6;
        this.f538e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kVar.f536b == this.f536b && kVar.f537c == this.f537c && kVar.d == this.d && kVar.f538e == this.f538e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f536b), Integer.valueOf(this.f537c), Integer.valueOf(this.d), this.f538e});
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + this.f538e + ", " + this.f537c + "-byte IV, " + this.d + "-byte tag, and " + this.f536b + "-byte key)";
    }
}
