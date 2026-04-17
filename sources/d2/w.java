package D2;

import C2.a;
import C2.e;
import C2.n;
import I2.b;
import J2.d;
import O2.b0;
import com.google.crypto.tink.shaded.protobuf.C0396a;
import com.google.crypto.tink.shaded.protobuf.C0403h;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.D;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

public final class w implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f557c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final b0 f558a;

    /* renamed from: b  reason: collision with root package name */
    public final b f559b;

    public w(b0 b0Var, b bVar) {
        this.f558a = b0Var;
        this.f559b = bVar;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        d dVar;
        C0396a i2;
        b0 b0Var = this.f558a;
        AtomicReference atomicReference = n.f450a;
        synchronized (n.class) {
            try {
                dVar = ((e) n.f450a.get()).a(b0Var.D()).f434a;
                Class cls = dVar.f1301c;
                if (!dVar.f1300b.keySet().contains(cls)) {
                    if (!Void.class.equals(cls)) {
                        String obj = dVar.toString();
                        String name = cls.getName();
                        throw new IllegalArgumentException("Given internalKeyMananger " + obj + " does not support primitive class " + name);
                    }
                }
                if (((Boolean) n.f452c.get(b0Var.D())).booleanValue()) {
                    C0404i E6 = b0Var.E();
                    C0.a d = dVar.d();
                    C0396a m6 = d.m(E6);
                    d.n(m6);
                    i2 = d.i(m6);
                } else {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + b0Var.D());
                }
            } catch (D e6) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) dVar.d().f398a).getName()), e6);
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] e7 = i2.e();
        byte[] a6 = this.f559b.a(e7, f557c);
        byte[] a7 = ((a) n.c(this.f558a.D(), C0404i.v(e7, 0, e7.length), a.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(a6.length + 4 + a7.length).putInt(a6.length).put(a6).put(a7).array();
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i2 = wrap.getInt();
            if (i2 <= 0 || i2 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i2];
            wrap.get(bArr3, 0, i2);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] b6 = this.f559b.b(bArr3, f557c);
            String D4 = this.f558a.D();
            AtomicReference atomicReference = n.f450a;
            C0403h hVar = C0404i.f6810b;
            return ((a) n.c(D4, C0404i.v(b6, 0, b6.length), a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e6) {
            e = e6;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e7) {
            e = e7;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e8) {
            e = e8;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
