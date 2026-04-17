package z1;

import O1.C0089d;
import O1.C0090e;
import R2.b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class w implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12849a;

    public /* synthetic */ w(int i2) {
        this.f12849a = i2;
    }

    public final Object createFromParcel(Parcel parcel) {
        switch (this.f12849a) {
            case 0:
                int c12 = b.c1(parcel);
                boolean z3 = false;
                String str = null;
                IBinder iBinder = null;
                boolean z4 = false;
                while (parcel.dataPosition() < c12) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 1) {
                        str = b.r(readInt, parcel);
                    } else if (c3 == 2) {
                        iBinder = b.z0(readInt, parcel);
                    } else if (c3 == 3) {
                        z3 = b.w0(readInt, parcel);
                    } else if (c3 != 4) {
                        b.T0(readInt, parcel);
                    } else {
                        z4 = b.w0(readInt, parcel);
                    }
                }
                b.x(c12, parcel);
                return new v(str, iBinder, z3, z4);
            default:
                try {
                    return C0090e.a(parcel.readString());
                } catch (C0089d e6) {
                    throw new RuntimeException(e6);
                }
        }
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f12849a) {
            case 0:
                return new v[i2];
            default:
                return new C0090e[i2];
        }
    }
}
