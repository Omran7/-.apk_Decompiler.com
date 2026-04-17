package com.google.android.gms.internal.p000authapiphone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C0356j;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzh  reason: invalid package */
public final class zzh extends zza implements IInterface {
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zzc(zze zze) {
        Parcel zza = zza();
        zzc.zzc(zza, zze);
        zzb(4, zza);
    }

    public final void zzd(String str, zzg zzg) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, zzg);
        zzb(5, zza);
    }

    public final void zze(C0356j jVar) {
        Parcel zza = zza();
        zzc.zzc(zza, jVar);
        zzb(3, zza);
    }

    public final void zzf(C0356j jVar) {
        Parcel zza = zza();
        zzc.zzc(zza, jVar);
        zzb(6, zza);
    }

    public final void zzg(zzj zzj) {
        Parcel zza = zza();
        zzc.zzc(zza, zzj);
        zzb(1, zza);
    }

    public final void zzh(String str, zzj zzj) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, zzj);
        zzb(2, zza);
    }
}
