package J2;

import C2.b;
import O2.X;
import Q2.a;
import S3.z;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final i f1307b = new i();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f1308a = new AtomicReference(new s(new z(4)));

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, C2.b] */
    public final b a(o oVar) {
        AtomicReference atomicReference = this.f1308a;
        s sVar = (s) atomicReference.get();
        sVar.getClass();
        Class<o> cls = o.class;
        a aVar = (a) oVar.f1318b;
        if (!sVar.f1328b.containsKey(new q(cls, aVar))) {
            try {
                ? obj = new Object();
                ((X) oVar.d).ordinal();
                return obj;
            } catch (GeneralSecurityException e6) {
                throw new RuntimeException("Creating a LegacyProtoKey failed", e6);
            }
        } else {
            s sVar2 = (s) atomicReference.get();
            sVar2.getClass();
            q qVar = new q(cls, aVar);
            HashMap hashMap = sVar2.f1328b;
            if (hashMap.containsKey(qVar)) {
                return ((a) hashMap.get(qVar)).f1295b.c(oVar);
            }
            throw new GeneralSecurityException("No Key Parser for requested key type " + qVar + " available");
        }
    }

    public final synchronized void b(a aVar) {
        z zVar = new z((s) this.f1308a.get());
        zVar.F(aVar);
        this.f1308a.set(new s(zVar));
    }

    public final synchronized void c(b bVar) {
        z zVar = new z((s) this.f1308a.get());
        zVar.G(bVar);
        this.f1308a.set(new s(zVar));
    }

    public final synchronized void d(j jVar) {
        z zVar = new z((s) this.f1308a.get());
        zVar.H(jVar);
        this.f1308a.set(new s(zVar));
    }

    public final synchronized void e(k kVar) {
        z zVar = new z((s) this.f1308a.get());
        zVar.I(kVar);
        this.f1308a.set(new s(zVar));
    }
}
