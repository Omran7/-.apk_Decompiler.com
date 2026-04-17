package z1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import s1.b;

public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new b(27);

    /* renamed from: a  reason: collision with root package name */
    public final String f12806a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12807b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12808c;

    public d(int i2, String str, long j6) {
        this.f12806a = str;
        this.f12807b = i2;
        this.f12808c = j6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f12806a;
            if (((str == null || !str.equals(dVar.f12806a)) && (str != null || dVar.f12806a != null)) || v() != dVar.v()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12806a, Long.valueOf(v())});
    }

    public final String toString() {
        X4.d dVar = new X4.d((Object) this);
        dVar.c(this.f12806a, "name");
        dVar.c(Long.valueOf(v()), "version");
        return dVar.toString();
    }

    public final long v() {
        long j6 = this.f12808c;
        if (j6 == -1) {
            return (long) this.f12807b;
        }
        return j6;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f12806a, false);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f12807b);
        long v6 = v();
        android.support.v4.media.session.a.Y0(parcel, 3, 8);
        parcel.writeLong(v6);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public d(String str, long j6) {
        this.f12806a = str;
        this.f12808c = j6;
        this.f12807b = -1;
    }
}
