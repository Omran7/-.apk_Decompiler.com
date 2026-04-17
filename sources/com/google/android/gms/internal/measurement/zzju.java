package com.google.android.gms.internal.measurement;

import I1.b;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;

final class zzju implements zzjr {
    private static zzju zza;
    private final Context zzb;
    private final ContentObserver zzc;
    private boolean zzd;

    private zzju() {
        this.zzd = false;
        this.zzb = null;
        this.zzc = null;
    }

    public static zzju zza(Context context) {
        zzju zzju;
        zzju zzju2;
        synchronized (zzju.class) {
            try {
                if (zza == null) {
                    if (b.n(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        zzju2 = new zzju(context);
                    } else {
                        zzju2 = new zzju();
                    }
                    zza = zzju2;
                }
                zzju zzju3 = zza;
                if (!(zzju3 == null || zzju3.zzc == null || zzju3.zzd)) {
                    context.getContentResolver().registerContentObserver(zzjc.zza, true, zza.zzc);
                    zzju zzju4 = zza;
                    zzju4.getClass();
                    zzju4.zzd = true;
                }
            } catch (SecurityException e6) {
                Log.e("GservicesLoader", "Unable to register Gservices content observer", e6);
            } catch (Throwable th) {
                throw th;
            }
            zzju = zza;
            zzju.getClass();
        }
        return zzju;
    }

    public static String zzc(zzju zzju, String str) {
        Context context = zzju.zzb;
        context.getClass();
        return zzjb.zza(context.getContentResolver(), str, (String) null);
    }

    public static synchronized void zze() {
        Context context;
        synchronized (zzju.class) {
            try {
                zzju zzju = zza;
                if (!(zzju == null || (context = zzju.zzb) == null || zzju.zzc == null || !zzju.zzd)) {
                    context.getContentResolver().unregisterContentObserver(zza.zzc);
                }
                zza = null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: zzd */
    public final String zzb(String str) {
        Context context = this.zzb;
        if (context != null && !zzji.zza(context)) {
            try {
                return (String) zzjp.zza(new zzjs(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e6) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e6);
            }
        }
        return null;
    }

    private zzju(Context context) {
        this.zzd = false;
        this.zzb = context;
        this.zzc = new zzjt(this, (Handler) null);
    }
}
