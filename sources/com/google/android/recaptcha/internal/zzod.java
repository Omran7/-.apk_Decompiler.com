package com.google.android.recaptcha.internal;

final class zzod {
    public static final boolean zza(Object obj) {
        if (!((zzoc) obj).zze()) {
            return true;
        }
        return false;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzoc zzoc = (zzoc) obj;
        zzoc zzoc2 = (zzoc) obj2;
        if (!zzoc2.isEmpty()) {
            if (!zzoc.zze()) {
                zzoc = zzoc.zzb();
            }
            zzoc.zzd(zzoc2);
        }
        return zzoc;
    }
}
