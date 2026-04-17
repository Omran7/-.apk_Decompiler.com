package com.google.android.gms.internal.p000authapiphone;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzf  reason: invalid package */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        boolean z3 = false;
        if (i2 != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        if (parcel.readInt() != 0) {
            z3 = true;
        }
        zzc.zzb(parcel);
        zzb(status, z3);
        return true;
    }
}
