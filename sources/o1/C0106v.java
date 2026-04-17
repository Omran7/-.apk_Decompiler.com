package O1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

/* renamed from: O1.v  reason: case insensitive filesystem */
public final class C0106v extends a {
    public static final Parcelable.Creator<C0106v> CREATOR = new W(17);

    /* renamed from: a  reason: collision with root package name */
    public final String f2059a;

    public C0106v(String str) {
        I.g(str);
        this.f2059a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0106v)) {
            return false;
        }
        return this.f2059a.equals(((C0106v) obj).f2059a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2059a});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 2, this.f2059a, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
