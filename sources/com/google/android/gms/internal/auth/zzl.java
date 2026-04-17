package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import o1.C0893c;

public abstract class zzl extends zzb implements zzm {
    public zzl() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 2) {
            return false;
        }
        zzc.zzb(parcel);
        zzb((Status) zzc.zza(parcel, Status.CREATOR), (C0893c) zzc.zza(parcel, C0893c.CREATOR));
        return true;
    }
}
