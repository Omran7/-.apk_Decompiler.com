package com.google.android.gms.internal.p000authapiphone;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzd  reason: invalid package */
public abstract class zzd extends zzb implements zze {
    public zzd() {
        super("com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback");
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        zzc.zzb(parcel);
        zzb((Status) zzc.zza(parcel, Status.CREATOR), readInt);
        return true;
    }
}
