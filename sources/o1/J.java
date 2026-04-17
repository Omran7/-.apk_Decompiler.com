package O1;

import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import h0.C0552a;

public enum J implements Parcelable {
    ;
    
    public static final Parcelable.Creator<J> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    public final String f1993a;

    static {
        CREATOR = new c(24);
    }

    /* access modifiers changed from: public */
    J(String str) {
        this.f1993a = str;
    }

    public static J a(String str) {
        for (J j6 : values()) {
            if (str.equals(j6.f1993a)) {
                return j6;
            }
        }
        throw new Exception(C0552a.o("TokenBindingStatus ", str, " not supported"));
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f1993a;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1993a);
    }
}
