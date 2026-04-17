package b1;

import java.util.Arrays;

public final class k extends r {

    /* renamed from: a  reason: collision with root package name */
    public final long f5489a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f5490b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5491c;
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5492e;

    /* renamed from: f  reason: collision with root package name */
    public final long f5493f;
    public final n g;

    public k(long j6, Integer num, long j7, byte[] bArr, String str, long j8, n nVar) {
        this.f5489a = j6;
        this.f5490b = num;
        this.f5491c = j7;
        this.d = bArr;
        this.f5492e = str;
        this.f5493f = j8;
        this.g = nVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        k kVar = (k) rVar;
        if (this.f5489a == kVar.f5489a && ((num = this.f5490b) != null ? num.equals(kVar.f5490b) : kVar.f5490b == null)) {
            if (this.f5491c == kVar.f5491c) {
                if (rVar instanceof k) {
                    bArr = ((k) rVar).d;
                } else {
                    bArr = kVar.d;
                }
                if (Arrays.equals(this.d, bArr)) {
                    String str = kVar.f5492e;
                    String str2 = this.f5492e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f5493f == kVar.f5493f) {
                            n nVar = kVar.g;
                            n nVar2 = this.g;
                            if (nVar2 == null) {
                                if (nVar == null) {
                                    return true;
                                }
                            } else if (nVar2.equals(nVar)) {
                                return true;
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
        int i5;
        long j6 = this.f5489a;
        int i6 = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        int i7 = 0;
        Integer num = this.f5490b;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.hashCode();
        }
        long j7 = this.f5491c;
        int hashCode = (((((i6 ^ i2) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.f5492e;
        if (str == null) {
            i5 = 0;
        } else {
            i5 = str.hashCode();
        }
        long j8 = this.f5493f;
        int i8 = (((hashCode ^ i5) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        n nVar = this.g;
        if (nVar != null) {
            i7 = nVar.hashCode();
        }
        return i8 ^ i7;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f5489a + ", eventCode=" + this.f5490b + ", eventUptimeMs=" + this.f5491c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.f5492e + ", timezoneOffsetSeconds=" + this.f5493f + ", networkConnectionInfo=" + this.g + "}";
    }
}
