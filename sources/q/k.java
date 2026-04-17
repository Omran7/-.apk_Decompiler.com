package Q;

import O1.W;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class k extends View.BaseSavedState {
    public static final Parcelable.Creator<k> CREATOR = new W(26);

    /* renamed from: a  reason: collision with root package name */
    public int f2332a;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2332a + "}";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f2332a);
    }
}
