package O1;

import A1.a;
import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class N extends a {
    public static final Parcelable.Creator<N> CREATOR = new c(28);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1997a;

    public N(ArrayList arrayList) {
        this.f1997a = arrayList;
    }

    public final boolean equals(Object obj) {
        ArrayList arrayList;
        if (!(obj instanceof N)) {
            return false;
        }
        N n2 = (N) obj;
        ArrayList arrayList2 = this.f1997a;
        if ((arrayList2 != null || n2.f1997a != null) && (arrayList2 == null || (arrayList = n2.f1997a) == null || !arrayList2.containsAll(arrayList) || !n2.f1997a.containsAll(arrayList2))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f1997a)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.V0(parcel, 1, this.f1997a, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
