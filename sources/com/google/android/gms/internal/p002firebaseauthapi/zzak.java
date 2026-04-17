package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzak  reason: invalid package */
public class zzak<E> {
    public static int zza(int i2, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        } else if (i5 <= i2) {
            return i2;
        } else {
            int i6 = i2 + (i2 >> 1) + 1;
            if (i6 < i5) {
                i6 = Integer.highestOneBit(i5 - 1) << 1;
            }
            if (i6 < 0) {
                return f.API_PRIORITY_OTHER;
            }
            return i6;
        }
    }
}
