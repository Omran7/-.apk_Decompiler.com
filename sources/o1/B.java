package O1;

import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.Arrays;

public final class B extends C0097l {
    public static final Parcelable.Creator<B> CREATOR = new c(19);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1971a;

    /* renamed from: b  reason: collision with root package name */
    public final Double f1972b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1973c;
    public final ArrayList d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f1974e;

    /* renamed from: f  reason: collision with root package name */
    public final L f1975f;

    /* renamed from: p  reason: collision with root package name */
    public final V f1976p;

    /* renamed from: q  reason: collision with root package name */
    public final C0091f f1977q;

    /* renamed from: r  reason: collision with root package name */
    public final Long f1978r;

    public B(byte[] bArr, Double d6, String str, ArrayList arrayList, Integer num, L l6, String str2, C0091f fVar, Long l7) {
        I.g(bArr);
        this.f1971a = bArr;
        this.f1972b = d6;
        I.g(str);
        this.f1973c = str;
        this.d = arrayList;
        this.f1974e = num;
        this.f1975f = l6;
        this.f1978r = l7;
        if (str2 != null) {
            try {
                this.f1976p = V.a(str2);
            } catch (U e6) {
                throw new IllegalArgumentException(e6);
            }
        } else {
            this.f1976p = null;
        }
        this.f1977q = fVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        B b6 = (B) obj;
        if (Arrays.equals(this.f1971a, b6.f1971a) && I.j(this.f1972b, b6.f1972b) && I.j(this.f1973c, b6.f1973c)) {
            ArrayList arrayList = this.d;
            ArrayList arrayList2 = b6.d;
            if (((arrayList != null || arrayList2 != null) && (arrayList == null || arrayList2 == null || !arrayList.containsAll(arrayList2) || !arrayList2.containsAll(arrayList))) || !I.j(this.f1974e, b6.f1974e) || !I.j(this.f1975f, b6.f1975f) || !I.j(this.f1976p, b6.f1976p) || !I.j(this.f1977q, b6.f1977q) || !I.j(this.f1978r, b6.f1978r)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f1971a)), this.f1972b, this.f1973c, this.d, this.f1974e, this.f1975f, this.f1976p, this.f1977q, this.f1978r});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        String str;
        int W02 = a.W0(20293, parcel);
        a.K0(parcel, 2, this.f1971a, false);
        a.L0(parcel, 3, this.f1972b);
        a.R0(parcel, 4, this.f1973c, false);
        a.V0(parcel, 5, this.d, false);
        a.O0(parcel, 6, this.f1974e);
        a.Q0(parcel, 7, this.f1975f, i2, false);
        V v6 = this.f1976p;
        if (v6 == null) {
            str = null;
        } else {
            str = v6.f2006a;
        }
        a.R0(parcel, 8, str, false);
        a.Q0(parcel, 9, this.f1977q, i2, false);
        a.P0(parcel, 10, this.f1978r);
        a.X0(W02, parcel);
    }
}
