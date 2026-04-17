package O2;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.C0403h;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0416v;
import com.google.crypto.tink.shaded.protobuf.C0418x;
import com.google.crypto.tink.shaded.protobuf.Y;
import com.google.crypto.tink.shaded.protobuf.c0;
import q.C0928e;

public final class b0 extends C0418x {
    private static final b0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile Y PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private C0404i value_ = C0404i.f6810b;

    static {
        b0 b0Var = new b0();
        DEFAULT_INSTANCE = b0Var;
        C0418x.v(b0.class, b0Var);
    }

    public static void A(b0 b0Var, r0 r0Var) {
        b0Var.getClass();
        b0Var.outputPrefixType_ = r0Var.e();
    }

    public static b0 B() {
        return DEFAULT_INSTANCE;
    }

    public static a0 F() {
        return (a0) DEFAULT_INSTANCE.j();
    }

    public static void y(b0 b0Var, String str) {
        b0Var.getClass();
        str.getClass();
        b0Var.typeUrl_ = str;
    }

    public static void z(b0 b0Var, C0403h hVar) {
        b0Var.getClass();
        b0Var.value_ = hVar;
    }

    public final r0 C() {
        r0 a6 = r0.a(this.outputPrefixType_);
        if (a6 == null) {
            return r0.UNRECOGNIZED;
        }
        return a6;
    }

    public final String D() {
        return this.typeUrl_;
    }

    public final C0404i E() {
        return this.value_;
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
                return new c0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new b0();
            case 4:
                return new C0416v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case zzaky.zzf.zzf /*6*/:
                Y y7 = PARSER;
                Y y8 = y7;
                if (y7 == null) {
                    synchronized (b0.class) {
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
