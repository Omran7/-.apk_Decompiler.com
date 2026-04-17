package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import z1.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzael  reason: invalid package */
public final class zzael {
    private static Boolean zza;

    public static boolean zza(Context context) {
        boolean z3;
        if (zza == null) {
            int c3 = f.f12811b.c(context, 12451000);
            if (c3 == 0 || c3 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            zza = Boolean.valueOf(z3);
        }
        return zza.booleanValue();
    }
}
