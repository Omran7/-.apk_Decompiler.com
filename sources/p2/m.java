package P2;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import y1.l;

public final class m extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f2179a;

    public m(l lVar) {
        this.f2179a = lVar;
    }

    public final Object initialValue() {
        l lVar = this.f2179a;
        try {
            Mac mac = (Mac) j.f2177c.f2178a.b((String) lVar.f12679c);
            mac.init((SecretKeySpec) lVar.d);
            return mac;
        } catch (GeneralSecurityException e6) {
            throw new IllegalStateException(e6);
        }
    }
}
