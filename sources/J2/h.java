package J2;

import C2.m;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final h f1305b = new h();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f1306a = new AtomicReference(new n(new I3.h(14)));

    public final Class a(Class cls) {
        HashMap hashMap = ((n) this.f1306a.get()).f1316b;
        if (hashMap.containsKey(cls)) {
            return ((m) hashMap.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public final synchronized void b(l lVar) {
        I3.h hVar = new I3.h((n) this.f1306a.get());
        hVar.G(lVar);
        this.f1306a.set(new n(hVar));
    }
}
