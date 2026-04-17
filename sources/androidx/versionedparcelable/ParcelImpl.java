package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import s1.b;
import v0.C1038b;
import v0.C1039c;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(21);

    /* renamed from: a  reason: collision with root package name */
    public final C1039c f5447a;

    public ParcelImpl(Parcel parcel) {
        this.f5447a = new C1038b(parcel).h();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        new C1038b(parcel).k(this.f5447a);
    }
}
