package O1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

public final class Z extends a {
    public static final Parcelable.Creator<Z> CREATOR = new W(13);

    /* renamed from: a  reason: collision with root package name */
    public final long f2012a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2013b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f2014c;
    public final byte[] d;

    public Z(long j6, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f2012a = j6;
        I.g(bArr);
        this.f2013b = bArr;
        I.g(bArr2);
        this.f2014c = bArr2;
        I.g(bArr3);
        this.d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z3 = (Z) obj;
        if (this.f2012a != z3.f2012a || !Arrays.equals(this.f2013b, z3.f2013b) || !Arrays.equals(this.f2014c, z3.f2014c) || !Arrays.equals(this.d, z3.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f2012a), this.f2013b, this.f2014c, this.d});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 8);
        parcel.writeLong(this.f2012a);
        android.support.v4.media.session.a.K0(parcel, 2, this.f2013b, false);
        android.support.v4.media.session.a.K0(parcel, 3, this.f2014c, false);
        android.support.v4.media.session.a.K0(parcel, 4, this.d, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
