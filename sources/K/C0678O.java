package k;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.material.datepicker.n;

/* renamed from: k.O  reason: case insensitive filesystem */
public final class C0678O extends View.BaseSavedState {
    public static final Parcelable.Creator<C0678O> CREATOR = new n(16);

    /* renamed from: a  reason: collision with root package name */
    public boolean f9214a;

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.f9214a ? (byte) 1 : 0);
    }
}
