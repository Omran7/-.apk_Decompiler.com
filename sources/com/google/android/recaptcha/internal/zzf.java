package com.google.android.recaptcha.internal;

import G5.E0;

public final class zzf {
    public static final zzbd zza(Exception exc, zzbd zzbd) {
        if (exc instanceof E0) {
            return new zzbd(zzbb.zzb, zzba.zzb, exc.getMessage());
        }
        if (exc instanceof zzbd) {
            return (zzbd) exc;
        }
        return zzbd;
    }
}
