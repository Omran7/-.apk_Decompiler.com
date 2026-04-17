package O2;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0411p;
import com.google.crypto.tink.shaded.protobuf.C0416v;
import com.google.crypto.tink.shaded.protobuf.C0418x;
import com.google.crypto.tink.shaded.protobuf.Y;
import com.google.crypto.tink.shaded.protobuf.c0;
import q.C0928e;

/* renamed from: O2.h  reason: case insensitive filesystem */
public final class C0118h extends C0418x {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C0118h DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C0122l aesCtrKey_;
    private Q hmacKey_;
    private int version_;

    /* JADX WARNING: type inference failed for: r0v0, types: [O2.h, com.google.crypto.tink.shaded.protobuf.x] */
    static {
        ? xVar = new C0418x();
        DEFAULT_INSTANCE = xVar;
        C0418x.v(C0118h.class, xVar);
    }

    public static void A(C0118h hVar, Q q6) {
        hVar.getClass();
        q6.getClass();
        hVar.hmacKey_ = q6;
    }

    public static C0117g E() {
        return (C0117g) DEFAULT_INSTANCE.j();
    }

    public static C0118h F(C0404i iVar, C0411p pVar) {
        return (C0118h) C0418x.t(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void y(C0118h hVar) {
        hVar.version_ = 0;
    }

    public static void z(C0118h hVar, C0122l lVar) {
        hVar.getClass();
        lVar.getClass();
        hVar.aesCtrKey_ = lVar;
    }

    public final C0122l B() {
        C0122l lVar = this.aesCtrKey_;
        if (lVar == null) {
            return C0122l.B();
        }
        return lVar;
    }

    public final Q C() {
        Q q6 = this.hmacKey_;
        if (q6 == null) {
            return Q.B();
        }
        return q6;
    }

    public final int D() {
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
                return new c0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
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
                    synchronized (C0118h.class) {
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
