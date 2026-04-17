package O1;

import A1.a;
import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

public final class T extends a {
    public static final Parcelable.Creator<T> CREATOR = new c(14);

    /* renamed from: a  reason: collision with root package name */
    public final byte[][] f2004a;

    public T(byte[][] bArr) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (bArr != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.b(z3);
        if (1 != ((bArr.length & 1) ^ 1)) {
            z4 = false;
        } else {
            z4 = true;
        }
        I.b(z4);
        for (int i2 = 0; i2 < bArr.length; i2 += 2) {
            if (i2 == 0 || bArr[i2] != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            I.b(z5);
            int i5 = i2 + 1;
            if (bArr[i5] != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            I.b(z6);
            int length = bArr[i5].length;
            if (length == 32 || length == 64) {
                z7 = true;
            } else {
                z7 = false;
            }
            I.b(z7);
        }
        this.f2004a = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof T)) {
            return false;
        }
        return Arrays.deepEquals(this.f2004a, ((T) obj).f2004a);
    }

    public final int hashCode() {
        int i2 = 0;
        for (byte[] bArr : this.f2004a) {
            i2 ^= Arrays.hashCode(new Object[]{bArr});
        }
        return i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        byte[][] bArr = this.f2004a;
        if (bArr != null) {
            int W03 = android.support.v4.media.session.a.W0(1, parcel);
            parcel.writeInt(r2);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            android.support.v4.media.session.a.X0(W03, parcel);
        }
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
