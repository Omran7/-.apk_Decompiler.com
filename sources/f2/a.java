package F2;

import A5.b;
import P2.o;
import P2.p;
import h0.C0552a;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a implements C2.a {

    /* renamed from: b  reason: collision with root package name */
    public static final b f729b = new b(2);

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f730a;

    public a(byte[] bArr) {
        p.a(bArr.length);
        this.f730a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(byte[] bArr, int i2) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i2);
        } catch (ClassNotFoundException unused) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                return new IvParameterSpec(bArr, 0, i2);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 28)];
            byte[] a6 = o.a(12);
            System.arraycopy(a6, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c3 = c(a6, a6.length);
            b bVar = f729b;
            ((Cipher) bVar.get()).init(1, this.f730a, c3);
            if (!(bArr2 == null || bArr2.length == 0)) {
                ((Cipher) bVar.get()).updateAAD(bArr2);
            }
            int doFinal = ((Cipher) bVar.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(C0552a.k(doFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec c3 = c(bArr, 12);
            b bVar = f729b;
            ((Cipher) bVar.get()).init(2, this.f730a, c3);
            if (!(bArr2 == null || bArr2.length == 0)) {
                ((Cipher) bVar.get()).updateAAD(bArr2);
            }
            return ((Cipher) bVar.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
