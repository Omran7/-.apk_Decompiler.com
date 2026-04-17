package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import n5.C0874f;

public final class zzhg implements zzgx {
    public static final zzhg zza = new zzhg();

    private zzhg() {
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        int length = zzueArr.length;
        if (length != 0) {
            Object zza2 = zzgd.zzc().zza(zzueArr[0]);
            if (true != (zza2 instanceof Method)) {
                zza2 = null;
            }
            Method method = (Method) zza2;
            if (method != null) {
                Object[] zzg = zzgd.zzc().zzg(C0874f.A1(zzueArr).subList(1, length));
                try {
                    zzgd.zzc().zze(i2, method.invoke((Object) null, Arrays.copyOf(zzg, zzg.length)));
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
