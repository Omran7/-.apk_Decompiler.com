package O1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class a0 extends a {
    public static final Parcelable.Creator<a0> CREATOR = new W(14);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2015a;

    public a0(ArrayList arrayList) {
        I.g(arrayList);
        this.f2015a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        ArrayList arrayList = a0Var.f2015a;
        ArrayList arrayList2 = this.f2015a;
        if (!arrayList2.containsAll(arrayList) || !a0Var.f2015a.containsAll(arrayList2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f2015a)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.V0(parcel, 1, this.f2015a, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
