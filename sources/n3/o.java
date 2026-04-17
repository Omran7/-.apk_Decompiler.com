package n3;

import java.util.HashMap;
import java.util.Map;

public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final o f10314b = new o();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f10315a = new HashMap();

    public static m a(C0864e eVar, n nVar) {
        m mVar;
        o oVar = f10314b;
        oVar.getClass();
        synchronized (eVar) {
            if (!eVar.f10271j) {
                eVar.f10271j = true;
                eVar.d();
            }
        }
        String str = "https://" + nVar.f10311a + "/" + nVar.f10313c;
        synchronized (oVar.f10315a) {
            try {
                if (!oVar.f10315a.containsKey(eVar)) {
                    oVar.f10315a.put(eVar, new HashMap());
                }
                Map map = (Map) oVar.f10315a.get(eVar);
                if (!map.containsKey(str)) {
                    mVar = new m(eVar, nVar);
                    map.put(str, mVar);
                } else {
                    throw new IllegalStateException("createLocalRepo() called for existing repo.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }
}
