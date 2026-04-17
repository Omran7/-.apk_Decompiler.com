package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajo  reason: invalid package */
final class zzajo extends zzajq {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzajp zzc;

    public zzajo(zzajp zzajp) {
        this.zzc = zzajp;
        this.zzb = zzajp.zzb();
    }

    public final boolean hasNext() {
        if (this.zza < this.zzb) {
            return true;
        }
        return false;
    }

    public final byte zza() {
        int i2 = this.zza;
        if (i2 < this.zzb) {
            this.zza = i2 + 1;
            return this.zzc.zzb(i2);
        }
        throw new NoSuchElementException();
    }
}
