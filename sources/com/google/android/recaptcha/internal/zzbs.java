package com.google.android.recaptcha.internal;

import android.content.Context;
import z1.f;

public final class zzbs {
    private final f zza;

    public zzbs() {
        this.zza = f.f12811b;
    }

    public final int zza(Context context) {
        int b6 = this.zza.b(context);
        if (b6 == 1 || b6 == 3 || b6 == 9) {
            return 4;
        }
        return 3;
    }

    public zzbs(f fVar) {
        this.zza = fVar;
    }
}
