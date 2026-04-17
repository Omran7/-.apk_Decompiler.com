package b1;

import java.util.ArrayList;

public final class l extends s {

    /* renamed from: a  reason: collision with root package name */
    public final long f5494a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5495b;

    /* renamed from: c  reason: collision with root package name */
    public final j f5496c;
    public final Integer d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5497e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f5498f;

    public l(long j6, long j7, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f5508a;
        this.f5494a = j6;
        this.f5495b = j7;
        this.f5496c = jVar;
        this.d = num;
        this.f5497e = str;
        this.f5498f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f5494a == lVar.f5494a) {
            if (this.f5495b == lVar.f5495b) {
                if (this.f5496c.equals(lVar.f5496c)) {
                    Integer num = lVar.d;
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = lVar.f5497e;
                        String str2 = this.f5497e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (this.f5498f.equals(lVar.f5498f)) {
                                w wVar = w.f5508a;
                                if (wVar.equals(wVar)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        long j6 = this.f5494a;
        long j7 = this.f5495b;
        int hashCode = (((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f5496c.hashCode()) * 1000003;
        int i5 = 0;
        Integer num = this.d;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.hashCode();
        }
        int i6 = (hashCode ^ i2) * 1000003;
        String str = this.f5497e;
        if (str != null) {
            i5 = str.hashCode();
        }
        return ((((i6 ^ i5) * 1000003) ^ this.f5498f.hashCode()) * 1000003) ^ w.f5508a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f5494a + ", requestUptimeMs=" + this.f5495b + ", clientInfo=" + this.f5496c + ", logSource=" + this.d + ", logSourceName=" + this.f5497e + ", logEvents=" + this.f5498f + ", qosTier=" + w.f5508a + "}";
    }
}
