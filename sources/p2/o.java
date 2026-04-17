package P2;

import A5.b;
import java.security.SecureRandom;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2182a = new b(7);

    public static byte[] a(int i2) {
        byte[] bArr = new byte[i2];
        ((SecureRandom) f2182a.get()).nextBytes(bArr);
        return bArr;
    }
}
