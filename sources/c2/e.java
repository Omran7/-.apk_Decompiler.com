package C2;

import J2.d;
import h0.C0552a;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f435b = Logger.getLogger(e.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f436a;

    public e(e eVar) {
        this.f436a = new ConcurrentHashMap(eVar.f436a);
    }

    public final synchronized d a(String str) {
        if (this.f436a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (d) this.f436a.get(str);
    }

    public final synchronized void b(d dVar) {
        boolean z3;
        int a6 = dVar.a();
        if (a6 != 1) {
            z3 = C0552a.e(a6);
        } else {
            z3 = C0552a.d(a6);
        }
        if (z3) {
            c(new d(dVar));
        } else {
            throw new GeneralSecurityException("failed to register key manager " + dVar.getClass() + " as it is not FIPS compatible.");
        }
    }

    public final synchronized void c(d dVar) {
        try {
            d dVar2 = dVar.f434a;
            Class cls = dVar2.f1301c;
            if (!dVar2.f1300b.keySet().contains(cls)) {
                if (!Void.class.equals(cls)) {
                    String obj = dVar2.toString();
                    String name = cls.getName();
                    throw new IllegalArgumentException("Given internalKeyMananger " + obj + " does not support primitive class " + name);
                }
            }
            String b6 = dVar2.b();
            d dVar3 = (d) this.f436a.get(b6);
            if (dVar3 != null) {
                if (!dVar3.f434a.getClass().equals(dVar.f434a.getClass())) {
                    f435b.warning("Attempted overwrite of a registered key manager for key type ".concat(b6));
                    String name2 = dVar3.f434a.getClass().getName();
                    String name3 = dVar.f434a.getClass().getName();
                    throw new GeneralSecurityException("typeUrl (" + b6 + ") is already registered with " + name2 + ", cannot be re-registered with " + name3);
                }
            }
            this.f436a.putIfAbsent(b6, dVar);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public e() {
        this.f436a = new ConcurrentHashMap();
    }
}
