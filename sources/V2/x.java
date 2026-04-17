package v2;

import T.b;
import T.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class x extends c {
    public static final Parcelable.Creator<x> CREATOR = new b(7);

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f12275c;
    public boolean d;

    public x(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f12275c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.d = parcel.readInt() != 1 ? false : true;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f12275c + "}";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        TextUtils.writeToParcel(this.f12275c, parcel, i2);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
