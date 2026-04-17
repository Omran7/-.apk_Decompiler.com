package U0;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public Class f3693a;

    /* renamed from: b  reason: collision with root package name */
    public Class f3694b;

    /* renamed from: c  reason: collision with root package name */
    public Class f3695c;

    public m(Class cls, Class cls2, Class cls3) {
        this.f3693a = cls;
        this.f3694b = cls2;
        this.f3695c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f3693a.equals(mVar.f3693a) && this.f3694b.equals(mVar.f3694b) && o.b(this.f3695c, mVar.f3695c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (this.f3694b.hashCode() + (this.f3693a.hashCode() * 31)) * 31;
        Class cls = this.f3695c;
        if (cls != null) {
            i2 = cls.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f3693a + ", second=" + this.f3694b + '}';
    }
}
