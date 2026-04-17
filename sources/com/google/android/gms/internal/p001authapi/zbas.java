package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.internal.C0366u;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import t1.C0997l;

/* renamed from: com.google.android.gms.internal.auth-api.zbas  reason: invalid package */
public final /* synthetic */ class zbas implements C0366u {
    public final /* synthetic */ zbaw zba;
    public final /* synthetic */ C0997l zbb;

    public /* synthetic */ zbas(zbaw zbaw, C0997l lVar) {
        this.zba = zbaw;
        this.zbb = lVar;
    }

    public final void accept(Object obj, Object obj2) {
        zbaw zbaw = this.zba;
        C0997l lVar = this.zbb;
        zbav zbav = new zbav(zbaw, (TaskCompletionSource) obj2);
        I.g(lVar);
        ((zbad) ((zbx) obj).getService()).zbd(zbav, lVar);
    }
}
