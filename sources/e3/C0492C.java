package e3;

import A1.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.n;

/* renamed from: e3.C  reason: case insensitive filesystem */
public final class C0492C extends a {
    public static final Parcelable.Creator<C0492C> CREATOR = new n(9);

    /* renamed from: a  reason: collision with root package name */
    public String f7599a;

    /* renamed from: b  reason: collision with root package name */
    public String f7600b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7601c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public Uri f7602e;

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 2, this.f7599a, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f7600b, false);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(this.f7601c ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
