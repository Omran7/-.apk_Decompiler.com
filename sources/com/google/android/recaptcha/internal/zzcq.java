package com.google.android.recaptcha.internal;

import G5.F;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import o5.d;

public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcv = zza;
        if (zzcv == null) {
            zzcv = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcv;
        }
        return zzcv;
    }

    public static final Object zzb(Application application, String str, long j6, d dVar) {
        return zzcv.zzh(zza(application), str, j6, (zzcn) null, (zzbi) null, (zzch) null, dVar, 28, (Object) null);
    }

    public static final Task zzc(Application application, String str, long j6) {
        return zzas.zza(F.c(zza(application).zzd().zza(), new zzco(application, str, j6, (d) null)));
    }

    public static final Object zzd(Application application, String str, d dVar) {
        return zzcv.zzf(zza(application), str, (zzcn) null, (zzbi) null, dVar, 6, (Object) null);
    }

    public static final Task zze(Application application, String str) {
        return zzas.zza(F.c(zza(application).zzd().zza(), new zzcp(application, str, (d) null)));
    }
}
