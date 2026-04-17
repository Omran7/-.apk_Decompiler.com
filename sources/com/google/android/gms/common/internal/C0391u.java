package com.google.android.gms.common.internal;

import A1.a;
import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.common.internal.u  reason: case insensitive filesystem */
public final class C0391u extends a {
    public static final Parcelable.Creator<C0391u> CREATOR = new C0251c(24);

    /* renamed from: a  reason: collision with root package name */
    public final int f6217a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6218b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6219c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6220e;

    public C0391u(int i2, int i5, int i6, boolean z3, boolean z4) {
        this.f6217a = i2;
        this.f6218b = z3;
        this.f6219c = z4;
        this.d = i5;
        this.f6220e = i6;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f6217a);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f6218b ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f6219c ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(this.d);
        android.support.v4.media.session.a.Y0(parcel, 5, 4);
        parcel.writeInt(this.f6220e);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
