package f3;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f3.n  reason: case insensitive filesystem */
public final class C0537n extends a {
    public static final Parcelable.Creator<C0537n> CREATOR = new C0525b(4);

    /* renamed from: a  reason: collision with root package name */
    public final List f7946a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7947b;

    public C0537n(ArrayList arrayList, ArrayList arrayList2) {
        this.f7946a = arrayList == null ? new ArrayList() : arrayList;
        this.f7947b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.V0(parcel, 1, this.f7946a, false);
        android.support.v4.media.session.a.V0(parcel, 2, this.f7947b, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
