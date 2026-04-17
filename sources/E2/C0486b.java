package e2;

import T.b;
import T.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e2.b  reason: case insensitive filesystem */
public final class C0486b extends c {
    public static final Parcelable.Creator<C0486b> CREATOR = new b(2);

    /* renamed from: c  reason: collision with root package name */
    public boolean f7574c;

    public C0486b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C0486b.class.getClassLoader();
        }
        this.f7574c = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f7574c ? 1 : 0);
    }
}
