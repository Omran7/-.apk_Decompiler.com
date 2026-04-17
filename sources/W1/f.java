package W1;

import A1.a;
import Q1.w;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.A;

public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new w(28);

    /* renamed from: a  reason: collision with root package name */
    public final int f4069a;

    /* renamed from: b  reason: collision with root package name */
    public final A f4070b;

    public f(int i2, A a6) {
        this.f4069a = i2;
        this.f4070b = a6;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f4069a);
        android.support.v4.media.session.a.Q0(parcel, 2, this.f4070b, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
