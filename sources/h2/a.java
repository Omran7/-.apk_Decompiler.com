package H2;

import C2.c;
import C2.n;
import D2.f;
import D2.h;
import O2.F;
import O2.s0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f996a = 0;

    static {
        Class<c> cls = c.class;
        f[] fVarArr = {new f(9, cls)};
        HashMap hashMap = new HashMap();
        f fVar = fVarArr[0];
        boolean containsKey = hashMap.containsKey(fVar.f518a);
        Class cls2 = fVar.f518a;
        if (!containsKey) {
            hashMap.put(cls2, fVar);
            Class cls3 = fVarArr[0].f518a;
            Collections.unmodifiableMap(hashMap);
            int i2 = s0.CONFIG_NAME_FIELD_NUMBER;
            try {
                n.g(c.f1001b);
                if (!G2.a.f836b.get()) {
                    n.e(new h(F.class, new f[]{new f(9, cls)}, 8), true);
                }
            } catch (GeneralSecurityException e6) {
                throw new ExceptionInInitializerError(e6);
            }
        } else {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls2.getCanonicalName());
        }
    }
}
