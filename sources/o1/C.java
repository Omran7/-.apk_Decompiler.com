package O1;

import A1.a;
import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

public final class C extends a {
    public static final Parcelable.Creator<C> CREATOR = new c(20);

    /* renamed from: a  reason: collision with root package name */
    public final String f1979a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1980b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1981c;

    public C(String str, String str2, String str3) {
        I.g(str);
        this.f1979a = str;
        I.g(str2);
        this.f1980b = str2;
        this.f1981c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        C c3 = (C) obj;
        if (!I.j(this.f1979a, c3.f1979a) || !I.j(this.f1980b, c3.f1980b) || !I.j(this.f1981c, c3.f1981c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1979a, this.f1980b, this.f1981c});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 2, this.f1979a, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f1980b, false);
        android.support.v4.media.session.a.R0(parcel, 4, this.f1981c, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
