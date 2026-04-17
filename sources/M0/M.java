package m0;

import T.b;
import T.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class M extends c {
    public static final Parcelable.Creator<M> CREATOR = new b(4);

    /* renamed from: c  reason: collision with root package name */
    public Parcelable f9869c;

    public M(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9869c = parcel.readParcelable(classLoader == null ? C0804F.class.getClassLoader() : classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f9869c, 0);
    }
}
