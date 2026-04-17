package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbc  reason: invalid package */
public final class zzbc {
    public static long zza(long j6, long j7) {
        boolean z3;
        long j8 = j6 + j7;
        boolean z4 = false;
        if ((j6 ^ j7) < 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((j6 ^ j8) >= 0) {
            z4 = true;
        }
        zzbb.zza(z3 | z4, "checkedAdd", j6, j7);
        return j8;
    }

    public static long zzb(long j6, long j7) {
        boolean z3;
        long j8 = j6 - 1;
        boolean z4 = false;
        if ((1 ^ j6) >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((j6 ^ j8) >= 0) {
            z4 = true;
        }
        zzbb.zza(z3 | z4, "checkedSubtract", j6, 1);
        return j8;
    }
}
