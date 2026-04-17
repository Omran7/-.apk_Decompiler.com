package d1;

import q.C0928e;

/* renamed from: d1.a  reason: case insensitive filesystem */
public final class C0458a {

    /* renamed from: a  reason: collision with root package name */
    public final int f7502a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7503b;

    public C0458a(int i2, long j6) {
        if (i2 != 0) {
            this.f7502a = i2;
            this.f7503b = j6;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0458a)) {
            return false;
        }
        C0458a aVar = (C0458a) obj;
        if (!C0928e.a(this.f7502a, aVar.f7502a) || this.f7503b != aVar.f7503b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j6 = this.f7503b;
        return ((C0928e.c(this.f7502a) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i2 = this.f7502a;
        if (i2 == 1) {
            str = "OK";
        } else if (i2 == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i2 == 3) {
            str = "FATAL_ERROR";
        } else if (i2 != 4) {
            str = "null";
        } else {
            str = "INVALID_PAYLOAD";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f7503b);
        sb.append("}");
        return sb.toString();
    }
}
