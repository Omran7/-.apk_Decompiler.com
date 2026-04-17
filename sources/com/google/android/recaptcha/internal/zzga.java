package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.j;
import n5.C0883o;

public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfz, String str, Object obj) {
        super(obj);
        this.zza = zzfz;
        this.zzb = str;
    }

    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List list;
        if (!j.a(method.getName(), this.zzb)) {
            return false;
        }
        zzfz zzfz = this.zza;
        if (objArr != null) {
            list = Arrays.asList(objArr);
            j.d(list, "asList(...)");
        } else {
            list = C0883o.f10398a;
        }
        zzfz.zzb(list);
        return true;
    }
}
