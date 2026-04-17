package O2;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.C0403h;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0411p;
import com.google.crypto.tink.shaded.protobuf.C0416v;
import com.google.crypto.tink.shaded.protobuf.C0418x;
import com.google.crypto.tink.shaded.protobuf.Y;
import com.google.crypto.tink.shaded.protobuf.c0;
import q.C0928e;

public final class F extends C0418x {
    private static final F DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C0404i keyValue_ = C0404i.f6810b;
    private int version_;

    static {
        F f6 = new F();
        DEFAULT_INSTANCE = f6;
        C0418x.v(F.class, f6);
    }

    public static E C() {
        return (E) DEFAULT_INSTANCE.j();
    }

    public static F D(C0404i iVar, C0411p pVar) {
        return (F) C0418x.t(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void y(F f6) {
        f6.version_ = 0;
    }

    public static void z(F f6, C0403h hVar) {
        f6.getClass();
        f6.keyValue_ = hVar;
    }

    public final C0404i A() {
        return this.keyValue_;
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
                return new c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new F();
            case 4:
                return new C0416v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case zzaky.zzf.zzf /*6*/:
                Y y7 = PARSER;
                Y y8 = y7;
                if (y7 == null) {
                    synchronized (F.class) {
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
