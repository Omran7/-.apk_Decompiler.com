package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import r1.C0946a;
import r1.C0947b;
import r1.f;

public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        switch (i2) {
            case 1:
                zzc.zzb(parcel);
                zzh((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case 2:
                zzc.zzb(parcel);
                zzf((Status) zzc.zza(parcel, Status.CREATOR), (f) zzc.zza(parcel, f.CREATOR));
                return true;
            case 3:
                zzc.zzb(parcel);
                zzg((Status) zzc.zza(parcel, Status.CREATOR), (C0947b) zzc.zza(parcel, C0947b.CREATOR));
                return true;
            case 4:
                zze();
                return true;
            case 5:
                zzc.zzb(parcel);
                zzd((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case zzaky.zzf.zzf /*6*/:
                byte[] createByteArray = parcel.createByteArray();
                zzc.zzb(parcel);
                zzb(createByteArray);
                return true;
            case zzaky.zzf.zzg /*7*/:
                zzc.zzb(parcel);
                zzc((C0946a) zzc.zza(parcel, C0946a.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
