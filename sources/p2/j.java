package P2;

import G2.a;
import H3.f;
import U3.c;
import s2.e;

public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final j f2176b = new j(new e(14));

    /* renamed from: c  reason: collision with root package name */
    public static final j f2177c = new j(new e(16));

    /* renamed from: a  reason: collision with root package name */
    public final i f2178a;

    static {
        new j(new e(17));
        new j(new f(17));
        new j(new f(15));
        new j(new f(16));
        new j(new e(15));
    }

    public j(k kVar) {
        if (a.f836b.get()) {
            this.f2178a = new h(kVar, 1);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f2178a = new h(kVar, 0);
        } else {
            this.f2178a = new c((Object) kVar, 20);
        }
    }
}
