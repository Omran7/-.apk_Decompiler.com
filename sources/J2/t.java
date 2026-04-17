package J2;

import Q2.a;
import java.nio.charset.Charset;
import java.security.SecureRandom;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f1330a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static int a() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b6 = 0;
        while (b6 == 0) {
            secureRandom.nextBytes(bArr);
            b6 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b6;
    }

    public static final a b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt < '!' || charAt > '~') {
                throw new RuntimeException("Not a printable ASCII character: " + charAt);
            }
            bArr[i2] = (byte) charAt;
        }
        return a.a(bArr);
    }
}
