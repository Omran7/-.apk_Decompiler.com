package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class zzdc extends zzbm implements zzde {
    public zzdc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final int zze() {
        Parcel zzb = zzb(2, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    public final void zzf(String str, String str2, Bundle bundle, long j6) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzd(zza, bundle);
        zza.writeLong(j6);
        zzc(1, zza);
    }
}
