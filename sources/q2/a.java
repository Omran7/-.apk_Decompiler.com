package Q2;

import I1.b;
import java.util.Arrays;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f2433a;

    public a(byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f2433a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return new a(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Arrays.equals(((a) obj).f2433a, this.f2433a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2433a);
    }

    public final String toString() {
        return "Bytes(" + b.w(this.f2433a) + ")";
    }
}
