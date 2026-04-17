package Q1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

public final class B extends a {
    public static final Parcelable.Creator<B> CREATOR = new w(8);

    /* renamed from: a  reason: collision with root package name */
    public final int f2394a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2395b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2396c;
    public final int d;

    public B(int i2, int i5, int i6, int i7) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        if (i2 < 0 || i2 > 23) {
            z3 = false;
        } else {
            z3 = true;
        }
        I.i("Start hour must be in range [0, 23].", z3);
        if (i5 < 0 || i5 > 59) {
            z4 = false;
        } else {
            z4 = true;
        }
        I.i("Start minute must be in range [0, 59].", z4);
        if (i6 < 0 || i6 > 23) {
            z5 = false;
        } else {
            z5 = true;
        }
        I.i("End hour must be in range [0, 23].", z5);
        if (i7 < 0 || i7 > 59) {
            z6 = false;
        } else {
            z6 = true;
        }
        I.i("End minute must be in range [0, 59].", z6);
        I.i("Parameters can't be all 0.", ((i2 + i5) + i6) + i7 <= 0 ? false : z7);
        this.f2394a = i2;
        this.f2395b = i5;
        this.f2396c = i6;
        this.d = i7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (Q1.B) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof Q1.B
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            Q1.B r5 = (Q1.B) r5
            int r1 = r5.f2394a
            int r3 = r4.f2394a
            if (r3 != r1) goto L_0x0025
            int r1 = r4.f2395b
            int r3 = r5.f2395b
            if (r1 != r3) goto L_0x0025
            int r1 = r4.f2396c
            int r3 = r5.f2396c
            if (r1 != r3) goto L_0x0025
            int r1 = r4.d
            int r5 = r5.d
            if (r1 != r5) goto L_0x0025
            return r0
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.B.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2394a), Integer.valueOf(this.f2395b), Integer.valueOf(this.f2396c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(this.f2394a);
        sb.append(", startMinute=");
        sb.append(this.f2395b);
        sb.append(", endHour=");
        sb.append(this.f2396c);
        sb.append(", endMinute=");
        sb.append(this.d);
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        I.g(parcel);
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f2394a);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f2395b);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f2396c);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(this.d);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
