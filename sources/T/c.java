package T;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: b  reason: collision with root package name */
    public static final a f2791b = new c();

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable f2792a;

    public c() {
        this.f2792a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f2792a, i2);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2792a = parcelable == f2791b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2792a = readParcelable == null ? f2791b : readParcelable;
    }
}
