package t1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
import s1.b;

/* renamed from: t1.i  reason: case insensitive filesystem */
public final class C0994i extends a {
    public static final Parcelable.Creator<C0994i> CREATOR = new b(9);

    /* renamed from: a  reason: collision with root package name */
    public final int f11723a;

    public C0994i(int i2) {
        this.f11723a = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0994i)) {
            return false;
        }
        return I.j(Integer.valueOf(this.f11723a), Integer.valueOf(((C0994i) obj).f11723a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11723a)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f11723a);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
