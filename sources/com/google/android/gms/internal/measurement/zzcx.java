package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzcx extends zzbn implements zzcy {
    public zzcx() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 1) {
            return false;
        }
        zzbo.zzc(parcel);
        zze((Bundle) zzbo.zza(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
