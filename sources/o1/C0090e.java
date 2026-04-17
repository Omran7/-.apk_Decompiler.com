package O1;

import android.os.Parcel;
import android.os.Parcelable;
import h0.C0552a;
import z1.w;

/* renamed from: O1.e  reason: case insensitive filesystem */
public enum C0090e implements Parcelable {
    ;
    
    public static final Parcelable.Creator<C0090e> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    public final String f2021a;

    static {
        CREATOR = new w(1);
    }

    /* access modifiers changed from: public */
    C0090e(String str) {
        this.f2021a = str;
    }

    public static C0090e a(String str) {
        for (C0090e eVar : values()) {
            if (str.equals(eVar.f2021a)) {
                return eVar;
            }
        }
        throw new Exception(C0552a.o("Attestation conveyance preference ", str, " not supported"));
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f2021a;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2021a);
    }
}
