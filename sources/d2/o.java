package D2;

import java.util.Objects;

public final class o extends c {

    /* renamed from: b  reason: collision with root package name */
    public final int f543b;

    /* renamed from: c  reason: collision with root package name */
    public final int f544c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final j f545e;

    public o(int i2, int i5, int i6, j jVar) {
        this.f543b = i2;
        this.f544c = i5;
        this.d = i6;
        this.f545e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (oVar.f543b == this.f543b && oVar.f544c == this.f544c && oVar.d == this.d && oVar.f545e == this.f545e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f543b), Integer.valueOf(this.f544c), Integer.valueOf(this.d), this.f545e});
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + this.f545e + ", " + this.f544c + "-byte IV, " + this.d + "-byte tag, and " + this.f543b + "-byte key)";
    }
}
