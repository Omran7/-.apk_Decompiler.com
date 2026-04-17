package com.google.android.recaptcha.internal;

import java.util.Objects;

public final class zzhb implements zzgx {
    public static final zzhb zza = new zzhb();

    private zzhb() {
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        Class<?> cls;
        if (zzueArr.length == 2) {
            Object zza2 = zzgd.zzc().zza(zzueArr[0]);
            if (true != Objects.nonNull(zza2)) {
                zza2 = null;
            }
            if (zza2 != null) {
                if (zza2 instanceof Class) {
                    cls = (Class) zza2;
                } else {
                    cls = zza2.getClass();
                }
                Object zza3 = zzgd.zzc().zza(zzueArr[1]);
                if (true != (zza3 instanceof String)) {
                    zza3 = null;
                }
                String str = (String) zza3;
                if (str != null) {
                    try {
                        zzgd.zzc().zze(i2, cls.getField(zzgd.zzh().zza(str)));
                    } catch (Exception e6) {
                        throw new zzce(6, 10, e6);
                    }
                } else {
                    throw new zzce(4, 5, (Throwable) null);
                }
            } else {
                throw new zzce(4, 5, (Throwable) null);
            }
        } else {
            throw new zzce(4, 3, (Throwable) null);
        }
    }
}
