package com.google.android.gms.location;

import A1.a;
import Q1.w;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = new w(0);

    /* renamed from: b  reason: collision with root package name */
    public static final List f6259b = Collections.emptyList();

    /* renamed from: a  reason: collision with root package name */
    public final List f6260a;

    public LocationResult(List list) {
        this.f6260a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int size = locationResult.f6260a.size();
        List list = this.f6260a;
        if (size != list.size()) {
            return false;
        }
        Iterator it2 = list.iterator();
        for (Location time : locationResult.f6260a) {
            if (((Location) it2.next()).getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 17;
        for (Location time : this.f6260a) {
            long time2 = time.getTime();
            i2 = (i2 * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6260a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.V0(parcel, 1, this.f6260a, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
