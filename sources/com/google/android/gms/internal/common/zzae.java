package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

class zzae extends zzaf {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzae(int i2) {
    }

    public final zzae zza(Object obj) {
        int i2;
        obj.getClass();
        int length = this.zza.length;
        int i5 = this.zzb;
        int i6 = i5 + 1;
        if (i6 >= 0) {
            if (i6 <= length) {
                i2 = length;
            } else {
                i2 = (length >> 1) + length + 1;
                if (i2 < i6) {
                    int highestOneBit = Integer.highestOneBit(i5);
                    i2 = highestOneBit + highestOneBit;
                }
                if (i2 < 0) {
                    i2 = f.API_PRIORITY_OTHER;
                }
            }
            if (i2 > length || this.zzc) {
                this.zza = Arrays.copyOf(this.zza, i2);
                this.zzc = false;
            }
            Object[] objArr = this.zza;
            int i7 = this.zzb;
            this.zzb = i7 + 1;
            objArr[i7] = obj;
            return this;
        }
        throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
    }
}
