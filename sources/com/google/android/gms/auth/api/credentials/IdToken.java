package com.google.android.gms.auth.api.credentials;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import s1.b;

@Deprecated
public final class IdToken extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new b(4);

    /* renamed from: a  reason: collision with root package name */
    public final String f5947a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5948b;

    public IdToken(String str, String str2) {
        I.a("account type string cannot be null or empty", !TextUtils.isEmpty(str));
        I.a("id token string cannot be null or empty", !TextUtils.isEmpty(str2));
        this.f5947a = str;
        this.f5948b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        if (!I.j(this.f5947a, idToken.f5947a) || !I.j(this.f5948b, idToken.f5948b)) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f5947a, false);
        android.support.v4.media.session.a.R0(parcel, 2, this.f5948b, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
