package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzz  reason: invalid package */
public final class zzzz {
    public static String zza(String str, String str2) {
        if (str2.toLowerCase(Locale.US).startsWith(str)) {
            return str2.substring(str.length());
        }
        throw new IllegalArgumentException(d.i("key URI must start with ", str));
    }

    public static void zza(int i2) {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i2 << 3)}));
        }
    }
}
