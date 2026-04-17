package android.support.v4.media.session;

import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0251c(8);

    /* renamed from: a  reason: collision with root package name */
    public int f4580a;

    /* renamed from: b  reason: collision with root package name */
    public int f4581b;

    /* renamed from: c  reason: collision with root package name */
    public int f4582c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f4583e;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f4580a);
        parcel.writeInt(this.f4582c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f4583e);
        parcel.writeInt(this.f4581b);
    }
}
