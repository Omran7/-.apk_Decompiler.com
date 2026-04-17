package b1;

import h0.C0552a;

public final class h extends C0312a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f5478a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5479b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5480c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5481e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5482f;
    public final String g;
    public final String h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5483i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5484j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5485k;

    /* renamed from: l  reason: collision with root package name */
    public final String f5486l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f5478a = num;
        this.f5479b = str;
        this.f5480c = str2;
        this.d = str3;
        this.f5481e = str4;
        this.f5482f = str5;
        this.g = str6;
        this.h = str7;
        this.f5483i = str8;
        this.f5484j = str9;
        this.f5485k = str10;
        this.f5486l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0312a)) {
            return false;
        }
        C0312a aVar = (C0312a) obj;
        Integer num = this.f5478a;
        if (num != null ? num.equals(((h) aVar).f5478a) : ((h) aVar).f5478a == null) {
            String str = this.f5479b;
            if (str != null ? str.equals(((h) aVar).f5479b) : ((h) aVar).f5479b == null) {
                String str2 = this.f5480c;
                if (str2 != null ? str2.equals(((h) aVar).f5480c) : ((h) aVar).f5480c == null) {
                    String str3 = this.d;
                    if (str3 != null ? str3.equals(((h) aVar).d) : ((h) aVar).d == null) {
                        String str4 = this.f5481e;
                        if (str4 != null ? str4.equals(((h) aVar).f5481e) : ((h) aVar).f5481e == null) {
                            String str5 = this.f5482f;
                            if (str5 != null ? str5.equals(((h) aVar).f5482f) : ((h) aVar).f5482f == null) {
                                String str6 = this.g;
                                if (str6 != null ? str6.equals(((h) aVar).g) : ((h) aVar).g == null) {
                                    String str7 = this.h;
                                    if (str7 != null ? str7.equals(((h) aVar).h) : ((h) aVar).h == null) {
                                        String str8 = this.f5483i;
                                        if (str8 != null ? str8.equals(((h) aVar).f5483i) : ((h) aVar).f5483i == null) {
                                            String str9 = this.f5484j;
                                            if (str9 != null ? str9.equals(((h) aVar).f5484j) : ((h) aVar).f5484j == null) {
                                                String str10 = this.f5485k;
                                                if (str10 != null ? str10.equals(((h) aVar).f5485k) : ((h) aVar).f5485k == null) {
                                                    String str11 = this.f5486l;
                                                    if (str11 == null) {
                                                        if (((h) aVar).f5486l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((h) aVar).f5486l)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
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
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        Integer num = this.f5478a;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.hashCode();
        }
        int i16 = (i2 ^ 1000003) * 1000003;
        String str = this.f5479b;
        if (str == null) {
            i5 = 0;
        } else {
            i5 = str.hashCode();
        }
        int i17 = (i16 ^ i5) * 1000003;
        String str2 = this.f5480c;
        if (str2 == null) {
            i6 = 0;
        } else {
            i6 = str2.hashCode();
        }
        int i18 = (i17 ^ i6) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            i7 = 0;
        } else {
            i7 = str3.hashCode();
        }
        int i19 = (i18 ^ i7) * 1000003;
        String str4 = this.f5481e;
        if (str4 == null) {
            i8 = 0;
        } else {
            i8 = str4.hashCode();
        }
        int i20 = (i19 ^ i8) * 1000003;
        String str5 = this.f5482f;
        if (str5 == null) {
            i9 = 0;
        } else {
            i9 = str5.hashCode();
        }
        int i21 = (i20 ^ i9) * 1000003;
        String str6 = this.g;
        if (str6 == null) {
            i10 = 0;
        } else {
            i10 = str6.hashCode();
        }
        int i22 = (i21 ^ i10) * 1000003;
        String str7 = this.h;
        if (str7 == null) {
            i11 = 0;
        } else {
            i11 = str7.hashCode();
        }
        int i23 = (i22 ^ i11) * 1000003;
        String str8 = this.f5483i;
        if (str8 == null) {
            i12 = 0;
        } else {
            i12 = str8.hashCode();
        }
        int i24 = (i23 ^ i12) * 1000003;
        String str9 = this.f5484j;
        if (str9 == null) {
            i13 = 0;
        } else {
            i13 = str9.hashCode();
        }
        int i25 = (i24 ^ i13) * 1000003;
        String str10 = this.f5485k;
        if (str10 == null) {
            i14 = 0;
        } else {
            i14 = str10.hashCode();
        }
        int i26 = (i25 ^ i14) * 1000003;
        String str11 = this.f5486l;
        if (str11 != null) {
            i15 = str11.hashCode();
        }
        return i15 ^ i26;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f5478a);
        sb.append(", model=");
        sb.append(this.f5479b);
        sb.append(", hardware=");
        sb.append(this.f5480c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.f5481e);
        sb.append(", osBuild=");
        sb.append(this.f5482f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.f5483i);
        sb.append(", country=");
        sb.append(this.f5484j);
        sb.append(", mccMnc=");
        sb.append(this.f5485k);
        sb.append(", applicationBuild=");
        return C0552a.r(sb, this.f5486l, "}");
    }
}
