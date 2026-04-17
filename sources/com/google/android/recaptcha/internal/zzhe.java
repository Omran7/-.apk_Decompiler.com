package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

public final class zzhe implements zzgx {
    public static final zzhe zza = new zzhe();

    private zzhe() {
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        if (zzueArr.length == 1) {
            Object zza2 = zzgd.zzc().zza(zzueArr[0]);
            if (true != (zza2 instanceof Field)) {
                zza2 = null;
            }
            Field field = (Field) zza2;
            if (field != null) {
                try {
                    zzgd.zzc().zze(i2, field.get((Object) null));
                } catch (Exception e6) {
                    throw new zzce(6, 16, e6);
                }
            } else {
                throw new zzce(4, 5, (Throwable) null);
            }
        } else {
            throw new zzce(4, 3, (Throwable) null);
        }
    }
}
