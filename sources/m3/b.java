package M3;

import h0.C0552a;
import q.C0928e;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f1829a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1830b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1831c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final long f1832e;

    /* renamed from: f  reason: collision with root package name */
    public final long f1833f;
    public final String g;

    public b(String str, int i2, String str2, String str3, long j6, long j7, String str4) {
        this.f1829a = str;
        this.f1830b = i2;
        this.f1831c = str2;
        this.d = str3;
        this.f1832e = j6;
        this.f1833f = j7;
        this.g = str4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, M3.a] */
    public final a a() {
        ? obj = new Object();
        obj.f1824a = this.f1829a;
        obj.f1825b = this.f1830b;
        obj.f1826c = this.f1831c;
        obj.d = this.d;
        obj.f1827e = Long.valueOf(this.f1832e);
        obj.f1828f = Long.valueOf(this.f1833f);
        obj.g = this.g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f1829a;
        if (str != null ? str.equals(bVar.f1829a) : bVar.f1829a == null) {
            if (C0928e.a(this.f1830b, bVar.f1830b)) {
                String str2 = bVar.f1831c;
                String str3 = this.f1831c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = bVar.d;
                    String str5 = this.d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.f1832e == bVar.f1832e && this.f1833f == bVar.f1833f) {
                            String str6 = bVar.g;
                            String str7 = this.g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
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
        int i6;
        int i7 = 0;
        String str = this.f1829a;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int c3 = (((i2 ^ 1000003) * 1000003) ^ C0928e.c(this.f1830b)) * 1000003;
        String str2 = this.f1831c;
        if (str2 == null) {
            i5 = 0;
        } else {
            i5 = str2.hashCode();
        }
        int i8 = (c3 ^ i5) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            i6 = 0;
        } else {
            i6 = str3.hashCode();
        }
        long j6 = this.f1832e;
        long j7 = this.f1833f;
        int i9 = (((((i8 ^ i6) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        String str4 = this.g;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i7 ^ i9;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f1829a);
        sb.append(", registrationStatus=");
        int i2 = this.f1830b;
        if (i2 == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i2 == 2) {
            str = "NOT_GENERATED";
        } else if (i2 == 3) {
            str = "UNREGISTERED";
        } else if (i2 == 4) {
            str = "REGISTERED";
        } else if (i2 != 5) {
            str = "null";
        } else {
            str = "REGISTER_ERROR";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.f1831c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.f1832e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f1833f);
        sb.append(", fisError=");
        return C0552a.r(sb, this.g, "}");
    }
}
