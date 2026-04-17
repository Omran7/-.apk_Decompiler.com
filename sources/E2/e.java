package E2;

import h0.C0552a;
import java.security.GeneralSecurityException;

public final class e extends f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f619c;

    public e(byte[] bArr, int i2) {
        this.f619c = i2;
        if (C0552a.d(1)) {
            this.f620a = l(bArr, 1);
            this.f621b = l(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public final d l(byte[] bArr, int i2) {
        switch (this.f619c) {
            case 0:
                return new c(bArr, i2, 0);
            default:
                return new c(bArr, i2, 1);
        }
    }
}
