package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzand  reason: invalid package */
final class zzand implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzamw zzd;

    private final Iterator zza() {
        if (this.zzc == null) {
            this.zzc = this.zzd.zzc.entrySet().iterator();
        }
        return this.zzc;
    }

    public final boolean hasNext() {
        if (this.zza + 1 < this.zzd.zzb || (!this.zzd.zzc.isEmpty() && zza().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.zzb = true;
        int i2 = this.zza + 1;
        this.zza = i2;
        if (i2 < this.zzd.zzb) {
            return (zzana) this.zzd.zza[this.zza];
        }
        return (Map.Entry) zza().next();
    }

    public final void remove() {
        if (this.zzb) {
            this.zzb = false;
            this.zzd.zzg();
            if (this.zza < this.zzd.zzb) {
                zzamw zzamw = this.zzd;
                int i2 = this.zza;
                this.zza = i2 - 1;
                Object unused = zzamw.zzb(i2);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private zzand(zzamw zzamw) {
        this.zzd = zzamw;
        this.zza = -1;
    }
}
