package Q1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;

public final class k extends a {
    public static final Parcelable.Creator<k> CREATOR = new w(4);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2419a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2420b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2421c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2422e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2423f;

    public k(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f2419a = z3;
        this.f2420b = z4;
        this.f2421c = z5;
        this.d = z6;
        this.f2422e = z7;
        this.f2423f = z8;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f2419a ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f2420b ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f2421c ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 5, 4);
        parcel.writeInt(this.f2422e ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 6, 4);
        parcel.writeInt(this.f2423f ? 1 : 0);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
