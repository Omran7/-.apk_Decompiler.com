package C2;

import J2.c;
import J2.d;
import J2.h;
import J2.l;
import J2.m;
import K2.a;
import K2.j;
import O2.Y;
import O2.a0;
import O2.b0;
import O2.r0;
import com.google.crypto.tink.shaded.protobuf.C0396a;
import com.google.crypto.tink.shaded.protobuf.C0403h;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.D;
import h0.C0552a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import q.C0928e;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f450a = new AtomicReference(new e());

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap f451b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentHashMap f452c = new ConcurrentHashMap();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();

    static {
        Logger.getLogger(n.class.getName());
        new ConcurrentHashMap();
    }

    public static synchronized void a(String str, Map map, boolean z3) {
        synchronized (n.class) {
            if (z3) {
                try {
                    ConcurrentHashMap concurrentHashMap = f452c;
                    if (concurrentHashMap.containsKey(str)) {
                        if (!((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                            throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z3) {
                if (((e) f450a.get()).f436a.containsKey(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!d.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (d.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                        }
                    }
                }
            }
        }
    }

    public static Object b(b bVar, Class cls) {
        Object obj;
        J2.n nVar = (J2.n) h.f1305b.f1306a.get();
        nVar.getClass();
        m mVar = new m(bVar.getClass(), cls);
        HashMap hashMap = nVar.f1315a;
        if (hashMap.containsKey(mVar)) {
            switch (((l) hashMap.get(mVar)).f1312b.f539a) {
                case 8:
                    a aVar = (a) bVar;
                    obj = new Object();
                    if (!C0552a.d(1)) {
                        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
                    }
                    break;
                default:
                    j jVar = (j) bVar;
                    obj = new Object();
                    if (!C0552a.e(2)) {
                        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                    }
                    break;
            }
            return obj;
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + mVar + " available");
    }

    public static Object c(String str, C0404i iVar, Class cls) {
        e eVar = (e) f450a.get();
        eVar.getClass();
        d a6 = eVar.a(str);
        boolean contains = a6.f434a.f1300b.keySet().contains(cls);
        d dVar = a6.f434a;
        if (contains) {
            try {
                Class<Void> cls2 = Void.class;
                if (!dVar.f1300b.keySet().contains(cls)) {
                    if (!cls2.equals(cls)) {
                        String obj = dVar.toString();
                        String name = cls.getName();
                        throw new IllegalArgumentException("Given internalKeyMananger " + obj + " does not support primitive class " + name);
                    }
                }
                try {
                    C0396a f6 = dVar.f(iVar);
                    if (!cls2.equals(cls)) {
                        dVar.g(f6);
                        return dVar.c(f6, cls);
                    }
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                } catch (D e6) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(dVar.f1299a.getName()), e6);
                }
            } catch (IllegalArgumentException e7) {
                throw new GeneralSecurityException("Primitive type not supported", e7);
            }
        } else {
            StringBuilder sb = new StringBuilder("Primitive type ");
            sb.append(cls.getName());
            sb.append(" not supported by key manager of type ");
            sb.append(dVar.getClass());
            sb.append(", supported primitives: ");
            Set<Class> keySet = dVar.f1300b.keySet();
            StringBuilder sb2 = new StringBuilder();
            boolean z3 = true;
            for (Class cls3 : keySet) {
                if (!z3) {
                    sb2.append(", ");
                }
                sb2.append(cls3.getCanonicalName());
                z3 = false;
            }
            sb.append(sb2.toString());
            throw new GeneralSecurityException(sb.toString());
        }
    }

    public static synchronized Y d(b0 b0Var) {
        Y e6;
        synchronized (n.class) {
            d dVar = ((e) f450a.get()).a(b0Var.D()).f434a;
            f fVar = new f(dVar, dVar.f1301c);
            if (((Boolean) f452c.get(b0Var.D())).booleanValue()) {
                e6 = fVar.e(b0Var.E());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + b0Var.D());
            }
        }
        return e6;
    }

    public static synchronized void e(d dVar, boolean z3) {
        Map map;
        synchronized (n.class) {
            try {
                AtomicReference atomicReference = f450a;
                e eVar = new e((e) atomicReference.get());
                eVar.b(dVar);
                String b6 = dVar.b();
                if (z3) {
                    map = dVar.d().k();
                } else {
                    map = Collections.emptyMap();
                }
                a(b6, map, z3);
                if (!((e) atomicReference.get()).f436a.containsKey(b6)) {
                    f451b.put(b6, new Object());
                    if (z3) {
                        f(dVar.d().k(), b6);
                    }
                }
                f452c.put(b6, Boolean.valueOf(z3));
                atomicReference.set(eVar);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public static void f(Map map, String str) {
        r0 r0Var;
        for (Map.Entry entry : map.entrySet()) {
            ConcurrentHashMap concurrentHashMap = d;
            String str2 = (String) entry.getKey();
            byte[] e6 = ((c) entry.getValue()).f1297a.e();
            int i2 = ((c) entry.getValue()).f1298b;
            a0 F = b0.F();
            F.e();
            b0.y((b0) F.f6859b, str);
            C0403h v6 = C0404i.v(e6, 0, e6.length);
            F.e();
            b0.z((b0) F.f6859b, v6);
            int c3 = C0928e.c(i2);
            if (c3 == 0) {
                r0Var = r0.TINK;
            } else if (c3 == 1) {
                r0Var = r0.LEGACY;
            } else if (c3 == 2) {
                r0Var = r0.RAW;
            } else if (c3 == 3) {
                r0Var = r0.CRUNCHY;
            } else {
                throw new IllegalArgumentException("Unknown output prefix type");
            }
            F.e();
            b0.A((b0) F.f6859b, r0Var);
            concurrentHashMap.put(str2, new g((b0) F.b()));
        }
    }

    public static synchronized void g(m mVar) {
        synchronized (n.class) {
            h hVar = h.f1305b;
            synchronized (hVar) {
                I3.h hVar2 = new I3.h((J2.n) hVar.f1306a.get());
                hVar2.H(mVar);
                hVar.f1306a.set(new J2.n(hVar2));
            }
        }
    }
}
