package M3;

import o3.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f1824a;

    /* renamed from: b  reason: collision with root package name */
    public int f1825b;

    /* renamed from: c  reason: collision with root package name */
    public String f1826c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public Long f1827e;

    /* renamed from: f  reason: collision with root package name */
    public Long f1828f;
    public String g;

    public final b a() {
        String str;
        if (this.f1825b == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (this.f1827e == null) {
            str = str.concat(" expiresInSecs");
        }
        if (this.f1828f == null) {
            str = d.f(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new b(this.f1824a, this.f1825b, this.f1826c, this.d, this.f1827e.longValue(), this.f1828f.longValue(), this.g);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
