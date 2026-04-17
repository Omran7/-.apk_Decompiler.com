package O2;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.C0397b;
import com.google.crypto.tink.shaded.protobuf.C0406k;
import com.google.crypto.tink.shaded.protobuf.C0411p;
import com.google.crypto.tink.shaded.protobuf.C0416v;
import com.google.crypto.tink.shaded.protobuf.C0418x;
import com.google.crypto.tink.shaded.protobuf.Y;
import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.c0;
import java.io.ByteArrayInputStream;
import java.util.List;
import q.C0928e;

public final class g0 extends C0418x {
    private static final g0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile Y PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private A key_ = b0.d;
    private int primaryKeyId_;

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        C0418x.v(g0.class, g0Var);
    }

    public static d0 E() {
        return (d0) DEFAULT_INSTANCE.j();
    }

    public static g0 F(ByteArrayInputStream byteArrayInputStream, C0411p pVar) {
        C0418x u6 = C0418x.u(DEFAULT_INSTANCE, new C0406k(byteArrayInputStream), pVar);
        C0418x.g(u6);
        return (g0) u6;
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [java.io.IOException] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static O2.g0 G(byte[] r8, com.google.crypto.tink.shaded.protobuf.C0411p r9) {
        /*
            O2.g0 r0 = DEFAULT_INSTANCE
            int r5 = r8.length
            com.google.crypto.tink.shaded.protobuf.x r0 = r0.s()
            com.google.crypto.tink.shaded.protobuf.a0 r1 = com.google.crypto.tink.shaded.protobuf.a0.f6785c     // Catch:{ D -> 0x0030, f0 -> 0x002e, IOException -> 0x002c, IndexOutOfBoundsException -> 0x0032 }
            r1.getClass()     // Catch:{ D -> 0x0030, f0 -> 0x002e, IOException -> 0x002c, IndexOutOfBoundsException -> 0x0032 }
            java.lang.Class r2 = r0.getClass()     // Catch:{ D -> 0x0030, f0 -> 0x002e, IOException -> 0x002c, IndexOutOfBoundsException -> 0x0032 }
            com.google.crypto.tink.shaded.protobuf.d0 r7 = r1.a(r2)     // Catch:{ D -> 0x0030, f0 -> 0x002e, IOException -> 0x002c, IndexOutOfBoundsException -> 0x0032 }
            a1.c r6 = new a1.c     // Catch:{ D -> 0x0030, f0 -> 0x002e, IOException -> 0x002c, IndexOutOfBoundsException -> 0x0032 }
            r6.<init>()     // Catch:{ D -> 0x0030, f0 -> 0x002e, IOException -> 0x002c, IndexOutOfBoundsException -> 0x0032 }
            r9.getClass()     // Catch:{ D -> 0x0030, f0 -> 0x002e, IOException -> 0x002c, IndexOutOfBoundsException -> 0x0032 }
            r4 = 0
            r1 = r7
            r2 = r0
            r3 = r8
            r1.b(r2, r3, r4, r5, r6)     // Catch:{ D -> 0x0030, f0 -> 0x002e, IOException -> 0x002c, IndexOutOfBoundsException -> 0x0032 }
            r7.d(r0)     // Catch:{ D -> 0x0030, f0 -> 0x002e, IOException -> 0x002c, IndexOutOfBoundsException -> 0x0032 }
            com.google.crypto.tink.shaded.protobuf.C0418x.g(r0)
            O2.g0 r0 = (O2.g0) r0
            return r0
        L_0x002c:
            r8 = move-exception
            goto L_0x0037
        L_0x002e:
            r8 = move-exception
            goto L_0x0050
        L_0x0030:
            r8 = move-exception
            goto L_0x005a
        L_0x0032:
            com.google.crypto.tink.shaded.protobuf.D r8 = com.google.crypto.tink.shaded.protobuf.D.g()
            throw r8
        L_0x0037:
            java.lang.Throwable r9 = r8.getCause()
            boolean r9 = r9 instanceof com.google.crypto.tink.shaded.protobuf.D
            if (r9 == 0) goto L_0x0046
            java.lang.Throwable r8 = r8.getCause()
            com.google.crypto.tink.shaded.protobuf.D r8 = (com.google.crypto.tink.shaded.protobuf.D) r8
            throw r8
        L_0x0046:
            com.google.crypto.tink.shaded.protobuf.D r9 = new com.google.crypto.tink.shaded.protobuf.D
            java.lang.String r0 = r8.getMessage()
            r9.<init>(r0, r8)
            throw r9
        L_0x0050:
            com.google.crypto.tink.shaded.protobuf.D r9 = new com.google.crypto.tink.shaded.protobuf.D
            java.lang.String r8 = r8.getMessage()
            r9.<init>(r8)
            throw r9
        L_0x005a:
            boolean r9 = r8.f6744a
            if (r9 == 0) goto L_0x0068
            com.google.crypto.tink.shaded.protobuf.D r9 = new com.google.crypto.tink.shaded.protobuf.D
            java.lang.String r0 = r8.getMessage()
            r9.<init>(r0, r8)
            r8 = r9
        L_0x0068:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.g0.G(byte[], com.google.crypto.tink.shaded.protobuf.p):O2.g0");
    }

    public static void y(g0 g0Var, int i2) {
        g0Var.primaryKeyId_ = i2;
    }

    public static void z(g0 g0Var, f0 f0Var) {
        int i2;
        g0Var.getClass();
        A a6 = g0Var.key_;
        if (!((C0397b) a6).f6788a) {
            int size = a6.size();
            if (size == 0) {
                i2 = 10;
            } else {
                i2 = size * 2;
            }
            g0Var.key_ = a6.a(i2);
        }
        g0Var.key_.add(f0Var);
    }

    public final f0 A(int i2) {
        return (f0) this.key_.get(i2);
    }

    public final int B() {
        return this.key_.size();
    }

    public final List C() {
        return this.key_;
    }

    public final int D() {
        return this.primaryKeyId_;
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
                return new c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", f0.class});
            case 3:
                return new g0();
            case 4:
                return new C0416v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case zzaky.zzf.zzf /*6*/:
                Y y7 = PARSER;
                Y y8 = y7;
                if (y7 == null) {
                    synchronized (g0.class) {
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
