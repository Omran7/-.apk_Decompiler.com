package O2;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.C0416v;
import com.google.crypto.tink.shaded.protobuf.C0418x;
import com.google.crypto.tink.shaded.protobuf.Y;
import com.google.crypto.tink.shaded.protobuf.c0;
import q.C0928e;

public final class f0 extends C0418x {
    private static final f0 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile Y PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private Y keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    /* JADX WARNING: type inference failed for: r0v0, types: [O2.f0, com.google.crypto.tink.shaded.protobuf.x] */
    static {
        ? xVar = new C0418x();
        DEFAULT_INSTANCE = xVar;
        C0418x.v(f0.class, xVar);
    }

    public static void A(f0 f0Var) {
        Z z3 = Z.ENABLED;
        f0Var.getClass();
        f0Var.status_ = z3.a();
    }

    public static void B(f0 f0Var, int i2) {
        f0Var.keyId_ = i2;
    }

    public static e0 H() {
        return (e0) DEFAULT_INSTANCE.j();
    }

    public static void y(f0 f0Var, Y y6) {
        f0Var.getClass();
        f0Var.keyData_ = y6;
    }

    public static void z(f0 f0Var, r0 r0Var) {
        f0Var.getClass();
        f0Var.outputPrefixType_ = r0Var.e();
    }

    public final Y C() {
        Y y6 = this.keyData_;
        if (y6 == null) {
            return Y.B();
        }
        return y6;
    }

    public final int D() {
        return this.keyId_;
    }

    public final r0 E() {
        r0 a6 = r0.a(this.outputPrefixType_);
        if (a6 == null) {
            return r0.UNRECOGNIZED;
        }
        return a6;
    }

    public final Z F() {
        Z z3;
        int i2 = this.status_;
        if (i2 == 0) {
            z3 = Z.UNKNOWN_STATUS;
        } else if (i2 == 1) {
            z3 = Z.ENABLED;
        } else if (i2 == 2) {
            z3 = Z.DISABLED;
        } else if (i2 != 3) {
            z3 = null;
        } else {
            z3 = Z.DESTROYED;
        }
        if (z3 == null) {
            return Z.UNRECOGNIZED;
        }
        return z3;
    }

    public final boolean G() {
        if (this.keyData_ != null) {
            return true;
        }
        return false;
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
                return new c0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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
                    synchronized (f0.class) {
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
