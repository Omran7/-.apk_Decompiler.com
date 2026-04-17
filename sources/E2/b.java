package E2;

import J2.t;
import P2.p;
import android.os.Build;
import h0.C0552a;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final A5.b f613c = new A5.b(1);

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f614a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f615b;

    public b(byte[] bArr) {
        if (C0552a.e(2)) {
            p.a(bArr.length);
            this.f614a = new SecretKeySpec(bArr, "AES");
            this.f615b = true;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        Integer num;
        int i2;
        int length = bArr.length;
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            int i5 = t.f1330a;
            if (!Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                num = null;
            } else {
                num = Integer.valueOf(Build.VERSION.SDK_INT);
            }
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = -1;
            }
            if (i2 <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, length);
    }
}
