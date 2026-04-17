package g3;

import K3.b;
import java.util.Set;

/* renamed from: g3.c  reason: case insensitive filesystem */
public interface C0550c {
    Object a(Class cls) {
        return e(p.a(cls));
    }

    b b(p pVar);

    b c(Class cls) {
        return b(p.a(cls));
    }

    Set d(p pVar) {
        return (Set) f(pVar).get();
    }

    Object e(p pVar) {
        b b6 = b(pVar);
        if (b6 == null) {
            return null;
        }
        return b6.get();
    }

    b f(p pVar);

    n g(p pVar);

    n h(Class cls) {
        return g(p.a(cls));
    }
}
