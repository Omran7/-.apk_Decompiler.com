package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Objects;

public final class zzhq implements zzgx {
    public static final zzhq zza = new zzhq();

    private zzhq() {
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
                    if (zza2 instanceof Integer) {
                        obj = Integer.valueOf(((Number) zza2).intValue() - intValue);
                    } else if (zza2 instanceof int[]) {
                        ArrayList arrayList = new ArrayList(r2);
                        for (int i5 : (int[]) zza2) {
                            arrayList.add(Integer.valueOf(i5 - intValue));
                        }
                        obj = arrayList.toArray(new Integer[0]);
                    } else {
                        throw new zzce(4, 5, (Throwable) null);
                    }
                    zzgd.zzc().zze(i2, obj);
                    return;
                }
                throw new zzce(4, 5, (Throwable) null);
            }
            throw new zzce(4, 5, (Throwable) null);
        }
        throw new zzce(4, 3, (Throwable) null);
    }
}
