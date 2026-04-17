package P2;

import C2.a;
import C2.j;
import com.bumptech.glide.d;
import com.google.android.gms.common.api.f;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final l f2171a;

    /* renamed from: b  reason: collision with root package name */
    public final j f2172b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2173c;

    public g(l lVar, j jVar, int i2) {
        this.f2171a = lVar;
        this.f2172b = jVar;
        this.f2173c = i2;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        a aVar = (a) this.f2171a;
        aVar.getClass();
        int length = bArr.length;
        int i2 = aVar.f2155b;
        int i5 = f.API_PRIORITY_OTHER - i2;
        if (length <= i5) {
            byte[] bArr3 = new byte[(bArr.length + i2)];
            byte[] a6 = o.a(i2);
            System.arraycopy(a6, 0, bArr3, 0, i2);
            aVar.a(bArr, 0, bArr.length, bArr3, aVar.f2155b, a6, true);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            return d.i(bArr3, this.f2172b.b(d.i(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
        }
        throw new GeneralSecurityException(com.google.android.gms.internal.measurement.a.f(i5, "plaintext length can not exceed "));
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i2 = this.f2173c;
        if (length >= i2) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i2);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i2, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.f2172b.a(copyOfRange2, d.i(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
            a aVar = (a) this.f2171a;
            aVar.getClass();
            int length2 = copyOfRange.length;
            int i5 = aVar.f2155b;
            if (length2 >= i5) {
                byte[] bArr3 = new byte[i5];
                System.arraycopy(copyOfRange, 0, bArr3, 0, i5);
                int length3 = copyOfRange.length;
                int i6 = aVar.f2155b;
                byte[] bArr4 = new byte[(length3 - i6)];
                aVar.a(copyOfRange, i6, copyOfRange.length - i6, bArr4, 0, bArr3, false);
                return bArr4;
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
