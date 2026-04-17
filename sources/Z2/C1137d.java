package z2;

/* renamed from: z2.d  reason: case insensitive filesystem */
public final class C1137d extends C1136c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12855a;

    public C1137d(Object obj) {
        this.f12855a = obj;
    }

    public final Object a() {
        return this.f12855a;
    }

    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1137d) {
            return this.f12855a.equals(((C1137d) obj).f12855a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12855a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f12855a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
