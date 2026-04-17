package W1;

import A1.a;
import Q1.w;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.B;
import z1.C1132b;

public final class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new w(29);

    /* renamed from: a  reason: collision with root package name */
    public final int f4071a;

    /* renamed from: b  reason: collision with root package name */
    public final C1132b f4072b;

    /* renamed from: c  reason: collision with root package name */
    public final B f4073c;

    public g(int i2, C1132b bVar, B b6) {
        this.f4071a = i2;
        this.f4072b = bVar;
        this.f4073c = b6;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f4071a);
        android.support.v4.media.session.a.Q0(parcel, 2, this.f4072b, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 3, this.f4073c, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
