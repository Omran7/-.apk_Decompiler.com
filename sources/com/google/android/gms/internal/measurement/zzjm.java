package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import n.j;

public final class zzjm implements zzjr {
    public static final String[] zza = {"key", "value"};
    private static final Map zzb = new j(0);
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg = new Object();
    private volatile Map zzh;
    private final List zzi = new ArrayList();

    private zzjm(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        this.zzf = new zzjl(this, (Handler) null);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|10)|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.zzjm zza(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.zzjm> r0 = com.google.android.gms.internal.measurement.zzjm.class
            monitor-enter(r0)
            java.util.Map r1 = zzb     // Catch:{ all -> 0x001c }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.measurement.zzjm r2 = (com.google.android.gms.internal.measurement.zzjm) r2     // Catch:{ all -> 0x001c }
            if (r2 != 0) goto L_0x001f
            com.google.android.gms.internal.measurement.zzjm r3 = new com.google.android.gms.internal.measurement.zzjm     // Catch:{ SecurityException -> 0x001f }
            r3.<init>(r4, r5, r6)     // Catch:{ SecurityException -> 0x001f }
            android.database.ContentObserver r6 = r3.zzf     // Catch:{ SecurityException -> 0x001e }
            r2 = 0
            r4.registerContentObserver(r5, r2, r6)     // Catch:{ SecurityException -> 0x001e }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x001e }
            goto L_0x001e
        L_0x001c:
            r4 = move-exception
            goto L_0x0021
        L_0x001e:
            r2 = r3
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return r2
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjm.zza(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):com.google.android.gms.internal.measurement.zzjm");
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [n.j] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map zzc(com.google.android.gms.internal.measurement.zzjm r7) {
        /*
            android.content.ContentResolver r0 = r7.zzc
            android.net.Uri r2 = r7.zzd
            android.content.ContentProviderClient r7 = r0.acquireUnstableContentProviderClient(r2)
            java.lang.String r0 = "ConfigurationContentLdr"
            if (r7 != 0) goto L_0x0017
            java.lang.String r7 = "Unable to acquire ContentProviderClient, using default values"
            android.util.Log.w(r0, r7)
            java.util.Map r7 = java.util.Collections.emptyMap()
            goto L_0x009c
        L_0x0017:
            java.lang.String[] r3 = zza     // Catch:{ RemoteException -> 0x0048 }
            r5 = 0
            r6 = 0
            r4 = 0
            r1 = r7
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ RemoteException -> 0x0048 }
            if (r1 != 0) goto L_0x0034
            java.lang.String r2 = "ContentProvider query returned null cursor, using default values"
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x0032 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0032 }
        L_0x002c:
            r7.release()
            r7 = r0
            goto L_0x009c
        L_0x0032:
            r2 = move-exception
            goto L_0x0087
        L_0x0034:
            int r2 = r1.getCount()     // Catch:{ all -> 0x0032 }
            if (r2 != 0) goto L_0x004a
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0032 }
        L_0x003e:
            r1.close()     // Catch:{ RemoteException -> 0x0048 }
            r7.release()
            r7 = r2
            goto L_0x009c
        L_0x0046:
            r0 = move-exception
            goto L_0x009d
        L_0x0048:
            r1 = move-exception
            goto L_0x0092
        L_0x004a:
            r3 = 256(0x100, float:3.59E-43)
            if (r2 > r3) goto L_0x0054
            n.e r3 = new n.e     // Catch:{ all -> 0x0032 }
            r3.<init>(r2)     // Catch:{ all -> 0x0032 }
            goto L_0x005b
        L_0x0054:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0032 }
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r2, r4)     // Catch:{ all -> 0x0032 }
        L_0x005b:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x006f
            r2 = 0
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x0032 }
            r4 = 1
            java.lang.String r4 = r1.getString(r4)     // Catch:{ all -> 0x0032 }
            r3.put(r2, r4)     // Catch:{ all -> 0x0032 }
            goto L_0x005b
        L_0x006f:
            boolean r2 = r1.isAfterLast()     // Catch:{ all -> 0x0032 }
            if (r2 != 0) goto L_0x007f
            java.lang.String r2 = "Cursor read incomplete (ContentProvider dead?), using default values"
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x0032 }
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0032 }
            goto L_0x003e
        L_0x007f:
            r1.close()     // Catch:{ RemoteException -> 0x0048 }
            r7.release()
            r7 = r3
            goto L_0x009c
        L_0x0087:
            if (r1 == 0) goto L_0x0091
            r1.close()     // Catch:{ all -> 0x008d }
            goto L_0x0091
        L_0x008d:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ RemoteException -> 0x0048 }
        L_0x0091:
            throw r2     // Catch:{ RemoteException -> 0x0048 }
        L_0x0092:
            java.lang.String r2 = "ContentProvider query failed, using default values"
            android.util.Log.w(r0, r2, r1)     // Catch:{ all -> 0x0046 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0046 }
            goto L_0x002c
        L_0x009c:
            return r7
        L_0x009d:
            r7.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjm.zzc(com.google.android.gms.internal.measurement.zzjm):java.util.Map");
    }

    public static synchronized void zze() {
        synchronized (zzjm.class) {
            try {
                Map map = zzb;
                for (zzjm zzjm : map.values()) {
                    zzjm.zzc.unregisterContentObserver(zzjm.zzf);
                }
                map.clear();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return (String) zzd().get(str);
    }

    public final Map zzd() {
        Map emptyMap;
        Map map = this.zzh;
        if (map == null) {
            synchronized (this.zzg) {
                map = this.zzh;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        emptyMap = (Map) zzjp.zza(new zzjk(this));
                    } catch (SQLiteException | IllegalStateException | SecurityException e6) {
                        try {
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e6);
                            emptyMap = Collections.emptyMap();
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    this.zzh = emptyMap;
                    map = emptyMap;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    public final void zzf() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            try {
                for (zzjn zza2 : this.zzi) {
                    zza2.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
