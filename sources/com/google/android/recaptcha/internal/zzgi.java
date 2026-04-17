package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.Objects;

public final class zzgi implements zzgx {
    public static final zzgi zza = new zzgi();

    private zzgi() {
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        if (zzueArr.length == 3) {
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
                    Object zza4 = zzgd.zzc().zza(zzueArr[2]);
                    if (true != Objects.nonNull(zza4)) {
                        zza4 = null;
                    }
                    if (zza4 != null) {
                        try {
                            Array.set(zza2, intValue, zza4);
                        } catch (Exception e6) {
                            if (e6 instanceof ArrayIndexOutOfBoundsException) {
                                throw new zzce(4, 22, e6);
                            }
                            throw new zzce(4, 25, e6);
                        }
                    } else {
                        throw new zzce(4, 5, (Throwable) null);
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
