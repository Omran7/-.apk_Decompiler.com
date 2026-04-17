package g3;

import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import h0.C0552a;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final p f8028a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8029b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8030c;

    public h(int i2, int i5, Class cls) {
        this(p.a(cls), i2, i5);
    }

    public static h a(Class cls) {
        return new h(0, 1, cls);
    }

    public static h b(Class cls) {
        return new h(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f8028a.equals(hVar.f8028a) && this.f8029b == hVar.f8029b && this.f8030c == hVar.f8030c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8028a.hashCode() ^ 1000003) * 1000003) ^ this.f8029b) * 1000003) ^ this.f8030c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f8028a);
        sb.append(", type=");
        int i2 = this.f8029b;
        if (i2 == 1) {
            str = "required";
        } else if (i2 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i5 = this.f8030c;
        if (i5 == 0) {
            str2 = "direct";
        } else if (i5 == 1) {
            str2 = "provider";
        } else if (i5 == 2) {
            str2 = "deferred";
        } else {
            throw new AssertionError(a.f(i5, "Unsupported injection: "));
        }
        return C0552a.r(sb, str2, "}");
    }

    public h(p pVar, int i2, int i5) {
        d.g(pVar, "Null dependency anInterface.");
        this.f8028a = pVar;
        this.f8029b = i2;
        this.f8030c = i5;
    }
}
