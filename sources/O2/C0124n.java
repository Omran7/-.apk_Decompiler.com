package O2;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.C0416v;
import com.google.crypto.tink.shaded.protobuf.C0418x;
import com.google.crypto.tink.shaded.protobuf.Y;
import com.google.crypto.tink.shaded.protobuf.c0;
import q.C0928e;

/* renamed from: O2.n  reason: case insensitive filesystem */
public final class C0124n extends C0418x {
    private static final C0124n DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile Y PARSER;
    private int keySize_;
    private C0126p params_;

    /* JADX WARNING: type inference failed for: r0v0, types: [O2.n, com.google.crypto.tink.shaded.protobuf.x] */
    static {
        ? xVar = new C0418x();
        DEFAULT_INSTANCE = xVar;
        C0418x.v(C0124n.class, xVar);
    }

    public static C0124n A() {
        return DEFAULT_INSTANCE;
    }

    public static C0123m D() {
        return (C0123m) DEFAULT_INSTANCE.j();
    }

    public static void y(C0124n nVar, C0126p pVar) {
        nVar.getClass();
        nVar.params_ = pVar;
    }

    public static void z(C0124n nVar, int i2) {
        nVar.keySize_ = i2;
    }

    public final int B() {
        return this.keySize_;
    }

    public final C0126p C() {
        C0126p pVar = this.params_;
        if (pVar == null) {
            return C0126p.z();
        }
        return pVar;
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
                return new c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
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
                    synchronized (C0124n.class) {
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
