package K2;

import B0.C0009h;
import C2.k;
import C2.m;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class i implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final i f1486a = new Object();

    public final Class a() {
        return g.class;
    }

    public final Object b(C0009h hVar) {
        if (((k) hVar.f229c) != null) {
            for (List<k> it2 : ((ConcurrentHashMap) hVar.f228b).values()) {
                for (k kVar : it2) {
                    g gVar = (g) kVar.f444a;
                }
            }
            return new Object();
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }

    public final Class c() {
        return g.class;
    }
}
