package O2;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0411p;
import com.google.crypto.tink.shaded.protobuf.C0418x;
import com.google.crypto.tink.shaded.protobuf.Y;
import com.google.crypto.tink.shaded.protobuf.c0;
import q.C0928e;

public final class q0 extends C0418x {
    private static final q0 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile Y PARSER;
    private b0 dekTemplate_;
    private String kekUri_ = "";

    static {
        q0 q0Var = new q0();
        DEFAULT_INSTANCE = q0Var;
        C0418x.v(q0.class, q0Var);
    }

    public static q0 C(C0404i iVar, C0411p pVar) {
        return (q0) C0418x.t(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static q0 y() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.kekUri_;
    }

    public final boolean B() {
        if (this.dekTemplate_ != null) {
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
                return new c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new q0();
            case 4:
                return new K(DEFAULT_INSTANCE, 3);
            case 5:
                return DEFAULT_INSTANCE;
            case zzaky.zzf.zzf /*6*/:
                Y y7 = PARSER;
                Y y8 = y7;
                if (y7 == null) {
                    synchronized (q0.class) {
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

    public final b0 z() {
        b0 b0Var = this.dekTemplate_;
        if (b0Var == null) {
            return b0.B();
        }
        return b0Var;
    }
}
