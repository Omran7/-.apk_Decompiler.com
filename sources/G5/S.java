package G5;

public final class S implements C0024c0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f882a;

    public S(boolean z3) {
        this.f882a = z3;
    }

    public final w0 b() {
        return null;
    }

    public final boolean isActive() {
        return this.f882a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f882a) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
