package O1;

import A1.a;
import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class P extends a {
    public static final Parcelable.Creator<P> CREATOR = new c(10);

    /* renamed from: a  reason: collision with root package name */
    public final long f2001a;

    public P(long j6) {
        this.f2001a = Long.valueOf(j6).longValue();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof P) && this.f2001a == ((P) obj).f2001a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f2001a)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 8);
        parcel.writeLong(this.f2001a);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
