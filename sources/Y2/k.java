package y2;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.a;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f12707a = 0;

    static {
        k.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(a.f(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
