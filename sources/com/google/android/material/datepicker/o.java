package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public final class o implements Comparable, Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new n(0);

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f6448a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6449b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6450c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6451e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6452f;

    /* renamed from: p  reason: collision with root package name */
    public String f6453p;

    public o(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a6 = w.a(calendar);
        this.f6448a = a6;
        this.f6449b = a6.get(2);
        this.f6450c = a6.get(1);
        this.d = a6.getMaximum(7);
        this.f6451e = a6.getActualMaximum(5);
        this.f6452f = a6.getTimeInMillis();
    }

    public static o a(int i2, int i5) {
        Calendar c3 = w.c((Calendar) null);
        c3.set(1, i2);
        c3.set(2, i5);
        return new o(c3);
    }

    public static o e(long j6) {
        Calendar c3 = w.c((Calendar) null);
        c3.setTimeInMillis(j6);
        return new o(c3);
    }

    public final int compareTo(Object obj) {
        return this.f6448a.compareTo(((o) obj).f6448a);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f6449b == oVar.f6449b && this.f6450c == oVar.f6450c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6449b), Integer.valueOf(this.f6450c)});
    }

    public final String j() {
        if (this.f6453p == null) {
            long timeInMillis = this.f6448a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = w.f6465a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f6453p = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f6453p;
    }

    public final int k(o oVar) {
        if (this.f6448a instanceof GregorianCalendar) {
            return (oVar.f6449b - this.f6449b) + ((oVar.f6450c - this.f6450c) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f6450c);
        parcel.writeInt(this.f6449b);
    }
}
