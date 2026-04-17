package T1;

import A1.a;
import Q1.w;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class L1 extends a {
    public static final Parcelable.Creator<L1> CREATOR = new w(19);

    /* renamed from: a  reason: collision with root package name */
    public final long f2983a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f2984b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2985c;
    public final Bundle d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2986e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2987f;

    /* renamed from: p  reason: collision with root package name */
    public String f2988p;

    public L1(long j6, byte[] bArr, String str, Bundle bundle, int i2, long j7, String str2) {
        this.f2983a = j6;
        this.f2984b = bArr;
        this.f2985c = str;
        this.d = bundle;
        this.f2986e = i2;
        this.f2987f = j7;
        this.f2988p = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 8);
        parcel.writeLong(this.f2983a);
        android.support.v4.media.session.a.K0(parcel, 2, this.f2984b, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f2985c, false);
        android.support.v4.media.session.a.J0(parcel, 4, this.d, false);
        android.support.v4.media.session.a.Y0(parcel, 5, 4);
        parcel.writeInt(this.f2986e);
        android.support.v4.media.session.a.Y0(parcel, 6, 8);
        parcel.writeLong(this.f2987f);
        android.support.v4.media.session.a.R0(parcel, 7, this.f2988p, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
