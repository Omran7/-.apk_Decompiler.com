package c1;

import Z0.c;
import java.util.Arrays;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final c f5615a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5616b;

    public l(c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f5615a = cVar;
            this.f5616b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f5615a.equals(lVar.f5615a)) {
            return false;
        }
        return Arrays.equals(this.f5616b, lVar.f5616b);
    }

    public final int hashCode() {
        return ((this.f5615a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5616b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f5615a + ", bytes=[...]}";
    }
}
