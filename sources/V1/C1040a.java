package v1;

import A1.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s1.b;

/* renamed from: v1.a  reason: case insensitive filesystem */
public final class C1040a extends a {
    public static final Parcelable.Creator<C1040a> CREATOR = new b(22);

    /* renamed from: a  reason: collision with root package name */
    public final String f12154a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12155b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12156c;
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12157e;

    /* renamed from: f  reason: collision with root package name */
    public final Bundle f12158f;

    public C1040a(int i2, String str, int i5, long j6, byte[] bArr, Bundle bundle) {
        this.f12157e = i2;
        this.f12154a = str;
        this.f12155b = i5;
        this.f12156c = j6;
        this.d = bArr;
        this.f12158f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.f12154a + ", method: " + this.f12155b + " ]";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f12154a, false);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f12155b);
        android.support.v4.media.session.a.Y0(parcel, 3, 8);
        parcel.writeLong(this.f12156c);
        android.support.v4.media.session.a.K0(parcel, 4, this.d, false);
        android.support.v4.media.session.a.J0(parcel, 5, this.f12158f, false);
        android.support.v4.media.session.a.Y0(parcel, 1000, 4);
        parcel.writeInt(this.f12157e);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
