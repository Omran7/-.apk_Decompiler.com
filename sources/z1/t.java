package z1;

import A1.a;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import s1.b;

public final class t extends a {
    public static final Parcelable.Creator<t> CREATOR = new b(28);

    /* renamed from: a  reason: collision with root package name */
    public final String f12838a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12839b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12840c;
    public final Context d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12841e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12842f;

    public t(String str, boolean z3, boolean z4, IBinder iBinder, boolean z5, boolean z6) {
        this.f12838a = str;
        this.f12839b = z3;
        this.f12840c = z4;
        this.d = (Context) J1.b.b(J1.b.a(iBinder));
        this.f12841e = z5;
        this.f12842f = z6;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f12838a, false);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f12839b ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f12840c ? 1 : 0);
        android.support.v4.media.session.a.M0(parcel, 4, new J1.b(this.d));
        android.support.v4.media.session.a.Y0(parcel, 5, 4);
        parcel.writeInt(this.f12841e ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 6, 4);
        parcel.writeInt(this.f12842f ? 1 : 0);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
