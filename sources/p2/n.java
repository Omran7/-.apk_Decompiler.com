package P2;

import C2.j;
import N2.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

public final class n implements j {

    /* renamed from: a  reason: collision with root package name */
    public final a f2180a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2181b;

    public n(a aVar, int i2) {
        this.f2180a = aVar;
        this.f2181b = i2;
        if (i2 >= 10) {
            aVar.h(new byte[0], i2);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        if (!MessageDigest.isEqual(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public final byte[] b(byte[] bArr) {
        return this.f2180a.h(bArr, this.f2181b);
    }
}
