package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaq  reason: invalid package */
public final class zzaq<K, V> {
    zzap zza;
    private Object[] zzb;
    private int zzc;

    public zzaq() {
        this(4);
    }

    public final zzaq<K, V> zza(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            zza(((Collection) iterable).size() + this.zzc);
        }
        for (Map.Entry entry : iterable) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            zza(this.zzc + 1);
            zzag.zza(key, value);
            Object[] objArr = this.zzb;
            int i2 = this.zzc;
            objArr[i2 * 2] = key;
            objArr[(i2 * 2) + 1] = value;
            this.zzc = i2 + 1;
        }
        return this;
    }

    public zzaq(int i2) {
        this.zzb = new Object[(i2 * 2)];
        this.zzc = 0;
    }

    public final zzan<K, V> zza() {
        zzap zzap = this.zza;
        if (zzap == null) {
            zzau zza2 = zzau.zza(this.zzc, this.zzb, this);
            zzap zzap2 = this.zza;
            if (zzap2 == null) {
                return zza2;
            }
            throw zzap2.zza();
        }
        throw zzap.zza();
    }

    private final void zza(int i2) {
        int i5 = i2 << 1;
        Object[] objArr = this.zzb;
        if (i5 > objArr.length) {
            this.zzb = Arrays.copyOf(objArr, zzak.zza(objArr.length, i5));
        }
    }
}
