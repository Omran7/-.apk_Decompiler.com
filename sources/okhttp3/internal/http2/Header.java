package okhttp3.internal.http2;

import N5.g;
import java.util.Locale;
import o3.d;
import okhttp3.internal.Util;

public final class Header {
    public static final g d = g.k(":");

    /* renamed from: e  reason: collision with root package name */
    public static final g f10788e = g.k(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final g f10789f = g.k(":method");
    public static final g g = g.k(":path");
    public static final g h = g.k(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final g f10790i = g.k(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final g f10791a;

    /* renamed from: b  reason: collision with root package name */
    public final g f10792b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10793c;

    public interface Listener {
    }

    public Header(String str, String str2) {
        this(g.k(str), g.k(str2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        if (!this.f10791a.equals(header.f10791a) || !this.f10792b.equals(header.f10792b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10792b.hashCode() + ((this.f10791a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String A6 = this.f10791a.A();
        String A7 = this.f10792b.A();
        byte[] bArr = Util.f10683a;
        Locale locale = Locale.US;
        return d.g(A6, ": ", A7);
    }

    public Header(g gVar, String str) {
        this(gVar, g.k(str));
    }

    public Header(g gVar, g gVar2) {
        this.f10791a = gVar;
        this.f10792b = gVar2;
        this.f10793c = gVar2.x() + gVar.x() + 32;
    }
}
