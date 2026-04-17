package q3;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11090a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11091b;

    public f(Object obj, Object obj2) {
        this.f11090a = obj;
        this.f11091b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        Object obj2 = fVar.f11090a;
        Object obj3 = this.f11090a;
        if (obj3 == null ? obj2 != null : !obj3.equals(obj2)) {
            return false;
        }
        Object obj4 = fVar.f11091b;
        Object obj5 = this.f11091b;
        if (obj5 == null ? obj4 == null : obj5.equals(obj4)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i5 = 0;
        Object obj = this.f11090a;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = i2 * 31;
        Object obj2 = this.f11091b;
        if (obj2 != null) {
            i5 = obj2.hashCode();
        }
        return i6 + i5;
    }

    public final String toString() {
        return "Pair(" + this.f11090a + "," + this.f11091b + ")";
    }
}
