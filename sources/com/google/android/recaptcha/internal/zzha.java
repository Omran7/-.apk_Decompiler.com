package com.google.android.recaptcha.internal;

import java.util.Arrays;
import n5.C0874f;

public final class zzha implements zzgx {
    public static final zzha zza = new zzha();

    private zzha() {
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        int length = zzueArr.length;
        if (length != 0) {
            Object zza2 = zzgd.zzc().zza(zzueArr[0]);
            if (true != (zza2 instanceof Class)) {
                zza2 = null;
            }
            Class cls = (Class) zza2;
            if (cls != null) {
                Class[] zzf = zzgd.zzc().zzf(C0874f.A1(zzueArr).subList(1, length));
                try {
                    zzgd.zzc().zze(i2, cls.getConstructor((Class[]) Arrays.copyOf(zzf, zzf.length)));
                } catch (Exception e6) {
                    throw new zzce(6, 9, e6);
                }
            } else {
                throw new zzce(4, 5, (Throwable) null);
            }
        } else {
            throw new zzce(4, 3, (Throwable) null);
        }
    }
}
