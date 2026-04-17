package g2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.material.datepicker.n;
import h0.C0552a;

public final class b extends View.BaseSavedState {
    public static final Parcelable.Creator<b> CREATOR = new n(15);

    /* renamed from: a  reason: collision with root package name */
    public int f7984a;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i2 = this.f7984a;
        if (i2 == 1) {
            str = "checked";
        } else if (i2 != 2) {
            str = "unchecked";
        } else {
            str = "indeterminate";
        }
        return C0552a.r(sb, str, "}");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(Integer.valueOf(this.f7984a));
    }
}
