package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import s1.C0961a;

/* renamed from: com.google.android.gms.internal.auth-api.zbg  reason: invalid package */
final class zbg extends zbm {
    final /* synthetic */ C0961a zba;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zbg(zbl zbl, o oVar, C0961a aVar) {
        super(oVar);
        this.zba = aVar;
    }

    public final /* synthetic */ s createFailedResult(Status status) {
        return new zbe(status, (Credential) null);
    }

    public final void zba(Context context, zbt zbt) {
        zbt.zbd(new zbf(this), this.zba);
    }
}
