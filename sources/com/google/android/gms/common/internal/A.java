package com.google.android.gms.common.internal;

import A1.a;
import a.C0251c;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class A extends a {
    public static final Parcelable.Creator<A> CREATOR = new C0251c(22);

    /* renamed from: a  reason: collision with root package name */
    public final int f6125a;

    /* renamed from: b  reason: collision with root package name */
    public final Account f6126b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6127c;
    public final GoogleSignInAccount d;

    public A(int i2, Account account, int i5, GoogleSignInAccount googleSignInAccount) {
        this.f6125a = i2;
        this.f6126b = account;
        this.f6127c = i5;
        this.d = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f6125a);
        android.support.v4.media.session.a.Q0(parcel, 2, this.f6126b, i2, false);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f6127c);
        android.support.v4.media.session.a.Q0(parcel, 4, this.d, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
