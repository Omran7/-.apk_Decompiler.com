package E1;

import A1.a;
import D1.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new c(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f606a;

    /* renamed from: b  reason: collision with root package name */
    public final String f607b;

    /* renamed from: c  reason: collision with root package name */
    public final a f608c;

    public g(a aVar, String str) {
        this.f606a = 1;
        this.f607b = str;
        this.f608c = aVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f606a);
        android.support.v4.media.session.a.R0(parcel, 2, this.f607b, false);
        android.support.v4.media.session.a.Q0(parcel, 3, this.f608c, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public g(a aVar, String str, int i2) {
        this.f606a = i2;
        this.f607b = str;
        this.f608c = aVar;
    }
}
