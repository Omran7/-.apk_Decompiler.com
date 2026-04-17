package y1;

import R2.b;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class c implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12656a;

    public /* synthetic */ c(int i2) {
        this.f12656a = i2;
    }

    public final Object createFromParcel(Parcel parcel) {
        switch (this.f12656a) {
            case 0:
                int c12 = b.c1(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < c12) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        b.T0(readInt, parcel);
                    } else {
                        intent = (Intent) b.q(parcel, readInt, Intent.CREATOR);
                    }
                }
                b.x(c12, parcel);
                return new C1108a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f12656a) {
            case 0:
                return new C1108a[i2];
            default:
                return new g[i2];
        }
    }
}
