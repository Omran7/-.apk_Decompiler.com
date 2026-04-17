package m0;

/* renamed from: m0.a  reason: case insensitive filesystem */
public final class C0809a {

    /* renamed from: a  reason: collision with root package name */
    public int f9921a;

    /* renamed from: b  reason: collision with root package name */
    public int f9922b;

    /* renamed from: c  reason: collision with root package name */
    public int f9923c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0809a.class != obj.getClass()) {
            return false;
        }
        C0809a aVar = (C0809a) obj;
        int i2 = this.f9921a;
        if (i2 != aVar.f9921a) {
            return false;
        }
        if (i2 == 8 && Math.abs(this.f9923c - this.f9922b) == 1 && this.f9923c == aVar.f9922b && this.f9922b == aVar.f9923c) {
            return true;
        }
        if (this.f9923c == aVar.f9923c && this.f9922b == aVar.f9922b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f9921a * 31) + this.f9922b) * 31) + this.f9923c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i2 = this.f9921a;
        if (i2 == 1) {
            str = "add";
        } else if (i2 == 2) {
            str = "rm";
        } else if (i2 == 4) {
            str = "up";
        } else if (i2 != 8) {
            str = "??";
        } else {
            str = "mv";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f9922b);
        sb.append("c:");
        sb.append(this.f9923c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
