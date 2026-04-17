package m2;

import T.b;
import T.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: m2.a  reason: case insensitive filesystem */
public final class C0835a extends c {
    public static final Parcelable.Creator<C0835a> CREATOR = new b(5);

    /* renamed from: c  reason: collision with root package name */
    public boolean f10072c;

    public C0835a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10072c = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f10072c ? 1 : 0);
    }
}
