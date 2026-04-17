package C2;

import I1.b;
import java.util.Arrays;

public final class l implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f449a;

    public l(byte[] bArr) {
        this.f449a = Arrays.copyOf(bArr, bArr.length);
    }

    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        byte[] bArr = this.f449a;
        int length = bArr.length;
        byte[] bArr2 = lVar.f449a;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b6 = bArr[i2];
            byte b7 = lVar.f449a[i2];
            if (b6 != b7) {
                return b6 - b7;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        return Arrays.equals(this.f449a, ((l) obj).f449a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f449a);
    }

    public final String toString() {
        return b.w(this.f449a);
    }
}
