package O1;

import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import h0.C0552a;

public enum V implements Parcelable {
    ;
    
    public static final Parcelable.Creator<V> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    public final String f2006a;

    static {
        CREATOR = new c(27);
    }

    /* access modifiers changed from: public */
    V(String str) {
        this.f2006a = str;
    }

    public static V a(String str) {
        for (V v6 : values()) {
            if (str.equals(v6.f2006a)) {
                return v6;
            }
        }
        throw new Exception(C0552a.o("User verification requirement ", str, " not supported"));
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f2006a;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2006a);
    }
}
