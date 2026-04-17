package com.google.android.gms.internal.location;

import Q1.j;
import com.google.android.gms.common.api.internal.C0351e;
import com.google.android.gms.common.internal.I;

final class zzay extends zzan {
    private C0351e zza;

    public zzay(C0351e eVar) {
        boolean z3;
        if (eVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.a("listener can't be null.", z3);
        this.zza = eVar;
    }

    public final void zzb(j jVar) {
        this.zza.setResult(jVar);
        this.zza = null;
    }
}
