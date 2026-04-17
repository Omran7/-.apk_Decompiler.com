package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class zzcw extends zzbm implements zzcy {
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void zze(Bundle bundle) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zzc(1, zza);
    }
}
