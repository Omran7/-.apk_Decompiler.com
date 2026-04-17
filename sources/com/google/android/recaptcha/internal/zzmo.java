package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzmo {
    static final zzmo zza = new zzmo(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzmo() {
        this.zzd = new HashMap();
    }

    public final zznc zza(zzoi zzoi, int i2) {
        return (zznc) this.zzd.get(new zzmn(zzoi, i2));
    }

    public zzmo(boolean z3) {
        this.zzd = Collections.emptyMap();
    }
}
