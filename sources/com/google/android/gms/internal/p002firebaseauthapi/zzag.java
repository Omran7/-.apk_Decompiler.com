package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzag  reason: invalid package */
final class zzag {
    public static int zza(int i2, String str) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 == null) {
            throw new NullPointerException(C0552a.o("null value in entry: ", String.valueOf(obj), "=null"));
        }
    }
}
