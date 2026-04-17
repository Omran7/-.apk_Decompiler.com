package com.google.android.material.datepicker;

import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new C0251c(28);

    /* renamed from: a  reason: collision with root package name */
    public final o f6392a;

    /* renamed from: b  reason: collision with root package name */
    public final o f6393b;

    /* renamed from: c  reason: collision with root package name */
    public final d f6394c;
    public final o d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6395e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6396f;

    /* renamed from: p  reason: collision with root package name */
    public final int f6397p;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i2) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f6392a = oVar;
        this.f6393b = oVar2;
        this.d = oVar3;
        this.f6395e = i2;
        this.f6394c = dVar;
        if (oVar3 != null && oVar.f6448a.compareTo(oVar3.f6448a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (oVar3 != null && oVar3.f6448a.compareTo(oVar2.f6448a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i2 < 0 || i2 > w.c((Calendar) null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else {
            this.f6397p = oVar.k(oVar2) + 1;
            this.f6396f = (oVar2.f6450c - oVar.f6450c) + 1;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f6392a.equals(bVar.f6392a) || !this.f6393b.equals(bVar.f6393b) || !Objects.equals(this.d, bVar.d) || this.f6395e != bVar.f6395e || !this.f6394c.equals(bVar.f6394c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6392a, this.f6393b, this.d, Integer.valueOf(this.f6395e), this.f6394c});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f6392a, 0);
        parcel.writeParcelable(this.f6393b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f6394c, 0);
        parcel.writeInt(this.f6395e);
    }
}
