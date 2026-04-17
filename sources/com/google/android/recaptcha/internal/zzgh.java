package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;

public final class zzgh implements zzgx {
    public static final zzgh zza = new zzgh();

    private zzgh() {
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        Object obj;
        if (zzueArr.length == 2) {
            Object zza2 = zzgd.zzc().zza(zzueArr[0]);
            if (true != Objects.nonNull(zza2)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object zza3 = zzgd.zzc().zza(zzueArr[1]);
                if (true != (zza3 instanceof Integer)) {
                    zza3 = null;
                }
                Integer num = (Integer) zza3;
                if (num != null) {
                    int intValue = num.intValue();
                    try {
                        if (zza2 instanceof String) {
                            obj = String.valueOf(((String) zza2).charAt(intValue));
                        } else if (zza2 instanceof List) {
                            obj = ((List) zza2).get(intValue);
                        } else {
                            obj = Array.get(zza2, intValue);
                        }
                        zzgd.zzc().zze(i2, obj);
                    } catch (Exception e6) {
                        if (e6 instanceof ArrayIndexOutOfBoundsException) {
                            throw new zzce(4, 22, e6);
                        }
                        throw new zzce(4, 23, e6);
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
