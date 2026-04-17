package G;

import java.util.Locale;

public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final j f804b = new j(new k(i.a(new Locale[0])));

    /* renamed from: a  reason: collision with root package name */
    public final k f805a;

    public j(k kVar) {
        this.f805a = kVar;
    }

    public static j a(String str) {
        if (str == null || str.isEmpty()) {
            return f804b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i2 = 0; i2 < length; i2++) {
            localeArr[i2] = h.a(split[i2]);
        }
        return new j(new k(i.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (this.f805a.equals(((j) obj).f805a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f805a.f806a.hashCode();
    }

    public final String toString() {
        return this.f805a.f806a.toString();
    }
}
