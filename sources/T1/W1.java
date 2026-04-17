package T1;

import A1.a;
import Q1.w;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;

public final class W1 extends a {
    public static final Parcelable.Creator<W1> CREATOR = new w(22);

    /* renamed from: a  reason: collision with root package name */
    public final int f3139a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3140b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3141c;
    public final Long d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3142e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3143f;

    /* renamed from: p  reason: collision with root package name */
    public final Double f3144p;

    public W1(int i2, String str, long j6, Long l6, Float f6, String str2, String str3, Double d6) {
        this.f3139a = i2;
        this.f3140b = str;
        this.f3141c = j6;
        this.d = l6;
        this.f3144p = i2 == 1 ? f6 != null ? Double.valueOf(f6.doubleValue()) : null : d6;
        this.f3142e = str2;
        this.f3143f = str3;
    }

    public final Object v() {
        Long l6 = this.d;
        if (l6 != null) {
            return l6;
        }
        Double d6 = this.f3144p;
        if (d6 != null) {
            return d6;
        }
        String str = this.f3142e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        w.b(this, parcel);
    }

    public W1(long j6, Object obj, String str, String str2) {
        I.d(str);
        this.f3139a = 2;
        this.f3140b = str;
        this.f3141c = j6;
        this.f3143f = str2;
        if (obj == null) {
            this.d = null;
            this.f3144p = null;
            this.f3142e = null;
        } else if (obj instanceof Long) {
            this.d = (Long) obj;
            this.f3144p = null;
            this.f3142e = null;
        } else if (obj instanceof String) {
            this.d = null;
            this.f3144p = null;
            this.f3142e = (String) obj;
        } else if (obj instanceof Double) {
            this.d = null;
            this.f3144p = (Double) obj;
            this.f3142e = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public W1(T1.X1 r7) {
        /*
            r6 = this;
            java.lang.String r4 = r7.f3153c
            java.lang.Object r3 = r7.f3154e
            java.lang.String r5 = r7.f3152b
            long r1 = r7.d
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.W1.<init>(T1.X1):void");
    }
}
