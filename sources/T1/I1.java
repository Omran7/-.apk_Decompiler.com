package T1;

import A1.a;
import Q1.w;
import android.os.Parcel;
import android.os.Parcelable;

public final class I1 extends a {
    public static final Parcelable.Creator<I1> CREATOR = new w(18);

    /* renamed from: a  reason: collision with root package name */
    public final String f2966a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2967b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2968c;

    public I1(String str, long j6, int i2) {
        this.f2966a = str;
        this.f2967b = j6;
        this.f2968c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f2966a, false);
        android.support.v4.media.session.a.Y0(parcel, 2, 8);
        parcel.writeLong(this.f2967b);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f2968c);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
