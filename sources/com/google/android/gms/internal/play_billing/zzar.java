package com.google.android.gms.internal.play_billing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzar extends Binder implements IInterface {
    public zzar(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i2, parcel, parcel2, i5)) {
            return true;
        }
        return zzb(i2, parcel, parcel2, i5);
    }

    public boolean zzb(int i2, Parcel parcel, Parcel parcel2, int i5) {
        throw null;
    }
}
