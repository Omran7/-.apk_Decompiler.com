package O2;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.C0403h;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0406k;
import com.google.crypto.tink.shaded.protobuf.C0411p;
import com.google.crypto.tink.shaded.protobuf.C0416v;
import com.google.crypto.tink.shaded.protobuf.C0418x;
import com.google.crypto.tink.shaded.protobuf.Y;
import com.google.crypto.tink.shaded.protobuf.c0;
import java.io.ByteArrayInputStream;
import q.C0928e;

public final class N extends C0418x {
    private static final N DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile Y PARSER;
    private C0404i encryptedKeyset_ = C0404i.f6810b;
    private k0 keysetInfo_;

    static {
        N n2 = new N();
        DEFAULT_INSTANCE = n2;
        C0418x.v(N.class, n2);
    }

    public static M B() {
        return (M) DEFAULT_INSTANCE.j();
    }

    public static N C(ByteArrayInputStream byteArrayInputStream, C0411p pVar) {
        C0418x u6 = C0418x.u(DEFAULT_INSTANCE, new C0406k(byteArrayInputStream), pVar);
        C0418x.g(u6);
        return (N) u6;
    }

    public static void y(N n2, C0403h hVar) {
        n2.getClass();
        n2.encryptedKeyset_ = hVar;
    }

    public static void z(N n2, k0 k0Var) {
        n2.getClass();
        n2.keysetInfo_ = k0Var;
    }

    public final C0404i A() {
        return this.encryptedKeyset_;
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
                return new c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new N();
            case 4:
                return new C0416v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case zzaky.zzf.zzf /*6*/:
                Y y7 = PARSER;
                Y y8 = y7;
                if (y7 == null) {
                    synchronized (N.class) {
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
