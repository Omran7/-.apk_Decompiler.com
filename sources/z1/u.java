package z1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import s1.b;

public final class u extends a {
    public static final Parcelable.Creator<u> CREATOR = new b(29);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12843a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12844b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12845c;
    public final int d;

    public u(int i2, int i5, String str, boolean z3) {
        this.f12843a = z3;
        this.f12844b = str;
        this.f12845c = v5.a.b(i2) - 1;
        this.d = m.b(i5) - 1;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f12843a ? 1 : 0);
        android.support.v4.media.session.a.R0(parcel, 2, this.f12844b, false);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f12845c);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(this.d);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
