package r0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.material.datepicker.n;

public final class k extends View.BaseSavedState {
    public static final Parcelable.Creator<k> CREATOR = new n(24);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11166a;

    public k(Parcelable parcelable, boolean z3) {
        super(parcelable);
        this.f11166a = z3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.f11166a ? (byte) 1 : 0);
    }

    public k(Parcel parcel) {
        super(parcel);
        this.f11166a = parcel.readByte() != 0;
    }
}
