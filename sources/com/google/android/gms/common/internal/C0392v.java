package com.google.android.gms.common.internal;

import A1.a;
import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.v  reason: case insensitive filesystem */
public final class C0392v extends a {
    public static final Parcelable.Creator<C0392v> CREATOR = new C0251c(20);

    /* renamed from: a  reason: collision with root package name */
    public final int f6221a;

    /* renamed from: b  reason: collision with root package name */
    public List f6222b;

    public C0392v(int i2, List list) {
        this.f6221a = i2;
        this.f6222b = list;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f6221a);
        android.support.v4.media.session.a.V0(parcel, 2, this.f6222b, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
