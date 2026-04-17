package com.google.android.gms.internal.measurement;

import android.os.Parcel;

public abstract class zzda extends zzbn implements zzdb {
    public zzda() {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 2) {
            return false;
        }
        zze();
        return true;
    }
}
