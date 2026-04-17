package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.measurement.a;

public final class zzdd {
    public static Object zza(Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(a.f(i2, "at index "));
    }

    public static Object[] zzb(Object[] objArr, int i2) {
        for (int i5 = 0; i5 < i2; i5++) {
            zza(objArr[i5], i5);
        }
        return objArr;
    }
}
