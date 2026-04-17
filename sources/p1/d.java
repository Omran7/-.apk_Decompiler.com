package P1;

import A1.a;
import O1.W;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import h0.C0552a;
import java.util.ArrayList;
import java.util.Arrays;

public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new W(20);

    /* renamed from: a  reason: collision with root package name */
    public final int f2142a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2143b;

    /* renamed from: c  reason: collision with root package name */
    public final f f2144c;
    public final ArrayList d;

    public d(int i2, byte[] bArr, String str, ArrayList arrayList) {
        this.f2142a = i2;
        this.f2143b = bArr;
        try {
            this.f2144c = f.a(str);
            this.d = arrayList;
        } catch (e e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!Arrays.equals(this.f2143b, dVar.f2143b) || !this.f2144c.equals(dVar.f2144c)) {
            return false;
        }
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = dVar.d;
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        if (arrayList == null || arrayList2 == null || !arrayList.containsAll(arrayList2) || !arrayList2.containsAll(arrayList)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f2143b)), this.f2144c, this.d});
    }

    public final String toString() {
        String str;
        String str2;
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            str = "null";
        } else {
            str = arrayList.toString();
        }
        byte[] bArr = this.f2143b;
        if (bArr == null) {
            str2 = null;
        } else {
            str2 = Base64.encodeToString(bArr, 0);
        }
        StringBuilder t6 = C0552a.t("{keyHandle: ", str2, ", version: ");
        t6.append(this.f2144c);
        t6.append(", transports: ");
        t6.append(str);
        t6.append("}");
        return t6.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f2142a);
        android.support.v4.media.session.a.K0(parcel, 2, this.f2143b, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f2144c.f2147a, false);
        android.support.v4.media.session.a.V0(parcel, 4, this.d, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
