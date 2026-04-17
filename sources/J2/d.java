package J2;

import C0.a;
import D2.f;
import O2.X;
import com.google.crypto.tink.shaded.protobuf.C0396a;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public final Class f1299a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f1300b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f1301c;

    public d(Class cls, f... fVarArr) {
        this.f1299a = cls;
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
            this.f1301c = fVarArr[0].f518a;
        } else {
            this.f1301c = Void.class;
        }
        this.f1300b = Collections.unmodifiableMap(hashMap);
    }

    public int a() {
        return 1;
    }

    public abstract String b();

    public final Object c(C0396a aVar, Class cls) {
        f fVar = (f) this.f1300b.get(cls);
        if (fVar != null) {
            return fVar.a(aVar);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a d();

    public abstract X e();

    public abstract C0396a f(C0404i iVar);

    public abstract void g(C0396a aVar);
}
