package y2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class j extends Binder implements IInterface {
    public j(String str) {
        attachInterface(this, str);
    }

    public abstract boolean a(int i2, Parcel parcel, Parcel parcel2, int i5);

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i2, parcel, parcel2, i5)) {
            return true;
        }
        return a(i2, parcel, parcel2, i5);
    }

    public final IBinder asBinder() {
        return this;
    }
}
