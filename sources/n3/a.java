package N3;

import q.C0928e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f1898a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1899b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1900c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1901e;

    public a(String str, String str2, String str3, b bVar, int i2) {
        this.f1898a = str;
        this.f1899b = str2;
        this.f1900c = str3;
        this.d = bVar;
        this.f1901e = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f1898a;
        if (str != null ? str.equals(aVar.f1898a) : aVar.f1898a == null) {
            String str2 = this.f1899b;
            if (str2 != null ? str2.equals(aVar.f1899b) : aVar.f1899b == null) {
                String str3 = this.f1900c;
                if (str3 != null ? str3.equals(aVar.f1900c) : aVar.f1900c == null) {
                    b bVar = this.d;
                    if (bVar != null ? bVar.equals(aVar.d) : aVar.d == null) {
                        int i2 = this.f1901e;
                        if (i2 == 0) {
                            if (aVar.f1901e == 0) {
                                return true;
                            }
                        } else if (C0928e.a(i2, aVar.f1901e)) {
                            return true;
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
        int i7;
        int i8 = 0;
        String str = this.f1898a;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i9 = (i2 ^ 1000003) * 1000003;
        String str2 = this.f1899b;
        if (str2 == null) {
            i5 = 0;
        } else {
            i5 = str2.hashCode();
        }
        int i10 = (i9 ^ i5) * 1000003;
        String str3 = this.f1900c;
        if (str3 == null) {
            i6 = 0;
        } else {
            i6 = str3.hashCode();
        }
        int i11 = (i10 ^ i6) * 1000003;
        b bVar = this.d;
        if (bVar == null) {
            i7 = 0;
        } else {
            i7 = bVar.hashCode();
        }
        int i12 = (i11 ^ i7) * 1000003;
        int i13 = this.f1901e;
        if (i13 != 0) {
            i8 = C0928e.c(i13);
        }
        return i8 ^ i12;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f1898a);
        sb.append(", fid=");
        sb.append(this.f1899b);
        sb.append(", refreshToken=");
        sb.append(this.f1900c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i2 = this.f1901e;
        if (i2 == 1) {
            str = "OK";
        } else if (i2 != 2) {
            str = "null";
        } else {
            str = "BAD_CONFIG";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
