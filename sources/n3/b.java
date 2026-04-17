package N3;

import A2.f;
import q.C0928e;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f1902a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1903b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1904c;

    public b(String str, long j6, int i2) {
        this.f1902a = str;
        this.f1903b = j6;
        this.f1904c = i2;
    }

    public static f a() {
        f fVar = new f(3, (byte) 0);
        fVar.d = 0L;
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f1902a;
        if (str != null ? str.equals(bVar.f1902a) : bVar.f1902a == null) {
            if (this.f1903b == bVar.f1903b) {
                int i2 = bVar.f1904c;
                int i5 = this.f1904c;
                if (i5 == 0) {
                    if (i2 == 0) {
                        return true;
                    }
                } else if (C0928e.a(i5, i2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i5 = 0;
        String str = this.f1902a;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        long j6 = this.f1903b;
        int i6 = (((i2 ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        int i7 = this.f1904c;
        if (i7 != 0) {
            i5 = C0928e.c(i7);
        }
        return i5 ^ i6;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f1902a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f1903b);
        sb.append(", responseCode=");
        int i2 = this.f1904c;
        if (i2 == 1) {
            str = "OK";
        } else if (i2 == 2) {
            str = "BAD_CONFIG";
        } else if (i2 != 3) {
            str = "null";
        } else {
            str = "AUTH_ERROR";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
