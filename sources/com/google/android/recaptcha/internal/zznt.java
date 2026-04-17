package com.google.android.recaptcha.internal;

public class zznt {
    protected volatile zzoi zza;
    private volatile zzle zzb;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zznt)) {
            return false;
        }
        zznt zznt = (zznt) obj;
        zzoi zzoi = this.zza;
        zzoi zzoi2 = zznt.zza;
        if (zzoi == null && zzoi2 == null) {
            return zzb().equals(zznt.zzb());
        }
        if (zzoi != null && zzoi2 != null) {
            return zzoi.equals(zzoi2);
        }
        if (zzoi != null) {
            zznt.zzd(zzoi.zzm());
            return zzoi.equals(zznt.zza);
        }
        zzd(zzoi2.zzm());
        return this.zza.equals(zzoi2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzlc) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzo();
        }
        return 0;
    }

    public final zzle zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    zzle zzle = this.zzb;
                    return zzle;
                }
                if (this.zza == null) {
                    this.zzb = zzle.zzb;
                } else {
                    this.zzb = this.zza.zzb();
                }
                zzle zzle2 = this.zzb;
                return zzle2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzoi zzc(zzoi zzoi) {
        zzoi zzoi2 = this.zza;
        this.zzb = null;
        this.zza = zzoi;
        return zzoi2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(com.google.android.recaptcha.internal.zzoi r2) {
        /*
            r1 = this;
            com.google.android.recaptcha.internal.zzoi r0 = r1.zza
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.recaptcha.internal.zzoi r0 = r1.zza     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r2 = move-exception
            goto L_0x001d
        L_0x000e:
            r1.zza = r2     // Catch:{ zznn -> 0x0015 }
            com.google.android.recaptcha.internal.zzle r0 = com.google.android.recaptcha.internal.zzle.zzb     // Catch:{ zznn -> 0x0015 }
            r1.zzb = r0     // Catch:{ zznn -> 0x0015 }
            goto L_0x001b
        L_0x0015:
            r1.zza = r2     // Catch:{ all -> 0x000c }
            com.google.android.recaptcha.internal.zzle r2 = com.google.android.recaptcha.internal.zzle.zzb     // Catch:{ all -> 0x000c }
            r1.zzb = r2     // Catch:{ all -> 0x000c }
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            return
        L_0x001d:
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zznt.zzd(com.google.android.recaptcha.internal.zzoi):void");
    }
}
