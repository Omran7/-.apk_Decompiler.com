package com.google.android.gms.location;

import A1.a;
import O1.W;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new W(29);

    /* renamed from: a  reason: collision with root package name */
    public int f6251a;

    /* renamed from: b  reason: collision with root package name */
    public long f6252b;

    /* renamed from: c  reason: collision with root package name */
    public long f6253c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public long f6254e;

    /* renamed from: f  reason: collision with root package name */
    public int f6255f;

    /* renamed from: p  reason: collision with root package name */
    public float f6256p;

    /* renamed from: q  reason: collision with root package name */
    public long f6257q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6258r;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r11 = (com.google.android.gms.location.LocationRequest) r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.gms.location.LocationRequest
            r1 = 0
            if (r0 == 0) goto L_0x0055
            com.google.android.gms.location.LocationRequest r11 = (com.google.android.gms.location.LocationRequest) r11
            int r0 = r11.f6251a
            int r2 = r10.f6251a
            if (r2 != r0) goto L_0x0055
            long r2 = r10.f6252b
            long r4 = r11.f6252b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0055
            long r6 = r10.f6253c
            long r8 = r11.f6253c
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0055
            boolean r0 = r10.d
            boolean r6 = r11.d
            if (r0 != r6) goto L_0x0055
            long r6 = r10.f6254e
            long r8 = r11.f6254e
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0055
            int r0 = r10.f6255f
            int r6 = r11.f6255f
            if (r0 != r6) goto L_0x0055
            float r0 = r10.f6256p
            float r6 = r11.f6256p
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0055
            long r6 = r10.f6257q
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r2 = r6
        L_0x0041:
            long r6 = r11.f6257q
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r4 = r6
        L_0x0049:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0055
            boolean r0 = r10.f6258r
            boolean r11 = r11.f6258r
            if (r0 != r11) goto L_0x0055
            r11 = 1
            return r11
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6251a), Long.valueOf(this.f6252b), Float.valueOf(this.f6256p), Long.valueOf(this.f6257q)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Request[");
        int i2 = this.f6251a;
        if (i2 == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i2 == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i2 == 104) {
            str = "PRIORITY_LOW_POWER";
        } else if (i2 != 105) {
            str = "???";
        } else {
            str = "PRIORITY_NO_POWER";
        }
        sb.append(str);
        long j6 = this.f6252b;
        if (i2 != 105) {
            sb.append(" requested=");
            sb.append(j6);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f6253c);
        sb.append("ms");
        long j7 = this.f6257q;
        if (j7 > j6) {
            sb.append(" maxWait=");
            sb.append(j7);
            sb.append("ms");
        }
        float f6 = this.f6256p;
        if (f6 > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(f6);
            sb.append("m");
        }
        long j8 = this.f6254e;
        if (j8 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j8 - elapsedRealtime);
            sb.append("ms");
        }
        int i5 = this.f6255f;
        if (i5 != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(i5);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f6251a);
        android.support.v4.media.session.a.Y0(parcel, 2, 8);
        parcel.writeLong(this.f6252b);
        android.support.v4.media.session.a.Y0(parcel, 3, 8);
        parcel.writeLong(this.f6253c);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 5, 8);
        parcel.writeLong(this.f6254e);
        android.support.v4.media.session.a.Y0(parcel, 6, 4);
        parcel.writeInt(this.f6255f);
        android.support.v4.media.session.a.Y0(parcel, 7, 4);
        parcel.writeFloat(this.f6256p);
        android.support.v4.media.session.a.Y0(parcel, 8, 8);
        parcel.writeLong(this.f6257q);
        android.support.v4.media.session.a.Y0(parcel, 9, 4);
        parcel.writeInt(this.f6258r ? 1 : 0);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
