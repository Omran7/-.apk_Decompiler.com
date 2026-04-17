package com.google.android.gms.internal.auth;

import android.os.Parcel;
import v1.C1041b;

public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 == 1) {
            zzc.zzb(parcel);
            zzb((C1041b) zzc.zza(parcel, C1041b.CREATOR));
        } else if (i2 != 2) {
            return false;
        } else {
            String readString = parcel.readString();
            zzc.zzb(parcel);
            zzc(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
