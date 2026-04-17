package K2;

import J2.a;
import J2.b;
import J2.j;
import J2.k;
import J2.t;
import O2.O;
import O2.r0;
import java.security.GeneralSecurityException;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final k f1492a = new k(k.class);

    /* renamed from: b  reason: collision with root package name */
    public static final j f1493b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f1494c = new b(j.class);
    public static final a d;

    static {
        Q2.a b6 = t.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f1493b = new j(b6);
        d = new a(b6, new D2.l(11));
    }

    public static d a(O o6) {
        int ordinal = o6.ordinal();
        if (ordinal == 1) {
            return d.g;
        }
        if (ordinal == 2) {
            return d.f1473j;
        }
        if (ordinal == 3) {
            return d.f1472i;
        }
        if (ordinal == 4) {
            return d.f1474k;
        }
        if (ordinal == 5) {
            return d.h;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + o6.a());
    }

    public static d b(r0 r0Var) {
        int ordinal = r0Var.ordinal();
        if (ordinal == 1) {
            return d.f1475l;
        }
        if (ordinal == 2) {
            return d.f1477n;
        }
        if (ordinal == 3) {
            return d.f1478o;
        }
        if (ordinal == 4) {
            return d.f1476m;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.e());
    }
}
