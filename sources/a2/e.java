package A2;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Object f25a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f26b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f27c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f25a = obj;
        this.f26b = obj2;
        this.f27c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f25a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f26b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f27c);
        StringBuilder sb = new StringBuilder(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39);
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}
