package okhttp3.internal.publicsuffix;

import N5.b;
import N5.k;
import N5.n;
import N5.p;
import N5.w;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import okhttp3.internal.Util;

public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f10932e = {42};

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f10933f = new String[0];
    public static final String[] g = {"*"};
    public static final PublicSuffixDatabase h = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f10934a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f10935b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f10936c;
    public byte[] d;

    public static String a(byte[] bArr, byte[][] bArr2, int i2) {
        int i5;
        boolean z3;
        byte b6;
        int i6;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i7 = 0;
        while (i7 < length) {
            int i8 = (i7 + length) / 2;
            while (i8 > -1 && bArr3[i8] != 10) {
                i8--;
            }
            int i9 = i8 + 1;
            int i10 = 1;
            while (true) {
                i5 = i9 + i10;
                if (bArr3[i5] == 10) {
                    break;
                }
                i10++;
            }
            int i11 = i5 - i9;
            int i12 = i2;
            boolean z4 = false;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (z4) {
                    b6 = 46;
                    z3 = false;
                } else {
                    z3 = z4;
                    b6 = bArr4[i12][i13] & 255;
                }
                i6 = b6 - (bArr3[i9 + i14] & 255);
                if (i6 == 0) {
                    i14++;
                    i13++;
                    if (i14 == i11) {
                        break;
                    } else if (bArr4[i12].length != i13) {
                        z4 = z3;
                    } else if (i12 == bArr4.length - 1) {
                        break;
                    } else {
                        i12++;
                        i13 = -1;
                        z4 = true;
                    }
                } else {
                    break;
                }
            }
            if (i6 >= 0) {
                if (i6 <= 0) {
                    int i15 = i11 - i14;
                    int length2 = bArr4[i12].length - i13;
                    while (true) {
                        i12++;
                        if (i12 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i12].length;
                    }
                    if (length2 >= i15) {
                        if (length2 <= i15) {
                            return new String(bArr3, i9, i11, Util.f10688i);
                        }
                    }
                }
                i7 = i5 + 1;
            }
            length = i8;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [N5.w, java.lang.Object] */
    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            Logger logger = n.f1948a;
            p pVar = new p(new k(new b((w) new Object(), resourceAsStream)));
            try {
                byte[] bArr = new byte[pVar.m()];
                pVar.l(bArr);
                byte[] bArr2 = new byte[pVar.m()];
                pVar.l(bArr2);
                synchronized (this) {
                    this.f10936c = bArr;
                    this.d = bArr2;
                }
                this.f10935b.countDown();
            } finally {
                Util.e(pVar);
            }
        }
    }
}
