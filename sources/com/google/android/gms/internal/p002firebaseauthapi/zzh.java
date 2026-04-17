package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzh  reason: invalid package */
final class zzh extends zzi {
    private final char zza;

    public zzh(char c3) {
        this.zza = c3;
    }

    public final String toString() {
        char c3 = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c3 & 15);
            c3 = (char) (c3 >> 4);
        }
        return C0552a.o("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    public final boolean zza(char c3) {
        if (c3 == this.zza) {
            return true;
        }
        return false;
    }
}
