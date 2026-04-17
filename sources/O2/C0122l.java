package O2;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.C0403h;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0416v;
import com.google.crypto.tink.shaded.protobuf.C0418x;
import com.google.crypto.tink.shaded.protobuf.Y;
import com.google.crypto.tink.shaded.protobuf.c0;
import q.C0928e;

/* renamed from: O2.l  reason: case insensitive filesystem */
public final class C0122l extends C0418x {
    private static final C0122l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C0404i keyValue_ = C0404i.f6810b;
    private C0126p params_;
    private int version_;

    static {
        C0122l lVar = new C0122l();
        DEFAULT_INSTANCE = lVar;
        C0418x.v(C0122l.class, lVar);
    }

    public static void A(C0122l lVar, C0403h hVar) {
        lVar.getClass();
        lVar.keyValue_ = hVar;
    }

    public static C0122l B() {
        return DEFAULT_INSTANCE;
    }

    public static C0121k F() {
        return (C0121k) DEFAULT_INSTANCE.j();
    }

    public static void y(C0122l lVar) {
        lVar.version_ = 0;
    }

    public static void z(C0122l lVar, C0126p pVar) {
        lVar.getClass();
        pVar.getClass();
        lVar.params_ = pVar;
    }

    public final C0404i C() {
        return this.keyValue_;
    }

    public final C0126p D() {
        C0126p pVar = this.params_;
        if (pVar == null) {
            return C0126p.z();
        }
        return pVar;
    }

    public final int E() {
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
                return new c0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new C0122l();
            case 4:
                return new C0416v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case zzaky.zzf.zzf /*6*/:
                Y y7 = PARSER;
                Y y8 = y7;
                if (y7 == null) {
                    synchronized (C0122l.class) {
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
