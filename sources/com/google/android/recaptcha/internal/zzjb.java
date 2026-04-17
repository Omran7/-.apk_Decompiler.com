package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import m5.C0845d;
import n5.C0886r;

public final class zzjb {
    public static final Map zza() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0886r.z0(15));
        C0886r.B0(linkedHashMap, new C0845d[]{new C0845d(-4, zzba.zzo), new C0845d(-12, zzba.zzp), new C0845d(-6, zzba.zzk), new C0845d(-11, zzba.zzm), new C0845d(-13, zzba.zzq), new C0845d(-14, zzba.zzr), new C0845d(-2, zzba.zzl), new C0845d(-7, zzba.zzs), new C0845d(-5, zzba.zzt), new C0845d(-9, zzba.zzu), new C0845d(-8, zzba.zzE), new C0845d(-15, zzba.zzn), new C0845d(-1, zzba.zzv), new C0845d(-3, zzba.zzx), new C0845d(-10, zzba.zzy)});
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            linkedHashMap.put(-16, zzba.zzw);
        }
        if (i2 >= 27) {
            linkedHashMap.put(1, zzba.zzA);
            linkedHashMap.put(2, zzba.zzB);
            linkedHashMap.put(0, zzba.zzC);
            linkedHashMap.put(3, zzba.zzD);
        }
        if (i2 >= 29) {
            linkedHashMap.put(4, zzba.zzz);
        }
        return linkedHashMap;
    }
}
