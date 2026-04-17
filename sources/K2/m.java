package K2;

import C2.j;
import C2.n;
import D2.f;
import G2.a;
import J2.h;
import J2.i;
import J2.k;
import O2.C0112b;
import O2.s0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

public abstract class m {
    static {
        f[] fVarArr = {new f(11, j.class)};
        HashMap hashMap = new HashMap();
        f fVar = fVarArr[0];
        boolean containsKey = hashMap.containsKey(fVar.f518a);
        Class cls = fVar.f518a;
        if (!containsKey) {
            hashMap.put(cls, fVar);
            Class cls2 = fVarArr[0].f518a;
            Collections.unmodifiableMap(hashMap);
            int i2 = s0.CONFIG_NAME_FIELD_NUMBER;
            try {
                a();
            } catch (GeneralSecurityException e6) {
                throw new ExceptionInInitializerError(e6);
            }
        } else {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
        }
    }

    public static void a() {
        n.g(p.f1500c);
        n.g(i.f1486a);
        n.e(new c(), true);
        k kVar = l.f1492a;
        i iVar = i.f1307b;
        iVar.e(l.f1492a);
        iVar.d(l.f1493b);
        iVar.c(l.f1494c);
        iVar.b(l.d);
        h hVar = h.f1305b;
        hVar.b(c.f1468f);
        if (!a.f836b.get()) {
            n.e(new c(C0112b.class, new f[]{new f(10, j.class)}), true);
            iVar.e(f.f1483a);
            iVar.d(f.f1484b);
            iVar.c(f.f1485c);
            iVar.b(f.d);
            hVar.b(c.f1467e);
        }
    }
}
