package com.google.android.gms.internal.location;

import Q1.j;
import android.os.Parcel;

public abstract class zzan extends zzb implements zzao {
    public zzan() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 1) {
            return false;
        }
        zzb((j) zzc.zzb(parcel, j.CREATOR));
        return true;
    }
}
