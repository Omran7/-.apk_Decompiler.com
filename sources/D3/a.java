package D3;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final int f563a;

    public a(int i2) {
        this.f563a = i2;
    }

    public final Class annotationType() {
        return e.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        a aVar = (a) ((e) obj);
        if (this.f563a == aVar.f563a) {
            d dVar = d.f565a;
            aVar.getClass();
            if (dVar.equals(dVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (14552422 ^ this.f563a) + (d.f565a.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f563a + "intEncoding=" + d.f565a + ')';
    }
}
