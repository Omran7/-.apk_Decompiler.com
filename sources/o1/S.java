package O1;

import A1.a;
import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

public final class S extends a {
    public static final Parcelable.Creator<S> CREATOR = new c(13);

    /* renamed from: a  reason: collision with root package name */
    public final String f2003a;

    public S(String str) {
        I.g(str);
        this.f2003a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof S)) {
            return false;
        }
        return this.f2003a.equals(((S) obj).f2003a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2003a});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f2003a, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
