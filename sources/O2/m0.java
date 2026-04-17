package O2;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0411p;
import com.google.crypto.tink.shaded.protobuf.C0416v;
import com.google.crypto.tink.shaded.protobuf.C0418x;
import com.google.crypto.tink.shaded.protobuf.Y;
import com.google.crypto.tink.shaded.protobuf.c0;
import q.C0928e;

public final class m0 extends C0418x {
    private static final m0 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private n0 params_;
    private int version_;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.x, O2.m0] */
    static {
        ? xVar = new C0418x();
        DEFAULT_INSTANCE = xVar;
        C0418x.v(m0.class, xVar);
    }

    public static l0 C() {
        return (l0) DEFAULT_INSTANCE.j();
    }

    public static m0 D(C0404i iVar, C0411p pVar) {
        return (m0) C0418x.t(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void y(m0 m0Var) {
        m0Var.version_ = 0;
    }

    public static void z(m0 m0Var, n0 n0Var) {
        m0Var.getClass();
        n0Var.getClass();
        m0Var.params_ = n0Var;
    }

    public final n0 A() {
        n0 n0Var = this.params_;
        if (n0Var == null) {
            return n0.y();
        }
        return n0Var;
    }

    public final int B() {
        return this.version_;
    }

    /* JADX WARNING: type inference failed for: r4v15, types: [java.lang.Object, com.google.crypto.tink.shaded.protobuf.Y] */
    public final Object k(int i2) {
        Y y6;
        switch (C0928e.c(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new C0418x();
            case 4:
                return new C0416v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case zzaky.zzf.zzf /*6*/:
                Y y7 = PARSER;
                Y y8 = y7;
                if (y7 == null) {
                    synchronized (m0.class) {
                        try {
                            Y y9 = PARSER;
                            y6 = y9;
                            if (y9 == null) {
                                ? obj = new Object();
                                PARSER = obj;
                                y6 = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    y8 = y6;
                }
                return y8;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
