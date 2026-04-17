package W0;

import Q1.w;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.j;

/* renamed from: W0.m  reason: case insensitive filesystem */
public final class C0241m extends y implements Parcelable {
    public static final Parcelable.Creator<C0241m> CREATOR = new w(24);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        j.e(parcel, "dest");
        parcel.writeParcelable(this.f4052a, i2);
        parcel.writeParcelable(this.f4053b, i2);
        parcel.writeSerializable(this.f4054c);
        parcel.writeFloatArray(this.d);
        parcel.writeParcelable(this.f4055e, i2);
        parcel.writeParcelable(this.f4056f, i2);
        parcel.writeInt(this.f4057p);
        parcel.writeInt(this.f4058q);
    }
}
