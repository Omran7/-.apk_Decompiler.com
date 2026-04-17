package J2;

import Q2.a;
import java.util.Objects;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Class f1323a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1324b;

    public q(Class cls, a aVar) {
        this.f1323a = cls;
        this.f1324b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!qVar.f1323a.equals(this.f1323a) || !qVar.f1324b.equals(this.f1324b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f1323a, this.f1324b});
    }

    public final String toString() {
        return this.f1323a.getSimpleName() + ", object identifier: " + this.f1324b;
    }
}
