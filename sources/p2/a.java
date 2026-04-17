package P2;

import A5.b;
import h0.C0552a;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a implements l {
    public static final b d = new b(4);

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f2154a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2155b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2156c;

    public a(byte[] bArr, int i2) {
        if (C0552a.e(2)) {
            p.a(bArr.length);
            this.f2154a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) d.get()).getBlockSize();
            this.f2156c = blockSize;
            if (i2 < 12 || i2 > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f2155b = i2;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final void a(byte[] bArr, int i2, int i5, byte[] bArr2, int i6, byte[] bArr3, boolean z3) {
        Cipher cipher = (Cipher) d.get();
        byte[] bArr4 = new byte[this.f2156c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f2155b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f2154a;
        if (z3) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i2, i5, bArr2, i6) != i5) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
