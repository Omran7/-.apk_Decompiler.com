package T0;

import U0.g;
import java.security.MessageDigest;
import z0.C1130f;

public final class b implements C1130f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f2794b;

    public b(Object obj) {
        g.c(obj, "Argument must not be null");
        this.f2794b = obj;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f2794b.toString().getBytes(C1130f.f12789a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f2794b.equals(((b) obj).f2794b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2794b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f2794b + '}';
    }
}
