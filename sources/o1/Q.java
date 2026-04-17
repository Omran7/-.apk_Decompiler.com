package O1;

import A1.a;
import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class Q extends a {
    public static final Parcelable.Creator<Q> CREATOR = new c(11);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2002a;

    public Q(boolean z3) {
        this.f2002a = Boolean.valueOf(z3).booleanValue();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Q) && this.f2002a == ((Q) obj).f2002a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f2002a)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f2002a ? 1 : 0);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
