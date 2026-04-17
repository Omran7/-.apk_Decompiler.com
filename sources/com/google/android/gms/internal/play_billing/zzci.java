package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.f;

public class zzci {
    public static int zzc(int i2, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        } else if (i5 <= i2) {
            return i2;
        } else {
            int i6 = i2 + (i2 >> 1) + 1;
            if (i6 < i5) {
                int highestOneBit = Integer.highestOneBit(i5 - 1);
                i6 = highestOneBit + highestOneBit;
            }
            if (i6 < 0) {
                return f.API_PRIORITY_OTHER;
            }
            return i6;
        }
    }
}
