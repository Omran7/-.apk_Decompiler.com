package n3;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public String f10311a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10312b;

    /* renamed from: c  reason: collision with root package name */
    public String f10313c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f10312b == nVar.f10312b && this.f10311a.equals(nVar.f10311a)) {
            return this.f10313c.equals(nVar.f10313c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10313c.hashCode() + (((this.f10311a.hashCode() * 31) + (this.f10312b ? 1 : 0)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("http");
        if (this.f10312b) {
            str = "s";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("://");
        sb.append(this.f10311a);
        return sb.toString();
    }
}
