package Q1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.Arrays;

public final class C extends a {
    public static final Parcelable.Creator<C> CREATOR = new w(11);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2397a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2398b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2399c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2400e;

    public C(boolean z3, long j6, float f6, long j7, int i2) {
        this.f2397a = z3;
        this.f2398b = j6;
        this.f2399c = f6;
        this.d = j7;
        this.f2400e = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (Q1.C) r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof Q1.C
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            Q1.C r8 = (Q1.C) r8
            boolean r1 = r8.f2397a
            boolean r3 = r7.f2397a
            if (r3 != r1) goto L_0x0033
            long r3 = r7.f2398b
            long r5 = r8.f2398b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0033
            float r1 = r7.f2399c
            float r3 = r8.f2399c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 != 0) goto L_0x0033
            long r3 = r7.d
            long r5 = r8.d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0033
            int r1 = r7.f2400e
            int r8 = r8.f2400e
            if (r1 != r8) goto L_0x0033
            return r0
        L_0x0033:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.C.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f2397a), Long.valueOf(this.f2398b), Float.valueOf(this.f2399c), Long.valueOf(this.d), Integer.valueOf(this.f2400e)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f2397a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f2398b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f2399c);
        long j6 = this.d;
        if (j6 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j6 - elapsedRealtime);
            sb.append("ms");
        }
        int i2 = this.f2400e;
        if (i2 != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(i2);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f2397a ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 2, 8);
        parcel.writeLong(this.f2398b);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeFloat(this.f2399c);
        android.support.v4.media.session.a.Y0(parcel, 4, 8);
        parcel.writeLong(this.d);
        android.support.v4.media.session.a.Y0(parcel, 5, 4);
        parcel.writeInt(this.f2400e);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
