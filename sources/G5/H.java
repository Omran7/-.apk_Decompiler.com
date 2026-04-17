package G5;

import I5.o;
import I5.v;
import K5.e;

public abstract class H {

    /* renamed from: a  reason: collision with root package name */
    public static final K f872a;

    static {
        String str;
        boolean z3;
        K k6;
        int i2 = v.f1281a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z3 = Boolean.parseBoolean(str);
        } else {
            z3 = false;
        }
        if (!z3) {
            k6 = G.f869r;
        } else {
            e eVar = N.f877a;
            H5.e eVar2 = o.f1276a;
            H5.e eVar3 = eVar2.f1073f;
            if (!(eVar2 instanceof K)) {
                k6 = G.f869r;
            } else {
                k6 = eVar2;
            }
        }
        f872a = k6;
    }
}
