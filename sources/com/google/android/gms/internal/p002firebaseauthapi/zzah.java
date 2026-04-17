package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzah  reason: invalid package */
class zzah<E> extends zzak<E> {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzah(int i2) {
        zzag.zza(4, "initialCapacity");
    }

    public zzah<E> zza(E e6) {
        zzw.zza(e6);
        Object[] objArr = this.zza;
        int zza2 = zzak.zza(objArr.length, this.zzb + 1);
        if (zza2 > objArr.length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, zza2);
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        objArr2[i2] = e6;
        return this;
    }
}
