package Q1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.Arrays;

public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new w(7);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2424a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2425b;

    public l(int i2, ArrayList arrayList) {
        this.f2424a = arrayList;
        this.f2425b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!I.j(this.f2424a, lVar.f2424a) || this.f2425b != lVar.f2425b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2424a, Integer.valueOf(this.f2425b)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        I.g(parcel);
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.V0(parcel, 1, this.f2424a, false);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f2425b);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
