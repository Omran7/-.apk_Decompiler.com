package Q1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;

public final class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new w(2);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2414a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2415b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2416c;
    public final y d;

    public i(ArrayList arrayList, boolean z3, boolean z4, y yVar) {
        this.f2414a = arrayList;
        this.f2415b = z3;
        this.f2416c = z4;
        this.d = yVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.V0(parcel, 1, Collections.unmodifiableList(this.f2414a), false);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f2415b ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f2416c ? 1 : 0);
        android.support.v4.media.session.a.Q0(parcel, 5, this.d, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
