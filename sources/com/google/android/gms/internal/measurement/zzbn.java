package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzbn extends Binder implements IInterface {
    public zzbn(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i2, parcel, parcel2, i5)) {
            return true;
        }
        return zza(i2, parcel, parcel2, i5);
    }

    public boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        throw null;
    }
}
