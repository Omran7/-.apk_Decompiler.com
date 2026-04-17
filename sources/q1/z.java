package Q1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class z extends a {
    public static final Parcelable.Creator<z> CREATOR = new w(5);

    /* renamed from: a  reason: collision with root package name */
    public final int f2430a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2431b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2432c;
    public final long d;

    public z(int i2, int i5, long j6, long j7) {
        this.f2430a = i2;
        this.f2431b = i5;
        this.f2432c = j6;
        this.d = j7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r7 = (Q1.z) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof Q1.z
            r1 = 0
            if (r0 == 0) goto L_0x0025
            Q1.z r7 = (Q1.z) r7
            int r0 = r7.f2430a
            int r2 = r6.f2430a
            if (r2 != r0) goto L_0x0025
            int r0 = r6.f2431b
            int r2 = r7.f2431b
            if (r0 != r2) goto L_0x0025
            long r2 = r6.f2432c
            long r4 = r7.f2432c
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0025
            long r2 = r6.d
            long r4 = r7.d
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0025
            r7 = 1
            return r7
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.z.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2431b), Integer.valueOf(this.f2430a), Long.valueOf(this.d), Long.valueOf(this.f2432c)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f2430a + " Cell status: " + this.f2431b + " elapsed time NS: " + this.d + " system time ms: " + this.f2432c;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f2430a);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f2431b);
        android.support.v4.media.session.a.Y0(parcel, 3, 8);
        parcel.writeLong(this.f2432c);
        android.support.v4.media.session.a.Y0(parcel, 4, 8);
        parcel.writeLong(this.d);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
