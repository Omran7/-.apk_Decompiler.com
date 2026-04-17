package com.google.android.gms.internal.fido;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class zzd extends zzb implements zze {
    public zzd() {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        boolean z3 = false;
        if (i2 == 1) {
            int i6 = zzc.zza;
            int readInt = parcel.readInt();
            zzc.zzc(parcel);
            if (readInt != 0) {
                z3 = true;
            }
            zzb(z3);
        } else if (i2 != 2) {
            return false;
        } else {
            zzc.zzc(parcel);
            zzc((Status) zzc.zza(parcel, Status.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
