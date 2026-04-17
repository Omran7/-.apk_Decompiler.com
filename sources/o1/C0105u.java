package O1;

import android.os.Parcel;
import android.os.Parcelable;
import h0.C0552a;
import java.util.Locale;

/* renamed from: O1.u  reason: case insensitive filesystem */
public enum C0105u implements Parcelable {
    ;
    
    public static final Parcelable.Creator<C0105u> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    public final int f2058a;

    static {
        CREATOR = new W(16);
    }

    /* access modifiers changed from: public */
    C0105u(int i2) {
        this.f2058a = i2;
    }

    public static C0105u a(int i2) {
        for (C0105u uVar : values()) {
            if (i2 == uVar.f2058a) {
                return uVar;
            }
        }
        Locale locale = Locale.US;
        throw new Exception(C0552a.k(i2, "Error code ", " is not supported"));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2058a);
    }
}
