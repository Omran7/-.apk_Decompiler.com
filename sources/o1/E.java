package O1;

import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import h0.C0552a;

public enum E implements Parcelable {
    ;
    
    public static final Parcelable.Creator<E> CREATOR = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, O1.E] */
    static {
        CREATOR = new c(21);
    }

    public static E a(String str) {
        for (E e6 : values()) {
            e6.getClass();
            if (str.equals("public-key")) {
                return e6;
            }
        }
        throw new Exception(C0552a.o("PublicKeyCredentialType ", str, " not supported"));
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "public-key";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString("public-key");
    }
}
