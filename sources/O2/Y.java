package O2;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.C0403h;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0416v;
import com.google.crypto.tink.shaded.protobuf.C0418x;
import com.google.crypto.tink.shaded.protobuf.c0;
import q.C0928e;

public final class Y extends C0418x {
    private static final Y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private C0404i value_ = C0404i.f6810b;

    static {
        Y y6 = new Y();
        DEFAULT_INSTANCE = y6;
        C0418x.v(Y.class, y6);
    }

    public static void A(Y y6, X x6) {
        y6.getClass();
        if (x6 != X.UNRECOGNIZED) {
            y6.keyMaterialType_ = x6.f2096a;
        } else {
            x6.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static Y B() {
        return DEFAULT_INSTANCE;
    }

    public static W F() {
        return (W) DEFAULT_INSTANCE.j();
    }

    public static void y(Y y6, String str) {
        y6.getClass();
        str.getClass();
        y6.typeUrl_ = str;
    }

    public static void z(Y y6, C0403h hVar) {
        y6.getClass();
        y6.value_ = hVar;
    }

    public final X C() {
        X x6;
        int i2 = this.keyMaterialType_;
        if (i2 == 0) {
            x6 = X.UNKNOWN_KEYMATERIAL;
        } else if (i2 == 1) {
            x6 = X.SYMMETRIC;
        } else if (i2 == 2) {
            x6 = X.ASYMMETRIC_PRIVATE;
        } else if (i2 == 3) {
            x6 = X.ASYMMETRIC_PUBLIC;
        } else if (i2 != 4) {
            x6 = null;
        } else {
            x6 = X.REMOTE;
        }
        if (x6 == null) {
            return X.UNRECOGNIZED;
        }
        return x6;
    }

    public final String D() {
        return this.typeUrl_;
    }

    public final C0404i E() {
        return this.value_;
    }

    /* JADX WARNING: type inference failed for: r4v15, types: [java.lang.Object, com.google.crypto.tink.shaded.protobuf.Y] */
    public final Object k(int i2) {
        com.google.crypto.tink.shaded.protobuf.Y y6;
        switch (C0928e.c(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new c0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new Y();
            case 4:
                return new C0416v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case zzaky.zzf.zzf /*6*/:
                com.google.crypto.tink.shaded.protobuf.Y y7 = PARSER;
                com.google.crypto.tink.shaded.protobuf.Y y8 = y7;
                if (y7 == null) {
                    synchronized (Y.class) {
                        try {
                            com.google.crypto.tink.shaded.protobuf.Y y9 = PARSER;
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
