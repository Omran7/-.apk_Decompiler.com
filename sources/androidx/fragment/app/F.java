package androidx.fragment.app;

import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;

public final class F implements Parcelable {
    public static final Parcelable.Creator<F> CREATOR = new C0251c(12);

    /* renamed from: a  reason: collision with root package name */
    public String f4978a;

    /* renamed from: b  reason: collision with root package name */
    public int f4979b;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f4978a);
        parcel.writeInt(this.f4979b);
    }
}
