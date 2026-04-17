package O1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: O1.h  reason: case insensitive filesystem */
public final class C0093h extends a {
    public static final Parcelable.Creator<C0093h> CREATOR = new W(3);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2034a;

    public C0093h(boolean z3) {
        this.f2034a = z3;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0093h) && this.f2034a == ((C0093h) obj).f2034a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f2034a)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f2034a ? 1 : 0);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
