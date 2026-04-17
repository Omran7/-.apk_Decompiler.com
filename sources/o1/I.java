package O1;

import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import h0.C0552a;

public enum I implements Parcelable {
    RESIDENT_KEY_REQUIRED("required");
    
    public static final Parcelable.Creator<I> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    public final String f1991a;

    static {
        CREATOR = new c(23);
    }

    /* access modifiers changed from: public */
    I(String str) {
        this.f1991a = str;
    }

    public static I a(String str) {
        for (I i2 : values()) {
            if (str.equals(i2.f1991a)) {
                return i2;
            }
        }
        throw new Exception(C0552a.o("Resident key requirement ", str, " not supported"));
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f1991a;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1991a);
    }
}
