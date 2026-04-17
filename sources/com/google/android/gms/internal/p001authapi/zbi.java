package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;

/* renamed from: com.google.android.gms.internal.auth-api.zbi  reason: invalid package */
final class zbi extends zbm {
    final /* synthetic */ Credential zba;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zbi(zbl zbl, o oVar, Credential credential) {
        super(oVar);
        this.zba = credential;
    }

    public final /* bridge */ /* synthetic */ s createFailedResult(Status status) {
        return status;
    }

    public final void zba(Context context, zbt zbt) {
        zbt.zbc(new zbk(this), new zbp(this.zba));
    }
}
