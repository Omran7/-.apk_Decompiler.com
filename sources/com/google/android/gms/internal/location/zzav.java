package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import com.google.android.gms.common.api.internal.C0360n;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Map;

public final class zzav {
    private final zzbg<zzam> zza;
    private final Context zzb;
    private boolean zzc = false;
    private final Map<C0360n, zzau> zzd = new HashMap();
    private final Map<C0360n, zzas> zze = new HashMap();
    private final Map<C0360n, zzar> zzf = new HashMap();

    public zzav(Context context, zzbg<zzam> zzbg) {
        this.zzb = context;
        this.zza = zzbg;
    }

    public final Location zza(String str) {
        ((zzh) this.zza).zza.checkConnected();
        return ((zzh) this.zza).zza().zzn(str);
    }

    @Deprecated
    public final Location zzb() {
        ((zzh) this.zza).zza.checkConnected();
        return ((zzh) this.zza).zza().zzm();
    }

    public final LocationAvailability zzc() {
        ((zzh) this.zza).zza.checkConnected();
        return ((zzh) this.zza).zza().zzs(this.zzb.getPackageName());
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(com.google.android.gms.location.LocationRequest r12, com.google.android.gms.common.api.internal.C0362p r13, com.google.android.gms.internal.location.zzai r14) {
        /*
            r11 = this;
            com.google.android.gms.internal.location.zzbg<com.google.android.gms.internal.location.zzam> r0 = r11.zza
            com.google.android.gms.internal.location.zzh r0 = (com.google.android.gms.internal.location.zzh) r0
            com.google.android.gms.internal.location.zzi r0 = r0.zza
            r0.checkConnected()
            com.google.android.gms.common.api.internal.n r0 = r13.f6110c
            r1 = 0
            if (r0 != 0) goto L_0x0010
            r7 = r1
            goto L_0x002c
        L_0x0010:
            java.util.Map<com.google.android.gms.common.api.internal.n, com.google.android.gms.internal.location.zzau> r2 = r11.zzd
            monitor-enter(r2)
            java.util.Map<com.google.android.gms.common.api.internal.n, com.google.android.gms.internal.location.zzau> r3 = r11.zzd     // Catch:{ all -> 0x0023 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.location.zzau r3 = (com.google.android.gms.internal.location.zzau) r3     // Catch:{ all -> 0x0023 }
            if (r3 != 0) goto L_0x0025
            com.google.android.gms.internal.location.zzau r3 = new com.google.android.gms.internal.location.zzau     // Catch:{ all -> 0x0023 }
            r3.<init>(r13)     // Catch:{ all -> 0x0023 }
            goto L_0x0025
        L_0x0023:
            r12 = move-exception
            goto L_0x0049
        L_0x0025:
            java.util.Map<com.google.android.gms.common.api.internal.n, com.google.android.gms.internal.location.zzau> r13 = r11.zzd     // Catch:{ all -> 0x0023 }
            r13.put(r0, r3)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            r7 = r3
        L_0x002c:
            if (r7 != 0) goto L_0x002f
            return
        L_0x002f:
            com.google.android.gms.internal.location.zzbg<com.google.android.gms.internal.location.zzam> r13 = r11.zza
            com.google.android.gms.internal.location.zzh r13 = (com.google.android.gms.internal.location.zzh) r13
            com.google.android.gms.internal.location.zzam r13 = r13.zza()
            com.google.android.gms.internal.location.zzba r6 = com.google.android.gms.internal.location.zzba.zza(r1, r12)
            com.google.android.gms.internal.location.zzbc r12 = new com.google.android.gms.internal.location.zzbc
            r8 = 0
            r9 = 0
            r5 = 1
            r4 = r12
            r10 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r13.zzo(r12)
            return
        L_0x0049:
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzav.zzd(com.google.android.gms.location.LocationRequest, com.google.android.gms.common.api.internal.p, com.google.android.gms.internal.location.zzai):void");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(com.google.android.gms.internal.location.zzba r11, com.google.android.gms.common.api.internal.C0362p r12, com.google.android.gms.internal.location.zzai r13) {
        /*
            r10 = this;
            com.google.android.gms.internal.location.zzbg<com.google.android.gms.internal.location.zzam> r0 = r10.zza
            com.google.android.gms.internal.location.zzh r0 = (com.google.android.gms.internal.location.zzh) r0
            com.google.android.gms.internal.location.zzi r0 = r0.zza
            r0.checkConnected()
            com.google.android.gms.common.api.internal.n r0 = r12.f6110c
            if (r0 != 0) goto L_0x0010
            r12 = 0
        L_0x000e:
            r8 = r12
            goto L_0x002d
        L_0x0010:
            java.util.Map<com.google.android.gms.common.api.internal.n, com.google.android.gms.internal.location.zzar> r1 = r10.zzf
            monitor-enter(r1)
            java.util.Map<com.google.android.gms.common.api.internal.n, com.google.android.gms.internal.location.zzar> r2 = r10.zzf     // Catch:{ all -> 0x0024 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0024 }
            com.google.android.gms.internal.location.zzar r2 = (com.google.android.gms.internal.location.zzar) r2     // Catch:{ all -> 0x0024 }
            if (r2 != 0) goto L_0x0022
            com.google.android.gms.internal.location.zzar r2 = new com.google.android.gms.internal.location.zzar     // Catch:{ all -> 0x0024 }
            r2.<init>(r12)     // Catch:{ all -> 0x0024 }
        L_0x0022:
            r12 = r2
            goto L_0x0026
        L_0x0024:
            r11 = move-exception
            goto L_0x0047
        L_0x0026:
            java.util.Map<com.google.android.gms.common.api.internal.n, com.google.android.gms.internal.location.zzar> r2 = r10.zzf     // Catch:{ all -> 0x0024 }
            r2.put(r0, r12)     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)     // Catch:{ all -> 0x0024 }
            goto L_0x000e
        L_0x002d:
            if (r8 != 0) goto L_0x0030
            return
        L_0x0030:
            com.google.android.gms.internal.location.zzbg<com.google.android.gms.internal.location.zzam> r12 = r10.zza
            com.google.android.gms.internal.location.zzh r12 = (com.google.android.gms.internal.location.zzh) r12
            com.google.android.gms.internal.location.zzam r12 = r12.zza()
            com.google.android.gms.internal.location.zzbc r0 = new com.google.android.gms.internal.location.zzbc
            r6 = 0
            r7 = 0
            r4 = 1
            r3 = r0
            r5 = r11
            r9 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r12.zzo(r0)
            return
        L_0x0047:
            monitor-exit(r1)     // Catch:{ all -> 0x0024 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzav.zze(com.google.android.gms.internal.location.zzba, com.google.android.gms.common.api.internal.p, com.google.android.gms.internal.location.zzai):void");
    }

    public final void zzf(zzba zzba, PendingIntent pendingIntent, zzai zzai) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzo(zzbc.zzb(zzba, pendingIntent, zzai));
    }

    public final void zzg(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzai) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzo(zzbc.zzb(zzba.zza((String) null, locationRequest), pendingIntent, zzai));
    }

    public final void zzh(C0360n nVar, zzai zzai) {
        ((zzh) this.zza).zza.checkConnected();
        I.h(nVar, "Invalid null listener key");
        synchronized (this.zzd) {
            try {
                zzau remove = this.zzd.remove(nVar);
                if (remove != null) {
                    remove.zzc();
                    ((zzh) this.zza).zza().zzo(zzbc.zza(remove, zzai));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi(C0360n nVar, zzai zzai) {
        ((zzh) this.zza).zza.checkConnected();
        I.h(nVar, "Invalid null listener key");
        synchronized (this.zzf) {
            try {
                zzar remove = this.zzf.remove(nVar);
                if (remove != null) {
                    remove.zzc();
                    ((zzh) this.zza).zza().zzo(zzbc.zzc(remove, zzai));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzj(android.app.PendingIntent r10, com.google.android.gms.internal.location.zzai r11) {
        /*
            r9 = this;
            com.google.android.gms.internal.location.zzbg<com.google.android.gms.internal.location.zzam> r0 = r9.zza
            com.google.android.gms.internal.location.zzh r0 = (com.google.android.gms.internal.location.zzh) r0
            com.google.android.gms.internal.location.zzi r0 = r0.zza
            r0.checkConnected()
            com.google.android.gms.internal.location.zzbg<com.google.android.gms.internal.location.zzam> r0 = r9.zza
            com.google.android.gms.internal.location.zzh r0 = (com.google.android.gms.internal.location.zzh) r0
            com.google.android.gms.internal.location.zzam r0 = r0.zza()
            com.google.android.gms.internal.location.zzbc r8 = new com.google.android.gms.internal.location.zzbc
            r4 = 0
            r6 = 0
            r2 = 2
            r3 = 0
            r1 = r8
            r5 = r10
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.zzo(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzav.zzj(android.app.PendingIntent, com.google.android.gms.internal.location.zzai):void");
    }

    public final void zzk(boolean z3) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzp(z3);
        this.zzc = z3;
    }

    public final void zzl(Location location) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzq(location);
    }

    public final void zzm(zzai zzai) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzr(zzai);
    }

    public final void zzn() {
        synchronized (this.zzd) {
            try {
                for (zzau next : this.zzd.values()) {
                    if (next != null) {
                        ((zzh) this.zza).zza().zzo(zzbc.zza(next, (zzai) null));
                    }
                }
                this.zzd.clear();
            } finally {
                while (true) {
                }
            }
        }
        synchronized (this.zzf) {
            try {
                for (zzar next2 : this.zzf.values()) {
                    if (next2 != null) {
                        ((zzh) this.zza).zza().zzo(zzbc.zzc(next2, (zzai) null));
                    }
                }
                this.zzf.clear();
            } finally {
                while (true) {
                }
            }
        }
        synchronized (this.zze) {
            try {
                for (zzas next3 : this.zze.values()) {
                    if (next3 != null) {
                        ((zzh) this.zza).zza().zzu(new zzl(2, (zzj) null, next3, (IBinder) null));
                    }
                }
                this.zze.clear();
            } finally {
            }
        }
    }

    public final void zzo() {
        if (this.zzc) {
            zzk(false);
        }
    }
}
