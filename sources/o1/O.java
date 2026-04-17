package O1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class O extends a {
    public static final Parcelable.Creator<O> CREATOR = new W(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f1998a;

    /* renamed from: b  reason: collision with root package name */
    public final short f1999b;

    /* renamed from: c  reason: collision with root package name */
    public final short f2000c;

    public O(int i2, short s6, short s7) {
        this.f1998a = i2;
        this.f1999b = s6;
        this.f2000c = s7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (O1.O) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof O1.O
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            O1.O r4 = (O1.O) r4
            int r0 = r4.f1998a
            int r2 = r3.f1998a
            if (r2 != r0) goto L_0x001c
            short r0 = r3.f1999b
            short r2 = r4.f1999b
            if (r0 != r2) goto L_0x001c
            short r0 = r3.f2000c
            short r4 = r4.f2000c
            if (r0 != r4) goto L_0x001c
            r4 = 1
            return r4
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.O.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1998a), Short.valueOf(this.f1999b), Short.valueOf(this.f2000c)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f1998a);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f1999b);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f2000c);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
