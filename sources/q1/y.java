package Q1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;

public final class y extends a {
    public static final Parcelable.Creator<y> CREATOR = new w(1);

    /* renamed from: a  reason: collision with root package name */
    public final String f2427a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2428b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2429c;

    public y(String str, String str2, String str3) {
        this.f2429c = str;
        this.f2427a = str2;
        this.f2428b = str3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f2427a, false);
        android.support.v4.media.session.a.R0(parcel, 2, this.f2428b, false);
        android.support.v4.media.session.a.R0(parcel, 5, this.f2429c, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
