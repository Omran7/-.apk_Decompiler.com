package kotlin.jvm.internal;

public final class l implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Class f9655a;

    public l(Class cls) {
        j.e(cls, "jClass");
        this.f9655a = cls;
    }

    public final Class a() {
        return this.f9655a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (j.a(this.f9655a, ((l) obj).f9655a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9655a.hashCode();
    }

    public final String toString() {
        return this.f9655a.toString() + " (Kotlin reflection is not available)";
    }
}
