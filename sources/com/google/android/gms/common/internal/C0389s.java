package com.google.android.gms.common.internal;

import A1.a;
import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.common.internal.s  reason: case insensitive filesystem */
public final class C0389s extends a {
    public static final Parcelable.Creator<C0389s> CREATOR = new C0251c(21);

    /* renamed from: a  reason: collision with root package name */
    public final int f6206a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6207b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6208c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6209e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6210f;

    /* renamed from: p  reason: collision with root package name */
    public final String f6211p;

    /* renamed from: q  reason: collision with root package name */
    public final int f6212q;

    /* renamed from: r  reason: collision with root package name */
    public final int f6213r;

    public C0389s(int i2, int i5, int i6, long j6, long j7, String str, String str2, int i7, int i8) {
        this.f6206a = i2;
        this.f6207b = i5;
        this.f6208c = i6;
        this.d = j6;
        this.f6209e = j7;
        this.f6210f = str;
        this.f6211p = str2;
        this.f6212q = i7;
        this.f6213r = i8;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f6206a);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f6207b);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f6208c);
        android.support.v4.media.session.a.Y0(parcel, 4, 8);
        parcel.writeLong(this.d);
        android.support.v4.media.session.a.Y0(parcel, 5, 8);
        parcel.writeLong(this.f6209e);
        android.support.v4.media.session.a.R0(parcel, 6, this.f6210f, false);
        android.support.v4.media.session.a.R0(parcel, 7, this.f6211p, false);
        android.support.v4.media.session.a.Y0(parcel, 8, 4);
        parcel.writeInt(this.f6212q);
        android.support.v4.media.session.a.Y0(parcel, 9, 4);
        parcel.writeInt(this.f6213r);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
