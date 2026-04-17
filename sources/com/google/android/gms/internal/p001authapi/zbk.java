package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0351e;

/* renamed from: com.google.android.gms.internal.auth-api.zbk  reason: invalid package */
final class zbk extends zbd {
    private final C0351e zba;

    public zbk(C0351e eVar) {
        this.zba = eVar;
    }

    public final void zbc(Status status) {
        this.zba.setResult(status);
    }
}
