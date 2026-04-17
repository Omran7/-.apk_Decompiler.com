package m0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.n;

/* renamed from: m0.s  reason: case insensitive filesystem */
public final class C0826s implements Parcelable {
    public static final Parcelable.Creator<C0826s> CREATOR = new n(18);

    /* renamed from: a  reason: collision with root package name */
    public int f10047a;

    /* renamed from: b  reason: collision with root package name */
    public int f10048b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10049c;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f10047a);
        parcel.writeInt(this.f10048b);
        parcel.writeInt(this.f10049c ? 1 : 0);
    }
}
