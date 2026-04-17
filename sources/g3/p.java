package g3;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Class f8042a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f8043b;

    public p(Class cls, Class cls2) {
        this.f8042a = cls;
        this.f8043b = cls2;
    }

    public static p a(Class cls) {
        return new p(o.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f8043b.equals(pVar.f8043b)) {
            return false;
        }
        return this.f8042a.equals(pVar.f8042a);
    }

    public final int hashCode() {
        return this.f8042a.hashCode() + (this.f8043b.hashCode() * 31);
    }

    public final String toString() {
        Class<o> cls = o.class;
        Class cls2 = this.f8043b;
        Class<o> cls3 = this.f8042a;
        if (cls3 == cls) {
            return cls2.getName();
        }
        return "@" + cls3.getName() + " " + cls2.getName();
    }
}
