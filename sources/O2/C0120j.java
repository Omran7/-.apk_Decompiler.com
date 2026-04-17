package O2;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0411p;
import com.google.crypto.tink.shaded.protobuf.C0416v;
import com.google.crypto.tink.shaded.protobuf.C0418x;
import com.google.crypto.tink.shaded.protobuf.Y;
import com.google.crypto.tink.shaded.protobuf.c0;
import q.C0928e;

/* renamed from: O2.j  reason: case insensitive filesystem */
public final class C0120j extends C0418x {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C0120j DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile Y PARSER;
    private C0124n aesCtrKeyFormat_;
    private T hmacKeyFormat_;

    /* JADX WARNING: type inference failed for: r0v0, types: [O2.j, com.google.crypto.tink.shaded.protobuf.x] */
    static {
        ? xVar = new C0418x();
        DEFAULT_INSTANCE = xVar;
        C0418x.v(C0120j.class, xVar);
    }

    public static C0119i C() {
        return (C0119i) DEFAULT_INSTANCE.j();
    }

    public static C0120j D(C0404i iVar, C0411p pVar) {
        return (C0120j) C0418x.t(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void y(C0120j jVar, C0124n nVar) {
        jVar.getClass();
        jVar.aesCtrKeyFormat_ = nVar;
    }

    public static void z(C0120j jVar, T t6) {
        jVar.getClass();
        jVar.hmacKeyFormat_ = t6;
    }

    public final C0124n A() {
        C0124n nVar = this.aesCtrKeyFormat_;
        if (nVar == null) {
            return C0124n.A();
        }
        return nVar;
    }

    public final T B() {
        T t6 = this.hmacKeyFormat_;
        if (t6 == null) {
            return T.A();
        }
        return t6;
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
                return new c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
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
                    synchronized (C0120j.class) {
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
