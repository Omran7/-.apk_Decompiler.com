package D2;

import B0.C0009h;
import C2.i;
import C2.j;
import O2.B;
import O2.C0112b;
import O2.C0118h;
import O2.C0122l;
import O2.C0133x;
import O2.F;
import O2.J;
import O2.O;
import O2.Q;
import O2.m0;
import O2.p0;
import O2.r;
import O2.u0;
import P2.a;
import P2.b;
import P2.c;
import P2.d;
import P2.g;
import P2.l;
import P2.n;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.C0396a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Class f518a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f519b;

    public f(int i2, Class cls) {
        this.f519b = i2;
        this.f518a = cls;
    }

    public final Object a(C0396a aVar) {
        switch (this.f519b) {
            case 0:
                C0118h hVar = (C0118h) aVar;
                Class<l> cls = l.class;
                f[] fVarArr = {new f(1, cls)};
                HashMap hashMap = new HashMap();
                int length = fVarArr.length;
                int i2 = 0;
                while (i2 < length) {
                    f fVar = fVarArr[i2];
                    boolean containsKey = hashMap.containsKey(fVar.f518a);
                    Class cls2 = fVar.f518a;
                    if (!containsKey) {
                        hashMap.put(cls2, fVar);
                        i2++;
                    } else {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls2.getCanonicalName());
                    }
                }
                if (fVarArr.length > 0) {
                    Class cls3 = fVarArr[0].f518a;
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                C0122l B6 = hVar.B();
                f fVar2 = (f) unmodifiableMap.get(cls);
                if (fVar2 != null) {
                    l lVar = (l) fVar2.a(B6);
                    Class<j> cls4 = j.class;
                    f[] fVarArr2 = {new f(11, cls4)};
                    HashMap hashMap2 = new HashMap();
                    int length2 = fVarArr2.length;
                    int i5 = 0;
                    while (i5 < length2) {
                        f fVar3 = fVarArr2[i5];
                        boolean containsKey2 = hashMap2.containsKey(fVar3.f518a);
                        Class cls5 = fVar3.f518a;
                        if (!containsKey2) {
                            hashMap2.put(cls5, fVar3);
                            i5++;
                        } else {
                            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls5.getCanonicalName());
                        }
                    }
                    if (fVarArr2.length > 0) {
                        Class cls6 = fVarArr2[0].f518a;
                    }
                    Map unmodifiableMap2 = Collections.unmodifiableMap(hashMap2);
                    Q C6 = hVar.C();
                    f fVar4 = (f) unmodifiableMap2.get(cls4);
                    if (fVar4 != null) {
                        return new g(lVar, (j) fVar4.a(C6), hVar.C().D().C());
                    }
                    throw new IllegalArgumentException("Requested primitive class " + cls4.getCanonicalName() + " not supported.");
                }
                throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
            case 1:
                C0122l lVar2 = (C0122l) aVar;
                return new a(lVar2.C().x(), lVar2.D().A());
            case 2:
                r rVar = (r) aVar;
                return new b(rVar.B().x(), rVar.C().A());
            case 3:
                return new c(((C0133x) aVar).A().x(), 0);
            case 4:
                return new F2.a(((B) aVar).A().x());
            case 5:
                return new c(((J) aVar).A().x(), 1);
            case zzaky.zzf.zzf /*6*/:
                String z3 = ((m0) aVar).A().z();
                return i.a(z3).c(z3);
            case zzaky.zzf.zzg /*7*/:
                p0 p0Var = (p0) aVar;
                String A6 = p0Var.A().A();
                return new w(p0Var.A().z(), i.a(A6).c(A6));
            case 8:
                return new c(((u0) aVar).A().x(), 2);
            case 9:
                return new d(((F) aVar).A().x());
            case 10:
                C0112b bVar = (C0112b) aVar;
                return new n(new C0009h(bVar.B().x()), bVar.C().A());
            default:
                Q q6 = (Q) aVar;
                O B7 = q6.D().B();
                SecretKeySpec secretKeySpec = new SecretKeySpec(q6.C().x(), "HMAC");
                int C7 = q6.D().C();
                int ordinal = B7.ordinal();
                if (ordinal == 1) {
                    return new n(new y1.l("HMACSHA1", secretKeySpec), C7);
                }
                if (ordinal == 2) {
                    return new n(new y1.l("HMACSHA384", secretKeySpec), C7);
                }
                if (ordinal == 3) {
                    return new n(new y1.l("HMACSHA256", secretKeySpec), C7);
                }
                if (ordinal == 4) {
                    return new n(new y1.l("HMACSHA512", secretKeySpec), C7);
                }
                if (ordinal == 5) {
                    return new n(new y1.l("HMACSHA224", secretKeySpec), C7);
                }
                throw new GeneralSecurityException("unknown hash");
        }
    }
}
