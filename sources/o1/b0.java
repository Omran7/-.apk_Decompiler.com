package O1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class b0 extends a {
    public static final Parcelable.Creator<b0> CREATOR = new W(15);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2016a;

    public b0(boolean z3) {
        this.f2016a = Boolean.valueOf(z3).booleanValue();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b0) && this.f2016a == ((b0) obj).f2016a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f2016a)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f2016a ? 1 : 0);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
