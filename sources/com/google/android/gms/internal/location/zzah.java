package com.google.android.gms.internal.location;

import android.os.Parcel;

public abstract class zzah extends zzb implements zzai {
    public zzah() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 == 1) {
            zzb((zzaa) zzc.zzb(parcel, zzaa.CREATOR));
        } else if (i2 != 2) {
            return false;
        } else {
            zzc();
        }
        return true;
    }
}
