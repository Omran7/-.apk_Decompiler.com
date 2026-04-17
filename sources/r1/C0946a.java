package r1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.n;

/* renamed from: r1.a  reason: case insensitive filesystem */
public final class C0946a extends a {
    public static final Parcelable.Creator<C0946a> CREATOR = new n(29);

    /* renamed from: a  reason: collision with root package name */
    public final int f11167a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11168b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11169c;
    public final boolean d;

    public C0946a(int i2, boolean z3, long j6, boolean z4) {
        this.f11167a = i2;
        this.f11168b = z3;
        this.f11169c = j6;
        this.d = z4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f11167a);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f11168b ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 3, 8);
        parcel.writeLong(this.f11169c);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
