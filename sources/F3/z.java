package f3;

import A1.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import com.google.android.gms.common.internal.I;

public final class z implements c {
    public static final Parcelable.Creator<z> CREATOR = new C0525b(5);

    /* renamed from: a  reason: collision with root package name */
    public final String f7968a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7969b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7970c;

    public z(boolean z3) {
        this.f7970c = z3;
        this.f7969b = null;
        this.f7968a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.R0(parcel, 1, this.f7968a, false);
        a.R0(parcel, 2, this.f7969b, false);
        a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f7970c ? 1 : 0);
        a.X0(W02, parcel);
    }

    public z(String str, String str2, boolean z3) {
        I.d(str);
        I.d(str2);
        this.f7968a = str;
        this.f7969b = str2;
        C0535l.d(str2);
        this.f7970c = z3;
    }
}
