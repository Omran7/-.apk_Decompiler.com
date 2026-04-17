package D1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f507a;

    /* renamed from: b  reason: collision with root package name */
    public final a f508b;

    public b(int i2, a aVar) {
        this.f507a = i2;
        this.f508b = aVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f507a);
        android.support.v4.media.session.a.Q0(parcel, 2, this.f508b, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public b(a aVar) {
        this.f507a = 1;
        this.f508b = aVar;
    }
}
