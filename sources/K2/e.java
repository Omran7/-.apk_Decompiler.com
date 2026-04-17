package K2;

import D2.c;
import java.util.Objects;

public final class e extends c {

    /* renamed from: b  reason: collision with root package name */
    public final int f1481b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1482c;
    public final d d;

    public e(int i2, int i5, d dVar) {
        this.f1481b = i2;
        this.f1482c = i5;
        this.d = dVar;
    }

    public final int b() {
        d dVar = d.f1471f;
        int i2 = this.f1482c;
        d dVar2 = this.d;
        if (dVar2 == dVar) {
            return i2;
        }
        if (dVar2 == d.f1469c) {
            return i2 + 5;
        }
        if (dVar2 == d.d) {
            return i2 + 5;
        }
        if (dVar2 == d.f1470e) {
            return i2 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (eVar.f1481b == this.f1481b && eVar.b() == b() && eVar.d == this.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f1481b), Integer.valueOf(this.f1482c), this.d});
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + this.d + ", " + this.f1482c + "-byte tags, and " + this.f1481b + "-byte key)";
    }
}
