package com.google.android.gms.common.internal;

import A1.a;
import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.common.internal.g  reason: case insensitive filesystem */
public final class C0378g extends a {
    public static final Parcelable.Creator<C0378g> CREATOR = new C0251c(19);

    /* renamed from: a  reason: collision with root package name */
    public final int f6168a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6169b;

    public C0378g(int i2, String str) {
        this.f6168a = i2;
        this.f6169b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0378g)) {
            return false;
        }
        C0378g gVar = (C0378g) obj;
        if (gVar.f6168a != this.f6168a || !I.j(gVar.f6169b, this.f6169b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6168a;
    }

    public final String toString() {
        return this.f6168a + ":" + this.f6169b;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f6168a);
        android.support.v4.media.session.a.R0(parcel, 2, this.f6169b, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
