package v1;

import A1.a;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s1.b;

/* renamed from: v1.b  reason: case insensitive filesystem */
public final class C1041b extends a {
    public static final Parcelable.Creator<C1041b> CREATOR = new b(23);

    /* renamed from: a  reason: collision with root package name */
    public final int f12159a;

    /* renamed from: b  reason: collision with root package name */
    public final PendingIntent f12160b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12161c;
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12162e;

    /* renamed from: f  reason: collision with root package name */
    public final Bundle f12163f;

    public C1041b(int i2, int i5, PendingIntent pendingIntent, int i6, Bundle bundle, byte[] bArr) {
        this.f12162e = i2;
        this.f12159a = i5;
        this.f12161c = i6;
        this.f12163f = bundle;
        this.d = bArr;
        this.f12160b = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f12159a);
        android.support.v4.media.session.a.Q0(parcel, 2, this.f12160b, i2, false);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f12161c);
        android.support.v4.media.session.a.J0(parcel, 4, this.f12163f, false);
        android.support.v4.media.session.a.K0(parcel, 5, this.d, false);
        android.support.v4.media.session.a.Y0(parcel, 1000, 4);
        parcel.writeInt(this.f12162e);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
