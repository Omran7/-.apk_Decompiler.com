package T1;

import A1.a;
import Q1.w;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: T1.d  reason: case insensitive filesystem */
public final class C0161d extends a {
    public static final Parcelable.Creator<C0161d> CREATOR = new w(13);

    /* renamed from: a  reason: collision with root package name */
    public final long f3268a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3269b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3270c;

    public C0161d(long j6, int i2, long j7) {
        this.f3268a = j6;
        this.f3269b = i2;
        this.f3270c = j7;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 8);
        parcel.writeLong(this.f3268a);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f3269b);
        android.support.v4.media.session.a.Y0(parcel, 3, 8);
        parcel.writeLong(this.f3270c);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
