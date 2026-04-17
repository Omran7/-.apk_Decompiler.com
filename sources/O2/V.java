package O2;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.C0416v;
import com.google.crypto.tink.shaded.protobuf.C0418x;
import com.google.crypto.tink.shaded.protobuf.Y;
import com.google.crypto.tink.shaded.protobuf.c0;
import q.C0928e;

public final class V extends C0418x {
    private static final V DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile Y PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.x, O2.V] */
    static {
        ? xVar = new C0418x();
        DEFAULT_INSTANCE = xVar;
        C0418x.v(V.class, xVar);
    }

    public static V A() {
        return DEFAULT_INSTANCE;
    }

    public static U D() {
        return (U) DEFAULT_INSTANCE.j();
    }

    public static void y(V v6, O o6) {
        v6.getClass();
        v6.hash_ = o6.a();
    }

    public static void z(V v6, int i2) {
        v6.tagSize_ = i2;
    }

    public final O B() {
        O o6;
        int i2 = this.hash_;
        if (i2 == 0) {
            o6 = O.UNKNOWN_HASH;
        } else if (i2 == 1) {
            o6 = O.SHA1;
        } else if (i2 == 2) {
            o6 = O.SHA384;
        } else if (i2 == 3) {
            o6 = O.SHA256;
        } else if (i2 == 4) {
            o6 = O.SHA512;
        } else if (i2 != 5) {
            o6 = null;
        } else {
            o6 = O.SHA224;
        }
        if (o6 == null) {
            return O.UNRECOGNIZED;
        }
        return o6;
    }

    public final int C() {
        return this.tagSize_;
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
                return new c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
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
                    synchronized (V.class) {
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
