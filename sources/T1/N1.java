package T1;

import A1.a;
import Q1.w;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class N1 extends a {
    public static final Parcelable.Creator<N1> CREATOR = new w(21);

    /* renamed from: a  reason: collision with root package name */
    public final List f2997a;

    public N1(List list) {
        this.f2997a = list;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.V0(parcel, 1, this.f2997a, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
