package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzdd extends zzbn implements zzde {
    public zzdd() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 == 1) {
            long readLong = parcel.readLong();
            zzbo.zzc(parcel);
            zzf(parcel.readString(), parcel.readString(), (Bundle) zzbo.zza(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        } else if (i2 != 2) {
            return false;
        } else {
            int zze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(zze);
        }
        return true;
    }
}
