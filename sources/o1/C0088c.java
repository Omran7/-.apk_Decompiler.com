package O1;

import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import h0.C0552a;

/* renamed from: O1.c  reason: case insensitive filesystem */
public enum C0088c implements Parcelable {
    ;
    
    public static final Parcelable.Creator<C0088c> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    public final String f2018a;

    static {
        CREATOR = new c(8);
    }

    /* access modifiers changed from: public */
    C0088c(String str) {
        this.f2018a = str;
    }

    public static C0088c a(String str) {
        for (C0088c cVar : values()) {
            if (str.equals(cVar.f2018a)) {
                return cVar;
            }
        }
        throw new Exception(C0552a.o("Attachment ", str, " not supported"));
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f2018a;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2018a);
    }
}
