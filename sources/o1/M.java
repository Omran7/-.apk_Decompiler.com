package O1;

import A1.a;
import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class M extends a {
    public static final Parcelable.Creator<M> CREATOR = new c(26);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1996a;

    public M(boolean z3) {
        this.f1996a = z3;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof M) && this.f1996a == ((M) obj).f1996a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f1996a)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f1996a ? 1 : 0);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
