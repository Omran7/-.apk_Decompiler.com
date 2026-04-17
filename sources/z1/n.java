package z1;

import G1.c;
import com.google.android.gms.common.internal.I;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

public final /* synthetic */ class n implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f12825a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f12826b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f12827c;

    public /* synthetic */ n(boolean z3, String str, q qVar) {
        this.f12825a = z3;
        this.f12826b = str;
        this.f12827c = qVar;
    }

    public final Object call() {
        String str;
        MessageDigest messageDigest;
        q qVar = this.f12827c;
        boolean z3 = this.f12825a;
        String str2 = this.f12826b;
        if (z3 || !s.a(str2, qVar, true, false).f12851a) {
            str = "not allowed";
        } else {
            str = "debug cert rejected";
        }
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    break;
                }
                i2++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        I.g(messageDigest);
        byte[] digest = messageDigest.digest(qVar.f12832c);
        int length = digest.length;
        char[] cArr = new char[(length + length)];
        int i5 = 0;
        for (byte b6 : digest) {
            char[] cArr2 = c.f825b;
            cArr[i5] = cArr2[(b6 & 255) >>> 4];
            cArr[i5 + 1] = cArr2[b6 & 15];
            i5 += 2;
        }
        return str + ": pkg=" + str2 + ", sha256=" + new String(cArr) + ", atk=" + z3 + ", ver=12451000.false";
    }
}
