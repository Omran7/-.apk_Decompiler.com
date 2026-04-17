package O2;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.C0397b;
import com.google.crypto.tink.shaded.protobuf.C0416v;
import com.google.crypto.tink.shaded.protobuf.C0418x;
import com.google.crypto.tink.shaded.protobuf.Y;
import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.c0;
import q.C0928e;

public final class k0 extends C0418x {
    private static final k0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile Y PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private A keyInfo_ = b0.d;
    private int primaryKeyId_;

    static {
        k0 k0Var = new k0();
        DEFAULT_INSTANCE = k0Var;
        C0418x.v(k0.class, k0Var);
    }

    public static h0 B() {
        return (h0) DEFAULT_INSTANCE.j();
    }

    public static void y(k0 k0Var, int i2) {
        k0Var.primaryKeyId_ = i2;
    }

    public static void z(k0 k0Var, j0 j0Var) {
        int i2;
        k0Var.getClass();
        A a6 = k0Var.keyInfo_;
        if (!((C0397b) a6).f6788a) {
            int size = a6.size();
            if (size == 0) {
                i2 = 10;
            } else {
                i2 = size * 2;
            }
            k0Var.keyInfo_ = a6.a(i2);
        }
        k0Var.keyInfo_.add(j0Var);
    }

    public final j0 A() {
        return (j0) this.keyInfo_.get(0);
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
                return new c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", j0.class});
            case 3:
                return new k0();
            case 4:
                return new C0416v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case zzaky.zzf.zzf /*6*/:
                Y y7 = PARSER;
                Y y8 = y7;
                if (y7 == null) {
                    synchronized (k0.class) {
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
