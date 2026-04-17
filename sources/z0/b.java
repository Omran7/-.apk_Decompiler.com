package Z0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f4464a;

    public b(Integer num) {
        this.f4464a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        Integer num = this.f4464a;
        if (num != null) {
            return num.equals(bVar.f4464a);
        }
        if (bVar.f4464a == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        Integer num = this.f4464a;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.hashCode();
        }
        return i2 ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f4464a + "}";
    }
}
