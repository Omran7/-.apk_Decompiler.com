package O1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class Y extends a {
    public static final Parcelable.Creator<Y> CREATOR = new W(5);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2010a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2011b;

    public Y(boolean z3, byte[] bArr) {
        this.f2010a = z3;
        this.f2011b = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (O1.Y) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof O1.Y
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            O1.Y r4 = (O1.Y) r4
            boolean r0 = r4.f2010a
            boolean r2 = r3.f2010a
            if (r2 != r0) goto L_0x001a
            byte[] r0 = r3.f2011b
            byte[] r4 = r4.f2011b
            boolean r4 = java.util.Arrays.equals(r0, r4)
            if (r4 == 0) goto L_0x001a
            r4 = 1
            return r4
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.Y.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f2010a), this.f2011b});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f2010a ? 1 : 0);
        android.support.v4.media.session.a.K0(parcel, 2, this.f2011b, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
