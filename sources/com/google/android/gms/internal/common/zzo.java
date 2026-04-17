package com.google.android.gms.internal.common;

import h0.C0552a;

final class zzo extends zzn {
    private final char zza;

    public zzo(char c3) {
        this.zza = c3;
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i2 = this.zza;
        for (int i5 = 0; i5 < 4; i5++) {
            cArr[5 - i5] = "0123456789ABCDEF".charAt(i2 & 15);
            i2 >>= 4;
        }
        return C0552a.o("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    public final boolean zza(char c3) {
        return c3 == this.zza;
    }
}
