package P1;

import A1.a;
import O1.W;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new W(22);

    /* renamed from: a  reason: collision with root package name */
    public final int f2148a;

    /* renamed from: b  reason: collision with root package name */
    public final f f2149b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f2150c;
    public final String d;

    public g(int i2, String str, byte[] bArr, String str2) {
        this.f2148a = i2;
        try {
            this.f2149b = f.a(str);
            this.f2150c = bArr;
            this.d = str2;
        } catch (e e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!Arrays.equals(this.f2150c, gVar.f2150c) || this.f2149b != gVar.f2149b) {
            return false;
        }
        String str = gVar.d;
        String str2 = this.d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int hashCode = ((Arrays.hashCode(this.f2150c) + 31) * 31) + this.f2149b.hashCode();
        String str = this.d;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        return (hashCode * 31) + i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f2148a);
        android.support.v4.media.session.a.R0(parcel, 2, this.f2149b.f2147a, false);
        android.support.v4.media.session.a.K0(parcel, 3, this.f2150c, false);
        android.support.v4.media.session.a.R0(parcel, 4, this.d, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
