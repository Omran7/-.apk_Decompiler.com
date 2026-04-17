package O2;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0411p;
import com.google.crypto.tink.shaded.protobuf.C0416v;
import com.google.crypto.tink.shaded.protobuf.C0418x;
import com.google.crypto.tink.shaded.protobuf.Y;
import com.google.crypto.tink.shaded.protobuf.c0;
import q.C0928e;

/* renamed from: O2.d  reason: case insensitive filesystem */
public final class C0114d extends C0418x {
    private static final C0114d DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Y PARSER;
    private int keySize_;
    private C0116f params_;

    /* JADX WARNING: type inference failed for: r0v0, types: [O2.d, com.google.crypto.tink.shaded.protobuf.x] */
    static {
        ? xVar = new C0418x();
        DEFAULT_INSTANCE = xVar;
        C0418x.v(C0114d.class, xVar);
    }

    public static C0113c C() {
        return (C0113c) DEFAULT_INSTANCE.j();
    }

    public static C0114d D(C0404i iVar, C0411p pVar) {
        return (C0114d) C0418x.t(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void y(C0114d dVar) {
        dVar.keySize_ = 32;
    }

    public static void z(C0114d dVar, C0116f fVar) {
        dVar.getClass();
        dVar.params_ = fVar;
    }

    public final int A() {
        return this.keySize_;
    }

    public final C0116f B() {
        C0116f fVar = this.params_;
        if (fVar == null) {
            return C0116f.z();
        }
        return fVar;
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
                return new c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
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
                    synchronized (C0114d.class) {
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
