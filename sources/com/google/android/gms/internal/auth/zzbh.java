package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import v1.C1040a;

public final class zzbh extends zza implements IInterface {
    public zzbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(zzbg zzbg) {
        Parcel zza = zza();
        zzc.zze(zza, zzbg);
        zzc(3, zza);
    }

    public final void zze(zzbg zzbg, C1040a aVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzbg);
        zzc.zzd(zza, aVar);
        zzc(1, zza);
    }
}
