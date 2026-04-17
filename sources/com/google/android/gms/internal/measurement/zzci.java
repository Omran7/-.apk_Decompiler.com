package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

public final class zzci {
    private static final ThreadLocal zza = new zzch();

    public static SharedPreferences zza(Context context, String str, int i2, zzcc zzcc) {
        zzcg zzcg;
        zzbx.zza();
        if (str.equals("")) {
            zzcg = new zzcg();
        } else {
            zzcg = null;
        }
        if (zzcg != null) {
            return zzcg;
        }
        ThreadLocal threadLocal = zza;
        if (((Boolean) threadLocal.get()).booleanValue()) {
            threadLocal.set(Boolean.FALSE);
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                threadLocal.set(Boolean.TRUE);
                return sharedPreferences;
            } catch (Throwable th) {
                zza.set(Boolean.TRUE);
                throw th;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
