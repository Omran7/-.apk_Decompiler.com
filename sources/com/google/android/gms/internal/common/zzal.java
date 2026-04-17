package com.google.android.gms.internal.common;

import com.google.android.gms.internal.measurement.a;

public final class zzal {
    public static Object[] zza(Object[] objArr, int i2) {
        int i5 = 0;
        while (i5 < i2) {
            if (objArr[i5] != null) {
                i5++;
            } else {
                throw new NullPointerException(a.f(i5, "at index "));
            }
        }
        return objArr;
    }
}
