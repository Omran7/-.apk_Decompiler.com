package com.google.android.recaptcha.internal;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Objects;
import n5.C0874f;

public final class zzhj implements zzgx {
    public static final zzhj zza = new zzhj();

    private zzhj() {
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        Constructor<?> constructor;
        int length = zzueArr.length;
        if (length != 0) {
            Object zza2 = zzgd.zzc().zza(zzueArr[0]);
            if (true != Objects.nonNull(zza2)) {
                zza2 = null;
            }
            if (zza2 != null) {
                if (zza2 instanceof Constructor) {
                    constructor = (Constructor) zza2;
                } else {
                    constructor = zza2.getClass().getConstructor((Class[]) null);
                }
                Object[] zzg = zzgd.zzc().zzg(C0874f.A1(zzueArr).subList(1, length));
                try {
                    zzgd.zzc().zze(i2, constructor.newInstance(Arrays.copyOf(zzg, zzg.length)));
                } catch (Exception e6) {
                    throw new zzce(6, 14, e6);
                }
            } else {
                throw new zzce(4, 5, (Throwable) null);
            }
        } else {
            throw new zzce(4, 3, (Throwable) null);
        }
    }
}
