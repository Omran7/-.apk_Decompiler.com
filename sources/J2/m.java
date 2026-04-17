package J2;

import java.util.Objects;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Class f1313a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f1314b;

    public m(Class cls, Class cls2) {
        this.f1313a = cls;
        this.f1314b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!mVar.f1313a.equals(this.f1313a) || !mVar.f1314b.equals(this.f1314b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f1313a, this.f1314b});
    }

    public final String toString() {
        return this.f1313a.getSimpleName() + " with primitive type: " + this.f1314b.getSimpleName();
    }
}
