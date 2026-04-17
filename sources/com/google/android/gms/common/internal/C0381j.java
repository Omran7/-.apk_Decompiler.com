package com.google.android.gms.common.internal;

import A1.a;
import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.common.internal.j  reason: case insensitive filesystem */
public final class C0381j extends a {
    public static final Parcelable.Creator<C0381j> CREATOR = new C0251c(26);

    /* renamed from: a  reason: collision with root package name */
    public final C0391u f6178a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6179b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6180c;
    public final int[] d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6181e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f6182f;

    public C0381j(C0391u uVar, boolean z3, boolean z4, int[] iArr, int i2, int[] iArr2) {
        this.f6178a = uVar;
        this.f6179b = z3;
        this.f6180c = z4;
        this.d = iArr;
        this.f6181e = i2;
        this.f6182f = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Q0(parcel, 1, this.f6178a, i2, false);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f6179b ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f6180c ? 1 : 0);
        android.support.v4.media.session.a.N0(parcel, 4, this.d, false);
        android.support.v4.media.session.a.Y0(parcel, 5, 4);
        parcel.writeInt(this.f6181e);
        android.support.v4.media.session.a.N0(parcel, 6, this.f6182f, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
