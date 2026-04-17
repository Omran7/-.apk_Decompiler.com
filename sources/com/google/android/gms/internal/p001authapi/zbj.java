package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;

/* renamed from: com.google.android.gms.internal.auth-api.zbj  reason: invalid package */
final class zbj extends zbm {
    public zbj(zbl zbl, o oVar) {
        super(oVar);
    }

    public final /* bridge */ /* synthetic */ s createFailedResult(Status status) {
        return status;
    }

    public final void zba(Context context, zbt zbt) {
        zbt.zbf(new zbk(this));
    }
}
