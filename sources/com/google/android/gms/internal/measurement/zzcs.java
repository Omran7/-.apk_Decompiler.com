package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import h0.C0552a;
import java.util.concurrent.atomic.AtomicReference;

public final class zzcs extends zzcx {
    private final AtomicReference zza = new AtomicReference();
    private boolean zzb;

    public static final Object zzf(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e6) {
            Log.w("AM", C0552a.p("Unexpected object type. Expected, Received: ", cls.getCanonicalName(), ", ", obj.getClass().getCanonicalName()), e6);
            throw e6;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle zzb(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.zza
            monitor-enter(r0)
            boolean r1 = r2.zzb     // Catch:{ all -> 0x000b }
            if (r1 != 0) goto L_0x0010
            r0.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000b:
            r3 = move-exception
            goto L_0x001a
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference r3 = r2.zza     // Catch:{ all -> 0x000b }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x000b }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x000b }
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return r3
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzcs.zzb(long):android.os.Bundle");
    }

    public final Long zzc(long j6) {
        return (Long) zzf(zzb(j6), Long.class);
    }

    public final String zzd(long j6) {
        return (String) zzf(zzb(j6), String.class);
    }

    public final void zze(Bundle bundle) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            try {
                atomicReference.set(bundle);
                this.zzb = true;
                this.zza.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
