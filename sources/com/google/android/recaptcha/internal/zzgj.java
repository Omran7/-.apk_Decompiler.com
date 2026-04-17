package com.google.android.recaptcha.internal;

import java.util.Objects;

public final class zzgj implements zzgx {
    public static final zzgj zza = new zzgj();

    private zzgj() {
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        if (zzueArr.length == 3) {
            Object zza2 = zzgd.zzc().zza(zzueArr[0]);
            if (true != (zza2 instanceof Integer)) {
                zza2 = null;
            }
            Integer num = (Integer) zza2;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    Object zza3 = zzgd.zzc().zza(zzueArr[1]);
                    if (true != Objects.nonNull(zza3)) {
                        zza3 = null;
                    }
                    if (zza3 != null) {
                        Object zza4 = zzgd.zzc().zza(zzueArr[2]);
                        if (true != Objects.nonNull(zza4)) {
                            zza4 = null;
                        }
                        if (zza4 == null) {
                            throw new zzce(4, 5, (Throwable) null);
                        } else if (zza3.equals(zza4)) {
                            zzgd.zzg(zzgd.zza() + intValue);
                        }
                    } else {
                        throw new zzce(4, 5, (Throwable) null);
                    }
                } else {
                    throw new zzce(4, 6, (Throwable) null);
                }
            } else {
                throw new zzce(4, 5, (Throwable) null);
            }
        } else {
            throw new zzce(4, 3, (Throwable) null);
        }
    }
}
