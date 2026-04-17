package com.google.android.recaptcha.internal;

public final class zzkk {
    public static long zza(long j6, long j7) {
        boolean z3;
        boolean z4 = false;
        if ((j6 ^ j7) < 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        long j8 = j6 + j7;
        if ((j6 ^ j8) >= 0) {
            z4 = true;
        }
        zzkl.zza(z3 | z4, "checkedAdd", j6, j7);
        return j8;
    }

    public static long zzb(long j6, long j7) {
        boolean z3;
        boolean z4 = false;
        if ((1 ^ j6) >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        long j8 = -1 + j6;
        if ((j6 ^ j8) >= 0) {
            z4 = true;
        }
        zzkl.zza(z3 | z4, "checkedSubtract", j6, 1);
        return j8;
    }
}
