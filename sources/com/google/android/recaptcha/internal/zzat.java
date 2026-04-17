package com.google.android.recaptcha.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import n5.C0886r;
import x5.a;

final class zzat extends k implements a {
    public static final zzat zza = new zzat();

    public zzat() {
        super(0);
    }

    public static final Map zza() {
        Map zzc = zzav.zzc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0886r.z0(zzc.size()));
        for (Map.Entry entry : zzc.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzaw) entry.getValue()).zzb());
        }
        return linkedHashMap;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        return zza();
    }
}
