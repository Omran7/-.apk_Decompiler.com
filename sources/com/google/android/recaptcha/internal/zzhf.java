package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import n5.C0874f;

public final class zzhf implements zzgx {
    public static final zzhf zza = new zzhf();

    private zzhf() {
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        int length = zzueArr.length;
        if (length >= 2) {
            Object zza2 = zzgd.zzc().zza(zzueArr[0]);
            if (true != (zza2 instanceof Method)) {
                zza2 = null;
            }
            Method method = (Method) zza2;
            if (method != null) {
                Object zza3 = zzgd.zzc().zza(zzueArr[1]);
                Object[] zzg = zzgd.zzc().zzg(C0874f.A1(zzueArr).subList(2, length));
                try {
                    zzgd.zzc().zze(i2, method.invoke(zza3, Arrays.copyOf(zzg, zzg.length)));
                } catch (Exception e6) {
                    throw new zzce(6, 15, e6);
                }
            } else {
                throw new zzce(4, 5, (Throwable) null);
            }
        } else {
            throw new zzce(4, 3, (Throwable) null);
        }
    }
}
