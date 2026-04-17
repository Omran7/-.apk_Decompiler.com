package z0;

import android.text.TextUtils;
import h0.C0552a;
import w0.C1074u;

public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final C1074u f12790e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f12791a;

    /* renamed from: b  reason: collision with root package name */
    public final g f12792b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12793c;
    public volatile byte[] d;

    public h(String str, Object obj, g gVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f12793c = str;
            this.f12791a = obj;
            this.f12792b = gVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static h a(Object obj, String str) {
        return new h(str, obj, f12790e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f12793c.equals(((h) obj).f12793c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12793c.hashCode();
    }

    public final String toString() {
        return C0552a.r(new StringBuilder("Option{key='"), this.f12793c, "'}");
    }
}
