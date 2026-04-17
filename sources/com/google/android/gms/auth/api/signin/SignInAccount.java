package com.google.android.gms.auth.api.signin;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import w1.C1078d;

public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C1078d(2);

    /* renamed from: a  reason: collision with root package name */
    public final String f5987a;

    /* renamed from: b  reason: collision with root package name */
    public final GoogleSignInAccount f5988b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5989c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f5988b = googleSignInAccount;
        I.e(str, "8.3 and 8.4 SDKs require non-null email");
        this.f5987a = str;
        I.e(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f5989c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 4, this.f5987a, false);
        android.support.v4.media.session.a.Q0(parcel, 7, this.f5988b, i2, false);
        android.support.v4.media.session.a.R0(parcel, 8, this.f5989c, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
