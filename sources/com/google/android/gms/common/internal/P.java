package com.google.android.gms.common.internal;

import A1.a;
import a.C0251c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import z1.d;

public final class P extends a {
    public static final Parcelable.Creator<P> CREATOR = new C0251c(25);

    /* renamed from: a  reason: collision with root package name */
    public Bundle f6148a;

    /* renamed from: b  reason: collision with root package name */
    public d[] f6149b;

    /* renamed from: c  reason: collision with root package name */
    public int f6150c;
    public C0381j d;

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.J0(parcel, 1, this.f6148a, false);
        android.support.v4.media.session.a.U0(parcel, 2, this.f6149b, i2);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f6150c);
        android.support.v4.media.session.a.Q0(parcel, 4, this.d, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
