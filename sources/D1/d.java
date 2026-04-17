package D1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;

public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new c(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f510a;

    /* renamed from: b  reason: collision with root package name */
    public final String f511b;

    /* renamed from: c  reason: collision with root package name */
    public final int f512c;

    public d(int i2, String str, int i5) {
        this.f510a = i2;
        this.f511b = str;
        this.f512c = i5;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f510a);
        android.support.v4.media.session.a.R0(parcel, 2, this.f511b, false);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f512c);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public d(String str, int i2) {
        this.f510a = 1;
        this.f511b = str;
        this.f512c = i2;
    }
}
