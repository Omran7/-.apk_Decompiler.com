package K2;

import D2.c;
import java.util.Objects;

public final class k extends c {

    /* renamed from: b  reason: collision with root package name */
    public final int f1489b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1490c;
    public final d d;

    /* renamed from: e  reason: collision with root package name */
    public final d f1491e;

    public k(int i2, int i5, d dVar, d dVar2) {
        this.f1489b = i2;
        this.f1490c = i5;
        this.d = dVar;
        this.f1491e = dVar2;
    }

    public final int b() {
        d dVar = d.f1478o;
        int i2 = this.f1490c;
        d dVar2 = this.d;
        if (dVar2 == dVar) {
            return i2;
        }
        if (dVar2 == d.f1475l) {
            return i2 + 5;
        }
        if (dVar2 == d.f1476m) {
            return i2 + 5;
        }
        if (dVar2 == d.f1477n) {
            return i2 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kVar.f1489b == this.f1489b && kVar.b() == b() && kVar.d == this.d && kVar.f1491e == this.f1491e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f1489b), Integer.valueOf(this.f1490c), this.d, this.f1491e});
    }

    public final String toString() {
        return "HMAC Parameters (variant: " + this.d + ", hashType: " + this.f1491e + ", " + this.f1490c + "-byte tags, and " + this.f1489b + "-byte key)";
    }
}
