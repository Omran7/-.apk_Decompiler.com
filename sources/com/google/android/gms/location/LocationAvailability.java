package com.google.android.gms.location;

import A1.a;
import O1.W;
import Q1.z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new W(28);

    /* renamed from: a  reason: collision with root package name */
    public int f6247a;

    /* renamed from: b  reason: collision with root package name */
    public int f6248b;

    /* renamed from: c  reason: collision with root package name */
    public long f6249c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public z[] f6250e;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r7 = (com.google.android.gms.location.LocationAvailability) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.gms.location.LocationAvailability
            r1 = 0
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.location.LocationAvailability r7 = (com.google.android.gms.location.LocationAvailability) r7
            int r0 = r7.f6247a
            int r2 = r6.f6247a
            if (r2 != r0) goto L_0x002d
            int r0 = r6.f6248b
            int r2 = r7.f6248b
            if (r0 != r2) goto L_0x002d
            long r2 = r6.f6249c
            long r4 = r7.f6249c
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
            int r0 = r6.d
            int r2 = r7.d
            if (r0 != r2) goto L_0x002d
            Q1.z[] r0 = r6.f6250e
            Q1.z[] r7 = r7.f6250e
            boolean r7 = java.util.Arrays.equals(r0, r7)
            if (r7 == 0) goto L_0x002d
            r7 = 1
            return r7
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationAvailability.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.f6247a), Integer.valueOf(this.f6248b), Long.valueOf(this.f6249c), this.f6250e});
    }

    public final String toString() {
        boolean z3;
        if (this.d < 1000) {
            z3 = true;
        } else {
            z3 = false;
        }
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(z3);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f6247a);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f6248b);
        android.support.v4.media.session.a.Y0(parcel, 3, 8);
        parcel.writeLong(this.f6249c);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(this.d);
        android.support.v4.media.session.a.U0(parcel, 5, this.f6250e, i2);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
