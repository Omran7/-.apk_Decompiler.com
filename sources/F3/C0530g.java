package f3;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: f3.g  reason: case insensitive filesystem */
public final class C0530g extends a {
    public static final Parcelable.Creator<C0530g> CREATOR = new C0525b(3);

    /* renamed from: a  reason: collision with root package name */
    public String f7934a;

    /* renamed from: b  reason: collision with root package name */
    public String f7935b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f7936c;
    public ArrayList d;

    /* renamed from: e  reason: collision with root package name */
    public C0528e f7937e;

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f7934a, false);
        android.support.v4.media.session.a.R0(parcel, 2, this.f7935b, false);
        android.support.v4.media.session.a.V0(parcel, 3, this.f7936c, false);
        android.support.v4.media.session.a.V0(parcel, 4, this.d, false);
        android.support.v4.media.session.a.Q0(parcel, 5, this.f7937e, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
