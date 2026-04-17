package com.google.android.recaptcha.internal;

import java.util.List;

final class zznv {
    public static final List zza(Object obj, long j6) {
        int i2;
        zznk zznk = (zznk) zzps.zzf(obj, j6);
        if (zznk.zzc()) {
            return zznk;
        }
        int size = zznk.size();
        if (size == 0) {
            i2 = 10;
        } else {
            i2 = size + size;
        }
        zznk zzd = zznk.zzd(i2);
        zzps.zzs(obj, j6, zzd);
        return zzd;
    }
}
