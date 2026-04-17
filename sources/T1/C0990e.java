package t1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import s1.b;

/* renamed from: t1.e  reason: case insensitive filesystem */
public final class C0990e extends a {
    public static final Parcelable.Creator<C0990e> CREATOR = new b(14);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11715a;

    public C0990e(boolean z3) {
        this.f11715a = z3;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0990e) && this.f11715a == ((C0990e) obj).f11715a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11715a)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f11715a ? 1 : 0);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
