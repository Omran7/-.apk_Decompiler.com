package P1;

import A1.a;
import O1.W;
import android.os.Parcel;
import android.os.Parcelable;
import h0.C0552a;

public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new W(19);

    /* renamed from: a  reason: collision with root package name */
    public final a f2139a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2140b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2141c;

    static {
        new c("unavailable");
        new c("unused");
    }

    public c(int i2, String str, String str2) {
        try {
            this.f2139a = v(i2);
            this.f2140b = str;
            this.f2141c = str2;
        } catch (b e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public static a v(int i2) {
        for (a aVar : a.values()) {
            if (i2 == aVar.f2138a) {
                return aVar;
            }
        }
        throw new Exception(C0552a.k(i2, "ChannelIdValueType ", " not supported"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        a aVar = cVar.f2139a;
        a aVar2 = this.f2139a;
        if (!aVar2.equals(aVar)) {
            return false;
        }
        int ordinal = aVar2.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return this.f2140b.equals(cVar.f2140b);
        }
        if (ordinal != 2) {
            return false;
        }
        return this.f2141c.equals(cVar.f2141c);
    }

    public final int hashCode() {
        int i2;
        int hashCode;
        a aVar = this.f2139a;
        int hashCode2 = aVar.hashCode() + 31;
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            i2 = hashCode2 * 31;
            hashCode = this.f2140b.hashCode();
        } else if (ordinal != 2) {
            return hashCode2;
        } else {
            i2 = hashCode2 * 31;
            hashCode = this.f2141c.hashCode();
        }
        return hashCode + i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        int i5 = this.f2139a.f2138a;
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(i5);
        android.support.v4.media.session.a.R0(parcel, 3, this.f2140b, false);
        android.support.v4.media.session.a.R0(parcel, 4, this.f2141c, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public c(String str) {
        this.f2140b = str;
        this.f2139a = a.STRING;
        this.f2141c = null;
    }
}
