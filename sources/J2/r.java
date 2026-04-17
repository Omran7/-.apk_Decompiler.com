package J2;

import java.util.Objects;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final Class f1325a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f1326b;

    public r(Class cls, Class cls2) {
        this.f1325a = cls;
        this.f1326b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!rVar.f1325a.equals(this.f1325a) || !rVar.f1326b.equals(this.f1326b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f1325a, this.f1326b});
    }

    public final String toString() {
        return this.f1325a.getSimpleName() + " with serialization type: " + this.f1326b.getSimpleName();
    }
}
