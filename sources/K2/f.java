package K2;

import D2.l;
import J2.a;
import J2.b;
import J2.j;
import J2.k;
import J2.t;
import O2.r0;
import java.security.GeneralSecurityException;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final k f1483a = new k(e.class);

    /* renamed from: b  reason: collision with root package name */
    public static final j f1484b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f1485c = new b(a.class);
    public static final a d;

    static {
        Q2.a b6 = t.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f1484b = new j(b6);
        d = new a(b6, new l(9));
    }

    public static d a(r0 r0Var) {
        int ordinal = r0Var.ordinal();
        if (ordinal == 1) {
            return d.f1469c;
        }
        if (ordinal == 2) {
            return d.f1470e;
        }
        if (ordinal == 3) {
            return d.f1471f;
        }
        if (ordinal == 4) {
            return d.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.e());
    }
}
