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

/* renamed from: O2.b  reason: case insensitive filesystem */
public final class C0112b extends C0418x {
    private static final C0112b DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile Y PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C0404i keyValue_ = C0404i.f6810b;
    private C0116f params_;
    private int version_;

    static {
        C0112b bVar = new C0112b();
        DEFAULT_INSTANCE = bVar;
        C0418x.v(C0112b.class, bVar);
    }

    public static void A(C0112b bVar, C0116f fVar) {
        bVar.getClass();
        fVar.getClass();
        bVar.params_ = fVar;
    }

    public static C0111a E() {
        return (C0111a) DEFAULT_INSTANCE.j();
    }

    public static C0112b F(C0404i iVar, C0411p pVar) {
        return (C0112b) C0418x.t(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void y(C0112b bVar) {
        bVar.version_ = 0;
    }

    public static void z(C0112b bVar, C0403h hVar) {
        bVar.getClass();
        bVar.keyValue_ = hVar;
    }

    public final C0404i B() {
        return this.keyValue_;
    }

    public final C0116f C() {
        C0116f fVar = this.params_;
        if (fVar == null) {
            return C0116f.z();
        }
        return fVar;
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
                return new c0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new C0112b();
            case 4:
                return new C0416v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case zzaky.zzf.zzf /*6*/:
                Y y7 = PARSER;
                Y y8 = y7;
                if (y7 == null) {
                    synchronized (C0112b.class) {
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
