package com.google.android.gms.common.api;

import A1.a;
import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C0251c(17);

    /* renamed from: a  reason: collision with root package name */
    public final int f6000a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6001b;

    public Scope(int i2, String str) {
        I.e(str, "scopeUri must not be null or empty");
        this.f6000a = i2;
        this.f6001b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f6001b.equals(((Scope) obj).f6001b);
    }

    public final int hashCode() {
        return this.f6001b.hashCode();
    }

    public final String toString() {
        return this.f6001b;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f6000a);
        android.support.v4.media.session.a.R0(parcel, 2, this.f6001b, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
