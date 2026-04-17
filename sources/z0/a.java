package Z0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4462a;

    /* renamed from: b  reason: collision with root package name */
    public final b f4463b;

    public a(Object obj, b bVar) {
        if (obj != null) {
            this.f4462a = obj;
            this.f4463b = bVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (this.f4462a.equals(aVar.f4462a)) {
            d dVar = d.f4466a;
            if (dVar.equals(dVar)) {
                b bVar = aVar.f4463b;
                b bVar2 = this.f4463b;
                if (bVar2 == null) {
                    if (bVar == null) {
                        return true;
                    }
                } else if (bVar2.equals(bVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = ((((1000003 * 1000003) ^ this.f4462a.hashCode()) * 1000003) ^ d.f4466a.hashCode()) * 1000003;
        b bVar = this.f4463b;
        if (bVar == null) {
            i2 = 0;
        } else {
            i2 = bVar.hashCode();
        }
        return i2 ^ hashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f4462a + ", priority=" + d.f4466a + ", productData=" + this.f4463b + "}";
    }
}
