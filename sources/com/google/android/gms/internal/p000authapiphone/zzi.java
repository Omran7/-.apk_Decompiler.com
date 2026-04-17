package com.google.android.gms.internal.p000authapiphone;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzi  reason: invalid package */
public abstract class zzi extends zzb implements zzj {
    public zzi() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 1) {
            return false;
        }
        zzc.zzb(parcel);
        zzb((Status) zzc.zza(parcel, Status.CREATOR));
        return true;
    }
}
