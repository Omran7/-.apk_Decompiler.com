package x1;

import A1.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s1.b;

/* renamed from: x1.a  reason: case insensitive filesystem */
public final class C1095a extends a {
    public static final Parcelable.Creator<C1095a> CREATOR = new b(24);

    /* renamed from: a  reason: collision with root package name */
    public final int f12530a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12531b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f12532c;

    public C1095a(int i2, int i5, Bundle bundle) {
        this.f12530a = i2;
        this.f12531b = i5;
        this.f12532c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f12530a);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f12531b);
        android.support.v4.media.session.a.J0(parcel, 3, this.f12532c, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
