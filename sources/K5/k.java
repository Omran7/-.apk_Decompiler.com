package K5;

import I5.a;
import I5.v;
import K1.h;
import java.util.concurrent.TimeUnit;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1677a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f1678b = a.g("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: c  reason: collision with root package name */
    public static final int f1679c;
    public static final int d = a.h("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);

    /* renamed from: e  reason: collision with root package name */
    public static final long f1680e = TimeUnit.SECONDS.toNanos(a.g("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));

    /* renamed from: f  reason: collision with root package name */
    public static final g f1681f = g.f1672a;
    public static final h g = new h(0);
    public static final h h = new h(1);

    static {
        String str;
        int i2 = v.f1281a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f1677a = str;
        int i5 = v.f1281a;
        if (i5 < 2) {
            i5 = 2;
        }
        f1679c = a.h("kotlinx.coroutines.scheduler.core.pool.size", i5, 1, 0, 8);
    }
}
