package com.google.android.material.datepicker;

import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new C0251c(29);

    /* renamed from: a  reason: collision with root package name */
    public final long f6400a;

    public d(long j6) {
        this.f6400a = j6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        if (this.f6400a == ((d) obj).f6400a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6400a)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f6400a);
    }
}
