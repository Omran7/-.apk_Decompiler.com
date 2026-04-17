package O1;

import A1.a;
import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: O1.w  reason: case insensitive filesystem */
public final class C0107w extends a {
    public static final Parcelable.Creator<C0107w> CREATOR = new c(12);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2060a;

    public C0107w(boolean z3) {
        this.f2060a = z3;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0107w) && this.f2060a == ((C0107w) obj).f2060a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f2060a)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f2060a ? 1 : 0);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
