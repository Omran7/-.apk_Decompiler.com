package O1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class X extends a {
    public static final Parcelable.Creator<X> CREATOR = new W(4);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f2008a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2009b;

    public X(byte[] bArr, byte[] bArr2) {
        this.f2008a = bArr;
        this.f2009b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof X)) {
            return false;
        }
        X x6 = (X) obj;
        if (!Arrays.equals(this.f2008a, x6.f2008a) || !Arrays.equals(this.f2009b, x6.f2009b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2008a, this.f2009b});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.K0(parcel, 1, this.f2008a, false);
        android.support.v4.media.session.a.K0(parcel, 2, this.f2009b, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
