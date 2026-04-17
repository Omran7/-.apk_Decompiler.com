package O1;

import A1.a;
import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

public final class F extends a {
    public static final Parcelable.Creator<F> CREATOR = new c(22);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1983a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1984b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1985c;
    public final String d;

    public F(String str, String str2, String str3, byte[] bArr) {
        I.g(bArr);
        this.f1983a = bArr;
        I.g(str);
        this.f1984b = str;
        this.f1985c = str2;
        I.g(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f6 = (F) obj;
        if (!Arrays.equals(this.f1983a, f6.f1983a) || !I.j(this.f1984b, f6.f1984b) || !I.j(this.f1985c, f6.f1985c) || !I.j(this.d, f6.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1983a, this.f1984b, this.f1985c, this.d});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.K0(parcel, 2, this.f1983a, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f1984b, false);
        android.support.v4.media.session.a.R0(parcel, 4, this.f1985c, false);
        android.support.v4.media.session.a.R0(parcel, 5, this.d, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
