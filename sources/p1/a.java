package P1;

import O1.W;
import android.os.Parcel;
import android.os.Parcelable;

public enum a implements Parcelable {
    STRING(1);
    
    public static final Parcelable.Creator<a> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    public final int f2138a;

    static {
        CREATOR = new W(18);
    }

    /* access modifiers changed from: public */
    a(int i2) {
        this.f2138a = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2138a);
    }
}
