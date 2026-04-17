package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.j;
import n5.C0874f;

public final class zzhc implements zzgx {
    public static final zzhc zza = new zzhc();

    private zzhc() {
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        Class<?> cls;
        int length = zzueArr.length;
        if (length >= 2) {
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
                    String zza4 = zzgd.zzh().zza(str);
                    if (!j.a(zza4, "forName")) {
                        Class[] zzf = zzgd.zzc().zzf(C0874f.A1(zzueArr).subList(2, length));
                        try {
                            zzgd.zzc().zze(i2, cls.getMethod(zza4, (Class[]) Arrays.copyOf(zzf, zzf.length)));
                        } catch (Exception e6) {
                            throw new zzce(6, 13, e6);
                        }
                    } else {
                        throw new zzce(6, 48, (Throwable) null);
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
