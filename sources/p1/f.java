package P1;

import O1.W;
import android.os.Parcel;
import android.os.Parcelable;
import h0.C0552a;

public enum f implements Parcelable {
    UNKNOWN("UNKNOWN");
    
    public static final Parcelable.Creator<f> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    public final String f2147a;

    static {
        CREATOR = new W(21);
    }

    /* access modifiers changed from: public */
    f(String str) {
        this.f2147a = str;
    }

    public static f a(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (f fVar : values()) {
            if (str.equals(fVar.f2147a)) {
                return fVar;
            }
        }
        throw new Exception(C0552a.o("Protocol version ", str, " not supported"));
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f2147a;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2147a);
    }
}
