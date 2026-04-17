package com.google.android.gms.auth.api.signin.internal;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import s1.b;

public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new b(25);

    /* renamed from: a  reason: collision with root package name */
    public final String f5990a;

    /* renamed from: b  reason: collision with root package name */
    public final GoogleSignInOptions f5991b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        I.d(str);
        this.f5990a = str;
        this.f5991b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f5990a.equals(signInConfiguration.f5990a)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f5991b;
            GoogleSignInOptions googleSignInOptions2 = this.f5991b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (!googleSignInOptions2.equals(googleSignInOptions)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i5 = 1 * 31;
        int i6 = 0;
        String str = this.f5990a;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i7 = (i5 + i2) * 31;
        GoogleSignInOptions googleSignInOptions = this.f5991b;
        if (googleSignInOptions != null) {
            i6 = googleSignInOptions.hashCode();
        }
        return i7 + i6;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 2, this.f5990a, false);
        android.support.v4.media.session.a.Q0(parcel, 5, this.f5991b, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
